package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: GapBuffer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/C0;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C0 implements CharSequence {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public CharSequence f30788b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public P f30789c;

    /* renamed from: d, reason: collision with root package name */
    public int f30790d;

    /* renamed from: e, reason: collision with root package name */
    public int f30791e;

    /* compiled from: GapBuffer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/C0$a;", "", "<init>", "()V", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public final void a(int i12, int i13, @Y61.k CharSequence charSequence, int i14, int i15) {
        if (i12 > i13) {
            androidx.compose.foundation.internal.e.a("start=" + i12 + " > end=" + i13);
        }
        if (i14 > i15) {
            androidx.compose.foundation.internal.e.a("textStart=" + i14 + " > textEnd=" + i15);
        }
        if (i12 < 0) {
            androidx.compose.foundation.internal.e.a("start must be non-negative, but was " + i12);
        }
        if (i14 < 0) {
            androidx.compose.foundation.internal.e.a("textStart must be non-negative, but was " + i14);
        }
        P p12 = this.f30789c;
        int i16 = i15 - i14;
        if (p12 == null) {
            int iMax = Math.max(255, i16 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i12, 64);
            int iMin2 = Math.min(this.f30788b.length() - i13, 64);
            int i17 = i12 - iMin;
            r1.a(this.f30788b, cArr, 0, i17, i12);
            int i18 = iMax - iMin2;
            int i19 = iMin2 + i13;
            r1.a(this.f30788b, cArr, i18, i13, i19);
            r1.a(charSequence, cArr, iMin, i14, i15);
            P p13 = new P();
            p13.f30890a = iMax;
            p13.f30891b = cArr;
            p13.f30892c = iMin + i16;
            p13.f30893d = i18;
            this.f30789c = p13;
            this.f30790d = i17;
            this.f30791e = i19;
            return;
        }
        int i22 = this.f30790d;
        int i23 = i12 - i22;
        int i24 = i13 - i22;
        if (i23 < 0 || i24 > p12.f30890a - p12.a()) {
            this.f30788b = toString();
            this.f30789c = null;
            this.f30790d = -1;
            this.f30791e = -1;
            a(i12, i13, charSequence, i14, i15);
            return;
        }
        int i25 = i16 - (i24 - i23);
        if (i25 > p12.a()) {
            int iA2 = i25 - p12.a();
            int i26 = p12.f30890a;
            do {
                i26 *= 2;
            } while (i26 - p12.f30890a < iA2);
            char[] cArr2 = new char[i26];
            C42756l.m(p12.f30891b, cArr2, 0, 0, p12.f30892c);
            int i27 = p12.f30890a;
            int i28 = p12.f30893d;
            int i29 = i27 - i28;
            int i32 = i26 - i29;
            C42756l.m(p12.f30891b, cArr2, i32, i28, i29 + i28);
            p12.f30891b = cArr2;
            p12.f30890a = i26;
            p12.f30893d = i32;
        }
        int i33 = p12.f30892c;
        if (i23 < i33 && i24 <= i33) {
            int i34 = i33 - i24;
            char[] cArr3 = p12.f30891b;
            C42756l.m(cArr3, cArr3, p12.f30893d - i34, i24, i33);
            p12.f30892c = i23;
            p12.f30893d -= i34;
        } else if (i23 >= i33 || i24 < i33) {
            int iA3 = i23 + p12.a();
            int iA4 = i24 + p12.a();
            int i35 = p12.f30893d;
            char[] cArr4 = p12.f30891b;
            C42756l.m(cArr4, cArr4, p12.f30892c, i35, iA3);
            p12.f30892c += iA3 - i35;
            p12.f30893d = iA4;
        } else {
            p12.f30893d = i24 + p12.a();
            p12.f30892c = i23;
        }
        r1.a(charSequence, p12.f30891b, p12.f30892c, i14, i15);
        p12.f30892c += i16;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        P p12 = this.f30789c;
        if (p12 == null) {
            return this.f30788b.charAt(i12);
        }
        if (i12 < this.f30790d) {
            return this.f30788b.charAt(i12);
        }
        int iA2 = p12.f30890a - p12.a();
        int i13 = this.f30790d;
        if (i12 >= iA2 + i13) {
            return this.f30788b.charAt(i12 - ((iA2 - this.f30791e) + i13));
        }
        int i14 = i12 - i13;
        int i15 = p12.f30892c;
        return i14 < i15 ? p12.f30891b[i14] : p12.f30891b[(i14 - i15) + p12.f30893d];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        P p12 = this.f30789c;
        if (p12 == null) {
            return this.f30788b.length();
        }
        return (p12.f30890a - p12.a()) + (this.f30788b.length() - (this.f30791e - this.f30790d));
    }

    @Override // java.lang.CharSequence
    @Y61.k
    public final CharSequence subSequence(int i12, int i13) {
        return toString().subSequence(i12, i13);
    }

    @Override // java.lang.CharSequence
    @Y61.k
    public final String toString() {
        P p12 = this.f30789c;
        if (p12 == null) {
            return this.f30788b.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30788b, 0, this.f30790d);
        sb2.append(p12.f30891b, 0, p12.f30892c);
        char[] cArr = p12.f30891b;
        int i12 = p12.f30893d;
        sb2.append(cArr, i12, p12.f30890a - i12);
        CharSequence charSequence = this.f30788b;
        sb2.append(charSequence, this.f30791e, charSequence.length());
        return sb2.toString();
    }
}
