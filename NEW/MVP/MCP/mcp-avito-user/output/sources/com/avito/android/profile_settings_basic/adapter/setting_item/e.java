package com.avito.android.profile_settings_basic.adapter.setting_item;

import Qb0.InterfaceC14878a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SettingItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/setting_item/e;", "Lcom/avito/android/profile_settings_basic/adapter/setting_item/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14878a, G0> f228698b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC14878a, G0> lVar) {
        this.f228698b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        SettingItem settingItem = (SettingItem) aVar;
        gVar.uN(settingItem);
        gVar.a(settingItem.f228691g != null ? new d(this, settingItem) : null);
    }
}
