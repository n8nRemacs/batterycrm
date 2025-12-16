package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: Headers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/U;", "Lio/ktor/util/B0;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class U extends io.ktor.util.B0 {
    public U() {
        this(0, 1, null);
    }

    @Override // io.ktor.util.B0
    public final void j(@Y61.k String str) {
        C41519f0.f400005a.getClass();
        int i12 = 0;
        int i13 = 0;
        while (i12 < str.length()) {
            char cCharAt = str.charAt(i12);
            int i14 = i13 + 1;
            if (kotlin.jvm.internal.L.g(cCharAt, 32) <= 0 || C43066x.r("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                StringBuilder sbA = androidx.appcompat.app.r.A("Header name '", str, "' contains illegal character '");
                sbA.append(str.charAt(i13));
                sbA.append("' (code ");
                throw new IllegalHeaderNameException(androidx.appcompat.app.r.t(sbA, str.charAt(i13) & 255, ')'));
            }
            i12++;
            i13 = i14;
        }
    }

    @Override // io.ktor.util.B0
    public final void k(@Y61.k String str) {
        C41519f0.f400005a.getClass();
        int i12 = 0;
        int i13 = 0;
        while (i12 < str.length()) {
            char cCharAt = str.charAt(i12);
            int i14 = i13 + 1;
            if (kotlin.jvm.internal.L.g(cCharAt, 32) < 0 && cCharAt != '\t') {
                StringBuilder sbA = androidx.appcompat.app.r.A("Header value '", str, "' contains illegal character '");
                sbA.append(str.charAt(i13));
                sbA.append("' (code ");
                throw new IllegalHeaderValueException(androidx.appcompat.app.r.t(sbA, str.charAt(i13) & 255, ')'));
            }
            i12++;
            i13 = i14;
        }
    }

    @Y61.k
    public final V l() {
        return new V(true, this.f400385b);
    }

    public U(int i12, int i13, C42822w c42822w) {
        super(true, (i13 & 1) != 0 ? 8 : i12);
    }
}
