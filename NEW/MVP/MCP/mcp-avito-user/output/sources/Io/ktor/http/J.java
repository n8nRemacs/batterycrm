package io.ktor.http;

import io.ktor.util.z0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Headers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/J;", "Lio/ktor/http/T;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public final class J implements T {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final J f399872c = new J();

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

    @Override // io.ktor.util.z0
    @Y61.l
    public final String get(@Y61.k String str) {
        return null;
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<String> names() {
        return kotlin.collections.B0.f406639b;
    }

    @Y61.k
    public final String toString() {
        return "Headers " + kotlin.collections.B0.f406639b;
    }
}
