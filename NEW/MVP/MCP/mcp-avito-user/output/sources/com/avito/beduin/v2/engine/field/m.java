package com.avito.beduin.v2.engine.field;

import com.avito.beduin.v2.engine.core.C36264n;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.a;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.entity.x;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Params.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/m;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f336868b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final m f336869c = new m((Map<String, ? extends d>) P0.c());

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, d> f336870a;

    /* compiled from: Params.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/m$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k Map<String, ? extends d> map) {
        this.f336870a = map;
    }

    @Y61.k
    public final Map<q, ? extends K<? extends d>> A(@Y61.k String str) {
        Map<String, d> map = this.f336870a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, d> entry : map.entrySet()) {
            arrayList.add(new Q(new q(entry.getKey(), str), new C36264n(e.f336775a, entry.getValue())));
        }
        Map<q, ? extends K<? extends d>> mapP = P0.p(arrayList);
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        return mapP;
    }

    @Y61.k
    public final h B() {
        Map<String, d> map = this.f336870a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new s((d) entry.getValue(), null, 2, null));
        }
        return new h(linkedHashMap);
    }

    @Y61.l
    public final com.avito.beduin.v2.engine.field.entity.i a() {
        Object next;
        Iterator<T> it = this.f336870a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Map.Entry) next).getValue() instanceof com.avito.beduin.v2.engine.field.entity.i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        d dVar = entry != null ? (d) entry.getValue() : null;
        if (dVar instanceof com.avito.beduin.v2.engine.field.entity.i) {
            return (com.avito.beduin.v2.engine.field.entity.i) dVar;
        }
        return null;
    }

    @Y61.l
    public final Q<String, com.avito.beduin.v2.engine.field.entity.i> b() {
        Object next;
        Iterator<T> it = this.f336870a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Map.Entry) next).getValue() instanceof com.avito.beduin.v2.engine.field.entity.i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return new Q<>(entry.getKey(), (com.avito.beduin.v2.engine.field.entity.i) entry.getValue());
        }
        return null;
    }

    @Y61.l
    public final d c(@Y61.k String str) {
        return this.f336870a.get(str);
    }

    @Y61.k
    public final C36268a d(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            C36268a c36268aL = dVarC != null ? dVarC.l(zVar) : null;
            if (c36268aL != null) {
                return c36268aL;
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    public final boolean e(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            Boolean boolValueOf = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                boolValueOf = Boolean.valueOf(vVarQ.getF336837b());
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(this.f336870a, ((m) obj).f336870a);
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.c f(@Y61.k z zVar) throws BeduinPropertyException {
        try {
            d dVarC = c("component");
            com.avito.beduin.v2.engine.field.entity.c cVarR = dVarC != null ? dVarC.r(zVar) : null;
            if (cVarR != null) {
                return cVarR;
            }
            throw new IllegalArgumentException("Property component is mandatory".toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException("component", e12);
        }
    }

    public final double g(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            Double dValueOf = (dVarC == null || (vVarQ = dVarC.q(zVar)) == null) ? null : Double.valueOf(vVarQ.getF336838b());
            if (dValueOf != null) {
                return dValueOf.doubleValue();
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    public final int h(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            Integer numValueOf = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                numValueOf = Integer.valueOf(vVarQ.j());
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    public final int hashCode() {
        return this.f336870a.hashCode();
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.l i(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            com.avito.beduin.v2.engine.field.entity.l lVarE = dVarC != null ? dVarC.e(zVar) : null;
            if (lVarE != null) {
                return lVarE;
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    public final long j(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            Long lValueOf = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                lValueOf = Long.valueOf(vVarQ.getF336840b());
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.k
    public final x k(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            x xVarG = dVarC != null ? dVarC.g(zVar) : null;
            if (xVarG != null) {
                return xVarG;
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.k
    public final String l(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            String f336843b = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                f336843b = vVarQ.getF336843b();
            }
            if (f336843b != null) {
                return f336843b;
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.k
    public final A m(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            A a12 = dVarC != null ? dVarC.a(zVar) : null;
            if (a12 != null) {
                return a12;
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final C36268a n(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            if (dVarC != null) {
                return dVarC.l(zVar);
            }
            return null;
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final Boolean o(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            if (dVarC == null || (vVarQ = dVarC.q(zVar)) == null) {
                return null;
            }
            return Boolean.valueOf(vVarQ.getF336837b());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final d p(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            if (dVarC != null) {
                return dVarC.c(zVar);
            }
            return null;
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final d q(@Y61.k String str) throws BeduinPropertyException {
        try {
            return c(str);
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final Double r(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            if (dVarC == null || (vVarQ = dVarC.q(zVar)) == null) {
                return null;
            }
            return Double.valueOf(vVarQ.getF336838b());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final Integer s(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            if (dVarC == null || (vVarQ = dVarC.q(zVar)) == null) {
                return null;
            }
            return Integer.valueOf(vVarQ.j());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final com.avito.beduin.v2.engine.field.entity.l t(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            if (dVarC != null) {
                return dVarC.e(zVar);
            }
            return null;
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.k
    public final String toString() {
        return this.f336870a.toString();
    }

    @Y61.l
    public final Long u(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            if (dVarC == null || (vVarQ = dVarC.q(zVar)) == null) {
                return null;
            }
            return Long.valueOf(vVarQ.getF336840b());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final x v(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            if (dVarC != null) {
                return dVarC.g(zVar);
            }
            return null;
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final String w(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            d dVarC = c(str);
            if (dVarC == null || (vVarQ = dVarC.q(zVar)) == null) {
                return null;
            }
            return vVarQ.getF336843b();
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final A x(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        try {
            d dVarC = c(str);
            if (dVarC != null) {
                return dVarC.a(zVar);
            }
            return null;
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.l
    public final x y(@Y61.k z zVar, @Y61.k String str) throws BeduinPropertyException {
        d dVarC;
        try {
            d dVarC2 = c(str);
            d dVar = null;
            if (dVarC2 != null && (dVarC = dVarC2.c(zVar)) != null && !(dVarC instanceof com.avito.beduin.v2.engine.field.entity.f)) {
                dVar = dVarC;
            }
            if (dVar == null ? true : dVar instanceof x) {
                return (x) dVar;
            }
            throw new IllegalStateException(("Field '" + str + "' must be RawData. Cause: 'enableStraightResolve' feature").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @Y61.k
    public final m z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, d> entry : this.f336870a.entrySet()) {
            if (!L.f(entry.getKey(), "component")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new m(linkedHashMap);
    }

    public m(@Y61.k Q<String, ? extends d>... qArr) {
        this((Map<String, ? extends d>) P0.s(qArr));
    }
}
