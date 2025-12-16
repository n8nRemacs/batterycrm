package io.ktor.client.plugins.json;

import Y61.k;
import io.ktor.http.C41524i;
import io.ktor.http.InterfaceC41526j;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: JsonContentTypeMatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/json/b;", "Lio/ktor/http/j;", "<init>", "()V", "ktor-client-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b implements InterfaceC41526j {
    @Override // io.ktor.http.InterfaceC41526j
    public final boolean a(@k C41524i c41524i) {
        C41524i.a.f400035a.getClass();
        if (C41524i.a.f400036b.b(c41524i)) {
            return true;
        }
        if (!c41524i.f399895b.isEmpty()) {
            c41524i = new C41524i(c41524i.f400033d, c41524i.f400034e, null, 4, null);
        }
        String string = c41524i.toString();
        return C43066x.h0(string, "application/", false) && C43066x.z(string, "+json", false);
    }
}
