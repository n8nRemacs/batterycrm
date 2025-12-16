package com.avito.android.profile_settings_extended.adapter.geo_v2.footer;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedSettingsGeoV2FooterItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/g;", "Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<yc0.k, G0> f229505b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super yc0.k, G0> lVar) {
        this.f229505b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        ExtendedSettingsGeoV2FooterItem extendedSettingsGeoV2FooterItem = (ExtendedSettingsGeoV2FooterItem) aVar;
        cVar.zW(extendedSettingsGeoV2FooterItem, new f(extendedSettingsGeoV2FooterItem, this));
        cVar.xT(extendedSettingsGeoV2FooterItem.f229494d);
    }
}
