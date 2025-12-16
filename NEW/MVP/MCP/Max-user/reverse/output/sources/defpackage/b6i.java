package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class b6i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object o;

    public /* synthetic */ b6i(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.o = obj4;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        r5i r5iVarP;
        String str;
        cji cjiVarJ;
        int i2 = 0;
        switch (this.a) {
            case 0:
                yi5 yi5Var = (yi5) this.o;
                k18 k18Var = (k18) this.c;
                hge hgeVar = (hge) this.b;
                wqi.c("c6i", "set beans for task = %s", hgeVar);
                hgeVar.a = (ige) ((k18) this.d).getValue();
                try {
                    wqi.c("c6i", "start processing task = %s", hgeVar);
                    hgeVar.u();
                    wqi.c("c6i", "finished processing task = %s", hgeVar);
                    return;
                } catch (Exception e) {
                    wqi.b("c6i", "exception = " + e.getMessage() + ", task = " + hgeVar, e);
                    y3b y3bVar = (y3b) yi5Var;
                    y3bVar.a(new IllegalStateException("exception = " + e.getMessage() + ", task = " + hgeVar, e));
                    hgeVar.t();
                    if (hgeVar instanceof tsb) {
                        tsb tsbVar = (tsb) hgeVar;
                        ((a3g) k18Var.getValue()).c(tsbVar.getId());
                        r2g r2gVarJ = ((a3g) k18Var.getValue()).j(tsbVar.getId());
                        if (r2gVarJ == null || r2gVarJ.c < 10) {
                            return;
                        }
                        try {
                            tsbVar.f();
                        } catch (Throwable th) {
                            y3bVar.a(new IllegalStateException("TaskRunnable: failed to execute onMaxFailCount method for task " + tsbVar.getId() + " type " + tsbVar.getType(), th));
                        }
                        ((a3g) k18Var.getValue()).d(tsbVar.getId());
                        wqi.c("c6i", "remove task because it cause too many exceptions: ".concat(b6i.class.getName()), new Object[0]);
                        return;
                    }
                    return;
                }
            case 1:
                z52 z52Var = (z52) ((t9f) this.o).b;
                zf9 zf9Var = (zf9) this.c;
                y52 y52Var = (y52) this.b;
                if (y52Var != null) {
                    z52Var.J0 = true;
                    y52Var.b.c(false);
                    z52Var.J0 = false;
                }
                if (zf9Var.isEnabled() && zf9Var.hasSubMenu()) {
                    ((vf9) this.d).q(zf9Var, null, 4);
                    return;
                }
                return;
            case 2:
                FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) this.d;
                View view = (View) this.c;
                if (view instanceof TextView) {
                    b6g.b((TextView) view, fitFontImageSpan);
                } else if (view instanceof xta) {
                    jgh.b((xta) view, fitFontImageSpan);
                }
                ((e16) this.o).c.set(false);
                return;
            case 3:
                String str2 = (String) this.c;
                IBinder binder = ((wv8) this.b).a.getBinder();
                t9f t9fVar = (t9f) this.o;
                pv8 pv8Var = (pv8) ((k89) t9fVar.b).o.get(binder);
                if (pv8Var == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str2);
                    return;
                }
                HashMap map = pv8Var.f;
                k89 k89Var = (k89) t9fVar.b;
                IBinder iBinder = (IBinder) this.d;
                try {
                    if (iBinder == null) {
                        i = map.remove(str2) == null ? 0 : 1;
                    } else {
                        List list = (List) map.get(str2);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((kmb) it.next()).a) {
                                    it.remove();
                                    i2 = 1;
                                }
                            }
                            if (list.isEmpty()) {
                                map.remove(str2);
                            }
                        }
                        k89Var.X = null;
                        i = i2;
                    }
                    if (i == 0) {
                        Log.w("MBServiceCompat", "removeSubscription called for " + str2 + " which is not subscribed");
                        return;
                    }
                    return;
                } finally {
                    k89Var.X = null;
                }
            case 4:
                ((kce) this.b).M((z59) this.o, (h59) this.c, (Collection) this.d);
                return;
            case 5:
                ((kce) this.b).M((z59) this.o, (h59) this.c, (ArrayList) this.d);
                return;
            case 6:
                l42 l42Var = (l42) this.c;
                try {
                    svi.g(((x74) this.b).minusKey(jbe.t0), new mrd((lrd) this.d, l42Var, (nrd) this.o, null));
                    return;
                } catch (Throwable th2) {
                    l42Var.h(th2);
                    return;
                }
            case 7:
                o3i.h((View) this.b, (s3i) this.c, (ssb) this.d);
                ((ValueAnimator) this.o).start();
                return;
            case 8:
                ike ikeVar = (ike) this.d;
                UUID uuid = (UUID) this.b;
                String string = uuid.toString();
                cei ceiVarG = cei.g();
                String str3 = l5i.c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                yd4 yd4Var = (yd4) this.c;
                sb.append(yd4Var);
                sb.append(")");
                ceiVarG.c(str3, sb.toString());
                l5i l5iVar = (l5i) this.o;
                WorkDatabase workDatabase = l5iVar.a;
                WorkDatabase workDatabase2 = l5iVar.a;
                workDatabase.c();
                try {
                    r5iVarP = workDatabase2.x().p(string);
                } catch (Throwable th3) {
                    try {
                        cei.g().f(l5i.c, "Error updating Worker progress", th3);
                        ikeVar.j(th3);
                    } finally {
                        workDatabase2.k();
                    }
                }
                if (r5iVarP == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (r5iVarP.b == w4i.b) {
                    j5i j5iVar = new j5i(string, yd4Var);
                    k5i k5iVarW = workDatabase2.w();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) k5iVarW.b;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((cwg) k5iVarW.c).B(j5iVar);
                        workDatabase_Impl.q();
                        workDatabase_Impl.k();
                    } catch (Throwable th4) {
                        workDatabase_Impl.k();
                        throw th4;
                    }
                } else {
                    cei.g().o(str3, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                ikeVar.i(null);
                workDatabase2.q();
                return;
            default:
                fcj fcjVar = (fcj) this.b;
                lk6 lk6Var = (lk6) this.c;
                v6j v6jVar = (v6j) this.d;
                String str4 = (String) this.o;
                ra3 ra3Var = (ra3) lk6Var.c;
                ra3Var.b = v6jVar;
                abj abjVar = (abj) ra3Var.a;
                if (abjVar == null || (str = abjVar.d) == null || str.isEmpty()) {
                    str = "NA";
                } else {
                    s5j.g(str);
                }
                cyi cyiVar = new cyi();
                cyiVar.a = fcjVar.a;
                cyiVar.b = fcjVar.b;
                synchronized (fcj.class) {
                    try {
                        cjiVarJ = fcj.k;
                        if (cjiVarJ == null) {
                            we8 we8Var = new we8(new xe8(to3.a(Resources.getSystem().getConfiguration())));
                            c0 c0Var = new c0();
                            while (i2 < we8Var.b()) {
                                Locale locale = we8Var.a.a.get(i2);
                                hl4 hl4Var = ri3.a;
                                c0Var.h(locale.toLanguageTag());
                                i2++;
                            }
                            cjiVarJ = c0Var.j();
                            fcj.k = cjiVarJ;
                        }
                    } finally {
                    }
                }
                cyiVar.k = cjiVarJ;
                cyiVar.g = Boolean.TRUE;
                cyiVar.d = str;
                cyiVar.c = str4;
                cyiVar.e = fcjVar.f.h() ? (String) fcjVar.f.f() : fcjVar.d.a();
                cyiVar.i = 10;
                cyiVar.j = Integer.valueOf(fcjVar.h);
                lk6Var.d = cyiVar;
                fcjVar.c.a(lk6Var);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "WorkerService.TaskRunnable{" + ((hge) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b6i(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public b6i(hge hgeVar, k18 k18Var, yi5 yi5Var, k18 k18Var2) {
        this.a = 0;
        this.b = hgeVar;
        this.c = k18Var;
        this.o = yi5Var;
        this.d = k18Var2;
    }
}
