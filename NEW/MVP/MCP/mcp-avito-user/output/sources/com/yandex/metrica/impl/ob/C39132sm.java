package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.sm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39132sm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ReentrantLock f381847a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39156tm f381848b;

    public C39132sm(@j.N Context context, @j.N String str) {
        this(new ReentrantLock(), new C39156tm(context, str));
    }

    public void a() {
        this.f381847a.lock();
        this.f381848b.a();
    }

    public void b() {
        this.f381848b.b();
        this.f381847a.unlock();
    }

    public void c() {
        this.f381848b.c();
        this.f381847a.unlock();
    }

    @j.k0
    public C39132sm(@j.N ReentrantLock reentrantLock, @j.N C39156tm c39156tm) {
        this.f381847a = reentrantLock;
        this.f381848b = c39156tm;
    }
}
