package com.avito.android.profile_settings_extended.adapter.carousel;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.carousel.ExtendedSettingsCarouselItem;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedSettingsCarouselItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/j;", "Lcom/avito/android/profile_settings_extended/adapter/carousel/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<yc0.k, G0> f229332b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super yc0.k, G0> lVar) {
        this.f229332b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        ExtendedSettingsCarouselItem extendedSettingsCarouselItem = (ExtendedSettingsCarouselItem) aVar;
        lVar.j5();
        ExtendedSettingsCarouselItem.Carousel carousel = extendedSettingsCarouselItem.f229286g;
        List<ExtendedProfileSettingsAdvert> list = carousel != null ? carousel.f229292e : null;
        if (list == null || list.isEmpty()) {
            lVar.Nm(extendedSettingsCarouselItem, new d(this, extendedSettingsCarouselItem));
        } else {
            lVar.L50(extendedSettingsCarouselItem, new e(this, extendedSettingsCarouselItem));
        }
        lVar.xT(extendedSettingsCarouselItem.f229282c);
        AttributedText attributedText = carousel != null ? carousel.f229291d : null;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 5));
        }
        Parcelable parcelable = extendedSettingsCarouselItem.f229287h;
        if (parcelable != null) {
            lVar.T7(parcelable);
        } else {
            lVar.kT();
        }
        lVar.W7(new f(this, extendedSettingsCarouselItem));
        lVar.D50(new g(this, extendedSettingsCarouselItem));
        lVar.KA(new h(this, extendedSettingsCarouselItem));
        lVar.d(new i(lVar, extendedSettingsCarouselItem));
    }
}
