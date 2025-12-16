package io.ktor.client.plugins.contentnegotiation;

import Y61.k;
import io.ktor.http.C41524i;
import io.ktor.http.InterfaceC41526j;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: JsonContentTypeMatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/contentnegotiation/j;", "Lio/ktor/http/j;", "<init>", "()V", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j implements InterfaceC41526j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final j f399338a = new j();

    @Override // io.ktor.http.InterfaceC41526j
    public final boolean a(@k C41524i c41524i) {
        C41524i.a.f400035a.getClass();
        if (c41524i.b(C41524i.a.f400036b)) {
            return true;
        }
        if (!c41524i.f399895b.isEmpty()) {
            c41524i = new C41524i(c41524i.f400033d, c41524i.f400034e, null, 4, null);
        }
        String string = c41524i.toString();
        return C43066x.h0(string, "application/", false) && C43066x.z(string, "+json", false);
    }
}
