package com.avito.android.credits.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.credits.landing.CreditProductsLandingFragment;
import com.avito.android.credits.landing.CreditProductsLandingFragmentData;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return CreditProductsLandingFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        CreditProductsLandingFragment.f128881G0.getClass();
        CreditProductsLandingFragment creditProductsLandingFragment = new CreditProductsLandingFragment();
        creditProductsLandingFragment.f128894y0.setValue(creditProductsLandingFragment, CreditProductsLandingFragment.f128882H0[0], ((CreditProductsLandingFragmentData) data).f128896b);
        return creditProductsLandingFragment;
    }
}
