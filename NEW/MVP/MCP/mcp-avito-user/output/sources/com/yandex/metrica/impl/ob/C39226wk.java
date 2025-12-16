package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.wk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39226wk {

    /* renamed from: a, reason: collision with root package name */
    public final int f382141a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f382142b;

    /* renamed from: c, reason: collision with root package name */
    private final int f382143c = a();

    public C39226wk(int i12, @j.N String str) {
        this.f382141a = i12;
        this.f382142b = str;
    }

    private int a() {
        return this.f382142b.length() + (this.f382141a * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39226wk.class != obj.getClass()) {
            return false;
        }
        C39226wk c39226wk = (C39226wk) obj;
        if (this.f382141a != c39226wk.f382141a) {
            return false;
        }
        return this.f382142b.equals(c39226wk.f382142b);
    }

    public int hashCode() {
        return this.f382143c;
    }
}
