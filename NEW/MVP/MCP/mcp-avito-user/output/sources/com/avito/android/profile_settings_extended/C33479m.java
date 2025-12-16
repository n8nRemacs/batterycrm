package com.avito.android.profile_settings_extended;

import androidx.fragment.app.Fragment;
import com.avito.android.profile_settings.ProfileSettingsMviFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile_settings_extended.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33479m extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSettingsFragment f230376l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33479m(ExtendedProfileSettingsFragment extendedProfileSettingsFragment) {
        super(0);
        this.f230376l = extendedProfileSettingsFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.profile_settings.p pVar;
        Fragment parentFragment = this.f230376l.getParentFragment();
        ProfileSettingsMviFragment profileSettingsMviFragment = parentFragment instanceof ProfileSettingsMviFragment ? (ProfileSettingsMviFragment) parentFragment : null;
        if (profileSettingsMviFragment != null && (pVar = profileSettingsMviFragment.f228363E0) != null) {
            pVar.f228503g.setExpanded(false);
        }
        return G0.f406611a;
    }
}
