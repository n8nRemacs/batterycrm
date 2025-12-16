package com.avito.beduin.v2.interaction.launch.flow;

import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LaunchInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/launch/flow/c;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f337447a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f337448b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337449c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<dU0.f> f337450d;

    /* compiled from: LaunchInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/launch/flow/c$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f337451b = new a();

        public a() {
            super("Launch");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            k[] kVarArr;
            A a12;
            com.avito.beduin.v2.engine.field.entity.l lVarT = mVar.t(zVar, "onResult");
            String strW = mVar.w(zVar, "key");
            if (strW == null) {
                strW = "";
            }
            try {
                com.avito.beduin.v2.engine.field.d dVarC = mVar.c("params");
                if (dVarC == null || (a12 = dVarC.a(zVar)) == null) {
                    kVarArr = null;
                } else {
                    Map<String, com.avito.beduin.v2.engine.field.d> map = a12.f336778b.f336870a;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : map.entrySet()) {
                        String key = entry.getKey();
                        v vVarQ = entry.getValue().q(zVar);
                        String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                        if (f336843b == null) {
                            f336843b = "";
                        }
                        arrayList.add(new k(key, f336843b));
                    }
                    kVarArr = (k[]) arrayList.toArray(new k[0]);
                }
                if (kVarArr == null) {
                    kVarArr = new k[0];
                }
                return new c(strW, new i(kVarArr), lVarT != null ? new b(zVar, lVarT) : null, com.avito.beduin.v2.handler.flow.actions.c.a(zVar, mVar));
            } catch (Exception e12) {
                throw new BeduinPropertyException("params", e12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k String str, @Y61.k i iVar, @Y61.l Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.l Y41.a<dU0.f> aVar) {
        this.f337447a = str;
        this.f337448b = iVar;
        this.f337449c = lVar;
        this.f337450d = aVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @Y61.l
    public final Y41.a<dU0.f> c() {
        return this.f337450d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f337447a, cVar.f337447a) && L.f(this.f337448b, cVar.f337448b) && L.f(this.f337449c, cVar.f337449c) && L.f(this.f337450d, cVar.f337450d);
    }

    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f337448b.f337466a) + (this.f337447a.hashCode() * 31)) * 31;
        Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> lVar = this.f337449c;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.a<dU0.f> aVar = this.f337450d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LaunchInteraction(key=");
        sb2.append(this.f337447a);
        sb2.append(", params=");
        sb2.append(this.f337448b);
        sb2.append(", onResult=");
        sb2.append(this.f337449c);
        sb2.append(", onFinalize=");
        return r.v(sb2, this.f337450d, ')');
    }
}
