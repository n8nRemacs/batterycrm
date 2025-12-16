package com.avito.beduin.v2.engine.field;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.z;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Args.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/engine/field/a;", "", "a", "args", "", "Lcom/avito/beduin/v2/engine/field/q;", "Lcom/avito/beduin/v2/engine/core/K;", "Lcom/avito/beduin/v2/engine/field/d;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C10440a f336767b = new C10440a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Map<q, ? extends K<? extends d>> f336768c = P0.c();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<q, K<d>> f336769a;

    /* compiled from: Args.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/a$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.field.a$a, reason: collision with other inner class name */
    public static final class C10440a {
        public /* synthetic */ C10440a(C42822w c42822w) {
            this();
        }

        public C10440a() {
        }
    }

    private /* synthetic */ a(Map map) {
        this.f336769a = map;
    }

    public static final /* synthetic */ a a(Map map) {
        return new a(map);
    }

    @Y61.k
    public static final Map<q, ? extends K<? extends d>> b(Map<q, ? extends K<? extends d>> map, @Y61.k Set<q> set) {
        K<? extends d> k12;
        ArrayList arrayList = new ArrayList();
        for (q qVar : set) {
            if (qVar.f336878c != null) {
                k12 = map.get(qVar);
            } else {
                Object obj = null;
                for (Object obj2 : map.entrySet()) {
                    if (L.f(qVar.f336877b, ((q) ((Map.Entry) obj2).getKey()).f336877b)) {
                        obj = obj2;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                k12 = entry != null ? (K) entry.getValue() : null;
            }
            Q q12 = k12 != null ? new Q(qVar, k12) : null;
            if (q12 != null) {
                arrayList.add(q12);
            }
        }
        return P0.p(arrayList);
    }

    @Y61.k
    public static final m c(@Y61.k z zVar, Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Q(((q) entry.getKey()).f336877b, ((K) entry.getValue()).k(zVar)));
        }
        return new m((Map<String, ? extends d>) P0.p(arrayList));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return L.f(this.f336769a, ((a) obj).f336769a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f336769a.hashCode();
    }

    public final String toString() {
        return "Args(args=" + this.f336769a + ')';
    }
}
