package com.avito.beduin.v2.interaction.exception.flow;

import Y61.k;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.engine.E;
import com.avito.beduin.v2.engine.component.l;
import com.avito.beduin.v2.engine.core.C36264n;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.engine.field.s;
import com.avito.beduin.v2.engine.o;
import com.avito.beduin.v2.engine.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ExceptionInteractionFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/exception/flow/e;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final e f337401b = new e();

    public e() {
        super("InteractionException");
    }

    @Override // dU0.c
    public final dU0.b b(z zVar, m mVar) {
        com.avito.beduin.v2.engine.utils.b bVarC = com.avito.beduin.v2.engine.utils.e.c(zVar, mVar);
        j jVarR = zVar.r("exceptionContent");
        o oVarA = p.a(zVar);
        Map<String, com.avito.beduin.v2.engine.field.d> map = mVar.f336870a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new s((com.avito.beduin.v2.engine.field.d) entry.getValue(), null, 2, null));
        }
        com.avito.beduin.v2.engine.field.entity.d dVarA = oVarA.a(jVarR, "StateException", linkedHashMap);
        com.avito.beduin.v2.engine.field.a.f336767b.getClass();
        com.avito.beduin.v2.engine.field.entity.c cVarA = dVarA.a(zVar, com.avito.beduin.v2.engine.field.a.f336768c);
        String f336873c = jVarR.getF336873c();
        m.f336868b.getClass();
        l lVar = new l(f336873c, f336873c, cVarA.f336788c, zVar.n(zVar.getF336594a(), "exceptionContent").o(cVarA, m.f336869c, null));
        E e12 = E.f336419a;
        zVar.getF336594a();
        C36264n c36264n = new C36264n(zVar.A(), lVar);
        e12.getClass();
        D dC2 = E.c(c36264n);
        return new d(bVarC.f336912a, bVarC.f336913b, bVarC.f336914c, dC2);
    }
}
