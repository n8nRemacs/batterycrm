package com.avito.beduin.v2.component.row.state;

import Y41.q;
import com.avito.beduin.v2.component.common.VerticalAlignment;
import com.avito.beduin.v2.component.row.state.a;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RowStateFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/i;", "component", "", "<anonymous parameter 1>", "Lcom/avito/beduin/v2/component/row/state/a$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Lcom/avito/beduin/v2/engine/component/i;Ljava/lang/String;)Lcom/avito/beduin/v2/component/row/state/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements q<G, InterfaceC36249i, String, a.C10422a> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f336180l = new d();

    public d() {
        super(3);
    }

    @Override // Y41.q
    public final a.C10422a invoke(G g12, InterfaceC36249i interfaceC36249i, String str) {
        VerticalAlignment verticalAlignmentValueOf;
        G g13 = g12;
        InterfaceC36249i interfaceC36249i2 = interfaceC36249i;
        String string = g13.getString("layout_alignment");
        if (string == null || (verticalAlignmentValueOf = VerticalAlignment.valueOf(string)) == null) {
            verticalAlignmentValueOf = VerticalAlignment.f335668b;
        }
        VerticalAlignment verticalAlignment = verticalAlignmentValueOf;
        String string2 = g13.getString("layout_width");
        int iA2 = string2 != null ? ET0.g.a(string2) : -2;
        String string3 = g13.getString("layout_height");
        int iA3 = string3 != null ? ET0.g.a(string3) : -2;
        ET0.b bVar = (ET0.b) g13.f(b.f336178l, "layout_margin", "layout_margin");
        if (bVar == null) {
            bVar = (ET0.b) g13.f(c.f336179l, "layout_padding", "layout_padding");
        }
        ET0.b bVar2 = bVar;
        Float fN2 = g13.n("layout_weight");
        float fFloatValue = fN2 != null ? fN2.floatValue() : 0.0f;
        Boolean boolC = g13.c("layout_visible");
        return new a.C10422a(interfaceC36249i2, new a.C10422a.C10423a(verticalAlignment, iA2, iA3, bVar2, fFloatValue, boolC != null ? boolC.booleanValue() : true));
    }
}
