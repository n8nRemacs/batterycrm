package com.avito.beduin.v2.avito.component.text.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoWebViewStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/text/state/F;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/text/state/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class q extends N implements Y41.l<G, F> {

    /* renamed from: l, reason: collision with root package name */
    public static final q f335379l = new q();

    public q() {
        super(1);
    }

    @Override // Y41.l
    public final F invoke(G g12) {
        String string = g12.getString("title");
        if (string == null) {
            string = "";
        }
        return new F(string);
    }
}
