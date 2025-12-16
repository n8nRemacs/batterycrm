package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.kd0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class cf implements jd0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<jd0.c> f384251a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<jd0.c> f384252b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    private final kd0.a f384253c = new kd0.a();

    /* renamed from: d, reason: collision with root package name */
    private final f.a f384254d = new f.a();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private Looper f384255e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private i91 f384256f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private jt0 f384257g;

    public void a() {
    }

    public abstract void a(@j.P ua1 ua1Var);

    public void b() {
    }

    public final jt0 c() {
        return (jt0) db.b(this.f384257g);
    }

    public final boolean d() {
        return !this.f384252b.isEmpty();
    }

    public abstract void e();

    public final void a(i91 i91Var) {
        this.f384256f = i91Var;
        Iterator<jd0.c> it = this.f384251a.iterator();
        while (it.hasNext()) {
            it.next().a(this, i91Var);
        }
    }

    public final kd0.a b(@j.P jd0.b bVar) {
        return this.f384253c.a(0, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void c(jd0.c cVar) {
        this.f384255e.getClass();
        boolean zIsEmpty = this.f384252b.isEmpty();
        this.f384252b.add(cVar);
        if (zIsEmpty) {
            b();
        }
    }

    public final kd0.a b(int i12, @j.P jd0.b bVar) {
        return this.f384253c.a(i12, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void b(jd0.c cVar) {
        boolean zIsEmpty = this.f384252b.isEmpty();
        this.f384252b.remove(cVar);
        if (zIsEmpty || !this.f384252b.isEmpty()) {
            return;
        }
        a();
    }

    public final f.a a(@j.P jd0.b bVar) {
        return this.f384254d.a(0, bVar);
    }

    public final f.a a(int i12, @j.P jd0.b bVar) {
        return this.f384254d.a(i12, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void a(Handler handler, kd0 kd0Var) {
        this.f384253c.a(handler, kd0Var);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void a(kd0 kd0Var) {
        this.f384253c.a(kd0Var);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void a(Handler handler, com.yandex.mobile.ads.exo.drm.f fVar) {
        this.f384254d.a(handler, fVar);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void a(com.yandex.mobile.ads.exo.drm.f fVar) {
        this.f384254d.e(fVar);
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void a(jd0.c cVar, @j.P ua1 ua1Var, jt0 jt0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f384255e;
        db.a(looper == null || looper == looperMyLooper);
        this.f384257g = jt0Var;
        i91 i91Var = this.f384256f;
        this.f384251a.add(cVar);
        if (this.f384255e == null) {
            this.f384255e = looperMyLooper;
            this.f384252b.add(cVar);
            a(ua1Var);
        } else if (i91Var != null) {
            c(cVar);
            cVar.a(this, i91Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final void a(jd0.c cVar) {
        this.f384251a.remove(cVar);
        if (this.f384251a.isEmpty()) {
            this.f384255e = null;
            this.f384256f = null;
            this.f384257g = null;
            this.f384252b.clear();
            e();
            return;
        }
        b(cVar);
    }
}
