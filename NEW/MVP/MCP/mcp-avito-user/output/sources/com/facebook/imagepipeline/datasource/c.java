package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BaseBitmapDataSubscriber.java */
@Nullsafe
/* loaded from: classes12.dex */
public abstract class c extends com.facebook.datasource.e<com.facebook.common.references.a<YW0.b>> {
    @Override // com.facebook.datasource.e
    public final void f(com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
        if (fVar.g()) {
            com.facebook.common.references.a<YW0.b> aVarA = fVar.a();
            try {
                g((aVarA == null || !(aVarA.i() instanceof YW0.a)) ? null : ((YW0.a) aVarA.i()).d());
            } finally {
                com.facebook.common.references.a.c(aVarA);
            }
        }
    }

    public abstract void g(@I41.h Bitmap bitmap);
}
