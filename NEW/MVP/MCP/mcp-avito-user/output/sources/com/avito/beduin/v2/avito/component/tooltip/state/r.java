package com.avito.beduin.v2.avito.component.tooltip.state;

import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTooltipState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tooltip/state/r;", "Lcom/avito/beduin/v2/engine/component/d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class r implements InterfaceC36244d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36249i f335460a;

    public r(@Y61.k InterfaceC36249i interfaceC36249i) {
        this.f335460a = interfaceC36249i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
    public final boolean a() {
        return true;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && L.f(this.f335460a, ((r) obj).f335460a);
    }

    public final int hashCode() {
        return this.f335460a.hashCode();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
    @Y61.k
    /* renamed from: r0, reason: from getter */
    public final InterfaceC36249i getF335460a() {
        return this.f335460a;
    }

    @Y61.k
    public final String toString() {
        return "TooltipChild(component=" + this.f335460a + ')';
    }
}
