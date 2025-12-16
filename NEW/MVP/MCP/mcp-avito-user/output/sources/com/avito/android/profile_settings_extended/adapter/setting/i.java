package com.avito.android.profile_settings_extended.adapter.setting;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_extended.entity.SettingsActionButton;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SettingItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/setting/i;", "Lcom/avito/android/profile_settings_extended/adapter/setting/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<yc0.k, G0> f229856b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super yc0.k, G0> lVar) {
        this.f229856b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        DeepLink deepLink;
        k kVar = (k) eVar;
        SettingItem settingItem = (SettingItem) aVar;
        kVar.hz(settingItem);
        List<SettingsActionButton> list = settingItem.f229844e;
        SettingsActionButton settingsActionButton = (SettingsActionButton) C42745f0.w0(list);
        kVar.bj(settingsActionButton);
        if (settingsActionButton == null || (deepLink = settingsActionButton.f230299d) == null) {
            g02 = null;
        } else {
            kVar.L0(new g(this, deepLink));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            kVar.L0(null);
        }
        if (list.size() > 1) {
            kVar.Ar(true);
            kVar.ea(new h(this, settingItem));
        } else {
            kVar.Ar(false);
            kVar.ea(null);
        }
    }
}
