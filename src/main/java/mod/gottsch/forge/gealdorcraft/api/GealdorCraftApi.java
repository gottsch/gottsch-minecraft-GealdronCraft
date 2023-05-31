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
package mod.gottsch.forge.gealdorcraft.api;

import mod.gottsch.forge.gealdorcraft.core.item.IJewelrySize;
import mod.gottsch.forge.gealdorcraft.core.item.IJewelryType;
import mod.gottsch.forge.gealdorcraft.core.registry.EnumRegistry;
import mod.gottsch.forge.gottschcore.enums.IEnum;
import mod.gottsch.forge.gottschcore.enums.IRarity;

import java.util.Optional;

/**
 * Created by Mark Gottschling on 5/4/2023
 */
public class GealdorCraftApi {
    public static final String RARITY = "rarity";
    public static final String JEWELRY_TYPE = "jewelryType";
    public static final String JEWELRY_SIZE = "jewelrySize";

    /**
     * TODO how to integrate with Treasure2 rarity and API.
     * @param rarity
     */
    public static void registerRarity(IRarity rarity) {
        EnumRegistry.register(RARITY, rarity);
    }

    /**
     *
     * @param key
     * @return
     */
    public static Optional<IRarity> getRarity(String key) {
        IEnum ienum = EnumRegistry.get(RARITY, key);
        if (ienum == null) {
            return Optional.empty();
        }
        else {
            return Optional.of((IRarity) ienum);
        }
    }

    public static void registerJewelryType(IJewelryType jewelryType) {
        EnumRegistry.register(JEWELRY_TYPE, jewelryType);
    }

    public static Optional<IJewelryType> getJewelryType(String key) {
        IEnum ienum = EnumRegistry.get(JEWELRY_TYPE, key);
        if (ienum == null) {
            return Optional.empty();
        }
        else {
            return Optional.of((IJewelryType) ienum);
        }
    }

    public static void registerJewelrySize(IJewelrySize size) {
        EnumRegistry.register(JEWELRY_SIZE, size);
    }

    public static Optional<IJewelrySize> getJewelrySize(String key) {
        IEnum ienum = EnumRegistry.get(JEWELRY_SIZE, key);
        if (ienum == null) {
            return Optional.empty();
        }
        else {
            return Optional.of((IJewelrySize) ienum);
        }
    }
}