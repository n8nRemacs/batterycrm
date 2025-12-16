package Wg;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ByteMatrix.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWg/b;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wg.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C15761b {

    /* renamed from: a, reason: collision with root package name */
    public final int f18004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final byte[][] f18006c;

    public C15761b(int i12, int i13) {
        this.f18004a = i12;
        this.f18005b = i13;
        byte[][] bArr = new byte[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i14] = new byte[this.f18004a];
        }
        this.f18006c = bArr;
    }

    public final byte a(int i12, int i13) {
        return this.f18006c[i13][i12];
    }

    public final void b(int i12, int i13, int i14) {
        this.f18006c[i13][i12] = (byte) i14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15761b)) {
            return false;
        }
        C15761b c15761b = (C15761b) obj;
        return this.f18004a == c15761b.f18004a && this.f18005b == c15761b.f18005b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18005b) + (Integer.hashCode(this.f18004a) * 31);
    }

    @k
    public final String toString() {
        int i12 = this.f18004a;
        int i13 = this.f18005b;
        StringBuilder sb2 = new StringBuilder((i12 * 2 * i13) + 2);
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr = this.f18006c[i14];
            for (int i15 = 0; i15 < i12; i15++) {
                byte b12 = bArr[i15];
                if (b12 == 0) {
                    sb2.append(" 0");
                } else if (b12 == 1) {
                    sb2.append(" 1");
                } else {
                    sb2.append("  ");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
