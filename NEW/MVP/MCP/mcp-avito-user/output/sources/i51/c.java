package I51;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: math.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"LI51/c;", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c implements Comparable<c> {

    /* renamed from: b, reason: collision with root package name */
    public final int f7947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7948c;

    public c(int i12, int i13) {
        this.f7947b = i12;
        this.f7948c = i13;
        if (i13 < 0) {
            throw new IllegalArgumentException(AK.c.g(i13, "Digits must be non-negative, but was ").toString());
        }
    }

    public final int a(int i12) {
        int i13 = this.f7947b;
        int i14 = this.f7948c;
        if (i12 == i14) {
            return i13;
        }
        int[] iArr = f.f7951a;
        return i12 > i14 ? i13 * iArr[i12 - i14] : i13 / iArr[i14 - i12];
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        int iMax = Math.max(this.f7948c, cVar2.f7948c);
        return L.g(a(iMax), cVar2.a(iMax));
    }

    public final boolean equals(@l Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            int iMax = Math.max(this.f7948c, cVar.f7948c);
            if (L.g(a(iMax), cVar.a(iMax)) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i12 = f.f7951a[this.f7948c];
        int i13 = this.f7947b;
        sb2.append(i13 / i12);
        sb2.append('.');
        sb2.append(C43066x.U("1", String.valueOf((i13 % i12) + i12)));
        return sb2.toString();
    }
}
