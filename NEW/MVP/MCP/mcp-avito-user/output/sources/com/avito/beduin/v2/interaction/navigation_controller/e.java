package com.avito.beduin.v2.interaction.navigation_controller;

import LU0.b;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.InterfaceC36270g;
import com.avito.beduin.v2.engine.n;
import com.avito.beduin.v2.handler.flow.m;
import com.avito.beduin.v2.handler.flow.processor.a;
import com.avito.beduin.v2.interaction.navigation.flow.o;
import com.avito.beduin.v2.interaction.navigation.flow.p;
import com.avito.beduin.v2.interaction.navigation.flow.t;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import com.avito.beduin.v2.interaction.navigation_controller.d;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DefaultNavigationClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation_controller/e;", "Lcom/avito/beduin/v2/interaction/navigation/flow/o;", "navigation-controller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements o {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f337566b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f337567c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC36270g f337568d;

    public e(@k p pVar, @k c cVar, @k InterfaceC36270g interfaceC36270g) {
        this.f337566b = pVar;
        this.f337567c = cVar;
        this.f337568d = interfaceC36270g;
    }

    @Override // FV0.h
    public final void P() {
        this.f337566b.P();
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f337566b.Q(aVar);
    }

    @Override // com.avito.beduin.v2.interaction.navigation.flow.o
    @l
    public final dU0.f f(@l u uVar) {
        boolean f336892a = this.f337568d.getF336892a();
        c cVar = this.f337567c;
        if (f336892a && cVar.f337561a.d()) {
            return this.f337566b.f(uVar);
        }
        n nVarV = cVar.f337562b.f337569a.v();
        if (nVarV != null) {
            cVar.f337561a.e(nVarV);
        }
        dU0.f fVar = null;
        if (!(nVarV != null)) {
            com.avito.beduin.v2.handler.flow.processor.a aVar = (com.avito.beduin.v2.handler.flow.processor.a) ((d.a) cVar.f337564d).invoke();
            if (aVar instanceof a.C10444a) {
                fVar = ((a.C10444a) aVar).f337169a;
            } else if (aVar instanceof a.b) {
                m mVar = ((a.b) aVar).f337170a;
                n nVar = mVar.f337166a;
                if (nVar != null) {
                    fVar = new dU0.f(b.a.f9967b.f393887a, new LU0.b(nVar, mVar.f337167b, mVar.f337168c), null, 4, null);
                }
            } else if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return fVar;
    }

    @Override // com.avito.beduin.v2.interaction.navigation.flow.o
    public final boolean g(@l u uVar) {
        return this.f337566b.g(uVar);
    }

    @Override // com.avito.beduin.v2.interaction.navigation.flow.o
    public final void l(@k t tVar, boolean z12, boolean z13, @l LinkedHashMap linkedHashMap) {
        this.f337566b.l(tVar, z12, z13, linkedHashMap);
    }
}
