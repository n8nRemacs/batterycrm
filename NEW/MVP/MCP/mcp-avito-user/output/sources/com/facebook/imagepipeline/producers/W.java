package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.concurrent.CancellationException;

/* compiled from: PartialDiskCacheProducer.java */
/* loaded from: classes15.dex */
class W implements bolts.h<YW0.d, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f340616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f340617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36410l f340618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.facebook.cache.common.c f340619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f340620e;

    public W(Y y12, m0 m0Var, k0 k0Var, InterfaceC36410l interfaceC36410l, com.facebook.cache.common.c cVar) {
        this.f340620e = y12;
        this.f340616a = m0Var;
        this.f340617b = k0Var;
        this.f340618c = interfaceC36410l;
        this.f340619d = cVar;
    }

    @Override // bolts.h
    public final Void a(bolts.x<YW0.d> xVar) {
        boolean zG2 = xVar.g();
        m0 m0Var = this.f340616a;
        InterfaceC36410l<YW0.d> interfaceC36410l = this.f340618c;
        k0 k0Var = this.f340617b;
        if (zG2 || (xVar.h() && (xVar.e() instanceof CancellationException))) {
            m0Var.f(k0Var, "PartialDiskCacheProducer");
            interfaceC36410l.b();
        } else {
            boolean zH2 = xVar.h();
            com.facebook.cache.common.c cVar = this.f340619d;
            Y y12 = this.f340620e;
            if (zH2) {
                m0Var.h(k0Var, "PartialDiskCacheProducer", xVar.e(), null);
                y12.d(interfaceC36410l, k0Var, cVar, null);
            } else {
                YW0.d dVarF = xVar.f();
                if (dVarF != null) {
                    m0Var.j(k0Var, "PartialDiskCacheProducer", Y.c(m0Var, k0Var, true, dVarF.g()));
                    int iG2 = dVarF.g() - 1;
                    if (!(iG2 > 0)) {
                        throw new IllegalArgumentException();
                    }
                    dVarF.f19506j = new UW0.a(0, iG2);
                    int iG3 = dVarF.g();
                    ImageRequest imageRequestJ = k0Var.j();
                    UW0.a aVar = imageRequestJ.f340788h;
                    if (aVar != null && aVar.f16405a >= 0 && iG2 >= aVar.f16406b) {
                        k0Var.k("disk", "partial");
                        m0Var.b(k0Var, "PartialDiskCacheProducer", true);
                        interfaceC36410l.c(9, dVarF);
                    } else {
                        interfaceC36410l.c(8, dVarF);
                        ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(imageRequestJ.f340782b);
                        imageRequestBuilderB.f340807e = imageRequestJ.f340785e;
                        imageRequestBuilderB.f340812j = imageRequestJ.f340788h;
                        imageRequestBuilderB.f340808f = imageRequestJ.f340781a;
                        imageRequestBuilderB.f340804b = imageRequestJ.f340790j;
                        imageRequestBuilderB.f340810h = imageRequestJ.f340793m;
                        imageRequestBuilderB.f340809g = imageRequestJ.f340789i;
                        imageRequestBuilderB.f340805c = imageRequestJ.f340786f;
                        imageRequestBuilderB.f340811i = imageRequestJ.f340794n;
                        imageRequestBuilderB.f340806d = imageRequestJ.f340787g;
                        int i12 = iG3 - 1;
                        if (!(i12 >= 0)) {
                            throw new IllegalArgumentException();
                        }
                        imageRequestBuilderB.f340812j = new UW0.a(i12, Integer.MAX_VALUE);
                        y12.d(interfaceC36410l, new t0(imageRequestBuilderB.a(), k0Var.getId(), k0Var.g(), k0Var.i(), k0Var.a(), k0Var.n(), k0Var.m(), k0Var.h(), k0Var.getPriority(), k0Var.c()), cVar, dVarF);
                    }
                } else {
                    m0Var.j(k0Var, "PartialDiskCacheProducer", Y.c(m0Var, k0Var, false, 0));
                    y12.d(interfaceC36410l, k0Var, cVar, dVarF);
                }
            }
        }
        return null;
    }
}
