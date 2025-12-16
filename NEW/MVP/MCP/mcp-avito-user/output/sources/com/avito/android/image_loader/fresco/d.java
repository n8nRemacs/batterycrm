package com.avito.android.image_loader.fresco;

import android.net.Uri;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.D6;
import com.avito.android.util.K4;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FrescoImageRequestFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/fresco/d;", "Lcom/avito/android/image_loader/fresco/c;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f169531a;

    /* compiled from: FrescoImageRequestFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169532a;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            try {
                ImageRequest.CacheChoice cacheChoice = ImageRequest.CacheChoice.f169468b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f169532a = iArr;
        }
    }

    public d(@Y61.k SimpleDraweeView simpleDraweeView) {
        this.f169531a = simpleDraweeView;
    }

    @Y61.l
    public final com.facebook.imagepipeline.request.ImageRequest a(@Y61.k ImageRequest imageRequest) {
        ImageRequestBuilder imageRequestBuilderB;
        UW0.d dVar;
        ImageRequest.d dVar2 = imageRequest.f169447a;
        boolean z12 = dVar2 instanceof ImageRequest.d.c;
        SimpleDraweeView simpleDraweeView = this.f169531a;
        if (z12) {
            int i12 = ((ImageRequest.d.c) dVar2).f169515a;
            Uri uri = com.facebook.common.util.g.f339869a;
            imageRequestBuilderB = ImageRequestBuilder.b(new Uri.Builder().scheme("res").path(String.valueOf(i12)).build());
        } else {
            imageRequestBuilderB = dVar2 instanceof ImageRequest.d.C5013d ? ImageRequestBuilder.b(((ImageRequest.d.C5013d) dVar2).f169516a) : dVar2 instanceof ImageRequest.d.b ? ImageRequestBuilder.b(((ImageRequest.d.b) dVar2).f169514a.a(simpleDraweeView)) : null;
        }
        if (imageRequestBuilderB == null) {
            return null;
        }
        ImageRequest.CacheChoice cacheChoice = imageRequest.f169461o;
        if (cacheChoice != null) {
            imageRequestBuilderB.f340808f = a.f169532a[cacheChoice.ordinal()] == 1 ? ImageRequest.CacheChoice.f340795b : ImageRequest.CacheChoice.f340796c;
        }
        com.avito.android.tns_gallery.p pVar = imageRequest.f169450d;
        if (pVar != null) {
            if (imageRequestBuilderB.f340810h != null) {
                throw new IllegalArgumentException("Postprocessor already exists");
            }
            imageRequestBuilderB.f340810h = new CM.a(pVar);
        }
        K4 k42 = imageRequest.f169453g;
        if (k42 != null && !k42.equals(new K4.a())) {
            if (imageRequestBuilderB.f340810h != null) {
                throw new IllegalArgumentException("Postprocessor already exists");
            }
            imageRequestBuilderB.f340810h = new CM.d(k42);
        }
        ImageRequest.c cVar = imageRequest.f169465s;
        if (cVar != null) {
            dVar = new UW0.d(cVar.f169510a, cVar.f169511b);
        } else {
            UW0.d dVar3 = D6.x(simpleDraweeView) ? new UW0.d(D6.s(simpleDraweeView), D6.r(simpleDraweeView)) : null;
            if (dVar3 == null) {
                dVar3 = new UW0.d(simpleDraweeView.getResources().getDisplayMetrics().widthPixels, simpleDraweeView.getResources().getDisplayMetrics().heightPixels);
            }
            dVar = dVar3;
        }
        imageRequestBuilderB.f340805c = dVar;
        imageRequestBuilderB.f340806d = UW0.e.f16416b;
        return imageRequestBuilderB.a();
    }
}
