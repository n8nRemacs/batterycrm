package com.avito.beduin.v2.interaction.analytics.flow;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.analytics.flow.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: SendAnalyticsEventInteractionFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/interaction/analytics/flow/e;", "LdU0/c;", "<init>", "()V", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final e f337263b = new e();

    /* compiled from: SendAnalyticsEventInteractionFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/interaction/analytics/flow/e$a;", "Lcom/avito/beduin/v2/interaction/analytics/flow/d$a;", "", "", "", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d.a, Map<String, Object>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final kotlin.collections.builders.d f337264b;

        public a(@k kotlin.collections.builders.d dVar) {
            this.f337264b = dVar;
        }

        @Override // java.util.Map
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return this.f337264b.containsKey((String) obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(@l Object obj) {
            if (obj == null) {
                return false;
            }
            return this.f337264b.containsValue(obj);
        }

        @Override // java.util.Map
        public final Set<Map.Entry<String, Object>> entrySet() {
            return this.f337264b.entrySet();
        }

        @Override // java.util.Map
        public final Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return this.f337264b.get((String) obj);
        }

        @Override // java.util.Map
        public final boolean isEmpty() {
            return this.f337264b.isEmpty();
        }

        @Override // java.util.Map
        public final Set<String> keySet() {
            return this.f337264b.keySet();
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object put(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final void putAll(Map<? extends String, ? extends Object> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object putIfAbsent(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final Object remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object replace(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final int size() {
            return this.f337264b.f406693j;
        }

        @Override // java.util.Map
        public final Collection<Object> values() {
            return this.f337264b.values();
        }

        @Override // java.util.Map
        public final boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e() {
        super("SendAnalyticsEvent");
    }

    @Override // dU0.c
    public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
        A a12;
        Integer numS = mVar.s(zVar, "eventId");
        int iIntValue = numS != null ? numS.intValue() : -1;
        Integer numS2 = mVar.s(zVar, "version");
        int iIntValue2 = numS2 != null ? numS2.intValue() : -1;
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        com.avito.beduin.v2.engine.field.d dVarC = mVar.c("params");
        if (dVarC != null && (a12 = dVarC.a(zVar)) != null) {
            Map<String, com.avito.beduin.v2.engine.field.d> map = a12.f336778b.f336870a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((com.avito.beduin.v2.engine.field.d) entry.getValue()).c(zVar));
            }
            dVar.putAll(linkedHashMap);
        }
        G0 g02 = G0.f406611a;
        return new d(iIntValue, iIntValue2, new a(dVar.b()));
    }
}
