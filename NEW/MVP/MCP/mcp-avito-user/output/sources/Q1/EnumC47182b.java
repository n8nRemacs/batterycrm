package q1;

import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC47182b {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC47182b f428952b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC47182b f428953c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC47182b f428954d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC47182b f428955e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC47182b[] f428956f;

    static {
        EnumC47182b enumC47182b = new EnumC47182b("NONE", 0);
        f428952b = enumC47182b;
        EnumC47182b enumC47182b2 = new EnumC47182b("BASIC", 1);
        f428953c = enumC47182b2;
        EnumC47182b enumC47182b3 = new EnumC47182b("HEADERS", 2);
        f428954d = enumC47182b3;
        EnumC47182b enumC47182b4 = new EnumC47182b("BODY", 3);
        f428955e = enumC47182b4;
        EnumC47182b[] enumC47182bArr = {enumC47182b, enumC47182b2, enumC47182b3, enumC47182b4};
        f428956f = enumC47182bArr;
        c.a(enumC47182bArr);
    }

    public static EnumC47182b valueOf(String str) {
        return (EnumC47182b) Enum.valueOf(EnumC47182b.class, str);
    }

    public static EnumC47182b[] values() {
        return (EnumC47182b[]) f428956f.clone();
    }
}
