package com.avito.android.bbl.screens.contact_history.mvi;

import Dh.C13399c;
import Dh.InterfaceC13397a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.bbl.screens.contact_history.mvi.entity.BblContactHistoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BblContactHistoryActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LDh/a;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "LDh/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13397a, BblContactHistoryInternalAction, C13399c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bbl.screens.contact_history.domain.a f99667a;

    @Inject
    public a(@Y61.k com.avito.android.bbl.screens.contact_history.domain.a aVar) {
        this.f99667a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BblContactHistoryInternalAction> b(InterfaceC13397a interfaceC13397a, C13399c c13399c) {
        InterfaceC13397a interfaceC13397a2 = interfaceC13397a;
        if (interfaceC13397a2.equals(InterfaceC13397a.C0181a.f3353a)) {
            return new C43210w(BblContactHistoryInternalAction.OnBackClick.f99679b);
        }
        if (interfaceC13397a2.equals(InterfaceC13397a.c.f3355a)) {
            return this.f99667a.a();
        }
        if (interfaceC13397a2 instanceof InterfaceC13397a.b) {
            return new C43210w(new BblContactHistoryInternalAction.OpenDeepLink(((InterfaceC13397a.b) interfaceC13397a2).f3354a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
