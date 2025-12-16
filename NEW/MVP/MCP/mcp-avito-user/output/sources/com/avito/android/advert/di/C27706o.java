package com.avito.android.advert.di;

import com.avito.android.advert.closed.ClosedAdvertFragment;
import com.avito.android.advert.item.ClosedAdvertArguments;
import com.avito.android.advert.item.ClosedAdvertFragmentData;
import com.avito.android.bottom_navigation.InterfaceC28898u;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;

/* compiled from: DataTabFragmentFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/bottom_navigation/t", "Lcom/avito/android/bottom_navigation/u;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.di.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27706o implements InterfaceC28898u {
    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final Class<?> a() {
        return ClosedAdvertFragmentData.class;
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28898u
    @Y61.k
    public final TabBaseFragment b(@Y61.k TabFragmentFactory.Data data) {
        ClosedAdvertFragment.a aVar = ClosedAdvertFragment.f68834x0;
        ClosedAdvertArguments closedAdvertArguments = ((ClosedAdvertFragmentData) data).f71604b;
        aVar.getClass();
        return ClosedAdvertFragment.a.a(closedAdvertArguments);
    }
}
