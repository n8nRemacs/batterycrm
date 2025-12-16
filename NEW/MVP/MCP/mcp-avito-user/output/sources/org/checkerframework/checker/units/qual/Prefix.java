package org.checkerframework.checker.units.qual;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Prefix {

    /* renamed from: b, reason: collision with root package name */
    public static final Prefix f420239b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Prefix[] f420240c;

    /* JADX INFO: Fake field, exist only in values array */
    Prefix EF0;

    static {
        Prefix prefix = new Prefix("yotta", 0);
        Prefix prefix2 = new Prefix("zetta", 1);
        Prefix prefix3 = new Prefix("exa", 2);
        Prefix prefix4 = new Prefix("peta", 3);
        Prefix prefix5 = new Prefix("tera", 4);
        Prefix prefix6 = new Prefix("giga", 5);
        Prefix prefix7 = new Prefix("mega", 6);
        Prefix prefix8 = new Prefix("kilo", 7);
        Prefix prefix9 = new Prefix("hecto", 8);
        Prefix prefix10 = new Prefix("deca", 9);
        Prefix prefix11 = new Prefix(PluralsKeys.ONE, 10);
        f420239b = prefix11;
        f420240c = new Prefix[]{prefix, prefix2, prefix3, prefix4, prefix5, prefix6, prefix7, prefix8, prefix9, prefix10, prefix11, new Prefix("deci", 11), new Prefix("centi", 12), new Prefix("milli", 13), new Prefix("micro", 14), new Prefix("nano", 15), new Prefix("pico", 16), new Prefix("femto", 17), new Prefix("atto", 18), new Prefix("zepto", 19), new Prefix("yocto", 20)};
    }

    public Prefix() {
        throw null;
    }

    public static Prefix valueOf(String str) {
        return (Prefix) Enum.valueOf(Prefix.class, str);
    }

    public static Prefix[] values() {
        return (Prefix[]) f420240c.clone();
    }
}
