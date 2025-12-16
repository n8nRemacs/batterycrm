package com.avito.android.beduin.di.module;

import com.avito.android.beduin.ui.screen.BeduinScreenRootOpenParams;
import com.avito.android.beduin.ui.screen.home_tab.BeduinScreenTabData;
import com.avito.android.beduin.ui.screen.home_tab.HomeTabBeduinScreenFragment;
import com.avito.android.beduin.ui.screen.home_tab.HomeTabBeduinScreenParams;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return BeduinScreenTabData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        BeduinScreenTabData beduinScreenTabData = (BeduinScreenTabData) data;
        HomeTabBeduinScreenParams homeTabBeduinScreenParams = new HomeTabBeduinScreenParams(new BeduinScreenRootOpenParams(beduinScreenTabData.f104394b, beduinScreenTabData.f104395c), beduinScreenTabData.f104397e);
        HomeTabBeduinScreenFragment.f104399u0.getClass();
        HomeTabBeduinScreenFragment homeTabBeduinScreenFragment = new HomeTabBeduinScreenFragment();
        homeTabBeduinScreenFragment.f104401t0.setValue(homeTabBeduinScreenFragment, HomeTabBeduinScreenFragment.f104400v0[0], homeTabBeduinScreenParams);
        return homeTabBeduinScreenFragment;
    }
}
