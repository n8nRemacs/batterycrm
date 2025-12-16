package com.avito.beduin.v2.avito.component.tooltip.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: AvitoTooltipStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/tooltip/state/p;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/tooltip/state/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<G, p> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f335448l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final p invoke(G g12) {
        G g13 = g12;
        if (!L.f(g13.getString("type"), "common")) {
            throw new IllegalStateException("Unsupported content type");
        }
        String string = g13.getString("title");
        String string2 = g13.getString("text");
        String string3 = g13.getString("buttonText");
        Y41.a aVar = (Y41.a) g13.d(i.f335447l, "onButtonClick", "onButtonClick");
        Boolean boolC = g13.c("closeButtonVisible");
        return new p(string, string2, string3, aVar, boolC != null ? boolC.booleanValue() : false);
    }
}
