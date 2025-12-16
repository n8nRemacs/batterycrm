package io.ktor.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: StringValues.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/H0;", "Lio/ktor/util/z0;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class H0 implements z0 {

    /* compiled from: StringValues.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"io/ktor/util/H0$a", "", "", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Map.Entry<String, List<? extends String>>, Z41.a {
        @Override // java.util.Map.Entry
        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (kotlin.jvm.internal.L.f(entry.getKey(), null) && kotlin.jvm.internal.L.f(entry.getValue(), null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ String getKey() {
            return null;
        }

        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ List<? extends String> getValue() {
            return null;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Y61.k
        public final String toString() {
            return "null=null";
        }
    }

    @Override // io.ktor.util.z0
    @Y61.l
    public final List<String> a(@Y61.k String str) {
        C43066x.C(null, str, false);
        return null;
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<Map.Entry<String, List<String>>> b() {
        return Collections.singleton(new a());
    }

    @Override // io.ktor.util.z0
    public final void c(@Y61.k Y41.p<? super String, ? super List<String>, kotlin.G0> pVar) {
        pVar.invoke(null, null);
    }

    @Override // io.ktor.util.z0
    /* renamed from: d */
    public final boolean getF400387c() {
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (z0Var.getF400387c()) {
            return false;
        }
        return b().equals(z0Var.b());
    }

    @Override // io.ktor.util.z0
    @Y61.l
    public final String get(@Y61.k String str) {
        if (!C43066x.C(str, null, false)) {
            return null;
        }
        C42745f0.G(null);
        throw null;
    }

    public final int hashCode() {
        Set<Map.Entry<String, List<String>>> setB = b();
        return setB.hashCode() + (Boolean.hashCode(false) * 961);
    }

    @Override // io.ktor.util.z0
    public final boolean isEmpty() {
        return false;
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<String> names() {
        return Collections.singleton(null);
    }

    @Y61.k
    public String toString() {
        return "StringValues(case=true) " + b();
    }
}
