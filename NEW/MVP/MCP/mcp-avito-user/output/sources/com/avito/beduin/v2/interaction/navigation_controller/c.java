package com.avito.beduin.v2.interaction.navigation_controller;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.InterfaceC36270g;
import com.avito.beduin.v2.engine.n;
import com.avito.beduin.v2.engine.t;
import com.avito.beduin.v2.handler.flow.m;
import com.avito.beduin.v2.handler.flow.processor.a;
import com.avito.beduin.v2.handler.flow.processor.b;
import com.avito.beduin.v2.interaction.navigation.flow.C36326a;
import com.avito.beduin.v2.interaction.navigation_controller.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinNavigationController.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation_controller/c;", "Lcom/avito/beduin/v2/handler/flow/processor/b$b;", "navigation-controller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class c implements b.InterfaceC10445b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC36238a f337561a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f337562b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC36270g f337563c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<com.avito.beduin.v2.handler.flow.processor.a> f337564d;

    public c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k InterfaceC36238a interfaceC36238a, @k InterfaceC36270g interfaceC36270g, @k Y41.a<? extends com.avito.beduin.v2.handler.flow.processor.a> aVar) {
        f fVar = new f();
        this.f337561a = interfaceC36238a;
        this.f337562b = fVar;
        this.f337563c = interfaceC36270g;
        this.f337564d = aVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.processor.b.InterfaceC10445b
    @l
    public final com.avito.beduin.v2.handler.flow.processor.a a(@k com.avito.beduin.v2.handler.flow.processor.a aVar) {
        boolean z12 = aVar instanceof a.b;
        InterfaceC36238a interfaceC36238a = this.f337561a;
        f fVar = this.f337562b;
        if (z12) {
            m mVar = ((a.b) aVar).f337170a;
            if (mVar.f337168c) {
                fVar.f337569a.clear();
            }
            t f336540d = interfaceC36238a.getF336540d();
            if (!mVar.f337167b || f336540d == null) {
                return aVar;
            }
            fVar.f337569a.addFirst(f336540d);
            return aVar;
        }
        if (!(aVar instanceof a.C10444a)) {
            throw new NoWhenBranchMatchedException();
        }
        dU0.b bVar = ((a.C10444a) aVar).f337169a.f393891b;
        if (this.f337563c.a() || !(bVar instanceof C36326a)) {
            return aVar;
        }
        n nVarV = fVar.f337569a.v();
        if (nVarV != null) {
            interfaceC36238a.e(nVarV);
        }
        if (nVarV != null) {
            return null;
        }
        return (com.avito.beduin.v2.handler.flow.processor.a) ((d.a) this.f337564d).invoke();
    }
}
