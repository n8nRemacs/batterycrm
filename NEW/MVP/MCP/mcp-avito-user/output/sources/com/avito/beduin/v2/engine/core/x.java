package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.N;
import kotlin.Metadata;

/* compiled from: CalculationBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/x;", "Lcom/avito/beduin/v2/engine/core/b;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class x implements InterfaceC36252b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336700a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f336701b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Object f336702c;

    public x(@Y61.k InterfaceC36274k interfaceC36274k) {
        this.f336700a = interfaceC36274k;
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Object getF336702c() {
        return this.f336702c;
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    /* renamed from: c, reason: from getter */
    public final boolean getF336701b() {
        return this.f336701b;
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    public final void clear() {
        this.f336702c = null;
        this.f336701b = false;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final N.a f(M m12, boolean z12) {
        return N.d.f336599a;
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    @Y61.k
    public final z g() {
        return this.f336700a.i();
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336700a() {
        return this.f336700a;
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    public final void l(@Y61.l Object obj) {
        this.f336702c = obj;
        this.f336701b = true;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p */
    public final boolean getF20176c() {
        return true;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
    }
}
