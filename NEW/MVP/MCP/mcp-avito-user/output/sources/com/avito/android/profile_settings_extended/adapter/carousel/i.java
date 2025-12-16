package com.avito.android.profile_settings_extended.adapter.carousel;

import com.avito.android.profile_settings_extended.adapter.carousel.ExtendedSettingsCarouselItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedSettingsCarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f229330l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedSettingsCarouselItem f229331m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
        super(0);
        this.f229330l = lVar;
        this.f229331m = extendedSettingsCarouselItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f229330l.d(null);
        ExtendedSettingsCarouselItem.Carousel carousel = this.f229331m.f229286g;
        AttributedText attributedText = carousel != null ? carousel.f229291d : null;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(null);
        }
        return G0.f406611a;
    }
}
