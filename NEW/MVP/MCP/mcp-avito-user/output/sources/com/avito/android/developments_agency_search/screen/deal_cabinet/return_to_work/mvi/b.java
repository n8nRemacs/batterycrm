package com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.mvi;

import Aw.C13093d;
import Aw.InterfaceC13090a;
import Aw.InterfaceC13091b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReturnToWorkActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LAw/a;", "LAw/b;", "LAw/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC13090a, InterfaceC13091b, C13093d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k f137210a;

    @Inject
    public b(@k com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k kVar) {
        this.f137210a = kVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC13091b> b(InterfaceC13090a interfaceC13090a, C13093d c13093d) {
        C13093d c13093d2 = c13093d;
        if (interfaceC13090a instanceof InterfaceC13090a.C0028a) {
            return C43175k.G(new a(c13093d2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
