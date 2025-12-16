package io.ktor.client.plugins.cookies;

import io.ktor.http.C41530l;
import io.ktor.http.C41542r0;
import io.ktor.http.P0;
import io.ktor.http.T0;
import io.ktor.util.I0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: CookiesStorage.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {
    public static final boolean a(@Y61.k C41530l c41530l, @Y61.k T0 t02) {
        String strH0;
        String str = c41530l.f400047f;
        if (str == null || (strH0 = C43066x.H0(I0.a(str), '.')) == null) {
            throw new IllegalStateException("Domain field should have the default value");
        }
        String strConcat = c41530l.f400048g;
        if (strConcat == null) {
            throw new IllegalStateException("Path field should have the default value");
        }
        if (!C43066x.A(strConcat, '/')) {
            strConcat = strConcat.concat("/");
        }
        String strA = I0.a(t02.f399903b);
        String strConcat2 = (String) t02.f399911j.getValue();
        if (!C43066x.A(strConcat2, '/')) {
            strConcat2 = strConcat2.concat("/");
        }
        if (!strA.equals(strH0) && (C41542r0.f400116a.f400111a.e(strA) || !C43066x.z(strA, ".".concat(strH0), false))) {
            return false;
        }
        if (L.f(strConcat, "/") || L.f(strConcat2, strConcat) || C43066x.h0(strConcat2, strConcat, false)) {
            return !c41530l.f400049h || P0.a(t02.f399902a);
        }
        return false;
    }
}
