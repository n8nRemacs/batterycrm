package com.avito.beduin.v2.component.gridlayout.state;

import com.avito.beduin.v2.component.gridlayout.state.c;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GridLayoutStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/i;", "component", "", "itemType", "Lcom/avito/beduin/v2/component/gridlayout/state/c$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Lcom/avito/beduin/v2/engine/component/i;Ljava/lang/String;)Lcom/avito/beduin/v2/component/gridlayout/state/c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.q<G, InterfaceC36249i, String, c.a> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f335868l = new i();

    public i() {
        super(3);
    }

    @Override // Y41.q
    public final c.a invoke(G g12, InterfaceC36249i interfaceC36249i, String str) {
        Integer numA;
        G g13 = g12;
        InterfaceC36249i interfaceC36249i2 = interfaceC36249i;
        String str2 = str;
        Boolean boolC = g13.c("layout_sticky");
        boolean zBooleanValue = (boolC == null && (boolC = g13.c("sticky")) == null) ? false : boolC.booleanValue();
        String string = g13.getString("layout_width");
        int iA2 = string != null ? ET0.g.a(string) : -2;
        String string2 = g13.getString("layout_height");
        int iA3 = string2 != null ? ET0.g.a(string2) : -2;
        ET0.b bVar = (ET0.b) g13.f(g.f335866l, "layout_margin", "layout_margin");
        if (bVar == null) {
            bVar = (ET0.b) g13.f(h.f335867l, "layout_padding", "layout_padding");
        }
        ET0.b bVar2 = bVar;
        if (zBooleanValue) {
            numA = null;
        } else {
            numA = g13.a("layout_span");
            if (numA == null) {
                numA = g13.a("span");
            }
        }
        Integer num = numA;
        Boolean boolC2 = g13.c("layout_visible");
        return new c.a(interfaceC36249i2, new c.a.C10399a(iA2, iA3, bVar2, num, zBooleanValue, boolC2 != null ? boolC2.booleanValue() : true, str2));
    }
}
