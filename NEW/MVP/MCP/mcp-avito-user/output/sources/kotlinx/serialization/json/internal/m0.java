package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: StringJsonLexer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/m0;", "Lkotlinx/serialization/json/internal/a;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m0 extends AbstractC43450a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f413112e;

    public m0(@Y61.k String str) {
        this.f413112e = str;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final boolean A() {
        int iY2 = y();
        String str = this.f413112e;
        if (iY2 == str.length() || iY2 == -1 || str.charAt(iY2) != ',') {
            return false;
        }
        this.f413049a++;
        return true;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final boolean c() {
        int i12 = this.f413049a;
        if (i12 == -1) {
            return false;
        }
        while (true) {
            String str = this.f413112e;
            if (i12 >= str.length()) {
                this.f413049a = i12;
                return false;
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f413049a = i12;
                return !(cCharAt == '}' || cCharAt == ']' || cCharAt == ':' || cCharAt == ',');
            }
            i12++;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    @Y61.k
    public final String e() {
        h('\"');
        int i12 = this.f413049a;
        String str = this.f413112e;
        int iH2 = C43066x.H('\"', i12, 4, str);
        if (iH2 == -1) {
            l();
            r((byte) 1, false);
            throw null;
        }
        for (int i13 = i12; i13 < iH2; i13++) {
            if (str.charAt(i13) == '\\') {
                return k(this.f413049a, i13, str);
            }
        }
        this.f413049a = iH2 + 1;
        return str.substring(i12, iH2);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final byte f() {
        byte bA2;
        do {
            int i12 = this.f413049a;
            if (i12 == -1) {
                return (byte) 10;
            }
            String str = this.f413112e;
            if (i12 >= str.length()) {
                return (byte) 10;
            }
            int i13 = this.f413049a;
            this.f413049a = i13 + 1;
            bA2 = C43451b.a(str.charAt(i13));
        } while (bA2 == 3);
        return bA2;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final void h(char c12) {
        if (this.f413049a == -1) {
            C(c12);
            throw null;
        }
        while (true) {
            int i12 = this.f413049a;
            String str = this.f413112e;
            if (i12 >= str.length()) {
                this.f413049a = -1;
                C(c12);
                throw null;
            }
            int i13 = this.f413049a;
            this.f413049a = i13 + 1;
            char cCharAt = str.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c12) {
                    return;
                }
                C(c12);
                throw null;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final CharSequence t() {
        return this.f413112e;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    @Y61.l
    public final String u(@Y61.k String str, boolean z12) {
        int i12 = this.f413049a;
        try {
            if (f() != 6) {
                return null;
            }
            if (!kotlin.jvm.internal.L.f(w(z12), str)) {
                return null;
            }
            this.f413051c = null;
            if (f() != 5) {
                return null;
            }
            return w(z12);
        } finally {
            this.f413049a = i12;
            this.f413051c = null;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final int x(int i12) {
        if (i12 < this.f413112e.length()) {
            return i12;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final int y() {
        char cCharAt;
        int i12 = this.f413049a;
        if (i12 == -1) {
            return i12;
        }
        while (true) {
            String str = this.f413112e;
            if (i12 >= str.length() || !((cCharAt = str.charAt(i12)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i12++;
        }
        this.f413049a = i12;
        return i12;
    }
}
