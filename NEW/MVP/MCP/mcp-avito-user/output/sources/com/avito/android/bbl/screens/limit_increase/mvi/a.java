package com.avito.android.bbl.screens.limit_increase.mvi;

import Eh.InterfaceC13485a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LimitIncreaseActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LEh/a;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "LEh/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13485a, LimitIncreaseInternalAction, Eh.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bbl.screens.limit_increase.mvi.domain.a f99761a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bbl.screens.limit_increase.mvi.domain.c f99762b;

    @Inject
    public a(@Y61.k com.avito.android.bbl.screens.limit_increase.mvi.domain.a aVar, @Y61.k com.avito.android.bbl.screens.limit_increase.mvi.domain.c cVar) {
        this.f99761a = aVar;
        this.f99762b = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<LimitIncreaseInternalAction> b(InterfaceC13485a interfaceC13485a, Eh.c cVar) {
        InterfaceC13485a interfaceC13485a2 = interfaceC13485a;
        Eh.c cVar2 = cVar;
        if (interfaceC13485a2 instanceof InterfaceC13485a.c) {
            return this.f99762b.a(cVar2.f4184j);
        }
        if (interfaceC13485a2 instanceof InterfaceC13485a.d) {
            return this.f99761a.a();
        }
        if (interfaceC13485a2 instanceof InterfaceC13485a.b) {
            return new C43210w(cVar2.f4176b ? LimitIncreaseInternalAction.FinishFlow.f99800b : LimitIncreaseInternalAction.Back.f99795b);
        }
        if (interfaceC13485a2 instanceof InterfaceC13485a.C0246a) {
            return new C43210w(new LimitIncreaseInternalAction.ChangeChip(((InterfaceC13485a.C0246a) interfaceC13485a2).f4166a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
