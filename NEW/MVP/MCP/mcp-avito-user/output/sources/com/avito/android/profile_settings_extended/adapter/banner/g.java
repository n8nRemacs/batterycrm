package com.avito.android.profile_settings_extended.adapter.banner;

import Y41.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedSettingsBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/banner/g;", "Lcom/avito/android/profile_settings_extended/adapter/banner/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<yc0.k, G0> f229190b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k l<? super yc0.k, G0> lVar) {
        this.f229190b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        ExtendedSettingsBannerItem extendedSettingsBannerItem = (ExtendedSettingsBannerItem) aVar;
        iVar.SM(extendedSettingsBannerItem);
        iVar.a0(new d(this, extendedSettingsBannerItem));
        iVar.Ei(new e(this));
        AttributedText attributedText = extendedSettingsBannerItem.f229167e;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 4));
        }
        iVar.d(new f(extendedSettingsBannerItem));
    }
}
