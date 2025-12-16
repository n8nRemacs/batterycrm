package io.ktor.client;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: HttpClientJvm.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final List<g> f398994a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.client.engine.k<?> f398995b;

    static {
        io.ktor.client.engine.k<?> kVarA;
        List<g> listM0 = C42745f0.M0(ServiceLoader.load(g.class, g.class.getClassLoader()));
        f398994a = listM0;
        g gVar = (g) C42745f0.G(listM0);
        if (gVar == null || (kVarA = gVar.a()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation in the classpath: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        f398995b = kVarA;
    }
}
