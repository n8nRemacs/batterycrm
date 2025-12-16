package io.ktor.client.engine.okhttp;

import io.ktor.http.T;
import io.ktor.util.z0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import okhttp3.Headers;

/* compiled from: OkUtils.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/engine/okhttp/w;", "Lio/ktor/http/T;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class w implements T {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Headers f398986c;

    public w(Headers headers) {
        this.f398986c = headers;
    }

    @Override // io.ktor.util.z0
    @Y61.l
    public final List<String> a(@Y61.k String str) {
        List<String> listValues = this.f398986c.values(str);
        if (listValues.isEmpty()) {
            return null;
        }
        return listValues;
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<Map.Entry<String, List<String>>> b() {
        return this.f398986c.toMultimap().entrySet();
    }

    @Override // io.ktor.util.z0
    public final void c(@Y61.k Y41.p<? super String, ? super List<String>, G0> pVar) {
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
        List<String> listA = a(str);
        if (listA != null) {
            return (String) C42745f0.G(listA);
        }
        return null;
    }

    @Override // io.ktor.util.z0
    @Y61.k
    public final Set<String> names() {
        return this.f398986c.names();
    }
}
