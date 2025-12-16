package com.avito.beduin.v2.component.scroll_container.state;

import com.avito.beduin.v2.component.scroll_container.state.d;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScrollContainerState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/i;", "component", "", "<anonymous parameter 1>", "Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Lcom/avito/beduin/v2/engine/component/i;Ljava/lang/String;)Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.q<G, InterfaceC36249i, String, d.a> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f336212l = new g();

    public g() {
        super(3);
    }

    @Override // Y41.q
    public final d.a invoke(G g12, InterfaceC36249i interfaceC36249i, String str) {
        G g13 = g12;
        InterfaceC36249i interfaceC36249i2 = interfaceC36249i;
        String string = g13.getString("layout_width");
        int iA2 = string != null ? ET0.g.a(string) : -1;
        String string2 = g13.getString("layout_height");
        int iA3 = string2 != null ? ET0.g.a(string2) : -2;
        ET0.b bVar = (ET0.b) g13.f(e.f336210l, "layout_margin", "layout_margin");
        if (bVar == null) {
            bVar = (ET0.b) g13.f(f.f336211l, "layout_padding", "layout_padding");
        }
        Boolean boolC = g13.c("layout_visible");
        return new d.a(interfaceC36249i2, new d.a.C10424a(iA2, iA3, bVar, boolC != null ? boolC.booleanValue() : true));
    }
}
