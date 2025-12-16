package com.avito.beduin.v2.avito.component.chips.state;

import com.avito.beduin.v2.avito.component.chips.state.a;
import com.avito.beduin.v2.component.common.HorizontalAlignment;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoChipsStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/chips/state/a$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/chips/state/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.l<G, a.C10371a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334068l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC36250j.b bVar) {
        super(1);
        this.f334068l = bVar;
    }

    @Override // Y41.l
    public final a.C10371a invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("title");
        Boolean boolC = g13.c("isEnabled");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        Boolean boolC2 = g13.c("isSelected");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : false;
        Boolean boolC3 = g13.c("isActive");
        boolean zBooleanValue3 = boolC3 != null ? boolC3.booleanValue() : true;
        String string2 = g13.getString("icon");
        String string3 = g13.getString("iconAlignment");
        return new a.C10371a(string, zBooleanValue, zBooleanValue2, zBooleanValue3, string2, string3 != null ? HorizontalAlignment.valueOf(string3) : null, (Y41.l) g13.d(new c(this.f334068l), "onChange", "onChange"));
    }
}
