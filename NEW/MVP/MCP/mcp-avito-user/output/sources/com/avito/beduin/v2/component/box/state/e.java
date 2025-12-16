package com.avito.beduin.v2.component.box.state;

import Y41.q;
import com.avito.beduin.v2.component.box.state.b;
import com.avito.beduin.v2.component.common.Alignments;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BoxStateFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/i;", "component", "", "itemType", "Lcom/avito/beduin/v2/component/box/state/b$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Lcom/avito/beduin/v2/engine/component/i;Ljava/lang/String;)Lcom/avito/beduin/v2/component/box/state/b$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements q<G, InterfaceC36249i, String, b.a> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f335585l = new e();

    public e() {
        super(3);
    }

    @Override // Y41.q
    public final b.a invoke(G g12, InterfaceC36249i interfaceC36249i, String str) {
        Alignments alignmentsValueOf;
        G g13 = g12;
        InterfaceC36249i interfaceC36249i2 = interfaceC36249i;
        String string = g13.getString("layout_alignment");
        if (string == null || (alignmentsValueOf = Alignments.valueOf(string)) == null) {
            alignmentsValueOf = Alignments.f335642b;
        }
        Alignments alignments = alignmentsValueOf;
        String string2 = g13.getString("layout_width");
        int iA2 = string2 != null ? ET0.g.a(string2) : -1;
        String string3 = g13.getString("layout_height");
        int iA3 = string3 != null ? ET0.g.a(string3) : -2;
        ET0.b bVar = (ET0.b) g13.f(c.f335583l, "layout_margin", "layout_margin");
        if (bVar == null) {
            bVar = (ET0.b) g13.f(d.f335584l, "layout_padding", "layout_padding");
        }
        ET0.b bVar2 = bVar;
        Boolean boolC = g13.c("layout_visible");
        return new b.a(interfaceC36249i2, new b.a.C10388a(alignments, iA2, iA3, bVar2, boolC != null ? boolC.booleanValue() : true));
    }
}
