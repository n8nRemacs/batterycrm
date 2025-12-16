package Rg;

import Y61.k;
import Y61.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BitMatrix.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRg/b;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f14551a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14552b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14553c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final int[] f14554d;

    public b(int i12, int i13, int i14, int[] iArr, int i15, C42822w c42822w) {
        i13 = (i15 & 2) != 0 ? i12 : i13;
        i14 = (i15 & 4) != 0 ? (i12 + 31) / 32 : i14;
        iArr = (i15 & 8) != 0 ? new int[i14 * i13] : iArr;
        this.f14551a = i12;
        this.f14552b = i13;
        this.f14553c = i14;
        this.f14554d = iArr;
        if (i12 < 1 || i13 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
    }

    public final void a(int i12, int i13, int i14, int i15) {
        if (i13 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i15 < 1 || i14 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i16 = i14 + i12;
        int i17 = i15 + i13;
        if (i17 > this.f14552b || i16 > this.f14551a) {
            throw new IllegalArgumentException("he region must fit inside the matrix");
        }
        while (i13 < i17) {
            int i18 = this.f14553c * i13;
            for (int i19 = i12; i19 < i16; i19++) {
                int i22 = (i19 / 32) + i18;
                int[] iArr = this.f14554d;
                iArr[i22] = iArr[i22] | (1 << (i19 & 31));
            }
            i13++;
        }
    }

    public final boolean equals(@l Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14551a == bVar.f14551a && this.f14552b == bVar.f14552b && this.f14553c == bVar.f14553c && Arrays.equals(this.f14554d, bVar.f14554d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14554d) + (((((this.f14551a * 31) + this.f14552b) * 31) + this.f14553c) * 31);
    }
}
