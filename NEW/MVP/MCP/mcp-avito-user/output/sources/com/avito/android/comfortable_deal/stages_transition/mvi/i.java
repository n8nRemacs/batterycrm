package com.avito.android.comfortable_deal.stages_transition.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import fq.InterfaceC40464b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StagesTransitionReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lfq/b;", "Lfq/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements u<InterfaceC40464b, fq.d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.stages_transition.mvi.builder.a f122990b;

    @Inject
    public i(@k com.avito.android.comfortable_deal.stages_transition.mvi.builder.a aVar) {
        this.f122990b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final fq.d a(InterfaceC40464b interfaceC40464b, fq.d dVar) {
        InterfaceC40464b interfaceC40464b2 = interfaceC40464b;
        fq.d dVar2 = dVar;
        boolean z12 = interfaceC40464b2 instanceof InterfaceC40464b.i;
        com.avito.android.comfortable_deal.stages_transition.mvi.builder.a aVar = this.f122990b;
        if (!z12) {
            return interfaceC40464b2 instanceof InterfaceC40464b.g ? aVar.d(dVar2, ((InterfaceC40464b.g) interfaceC40464b2).f396144a) : interfaceC40464b2 instanceof InterfaceC40464b.j ? aVar.e(dVar2, ((InterfaceC40464b.j) interfaceC40464b2).f396147a) : interfaceC40464b2 instanceof InterfaceC40464b.h ? aVar.f(dVar2, ((InterfaceC40464b.h) interfaceC40464b2).f396145a) : interfaceC40464b2 instanceof InterfaceC40464b.k ? aVar.b(dVar2, ((InterfaceC40464b.k) interfaceC40464b2).f396148a) : interfaceC40464b2 instanceof InterfaceC40464b.e ? fq.d.a(dVar2, true, null, 11) : interfaceC40464b2 instanceof InterfaceC40464b.f ? fq.d.a(dVar2, false, null, 11) : interfaceC40464b2 instanceof InterfaceC40464b.d ? fq.d.a(dVar2, false, null, 11) : dVar2;
        }
        InterfaceC40464b.i iVar = (InterfaceC40464b.i) interfaceC40464b2;
        iVar.getClass();
        return aVar.c(dVar2, iVar.f396146a);
    }
}
