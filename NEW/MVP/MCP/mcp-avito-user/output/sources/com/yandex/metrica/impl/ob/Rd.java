package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Rd {

    /* renamed from: a, reason: collision with root package name */
    private final String f379300a;

    /* renamed from: b, reason: collision with root package name */
    private final String f379301b;

    public Rd(String str) {
        this(str, null);
    }

    public String a() {
        return this.f379301b;
    }

    public String b() {
        return this.f379300a;
    }

    public Rd(String str, String str2) {
        this.f379300a = str;
        this.f379301b = a(str2);
    }

    public final String a(String str) {
        return str != null ? AK.c.s(new StringBuilder(), this.f379300a, str) : this.f379300a;
    }
}
