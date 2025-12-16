package com.avito.android.reputation.ui.mvi;

import Rm0.InterfaceC15059a;
import com.avito.android.arch.mvi.a;
import com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReputationActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LRm0/a;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "LRm0/c;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC15059a, ReputationInternalAction, Rm0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.reputation.ui.e f255051a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f255052b;

    @Inject
    public b(@Y61.k com.avito.android.reputation.ui.e eVar, @Y61.k R0 r02) {
        this.f255051a = eVar;
        this.f255052b = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ReputationInternalAction> b(InterfaceC15059a interfaceC15059a, Rm0.c cVar) {
        InterfaceC15059a interfaceC15059a2 = interfaceC15059a;
        if (interfaceC15059a2 instanceof InterfaceC15059a.b) {
            return new C43210w(new ReputationInternalAction.HandleBeduinEvent(((InterfaceC15059a.b) interfaceC15059a2).f14606a));
        }
        if (interfaceC15059a2 instanceof InterfaceC15059a.d) {
            return new C43210w(new ReputationInternalAction.HandleBeduinState(((InterfaceC15059a.d) interfaceC15059a2).f14608a));
        }
        if (interfaceC15059a2 instanceof InterfaceC15059a.C0975a) {
            return new C43207v(new ReputationInternalAction[0]);
        }
        if (!(interfaceC15059a2 instanceof InterfaceC15059a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.I(this.f255052b.a(), C43175k.G(new a(this, null)));
    }
}
