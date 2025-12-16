package com.avito.android.profile_settings_extended.adapter.geo;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedSettingsGeoItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo/j;", "Lcom/avito/android/profile_settings_extended/adapter/geo/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<yc0.k, G0> f229470b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super yc0.k, G0> lVar) {
        this.f229470b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        ExtendedSettingsGeoItem extendedSettingsGeoItem = (ExtendedSettingsGeoItem) aVar;
        lVar.MS(extendedSettingsGeoItem, new h(this, extendedSettingsGeoItem), new i(this));
        lVar.xT(extendedSettingsGeoItem.f229456i);
    }
}
