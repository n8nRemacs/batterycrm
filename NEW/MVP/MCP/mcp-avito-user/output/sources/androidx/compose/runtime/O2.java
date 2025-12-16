package androidx.compose.runtime;

import androidx.collection.C20247y0;
import androidx.compose.runtime.A;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/O2;", "", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O2 {

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final a f38067y = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L2 f38068a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public int[] f38069b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object[] f38070c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public ArrayList<C22068g> f38071d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public HashMap<C22068g, E0> f38072e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public androidx.collection.A0<androidx.collection.B0> f38073f;

    /* renamed from: g, reason: collision with root package name */
    public int f38074g;

    /* renamed from: h, reason: collision with root package name */
    public int f38075h;

    /* renamed from: i, reason: collision with root package name */
    public int f38076i;

    /* renamed from: j, reason: collision with root package name */
    public int f38077j;

    /* renamed from: k, reason: collision with root package name */
    public int f38078k;

    /* renamed from: l, reason: collision with root package name */
    public int f38079l;

    /* renamed from: m, reason: collision with root package name */
    public int f38080m;

    /* renamed from: n, reason: collision with root package name */
    public int f38081n;

    /* renamed from: o, reason: collision with root package name */
    public int f38082o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final I0 f38083p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final I0 f38084q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final I0 f38085r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public androidx.collection.A0<androidx.collection.N0<Object>> f38086s;

    /* renamed from: t, reason: collision with root package name */
    public int f38087t;

    /* renamed from: u, reason: collision with root package name */
    public int f38088u;

    /* renamed from: v, reason: collision with root package name */
    public int f38089v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f38090w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public C20247y0 f38091x;

    /* compiled from: SlotTable.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/O2$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List a(O2 o22, int i12, O2 o23, boolean z12, boolean z13, boolean z14) {
            C42784z0 c42784z0;
            boolean zI2;
            int i13;
            C22068g c22068gT;
            int i14;
            int i15;
            int iS2 = o22.s(i12);
            int i16 = i12 + iS2;
            int iF2 = o22.f(o22.q(i12), o22.f38069b);
            int iF3 = o22.f(o22.q(i16), o22.f38069b);
            int i17 = iF3 - iF2;
            boolean z15 = i12 >= 0 && (o22.f38069b[(o22.q(i12) * 5) + 1] & 201326592) != 0;
            o23.u(iS2);
            o23.v(i17, o23.f38087t);
            if (o22.f38074g < i16) {
                o22.z(i16);
            }
            if (o22.f38078k < iF3) {
                o22.A(iF3, i16);
            }
            int[] iArr = o23.f38069b;
            int i18 = o23.f38087t;
            int i19 = i18 * 5;
            C42756l.k(i19, i12 * 5, i16 * 5, o22.f38069b, iArr);
            Object[] objArr = o23.f38070c;
            int i22 = o23.f38076i;
            System.arraycopy(o22.f38070c, iF2, objArr, i22, i17);
            int i23 = o23.f38089v;
            iArr[i19 + 2] = i23;
            int i24 = i18 - i12;
            int i25 = i18 + iS2;
            int iF4 = i22 - o23.f(i18, iArr);
            int i26 = o23.f38080m;
            int i27 = o23.f38079l;
            int length = objArr.length;
            boolean z16 = z15;
            int i28 = i26;
            int i29 = i18;
            while (i29 < i25) {
                if (i29 != i18) {
                    int i32 = (i29 * 5) + 2;
                    iArr[i32] = iArr[i32] + i24;
                }
                int i33 = i18;
                int iF5 = o23.f(i29, iArr) + iF4;
                if (i28 < i29) {
                    i14 = i25;
                    i15 = 0;
                } else {
                    i14 = i25;
                    i15 = o23.f38078k;
                }
                iArr[(i29 * 5) + 4] = O2.h(iF5, i15, i27, length);
                if (i29 == i28) {
                    i28++;
                }
                i29++;
                i25 = i14;
                i18 = i33;
            }
            int i34 = i25;
            o23.f38080m = i28;
            int iB2 = N2.b(o22.f38071d, i12, o22.n());
            int iB3 = N2.b(o22.f38071d, i16, o22.n());
            if (iB2 < iB3) {
                ArrayList<C22068g> arrayList = o22.f38071d;
                ArrayList arrayList2 = new ArrayList(iB3 - iB2);
                for (int i35 = iB2; i35 < iB3; i35++) {
                    C22068g c22068g = arrayList.get(i35);
                    c22068g.f38401a += i24;
                    arrayList2.add(c22068g);
                }
                o23.f38071d.addAll(N2.b(o23.f38071d, o23.f38087t, o23.n()), arrayList2);
                arrayList.subList(iB2, iB3).clear();
                c42784z0 = arrayList2;
            } else {
                c42784z0 = C42784z0.f406748b;
            }
            C42784z0 c42784z02 = c42784z0;
            if (!c42784z02.isEmpty()) {
                HashMap<C22068g, E0> map = o22.f38072e;
                HashMap<C22068g, E0> map2 = o23.f38072e;
                if (map != null && map2 != null) {
                    int size = c42784z02.size();
                    for (int i36 = 0; i36 < size; i36++) {
                        C22068g c22068g2 = (C22068g) c42784z0.get(i36);
                        E0 e02 = map.get(c22068g2);
                        if (e02 != null) {
                            map.remove(c22068g2);
                            map2.put(c22068g2, e02);
                        }
                    }
                }
            }
            int i37 = o23.f38089v;
            E0 e0P = o23.P(i23);
            if (e0P != null) {
                int i38 = i37 + 1;
                int i39 = o23.f38087t;
                int i42 = -1;
                while (i38 < i39) {
                    i42 = i38;
                    i38 = o23.f38069b[(i38 * 5) + 3] + i38;
                }
                ArrayList<Object> arrayList3 = e0P.f37964a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    e0P.f37964a = arrayList3;
                }
                if (i42 < 0 || (c22068gT = o23.T(i42)) == null) {
                    i13 = 0;
                } else {
                    int size2 = arrayList3.size();
                    int i43 = 0;
                    while (i43 < size2) {
                        Object obj = arrayList3.get(i43);
                        if (!kotlin.jvm.internal.L.f(obj, c22068gT)) {
                            int i44 = size2;
                            if (!(obj instanceof E0) || !((E0) obj).a(c22068gT)) {
                                i43++;
                                size2 = i44;
                            }
                        }
                        i13 = i43;
                        break;
                    }
                    i13 = -1;
                }
                arrayList3.add(i13, o23.b(i39));
            }
            int iE2 = o22.E(i12, o22.f38069b);
            if (!z14) {
                zI2 = false;
            } else if (z12) {
                boolean z17 = iE2 >= 0;
                if (z17) {
                    o22.Q();
                    o22.a(iE2 - o22.f38087t);
                    o22.Q();
                }
                o22.a(i12 - o22.f38087t);
                boolean zH2 = o22.H();
                if (z17) {
                    o22.L();
                    o22.i();
                    o22.L();
                    o22.i();
                }
                zI2 = zH2;
            } else {
                zI2 = o22.I(i12, iS2);
                o22.J(iF2, i17, i12 - 1);
            }
            if (zI2) {
                G.c("Unexpectedly removed anchors");
            }
            int i45 = o23.f38082o;
            int i46 = iArr[i19 + 1];
            o23.f38082o = i45 + ((1073741824 & i46) != 0 ? 1 : i46 & 67108863);
            if (z13) {
                o23.f38087t = i34;
                o23.f38076i = i22 + i17;
            }
            if (z16) {
                o23.W(i23);
            }
            return c42784z0;
        }

        public a() {
        }
    }

    public O2(@Y61.k L2 l22) {
        this.f38068a = l22;
        int[] iArr = l22.f38012b;
        this.f38069b = iArr;
        Object[] objArr = l22.f38014d;
        this.f38070c = objArr;
        this.f38071d = l22.f38020j;
        this.f38072e = l22.f38021k;
        this.f38073f = l22.f38022l;
        int i12 = l22.f38013c;
        this.f38074g = i12;
        this.f38075h = (iArr.length / 5) - i12;
        int i13 = l22.f38015e;
        this.f38078k = i13;
        this.f38079l = objArr.length - i13;
        this.f38080m = i12;
        this.f38083p = new I0();
        this.f38084q = new I0();
        this.f38085r = new I0();
        this.f38088u = l22.f38013c;
        this.f38089v = -1;
    }

    public static int h(int i12, int i13, int i14, int i15) {
        return i12 > i13 ? -(((i15 - i14) - i12) + 1) : i12;
    }

    public static void x(O2 o22) {
        int i12 = o22.f38089v;
        int iQ2 = o22.q(i12);
        int[] iArr = o22.f38069b;
        int i13 = (iQ2 * 5) + 1;
        int i14 = iArr[i13];
        if ((i14 & 134217728) != 0) {
            return;
        }
        int i15 = (i14 & (-134217729)) | 134217728;
        iArr[i13] = i15;
        if ((67108864 & i15) != 0) {
            return;
        }
        o22.W(o22.E(i12, iArr));
    }

    public final void A(int i12, int i13) {
        int i14 = this.f38079l;
        int i15 = this.f38078k;
        int i16 = this.f38080m;
        if (i15 != i12) {
            Object[] objArr = this.f38070c;
            if (i12 < i15) {
                System.arraycopy(objArr, i12, objArr, i12 + i14, i15 - i12);
            } else {
                int i17 = i15 + i14;
                System.arraycopy(objArr, i17, objArr, i15, (i12 + i14) - i17);
            }
        }
        int iMin = Math.min(i13 + 1, n());
        if (i16 != iMin) {
            int length = this.f38070c.length - i14;
            if (iMin < i16) {
                int iQ2 = q(iMin);
                int iQ3 = q(i16);
                int i18 = this.f38074g;
                while (iQ2 < iQ3) {
                    int i19 = (iQ2 * 5) + 4;
                    int i22 = this.f38069b[i19];
                    if (!(i22 >= 0)) {
                        G.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f38069b[i19] = -((length - i22) + 1);
                    iQ2++;
                    if (iQ2 == i18) {
                        iQ2 += this.f38075h;
                    }
                }
            } else {
                int iQ4 = q(i16);
                int iQ5 = q(iMin);
                while (iQ4 < iQ5) {
                    int i23 = (iQ4 * 5) + 4;
                    int i24 = this.f38069b[i23];
                    if (!(i24 < 0)) {
                        G.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f38069b[i23] = i24 + length + 1;
                    iQ4++;
                    if (iQ4 == this.f38074g) {
                        iQ4 += this.f38075h;
                    }
                }
            }
            this.f38080m = iMin;
        }
        this.f38078k = i12;
    }

    @Y61.k
    public final List B(@Y61.k C22068g c22068g, @Y61.k O2 o22) {
        if (!(o22.f38081n > 0)) {
            G.c("Check failed");
        }
        if (this.f38081n != 0) {
            G.c("Check failed");
        }
        if (!c22068g.a()) {
            G.c("Check failed");
        }
        int iC2 = c(c22068g) + 1;
        int i12 = this.f38087t;
        if (i12 > iC2 || iC2 >= this.f38088u) {
            G.c("Check failed");
        }
        int iE2 = E(iC2, this.f38069b);
        int iS2 = s(iC2);
        int iD2 = w(iC2) ? 1 : D(iC2);
        f38067y.getClass();
        List listA = a.a(this, iC2, o22, false, false, true);
        W(iE2);
        boolean z12 = iD2 > 0;
        while (iE2 >= i12) {
            int iQ2 = q(iE2);
            int[] iArr = this.f38069b;
            int i13 = iQ2 * 5;
            int i14 = i13 + 3;
            iArr[i14] = iArr[i14] - iS2;
            if (z12) {
                int i15 = iArr[i13 + 1];
                if ((1073741824 & i15) != 0) {
                    z12 = false;
                } else {
                    N2.e(iQ2, (i15 & 67108863) - iD2, iArr);
                }
            }
            iE2 = E(iE2, this.f38069b);
        }
        if (z12) {
            if (this.f38082o < iD2) {
                G.c("Check failed");
            }
            this.f38082o -= iD2;
        }
        return listA;
    }

    @Y61.l
    public final Object C(int i12) {
        int iQ2 = q(i12);
        int[] iArr = this.f38069b;
        if ((iArr[(iQ2 * 5) + 1] & 1073741824) != 0) {
            return this.f38070c[g(f(iQ2, iArr))];
        }
        return null;
    }

    public final int D(int i12) {
        return this.f38069b[(q(i12) * 5) + 1] & 67108863;
    }

    public final int E(int i12, int[] iArr) {
        int i13 = iArr[(q(i12) * 5) + 2];
        return i13 > -2 ? i13 : n() + i13 + 2;
    }

    public final Object F(Object obj) {
        if (this.f38081n > 0) {
            v(1, this.f38089v);
        }
        Object[] objArr = this.f38070c;
        int i12 = this.f38076i;
        this.f38076i = i12 + 1;
        Object obj2 = objArr[g(i12)];
        if (this.f38076i > this.f38077j) {
            G.c("Writing to an invalid slot");
        }
        this.f38070c[g(this.f38076i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i12;
        C20247y0 c20247y0 = this.f38091x;
        if (c20247y0 != null) {
            while (c20247y0.f25545b != 0) {
                int iB2 = S1.b(c20247y0);
                int iQ2 = q(iB2);
                int iS2 = iB2 + 1;
                int iS3 = s(iB2) + iB2;
                while (true) {
                    if (iS2 >= iS3) {
                        i12 = 0;
                        break;
                    } else {
                        if ((this.f38069b[(q(iS2) * 5) + 1] & 201326592) != 0) {
                            i12 = 1;
                            break;
                        }
                        iS2 += s(iS2);
                    }
                }
                int[] iArr = this.f38069b;
                int i13 = (iQ2 * 5) + 1;
                int i14 = iArr[i13];
                if (((67108864 & i14) == 0 ? 0 : 1) != i12) {
                    iArr[i13] = (i12 << 26) | ((-67108865) & i14);
                    int iE2 = E(iB2, iArr);
                    if (iE2 >= 0) {
                        S1.a(c20247y0, iE2);
                    }
                }
            }
        }
    }

    public final boolean H() {
        C22068g c22068gT;
        if (!(this.f38081n == 0)) {
            G.c("Cannot remove group while inserting");
        }
        int i12 = this.f38087t;
        int i13 = this.f38076i;
        int iF2 = f(q(i12), this.f38069b);
        int iK2 = K();
        E0 e0P = P(this.f38089v);
        if (e0P != null && (c22068gT = T(i12)) != null) {
            e0P.c(c22068gT);
        }
        C20247y0 c20247y0 = this.f38091x;
        if (c20247y0 != null) {
            while (true) {
                int i14 = c20247y0.f25545b;
                if (i14 == 0) {
                    break;
                }
                if (i14 == 0) {
                    K.f.c("IntList is empty.");
                    throw null;
                }
                if (c20247y0.f25544a[0] < i12) {
                    break;
                }
                S1.b(c20247y0);
            }
        }
        boolean zI2 = I(i12, this.f38087t - i12);
        J(iF2, this.f38076i - iF2, i12 - 1);
        this.f38087t = i12;
        this.f38076i = i13;
        this.f38082o -= iK2;
        return zI2;
    }

    public final boolean I(int i12, int i13) {
        if (i13 > 0) {
            ArrayList<C22068g> arrayList = this.f38071d;
            z(i12);
            if (!arrayList.isEmpty()) {
                HashMap<C22068g, E0> map = this.f38072e;
                int i14 = i12 + i13;
                int iB2 = N2.b(this.f38071d, i14, m() - this.f38075h);
                if (iB2 >= this.f38071d.size()) {
                    iB2--;
                }
                int i15 = iB2 + 1;
                int i16 = 0;
                while (iB2 >= 0) {
                    C22068g c22068g = this.f38071d.get(iB2);
                    int iC2 = c(c22068g);
                    if (iC2 < i12) {
                        break;
                    }
                    if (iC2 < i14) {
                        c22068g.f38401a = BeduinInputModel.MIN_TEXT_VERSION;
                        if (map != null) {
                            map.remove(c22068g);
                        }
                        if (i16 == 0) {
                            i16 = iB2 + 1;
                        }
                        i15 = iB2;
                    }
                    iB2--;
                }
                z = i15 < i16;
                if (z) {
                    this.f38071d.subList(i15, i16).clear();
                }
            }
            this.f38074g = i12;
            this.f38075h += i13;
            int i17 = this.f38080m;
            if (i17 > i12) {
                this.f38080m = Math.max(i12, i17 - i13);
            }
            int i18 = this.f38088u;
            if (i18 >= this.f38074g) {
                this.f38088u = i18 - i13;
            }
            int i19 = this.f38089v;
            if (i19 >= 0 && (this.f38069b[(q(i19) * 5) + 1] & 67108864) != 0) {
                W(i19);
            }
        }
        return z;
    }

    public final void J(int i12, int i13, int i14) {
        if (i13 > 0) {
            int i15 = this.f38079l;
            int i16 = i12 + i13;
            A(i16, i14);
            this.f38078k = i12;
            this.f38079l = i15 + i13;
            Arrays.fill(this.f38070c, i12, i16, (Object) null);
            int i17 = this.f38077j;
            if (i17 >= i12) {
                this.f38077j = i17 - i13;
            }
        }
    }

    public final int K() {
        int iQ2 = q(this.f38087t);
        int iA2 = N2.a(iQ2, this.f38069b) + this.f38087t;
        this.f38087t = iA2;
        this.f38076i = f(q(iA2), this.f38069b);
        int i12 = this.f38069b[(iQ2 * 5) + 1];
        if ((1073741824 & i12) != 0) {
            return 1;
        }
        return i12 & 67108863;
    }

    public final void L() {
        int i12 = this.f38088u;
        this.f38087t = i12;
        this.f38076i = f(q(i12), this.f38069b);
    }

    public final int M(int i12, int[] iArr) {
        if (i12 >= m()) {
            return this.f38070c.length - this.f38079l;
        }
        int iD2 = N2.d(i12, iArr);
        return iD2 < 0 ? (this.f38070c.length - this.f38079l) + iD2 + 1 : iD2;
    }

    public final int N(int i12, int i13) {
        int iM2 = M(q(i12), this.f38069b);
        int i14 = iM2 + i13;
        if (!(i14 >= iM2 && i14 < f(q(i12 + 1), this.f38069b))) {
            G.c("Write to an invalid slot index " + i13 + " for group " + i12);
        }
        return i14;
    }

    public final int O(int i12) {
        return f(q(s(i12) + i12), this.f38069b);
    }

    public final E0 P(int i12) {
        C22068g c22068gT;
        HashMap<C22068g, E0> map = this.f38072e;
        if (map == null || (c22068gT = T(i12)) == null) {
            return null;
        }
        return map.get(c22068gT);
    }

    public final void Q() {
        if (this.f38081n != 0) {
            G.c("Key must be supplied when inserting");
        }
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        S(0, c1651a, c1651a, false);
    }

    public final void R(int i12, @Y61.l Object obj) {
        A.f37866a.getClass();
        S(i12, obj, A.a.f37868b, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(int i12, Object obj, Object obj2, boolean z12) {
        int i13;
        E0 e0P;
        int i14 = this.f38089v;
        Object[] objArr = this.f38081n > 0;
        this.f38085r.c(this.f38082o);
        A.a aVar = A.f37866a;
        if (objArr == true) {
            int i15 = this.f38087t;
            int iF2 = f(q(i15), this.f38069b);
            u(1);
            this.f38076i = iF2;
            this.f38077j = iF2;
            int iQ2 = q(i15);
            aVar.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            int i16 = obj != c1651a ? 1 : 0;
            int i17 = (z12 || obj2 == c1651a) ? 0 : 1;
            int iH2 = h(iF2, this.f38078k, this.f38079l, this.f38070c.length);
            if (iH2 >= 0 && this.f38080m < i15) {
                iH2 = -(((this.f38070c.length - this.f38079l) - iH2) + 1);
            }
            int[] iArr = this.f38069b;
            int i18 = this.f38089v;
            int i19 = iQ2 * 5;
            iArr[i19] = i12;
            iArr[i19 + 1] = ((z12 ? 1 : 0) << 30) | (i16 << 29) | (i17 << 28);
            iArr[i19 + 2] = i18;
            iArr[i19 + 3] = 0;
            iArr[i19 + 4] = iH2;
            int i22 = (z12 ? 1 : 0) + i16 + i17;
            if (i22 > 0) {
                v(i22, i15);
                Object[] objArr2 = this.f38070c;
                int i23 = this.f38076i;
                if (z12) {
                    objArr2[i23] = obj2;
                    i23++;
                }
                if (i16 != 0) {
                    objArr2[i23] = obj;
                    i23++;
                }
                if (i17 != 0) {
                    objArr2[i23] = obj2;
                    i23++;
                }
                this.f38076i = i23;
            }
            this.f38082o = 0;
            i13 = i15 + 1;
            this.f38089v = i15;
            this.f38087t = i13;
            if (i14 >= 0 && (e0P = P(i14)) != null) {
                E0 e0B = e0P.b();
                C22068g c22068gB = b(i15);
                ArrayList<Object> arrayList = e0B.f37964a;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                e0B.f37964a = arrayList;
                arrayList.add(c22068gB);
            }
        } else {
            this.f38083p.c(i14);
            this.f38084q.c((m() - this.f38075h) - this.f38088u);
            int i24 = this.f38087t;
            int iQ3 = q(i24);
            aVar.getClass();
            if (!kotlin.jvm.internal.L.f(obj2, A.a.f37868b)) {
                if (z12) {
                    X(this.f38087t, obj2);
                } else {
                    V(obj2);
                }
            }
            this.f38076i = M(iQ3, this.f38069b);
            this.f38077j = f(q(this.f38087t + 1), this.f38069b);
            int[] iArr2 = this.f38069b;
            int i25 = iQ3 * 5;
            this.f38082o = iArr2[i25 + 1] & 67108863;
            this.f38089v = i24;
            this.f38087t = i24 + 1;
            i13 = i24 + iArr2[i25 + 3];
        }
        this.f38088u = i13;
    }

    @Y61.l
    public final C22068g T(int i12) {
        ArrayList<C22068g> arrayList;
        int iF2;
        if (i12 < 0 || i12 >= n() || (iF2 = N2.f((arrayList = this.f38071d), i12, n())) < 0) {
            return null;
        }
        return arrayList.get(iF2);
    }

    @Y61.l
    public final void U(@Y61.l Object obj) {
        if (this.f38081n <= 0 || this.f38076i == this.f38078k) {
            F(obj);
            return;
        }
        androidx.collection.A0<androidx.collection.N0<Object>> a02 = this.f38086s;
        if (a02 == null) {
            a02 = new androidx.collection.A0<>(0, 1, null);
        }
        this.f38086s = a02;
        int i12 = this.f38089v;
        androidx.collection.N0<Object> n0B = a02.b(i12);
        if (n0B == null) {
            n0B = new androidx.collection.N0<>(0, 1, null);
            a02.h(i12, n0B);
        }
        n0B.f(obj);
        A.f37866a.getClass();
        A.a aVar = A.a.f37867a;
    }

    public final void V(@Y61.l Object obj) {
        int iQ2 = q(this.f38087t);
        int i12 = (iQ2 * 5) + 1;
        if ((this.f38069b[i12] & 268435456) == 0) {
            G.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f38070c;
        int[] iArr = this.f38069b;
        objArr[g(Integer.bitCount(iArr[i12] >> 29) + f(iQ2, iArr))] = obj;
    }

    public final void W(int i12) {
        if (i12 >= 0) {
            C20247y0 c20247y0 = this.f38091x;
            if (c20247y0 == null) {
                c20247y0 = new C20247y0(0, 1, null);
                this.f38091x = c20247y0;
            }
            S1.a(c20247y0, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.q(r5)
            int[] r1 = r4.f38069b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.G.c(r5)
        L2e:
            java.lang.Object[] r5 = r4.f38070c
            int[] r1 = r4.f38069b
            int r0 = r4.f(r0, r1)
            int r0 = r4.g(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.O2.X(int, java.lang.Object):void");
    }

    public final void a(int i12) {
        boolean z12 = false;
        if (!(i12 >= 0)) {
            G.c("Cannot seek backwards");
        }
        if (!(this.f38081n <= 0)) {
            P1.b("Cannot call seek() while inserting");
        }
        if (i12 == 0) {
            return;
        }
        int i13 = this.f38087t + i12;
        if (i13 >= this.f38089v && i13 <= this.f38088u) {
            z12 = true;
        }
        if (!z12) {
            G.c("Cannot seek outside the current group (" + this.f38089v + '-' + this.f38088u + ')');
        }
        this.f38087t = i13;
        int iF2 = f(q(i13), this.f38069b);
        this.f38076i = iF2;
        this.f38077j = iF2;
    }

    @Y61.k
    public final C22068g b(int i12) {
        ArrayList<C22068g> arrayList = this.f38071d;
        int iF2 = N2.f(arrayList, i12, n());
        if (iF2 >= 0) {
            return arrayList.get(iF2);
        }
        if (i12 > this.f38074g) {
            i12 = -(n() - i12);
        }
        C22068g c22068g = new C22068g(i12);
        arrayList.add(-(iF2 + 1), c22068g);
        return c22068g;
    }

    public final int c(@Y61.k C22068g c22068g) {
        int i12 = c22068g.f38401a;
        return i12 < 0 ? i12 + n() : i12;
    }

    public final void d() {
        int i12 = this.f38081n;
        this.f38081n = i12 + 1;
        if (i12 == 0) {
            this.f38084q.c((m() - this.f38075h) - this.f38088u);
        }
    }

    public final void e(boolean z12) {
        this.f38090w = true;
        if (z12 && this.f38083p.f37980b == 0) {
            z(n());
            A(this.f38070c.length - this.f38079l, this.f38074g);
            int i12 = this.f38078k;
            Arrays.fill(this.f38070c, i12, this.f38079l + i12, (Object) null);
            G();
        }
        int[] iArr = this.f38069b;
        int i13 = this.f38074g;
        Object[] objArr = this.f38070c;
        int i14 = this.f38078k;
        ArrayList<C22068g> arrayList = this.f38071d;
        HashMap<C22068g, E0> map = this.f38072e;
        androidx.collection.A0<androidx.collection.B0> a02 = this.f38073f;
        L2 l22 = this.f38068a;
        l22.getClass();
        if (!l22.f38018h) {
            P1.a("Unexpected writer close()");
        }
        l22.f38018h = false;
        l22.f38012b = iArr;
        l22.f38013c = i13;
        l22.f38014d = objArr;
        l22.f38015e = i14;
        l22.f38020j = arrayList;
        l22.f38021k = map;
        l22.f38022l = a02;
    }

    public final int f(int i12, int[] iArr) {
        if (i12 >= m()) {
            return this.f38070c.length - this.f38079l;
        }
        int i13 = iArr[(i12 * 5) + 4];
        return i13 < 0 ? (this.f38070c.length - this.f38079l) + i13 + 1 : i13;
    }

    public final int g(int i12) {
        return (this.f38079l * (i12 < this.f38078k ? 0 : 1)) + i12;
    }

    public final void i() {
        androidx.collection.N0<Object> n0B;
        boolean z12 = this.f38081n > 0;
        int i12 = this.f38087t;
        int i13 = this.f38088u;
        int i14 = this.f38089v;
        int iQ2 = q(i14);
        int i15 = this.f38082o;
        int i16 = i12 - i14;
        int i17 = iQ2 * 5;
        int i18 = i17 + 1;
        boolean z13 = (this.f38069b[i18] & 1073741824) != 0;
        I0 i02 = this.f38085r;
        if (z12) {
            androidx.collection.A0<androidx.collection.N0<Object>> a02 = this.f38086s;
            if (a02 != null && (n0B = a02.b(i14)) != null) {
                Object[] objArr = n0B.f25659a;
                int i19 = n0B.f25660b;
                for (int i22 = 0; i22 < i19; i22++) {
                    F(objArr[i22]);
                }
                a02.g(i14);
            }
            int[] iArr = this.f38069b;
            iArr[i17 + 3] = i16;
            N2.e(iQ2, i15, iArr);
            int iB2 = i02.b();
            if (z13) {
                i15 = 1;
            }
            this.f38082o = iB2 + i15;
            int iE2 = E(i14, this.f38069b);
            this.f38089v = iE2;
            int iN2 = iE2 < 0 ? n() : q(iE2 + 1);
            int iF2 = iN2 >= 0 ? f(iN2, this.f38069b) : 0;
            this.f38076i = iF2;
            this.f38077j = iF2;
            return;
        }
        if (i12 != i13) {
            G.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f38069b;
        int i23 = i17 + 3;
        int i24 = iArr2[i23];
        int i25 = iArr2[i18] & 67108863;
        iArr2[i23] = i16;
        N2.e(iQ2, i15, iArr2);
        int iB3 = this.f38083p.b();
        this.f38088u = (m() - this.f38075h) - this.f38084q.b();
        this.f38089v = iB3;
        int iE3 = E(i14, this.f38069b);
        int iB4 = i02.b();
        this.f38082o = iB4;
        if (iE3 == iB3) {
            this.f38082o = iB4 + (z13 ? 0 : i15 - i25);
            return;
        }
        int i26 = i16 - i24;
        int i27 = z13 ? 0 : i15 - i25;
        if (i26 != 0 || i27 != 0) {
            while (iE3 != 0 && iE3 != iB3 && (i27 != 0 || i26 != 0)) {
                int iQ3 = q(iE3);
                if (i26 != 0) {
                    int[] iArr3 = this.f38069b;
                    int i28 = (iQ3 * 5) + 3;
                    iArr3[i28] = iArr3[i28] + i26;
                }
                if (i27 != 0) {
                    int[] iArr4 = this.f38069b;
                    N2.e(iQ3, (iArr4[(iQ3 * 5) + 1] & 67108863) + i27, iArr4);
                }
                int[] iArr5 = this.f38069b;
                if ((iArr5[(iQ3 * 5) + 1] & 1073741824) != 0) {
                    i27 = 0;
                }
                iE3 = E(iE3, iArr5);
            }
        }
        this.f38082o += i27;
    }

    public final void j() {
        if (this.f38081n <= 0) {
            P1.b("Unbalanced begin/end insert");
        }
        int i12 = this.f38081n - 1;
        this.f38081n = i12;
        if (i12 == 0) {
            if (this.f38085r.f37980b != this.f38083p.f37980b) {
                G.c("startGroup/endGroup mismatch while inserting");
            }
            this.f38088u = (m() - this.f38075h) - this.f38084q.b();
        }
    }

    public final void k(int i12) {
        boolean z12 = false;
        if (!(this.f38081n <= 0)) {
            G.c("Cannot call ensureStarted() while inserting");
        }
        int i13 = this.f38089v;
        if (i13 != i12) {
            if (i12 >= i13 && i12 < this.f38088u) {
                z12 = true;
            }
            if (!z12) {
                G.c("Started group at " + i12 + " must be a subgroup of the group at " + i13);
            }
            int i14 = this.f38087t;
            int i15 = this.f38076i;
            int i16 = this.f38077j;
            this.f38087t = i12;
            Q();
            this.f38087t = i14;
            this.f38076i = i15;
            this.f38077j = i16;
        }
    }

    public final void l(int i12, int i13, int i14) {
        if (i12 >= this.f38074g) {
            i12 = -((n() - i12) + 2);
        }
        while (i14 < i13) {
            this.f38069b[(q(i14) * 5) + 2] = i12;
            int i15 = this.f38069b[(q(i14) * 5) + 3] + i14;
            l(i14, i15, i14 + 1);
            i14 = i15;
        }
    }

    public final int m() {
        return this.f38069b.length / 5;
    }

    public final int n() {
        return m() - this.f38075h;
    }

    public final int o() {
        return this.f38070c.length - this.f38079l;
    }

    @Y61.l
    public final Object p(int i12) {
        int iQ2 = q(i12);
        int[] iArr = this.f38069b;
        int i13 = (iQ2 * 5) + 1;
        if ((iArr[i13] & 268435456) == 0) {
            A.f37866a.getClass();
            return A.a.f37868b;
        }
        return this.f38070c[Integer.bitCount(iArr[i13] >> 29) + f(iQ2, iArr)];
    }

    public final int q(int i12) {
        return (this.f38075h * (i12 < this.f38074g ? 0 : 1)) + i12;
    }

    @Y61.l
    public final Object r(int i12) {
        int iQ2 = q(i12);
        int[] iArr = this.f38069b;
        if ((iArr[(iQ2 * 5) + 1] & 536870912) != 0) {
            return this.f38070c[N2.c(iQ2, iArr)];
        }
        return null;
    }

    public final int s(int i12) {
        return N2.a(q(i12), this.f38069b);
    }

    public final boolean t(int i12, int i13) {
        int iM2;
        int iS2;
        if (i13 == this.f38089v) {
            iM2 = this.f38088u;
        } else {
            I0 i02 = this.f38083p;
            if (i13 > i02.a(0)) {
                iS2 = s(i13);
            } else {
                int[] iArr = i02.f37979a;
                int iMin = Math.min(iArr.length, i02.f37980b);
                int i14 = 0;
                while (true) {
                    if (i14 >= iMin) {
                        i14 = -1;
                        break;
                    }
                    if (iArr[i14] == i13) {
                        break;
                    }
                    i14++;
                }
                if (i14 < 0) {
                    iS2 = s(i13);
                } else {
                    iM2 = (m() - this.f38075h) - this.f38084q.f37979a[i14];
                }
            }
            iM2 = iS2 + i13;
        }
        return i12 > i13 && i12 < iM2;
    }

    @Y61.k
    public final String toString() {
        return "SlotWriter(current = " + this.f38087t + " end=" + this.f38088u + " size = " + n() + " gap=" + this.f38074g + '-' + (this.f38074g + this.f38075h) + ')';
    }

    public final void u(int i12) {
        if (i12 > 0) {
            int i13 = this.f38087t;
            z(i13);
            int i14 = this.f38074g;
            int i15 = this.f38075h;
            int[] iArr = this.f38069b;
            int length = iArr.length / 5;
            int i16 = length - i15;
            if (i15 < i12) {
                int iMax = Math.max(Math.max(length * 2, i16 + i12), 32);
                int[] iArr2 = new int[iMax * 5];
                int i17 = iMax - i16;
                C42756l.k(0, 0, i14 * 5, iArr, iArr2);
                C42756l.k((i14 + i17) * 5, (i15 + i14) * 5, length * 5, iArr, iArr2);
                this.f38069b = iArr2;
                i15 = i17;
            }
            int i18 = this.f38088u;
            if (i18 >= i14) {
                this.f38088u = i18 + i12;
            }
            int i19 = i14 + i12;
            this.f38074g = i19;
            this.f38075h = i15 - i12;
            int iH2 = h(i16 > 0 ? f(q(i13 + i12), this.f38069b) : 0, this.f38080m >= i14 ? this.f38078k : 0, this.f38079l, this.f38070c.length);
            for (int i22 = i14; i22 < i19; i22++) {
                this.f38069b[(i22 * 5) + 4] = iH2;
            }
            int i23 = this.f38080m;
            if (i23 >= i14) {
                this.f38080m = i23 + i12;
            }
        }
    }

    public final void v(int i12, int i13) {
        if (i12 > 0) {
            A(this.f38076i, i13);
            int i14 = this.f38078k;
            int i15 = this.f38079l;
            if (i15 < i12) {
                Object[] objArr = this.f38070c;
                int length = objArr.length;
                int i16 = length - i15;
                int iMax = Math.max(Math.max(length * 2, i16 + i12), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i17 = 0; i17 < iMax; i17++) {
                    objArr2[i17] = null;
                }
                int i18 = iMax - i16;
                int i19 = i15 + i14;
                System.arraycopy(objArr, 0, objArr2, 0, i14);
                System.arraycopy(objArr, i19, objArr2, i14 + i18, length - i19);
                this.f38070c = objArr2;
                i15 = i18;
            }
            int i22 = this.f38077j;
            if (i22 >= i14) {
                this.f38077j = i22 + i12;
            }
            this.f38078k = i14 + i12;
            this.f38079l = i15 - i12;
        }
    }

    public final boolean w(int i12) {
        return (this.f38069b[(q(i12) * 5) + 1] & 1073741824) != 0;
    }

    @Y61.k
    public final void y(@Y61.k L2 l22, int i12) {
        if (this.f38081n <= 0) {
            G.c("Check failed");
        }
        if (i12 == 0 && this.f38087t == 0 && this.f38068a.f38013c == 0) {
            int[] iArr = l22.f38012b;
            int i13 = iArr[(i12 * 5) + 3];
            int i14 = l22.f38013c;
            if (i13 == i14) {
                int[] iArr2 = this.f38069b;
                Object[] objArr = this.f38070c;
                ArrayList<C22068g> arrayList = this.f38071d;
                HashMap<C22068g, E0> map = this.f38072e;
                androidx.collection.A0<androidx.collection.B0> a02 = this.f38073f;
                Object[] objArr2 = l22.f38014d;
                int i15 = l22.f38015e;
                HashMap<C22068g, E0> map2 = l22.f38021k;
                androidx.collection.A0<androidx.collection.B0> a03 = l22.f38022l;
                this.f38069b = iArr;
                this.f38070c = objArr2;
                this.f38071d = l22.f38020j;
                this.f38074g = i14;
                this.f38075h = (iArr.length / 5) - i14;
                this.f38078k = i15;
                this.f38079l = objArr2.length - i15;
                this.f38080m = i14;
                this.f38072e = map2;
                this.f38073f = a03;
                l22.f38012b = iArr2;
                l22.f38013c = 0;
                l22.f38014d = objArr;
                l22.f38015e = 0;
                l22.f38020j = arrayList;
                l22.f38021k = map;
                l22.f38022l = a02;
                return;
            }
        }
        O2 o2E = l22.e();
        try {
            f38067y.getClass();
            a.a(o2E, i12, this, true, true, false);
            o2E.e(true);
        } catch (Throwable th2) {
            o2E.e(false);
            throw th2;
        }
    }

    public final void z(int i12) {
        C22068g c22068g;
        int i13;
        C22068g c22068g2;
        int i14;
        int i15;
        int i16 = this.f38075h;
        int i17 = this.f38074g;
        if (i17 != i12) {
            if (!this.f38071d.isEmpty()) {
                int iM2 = m() - this.f38075h;
                if (i17 < i12) {
                    for (int iB2 = N2.b(this.f38071d, i17, iM2); iB2 < this.f38071d.size() && (i14 = (c22068g2 = this.f38071d.get(iB2)).f38401a) < 0 && (i15 = i14 + iM2) < i12; iB2++) {
                        c22068g2.f38401a = i15;
                    }
                } else {
                    for (int iB3 = N2.b(this.f38071d, i12, iM2); iB3 < this.f38071d.size() && (i13 = (c22068g = this.f38071d.get(iB3)).f38401a) >= 0; iB3++) {
                        c22068g.f38401a = -(iM2 - i13);
                    }
                }
            }
            if (i16 > 0) {
                int[] iArr = this.f38069b;
                int i18 = i12 * 5;
                int i19 = i16 * 5;
                int i22 = i17 * 5;
                if (i12 < i17) {
                    C42756l.k(i19 + i18, i18, i22, iArr, iArr);
                } else {
                    C42756l.k(i22, i22 + i19, i18 + i19, iArr, iArr);
                }
            }
            if (i12 < i17) {
                i17 = i12 + i16;
            }
            int iM3 = m();
            if (i17 >= iM3) {
                G.c("Check failed");
            }
            while (i17 < iM3) {
                int i23 = (i17 * 5) + 2;
                int i24 = this.f38069b[i23];
                int iN2 = i24 > -2 ? i24 : (n() + i24) - (-2);
                if (iN2 >= i12) {
                    iN2 = -((n() - iN2) - (-2));
                }
                if (iN2 != i24) {
                    this.f38069b[i23] = iN2;
                }
                i17++;
                if (i17 == i12) {
                    i17 += i16;
                }
            }
        }
        this.f38074g = i12;
    }
}
