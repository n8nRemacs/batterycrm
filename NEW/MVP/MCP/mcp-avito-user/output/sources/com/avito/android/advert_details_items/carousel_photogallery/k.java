package com.avito.android.advert_details_items.carousel_photogallery;

import android.content.Context;
import android.content.Intent;
import com.avito.android.R;
import com.avito.android.advert_details_items.photogallery.c;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35974x2;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselPhotoGalleryView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f84568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f84569c;

    public k(e eVar, h hVar) {
        this.f84568b = eVar;
        this.f84569c = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.cyclic_gallery_widget.image_carousel.i iVar = (com.avito.android.cyclic_gallery_widget.image_carousel.i) obj;
        boolean z12 = iVar instanceof i.g;
        e eVar = this.f84568b;
        h hVar = this.f84569c;
        if (!z12) {
            if (!(iVar instanceof i.e) || !C35835l0.o(hVar.f84558d)) {
                L5.a(hVar.f84558d, R.string.advert_core_network_unavailable_message, 0);
                return;
            }
            int i12 = ((i.e) iVar).f132022a;
            CarouselPhotoGalleryItem carouselPhotoGalleryItem = eVar.f84552e;
            c.a.a(eVar.f84549b, i12, carouselPhotoGalleryItem != null ? Long.valueOf(carouselPhotoGalleryItem.f84535g) : null, Boolean.FALSE, 4);
            return;
        }
        i.g gVar = (i.g) iVar;
        int i13 = gVar.f132025b;
        eVar.f84549b.a0();
        Intent intentT = hVar.f84556b.t(gVar.f132024a);
        Context context = hVar.f84558d;
        C35974x2.d(intentT);
        try {
            context.startActivity(intentT);
        } catch (Exception e12) {
            V2.f318762a.a("CarouselPhotoGallery", "Cannot open video uri", e12);
        }
    }
}
