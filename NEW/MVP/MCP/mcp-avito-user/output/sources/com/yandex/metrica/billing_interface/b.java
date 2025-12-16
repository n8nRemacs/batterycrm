package com.yandex.metrica.billing_interface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f377606b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f377607c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f377608d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f377609e;

    static {
        b bVar = new b("LIBRARY_V3", 0);
        f377606b = bVar;
        b bVar2 = new b("LIBRARY_V4", 1);
        f377607c = bVar2;
        b bVar3 = new b("NONE", 2);
        f377608d = bVar3;
        f377609e = new b[]{bVar, bVar2, bVar3};
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f377609e.clone();
    }
}
