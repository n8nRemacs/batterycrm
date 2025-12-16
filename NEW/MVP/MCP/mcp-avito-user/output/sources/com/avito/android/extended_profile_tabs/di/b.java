package com.avito.android.extended_profile_tabs.di;

import Y61.k;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsFragment;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsFragmentData;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final Class<?> a() {
        return ExtendedProfileTabsFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @k
    public final TabBaseFragment b(@k TabFragmentFactory.Data data) {
        ExtendedProfileTabsFragment.a aVar = ExtendedProfileTabsFragment.f153141Q0;
        ExtendedProfileTabsArguments extendedProfileTabsArguments = ((ExtendedProfileTabsFragmentData) data).f153176b;
        aVar.getClass();
        return ExtendedProfileTabsFragment.a.a(extendedProfileTabsArguments);
    }
}
