package com.avito.beduin.v2.engine.field;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.A;
import com.avito.beduin.v2.engine.core.C36264n;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.y;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.MergePolicy;
import com.avito.beduin.v2.engine.field.a;
import com.avito.beduin.v2.engine.field.entity.u;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.exception.NotFoundArgException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FieldParams.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/h;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f336865b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final h f336866c = new h((Map<String, ? extends f<?>>) P0.c());

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, f<?>> f336867a;

    /* compiled from: FieldParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/h$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.k Map<String, ? extends f<?>> map) {
        this.f336867a = map;
    }

    @Y61.k
    public final h a(@Y61.k String str, @Y61.k f<?> fVar) {
        Map<String, f<?>> map = this.f336867a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((f) entry.getValue()).b(str, fVar));
        }
        return linkedHashMap.equals(map) ? this : new h(linkedHashMap);
    }

    @Y61.k
    public final Set<q> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, f<?>>> it = this.f336867a.entrySet().iterator();
        while (it.hasNext()) {
            C42745f0.h(it.next().getValue().e(), arrayList);
        }
        return C42745f0.P0(arrayList);
    }

    @Y61.k
    public final h c(@Y61.l h hVar) {
        MergePolicy mergePolicy;
        f<d> fVarF;
        if (hVar == null) {
            return this;
        }
        Map<String, f<?>> map = this.f336867a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry<String, f<?>> entry : hVar.f336867a.entrySet()) {
            String key = entry.getKey();
            f<?> value = entry.getValue();
            u uVar = value instanceof u ? (u) value : null;
            if (uVar != null && (fVarF = uVar.f()) != null) {
                value = fVarF;
            }
            if (uVar == null || (mergePolicy = uVar.f336833d.get()) == null) {
                MergePolicy.f336739a.getClass();
                mergePolicy = MergePolicy.b.f336758b;
            }
            if (mergePolicy instanceof MergePolicy.d) {
                f<?> fVar = map.get(key);
                if (fVar != null) {
                    linkedHashMap.put(key, fVar.b(fVar.getF336831b().getF336873c(), value));
                } else {
                    linkedHashMap.put(key, value.h());
                }
            } else if (mergePolicy instanceof MergePolicy.f) {
                linkedHashMap.remove(key);
            } else {
                if (!(mergePolicy instanceof MergePolicy.g)) {
                    throw new UnsupportedOperationException("StructureField can't process " + mergePolicy + " operation for " + key + " field");
                }
                linkedHashMap.put(key, value.h());
            }
        }
        return linkedHashMap.equals(map) ? this : new h(linkedHashMap);
    }

    @Y61.k
    public final h d(@Y61.k z zVar, @Y61.l m mVar) {
        Map mapB;
        if (mVar != null) {
            Map<String, d> map = mVar.f336870a;
            if (!map.isEmpty()) {
                boolean z12 = zVar.a().f336491r;
                Map<String, f<?>> map2 = this.f336867a;
                if (z12) {
                    mapB = new LinkedHashMap(P0.f(map2.size()));
                    Iterator<T> it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        d dVar = map.get(entry.getKey());
                        mapB.put(key, dVar != null ? new s(dVar, null, 2, null) : (f) entry.getValue());
                    }
                } else {
                    kotlin.collections.builders.d dVar2 = new kotlin.collections.builders.d();
                    dVar2.putAll(map2);
                    for (Map.Entry<String, d> entry2 : map.entrySet()) {
                        dVar2.put(entry2.getKey(), new s(entry2.getValue(), null, 2, null));
                    }
                    mapB = dVar2.b();
                }
                return new h((Map<String, ? extends f<?>>) mapB);
            }
        }
        return this;
    }

    @Y61.k
    public final m e(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends d>> map, @Y61.l String str) throws BeduinPropertyException {
        Object objA;
        if (str != null) {
            return com.avito.beduin.v2.engine.field.a.c(zVar, f(zVar, map, str, false));
        }
        Map<String, f<?>> map2 = this.f336867a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str2 = (String) entry.getKey();
            f fVar = (f) entry.getValue();
            boolean zF2 = zVar.F();
            List listU = C42745f0.U(fVar, com.avito.beduin.v2.engine.field.a.a(map));
            if (zF2) {
                InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, str2, listU);
                if (!interfaceC36252bK.getF336701b()) {
                    try {
                        try {
                            interfaceC36252bK.l(fVar.a(interfaceC36252bK.g(), map));
                        } catch (NotFoundArgException e12) {
                            throw new BeduinPropertyException(str2, e12);
                        }
                    } catch (Throwable th2) {
                        interfaceC36252bK.l(null);
                        throw th2;
                    }
                }
                objA = interfaceC36252bK.getF336702c();
            } else {
                try {
                    objA = fVar.a(zVar, map);
                } catch (NotFoundArgException e13) {
                    throw new BeduinPropertyException(str2, e13);
                }
            }
            linkedHashMap.put(key, (d) objA);
        }
        return new m(linkedHashMap);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.f336867a, ((h) obj).f336867a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final kotlin.collections.builders.d f(@Y61.k z zVar, @Y61.k Map map, @Y61.k String str, boolean z12) {
        Map<String, f<?>> map2 = this.f336867a;
        ArrayList arrayList = new ArrayList(map2.size());
        Iterator<Map.Entry<String, f<?>>> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            arrayList.add(new Q(new q(key, str), zVar.k(zVar.getF336594a(), key)));
        }
        Q q12 = null;
        if (!zVar.a().f336479f) {
            q qVar = new q(str, str);
            int iF2 = P0.f(C42745f0.q(arrayList, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Q q13 = (Q) it2.next();
                linkedHashMap.put(((q) q13.f406619b).f336877b, new com.avito.beduin.v2.engine.field.entity.o((y) q13.f406620c));
            }
            q12 = new Q(qVar, new A(new com.avito.beduin.v2.engine.field.entity.A(new m(linkedHashMap), null, 2, null)));
        }
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        if (zVar.a().f336478e) {
            dVar.putAll(map);
            P0.m(dVar, arrayList);
            if (q12 != null) {
                dVar.put(q12.f406619b, q12.f406620c);
            }
        } else {
            if (q12 != null) {
                dVar.put(q12.f406619b, q12.f406620c);
            }
            P0.m(dVar, arrayList);
            dVar.putAll(map);
        }
        kotlin.collections.builders.d dVarB = dVar.b();
        a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
        kotlin.collections.builders.d dVar2 = new kotlin.collections.builders.d();
        if (zVar.a().f336478e) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Q q14 = (Q) it3.next();
                ((y) q14.f406620c).h(map2.get(((q) q14.f406619b).f336877b), dVarB);
            }
            P0.m(dVar2, arrayList);
            if (q12 != null && z12) {
                dVar2.put(q12.f406619b, q12.f406620c);
            }
        } else {
            if (q12 != null && z12) {
                dVar2.put(q12.f406619b, q12.f406620c);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Q q15 = (Q) it4.next();
                ((y) q15.f406620c).h(map2.get(((q) q15.f406619b).f336877b), dVarB);
            }
            P0.m(dVar2, arrayList);
        }
        return dVar2.b();
    }

    @Y61.k
    public final m g(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends d>> map, @Y61.l String str) {
        K c36264n;
        if (str != null) {
            kotlin.collections.builders.d dVarF = f(zVar, map, str, false);
            a.C10440a c10440a = com.avito.beduin.v2.engine.field.a.f336767b;
            ArrayList arrayList = new ArrayList(dVarF.f406693j);
            Object it = ((kotlin.collections.builders.e) dVarF.entrySet()).iterator();
            while (((d.C11631d) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((d.b) it).next();
                arrayList.add(new Q(((q) entry.getKey()).f336877b, new com.avito.beduin.v2.engine.field.entity.o((K) entry.getValue())));
            }
            return new m((Map<String, ? extends d>) P0.p(arrayList));
        }
        Map<String, f<?>> map2 = this.f336867a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map2.size()));
        Iterator<T> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Object key = entry2.getKey();
            String str2 = (String) entry2.getKey();
            try {
                c36264n = zVar.k(zVar.getF336594a(), str2).h((f) entry2.getValue(), map);
            } catch (Exception e12) {
                c36264n = new C36264n(e.f336775a, new com.avito.beduin.v2.engine.field.entity.i(e12));
            }
            linkedHashMap.put(key, new com.avito.beduin.v2.engine.field.entity.o(c36264n));
        }
        return new m(linkedHashMap);
    }

    @Y61.k
    public final h h() {
        Map<String, f<?>> map = this.f336867a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((f) entry.getValue()).h());
        }
        return linkedHashMap.equals(map) ? this : new h(linkedHashMap);
    }

    public final int hashCode() {
        return this.f336867a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f336867a.toString();
    }

    public h(@Y61.k Q<String, ? extends f<?>>... qArr) {
        this((Map<String, ? extends f<?>>) P0.s(qArr));
    }
}
