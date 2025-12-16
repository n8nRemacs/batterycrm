package com.avito.beduin.v2.avito.component.select.state;

import com.avito.beduin.v2.avito.component.select.state.AvitoSelectState;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoSelectStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState$b;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<G, AvitoSelectState.b> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f335016l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final AvitoSelectState.b invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("identifier");
        if (string == null) {
            return null;
        }
        String string2 = g13.getString("title");
        if (string2 == null) {
            string2 = "";
        }
        return new AvitoSelectState.b(string, string2, g13.getString("subtitle"), g13.getString("details"), g13.getString("link"), (AvitoSelectState.a) g13.f(b.f335012l, "leadingIcon", "leadingIcon"), (AvitoSelectState.a) g13.f(c.f335013l, "trailingIcon", "trailingIcon"), (Y41.a) g13.d(e.f335015l, "onLinkTap", "onLinkTap"));
    }
}
