package com.avito.beduin.v2.avito.component.date_picker.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoDatePickerStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/x;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/date_picker/state/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<G, x> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f334182l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final x invoke(G g12) {
        G g13 = g12;
        i iVar = i.f334185c;
        ST0.d dVarC = i.c(iVar, g13, "start");
        ST0.d dVarC2 = i.c(iVar, g13, "end");
        if (dVarC == null || dVarC2 == null) {
            return null;
        }
        return new x(dVarC, dVarC2);
    }
}
