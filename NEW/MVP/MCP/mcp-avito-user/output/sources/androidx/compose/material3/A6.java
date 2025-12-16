package androidx.compose.material3;

import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: DateInput.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/A6;", "Landroidx/compose/ui/text/input/k0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class A6 implements androidx.compose.ui.text.input.k0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final M3 f34465c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34466d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34467e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34468f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f34469g;

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/A6$a", "Landroidx/compose/ui/text/input/L;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.ui.text.input.L {
        public a() {
        }

        @Override // androidx.compose.ui.text.input.L
        public final int a(int i12) {
            A6 a62 = A6.this;
            if (i12 <= a62.f34466d - 1) {
                return i12;
            }
            if (i12 <= a62.f34467e - 1) {
                return i12 - 1;
            }
            int i13 = a62.f34468f;
            return i12 <= i13 + 1 ? i12 - 2 : i13;
        }

        @Override // androidx.compose.ui.text.input.L
        public final int b(int i12) {
            A6 a62 = A6.this;
            if (i12 < a62.f34466d) {
                return i12;
            }
            if (i12 < a62.f34467e) {
                return i12 + 1;
            }
            int i13 = a62.f34468f;
            return i12 <= i13 ? i12 + 2 : i13 + 2;
        }
    }

    public A6(@Y61.k M3 m32) {
        this.f34465c = m32;
        String str = m32.f35104a;
        char c12 = m32.f35105b;
        this.f34466d = C43066x.H(c12, 0, 6, str);
        this.f34467e = C43066x.M(c12, 0, 6, str);
        this.f34468f = m32.f35106c.length();
        this.f34469g = new a();
    }

    @Override // androidx.compose.ui.text.input.k0
    @Y61.k
    public final androidx.compose.ui.text.input.j0 c(@Y61.k C22602e c22602e) {
        int length = c22602e.f42127c.length();
        int i12 = 0;
        String strSubstring = c22602e.f42127c;
        int i13 = this.f34468f;
        if (length > i13) {
            kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, i13);
            strSubstring = strSubstring.substring(lVarR.f406905b, lVarR.f406906c + 1);
        }
        String string = "";
        int i14 = 0;
        while (i12 < strSubstring.length()) {
            int i15 = i14 + 1;
            String str = string + strSubstring.charAt(i12);
            if (i15 == this.f34466d || i14 + 2 == this.f34467e) {
                StringBuilder sbR = androidx.compose.foundation.H.r(str);
                sbR.append(this.f34465c.f35105b);
                string = sbR.toString();
            } else {
                string = str;
            }
            i12++;
            i14 = i15;
        }
        return new androidx.compose.ui.text.input.j0(new C22602e(string, null, null, 6, null), this.f34469g);
    }
}
