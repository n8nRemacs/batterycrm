package com.avito.android.image_loader.fresco;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35809h6;
import com.avito.android.util.D6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FrescoImageLoader.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/image_loader/fresco/a;", "Lcom/avito/android/image_loader/h;", "a", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.image_loader.h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f169523e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f169524b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d f169525c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R3.d f169526d;

    /* compiled from: FrescoImageLoader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/image_loader/fresco/a$a;", "", "<init>", "()V", "", "Lcom/facebook/drawee/view/SimpleDraweeView;", "leakedViews", "Ljava/util/List;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.image_loader.fresco.a$a, reason: collision with other inner class name */
    public static final class C5015a {
        public /* synthetic */ C5015a(C42822w c42822w) {
            this();
        }

        public C5015a() {
        }
    }

    /* compiled from: FrescoImageLoader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f169528m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageRequest imageRequest) {
            super(0);
            this.f169528m = imageRequest;
        }

        @Override // Y41.a
        public final G0 invoke() {
            SimpleDraweeView simpleDraweeView = a.this.f169524b;
            Drawable drawable = this.f169528m.f169464r;
            if (drawable != null) {
                drawable.setBounds(new Rect(0, 0, D6.s(simpleDraweeView), D6.r(simpleDraweeView)));
                simpleDraweeView.getOverlay().add(drawable);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FrescoImageLoader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f169530m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageRequest imageRequest) {
            super(0);
            this.f169530m = imageRequest;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                r7 = this;
                int r0 = com.avito.android.image_loader.fresco.a.f169523e
                com.avito.android.image_loader.fresco.a r0 = com.avito.android.image_loader.fresco.a.this
                r0.getClass()
                com.avito.android.image_loader.ImageRequest r1 = r7.f169530m
                com.avito.android.image_loader.fresco.d r2 = r0.f169525c
                boolean r3 = r1.f169456j
                com.facebook.drawee.view.SimpleDraweeView r4 = r0.f169524b
                if (r3 == 0) goto L4d
                com.facebook.imagepipeline.request.ImageRequest r2 = r2.a(r1)
                java.lang.Object r3 = r4.getTag()
                boolean r3 = r3 instanceof com.facebook.datasource.n
                if (r3 != 0) goto L3b
                com.facebook.datasource.n r3 = new com.facebook.datasource.n
                r3.<init>()
                com.facebook.drawee.backends.pipeline.g r5 = com.facebook.drawee.backends.pipeline.d.f339915a
                com.facebook.drawee.backends.pipeline.f r5 = r5.get()
                r5.f339985c = r3
                com.facebook.drawee.controller.b r5 = r5.a()
                com.avito.android.image_loader.fresco.e r0 = r0.b(r1, r2, r4)
                r5.b(r0)
                r4.setController(r5)
                r4.setTag(r3)
            L3b:
                java.lang.Object r0 = r4.getTag()
                com.facebook.datasource.n r0 = (com.facebook.datasource.n) r0
                com.facebook.imagepipeline.core.p r3 = com.facebook.drawee.backends.pipeline.d.a()
                com.facebook.common.internal.r r2 = r3.c(r2)
                r0.a(r2)
                goto L8e
            L4d:
                java.lang.Object r3 = r4.getTag()
                boolean r5 = r3 instanceof com.avito.android.image_loader.ImageRequest
                if (r5 == 0) goto L58
                com.avito.android.image_loader.ImageRequest r3 = (com.avito.android.image_loader.ImageRequest) r3
                goto L59
            L58:
                r3 = 0
            L59:
                if (r3 != 0) goto L5c
                goto L71
            L5c:
                com.facebook.imagepipeline.request.ImageRequest r5 = r2.a(r3)
                com.facebook.imagepipeline.request.ImageRequest r6 = r2.a(r1)
                boolean r5 = kotlin.jvm.internal.L.f(r6, r5)
                if (r5 == 0) goto L71
                boolean r3 = r1.equals(r3)
                if (r3 == 0) goto L71
                goto L8e
            L71:
                r4.setTag(r1)
                com.facebook.imagepipeline.request.ImageRequest r2 = r2.a(r1)
                com.facebook.drawee.backends.pipeline.g r3 = com.facebook.drawee.backends.pipeline.d.f339915a
                com.facebook.drawee.backends.pipeline.f r3 = r3.get()
                r3.f339983a = r2
                com.facebook.drawee.controller.b r3 = r3.a()
                com.avito.android.image_loader.fresco.e r0 = r0.b(r1, r2, r4)
                r3.b(r0)
                r4.setController(r3)
            L8e:
                android.graphics.drawable.Drawable r0 = r1.f169464r
                if (r0 != 0) goto L93
                goto Lab
            L93:
                android.graphics.Rect r1 = new android.graphics.Rect
                int r2 = com.avito.android.util.D6.s(r4)
                int r3 = com.avito.android.util.D6.r(r4)
                r5 = 0
                r1.<init>(r5, r5, r2, r3)
                r0.setBounds(r1)
                android.view.ViewOverlay r1 = r4.getOverlay()
                r1.add(r0)
            Lab:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.image_loader.fresco.a.c.invoke():java.lang.Object");
        }
    }

    static {
        new C5015a(null);
        new ArrayList();
    }

    public a(@Y61.k SimpleDraweeView simpleDraweeView, @Y61.k d dVar, @Y61.k R3.d dVar2) {
        this.f169524b = simpleDraweeView;
        this.f169525c = dVar;
        this.f169526d = dVar2;
    }

    @Override // com.avito.android.image_loader.h
    public final void a(@Y61.k ImageRequest imageRequest) {
        G0 g02;
        com.avito.android.image_loader.h.f169554a.getClass();
        SimpleDraweeView simpleDraweeView = this.f169524b;
        Drawable drawable = imageRequest.f169452f;
        if (drawable != null) {
            ImageRequest.ScaleType scaleType = imageRequest.f169462p;
            simpleDraweeView.getHierarchy().q(drawable, (s.a) (scaleType != null ? com.avito.android.image_loader.fresco.b.a(scaleType) : s.c.f340136h));
        }
        Integer num = imageRequest.f169448b;
        if (num != null) {
            int iIntValue = num.intValue();
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            s.c cVar = s.c.f340136h;
            hierarchy.o(hierarchy.f6530b.getDrawable(iIntValue), 5);
            hierarchy.l(5).r((s.a) cVar);
        }
        if (imageRequest.f169455i) {
            com.facebook.drawee.drawable.h hVar = simpleDraweeView.getHierarchy().f6533e;
            hVar.f340059m = 0;
            if (hVar.f340058l == 1) {
                hVar.f340058l = 0;
            }
        }
        simpleDraweeView.getOverlay().clear();
        ImageRequest.d dVar = imageRequest.f169447a;
        boolean z12 = dVar instanceof ImageRequest.d.a;
        boolean z13 = imageRequest.f169463q;
        if (!z12) {
            D6.l(z13, simpleDraweeView, new c(imageRequest));
            return;
        }
        ImageRequest.d.a aVar = (ImageRequest.d.a) dVar;
        ImageRequest.ScaleType scaleType2 = aVar.f169513b;
        Drawable drawable2 = aVar.f169512a;
        if (scaleType2 != null) {
            simpleDraweeView.getHierarchy().q(drawable2, com.avito.android.image_loader.fresco.b.a(scaleType2));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            simpleDraweeView.getHierarchy().o(drawable2, 1);
        }
        D6.l(z13, simpleDraweeView, new b(imageRequest));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [Y41.a, kotlin.jvm.internal.N] */
    public final e b(ImageRequest imageRequest, com.facebook.imagepipeline.request.ImageRequest imageRequest2, SimpleDraweeView simpleDraweeView) {
        if (imageRequest2 == null ? true : C35809h6.a(imageRequest2.f340782b)) {
            return null;
        }
        Uri uri = imageRequest2 != null ? imageRequest2.f340782b : null;
        Size size = new Size(D6.s(simpleDraweeView), D6.r(simpleDraweeView));
        com.avito.android.image_loader.i iVar = imageRequest.f169454h;
        return new e(uri, imageRequest.f169458l, size, imageRequest.f169460n, imageRequest.f169459m, iVar != null ? new t(iVar) : null, this.f169526d);
    }
}
