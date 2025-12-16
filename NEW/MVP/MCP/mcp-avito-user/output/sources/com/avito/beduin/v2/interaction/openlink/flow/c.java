package com.avito.beduin.v2.interaction.openlink.flow;

import Y61.k;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.launch.flow.i;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OpenWebLinkInteractionFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/openlink/flow/c;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final c f337707b = new c();

    public c() {
        super("OpenWebLink");
    }

    @Override // dU0.c
    public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        A a12;
        String strL = mVar.l(zVar, ContextActionHandler.Link.URL);
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("params");
            ArrayList arrayList = null;
            if (dVarC != null && (a12 = dVarC.a(zVar)) != null) {
                Map<String, com.avito.beduin.v2.engine.field.d> map = a12.f336778b.f336870a;
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : map.entrySet()) {
                    String key = entry.getKey();
                    v vVarQ = entry.getValue().q(zVar);
                    String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                    if (f336843b == null) {
                        f336843b = "";
                    }
                    arrayList2.add(new com.avito.beduin.v2.interaction.launch.flow.k(key, f336843b));
                }
                arrayList = arrayList2;
            }
            if (arrayList == null || (kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[0])) == null) {
                kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
            }
            return new b(strL, new i(kVarArr));
        } catch (Exception e12) {
            throw new BeduinPropertyException("params", e12);
        }
    }
}
