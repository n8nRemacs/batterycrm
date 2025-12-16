package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BitmapPrepareProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36407i implements i0<com.facebook.common.references.a<YW0.b>> {

    /* compiled from: BitmapPrepareProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    public static class a extends r<com.facebook.common.references.a<YW0.b>, com.facebook.common.references.a<YW0.b>> {
        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) {
            Bitmap bitmap;
            com.facebook.common.references.a aVar = (com.facebook.common.references.a) obj;
            if (aVar != null && aVar.j()) {
                YW0.b bVar = (YW0.b) aVar.i();
                if (!bVar.isClosed() && (bVar instanceof YW0.c) && (bitmap = ((YW0.c) bVar).f19494e) != null) {
                    int height = bitmap.getHeight() * bitmap.getRowBytes();
                    if (height >= 0 && height <= 0) {
                        bitmap.prepareToDraw();
                    }
                }
            }
            this.f340716b.c(i12, aVar);
        }
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        if (k0Var.m()) {
            throw null;
        }
        new a(interfaceC36410l);
        throw null;
    }
}
