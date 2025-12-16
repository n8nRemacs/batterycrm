package com.avito.android.sbc.autodispatcheslist.mvi;

import Ro0.InterfaceC15067a;
import Ro0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SbcAutoDispatchesListActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LRo0/a;", "LRo0/c;", "LRo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC15067a, Ro0.c, Ro0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.autodispatcheslist.c f259119a;

    @Inject
    public c(@Y61.k com.avito.android.sbc.autodispatcheslist.c cVar) {
        this.f259119a = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Ro0.c> b(InterfaceC15067a interfaceC15067a, Ro0.d dVar) {
        InterfaceC15067a interfaceC15067a2 = interfaceC15067a;
        Ro0.d dVar2 = dVar;
        if (interfaceC15067a2 instanceof InterfaceC15067a.C0980a) {
            return new C43210w(new c.e(((InterfaceC15067a.C0980a) interfaceC15067a2).f14634a));
        }
        if (interfaceC15067a2 instanceof InterfaceC15067a.d) {
            return new C43210w(c.f.f14646a);
        }
        if (interfaceC15067a2 instanceof InterfaceC15067a.b) {
            return new C43210w(new c.b(((InterfaceC15067a.b) interfaceC15067a2).f14635a.f259043b));
        }
        if (!(interfaceC15067a2 instanceof InterfaceC15067a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.sbc.autodispatcheslist.adapter.f fVar = (com.avito.android.sbc.autodispatcheslist.adapter.f) C42745f0.S(dVar2.a());
        return this.f259119a.a(fVar != null ? Long.valueOf(fVar.f259053l) : null);
    }
}
