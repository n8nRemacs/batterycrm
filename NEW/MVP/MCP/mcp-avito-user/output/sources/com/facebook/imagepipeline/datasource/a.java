package com.facebook.imagepipeline.datasource;

import com.facebook.common.internal.o;
import com.facebook.imagepipeline.producers.AbstractC36395b;
import com.facebook.imagepipeline.producers.t0;

/* compiled from: AbstractProducerToDataSourceAdapter.java */
/* loaded from: classes12.dex */
class a extends AbstractC36395b<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f340388b;

    public a(b bVar) {
        this.f340388b = bVar;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36395b
    public final void g() {
        b bVar = this.f340388b;
        synchronized (bVar) {
            o.d(bVar.i());
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36395b
    public final void h(Throwable th2) {
        b bVar = this.f340388b;
        t0 t0Var = bVar.f340389h;
        if (bVar.k(th2, t0Var.f340660g)) {
            bVar.f340390i.g(t0Var, th2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36395b
    public final void i(int i12, @I41.h Object obj) {
        b bVar = this.f340388b;
        bVar.o(obj, i12, bVar.f340389h);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36395b
    public final void j(float f12) {
        this.f340388b.l(f12);
    }
}
