/*
 * This file is part of  GealdorCraft.
 * Copyright (c) 2023 Mark Gottschling (gottsch)
 *
 * GealdorCraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GealdorCraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GealdorCraft.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */
package mod.gottsch.forge.gealdorcraft.core.item;

import mod.gottsch.forge.gottschcore.enums.IEnum;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Mark Gottschling on 5/29/2023
 */
public enum JewelrySizeTier implements IJewelrySizeTier {
    UNKNOWN(-1, "unknown", 0, 0f, 0f),
    REGULAR(0, "regular", 1, 1f, 1f),
    GREAT(1, "great", 1, 2f, 1.5f),
    LORDS(2, "lords", 2, 3f, 2f);

    private static final Map<Integer, IEnum> codes = new HashMap<Integer, IEnum>();
    private static final Map<String, IEnum> values = new HashMap<String, IEnum>();
    private Integer code;
    private String value;

    // size specific
    private int sockets;
    private float usesMultiplier;
    private float manaMultiplier;

    // setup reverse lookup
    static {
        for (IJewelrySizeTier x : EnumSet.allOf(JewelrySizeTier.class)) {
            codes.put(x.getCode(), x);
            values.put(x.getValue(), x);
        }
    }

    /**
     * Full constructor
     * @param code
     * @param value
     */
    JewelrySizeTier(Integer code, String value, int sockets, float usesMultiplier, float manaMultiplier) {
        this.code = code;
        this.value = value;
        this.sockets = sockets;
        this.usesMultiplier = usesMultiplier;
        this.manaMultiplier = manaMultiplier;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @param code
     * @return
     */
    public static IJewelrySizeTier getByCode(Integer code) {
        return (JewelrySizeTier) codes.get(code);
    }
    /**
     *
     * @param value
     * @return
     */
    public static IJewelrySizeTier getByValue(String value) {
        return (JewelrySizeTier) values.get(value);
    }

    @Override
    public Map<Integer, IEnum> getCodes() {
        return codes;
    }
    @Override
    public Map<String, IEnum> getValues() {
        return values;
    }

    @Override
    public int getSockets() {
        return sockets;
    }

    @Override
    public float getUsesMultiplier() {
        return usesMultiplier;
    }

    @Override
    public float getManaMultiplier() {
        return manaMultiplier;
    }

    /**
     *
     * @return
     */
    public static List<String> getNames() {
        List<String> names = EnumSet.allOf(JewelrySizeTier.class).stream().map(x -> x.name()).collect(Collectors.toList());
        return names;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
