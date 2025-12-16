package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.exception.ApiArgumentValidateException;

/* loaded from: classes2.dex */
public final class hwa {
    public static final long[] g = new long[0];
    public final String a = hwa.class.getName();
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final bwf f;

    public hwa(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, bwf bwfVar) {
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        this.f = bwfVar;
    }

    public static long q(hwa hwaVar, sm smVar) {
        m1g m1gVarU = hwaVar.u();
        m1gVarU.getClass();
        return m1g.a(m1gVarU.a, new k1g(smVar, false, false, 0L, 0));
    }

    public static long r(hwa hwaVar, sm smVar) {
        return hwaVar.u().c(smVar, false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public final long A(String str, n10 n10Var) {
        return ((c6i) this.e.getValue()).c(new l92(t().a.k(), str, 0L, n10Var));
    }

    public final long B(boolean z) {
        wqi.c(this.a, "ping, active = " + z + ", current time = " + d8j.a(Long.valueOf(System.currentTimeMillis())), new Object[0]);
        return q(this, new q0c(t().a.k(), z));
    }

    public final long C(String str, String str2, String str3, n10 n10Var, String str4, String str5, long j, int i) {
        return u().c(new abc(t().a.k(), str, str2, str3, j, n10Var, str4, str5, i), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public final long E(long j, long j2, List list, boolean z, int i) {
        mr2 mr2Var = new mr2(t().a.k(), j, j2, 2, list, br2.ADMIN, true, 0, i);
        return z ? u().c(mr2Var, false, 0L, (12 & 8) != 0 ? 0 : 1) : q(this, mr2Var);
    }

    public final Object F(n2 n2Var, Continuation continuation) {
        return u().e(n2Var, continuation);
    }

    public final u2f G(n2 n2Var, j0e j0eVar) {
        u0g u0gVar = (u0g) u().a;
        u0gVar.getClass();
        return new wk3(2, new z9a(u0gVar, 29, n2Var)).i(j0eVar);
    }

    public final long H(boolean z, long j, long j2, long j3, long j4, String str, boolean z2, String str2) {
        wah wahVar = new wah(t().a.k(), j, j2, j3, j4, str, z2, true, str2, false);
        return z ? u().c(wahVar, false, 0L, (12 & 8) != 0 ? 0 : 1) : q(this, wahVar);
    }

    public final long a(long j, long j2, List list, boolean z) {
        if (!j(j)) {
            return 0L;
        }
        return u().c(new mr2(t().a.k(), j, j2, 1, list, br2.MEMBER, z, 0, 0), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public void b(int i, List list) {
        q(this, new fu(i, t().a.k(), ue3.e0(list)));
    }

    public final long c(int i, long[] jArr) {
        return u().c(new pu(i, t().a.k(), jArr), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public final long d(int i, long j) {
        return q(this, new su(i, t().a.k(), j));
    }

    public final long e(long j, long j2, long j3) {
        if (j(j)) {
            return q(this, new yz2(t().a.k(), j, j2, 0, null, false, null, null, null, null, null, null, false, j3));
        }
        return 0L;
    }

    public final long f(long j) {
        return q(this, new rh2(0, t().a.k(), Collections.singletonList(Long.valueOf(j))));
    }

    public final long g(long j, long j2, int i, String str, boolean z, HashMap map) {
        if (j(j)) {
            return q(this, new yz2(t().a.k(), j, j2, i, str, z, null, map, null, null, null, null, false, 0L));
        }
        return 0L;
    }

    public final long h(long j, long j2, String str) {
        if (!j(j)) {
            return 0L;
        }
        return u().c(new yz2(t().a.k(), j, j2, 0, null, false, str, null, null, null, null, null, false, 0L), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public final long i(long j, long j2, String str, String str2, n10 n10Var) {
        if (!j(j)) {
            return 0L;
        }
        return u().c(new yz2(t().a.k(), j, j2, 0, null, false, null, null, str, str2, n10Var, null, false, 0L), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public final boolean j(long j) {
        int iOrdinal;
        if (j != 0 || (iOrdinal = s().ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            wqi.e(this.a, "invalid chat local id", new ApiArgumentValidateException("invalid chat local id"));
            return false;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ApiArgumentValidateException("invalid chat local id");
    }

    public final boolean k(long j) {
        int iOrdinal;
        if (j != 0 || (iOrdinal = s().ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            wqi.e(this.a, "invalid message local id", new ApiArgumentValidateException("invalid message local id"));
            return false;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ApiArgumentValidateException("invalid message local id");
    }

    public final boolean l(long j) {
        int iOrdinal;
        if (j != 0 || (iOrdinal = s().ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            wqi.e(this.a, "invalid message server id", new ApiArgumentValidateException("invalid message server id"));
            return false;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ApiArgumentValidateException("invalid message server id");
    }

    public final long m(long j) {
        if (!j(j)) {
            return 0L;
        }
        return u().c(new bo3(t().a.k(), j, false, null, false, g), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public final long n() {
        return u().c(new bo3(t().a.k(), 0L, true, null, false, g), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public long o(qxg qxgVar) {
        return u().c(new bo3(t().a.k(), 0L, false, qxgVar, false, g), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public final long[] p(List list) {
        if (list.isEmpty()) {
            return qha.c;
        }
        ArrayList arrayListI0 = ue3.i0(list, 100, 100);
        int size = arrayListI0.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = q(this, new ur0(t().a.k(), ue3.e0((List) arrayListI0.get(i)), -1L));
        }
        return jArr;
    }

    public final gwa s() {
        return (gwa) this.f.getValue();
    }

    public final z7c t() {
        return (z7c) this.c.getValue();
    }

    public final m1g u() {
        return (m1g) this.b.getValue();
    }

    public final long v(String str) {
        if (str == null || vmf.F(str)) {
            throw new IllegalArgumentException("link is empty");
        }
        return m1g.b(u(), new i58(t().a.k(), str));
    }

    public final long[] w(long j, long j2, List list, List list2, sj3 sj3Var, boolean z, rs4 rs4Var) {
        int iOrdinal;
        long[] jArr = qha.c;
        if (j(j)) {
            if (list.size() != list2.size() && (iOrdinal = s().ordinal()) != 0) {
                if (iOrdinal == 1) {
                    wqi.e(this.a, "messageIds.size() != messageServerIds.size()", new ApiArgumentValidateException("messageIds.size() != messageServerIds.size()"));
                    return jArr;
                }
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ApiArgumentValidateException("messageIds.size() != messageServerIds.size()");
            }
            if (!list2.isEmpty()) {
                ArrayList arrayListI0 = ue3.i0(list2, 100, 100);
                ArrayList arrayListI02 = ue3.i0(list, 100, 100);
                ArrayList arrayList = new ArrayList(we3.q(arrayListI02, 10));
                Iterator it = arrayListI02.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        ve3.p();
                        throw null;
                    }
                    arrayList.add(Long.valueOf(u().c(new o4a(t().a.k(), j, j2, (List) next, (List) arrayListI0.get(i), sj3Var, z, rs4Var, false), false, 0L, (12 & 8) != 0 ? 0 : 1)));
                    i = i2;
                }
                return ue3.e0(arrayList);
            }
        }
        return jArr;
    }

    public final long x(long j, long j2, long j3, long j4, String str, String str2, jm9 jm9Var, List list, boolean z, List list2) {
        if (!j(j) || !k(j2) || !l(j4)) {
            return 0L;
        }
        return u().c(new u4a(t().a.k(), j, j2, j3, j4, str, str2, jm9Var, list, list2, z), false, 0L, (12 & 8) != 0 ? 0 : 1);
    }

    public final long y(long j, List list) {
        return q(this, new ur0(2, t().a.k(), j, list));
    }

    public final long z(long j, long j2, long j3, long j4, String str, vl9 vl9Var) {
        int iOrdinal;
        if (!j(j) || !k(j2) || !l(j4)) {
            return 0L;
        }
        if (str.length() > 0 || (iOrdinal = s().ordinal()) == 0) {
            return u().c(new j5a(t().a.k(), j, j2, j3, j4, new ql9(vl9Var, str)), false, 0L, (12 & 8) != 0 ? 0 : 1);
        }
        if (iOrdinal == 1) {
            wqi.e(this.a, "reaction can't be empty", new ApiArgumentValidateException("reaction can't be empty"));
            return 0L;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ApiArgumentValidateException("reaction can't be empty");
    }
}
