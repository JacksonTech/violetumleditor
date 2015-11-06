/*
 Violet - A program for editing UML diagrams.

 Copyright (C) 2007 Cay S. Horstmann (http://horstmann.com)
 Alexandre de Pellegrin (http://alexdp.free.fr);

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.horstmann.violet.product.diagram.usecase;

import com.horstmann.violet.product.diagram.abstracts.property.MultiLineString;
import com.horstmann.violet.product.diagram.common.ImageNode;

import java.awt.*;

/**
 * An actor node in a use case diagram.
 */
public class SoftgoalNode extends ImageNode
{

    /**
     * Construct an actor node with a default size and name
     */
    public SoftgoalNode(Image img) {
        super(img);
        name = new MultiLineString();
        name.setText("Requirement");
    }

    /**
     * Sets the name property value.
     *
     * @param newValue the new actor name
     */
    public void setName(MultiLineString newValue)
    {
        name = newValue;
    }

    /**
     * Gets the name property value.
     *
     * @return the actor name
     */
    public MultiLineString getName()
    {
        return name;
    }

    public SoftgoalNode clone()
    {
        SoftgoalNode cloned = (SoftgoalNode) super.clone();
        cloned.name = (MultiLineString) name.clone();
        return cloned;
    }

    /** Actor name */
    private MultiLineString name;
    /** Bounding rectangle width */
    private static int DEFAULT_WIDTH = 128;
    /** Bounding rectangle height */
    private static int DEFAULT_HEIGHT = 64;
}
