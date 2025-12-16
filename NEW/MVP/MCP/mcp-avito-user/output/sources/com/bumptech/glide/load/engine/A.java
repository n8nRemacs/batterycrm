package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import j.N;
import j.P;

/* compiled from: SourceGenerator.java */
/* loaded from: classes5.dex */
class A implements d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n.a f338893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f338894c;

    public A(B b12, n.a aVar) {
        this.f338894c = b12;
        this.f338893b = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(@P Object obj) {
        B b12 = this.f338894c;
        n.a<?> aVar = this.f338893b;
        n.a<?> aVar2 = b12.f338900g;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        l lVar = b12.f338895b.f339028p;
        if (obj != null && lVar.c(aVar.f339242c.d())) {
            b12.f338899f = obj;
            ((j) b12.f338896c).l();
            return;
        }
        com.bumptech.glide.load.h hVar = aVar.f339240a;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f339242c;
        ((j) b12.f338896c).c(hVar, obj, dVar, dVar.d(), b12.f338901h);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(@N Exception exc) {
        B b12 = this.f338894c;
        n.a<?> aVar = this.f338893b;
        n.a<?> aVar2 = b12.f338900g;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        f fVar = b12.f338901h;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f339242c;
        ((j) b12.f338896c).b(fVar, exc, dVar, dVar.d());
    }
}
