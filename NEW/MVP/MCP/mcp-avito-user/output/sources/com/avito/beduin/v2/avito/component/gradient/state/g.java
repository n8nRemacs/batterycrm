package com.avito.beduin.v2.avito.component.gradient.state;

import Y41.l;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoGradientState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/gradient/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/gradient/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f334384l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        com.avito.beduin.v2.avito.component.gradient.content.b bVar = (com.avito.beduin.v2.avito.component.gradient.content.b) g13.f(b.f334379l, "content", "content");
        Boolean boolC = g13.c("visible");
        return new a(bVar, boolC != null ? boolC.booleanValue() : true, (Y41.a) g13.d(d.f334381l, "onShow", "onShow"), (Y41.a) g13.d(f.f334383l, "onHide", "onHide"), g13.getString("tag"));
    }
}
