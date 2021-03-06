/*
 * Copyright (C) 2015 Seb
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.sdnwiselab.sdnwise.controller;

import java.util.Objects;

/**
 * Controller Identification Class for FlowVisor.
 * This class describes methods for manage port and address used from the
 * Controller.
 * 
 * @author Sebastiano Milardo
 */
public class ControllerId {
    final String address;
    final int port;

    /**
     * Constructor for this ControllerId Class.
     * 
     * @param address Controller Address Used.
     * @param port Controller Port Used.
     */
    public ControllerId(String address, int port) {
        this.address = address;
        this.port = port;
    }

    /**
     * Getter method to obtain the Controller Address.
     * 
     * @return a string contains this Controller Address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Getter method to obtain the Controller Port.
     * 
     * @return an int contains this Controller Port.
     */
    public int getPort() {
        return port;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.address);
        hash = 89 * hash + this.port;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControllerId other = (ControllerId) obj;
        if (!Objects.equals(this.address, other.getAddress())) {
            return false;
        }
        return this.port == other.getPort();
    }
    
}
