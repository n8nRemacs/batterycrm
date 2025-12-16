package com.avito.android.tns_gallery;

import com.avito.android.remote.model.Image;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TnsGalleryItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tns_gallery/h;", "Lcom/avito/android/tns_gallery/f;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f301537b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f301538c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public N f301539d;

    @Inject
    public h(@Y61.k j jVar, @Y61.k c cVar) {
        this.f301537b = jVar;
        this.f301538c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r8, TV0.a r9, int r10) {
        /*
            r7 = this;
            com.avito.android.tns_gallery.n r8 = (com.avito.android.tns_gallery.n) r8
            com.avito.android.tns_gallery.a r9 = (com.avito.android.tns_gallery.a) r9
            long r0 = r9.f301522b
            int r0 = (int) r0
            java.util.List<com.avito.android.remote.model.TnsGalleryImage> r1 = r9.f301523c
            java.lang.Object r0 = r1.get(r0)
            com.avito.android.remote.model.TnsGalleryImage r0 = (com.avito.android.remote.model.TnsGalleryImage) r0
            com.avito.android.remote.model.Size r2 = r0.getOriginalSize()
            if (r2 == 0) goto L31
            com.avito.android.remote.model.Size$Companion r3 = com.avito.android.remote.model.Size.INSTANCE
            com.avito.android.remote.model.Size r3 = r3.getZERO()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L22
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L31
            int r3 = r2.getWidth()
            float r3 = (float) r3
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r3 = r3 / r2
            goto L33
        L31:
            r3 = 1065353216(0x3f800000, float:1.0)
        L33:
            com.avito.android.tns_gallery.j r2 = r7.f301537b
            com.avito.android.util.x6 r4 = r2.b(r3)
            int r5 = r4.f319129b
            int r6 = r4.f319128a
            r8.sB(r6, r5)
            int r1 = r1.size()
            int r1 = r1 + (-1)
            com.avito.android.tns_gallery.c r5 = r7.f301538c
            float[] r10 = r5.a(r10, r1)
            r8.Ds(r10)
            boolean r10 = r2.a(r3, r4)
            r8.m70(r10)
            com.avito.android.remote.model.Image r10 = r0.getImage()
            com.avito.android.image_loader.a r10 = com.avito.android.image_loader.b.b(r10)
            r8.qu(r10)
            com.avito.android.tns_gallery.g r10 = new com.avito.android.tns_gallery.g
            r10.<init>(r7, r9)
            r8.c(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tns_gallery.h.O5(TV0.e, TV0.a, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.tns_gallery.f
    public final void t1(@Y61.l Y41.p<? super List<Image>, ? super Integer, G0> pVar) {
        this.f301539d = (N) pVar;
    }
}
