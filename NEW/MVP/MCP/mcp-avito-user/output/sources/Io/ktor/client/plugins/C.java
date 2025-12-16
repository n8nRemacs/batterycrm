package io.ktor.client.plugins;

import io.ktor.util.C41586b;
import io.ktor.util.InterfaceC41588c;
import kotlin.Metadata;

/* compiled from: HttpClientPlugin.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C41586b<InterfaceC41588c> f399003a = new C41586b<>("ApplicationPluginRegistry");

    @Y61.k
    public static final <B, F> F a(@Y61.k io.ktor.client.a aVar, @Y61.k A<? extends B, F> a12) {
        F f12 = (F) b(aVar, a12);
        if (f12 != null) {
            return f12;
        }
        throw new IllegalStateException("Plugin " + a12 + " is not installed. Consider using `install(" + a12.getKey() + ")` in client config first.");
    }

    @Y61.l
    public static final <B, F> F b(@Y61.k io.ktor.client.a aVar, @Y61.k A<? extends B, F> a12) {
        InterfaceC41588c interfaceC41588c = (InterfaceC41588c) aVar.f398783j.d(f399003a);
        if (interfaceC41588c != null) {
            return (F) interfaceC41588c.d(a12.getKey());
        }
        return null;
    }
}
