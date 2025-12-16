package com.avito.android.di.module;

import com.avito.android.bottom_navigation.ui.fragment.factory.HomeScreenData;
import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;

/* compiled from: SerpTabFragmentFactoryModule.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_serp_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.i9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30075i9 {
    public static final BxContentFragment a(HomeScreenData homeScreenData) {
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        BxContentArguments bxContentArguments = new BxContentArguments(null, SearchParams.INSTANCE.getEMPTY(), null, null, null, PresentationType.MAIN, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 8388573, null);
        String f107146b = homeScreenData.getF107146b();
        String f107147c = homeScreenData.getF107147c();
        c28907a.getClass();
        return BxContentFragment.C28907a.a(bxContentArguments, f107146b, f107147c);
    }
}
