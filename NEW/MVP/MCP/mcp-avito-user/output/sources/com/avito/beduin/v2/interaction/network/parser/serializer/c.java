package com.avito.beduin.v2.interaction.network.parser.serializer;

import SU0.b;
import SU0.j;
import SU0.l;
import SU0.p;
import Y61.k;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultRequestSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/parser/serializer/c;", "LSU0/l;", "a", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f337691b = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public Object f337692a;

    /* compiled from: DefaultRequestSerializer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/parser/serializer/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public c(@k PU0.b bVar) {
        this.f337692a = P0.g(new Q(b.c.AbstractC1019b.C1020b.f15008c, h.f337702a), new Q(b.c.AbstractC1019b.a.f15007c, new com.avito.beduin.v2.interaction.network.parser.serializer.a(new com.avito.beduin.v2.serialization.json.e(bVar))), new Q(b.c.AbstractC1019b.C1021c.f15009c, i.f337704a));
    }

    public static Q a(A a12) throws BeduinPropertyException {
        v vVarQ;
        F.a aVar = F.f336593b;
        b.a aVar2 = SU0.b.f14998a;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = a12.f336778b.c("type");
            String f336843b = (dVarC == null || (vVarQ = dVarC.q(aVar)) == null) ? null : vVarQ.getF336843b();
            if (f336843b == null) {
                throw new IllegalArgumentException("Property type is mandatory");
            }
            aVar2.getClass();
            SU0.b bVarA = b.a.a(f336843b);
            try {
                com.avito.beduin.v2.engine.field.d dVarC2 = a12.f336778b.c("value");
                com.avito.beduin.v2.engine.field.d dVarC3 = dVarC2 != null ? dVarC2.c(aVar) : null;
                if (dVarC3 == null) {
                    dVarC3 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
                }
                return new Q(bVarA, dVarC3);
            } catch (Exception e12) {
                throw new BeduinPropertyException("value", e12);
            }
        } catch (Exception e13) {
            throw new BeduinPropertyException("type", e13);
        }
    }

    @k
    public final j b(@k A a12) throws BeduinPropertyException {
        Q qA2 = a(a12);
        SU0.b bVar = (SU0.b) qA2.f406619b;
        com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) qA2.f406620c;
        if (bVar instanceof b.AbstractC1015b) {
            return c(dVar, com.avito.beduin.v2.engine.utils.g.c(a12, F.f336593b, "boundary"));
        }
        if (bVar instanceof b.c) {
            return d(bVar, dVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final j.b c(com.avito.beduin.v2.engine.field.d dVar, String str) throws BeduinPropertyException {
        j jVarD;
        if (!(dVar instanceof A)) {
            throw new IllegalArgumentException("multipart/form-data body must be a structure");
        }
        A a12 = (A) dVar;
        if (a12.f336778b.f336870a.isEmpty()) {
            throw new IllegalArgumentException("multipart/form-data body have at least one field");
        }
        Map<String, com.avito.beduin.v2.engine.field.d> map = a12.f336778b.f336870a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : map.entrySet()) {
            String key = entry.getKey();
            com.avito.beduin.v2.engine.field.d value = entry.getValue();
            try {
                if (!(value instanceof A)) {
                    throw new IllegalArgumentException("entities inside multipart/form-data body must be structures");
                }
                Q qA2 = a((A) value);
                SU0.b bVar = (SU0.b) qA2.f406619b;
                com.avito.beduin.v2.engine.field.d dVar2 = (com.avito.beduin.v2.engine.field.d) qA2.f406620c;
                if (bVar instanceof b.AbstractC1015b) {
                    RU0.b bVar2 = RU0.b.f14467a;
                    LogLevel[] logLevelArr = LogLevel.f337864b;
                    bVar2.getClass();
                    if (3 >= RU0.b.f14469c) {
                        RU0.b.f14468b.e(RU0.b.f14470d + ":RequestSerializer", "Nested multipart detected");
                    }
                    jVarD = c(dVar2, com.avito.beduin.v2.engine.utils.g.c((A) value, F.f336593b, "boundary"));
                } else {
                    if (!(bVar instanceof b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVarD = d(bVar, dVar2);
                }
                arrayList.add(new p(key, jVarD));
            } catch (Exception e12) {
                throw new BeduinPropertyException(key, e12);
            }
        }
        return new j.b((p[]) arrayList.toArray(new p[0]), str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final j d(SU0.b bVar, com.avito.beduin.v2.engine.field.d dVar) {
        SU0.f fVar = (SU0.f) this.f337692a.get(bVar);
        if (fVar != null) {
            return fVar.a(dVar.c(F.f336593b));
        }
        throw new IllegalArgumentException(("No serializer found for " + bVar.getF15006b()).toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @k
    public final void e(@k JV0.a aVar) {
        f fVar = new f(aVar, new C31685o(22));
        this.f337692a = P0.k(this.f337692a, P0.g(new Q(b.c.a.C1016a.f15003c, new d(fVar)), new Q(b.c.a.C1017b.f15004c, new e(fVar)), new Q(b.c.a.C1018c.f15005c, new g(fVar))));
    }
}
