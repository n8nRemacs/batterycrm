package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: ReaderJsonLexer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/f0;", "Lkotlinx/serialization/json/internal/a;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f0 extends AbstractC43450a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43473y f413083e;

    /* renamed from: f, reason: collision with root package name */
    public int f413084f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43456g f413085g;

    public f0(InterfaceC43473y interfaceC43473y, char[] cArr, int i12, C42822w c42822w) {
        this(interfaceC43473y, (i12 & 2) != 0 ? C43463n.f413113c.a(Http2.INITIAL_MAX_FRAME_SIZE) : cArr);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final boolean A() {
        int iY2 = y();
        C43456g c43456g = this.f413085g;
        if (iY2 >= c43456g.f413087c || iY2 == -1 || c43456g.f413086b[iY2] != ',') {
            return false;
        }
        this.f413049a++;
        return true;
    }

    public final void D(int i12) {
        C43456g c43456g = this.f413085g;
        char[] cArr = c43456g.f413086b;
        if (i12 != 0) {
            int i13 = this.f413049a;
            C42756l.m(cArr, cArr, 0, i13, i13 + i12);
        }
        int i14 = c43456g.f413087c;
        while (true) {
            if (i12 == i14) {
                break;
            }
            int iA2 = this.f413083e.a(cArr, i12, i14 - i12);
            if (iA2 == -1) {
                c43456g.f413087c = Math.min(c43456g.f413086b.length, i12);
                this.f413084f = -1;
                break;
            }
            i12 += iA2;
        }
        this.f413049a = 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final void b(int i12, int i13) {
        this.f413052d.append(this.f413085g.f413086b, i12, i13 - i12);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final boolean c() {
        n();
        int i12 = this.f413049a;
        while (true) {
            int iX2 = x(i12);
            if (iX2 == -1) {
                this.f413049a = iX2;
                return false;
            }
            char c12 = this.f413085g.f413086b[iX2];
            if (c12 != ' ' && c12 != '\n' && c12 != '\r' && c12 != '\t') {
                this.f413049a = iX2;
                return !(c12 == '}' || c12 == ']' || c12 == ':' || c12 == ',');
            }
            i12 = iX2 + 1;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    @Y61.k
    public final String e() {
        char[] cArr;
        h('\"');
        int i12 = this.f413049a;
        C43456g c43456g = this.f413085g;
        int i13 = c43456g.f413087c;
        int i14 = i12;
        while (true) {
            cArr = c43456g.f413086b;
            if (i14 >= i13) {
                i14 = -1;
                break;
            }
            if (cArr[i14] == '\"') {
                break;
            }
            i14++;
        }
        if (i14 == -1) {
            int iX2 = x(i12);
            if (iX2 != -1) {
                return k(this.f413049a, iX2, c43456g);
            }
            r((byte) 1, true);
            throw null;
        }
        for (int i15 = i12; i15 < i14; i15++) {
            if (cArr[i15] == '\\') {
                return k(this.f413049a, i15, c43456g);
            }
        }
        this.f413049a = i14 + 1;
        return C43066x.p(cArr, i12, Math.min(i14, c43456g.f413087c));
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final byte f() {
        n();
        int i12 = this.f413049a;
        while (true) {
            int iX2 = x(i12);
            if (iX2 == -1) {
                this.f413049a = iX2;
                return (byte) 10;
            }
            int i13 = iX2 + 1;
            byte bA2 = C43451b.a(this.f413085g.f413086b[iX2]);
            if (bA2 != 3) {
                this.f413049a = i13;
                return bA2;
            }
            i12 = i13;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final void n() {
        int i12 = this.f413085g.f413087c - this.f413049a;
        if (i12 > this.f413084f) {
            return;
        }
        D(i12);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final CharSequence t() {
        return this.f413085g;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    @Y61.l
    public final String u(@Y61.k String str, boolean z12) {
        return null;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    public final int x(int i12) {
        C43456g c43456g = this.f413085g;
        if (i12 < c43456g.f413087c) {
            return i12;
        }
        this.f413049a = i12;
        n();
        return (this.f413049a != 0 || c43456g.length() == 0) ? -1 : 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC43450a
    @Y61.k
    public final String z(int i12, int i13) {
        C43456g c43456g = this.f413085g;
        return C43066x.p(c43456g.f413086b, i12, Math.min(i13, c43456g.f413087c));
    }

    public f0(@Y61.k InterfaceC43473y interfaceC43473y, @Y61.k char[] cArr) {
        this.f413083e = interfaceC43473y;
        this.f413084f = 128;
        this.f413085g = new C43456g(cArr);
        D(0);
    }
}
