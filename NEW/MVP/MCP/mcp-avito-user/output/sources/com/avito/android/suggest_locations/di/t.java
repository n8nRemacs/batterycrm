package com.avito.android.suggest_locations.di;

import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.suggest_locations.SuggestLocationsArguments;
import com.avito.android.suggest_locations.SuggestLocationsFragment;
import com.avito.android.suggest_locations.SuggestLocationsFragmentData;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataTabFragmentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return SuggestLocationsFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        SuggestLocationsFragment.a aVar = SuggestLocationsFragment.f292138F0;
        SuggestLocationsArguments suggestLocationsArguments = ((SuggestLocationsFragmentData) data).f292153b;
        aVar.getClass();
        return SuggestLocationsFragment.a.a(suggestLocationsArguments);
    }
}
