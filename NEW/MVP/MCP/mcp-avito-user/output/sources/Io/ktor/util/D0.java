package io.ktor.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: StringValues.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/D0;", "Lio/ktor/util/z0;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class D0 implements z0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f400387c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, List<String>> f400388d;

    /* JADX WARN: Multi-variable type inference failed */
    public D0() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // io.ktor.util.z0
    @Y61.l
    public final List<String> a(@Y61.k String str) {
        return this.f400388d.get(str);
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<Map.Entry<String, List<String>>> b() {
        return Collections.unmodifiableSet(this.f400388d.entrySet());
    }

    @Override // io.ktor.util.z0
    public final void c(@Y61.k Y41.p<? super String, ? super List<String>, kotlin.G0> pVar) {
        for (Map.Entry<String, List<String>> entry : this.f400388d.entrySet()) {
            pVar.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.ktor.util.z0
    /* renamed from: d, reason: from getter */
    public final boolean getF400387c() {
        return this.f400387c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f400387c != z0Var.getF400387c()) {
            return false;
        }
        return b().equals(z0Var.b());
    }

    @Override // io.ktor.util.z0
    @Y61.l
    public final String get(@Y61.k String str) {
        List<String> list = this.f400388d.get(str);
        if (list != null) {
            return (String) C42745f0.G(list);
        }
        return null;
    }

    public final int hashCode() {
        Set<Map.Entry<String, List<String>>> setB = b();
        return setB.hashCode() + (Boolean.hashCode(this.f400387c) * 961);
    }

    @Override // io.ktor.util.z0
    public final boolean isEmpty() {
        return this.f400388d.isEmpty();
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<String> names() {
        return Collections.unmodifiableSet(this.f400388d.keySet());
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StringValues(case=");
        sb2.append(!this.f400387c);
        sb2.append(") ");
        sb2.append(b());
        return sb2.toString();
    }

    public D0(boolean z12, @Y61.k Map<String, ? extends List<String>> map) {
        this.f400387c = z12;
        Map c41613u = z12 ? new C41613u() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(value.get(i12));
            }
            c41613u.put(key, arrayList);
        }
        this.f400388d = c41613u;
    }

    public /* synthetic */ D0(boolean z12, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? P0.c() : map);
    }
}
