package com.avito.android.freemium.screens.contact_history.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.freemium.screens.contact_history.mvi.entity.FreemiumContactHistoryInternalAction;
import dF.InterfaceC39572a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FreemiumContactHistoryActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LdF/a;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "LdF/c;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC39572a, FreemiumContactHistoryInternalAction, dF.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.freemium.screens.contact_history.domain.a f158984a;

    @Inject
    public a(@Y61.k com.avito.android.freemium.screens.contact_history.domain.a aVar) {
        this.f158984a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FreemiumContactHistoryInternalAction> b(InterfaceC39572a interfaceC39572a, dF.c cVar) {
        InterfaceC39572a interfaceC39572a2 = interfaceC39572a;
        if (interfaceC39572a2.equals(InterfaceC39572a.C11018a.f393753a)) {
            return new C43210w(FreemiumContactHistoryInternalAction.OnBackClick.f158996b);
        }
        if (interfaceC39572a2.equals(InterfaceC39572a.c.f393755a)) {
            return this.f158984a.a();
        }
        if (interfaceC39572a2 instanceof InterfaceC39572a.b) {
            return new C43210w(new FreemiumContactHistoryInternalAction.OpenDeepLink(((InterfaceC39572a.b) interfaceC39572a2).f393754a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
