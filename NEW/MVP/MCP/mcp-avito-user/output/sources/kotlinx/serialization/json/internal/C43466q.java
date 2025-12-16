package kotlinx.serialization.json.internal;

import kotlin.Metadata;

/* compiled from: Composers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/q;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43466q {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final T f413124a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f413125b = true;

    public C43466q(@Y61.k T t12) {
        this.f413124a = t12;
    }

    public void a() {
        this.f413125b = true;
    }

    public void b() {
        this.f413125b = false;
    }

    public void c() {
        this.f413125b = false;
    }

    public void d(byte b12) {
        this.f413124a.d(b12);
    }

    public final void e(char c12) {
        T t12 = this.f413124a;
        t12.a(t12.f413024b, 1);
        char[] cArr = t12.f413023a;
        int i12 = t12.f413024b;
        t12.f413024b = i12 + 1;
        cArr[i12] = c12;
    }

    public void f(int i12) {
        this.f413124a.d(i12);
    }

    public void g(long j12) {
        this.f413124a.d(j12);
    }

    public final void h(@Y61.k String str) {
        this.f413124a.c(str);
    }

    public void i(short s5) {
        this.f413124a.d(s5);
    }

    public void j(@Y61.k String str) {
        byte b12;
        T t12 = this.f413124a;
        t12.a(t12.f413024b, str.length() + 2);
        char[] cArr = t12.f413023a;
        int i12 = t12.f413024b;
        int i13 = i12 + 1;
        cArr[i12] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i13);
        int i14 = length + i13;
        int i15 = i13;
        while (i15 < i14) {
            char c12 = cArr[i15];
            byte[] bArr = n0.f413115b;
            if (c12 < bArr.length && bArr[c12] != 0) {
                int length2 = str.length();
                for (int i16 = i15 - i13; i16 < length2; i16++) {
                    t12.a(i15, 2);
                    char cCharAt = str.charAt(i16);
                    byte[] bArr2 = n0.f413115b;
                    if (cCharAt >= bArr2.length || (b12 = bArr2[cCharAt]) == 0) {
                        int i17 = i15 + 1;
                        t12.f413023a[i15] = cCharAt;
                        i15 = i17;
                    } else {
                        if (b12 == 1) {
                            String str2 = n0.f413114a[cCharAt];
                            t12.a(i15, str2.length());
                            str2.getChars(0, str2.length(), t12.f413023a, i15);
                            int length3 = str2.length() + i15;
                            t12.f413024b = length3;
                            i15 = length3;
                        } else {
                            char[] cArr2 = t12.f413023a;
                            cArr2[i15] = '\\';
                            cArr2[i15 + 1] = (char) b12;
                            i15 += 2;
                            t12.f413024b = i15;
                        }
                    }
                }
                t12.a(i15, 1);
                t12.f413023a[i15] = '\"';
                t12.f413024b = i15 + 1;
                return;
            }
            i15++;
        }
        cArr[i14] = '\"';
        t12.f413024b = i14 + 1;
    }

    public void k() {
    }

    public void l() {
    }
}
