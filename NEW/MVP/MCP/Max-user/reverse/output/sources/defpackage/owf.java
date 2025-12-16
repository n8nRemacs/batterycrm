package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.work.Worker;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class owf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ owf(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
        synchronized (((qpi) this.c).c) {
            ((vva) ((qpi) this.c).d).a(((Task) this.b).f());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        r5i r5iVar;
        sa7 sa7Var;
        switch (this.a) {
            case 0:
                jac jacVar = ((pwf) this.c).a.f;
                String str = (String) this.b;
                synchronized (jacVar.v0) {
                    try {
                        e6i e6iVar = (e6i) jacVar.X.get(str);
                        if (e6iVar == null) {
                            e6iVar = (e6i) jacVar.Y.get(str);
                        }
                        r5iVar = e6iVar != null ? e6iVar.o : null;
                    } finally {
                    }
                }
                if (r5iVar == null || !r5iVar.c()) {
                    return;
                }
                synchronized (((pwf) this.c).c) {
                    ((pwf) this.c).X.put(nsi.d(r5iVar), r5iVar);
                    ((pwf) this.c).Y.add(r5iVar);
                    pwf pwfVar = (pwf) this.c;
                    pwfVar.Z.w(pwfVar.Y);
                }
                return;
            case 1:
                f8g f8gVar = ((e8g) this.c).c;
                Pair pair = (Pair) this.b;
                hj0 hj0Var = (hj0) pair.first;
                oac oacVar = (oac) pair.second;
                ((mk0) oacVar).c.a(oacVar, "ThrottlingProducer", null);
                f8gVar.a.a(new e8g(f8gVar, hj0Var), oacVar);
                return;
            case 2:
                OneMeButton oneMeButton = (OneMeButton) this.b;
                ScrollView scrollView = (ScrollView) this.c;
                ViewGroup.LayoutParams layoutParams = oneMeButton.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), oneMeButton.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                return;
            case 3:
                pog pogVar = (pog) this.c;
                veb secondTextInputView = pogVar.getSecondTextInputView();
                ViewGroup.LayoutParams layoutParams2 = secondTextInputView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = u45.c(48, vw4.d().getDisplayMetrics().density, pogVar.s0.getInputHeight());
                secondTextInputView.setLayoutParams(marginLayoutParams2);
                return;
            case 4:
                try {
                    ((Worker) this.c).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th) {
                    ((ike) this.b).j(th);
                    return;
                }
            case 5:
                String str2 = (String) this.b;
                e6i e6iVar2 = (e6i) this.c;
                try {
                    try {
                        la8 la8Var = (la8) e6iVar2.A0.get();
                        if (la8Var == null) {
                            cei.g().e(e6i.C0, e6iVar2.o.c + " returned a null result. Treating it as a failure.");
                        } else {
                            cei.g().c(e6i.C0, e6iVar2.o.c + " returned a " + la8Var + ".");
                            e6iVar2.Z = la8Var;
                        }
                    } catch (Throwable th2) {
                        e6iVar2.b();
                        throw th2;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    cei.g().f(e6i.C0, str2 + " failed because it threw an exception/error", e);
                } catch (CancellationException e2) {
                    cei.g().j(e6i.C0, str2 + " was cancelled", e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    cei.g().f(e6i.C0, str2 + " failed because it threw an exception/error", e);
                }
                e6iVar2.b();
                return;
            case 6:
                es3 es3Var = (es3) this.b;
                fo4 fo4Var = (fo4) this.c;
                fl flVar = (fl) fo4Var.b;
                wai waiVar = (wai) ((xv6) fo4Var.X).t0.get((cm) fo4Var.c);
                if (waiVar == null) {
                    return;
                }
                if (es3Var.b != 0) {
                    waiVar.m(es3Var, null);
                    return;
                }
                fo4Var.a = true;
                if (flVar.j()) {
                    if (!fo4Var.a || (sa7Var = (sa7) fo4Var.d) == null) {
                        return;
                    }
                    flVar.k(sa7Var, (Set) fo4Var.o);
                    return;
                }
                try {
                    flVar.k(null, flVar.a());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    flVar.b("Failed to get service from broker.");
                    waiVar.m(new es3(10), null);
                    return;
                }
            case 7:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        kii kiiVar = (kii) referenceQueue.remove();
                        if (kiiVar.a.remove(kiiVar)) {
                            kiiVar.clear();
                            kiiVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 8:
                pii piiVar = (pii) this.c;
                ybj ybjVar = piiVar.d;
                try {
                    Task task = (Task) piiVar.c.s((Task) this.b);
                    if (task == null) {
                        piiVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ex4 ex4Var = u2g.b;
                    task.d(ex4Var, piiVar);
                    task.c(ex4Var, piiVar);
                    task.a(ex4Var, piiVar);
                    return;
                } catch (RuntimeExecutionException e5) {
                    if (e5.getCause() instanceof Exception) {
                        ybjVar.n((Exception) e5.getCause());
                        return;
                    } else {
                        ybjVar.n(e5);
                        return;
                    }
                } catch (Exception e6) {
                    ybjVar.n(e6);
                    return;
                }
            case 9:
                o4j o4jVar = (o4j) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (o4jVar) {
                    if (iBinder == null) {
                        o4jVar.a("Null service connection");
                    } else {
                        try {
                            o4jVar.c = new ssb(iBinder);
                            o4jVar.a = 2;
                            ((ScheduledExecutorService) o4jVar.X.d).execute(new vti(o4jVar, 0));
                        } catch (RemoteException e7) {
                            o4jVar.a(e7.getMessage());
                        }
                    }
                }
                return;
            case 10:
                synchronized (((qpi) this.c).c) {
                    nva nvaVar = (nva) ((qpi) this.c).d;
                    Exception excE = ((Task) this.b).e();
                    s5j.g(excE);
                    nvaVar.onFailure(excE);
                }
                return;
            case 11:
                a();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                qpi qpiVar = (qpi) this.c;
                try {
                    ybj ybjVarC = ((apf) qpiVar.c).c(((Task) this.b).f());
                    ex4 ex4Var2 = u2g.b;
                    ybjVarC.d(ex4Var2, qpiVar);
                    ybjVarC.c(ex4Var2, qpiVar);
                    ybjVarC.a(ex4Var2, qpiVar);
                    return;
                } catch (RuntimeExecutionException e8) {
                    if (e8.getCause() instanceof Exception) {
                        qpiVar.onFailure((Exception) e8.getCause());
                        return;
                    } else {
                        qpiVar.onFailure(e8);
                        return;
                    }
                } catch (CancellationException unused2) {
                    qpiVar.b();
                    return;
                } catch (Exception e9) {
                    qpiVar.onFailure(e9);
                    return;
                }
            default:
                fcj fcjVar = (fcj) this.b;
                v6j v6jVar = v6j.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                nud nudVar = (nud) this.c;
                HashMap map = fcjVar.j;
                hgi hgiVar = (hgi) map.get(v6jVar);
                if (hgiVar != null) {
                    Iterator it = ((mfi) hgiVar.b()).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object arrayList = (Collection) hgiVar.c.get(next);
                        if (arrayList == null) {
                            arrayList = new ArrayList(3);
                        }
                        List list = (List) arrayList;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new ufi(hgiVar, next, list, null) : new a3(hgiVar, next, list, (a3) null));
                        Collections.sort(arrayList2);
                        r30 r30Var = new r30();
                        Iterator it2 = arrayList2.iterator();
                        long jLongValue = 0;
                        while (it2.hasNext()) {
                            jLongValue += ((Long) it2.next()).longValue();
                        }
                        r30Var.a = Long.valueOf((jLongValue / arrayList2.size()) & BuildConfig.MAX_TIME_TO_UPLOAD);
                        r30Var.b = Long.valueOf(fcj.a(arrayList2, 100.0d) & BuildConfig.MAX_TIME_TO_UPLOAD);
                        r30Var.X = Long.valueOf(fcj.a(arrayList2, 75.0d) & BuildConfig.MAX_TIME_TO_UPLOAD);
                        r30Var.o = Long.valueOf(fcj.a(arrayList2, 50.0d) & BuildConfig.MAX_TIME_TO_UPLOAD);
                        r30Var.d = Long.valueOf(fcj.a(arrayList2, 25.0d) & BuildConfig.MAX_TIME_TO_UPLOAD);
                        r30Var.c = Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD & fcj.a(arrayList2, 0.0d));
                        t5j t5jVar = new t5j(r30Var);
                        int size = arrayList2.size();
                        fyi fyiVar = (fyi) nudVar.b;
                        ani aniVar = (ani) next;
                        ra3 ra3Var = new ra3();
                        ra3Var.c = fyiVar.s0 ? t6j.TYPE_THICK : t6j.TYPE_THIN;
                        jdc jdcVar = new jdc();
                        jdcVar.c = Integer.valueOf(size & Integer.MAX_VALUE);
                        jdcVar.b = aniVar;
                        jdcVar.d = t5jVar;
                        ra3Var.f = new dni(jdcVar);
                        spi.a.execute(new b6i(9, fcjVar, new lk6(ra3Var, 0), v6jVar, fcjVar.c(), false));
                    }
                    map.remove(v6jVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ owf(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ owf(fcj fcjVar, nud nudVar) {
        this.a = 13;
        v6j v6jVar = v6j.UNKNOWN_EVENT;
        this.b = fcjVar;
        this.c = nudVar;
    }
}
