package defpackage;

import android.util.ArrayMap;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class cz4 {
    public final long a;
    public final String b;
    public final ReentrantLock c;
    public final ArrayMap d;
    public xi3 e;
    public final yr3 f;
    public final usd g;

    public cz4() {
        int i = s65.d;
        long jH = v9j.h(15, y65.MINUTES);
        this.a = jH;
        this.b = cz4.class.getName();
        this.c = new ReentrantLock();
        this.d = new ArrayMap();
        this.f = new yr3(1, y65.MILLISECONDS);
        this.g = new usd(21);
        if (jH <= 0) {
            throw new IllegalArgumentException(ho7.i("An illegal cache_ttl=", s65.n(jH), " specified").toString());
        }
    }

    public static void c(cz4 cz4Var, l2 l2Var, int i) {
        if ((i & 1) != 0) {
            l2Var = cz4Var.f.X();
        }
        boolean z = (i & 2) == 0;
        int size = cz4Var.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            v67 v67Var = (v67) cz4Var.d.valueAt(i2);
            if (z) {
                v67Var.d = true;
            }
            Iterator it = v67Var.c.iterator();
            while (it.hasNext()) {
                ss7 ss7Var = (ss7) it.next();
                if (ss7Var.b != 0) {
                    ss7Var.d = 0;
                    ss7Var.c = ss7Var.b;
                } else {
                    ss7Var.d = 0;
                    ss7Var.c = 0;
                }
            }
        }
        cz4Var.e = l2Var;
        String str = cz4Var.b;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            n2 n2Var = l2Var.b;
            l6bVar.c(lg8Var, str, "resetHosts, epoch=".concat(s65.n(s65.k(bsi.e(n2Var.d0() - ((Number) ((bwf) n2Var.c).getValue()).longValue(), l2Var.a, (y65) n2Var.b), 0L))), null);
        }
    }

    public final void a(String str, InetAddress inetAddress, boolean z) {
        Object next;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            v67 v67Var = (v67) this.d.get(str);
            if (v67Var != null) {
                Iterator it = v67Var.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((ss7) next).a.equals(inetAddress)) {
                            break;
                        }
                    }
                }
                ss7 ss7Var = (ss7) next;
                if (ss7Var != null) {
                    ss7Var.b--;
                    ss7Var.c++;
                    if (z) {
                        ss7Var.d++;
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(String str, InetAddress inetAddress) {
        Object next;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            v67 v67Var = (v67) this.d.get(str);
            if (v67Var != null) {
                Iterator it = v67Var.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((ss7) next).a.equals(inetAddress)) {
                            break;
                        }
                    }
                }
                ss7 ss7Var = (ss7) next;
                if (ss7Var != null) {
                    ss7Var.b++;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final v32 d(String str) {
        boolean z;
        InetAddress[] inetAddressArr;
        lg8 lg8Var = lg8.d;
        String str2 = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str2, ho7.i("resolveAll, host=", str, " ..."), null);
        }
        this.c.lock();
        try {
            v67 v67Var = (v67) this.d.get(str);
            if (v67Var != null) {
                z = v67Var.d;
                v67Var.d = false;
            } else {
                z = true;
            }
            v32 v32VarE = z ? e(str) : null;
            this.c.lock();
            if (v32VarE != null) {
                try {
                    inetAddressArr = (InetAddress[]) v32VarE.c;
                } finally {
                }
            } else {
                inetAddressArr = null;
            }
            v67 v67VarF = f(str, inetAddressArr);
            InetAddress[] inetAddressArrA = v67VarF != null ? v67VarF.a() : null;
            if (inetAddressArrA == null && !z) {
                String str3 = this.b;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.X;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, str3, ho7.i("resolveAll, addresses not found for ", str, ", refresh cache ..."), null);
                    }
                }
                v32 v32VarE2 = e(str);
                if (v32VarE2 != null) {
                    ReentrantLock reentrantLock = this.c;
                    reentrantLock.lock();
                    try {
                        v67 v67VarF2 = f(str, (InetAddress[]) v32VarE2.c);
                        InetAddress[] inetAddressArrA2 = v67VarF2 != null ? v67VarF2.a() : null;
                        reentrantLock.unlock();
                        v32VarE = v32VarE2;
                        inetAddressArrA = inetAddressArrA2;
                    } finally {
                    }
                } else {
                    inetAddressArrA = null;
                }
            }
            if (inetAddressArrA == null) {
                this.c.lock();
                try {
                    v67 v67Var2 = (v67) this.d.get(str);
                    if (v67Var2 != null) {
                        v67Var2.d = true;
                    }
                    return null;
                } finally {
                }
            }
            long j = v32VarE != null ? v32VarE.b : 0L;
            v32 v32Var = new v32(inetAddressArrA, j);
            String str4 = this.b;
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                l6bVar3.c(lg8Var, str4, ho7.k(wy1.l("resolveAll, ", str, " -> ", Arrays.toString(inetAddressArrA), "/"), j, "ms"), null);
            }
            return v32Var;
        } finally {
        }
    }

    public final v32 e(String str) {
        String str2 = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, wy1.h("retrieveInetAddresses, host=", str), null);
            }
        }
        try {
            return new v32(InetAddress.getAllByName(str), s65.g(this.f.X().a(this.f.X())));
        } catch (IOException e) {
            wqi.e(this.b, "could not get all ip addresses for " + str, e);
            return null;
        } catch (RuntimeException e2) {
            wqi.e(this.b, "could not get all ip addresses for " + str + " due to unexpected failure", e2);
            return null;
        }
    }

    public final v67 f(String str, InetAddress[] inetAddressArr) {
        lg8 lg8Var = lg8.d;
        String str2 = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str2, wy1.h("update, host=", str), null);
        }
        if (inetAddressArr != null) {
            ArrayMap arrayMap = this.d;
            Object v67Var = arrayMap.get(str);
            if (v67Var == null) {
                v67Var = new v67(str);
                arrayMap.put(str, v67Var);
            }
            v67 v67Var2 = (v67) v67Var;
            String str3 = v67Var2.b;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str3, wy1.h("sync, host=", v67Var2.a), null);
            }
            v67Var2.e.ensureCapacity(inetAddressArr.length);
            ArrayList arrayList = v67Var2.e;
            for (InetAddress inetAddress : inetAddressArr) {
                arrayList.add(inetAddress);
            }
            int i = 0;
            while (i < v67Var2.c.size()) {
                int iIndexOf = v67Var2.e.indexOf(((ss7) v67Var2.c.get(i)).a);
                if (iIndexOf == -1) {
                    v67Var2.c.remove(i);
                } else {
                    v67Var2.e.set(iIndexOf, null);
                    i++;
                }
            }
            ArrayList arrayList2 = v67Var2.e;
            ArrayList arrayList3 = v67Var2.c;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                InetAddress inetAddress2 = (InetAddress) it.next();
                ss7 ss7Var = inetAddress2 != null ? new ss7(inetAddress2) : null;
                if (ss7Var != null) {
                    arrayList3.add(ss7Var);
                }
            }
            v67Var2.e.clear();
        }
        l2 l2VarX = this.f.X();
        xi3 xi3Var = this.e;
        if (xi3Var == null || s65.d(l2VarX.a(xi3Var), this.a) > 0) {
            c(this, l2VarX, 2);
        }
        v67 v67Var3 = (v67) this.d.get(str);
        if (v67Var3 == null) {
            return null;
        }
        usd usdVar = this.g;
        ArrayList arrayList4 = v67Var3.c;
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        if (arrayList4 != null) {
            ze3.s((ts7) ((bwf) usdVar.b).getValue(), arrayList4);
        }
        String str4 = this.b;
        l6b l6bVar3 = wqi.a;
        if (l6bVar3 != null) {
            lg8 lg8Var2 = lg8.c;
            if (l6bVar3.b(lg8Var2)) {
                l6bVar3.c(lg8Var2, str4, v67Var3.toString(), null);
            }
        }
        return v67Var3;
    }

    public final void g(String str, InetAddress inetAddress, boolean z) {
        Object next;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            v67 v67Var = (v67) this.d.get(str);
            if (v67Var != null) {
                Iterator it = v67Var.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((ss7) next).a.equals(inetAddress)) {
                            break;
                        }
                    }
                }
                ss7 ss7Var = (ss7) next;
                if (ss7Var != null) {
                    ss7Var.c++;
                    if (z) {
                        ss7Var.d++;
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
