package com.android.volley;

import com.android.volley.j;
import j.P;

/* compiled from: Response.java */
/* loaded from: classes10.dex */
public class w<T> {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final T f67162a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final j.a f67163b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final VolleyError f67164c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f67165d;

    /* compiled from: Response.java */
    public interface a {
        void a(VolleyError volleyError);
    }

    /* compiled from: Response.java */
    public interface b<T> {
        void b(T t12);
    }

    public w(@P T t12, @P j.a aVar) {
        this.f67165d = false;
        this.f67162a = t12;
        this.f67163b = aVar;
        this.f67164c = null;
    }

    public w(VolleyError volleyError) {
        this.f67165d = false;
        this.f67162a = null;
        this.f67163b = null;
        this.f67164c = volleyError;
    }
}
