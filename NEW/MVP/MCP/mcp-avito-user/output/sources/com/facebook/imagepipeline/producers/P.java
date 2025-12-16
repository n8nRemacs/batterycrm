package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.util.Map;

/* compiled from: LocalThumbnailBitmapProducer.java */
@Nullsafe
@j.X
/* loaded from: classes15.dex */
public class P implements i0<com.facebook.common.references.a<YW0.b>> {

    /* compiled from: LocalThumbnailBitmapProducer.java */
    public class a extends u0<com.facebook.common.references.a<YW0.b>> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m0 f340583g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k0 f340584h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f340585i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f340586j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36410l interfaceC36410l, m0 m0Var, k0 k0Var, m0 m0Var2, k0 k0Var2, ImageRequest imageRequest, CancellationSignal cancellationSignal) {
            super(interfaceC36410l, m0Var, k0Var, "LocalThumbnailBitmapProducer");
            this.f340583g = m0Var2;
            this.f340584h = k0Var2;
            this.f340585i = imageRequest;
            this.f340586j = cancellationSignal;
        }

        @Override // com.facebook.common.executors.h
        public final void b(Object obj) {
            com.facebook.common.references.a.c((com.facebook.common.references.a) obj);
        }

        @Override // com.facebook.common.executors.h
        @I41.h
        public final Object c() throws IOException {
            P.this.getClass();
            ImageRequest imageRequest = this.f340585i;
            Uri uri = imageRequest.f340782b;
            UW0.d dVar = imageRequest.f340786f;
            Bitmap bitmapLoadThumbnail = ((ContentResolver) null).loadThumbnail(uri, new Size(dVar != null ? dVar.f16412a : 2048, dVar != null ? dVar.f16413b : 2048), this.f340586j);
            if (bitmapLoadThumbnail == null) {
                return null;
            }
            YW0.c cVar = new YW0.c(bitmapLoadThumbnail, com.facebook.imagepipeline.bitmaps.h.b(), YW0.g.f19507d);
            k0 k0Var = this.f340584h;
            k0Var.e("thumbnail", "image_format");
            cVar.c(k0Var.getExtras());
            return com.facebook.common.references.a.m(cVar);
        }

        @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
        public final void d() {
            super.d();
            this.f340586j.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
        public final void e(Exception exc) {
            super.e(exc);
            m0 m0Var = this.f340583g;
            k0 k0Var = this.f340584h;
            m0Var.b(k0Var, "LocalThumbnailBitmapProducer", false);
            k0Var.l("local");
        }

        @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
        public final void f(@I41.h Object obj) {
            com.facebook.common.references.a aVar = (com.facebook.common.references.a) obj;
            super.f(aVar);
            boolean z12 = aVar != null;
            m0 m0Var = this.f340583g;
            k0 k0Var = this.f340584h;
            m0Var.b(k0Var, "LocalThumbnailBitmapProducer", z12);
            k0Var.l("local");
        }

        @Override // com.facebook.imagepipeline.producers.u0
        public final Map g(@I41.h com.facebook.common.references.a<YW0.b> aVar) {
            return com.facebook.common.internal.k.a("createdThumbnail", String.valueOf(aVar != null));
        }
    }

    /* compiled from: LocalThumbnailBitmapProducer.java */
    public class b extends C36401e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f340588a;

        public b(u0 u0Var) {
            this.f340588a = u0Var;
        }

        @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
        public final void c() {
            this.f340588a.a();
        }
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        m0 m0VarI = k0Var.i();
        ImageRequest imageRequestJ = k0Var.j();
        k0Var.k("local", "thumbnail_bitmap");
        k0Var.b(new b(new a(interfaceC36410l, m0VarI, k0Var, m0VarI, k0Var, imageRequestJ, new CancellationSignal())));
        throw null;
    }
}
