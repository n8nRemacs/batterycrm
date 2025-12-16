package com.avito.android.developments_agency_search.screen.location_group.mvi;

import Hw.InterfaceC14039a;
import Iw.C14165c;
import Iw.InterfaceC14163a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LocationGroupActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/j;", "Lcom/avito/android/arch/mvi/a;", "LIw/a;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "LIw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements com.avito.android.arch.mvi.a<InterfaceC14163a, LocationGroupInternalAction, C14165c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.location_group.l f138193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14039a f138194b;

    @Inject
    public j(@Y61.k com.avito.android.developments_agency_search.screen.location_group.l lVar, @Y61.k InterfaceC14039a interfaceC14039a) {
        this.f138193a = lVar;
        this.f138194b = interfaceC14039a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<LocationGroupInternalAction> b(InterfaceC14163a interfaceC14163a, C14165c c14165c) {
        InterfaceC14163a interfaceC14163a2 = interfaceC14163a;
        C14165c c14165c2 = c14165c;
        if (interfaceC14163a2 instanceof InterfaceC14163a.j) {
            return C43175k.G(new a(c14165c2, this, null));
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.h) {
            return C43175k.G(new b(c14165c2, this, null));
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.d) {
            return C43175k.G(new c(c14165c2, interfaceC14163a2, this, null));
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.b) {
            return C43175k.G(new d(c14165c2, this, null));
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.c) {
            return C43175k.G(new e(c14165c2, interfaceC14163a2, this, null));
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.e) {
            return C43175k.G(new f(c14165c2, this, null));
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.f) {
            return C43175k.G(new g(c14165c2, interfaceC14163a2, this, null));
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.C0493a) {
            SearchParams searchParams = c14165c2.f8622b;
            this.f138194b.a(new LocationGroupInternalAction.AnalyticsEvent.ApplyButtonClicked(searchParams));
            return new C43207v(new LocationGroupInternalAction[]{new LocationGroupInternalAction.SendScreenResult(searchParams), LocationGroupInternalAction.CloseScreen.f138170b});
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.g) {
            return C43175k.G(new h(c14165c2, this, null));
        }
        if (interfaceC14163a2 instanceof InterfaceC14163a.i) {
            return C43175k.G(new i(c14165c2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
