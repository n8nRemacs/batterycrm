package com.avito.beduin.v2.avito.component.image.state;

import com.avito.beduin.v2.avito.component.image.state.Scale;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoImageStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/image/state/b;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/image/state/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.l<G, b> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f334422l = new i();

    public i() {
        super(1);
    }

    @Override // Y41.l
    public final b invoke(G g12) {
        Scale scaleA;
        G g13 = g12;
        String string = g13.getString("contentScale");
        k kVar = null;
        if (string != null) {
            Scale.f334399d.getClass();
            scaleA = Scale.a.a(string);
        } else {
            scaleA = null;
        }
        if (g13.contains("content")) {
            kVar = (k) g13.f(new g(scaleA), "content", "content");
        } else if (g13.contains("src")) {
            kVar = (k) g13.f(new h(scaleA), "src", "src");
        }
        k kVar2 = kVar;
        String string2 = g13.getString("contentDescription");
        if (string2 == null) {
            string2 = "";
        }
        String str = string2;
        Boolean boolC = g13.c("visible");
        return new b(kVar2, str, boolC != null ? boolC.booleanValue() : true, (Y41.a) g13.d(d.f334417l, "onShow", "onShow"), (Y41.a) g13.d(f.f334419l, "onHide", "onHide"), g13.getString("tag"));
    }
}
