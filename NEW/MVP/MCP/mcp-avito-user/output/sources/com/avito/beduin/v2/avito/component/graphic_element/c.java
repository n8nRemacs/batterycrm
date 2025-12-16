package com.avito.beduin.v2.avito.component.graphic_element;

import Y41.l;
import com.avito.beduin.v2.component.common.utils.h;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.t;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoGraphicElementStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/graphic_element/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/graphic_element/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334397l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC36250j.b bVar) {
        super(1);
        this.f334397l = bVar;
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        GraphicElement graphicElementValueOf;
        G g13 = g12;
        com.avito.beduin.v2.component.common.utils.a aVarA = h.a(this.f334397l);
        String string = g13.getString("name");
        if (string == null || (graphicElementValueOf = GraphicElement.valueOf(string)) == null) {
            graphicElementValueOf = GraphicElement.f334386b;
        }
        GraphicElement graphicElement = graphicElementValueOf;
        r rVar = (r) g13.f(b.f334396l, "color", "color");
        if (rVar == null) {
            rVar = t.f338374a;
        }
        r rVar2 = rVar;
        Float fN2 = g13.n("rotation");
        return new a(graphicElement, rVar2, fN2 != null ? fN2.floatValue() : 0.0f, aVarA.f335704b, aVarA.f335705c, aVarA.f335706d, aVarA.f335703a);
    }
}
