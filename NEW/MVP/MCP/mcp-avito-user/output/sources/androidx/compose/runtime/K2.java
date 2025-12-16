package androidx.compose.runtime;

import androidx.compose.runtime.A;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/K2;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L2 f37997a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final int[] f37998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37999c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object[] f38000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38001e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38002f;

    /* renamed from: g, reason: collision with root package name */
    public int f38003g;

    /* renamed from: h, reason: collision with root package name */
    public int f38004h;

    /* renamed from: i, reason: collision with root package name */
    public int f38005i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final I0 f38006j;

    /* renamed from: k, reason: collision with root package name */
    public int f38007k;

    /* renamed from: l, reason: collision with root package name */
    public int f38008l;

    /* renamed from: m, reason: collision with root package name */
    public int f38009m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f38010n;

    public K2(@Y61.k L2 l22) {
        this.f37997a = l22;
        this.f37998b = l22.f38012b;
        int i12 = l22.f38013c;
        this.f37999c = i12;
        this.f38000d = l22.f38014d;
        this.f38001e = l22.f38015e;
        this.f38004h = i12;
        this.f38005i = -1;
        this.f38006j = new I0();
    }

    @Y61.k
    public final C22068g a(int i12) {
        ArrayList<C22068g> arrayList = this.f37997a.f38020j;
        int iF2 = N2.f(arrayList, i12, this.f37999c);
        if (iF2 >= 0) {
            return arrayList.get(iF2);
        }
        C22068g c22068g = new C22068g(i12);
        arrayList.add(-(iF2 + 1), c22068g);
        return c22068g;
    }

    public final Object b(int i12, int[] iArr) {
        int iBitCount;
        if ((iArr[(i12 * 5) + 1] & 268435456) == 0) {
            A.f37866a.getClass();
            return A.a.f37868b;
        }
        Object[] objArr = this.f38000d;
        int i13 = i12 * 5;
        if (i13 >= iArr.length) {
            iBitCount = iArr.length;
        } else {
            iBitCount = Integer.bitCount(iArr[i13 + 1] >> 29) + iArr[i13 + 4];
        }
        return objArr[iBitCount];
    }

    public final void c() {
        this.f38002f = true;
        L2 l22 = this.f37997a;
        l22.getClass();
        if (this.f37997a != l22 || l22.f38016f <= 0) {
            G.c("Unexpected reader close()");
        }
        l22.f38016f--;
    }

    public final boolean d(int i12) {
        return (this.f37998b[(i12 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f38007k == 0) {
            if (!(this.f38003g == this.f38004h)) {
                G.c("endGroup() not called at the end of a group");
            }
            int i12 = (this.f38005i * 5) + 2;
            int[] iArr = this.f37998b;
            int i13 = iArr[i12];
            this.f38005i = i13;
            int i14 = this.f37999c;
            this.f38004h = i13 < 0 ? i14 : N2.a(i13, iArr) + i13;
            int iB2 = this.f38006j.b();
            if (iB2 < 0) {
                this.f38008l = 0;
                this.f38009m = 0;
            } else {
                this.f38008l = iB2;
                this.f38009m = i13 >= i14 - 1 ? this.f38001e : iArr[((i13 + 1) * 5) + 4];
            }
        }
    }

    @Y61.l
    public final Object f() {
        int i12 = this.f38003g;
        if (i12 < this.f38004h) {
            return b(i12, this.f37998b);
        }
        return 0;
    }

    public final int g() {
        int i12 = this.f38003g;
        if (i12 >= this.f38004h) {
            return 0;
        }
        return this.f37998b[i12 * 5];
    }

    @Y61.l
    public final Object h(int i12, int i13) {
        int[] iArr = this.f37998b;
        int iD2 = N2.d(i12, iArr);
        int i14 = i12 + 1;
        int i15 = iD2 + i13;
        if (i15 < (i14 < this.f37999c ? iArr[(i14 * 5) + 4] : this.f38001e)) {
            return this.f38000d[i15];
        }
        A.f37866a.getClass();
        return A.a.f37868b;
    }

    public final boolean i(int i12) {
        return (this.f37998b[(i12 * 5) + 1] & 536870912) != 0;
    }

    public final boolean j(int i12) {
        return (this.f37998b[(i12 * 5) + 1] & 1073741824) != 0;
    }

    @Y61.l
    public final Object k() {
        int i12;
        if (this.f38007k > 0 || (i12 = this.f38008l) >= this.f38009m) {
            this.f38010n = false;
            A.f37866a.getClass();
            return A.a.f37868b;
        }
        this.f38010n = true;
        this.f38008l = i12 + 1;
        return this.f38000d[i12];
    }

    @Y61.l
    public final Object l(int i12) {
        int i13 = i12 * 5;
        int[] iArr = this.f37998b;
        int i14 = iArr[i13 + 1] & 1073741824;
        if (i14 == 0) {
            return null;
        }
        if (i14 != 0) {
            return this.f38000d[iArr[i13 + 4]];
        }
        A.f37866a.getClass();
        return A.a.f37868b;
    }

    public final int m(int i12) {
        return this.f37998b[(i12 * 5) + 1] & 67108863;
    }

    public final Object n(int i12, int[] iArr) {
        if ((iArr[(i12 * 5) + 1] & 536870912) != 0) {
            return this.f38000d[N2.c(i12, iArr)];
        }
        return null;
    }

    public final int o(int i12) {
        return this.f37998b[(i12 * 5) + 2];
    }

    public final void p(int i12) {
        if (!(this.f38007k == 0)) {
            G.c("Cannot reposition while in an empty region");
        }
        this.f38003g = i12;
        int[] iArr = this.f37998b;
        int i13 = this.f37999c;
        int i14 = i12 < i13 ? iArr[(i12 * 5) + 2] : -1;
        this.f38005i = i14;
        if (i14 < 0) {
            this.f38004h = i13;
        } else {
            this.f38004h = N2.a(i14, iArr) + i14;
        }
        this.f38008l = 0;
        this.f38009m = 0;
    }

    public final int q() {
        if (!(this.f38007k == 0)) {
            G.c("Cannot skip while in an empty region");
        }
        int i12 = this.f38003g;
        int[] iArr = this.f37998b;
        int i13 = (iArr[(i12 * 5) + 1] & 1073741824) == 0 ? iArr[(i12 * 5) + 1] & 67108863 : 1;
        this.f38003g = N2.a(i12, iArr) + i12;
        return i13;
    }

    public final void r() {
        if (!(this.f38007k == 0)) {
            G.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f38003g = this.f38004h;
        this.f38008l = 0;
        this.f38009m = 0;
    }

    public final void s() {
        if (this.f38007k <= 0) {
            int i12 = this.f38005i;
            int i13 = this.f38003g;
            int[] iArr = this.f37998b;
            if (!(iArr[(i13 * 5) + 2] == i12)) {
                P1.a("Invalid slot table detected");
            }
            int i14 = this.f38008l;
            int i15 = this.f38009m;
            I0 i02 = this.f38006j;
            if (i14 == 0 && i15 == 0) {
                i02.c(-1);
            } else {
                i02.c(i14);
            }
            this.f38005i = i13;
            this.f38004h = N2.a(i13, iArr) + i13;
            int i16 = i13 + 1;
            this.f38003g = i16;
            this.f38008l = N2.d(i13, iArr);
            this.f38009m = i13 >= this.f37999c - 1 ? this.f38001e : iArr[(i16 * 5) + 4];
        }
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f38003g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f38005i);
        sb2.append(", end=");
        return androidx.appcompat.app.r.t(sb2, this.f38004h, ')');
    }
}
