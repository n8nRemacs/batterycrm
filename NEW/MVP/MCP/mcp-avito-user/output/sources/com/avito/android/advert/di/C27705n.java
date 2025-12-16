package com.avito.android.advert.di;

import com.avito.android.advert.item.AdvertDetailsArguments;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.AdvertDetailsFragmentData;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;

/* compiled from: DataTabFragmentFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.di.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27705n implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return AdvertDetailsFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        AdvertDetailsFragment.C27803a c27803a = AdvertDetailsFragment.f71351B5;
        AdvertDetailsArguments advertDetailsArguments = ((AdvertDetailsFragmentData) data).f71586b;
        c27803a.getClass();
        return AdvertDetailsFragment.C27803a.a(advertDetailsArguments);
    }
}
