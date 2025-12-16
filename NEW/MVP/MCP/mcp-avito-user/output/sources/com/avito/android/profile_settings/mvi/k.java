package com.avito.android.profile_settings.mvi;

import Bb0.C13132a;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import com.avito.android.profile_settings.ProfileSettingsMviFragment;
import com.avito.android.profile_settings.TabItem;
import com.avito.android.profile_settings.mvi.entity.ProfileSettingsState;
import com.avito.android.profile_settings.mvi.entity.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileSettingsReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "Lcom/avito/android/profile_settings/mvi/entity/ProfileSettingsState;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements u<com.avito.android.profile_settings.mvi.entity.a, ProfileSettingsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f228489b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ProfileSettingsMviFragment.Args f228490c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f228491d;

    @Inject
    public k(@Y61.k E e12, @Y61.k ProfileSettingsMviFragment.Args args, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f228489b = e12;
        this.f228490c = args;
        this.f228491d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ProfileSettingsState a(com.avito.android.profile_settings.mvi.entity.a aVar, ProfileSettingsState profileSettingsState) {
        com.avito.android.profile_settings.mvi.entity.a aVar2 = aVar;
        ProfileSettingsState profileSettingsState2 = profileSettingsState;
        if (aVar2 instanceof a.d) {
            return ProfileSettingsState.a(profileSettingsState2, true, null, null, 8);
        }
        boolean z12 = aVar2 instanceof a.C6948a;
        String str = profileSettingsState2.f228471e;
        if (z12) {
            a.C6948a c6948a = (a.C6948a) aVar2;
            if (str == null) {
                str = this.f228490c.f228371b;
            }
            return new ProfileSettingsState(c6948a.f228475a, false, null, str);
        }
        if (aVar2 instanceof a.b) {
            return ProfileSettingsState.a(profileSettingsState2, false, ((a.b) aVar2).f228476a, null, 8);
        }
        if (!(aVar2 instanceof a.e)) {
            return profileSettingsState2;
        }
        ProfileSettingsState.Data data = profileSettingsState2.f228468b;
        List<TabItem> list = data != null ? data.f228473c : null;
        if (list == null) {
            return profileSettingsState2;
        }
        int size = list.size();
        int i12 = ((a.e) aVar2).f228479a;
        if (size <= i12) {
            return profileSettingsState2;
        }
        if (str == null) {
            str = list.get(0).f228384e;
        }
        String str2 = list.get(i12).f228384e;
        String strA = this.f228489b.a();
        if (strA != null) {
            this.f228491d.c(new C13132a(strA, str, str2));
        }
        return ProfileSettingsState.a(profileSettingsState2, false, null, str2, 7);
    }
}
