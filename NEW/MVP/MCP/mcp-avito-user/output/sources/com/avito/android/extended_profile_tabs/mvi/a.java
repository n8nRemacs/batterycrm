package com.avito.android.extended_profile_tabs.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.extended_profile_tabs.mvi.entity.ExtendedProfileTabsInternalAction;
import com.avito.android.extended_profile_tabs.mvi.entity.a;
import dB.InterfaceC39552a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileTabsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LdB/a;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC39552a, ExtendedProfileTabsInternalAction, com.avito.android.extended_profile_tabs.mvi.entity.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_tabs.i f153219a;

    @Inject
    public a(@Y61.k com.avito.android.extended_profile_tabs.i iVar) {
        this.f153219a = iVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ExtendedProfileTabsInternalAction> b(InterfaceC39552a interfaceC39552a, com.avito.android.extended_profile_tabs.mvi.entity.a aVar) {
        InterfaceC39552a interfaceC39552a2 = interfaceC39552a;
        boolean z12 = interfaceC39552a2 instanceof InterfaceC39552a.b;
        a.C4472a c4472a = aVar.f153243f;
        if (z12) {
            return !(c4472a.f153244a instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Profile) ? new C43210w(ExtendedProfileTabsInternalAction.SelectBrandTab.f153236b) : C43175k.w();
        }
        if (interfaceC39552a2 instanceof InterfaceC39552a.d) {
            return !(c4472a.f153244a instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Search) ? new C43210w(ExtendedProfileTabsInternalAction.SelectSearchTab.f153238b) : C43175k.w();
        }
        if (interfaceC39552a2 instanceof InterfaceC39552a.c) {
            return !(c4472a.f153244a instanceof ExtendedProfileTabsArguments.ExtendedProfileTab.Rating) ? new C43210w(ExtendedProfileTabsInternalAction.SelectRatingTab.f153237b) : C43175k.w();
        }
        if (interfaceC39552a2 instanceof InterfaceC39552a.e) {
            return this.f153219a.a();
        }
        if (interfaceC39552a2 instanceof InterfaceC39552a.C11014a) {
            return new C43210w(new ExtendedProfileTabsInternalAction.HandleTabNavigationDeeplink(((InterfaceC39552a.C11014a) interfaceC39552a2).f393728a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
