package com.avito.android.serp.adapter.carousel_image;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.remote.model.inset.AdditionalItem;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: CarouselImageItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_image/d;", "LTV0/d;", "Lcom/avito/android/serp/adapter/carousel_image/f;", "Lcom/avito/android/serp/adapter/carousel_image/CarouselImageItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<f, CarouselImageItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f269121b;

    @Inject
    public d(@k h31.e<InterfaceC47690b> eVar) {
        this.f269121b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        CarouselImageItem carouselImageItem = (CarouselImageItem) aVar;
        fVar.Ud(carouselImageItem.f269111e);
        AdditionalItem.Image image = carouselImageItem.f269110d;
        UniversalColor backgroundColor = image.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniversalColorKt.universalColorOf$default("clear", 0, 2, null);
        }
        fVar.v(backgroundColor);
        fVar.i(image.getImage());
        DeepLink deeplink = image.getDeeplink();
        if (deeplink != null) {
            fVar.c(new c(this, deeplink, carouselImageItem));
        }
    }
}
