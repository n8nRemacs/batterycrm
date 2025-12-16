package com.avito.android.mortgage.landing.mvi.domain;

import Y61.k;
import Y61.l;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LandingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/domain/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {
    @k
    InterfaceC43160i<LandingInternalAction> a(@k String str, @l String str2);

    @k
    InterfaceC43160i<LandingInternalAction> b(@l MZ.k kVar);

    @k
    InterfaceC43160i c(@k String str, @l String str2, @l String str3, @k Map map);

    @k
    InterfaceC43160i d(@l String str, @k Map map, boolean z12, @l String str2, @l String str3);

    @k
    InterfaceC43160i<LandingInternalAction> e(@l String str, @l String str2, @l String str3, @k Map<String, ? extends LandingItem> map);
}
