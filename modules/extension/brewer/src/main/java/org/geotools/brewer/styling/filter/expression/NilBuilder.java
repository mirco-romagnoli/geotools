/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2009 - 2011, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.brewer.styling.filter.expression;

import org.geotools.api.filter.expression.Expression;
import org.geotools.api.filter.expression.NilExpression;
import org.geotools.brewer.styling.builder.Builder;

public class NilBuilder implements Builder<NilExpression> {

    @Override
    public NilExpression build() {
        return (NilExpression) Expression.NIL;
    }

    @Override
    public Builder<NilExpression> reset() {
        return this;
    }

    @Override
    public Builder<NilExpression> reset(NilExpression original) {
        return this;
    }

    @Override
    public Builder<NilExpression> unset() {
        return this;
    }
}
