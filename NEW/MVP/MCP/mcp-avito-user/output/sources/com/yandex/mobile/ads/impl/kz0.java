package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zg;

/* loaded from: classes8.dex */
public final class kz0<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final T f387334a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final zg.a f387335b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final ok1 f387336c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f387337d;

    public interface a {
        void a(ok1 ok1Var);
    }

    public interface b<T> {
        void a(T t12);
    }

    private kz0(@j.P T t12, @j.P zg.a aVar) {
        this.f387337d = false;
        this.f387334a = t12;
        this.f387335b = aVar;
        this.f387336c = null;
    }

    public static <T> kz0<T> a(@j.P T t12, @j.P zg.a aVar) {
        return new kz0<>(t12, aVar);
    }

    public static <T> kz0<T> a(ok1 ok1Var) {
        return new kz0<>(ok1Var);
    }

    private kz0(ok1 ok1Var) {
        this.f387337d = false;
        this.f387334a = null;
        this.f387335b = null;
        this.f387336c = ok1Var;
    }
}
