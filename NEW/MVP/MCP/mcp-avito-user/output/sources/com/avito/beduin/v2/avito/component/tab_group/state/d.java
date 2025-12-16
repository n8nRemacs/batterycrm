package com.avito.beduin.v2.avito.component.tab_group.state;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.beduin.v2.avito.component.tab_group.state.c;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoTabGroupStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/tab_group/state/c$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/tab_group/state/c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.l<G, c.a> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f335285l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final c.a invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("title");
        if (string == null) {
            string = "";
        }
        Integer numA = g13.a("notificationText");
        String string2 = g13.getString("notificationView");
        NotificationView notificationViewValueOf = string2 != null ? NotificationView.valueOf(string2) : null;
        Boolean boolC = g13.c(BeduinCartItemModel.DISABLED_STRING);
        return new c.a(string, numA, notificationViewValueOf, boolC != null ? boolC.booleanValue() : false);
    }
}
