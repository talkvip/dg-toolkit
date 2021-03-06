/*******************************************************************************
 * Copyright (c) 2015 Development Gateway, Inc and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MIT License (MIT)
 * which accompanies this distribution, and is available at
 * https://opensource.org/licenses/MIT
 *
 * Contributors:
 * Development Gateway - initial API and implementation
 *******************************************************************************/
package org.devgateway.toolkit.forms.wicket.components;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.ComponentTag;

/**
 * A behavior that adds a placeholder attribute support for an input components.
 */
public class PlaceholderBehavior extends Behavior {

    private static final long serialVersionUID = -5721230717164734414L;
    private final String placeholder;

    public PlaceholderBehavior(final String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public void onComponentTag(final Component component, final ComponentTag tag) {
        super.onComponentTag(component, tag);
        tag.put("placeholder", placeholder);
    }
}
