package org.joda.time.chrono;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import java.util.Locale;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44868j;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: BasicChronology.java */
/* renamed from: org.joda.time.chrono.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC44859c extends AbstractC44857a {

    /* renamed from: P, reason: collision with root package name */
    public static final org.joda.time.field.m f420568P;

    /* renamed from: Q, reason: collision with root package name */
    public static final org.joda.time.field.q f420569Q;

    /* renamed from: R, reason: collision with root package name */
    public static final org.joda.time.field.q f420570R;

    /* renamed from: S, reason: collision with root package name */
    public static final org.joda.time.field.q f420571S;

    /* renamed from: T, reason: collision with root package name */
    public static final org.joda.time.field.q f420572T;

    /* renamed from: U, reason: collision with root package name */
    public static final org.joda.time.field.q f420573U;

    /* renamed from: V, reason: collision with root package name */
    public static final org.joda.time.field.q f420574V;

    /* renamed from: W, reason: collision with root package name */
    public static final org.joda.time.field.o f420575W;

    /* renamed from: X, reason: collision with root package name */
    public static final org.joda.time.field.o f420576X;

    /* renamed from: Y, reason: collision with root package name */
    public static final org.joda.time.field.o f420577Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final org.joda.time.field.o f420578Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final org.joda.time.field.o f420579a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final org.joda.time.field.o f420580b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final org.joda.time.field.o f420581c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final org.joda.time.field.o f420582d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final org.joda.time.field.y f420583e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final org.joda.time.field.y f420584f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final AbstractC44864f f420585g0;
    private static final long serialVersionUID = 8283225332206808863L;

    /* renamed from: N, reason: collision with root package name */
    public final transient b[] f420586N;

    /* renamed from: O, reason: collision with root package name */
    public final int f420587O;

    /* compiled from: BasicChronology.java */
    /* renamed from: org.joda.time.chrono.c$a */
    public static class a extends org.joda.time.field.o {
        public a() {
            super(AbstractC44865g.f420893o, AbstractC44859c.f420572T, AbstractC44859c.f420573U);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final long H(long j12, String str, Locale locale) {
            String[] strArr = t.b(locale).f420639f;
            int length = strArr.length;
            do {
                length--;
                if (length < 0) {
                    throw new IllegalFieldValueException(AbstractC44865g.f420893o, str);
                }
            } while (!strArr[length].equalsIgnoreCase(str));
            return G(length, j12);
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final String g(int i12, Locale locale) {
            return t.b(locale).f420639f[i12];
        }

        @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
        public final int m(Locale locale) {
            return t.b(locale).f420646m;
        }
    }

    /* compiled from: BasicChronology.java */
    /* renamed from: org.joda.time.chrono.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f420588a;

        /* renamed from: b, reason: collision with root package name */
        public final long f420589b;

        public b(int i12, long j12) {
            this.f420588a = i12;
            this.f420589b = j12;
        }
    }

    static {
        org.joda.time.field.m mVar = org.joda.time.field.m.f420705b;
        f420568P = mVar;
        org.joda.time.field.q qVar = new org.joda.time.field.q(AbstractC44872n.f420939m, 1000L);
        f420569Q = qVar;
        org.joda.time.field.q qVar2 = new org.joda.time.field.q(AbstractC44872n.f420938l, 60000L);
        f420570R = qVar2;
        org.joda.time.field.q qVar3 = new org.joda.time.field.q(AbstractC44872n.f420937k, 3600000L);
        f420571S = qVar3;
        org.joda.time.field.q qVar4 = new org.joda.time.field.q(AbstractC44872n.f420936j, 43200000L);
        f420572T = qVar4;
        org.joda.time.field.q qVar5 = new org.joda.time.field.q(AbstractC44872n.f420935i, 86400000L);
        f420573U = qVar5;
        f420574V = new org.joda.time.field.q(AbstractC44872n.f420934h, 604800000L);
        f420575W = new org.joda.time.field.o(AbstractC44865g.f420903y, mVar, qVar);
        f420576X = new org.joda.time.field.o(AbstractC44865g.f420902x, mVar, qVar5);
        f420577Y = new org.joda.time.field.o(AbstractC44865g.f420901w, qVar, qVar2);
        f420578Z = new org.joda.time.field.o(AbstractC44865g.f420900v, qVar, qVar5);
        f420579a0 = new org.joda.time.field.o(AbstractC44865g.f420899u, qVar2, qVar3);
        f420580b0 = new org.joda.time.field.o(AbstractC44865g.f420898t, qVar2, qVar5);
        org.joda.time.field.o oVar = new org.joda.time.field.o(AbstractC44865g.f420897s, qVar3, qVar5);
        f420581c0 = oVar;
        org.joda.time.field.o oVar2 = new org.joda.time.field.o(AbstractC44865g.f420894p, qVar3, qVar4);
        f420582d0 = oVar2;
        f420583e0 = new org.joda.time.field.y(oVar, AbstractC44865g.f420896r);
        f420584f0 = new org.joda.time.field.y(oVar2, AbstractC44865g.f420895q);
        f420585g0 = new a();
    }

    public AbstractC44859c(AbstractC44857a abstractC44857a, int i12) {
        super(abstractC44857a, null);
        this.f420586N = new b[1024];
        if (i12 < 1 || i12 > 7) {
            throw new IllegalArgumentException(AK.c.g(i12, "Invalid min days in first week: "));
        }
        this.f420587O = i12;
    }

    public static int e0(long j12) {
        long j13;
        if (j12 >= 0) {
            j13 = j12 / 86400000;
        } else {
            j13 = (j12 - 86399999) / 86400000;
            if (j13 < -3) {
                return ((int) ((j13 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j13 + 3) % 7)) + 1;
    }

    public static int q0(long j12) {
        return j12 >= 0 ? (int) (j12 % 86400000) : ((int) ((j12 + 1) % 86400000)) + 86399999;
    }

    public final long A0(int i12) {
        int i13 = i12 & 1023;
        b[] bVarArr = this.f420586N;
        b bVar = bVarArr[i13];
        if (bVar == null || bVar.f420588a != i12) {
            bVar = new b(i12, V(i12));
            bVarArr[i13] = bVar;
        }
        return bVar.f420589b;
    }

    public final long B0(int i12, int i13, int i14) {
        return ((i14 - 1) * 86400000) + A0(i12) + v0(i12, i13);
    }

    public boolean C0(long j12) {
        return false;
    }

    public abstract boolean D0(int i12);

    public abstract long E0(int i12, long j12);

    @Override // org.joda.time.chrono.AbstractC44857a
    public void T(AbstractC44857a.C12206a c12206a) {
        c12206a.f420542a = f420568P;
        c12206a.f420543b = f420569Q;
        c12206a.f420544c = f420570R;
        c12206a.f420545d = f420571S;
        c12206a.f420546e = f420572T;
        c12206a.f420547f = f420573U;
        c12206a.f420548g = f420574V;
        c12206a.f420554m = f420575W;
        c12206a.f420555n = f420576X;
        c12206a.f420556o = f420577Y;
        c12206a.f420557p = f420578Z;
        c12206a.f420558q = f420579a0;
        c12206a.f420559r = f420580b0;
        c12206a.f420560s = f420581c0;
        c12206a.f420562u = f420582d0;
        c12206a.f420561t = f420583e0;
        c12206a.f420563v = f420584f0;
        c12206a.f420564w = f420585g0;
        l lVar = new l(this);
        c12206a.f420537E = lVar;
        v vVar = new v(lVar, this);
        c12206a.f420538F = vVar;
        org.joda.time.field.n nVar = new org.joda.time.field.n(vVar, 99);
        AbstractC44865g abstractC44865g = AbstractC44865g.f420881c;
        org.joda.time.field.i iVar = new org.joda.time.field.i(nVar, nVar.f420691c.x());
        c12206a.f420540H = iVar;
        c12206a.f420552k = iVar.f420697e;
        c12206a.f420539G = new org.joda.time.field.n(new org.joda.time.field.r(iVar), AbstractC44865g.f420884f, 1);
        c12206a.f420541I = new s(this);
        c12206a.f420565x = new r(this, c12206a.f420547f);
        c12206a.f420566y = new C44860d(this, c12206a.f420547f);
        c12206a.f420567z = new C44861e(this, c12206a.f420547f);
        c12206a.f420536D = new u(this, 2);
        c12206a.f420534B = new k(this);
        c12206a.f420533A = new j(this, c12206a.f420548g);
        AbstractC44864f abstractC44864f = c12206a.f420534B;
        AbstractC44871m abstractC44871m = c12206a.f420552k;
        c12206a.f420535C = new org.joda.time.field.n(new org.joda.time.field.r(abstractC44864f, abstractC44871m), AbstractC44865g.f420889k, 1);
        c12206a.f420551j = c12206a.f420537E.k();
        c12206a.f420550i = c12206a.f420536D.k();
        c12206a.f420549h = c12206a.f420534B.k();
    }

    public abstract long V(int i12);

    public abstract long W();

    public abstract long X();

    public abstract long Y();

    public abstract long Z();

    public long a0(int i12, int i13, int i14) {
        org.joda.time.field.j.e(AbstractC44865g.f420885g, i12, r0() - 1, p0() + 1);
        org.joda.time.field.j.e(AbstractC44865g.f420887i, i13, 1, o0());
        int iM02 = m0(i12, i13);
        if (i14 < 1 || i14 > iM02) {
            throw new IllegalFieldValueException(H.j(i12, i13, "year: ", " month: "), Integer.valueOf(i14), Integer.valueOf(iM02));
        }
        long jB02 = B0(i12, i13, i14);
        if (jB02 < 0 && i12 == p0() + 1) {
            return Long.MAX_VALUE;
        }
        if (jB02 <= 0 || i12 != r0() - 1) {
            return jB02;
        }
        return Long.MIN_VALUE;
    }

    public final long b0(int i12, int i13, int i14, int i15) {
        long jA02 = a0(i12, i13, i14);
        if (jA02 == Long.MIN_VALUE) {
            jA02 = a0(i12, i13, i14 + 1);
            i15 -= 86400000;
        }
        long j12 = i15 + jA02;
        if (j12 < 0 && jA02 > 0) {
            return Long.MAX_VALUE;
        }
        if (j12 <= 0 || jA02 >= 0) {
            return j12;
        }
        return Long.MIN_VALUE;
    }

    public final int c0(int i12, int i13, long j12) {
        return ((int) ((j12 - (A0(i12) + v0(i12, i13))) / 86400000)) + 1;
    }

    public int d0(long j12) {
        int iZ02 = z0(j12);
        return c0(iZ02, t0(iZ02, j12), j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC44859c abstractC44859c = (AbstractC44859c) obj;
        return s0() == abstractC44859c.s0() && o().equals(abstractC44859c.o());
    }

    public final int f0(int i12, long j12) {
        return ((int) ((j12 - A0(i12)) / 86400000)) + 1;
    }

    public int g0() {
        return 31;
    }

    public abstract int h0(int i12);

    public int hashCode() {
        return o().hashCode() + (getClass().getName().hashCode() * 11) + s0();
    }

    public int i0(int i12, long j12) {
        int iZ02 = z0(j12);
        return m0(iZ02, t0(iZ02, j12));
    }

    public int k0(int i12) {
        return D0(i12) ? 366 : 365;
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public long l(int i12, int i13, int i14, int i15) {
        AbstractC44854a abstractC44854a = this.f420508b;
        if (abstractC44854a != null) {
            return abstractC44854a.l(i12, i13, i14, i15);
        }
        org.joda.time.field.j.e(AbstractC44865g.f420902x, i15, 0, 86399999);
        return b0(i12, i13, i14, i15);
    }

    public int l0() {
        return 366;
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.chrono.AbstractC44858b, org.joda.time.AbstractC44854a
    public long m(int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC44854a abstractC44854a = this.f420508b;
        if (abstractC44854a != null) {
            return abstractC44854a.m(i12, i13, i14, i15, i16, i17, i18);
        }
        org.joda.time.field.j.e(AbstractC44865g.f420897s, i15, 0, 23);
        org.joda.time.field.j.e(AbstractC44865g.f420899u, i16, 0, 59);
        org.joda.time.field.j.e(AbstractC44865g.f420901w, i17, 0, 59);
        org.joda.time.field.j.e(AbstractC44865g.f420903y, i18, 0, 999);
        return b0(i12, i13, i14, C22026a.a(i17, 1000, (i16 * 60000) + (i15 * Constants.ONE_HOUR), i18));
    }

    public abstract int m0(int i12, int i13);

    public final long n0(int i12) {
        long jA02 = A0(i12);
        return e0(jA02) > 8 - this.f420587O ? ((8 - r8) * 86400000) + jA02 : jA02 - ((r8 - 1) * 86400000);
    }

    @Override // org.joda.time.chrono.AbstractC44857a, org.joda.time.AbstractC44854a
    public AbstractC44868j o() {
        AbstractC44854a abstractC44854a = this.f420508b;
        return abstractC44854a != null ? abstractC44854a.o() : AbstractC44868j.f420911c;
    }

    public int o0() {
        return 12;
    }

    public abstract int p0();

    public abstract int r0();

    public int s0() {
        return this.f420587O;
    }

    public abstract int t0(int i12, long j12);

    @Override // org.joda.time.AbstractC44854a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb2.append(name);
        sb2.append('[');
        AbstractC44868j abstractC44868jO = o();
        if (abstractC44868jO != null) {
            sb2.append(abstractC44868jO.f420915b);
        }
        if (s0() != 4) {
            sb2.append(",mdfw=");
            sb2.append(s0());
        }
        sb2.append(']');
        return sb2.toString();
    }

    public int u0(long j12) {
        return t0(z0(j12), j12);
    }

    public abstract long v0(int i12, int i13);

    public final int w0(int i12, long j12) {
        long jN02 = n0(i12);
        if (j12 < jN02) {
            return x0(i12 - 1);
        }
        if (j12 >= n0(i12 + 1)) {
            return 1;
        }
        return ((int) ((j12 - jN02) / 604800000)) + 1;
    }

    public final int x0(int i12) {
        return (int) ((n0(i12 + 1) - n0(i12)) / 604800000);
    }

    public final int y0(long j12) {
        int iZ02 = z0(j12);
        int iW02 = w0(iZ02, j12);
        return iW02 == 1 ? z0(j12 + 604800000) : iW02 > 51 ? z0(j12 - 1209600000) : iZ02;
    }

    public int z0(long j12) {
        long jZ2 = Z();
        long jW2 = (j12 >> 1) + W();
        if (jW2 < 0) {
            jW2 = (jW2 - jZ2) + 1;
        }
        int i12 = (int) (jW2 / jZ2);
        long jA02 = A0(i12);
        long j13 = j12 - jA02;
        if (j13 < 0) {
            return i12 - 1;
        }
        if (j13 >= 31536000000L) {
            return jA02 + (D0(i12) ? 31622400000L : 31536000000L) <= j12 ? i12 + 1 : i12;
        }
        return i12;
    }
}
