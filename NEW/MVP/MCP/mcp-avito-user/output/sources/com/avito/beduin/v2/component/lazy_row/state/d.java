package com.avito.beduin.v2.component.lazy_row.state;

import Y41.q;
import com.avito.beduin.v2.component.lazy_row.state.a;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LazyRowStateFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/i;", "component", "", "itemType", "Lcom/avito/beduin/v2/component/lazy_row/state/a$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Lcom/avito/beduin/v2/engine/component/i;Ljava/lang/String;)Lcom/avito/beduin/v2/component/lazy_row/state/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements q<G, InterfaceC36249i, String, a.C10413a> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f336088l = new d();

    public d() {
        super(3);
    }

    @Override // Y41.q
    public final a.C10413a invoke(G g12, InterfaceC36249i interfaceC36249i, String str) {
        G g13 = g12;
        InterfaceC36249i interfaceC36249i2 = interfaceC36249i;
        String str2 = str;
        String string = g13.getString("layout_width");
        int iA2 = string != null ? ET0.g.a(string) : -2;
        String string2 = g13.getString("layout_height");
        int iA3 = string2 != null ? ET0.g.a(string2) : -2;
        ET0.b bVar = (ET0.b) g13.f(b.f336086l, "layout_margin", "layout_margin");
        if (bVar == null) {
            bVar = (ET0.b) g13.f(c.f336087l, "layout_padding", "layout_padding");
        }
        ET0.b bVar2 = bVar;
        Boolean boolC = g13.c("layout_visible");
        return new a.C10413a(interfaceC36249i2, new a.C10413a.C10414a(iA2, iA3, bVar2, str2, boolC != null ? boolC.booleanValue() : true));
    }
}
