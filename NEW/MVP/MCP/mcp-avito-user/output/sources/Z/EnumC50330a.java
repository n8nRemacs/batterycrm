package z;

import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC50330a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC50330a[] f443670b;

    static {
        EnumC50330a[] enumC50330aArr = {new EnumC50330a("SBOL_APP", 0), new EnumC50330a("NONE", 1)};
        f443670b = enumC50330aArr;
        c.a(enumC50330aArr);
    }

    public static EnumC50330a valueOf(String str) {
        return (EnumC50330a) Enum.valueOf(EnumC50330a.class, str);
    }

    public static EnumC50330a[] values() {
        return (EnumC50330a[]) f443670b.clone();
    }
}
