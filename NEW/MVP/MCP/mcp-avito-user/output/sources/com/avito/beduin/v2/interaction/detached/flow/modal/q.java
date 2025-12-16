package com.avito.beduin.v2.interaction.detached.flow.modal;

import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.interaction.detached.flow.modal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShowModalInteraction.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/interaction/detached/flow/modal/r;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/interaction/detached/flow/modal/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class q extends N implements Y41.l<G, r> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.m f337366l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f337367m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, com.avito.beduin.v2.engine.field.m mVar) {
        super(1);
        this.f337366l = mVar;
        this.f337367m = zVar;
    }

    @Override // Y41.l
    public final r invoke(G g12) {
        ModalButtonsOrientation modalButtonsOrientation;
        G g13 = g12;
        String string = g13.getString("title");
        String str = string == null ? "" : string;
        String string2 = g13.getString("subtitle");
        String str2 = string2 == null ? "" : string2;
        List listG = g13.g("buttons", "buttons", m.f337362l);
        String string3 = g13.getString("buttonsOrientation");
        if (string3 != null) {
            ModalButtonsOrientation.f337340b.getClass();
            modalButtonsOrientation = string3.equals("horizontal") ? ModalButtonsOrientation.f337341c : string3.equals("vertical") ? ModalButtonsOrientation.f337342d : ModalButtonsOrientation.f337342d;
        } else {
            modalButtonsOrientation = null;
        }
        ModalButtonsOrientation modalButtonsOrientation2 = modalButtonsOrientation;
        Boolean boolC = g13.c("closeButtonVisible");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        Y41.a aVar = (Y41.a) g13.d(p.f337365l, "onCloseClick", "onCloseClick");
        a.C10453a c10453a = (a.C10453a) g13.f(n.f337363l, "image", "image");
        Boolean boolC2 = g13.c("cancelable");
        boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : true;
        com.avito.beduin.v2.engine.field.m mVar = this.f337366l;
        z zVar = this.f337367m;
        return new r(str, str2, (C36216a[]) C42745f0.C(listG).toArray(new C36216a[0]), modalButtonsOrientation2, zBooleanValue, aVar, c10453a, zBooleanValue2, new b(zVar, mVar.t(zVar, "onShow")), new c(zVar, mVar.t(zVar, "onDismiss")));
    }
}
