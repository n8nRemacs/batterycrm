package com.avito.beduin.v2.interaction.detached.flow.modal;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.interaction.detached.flow.modal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShowModalInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/interaction/detached/flow/modal/a$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/interaction/detached/flow/modal/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class n extends N implements Y41.l<G, a.C10453a> {

    /* renamed from: l, reason: collision with root package name */
    public static final n f337363l = new n();

    public n() {
        super(1);
    }

    @Override // Y41.l
    public final a.C10453a invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("lightImageUrl");
        if (string == null) {
            string = "";
        }
        String string2 = g13.getString("darkImageUrl");
        String str = string2 != null ? string2 : "";
        Integer numA = g13.a("width");
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = g13.a("height");
        return new a.C10453a(iIntValue, numA2 != null ? numA2.intValue() : 0, string, str);
    }
}
