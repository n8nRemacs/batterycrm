package com.facebook.imagepipeline.datasource;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BaseBitmapReferenceDataSubscriber.java */
@Nullsafe
/* loaded from: classes12.dex */
public abstract class d extends com.facebook.datasource.e<com.facebook.common.references.a<YW0.b>> {
    @Override // com.facebook.datasource.e
    public final void f(@I41.g com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
        com.facebook.common.references.a aVarB;
        if (fVar.g()) {
            com.facebook.common.references.a<YW0.b> aVarA = fVar.a();
            if (aVarA == null || !(aVarA.i() instanceof YW0.c)) {
                aVarB = null;
            } else {
                YW0.c cVar = (YW0.c) aVarA.i();
                synchronized (cVar) {
                    aVarB = com.facebook.common.references.a.b(cVar.f19493d);
                }
            }
            try {
                g();
            } finally {
                com.facebook.common.references.a.c(aVarB);
                com.facebook.common.references.a.c(aVarA);
            }
        }
    }

    public abstract void g();
}
