package com.fasterxml.jackson.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes17.dex */
public final class OptBoolean {

    /* renamed from: b, reason: collision with root package name */
    public static final OptBoolean f340984b;

    /* renamed from: c, reason: collision with root package name */
    public static final OptBoolean f340985c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OptBoolean[] f340986d;

    static {
        OptBoolean optBoolean = new OptBoolean("TRUE", 0);
        f340984b = optBoolean;
        OptBoolean optBoolean2 = new OptBoolean("FALSE", 1);
        OptBoolean optBoolean3 = new OptBoolean("DEFAULT", 2);
        f340985c = optBoolean3;
        f340986d = new OptBoolean[]{optBoolean, optBoolean2, optBoolean3};
    }

    public OptBoolean() {
        throw null;
    }

    public static OptBoolean valueOf(String str) {
        return (OptBoolean) Enum.valueOf(OptBoolean.class, str);
    }

    public static OptBoolean[] values() {
        return (OptBoolean[]) f340986d.clone();
    }

    public final Boolean a() {
        if (this == f340985c) {
            return null;
        }
        return this == f340984b ? Boolean.TRUE : Boolean.FALSE;
    }
}
