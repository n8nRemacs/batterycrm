package com.avito.android.service_booking.mvi.di;

import com.avito.android.B2;
import com.avito.android.D2;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.service_booking.SbCheckPriceListBlock;
import com.avito.android.service_booking.SbCommentBlock;
import com.avito.android.service_booking.SbContactBlock;
import com.avito.android.service_booking.SbDateBlock;
import com.avito.android.service_booking.SbDaysBlock;
import com.avito.android.service_booking.SbGeoReferenceBlock;
import com.avito.android.service_booking.SbInfoBannerBlock;
import com.avito.android.service_booking.SbInputBlock;
import com.avito.android.service_booking.SbOfferBlock;
import com.avito.android.service_booking.SbPartnerLogoBlock;
import com.avito.android.service_booking.SbPriceListBlock;
import com.avito.android.service_booking.SbSpecialistsBlock;
import com.avito.android.service_booking.SbTextBlock;
import com.avito.android.service_booking.ServiceBookingBlock;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.G0;
import kotlin.collections.b1;

/* compiled from: ServiceBookingBlockJsonModule_ProvideServiceBookingTypeAdapterFactoriesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: a, reason: collision with root package name */
    public final D2 f274336a;

    public j(D2 d22) {
        this.f274336a = d22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B2 b22 = (B2) this.f274336a.get();
        i.f274335a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(ServiceBookingBlock.class);
        runtimeTypeAdapterFactory.b(SbTextBlock.class, "text", null);
        runtimeTypeAdapterFactory.b(SbContactBlock.class, "contacts", null);
        runtimeTypeAdapterFactory.b(SbCheckPriceListBlock.class, "checkPriceList", null);
        runtimeTypeAdapterFactory.b(SbDateBlock.class, "date", null);
        runtimeTypeAdapterFactory.b(SbPriceListBlock.class, "priceList", null);
        runtimeTypeAdapterFactory.b(SbOfferBlock.class, "offer", null);
        runtimeTypeAdapterFactory.b(SbInputBlock.class, "textInput", null);
        runtimeTypeAdapterFactory.b(SbPartnerLogoBlock.class, "logo", null);
        runtimeTypeAdapterFactory.b(SbSpecialistsBlock.class, "specialists", null);
        runtimeTypeAdapterFactory.b(SbCommentBlock.class, "comment", null);
        runtimeTypeAdapterFactory.b(SbDaysBlock.class, "days", null);
        runtimeTypeAdapterFactory.b(SbGeoReferenceBlock.class, "georeference", null);
        kotlin.reflect.n<Object> nVar = B2.f67184X[21];
        if (((Boolean) b22.f67229w.a().invoke()).booleanValue()) {
            runtimeTypeAdapterFactory.b(SbInfoBannerBlock.class, "infoBanner", null);
            G0 g02 = G0.f406611a;
        }
        return b1.g(runtimeTypeAdapterFactory);
    }
}
