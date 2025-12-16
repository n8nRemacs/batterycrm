package com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.autotekateaser.AutotekaButton;
import com.avito.android.remote.model.autotekateaser.PersonalDiscount;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryAutotekaNewTeaserItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/v4/g;", "LTV0/e;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface g extends TV0.e {

    /* compiled from: GalleryAutotekaNewTeaserItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Hg(@k AutotekaButton autotekaButton, @k l<? super DeepLink, G0> lVar);

    void c9();

    void h(@k String str);

    void oz(@k PersonalDiscount personalDiscount);

    void setTitle(@k String str);

    void u9();
}
