package com.fasterxml.jackson.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes17.dex */
public final class Nulls {

    /* renamed from: b, reason: collision with root package name */
    public static final Nulls f340979b;

    /* renamed from: c, reason: collision with root package name */
    public static final Nulls f340980c;

    /* renamed from: d, reason: collision with root package name */
    public static final Nulls f340981d;

    /* renamed from: e, reason: collision with root package name */
    public static final Nulls f340982e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Nulls[] f340983f;

    /* JADX INFO: Fake field, exist only in values array */
    Nulls EF0;

    static {
        Nulls nulls = new Nulls("SET", 0);
        Nulls nulls2 = new Nulls("SKIP", 1);
        f340979b = nulls2;
        Nulls nulls3 = new Nulls("FAIL", 2);
        f340980c = nulls3;
        Nulls nulls4 = new Nulls("AS_EMPTY", 3);
        f340981d = nulls4;
        Nulls nulls5 = new Nulls("DEFAULT", 4);
        f340982e = nulls5;
        f340983f = new Nulls[]{nulls, nulls2, nulls3, nulls4, nulls5};
    }

    public Nulls() {
        throw null;
    }

    public static Nulls valueOf(String str) {
        return (Nulls) Enum.valueOf(Nulls.class, str);
    }

    public static Nulls[] values() {
        return (Nulls[]) f340983f.clone();
    }
}
