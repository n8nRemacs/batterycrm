package Rg;

import Y61.k;
import Y61.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BitArray.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LRg/a;", "", "<init>", "()V", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15039a implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C0970a f14547d = new C0970a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final int[] f14548e = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public int f14550c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public int[] f14549b = f14548e;

    /* compiled from: BitArray.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LRg/a$a;", "", "<init>", "()V", "", "EMPTY_BITS", "[I", "", "LOAD_FACTOR", "F", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rg.a$a, reason: collision with other inner class name */
    public static final class C0970a {
        public /* synthetic */ C0970a(C42822w c42822w) {
            this();
        }

        public C0970a() {
        }
    }

    public final void a(boolean z12) {
        c(this.f14550c + 1);
        if (z12) {
            int[] iArr = this.f14549b;
            int i12 = this.f14550c;
            iArr[i12 / 32] = (1 << (i12 & 31)) | iArr[i12 / 32];
        }
        this.f14550c++;
    }

    public final void b(int i12, int i13) {
        if (i13 < 0 || i13 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i14 = this.f14550c;
        c(i14 + i13);
        for (int i15 = i13 - 1; -1 < i15; i15--) {
            if (((1 << i15) & i12) != 0) {
                int[] iArr = this.f14549b;
                int i16 = i14 / 32;
                iArr[i16] = iArr[i16] | (1 << (i14 & 31));
            }
            i14++;
        }
        this.f14550c = i14;
    }

    public final void c(int i12) {
        if (i12 > this.f14549b.length * 32) {
            int iCeil = (int) Math.ceil(i12 / 0.75f);
            f14547d.getClass();
            int[] iArr = new int[(iCeil + 31) / 32];
            C42756l.p(0, 0, 14, this.f14549b, iArr);
            this.f14549b = iArr;
        }
    }

    @k
    public final Object clone() {
        int[] iArr = (int[]) this.f14549b.clone();
        int i12 = this.f14550c;
        C15039a c15039a = new C15039a();
        c15039a.f14549b = iArr;
        c15039a.f14550c = i12;
        return c15039a;
    }

    public final boolean e(int i12) {
        return ((1 << (i12 & 31)) & this.f14549b[i12 / 32]) != 0;
    }

    public final boolean equals(@l Object obj) {
        if (!(obj instanceof C15039a)) {
            return false;
        }
        C15039a c15039a = (C15039a) obj;
        return this.f14550c == c15039a.f14550c && Arrays.equals(this.f14549b, c15039a.f14549b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14549b) + (this.f14550c * 31);
    }

    public final int i() {
        return (this.f14550c + 7) / 8;
    }

    @k
    public final String toString() {
        int i12 = this.f14550c;
        StringBuilder sb2 = new StringBuilder((i12 / 8) + i12 + 1);
        int i13 = this.f14550c;
        for (int i14 = 0; i14 < i13; i14++) {
            if ((i14 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(e(i14) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
