package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class wai implements vv6, wv6 {
    public final fl d;
    public final cm e;
    public final xpb f;
    public final int i;
    public final hbi j;
    public boolean k;
    public final /* synthetic */ xv6 o;
    public final LinkedList c = new LinkedList();
    public final HashSet g = new HashSet();
    public final HashMap h = new HashMap();
    public final ArrayList l = new ArrayList();
    public es3 m = null;
    public int n = 0;

    public wai(xv6 xv6Var, sv6 sv6Var) {
        this.o = xv6Var;
        Looper looper = xv6Var.w0.getLooper();
        te8 te8VarA = sv6Var.a();
        goh gohVar = new goh((xs) te8VarA.c, (String) te8VarA.a, (String) te8VarA.b);
        pai paiVar = (pai) sv6Var.c.c;
        s5j.g(paiVar);
        fl flVarB = paiVar.b(sv6Var.a, looper, gohVar, sv6Var.d, this, this);
        String str = sv6Var.b;
        if (str != null && (flVarB instanceof a)) {
            ((a) flVarB).B0 = str;
        }
        if (str != null && (flVarB instanceof jia)) {
            u45.r(flVarB);
            throw null;
        }
        this.d = flVarB;
        this.e = sv6Var.e;
        this.f = new xpb(19);
        this.i = sv6Var.g;
        if (!flVarB.j()) {
            this.j = null;
            return;
        }
        Context context = xv6Var.o;
        y1a y1aVar = xv6Var.w0;
        te8 te8VarA2 = sv6Var.a();
        this.j = new hbi(context, y1aVar, new goh((xs) te8VarA2.c, (String) te8VarA2.a, (String) te8VarA2.b));
    }

    @Override // defpackage.vv6
    public final void A(int i) {
        Looper looperMyLooper = Looper.myLooper();
        y1a y1aVar = this.o.w0;
        if (looperMyLooper == y1aVar.getLooper()) {
            f(i);
        } else {
            y1aVar.post(new xk0(this, i, 5));
        }
    }

    public final void a(es3 es3Var) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (syi.c(es3Var, es3.o)) {
                this.d.d();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        s5j.b(this.o.w0);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z) {
        s5j.b(this.o.w0);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zbi zbiVar = (zbi) it.next();
            if (!z || zbiVar.a == 2) {
                if (status != null) {
                    zbiVar.a(status);
                } else {
                    zbiVar.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zbi zbiVar = (zbi) arrayList.get(i);
            if (!this.d.isConnected()) {
                return;
            }
            if (h(zbiVar)) {
                linkedList.remove(zbiVar);
            }
        }
    }

    public final void e() {
        xv6 xv6Var = this.o;
        s5j.b(xv6Var.w0);
        this.m = null;
        a(es3.o);
        y1a y1aVar = xv6Var.w0;
        if (this.k) {
            cm cmVar = this.e;
            y1aVar.removeMessages(11, cmVar);
            y1aVar.removeMessages(9, cmVar);
            this.k = false;
        }
        Iterator it = this.h.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        d();
        g();
    }

    public final void f(int i) {
        xv6 xv6Var = this.o;
        y1a y1aVar = xv6Var.w0;
        s5j.b(xv6Var.w0);
        this.m = null;
        this.k = true;
        String strI = this.d.i();
        xpb xpbVar = this.f;
        xpbVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strI != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strI);
        }
        xpbVar.A(true, new Status(20, sb.toString(), null, null));
        cm cmVar = this.e;
        y1aVar.sendMessageDelayed(Message.obtain(y1aVar, 9, cmVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        y1aVar.sendMessageDelayed(Message.obtain(y1aVar, 11, cmVar), 120000L);
        ((SparseIntArray) xv6Var.Y.b).clear();
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((gbi) it.next()).getClass();
        }
    }

    public final void g() {
        xv6 xv6Var = this.o;
        y1a y1aVar = xv6Var.w0;
        cm cmVar = this.e;
        y1aVar.removeMessages(12, cmVar);
        y1aVar.sendMessageDelayed(y1aVar.obtainMessage(12, cmVar), xv6Var.a);
    }

    public final boolean h(zbi zbiVar) throws Resources.NotFoundException {
        qt5 qt5Var;
        if (!(zbiVar instanceof zai)) {
            xpb xpbVar = this.f;
            fl flVar = this.d;
            zbiVar.d(xpbVar, flVar.j());
            try {
                zbiVar.c(this);
                return true;
            } catch (DeadObjectException unused) {
                A(1);
                flVar.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        zai zaiVar = (zai) zbiVar;
        qt5[] qt5VarArrG = zaiVar.g(this);
        if (qt5VarArrG == null || qt5VarArrG.length == 0) {
            qt5Var = null;
        } else {
            qt5[] qt5VarArrH = this.d.h();
            if (qt5VarArrH == null) {
                qt5VarArrH = new qt5[0];
            }
            us usVar = new us(qt5VarArrH.length);
            for (qt5 qt5Var2 : qt5VarArrH) {
                usVar.put(qt5Var2.a, Long.valueOf(qt5Var2.b()));
            }
            int length = qt5VarArrG.length;
            for (int i = 0; i < length; i++) {
                qt5Var = qt5VarArrG[i];
                Long l = (Long) usVar.get(qt5Var.a);
                if (l == null || l.longValue() < qt5Var.b()) {
                    break;
                }
            }
            qt5Var = null;
        }
        if (qt5Var == null) {
            xpb xpbVar2 = this.f;
            fl flVar2 = this.d;
            zbiVar.d(xpbVar2, flVar2.j());
            try {
                zbiVar.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                A(1);
                flVar2.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.d.getClass().getName() + " could not execute call because it requires feature (" + qt5Var.a + ", " + qt5Var.b() + ").");
        if (!this.o.x0 || !zaiVar.f(this)) {
            zaiVar.b(new UnsupportedApiCallException(qt5Var));
            return true;
        }
        xai xaiVar = new xai(this.e, qt5Var);
        int iIndexOf = this.l.indexOf(xaiVar);
        if (iIndexOf >= 0) {
            xai xaiVar2 = (xai) this.l.get(iIndexOf);
            this.o.w0.removeMessages(15, xaiVar2);
            y1a y1aVar = this.o.w0;
            y1aVar.sendMessageDelayed(Message.obtain(y1aVar, 15, xaiVar2), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        } else {
            this.l.add(xaiVar);
            y1a y1aVar2 = this.o.w0;
            y1aVar2.sendMessageDelayed(Message.obtain(y1aVar2, 15, xaiVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
            y1a y1aVar3 = this.o.w0;
            y1aVar3.sendMessageDelayed(Message.obtain(y1aVar3, 16, xaiVar), 120000L);
            es3 es3Var = new es3(2, null);
            if (!j(es3Var)) {
                this.o.b(es3Var, this.i);
            }
        }
        return false;
    }

    @Override // defpackage.wv6
    public final void i(es3 es3Var) {
        m(es3Var, null);
    }

    public final boolean j(es3 es3Var) {
        synchronized (xv6.A0) {
        }
        return false;
    }

    public final void k() {
        xv6 xv6Var = this.o;
        s5j.b(xv6Var.w0);
        fl flVar = this.d;
        if (flVar.isConnected() || flVar.c()) {
            return;
        }
        try {
            ssb ssbVar = xv6Var.Y;
            Context context = xv6Var.o;
            SparseIntArray sparseIntArray = (SparseIntArray) ssbVar.b;
            s5j.g(context);
            int iG = flVar.g();
            int iC = ((SparseIntArray) ssbVar.b).get(iG, -1);
            if (iC == -1) {
                iC = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iG && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iC == -1) {
                    iC = ((tv6) ssbVar.c).c(context, iG);
                }
                sparseIntArray.put(iG, iC);
            }
            if (iC != 0) {
                es3 es3Var = new es3(iC, null);
                Log.w("GoogleApiManager", "The service for " + flVar.getClass().getName() + " is not available: " + es3Var.toString());
                m(es3Var, null);
                return;
            }
            fo4 fo4Var = new fo4();
            fo4Var.X = xv6Var;
            fo4Var.d = null;
            fo4Var.o = null;
            fo4Var.a = false;
            fo4Var.b = flVar;
            fo4Var.c = this.e;
            if (flVar.j()) {
                hbi hbiVar = this.j;
                s5j.g(hbiVar);
                Handler handler = hbiVar.e;
                goh gohVar = hbiVar.h;
                jze jzeVar = hbiVar.i;
                if (jzeVar != null) {
                    jzeVar.disconnect();
                }
                gohVar.f = Integer.valueOf(System.identityHashCode(hbiVar));
                hbiVar.i = (jze) hbiVar.f.b(hbiVar.d, handler.getLooper(), gohVar, (kze) gohVar.e, hbiVar, hbiVar);
                hbiVar.j = fo4Var;
                Set set = hbiVar.g;
                if (set == null || set.isEmpty()) {
                    handler.post(new thg(10, hbiVar));
                } else {
                    jze jzeVar2 = hbiVar.i;
                    jzeVar2.getClass();
                    jzeVar2.f(new h08(5, jzeVar2));
                }
            }
            try {
                flVar.f(fo4Var);
            } catch (SecurityException e) {
                m(new es3(10), e);
            }
        } catch (IllegalStateException e2) {
            m(new es3(10), e2);
        }
    }

    public final void l(zbi zbiVar) {
        s5j.b(this.o.w0);
        boolean zIsConnected = this.d.isConnected();
        LinkedList linkedList = this.c;
        if (zIsConnected) {
            if (h(zbiVar)) {
                g();
                return;
            } else {
                linkedList.add(zbiVar);
                return;
            }
        }
        linkedList.add(zbiVar);
        es3 es3Var = this.m;
        if (es3Var == null || es3Var.b == 0 || es3Var.c == null) {
            k();
        } else {
            m(es3Var, null);
        }
    }

    public final void m(es3 es3Var, RuntimeException runtimeException) {
        jze jzeVar;
        s5j.b(this.o.w0);
        hbi hbiVar = this.j;
        if (hbiVar != null && (jzeVar = hbiVar.i) != null) {
            jzeVar.disconnect();
        }
        s5j.b(this.o.w0);
        this.m = null;
        ((SparseIntArray) this.o.Y.b).clear();
        a(es3Var);
        if ((this.d instanceof cci) && es3Var.b != 24) {
            xv6 xv6Var = this.o;
            xv6Var.b = true;
            y1a y1aVar = xv6Var.w0;
            y1aVar.sendMessageDelayed(y1aVar.obtainMessage(19), 300000L);
        }
        if (es3Var.b == 4) {
            b(xv6.z0);
            return;
        }
        if (this.c.isEmpty()) {
            this.m = es3Var;
            return;
        }
        if (runtimeException != null) {
            s5j.b(this.o.w0);
            c(null, runtimeException, false);
            return;
        }
        if (!this.o.x0) {
            b(xv6.c(this.e, es3Var));
            return;
        }
        c(xv6.c(this.e, es3Var), null, true);
        if (this.c.isEmpty() || j(es3Var) || this.o.b(es3Var, this.i)) {
            return;
        }
        if (es3Var.b == 18) {
            this.k = true;
        }
        if (!this.k) {
            b(xv6.c(this.e, es3Var));
            return;
        }
        xv6 xv6Var2 = this.o;
        cm cmVar = this.e;
        y1a y1aVar2 = xv6Var2.w0;
        y1aVar2.sendMessageDelayed(Message.obtain(y1aVar2, 9, cmVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
    }

    public final void n(es3 es3Var) {
        s5j.b(this.o.w0);
        fl flVar = this.d;
        flVar.b("onSignInFailed for " + flVar.getClass().getName() + " with " + String.valueOf(es3Var));
        m(es3Var, null);
    }

    public final void o() {
        s5j.b(this.o.w0);
        Status status = xv6.y0;
        b(status);
        this.f.A(false, status);
        for (na8 na8Var : (na8[]) this.h.keySet().toArray(new na8[0])) {
            l(new wbi(na8Var, new n2g()));
        }
        a(new es3(4));
        fl flVar = this.d;
        if (flVar.isConnected()) {
            flVar.e(new znd(this));
        }
    }

    @Override // defpackage.vv6
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        y1a y1aVar = this.o.w0;
        if (looperMyLooper == y1aVar.getLooper()) {
            e();
        } else {
            y1aVar.post(new thg(8, this));
        }
    }
}
