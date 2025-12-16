package com.avito.beduin.v2.engine.core.manager;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.L;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ChildrenManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/core/manager/c;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f336658a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f336659b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Map<Object, ? extends L> f336660c;

    /* compiled from: ChildrenManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/manager/c$a;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f336661a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Map<Object, L> f336662b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Map<Object, L> f336663c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z12, @l Map<Object, ? extends L> map) {
            this.f336661a = z12;
            this.f336662b = map;
        }

        public final void a(@l String str, @k L l12) {
            Map<Object, L> map = this.f336663c;
            if (map == null || !map.containsKey(str) || this.f336661a) {
                c(str, l12);
                return;
            }
            throw new IllegalArgumentException("Key '" + ((Object) str) + "' has already been declared in the scope");
        }

        @l
        public final L b(@l String str) {
            Map<Object, L> map = this.f336663c;
            if (map != null && map.containsKey(str)) {
                Map<Object, L> map2 = this.f336663c;
                if (map2 != null) {
                    return map2.get(str);
                }
                return null;
            }
            Map<Object, L> map3 = this.f336662b;
            if (map3 == null || !map3.containsKey(str)) {
                return null;
            }
            return map3.get(str);
        }

        public final void c(@l String str, @k L l12) {
            Map<Object, L> linkedHashMap = this.f336663c;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            this.f336663c = linkedHashMap;
            linkedHashMap.put(str, l12);
        }
    }

    public c(InterfaceC36274k interfaceC36274k, boolean z12, boolean z13, int i12, C42822w c42822w) {
        z12 = (i12 & 2) != 0 ? !interfaceC36274k.getF336545b().f336485l : z12;
        z13 = (i12 & 4) != 0 ? interfaceC36274k.getF336545b().f336488o : z13;
        this.f336658a = z12;
        this.f336659b = z13;
    }

    public final void a() {
        Map<Object, ? extends L> map = this.f336660c;
        if (map != null) {
            Iterator<Map.Entry<Object, ? extends L>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().destroy();
            }
        }
        this.f336660c = null;
    }

    public final void b() {
        Map<Object, ? extends L> map = this.f336660c;
        if (map != null) {
            Iterator<Map.Entry<Object, ? extends L>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().j();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@l a aVar) {
        L l12;
        Map<Object, L> map;
        Map<Object, ? extends L> map2 = this.f336660c;
        Map<Object, ? extends L> mapQ = (aVar == null || (map = aVar.f336663c) == null) ? null : P0.q(map);
        if (this.f336659b && map2 != null) {
            for (Map.Entry<Object, ? extends L> entry : map2.entrySet()) {
                Object key = entry.getKey();
                L value = entry.getValue();
                boolean z12 = value instanceof b;
                L l13 = value;
                if (z12) {
                    l13 = ((b) value).f336657b;
                }
                if (mapQ == null || (l12 = mapQ.get(key)) == null) {
                    l12 = null;
                } else if (l12 instanceof b) {
                    l12 = ((b) l12).f336657b;
                }
                if (!kotlin.jvm.internal.L.f(l12, l13)) {
                    l13.j();
                    l13.destroy();
                }
            }
        }
        this.f336660c = mapQ;
    }
}
