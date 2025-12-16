package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.remote.model.Image;
import com.avito.android.str_booking.network.di.StrBookingSectionType;
import com.avito.android.str_booking.network.models.sections.GalleryContent;
import com.avito.android.str_booking.network.models.sections.GallerySection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: StrBookingGalleryConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/v;", "Lcom/avito/android/str_booking/domain/items_converter/u;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_booking.domain.items_converter.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35081v implements InterfaceC35080u {
    @Inject
    public C35081v() {
    }

    @Override // com.avito.android.str_booking.domain.items_converter.InterfaceC35080u
    @Y61.k
    public final com.avito.android.str_booking.ui.gallery.c a(@Y61.k GallerySection gallerySection) {
        List<Image> images;
        StrBookingSectionType[] strBookingSectionTypeArr = StrBookingSectionType.f285853b;
        GalleryContent content = gallerySection.getContent();
        if (content == null || (images = content.getImages()) == null) {
            images = C42784z0.f406748b;
        }
        return new com.avito.android.str_booking.ui.gallery.c(images);
    }
}
