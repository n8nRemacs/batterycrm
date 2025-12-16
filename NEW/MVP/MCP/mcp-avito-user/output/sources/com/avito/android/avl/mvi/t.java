package com.avito.android.avl.mvi;

import dagger.internal.y;

/* compiled from: AvlPlayerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final q f98257a;

    /* renamed from: b, reason: collision with root package name */
    public final o f98258b;

    /* renamed from: c, reason: collision with root package name */
    public final v f98259c;

    /* renamed from: d, reason: collision with root package name */
    public final x f98260d;

    public t(q qVar, o oVar, v vVar, x xVar) {
        this.f98257a = qVar;
        this.f98258b = oVar;
        this.f98259c = vVar;
        this.f98260d = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f98257a.getClass();
        p pVar = new p();
        n nVar = (n) this.f98258b.get();
        this.f98259c.getClass();
        u uVar = new u();
        this.f98260d.getClass();
        w wVar = new w();
        zg.h.f444159b.getClass();
        return new s("AvlPlayer", zg.h.f444160c, new r(pVar, nVar, wVar, uVar));
    }
}
