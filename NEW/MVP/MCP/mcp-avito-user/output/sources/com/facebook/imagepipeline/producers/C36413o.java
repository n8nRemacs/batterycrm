package com.facebook.imagepipeline.producers;

import cX0.C27118a;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.producers.C36412n;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.request.ImageRequest;
import uW0.C48986a;

/* compiled from: DecodeProducer.java */
/* renamed from: com.facebook.imagepipeline.producers.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C36413o implements I.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f340707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f340708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36412n.c f340709c;

    public C36413o(C36412n.c cVar, k0 k0Var, int i12) {
        this.f340709c = cVar;
        this.f340707a = k0Var;
        this.f340708b = i12;
    }

    @Override // com.facebook.imagepipeline.producers.I.b
    public final void a(YW0.d dVar, int i12) throws Throwable {
        boolean z12;
        String str;
        long j12;
        YW0.b bVar;
        YW0.b bVarP;
        int i13 = i12;
        if (dVar != null) {
            k0 k0Var = this.f340709c.f340701c;
            dVar.m();
            k0Var.e(dVar.f19499c.f14508a, "image_format");
            if (C36412n.this.f340693f || !AbstractC36395b.l(i13, 16)) {
                ImageRequest imageRequestJ = this.f340707a.j();
                if (C36412n.this.f340694g || !com.facebook.common.util.g.c(imageRequestJ.f340782b)) {
                    dVar.f19504h = C27118a.a(imageRequestJ.f340787g, imageRequestJ.f340786f, dVar, this.f340708b);
                }
            }
            this.f340707a.c().a().getClass();
            C36412n.c cVar = this.f340709c;
            cVar.getClass();
            dVar.m();
            if (dVar.f19499c == RW0.b.f14495a || !AbstractC36395b.f(i12)) {
                synchronized (cVar) {
                    z12 = cVar.f340704f;
                }
                if (z12 || !YW0.d.k(dVar)) {
                    return;
                }
                dVar.m();
                RW0.c cVar2 = dVar.f19499c;
                String str2 = cVar2 != null ? cVar2.f14508a : "unknown";
                StringBuilder sb2 = new StringBuilder();
                dVar.m();
                sb2.append(dVar.f19502f);
                sb2.append("x");
                dVar.m();
                sb2.append(dVar.f19503g);
                String string = sb2.toString();
                String strValueOf = String.valueOf(dVar.f19504h);
                boolean zE2 = AbstractC36395b.e(i12);
                boolean z13 = zE2 && !AbstractC36395b.l(i13, 8);
                boolean zL2 = AbstractC36395b.l(i13, 4);
                UW0.d dVar2 = cVar.f340701c.j().f340786f;
                if (dVar2 != null) {
                    str = dVar2.f16412a + "x" + dVar2.f16413b;
                } else {
                    str = "unknown";
                }
                String str3 = str;
                try {
                    I i14 = cVar.f340705g;
                    synchronized (i14) {
                        j12 = i14.f340554i - i14.f340553h;
                    }
                    String strValueOf2 = String.valueOf(cVar.f340701c.j().f340782b);
                    int iG2 = (z13 || zL2) ? dVar.g() : cVar.n(dVar);
                    YW0.i iVarO = (z13 || zL2) ? YW0.g.f19507d : cVar.o();
                    cVar.f340702d.c(cVar.f340701c, "DecodeProducer");
                    try {
                        try {
                            bVarP = cVar.p(dVar, iG2, iVarO);
                        } catch (DecodeException e12) {
                            YW0.d dVar3 = e12.f340393b;
                            C48986a.l("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e12.getMessage(), strValueOf2, dVar3.d(), Integer.valueOf(dVar3.g()));
                            throw e12;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        bVar = null;
                    }
                    try {
                        if (dVar.f19504h != 1) {
                            i13 |= 16;
                        }
                        cVar.f340702d.j(cVar.f340701c, "DecodeProducer", cVar.m(bVarP, j12, iVarO, zE2, str2, string, str3, strValueOf));
                        cVar.r(dVar, bVarP);
                        com.facebook.common.references.a aVarA = C36412n.this.f340696i.a(bVarP);
                        try {
                            cVar.q(AbstractC36395b.e(i13));
                            cVar.f340716b.c(i13, aVarA);
                            YW0.d.b(dVar);
                        } finally {
                            com.facebook.common.references.a.c(aVarA);
                        }
                    } catch (Exception e14) {
                        e = e14;
                        bVar = bVarP;
                        cVar.f340702d.h(cVar.f340701c, "DecodeProducer", e, cVar.m(bVar, j12, iVarO, zE2, str2, string, str3, strValueOf));
                        cVar.q(true);
                        cVar.f340716b.a(e);
                        YW0.d.b(dVar);
                    }
                } catch (Throwable th2) {
                    YW0.d.b(dVar);
                    throw th2;
                }
            }
        }
    }
}
