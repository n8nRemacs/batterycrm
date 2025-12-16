package io.ktor.http;

import io.ktor.util.z0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Parameters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/K;", "Lio/ktor/http/v0;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class K implements InterfaceC41550v0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final K f399873c = new K();

    @Override // io.ktor.util.z0
    @Y61.l
    public final List<String> a(@Y61.k String str) {
        return null;
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<Map.Entry<String, List<String>>> b() {
        return kotlin.collections.B0.f406639b;
    }

    @Override // io.ktor.util.z0
    public final void c(@Y61.k Y41.p<? super String, ? super List<String>, kotlin.G0> pVar) {
        z0.b.a(this, pVar);
    }

    @Override // io.ktor.util.z0
    /* renamed from: d */
    public final boolean getF400387c() {
        return true;
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof InterfaceC41550v0) && ((InterfaceC41550v0) obj).isEmpty();
    }

    @Override // io.ktor.util.z0
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<String> names() {
        return kotlin.collections.B0.f406639b;
    }

    @Y61.k
    public final String toString() {
        return "Parameters " + kotlin.collections.B0.f406639b;
    }
}
