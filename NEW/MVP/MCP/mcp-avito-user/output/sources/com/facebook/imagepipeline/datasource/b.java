package com.facebook.imagepipeline.datasource;

import com.facebook.imagepipeline.producers.AbstractC36395b;
import com.facebook.imagepipeline.producers.F;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: AbstractProducerToDataSourceAdapter.java */
@J41.d
@Nullsafe
/* loaded from: classes12.dex */
public abstract class b<T> extends com.facebook.datasource.c<T> implements com.facebook.imagepipeline.request.c {

    /* renamed from: h, reason: collision with root package name */
    public final t0 f340389h;

    /* renamed from: i, reason: collision with root package name */
    public final F f340390i;

    public b(i0 i0Var, t0 t0Var, F f12) {
        com.facebook.imagepipeline.systrace.b.a();
        this.f340389h = t0Var;
        this.f340390i = f12;
        this.f339876a = t0Var.f340660g;
        com.facebook.imagepipeline.systrace.b.a();
        f12.k(t0Var);
        com.facebook.imagepipeline.systrace.b.a();
        com.facebook.imagepipeline.systrace.b.a();
        i0Var.b(new a(this), t0Var);
        com.facebook.imagepipeline.systrace.b.a();
        com.facebook.imagepipeline.systrace.b.a();
    }

    @Override // com.facebook.datasource.c, com.facebook.datasource.f
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (g()) {
            return true;
        }
        F f12 = this.f340390i;
        t0 t0Var = this.f340389h;
        f12.e(t0Var);
        t0Var.r();
        return true;
    }

    public void o(@I41.h T t12, int i12, k0 k0Var) {
        boolean zE2 = AbstractC36395b.e(i12);
        if (m(t12, zE2, k0Var.getExtras()) && zE2) {
            this.f340390i.i(this.f340389h);
        }
    }
}
