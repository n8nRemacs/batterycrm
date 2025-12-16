package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private V f379749a;

    public V(@j.P V v12) {
        this.f379749a = v12;
    }

    public void a(@j.P Object obj) {
        b(obj);
        V v12 = this.f379749a;
        if (v12 != null) {
            v12.a(obj);
        }
    }

    public abstract void b(@j.P Object obj);
}
