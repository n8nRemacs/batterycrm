package com.avito.android.advert.item.beduin.v2;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemCardNativeCellWrapperState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/advert/item/beduin/v2/k;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/advert/item/beduin/v2/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.l<G, k> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f73368l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AbstractC36250j.b bVar) {
        super(1);
        this.f73368l = bVar;
    }

    @Override // Y41.l
    public final k invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("identifier");
        if (string == null) {
            string = "";
        }
        Boolean boolC = g13.c("visible");
        return new k(string, boolC != null ? boolC.booleanValue() : true, (ET0.b) g13.f(l.f73364l, "layout_padding", "layout_padding"), (Y41.l) g13.d(new n(this.f73368l), "onVisibleChildrenCountChange", "onVisibleChildrenCountChange"));
    }
}
