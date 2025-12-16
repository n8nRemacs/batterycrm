package com.avito.beduin.v2.interaction.navigation.flow;

import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import kotlin.Metadata;

/* compiled from: BackInteractionFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/c;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final c f337517b = new c();

    public c() {
        super("Back");
    }

    @Override // dU0.c
    public final dU0.b b(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        u uVarA;
        if (!zVar.a().f336482i) {
            return new C36326a(null, null, 3, null);
        }
        String strW = mVar.w(zVar, "toScreen");
        if (strW != null) {
            u.f337549b.getClass();
            uVarA = u.a.a(strW);
        } else {
            uVarA = null;
        }
        com.avito.beduin.v2.engine.field.entity.l lVarT = mVar.t(zVar, "onEmptyBackStack");
        return new C36326a(uVarA, lVarT != null ? new C36327b(zVar, lVarT) : null);
    }
}
