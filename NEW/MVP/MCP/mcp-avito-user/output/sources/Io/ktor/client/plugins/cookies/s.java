package io.ktor.client.plugins.cookies;

import androidx.compose.ui.platform.C22491k0;
import io.ktor.http.C41508b;
import io.ktor.http.C41530l;
import io.ktor.http.C41536o;
import io.ktor.util.C41596g;
import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.S;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import kotlin.text.C43066x;

/* compiled from: HttpCookies.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class s extends H implements Y41.l<C41530l, String> {

    /* renamed from: b, reason: collision with root package name */
    public static final s f399402b = new s();

    public s() {
        super(1, C41536o.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
    }

    @Override // Y41.l
    public final String invoke(C41530l c41530l) {
        C41530l c41530l2 = c41530l;
        Set<String> set = C41536o.f400095a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c41530l2.f400042a);
        sb2.append('=');
        int iOrdinal = c41530l2.f400044c.ordinal();
        String strA = c41530l2.f400043b;
        int i12 = 0;
        if (iOrdinal == 0) {
            while (i12 < strA.length()) {
                if (C41536o.b(strA.charAt(i12))) {
                    throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in RAW format.  Consider URL_ENCODING mode");
                }
                i12++;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                strA = C41508b.f(strA, true);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int[] iArr = C41596g.f400463a;
                C41640m c41640m = new C41640m(null, 1, null);
                try {
                    S.d(c41640m, strA);
                    strA = C41596g.b(S.b(c41640m.y()));
                } catch (Throwable th2) {
                    c41640m.close();
                    throw th2;
                }
            }
        } else {
            if (C43066x.r(strA, '\"')) {
                throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
            }
            while (true) {
                if (i12 >= strA.length()) {
                    break;
                }
                if (C41536o.b(strA.charAt(i12))) {
                    strA = C22491k0.a('\"', "\"", strA);
                    break;
                }
                i12++;
            }
        }
        sb2.append(strA);
        return sb2.toString();
    }
}
