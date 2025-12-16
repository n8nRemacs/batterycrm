package com.avito.android.change_specific.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import com.avito.android.change_specific.adapter.m;
import com.avito.android.change_specific.mvi.entity.ExtendedProfileChangeSpecificInternalAction;
import com.avito.android.remote.model.Specific;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import ko.C42720a;
import ko.C42721b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import lo.C43810c;

/* compiled from: ExtendedProfileChangeSpecificReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/change_specific/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "Llo/c;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<ExtendedProfileChangeSpecificInternalAction, C43810c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f118040b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f118041c;

    @Inject
    public j(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f118040b = interfaceC28373a;
        this.f118041c = e12;
    }

    public static C43810c b(List list, Integer num, Integer num2, C43810c c43810c) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.change_specific.adapter.e());
        List<Specific> list2 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (Specific specific : list2) {
            arrayList2.add(new m(specific, num != null && num.intValue() == specific.getId(), "specific_" + specific.getId()));
        }
        arrayList.addAll(arrayList2);
        return C43810c.a(c43810c, list, arrayList, num2, num, false, null, false, 64);
    }

    @Override // com.avito.android.arch.mvi.u
    public final C43810c a(ExtendedProfileChangeSpecificInternalAction extendedProfileChangeSpecificInternalAction, C43810c c43810c) {
        ExtendedProfileChangeSpecificInternalAction extendedProfileChangeSpecificInternalAction2 = extendedProfileChangeSpecificInternalAction;
        C43810c c43810c2 = c43810c;
        if (extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.ContentLoading) {
            return C43810c.a(c43810c2, null, null, null, null, true, null, false, 79);
        }
        if (extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.ContentLoadingError) {
            return C43810c.a(c43810c2, null, null, null, null, false, ((ExtendedProfileChangeSpecificInternalAction.ContentLoadingError) extendedProfileChangeSpecificInternalAction2).f118026b, false, 79);
        }
        boolean z12 = extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.ContentLoaded;
        E e12 = this.f118041c;
        InterfaceC28373a interfaceC28373a = this.f118040b;
        if (z12) {
            String strA = e12.a();
            ExtendedProfileChangeSpecificInternalAction.ContentLoaded contentLoaded = (ExtendedProfileChangeSpecificInternalAction.ContentLoaded) extendedProfileChangeSpecificInternalAction2;
            Integer num = contentLoaded.f118025c;
            interfaceC28373a.c(new C42721b(strA, num));
            return b(contentLoaded.f118024b, num, num, c43810c2);
        }
        if (extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.SavingInProgress) {
            interfaceC28373a.c(new C42720a(e12.a(), c43810c2.f414210e));
            return C43810c.a(c43810c2, null, null, null, null, false, null, true, 63);
        }
        if (extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.SavingSuccess) {
            return C43810c.a(c43810c2, null, null, null, null, false, null, false, 63);
        }
        if (extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.SavingError) {
            return C43810c.a(c43810c2, null, null, null, null, false, null, false, 63);
        }
        if (extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.SelectSpecific) {
            return b(c43810c2.f414207b, Integer.valueOf(((ExtendedProfileChangeSpecificInternalAction.SelectSpecific) extendedProfileChangeSpecificInternalAction2).f118031b.getId()), c43810c2.f414209d, c43810c2);
        }
        if (extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.SelectSuccess ? true : extendedProfileChangeSpecificInternalAction2 instanceof ExtendedProfileChangeSpecificInternalAction.CloseScreen) {
            return c43810c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
