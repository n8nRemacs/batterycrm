package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.w1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import uw.InterfaceC49120b;
import ww.C49692c;
import ww.InterfaceC49690a;

/* compiled from: BigFiltersActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/j;", "Lcom/avito/android/arch/mvi/a;", "Lww/a;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Lww/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements com.avito.android.arch.mvi.a<InterfaceC49690a, BigFiltersInternalAction, C49692c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.big_filters.f f136728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w1 f136729b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49120b f136730c;

    @Inject
    public j(@Y61.k com.avito.android.developments_agency_search.screen.big_filters.f fVar, @Y61.k w1 w1Var, @Y61.k InterfaceC49120b interfaceC49120b) {
        this.f136728a = fVar;
        this.f136729b = w1Var;
        this.f136730c = interfaceC49120b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BigFiltersInternalAction> b(InterfaceC49690a interfaceC49690a, C49692c c49692c) {
        InterfaceC49690a interfaceC49690a2 = interfaceC49690a;
        C49692c c49692c2 = c49692c;
        if (interfaceC49690a2 instanceof InterfaceC49690a.j) {
            return C43175k.G(new a(this, null, c49692c2));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.g) {
            return C43175k.G(new b(this, null, c49692c2));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.i) {
            return C43175k.G(new c(this, null, c49692c2));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.C12836a) {
            SearchParams searchParamsC = c(c49692c2);
            this.f136730c.a(new BigFiltersInternalAction.AnalyticsEvent.ApplyButtonClicked(searchParamsC));
            return new C43207v(new BigFiltersInternalAction[]{new BigFiltersInternalAction.SendScreenResult(searchParamsC), BigFiltersInternalAction.CloseScreen.f136697b});
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.f) {
            return C43175k.G(new d(interfaceC49690a2, null));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.b) {
            return new C43210w(new BigFiltersInternalAction.UpdateApplyButtonVisibility(!((InterfaceC49690a.b) interfaceC49690a2).f441859a));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.d) {
            return C43175k.G(new e(interfaceC49690a2, null));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.k) {
            return C43175k.G(new f(interfaceC49690a2, this, null));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.c) {
            return C43175k.G(new g(this, null, c49692c2));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.e) {
            return C43175k.G(new h(interfaceC49690a2, null));
        }
        if (interfaceC49690a2 instanceof InterfaceC49690a.h) {
            return C43175k.G(new i(this, null, c49692c2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.SearchParams c(ww.C49692c r6) {
        /*
            r5 = this;
            com.avito.android.search.filter.ParametersTreeWithAdditionalImpl r0 = r6.f441878d
            com.avito.android.search.filter.w1 r1 = r5.f136729b
            com.avito.android.remote.model.SearchParams r0 = r1.a(r0)
            java.lang.String r1 = "24"
            r0.setCategoryId(r1)
            com.avito.android.remote.model.search.InlineFilterValue$InlineFilterDeveloperDevelopmentValue r1 = r6.f441879e
            com.avito.android.developments_agency_search.screen.big_filters.k.a(r0, r1)
            r1 = 0
            com.avito.android.remote.model.SearchParams r2 = r6.f441876b
            if (r2 == 0) goto L1c
            java.lang.String r3 = r2.getLocationId()
            goto L1d
        L1c:
            r3 = r1
        L1d:
            if (r3 == 0) goto L43
            java.lang.String r3 = r2.getLocationId()
            if (r3 == 0) goto L3b
            java.lang.String r4 = r0.getLocationId()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L43
            com.avito.android.remote.model.search.map.Area r6 = r2.getArea()
            if (r6 == 0) goto L49
            r2 = 3
            com.avito.android.remote.model.search.map.Area r1 = com.avito.android.remote.model.search.map.Area.copy$default(r6, r1, r1, r2, r1)
            goto L49
        L3b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r6.<init>(r0)
            throw r6
        L43:
            com.avito.android.remote.model.SearchParams r6 = r6.f441877c
            com.avito.android.remote.model.search.map.Area r1 = r6.getArea()
        L49:
            r0.setArea(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.mvi.j.c(ww.c):com.avito.android.remote.model.SearchParams");
    }
}
