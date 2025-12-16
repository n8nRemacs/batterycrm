package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public final class In {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f378536a;

    /* renamed from: b, reason: collision with root package name */
    private final String f378537b;

    private In(@j.N Kn<?> kn2, boolean z12, @j.N String str) {
        kn2.getClass();
        this.f378536a = z12;
        this.f378537b = str;
    }

    @j.N
    public final String a() {
        return this.f378537b;
    }

    public final boolean b() {
        return this.f378536a;
    }

    public static final In a(@j.N Kn<?> kn2) {
        return new In(kn2, true, "");
    }

    public static final In a(@j.N Kn<?> kn2, @j.N String str) {
        return new In(kn2, false, str);
    }
}
