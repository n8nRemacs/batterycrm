package com.avito.android.image_loader.fresco;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35742a2;
import com.avito.android.util.C35829k2;
import com.avito.android.util.D6;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ImageLoadableExtension.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_image-loader-fresco_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s {

    /* compiled from: ImageLoadableExtension.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/image_loader/fresco/s$b", "Lcom/facebook/imagepipeline/datasource/c;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.facebook.imagepipeline.datasource.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.facebook.datasource.c f169546a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f169547b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f169548c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Drawable, G0> f169549d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ N f169550e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(com.facebook.datasource.c cVar, InterfaceC40743a interfaceC40743a, View view, Y41.l lVar, Y41.a aVar) {
            this.f169546a = cVar;
            this.f169547b = interfaceC40743a;
            this.f169548c = view;
            this.f169549d = lVar;
            this.f169550e = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // com.facebook.datasource.e
        public final void a(@Y61.k com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
            ?? r12 = this.f169550e;
            if (r12 != 0) {
                r12.invoke();
            }
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // com.facebook.imagepipeline.datasource.c
        public final void g(@Y61.l Bitmap bitmap) {
            InterfaceC40743a interfaceC40743a = this.f169547b;
            com.facebook.datasource.c cVar = this.f169546a;
            if (cVar.g()) {
                if (bitmap != null) {
                    try {
                        try {
                            if (!bitmap.isRecycled()) {
                                interfaceC40743a.setImage(null);
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f169548c.getResources(), bitmap.copy(Bitmap.Config.ARGB_8888, true));
                                Y41.l<Drawable, G0> lVar = this.f169549d;
                                if (lVar != null) {
                                    lVar.invoke(bitmapDrawable);
                                }
                                interfaceC40743a.setImage(bitmapDrawable);
                            }
                        } catch (Throwable unused) {
                            ?? r52 = this.f169550e;
                            if (r52 != 0) {
                                r52.invoke();
                            }
                        }
                    } finally {
                        cVar.close();
                    }
                }
            }
        }
    }

    public static final void a(@Y61.k InterfaceC40743a interfaceC40743a, @Y61.k Image image, boolean z12, boolean z13, @Y61.l Y41.l<? super Drawable, G0> lVar, @Y61.l Y41.a<G0> aVar) {
        View imageContainerView = interfaceC40743a.getImageContainerView();
        if (imageContainerView == null) {
            return;
        }
        C35742a2 c35742a2B = C35829k2.b(image, D6.s(imageContainerView), D6.r(imageContainerView), 1.5f, 2, 32);
        Uri uriD = z12 ? c35742a2B.d() : c35742a2B.b();
        if (uriD == null) {
            uriD = Uri.EMPTY;
        }
        if (L.f(uriD, Uri.EMPTY)) {
            return;
        }
        c(interfaceC40743a, uriD, z13, lVar, aVar);
    }

    public static /* synthetic */ void b(InterfaceC40743a interfaceC40743a, Image image, Y41.l lVar, int i12) {
        boolean z12 = (i12 & 2) != 0;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        a(interfaceC40743a, image, z12, true, lVar, null);
    }

    public static final void c(@Y61.k InterfaceC40743a interfaceC40743a, @Y61.l Uri uri, boolean z12, @Y61.l Y41.l<? super Drawable, G0> lVar, @Y61.l Y41.a<G0> aVar) {
        View imageContainerView = interfaceC40743a.getImageContainerView();
        if (imageContainerView == null) {
            return;
        }
        if (uri == null) {
            interfaceC40743a.setImage(null);
            return;
        }
        com.facebook.imagepipeline.core.p pVarA = com.facebook.drawee.backends.pipeline.d.a();
        ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(uri);
        imageRequestBuilderB.f340804b = ImageRequest.RequestLevel.FULL_FETCH;
        com.facebook.datasource.c cVarA = pVarA.a(imageRequestBuilderB.a(), null);
        cVarA.d(new b(cVarA, interfaceC40743a, imageContainerView, lVar, aVar), com.facebook.common.executors.i.a());
        if (z12) {
            imageContainerView.addOnAttachStateChangeListener(new a(cVarA));
        }
    }

    /* compiled from: ImageLoadableExtension.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/image_loader/fresco/s$a", "Landroid/view/View$OnAttachStateChangeListener;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.facebook.datasource.c f169545b;

        public a(com.facebook.datasource.c cVar) {
            this.f169545b = cVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            this.f169545b.close();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
        }
    }
}
