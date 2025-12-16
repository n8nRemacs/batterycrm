package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class c5e implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ c5e(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        o4j o4jVar = (o4j) this.b;
        int i = ((m6j) this.c).a;
        synchronized (o4jVar) {
            m6j m6jVar = (m6j) o4jVar.o.get(i);
            if (m6jVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                o4jVar.o.remove(i);
                m6jVar.b(new zzt("Timed out waiting for response", null));
                o4jVar.c();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        sa7 ubjVar = null;
        switch (this.a) {
            case 0:
                l42 l42Var = (l42) this.b;
                try {
                    l42Var.resumeWith(((ha8) this.c).get());
                    return;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        cause = th;
                    }
                    if (th instanceof CancellationException) {
                        l42Var.h(cause);
                        return;
                    } else {
                        l42Var.resumeWith(new ipd(cause));
                        return;
                    }
                }
            case 1:
                try {
                    ((Runnable) this.c).run();
                    synchronized (((uee) this.b).o) {
                        ((uee) this.b).a();
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((uee) this.b).o) {
                        ((uee) this.b).a();
                        throw th2;
                    }
                }
            case 2:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    WeakHashMap weakHashMap = hfh.a;
                    veh.v(view, (String) ((eve) this.c).Y.get(veh.k(view)));
                }
                return;
            case 3:
                View view2 = (View) this.b;
                StickersScreen stickersScreen = (StickersScreen) this.c;
                yy7[] yy7VarArr = StickersScreen.u0;
                RecyclerView recyclerViewY0 = stickersScreen.y0();
                recyclerViewY0.setPadding(recyclerViewY0.getPaddingLeft(), view2.getMeasuredHeight(), recyclerViewY0.getPaddingRight(), recyclerViewY0.getPaddingBottom());
                return;
            case 4:
                lfh lfhVar = ((SwipeDismissBehavior) this.c).a;
                if (lfhVar == null || !lfhVar.f()) {
                    return;
                }
                View view3 = (View) this.b;
                WeakHashMap weakHashMap2 = hfh.a;
                view3.postOnAnimation(this);
                return;
            case 5:
                o2g o2gVar = (o2g) this.b;
                try {
                    o2gVar.c(((Callable) this.c).call());
                    return;
                } catch (CancellationException unused) {
                    o2gVar.a();
                    return;
                } catch (Exception e) {
                    o2gVar.b(e);
                    return;
                }
            case 6:
                ((ogg) this.b).d = true;
                ((pgg) this.c).a.remove((ogg) this.b);
                return;
            case 7:
                if (((t4i) this.c).a.a instanceof c1) {
                    return;
                }
                try {
                    qe6 qe6Var = (qe6) ((ike) this.b).get();
                    if (qe6Var == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((t4i) this.c).c.c + ") but did not provide ForegroundInfo");
                    }
                    cei.g().c(t4i.Y, "Updating notification for " + ((t4i) this.c).c.c);
                    t4i t4iVar = (t4i) this.c;
                    ike ikeVar = t4iVar.a;
                    u4i u4iVar = t4iVar.o;
                    Context context = t4iVar.b;
                    UUID id = t4iVar.d.getId();
                    u4iVar.getClass();
                    ike ikeVar2 = new ike();
                    u4iVar.a.c(new tv8(u4iVar, ikeVar2, id, qe6Var, context, 3));
                    ikeVar.k(ikeVar2);
                    return;
                } catch (Throwable th3) {
                    ((t4i) this.c).a.j(th3);
                    return;
                }
            case 8:
                if (((e6i) this.b).A0.a instanceof c1) {
                    return;
                }
                try {
                    ((ha8) this.c).get();
                    cei.g().c(e6i.C0, "Starting work for " + ((e6i) this.b).o.c);
                    e6i e6iVar = (e6i) this.b;
                    e6iVar.A0.k(e6iVar.X.startWork());
                    return;
                } catch (Throwable th4) {
                    ((e6i) this.b).A0.j(th4);
                    return;
                }
            case 9:
                pze pzeVar = (pze) this.c;
                y6d y6dVar = pzeVar.b;
                StringBuilder sb = new StringBuilder("<!> send retry -> ");
                c9i c9iVar = (c9i) this.b;
                sb.append(c9iVar);
                y6dVar.log("OKSignaling", sb.toString());
                pzeVar.g.send(c9iVar.a);
                return;
            case 10:
                hbi hbiVar = (hbi) this.c;
                aci aciVar = (aci) this.b;
                es3 es3Var = aciVar.b;
                if (es3Var.b == 0) {
                    gci gciVar = aciVar.c;
                    s5j.g(gciVar);
                    es3 es3Var2 = gciVar.c;
                    if (es3Var2.b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(es3Var2)), new Exception());
                        hbiVar.j.f(es3Var2);
                        hbiVar.i.disconnect();
                        return;
                    }
                    fo4 fo4Var = hbiVar.j;
                    IBinder iBinder = gciVar.b;
                    if (iBinder != null) {
                        int i2 = x5.d;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        ubjVar = iInterfaceQueryLocalInterface instanceof sa7 ? (sa7) iInterfaceQueryLocalInterface : new ubj(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    Set set = hbiVar.g;
                    fo4Var.getClass();
                    if (ubjVar == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        fo4Var.f(new es3(4));
                    } else {
                        fo4Var.d = ubjVar;
                        fo4Var.o = set;
                        if (fo4Var.a) {
                            ((fl) fo4Var.b).k(ubjVar, set);
                        }
                    }
                } else {
                    hbiVar.j.f(es3Var);
                }
                hbiVar.i.disconnect();
                return;
            case 11:
                if (((ybj) ((Task) this.b)).d) {
                    ((pii) this.c).d.p();
                    return;
                }
                try {
                    ((pii) this.c).d.o(((pii) this.c).c.s((Task) this.b));
                    return;
                } catch (RuntimeExecutionException e2) {
                    if (e2.getCause() instanceof Exception) {
                        ((pii) this.c).d.n((Exception) e2.getCause());
                        return;
                    } else {
                        ((pii) this.c).d.n(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((pii) this.c).d.n(e3);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Callable callable = (Callable) this.b;
                n2g n2gVar = (n2g) this.c;
                try {
                    n2gVar.b(callable.call());
                    return;
                } catch (MlKitException e4) {
                    n2gVar.a(e4);
                    return;
                } catch (Exception e5) {
                    n2gVar.a(new MlKitException("Internal error has occurred when executing ML Kit tasks", e5));
                    return;
                }
            case 13:
                synchronized (((qpi) this.c).c) {
                    ((lva) ((qpi) this.c).d).p((Task) this.b);
                }
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                j3 j3Var = (j3) this.b;
                n2g n2gVar2 = (n2g) this.c;
                int iDecrementAndGet = ((AtomicInteger) j3Var.b).decrementAndGet();
                if (iDecrementAndGet < 0) {
                    throw new IllegalStateException();
                }
                if (iDecrementAndGet == 0) {
                    fyi fyiVar = (fyi) j3Var;
                    synchronized (fyiVar) {
                        try {
                            fyiVar.o.c();
                            fyi.u0 = true;
                            ra3 ra3Var = new ra3();
                            t6j t6jVar = fyiVar.s0 ? t6j.TYPE_THICK : t6j.TYPE_THIN;
                            fcj fcjVar = fyiVar.X;
                            ra3Var.c = t6jVar;
                            hk4 hk4Var = new hk4();
                            hk4Var.b = zei.a(fyiVar.d);
                            ra3Var.d = new h7j(hk4Var);
                            spi.a.execute(new b6i(9, fcjVar, new lk6(ra3Var, 0), v6j.ON_DEVICE_BARCODE_CLOSE, fcjVar.c(), false));
                        } finally {
                        }
                    }
                    ((AtomicBoolean) j3Var.c).set(false);
                }
                g7j.a.clear();
                p8j.a.clear();
                n2gVar2.b(null);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                a();
                return;
            case 16:
                dl6 dl6Var = (dl6) this.b;
                AtomicReference atomicReference = (AtomicReference) dl6Var.d;
                if (((Thread) atomicReference.getAndSet(Thread.currentThread())) != null) {
                    throw new IllegalStateException();
                }
                try {
                    ((Runnable) this.c).run();
                    atomicReference.set(null);
                    dl6Var.v();
                    return;
                } finally {
                }
            default:
                ybj ybjVar = (ybj) this.b;
                try {
                    ybjVar.o(((Callable) this.c).call());
                    return;
                } catch (Exception e6) {
                    ybjVar.n(e6);
                    return;
                } catch (Throwable th5) {
                    ybjVar.n(new RuntimeException(th5));
                    return;
                }
        }
    }

    public /* synthetic */ c5e(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public c5e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 4;
        this.c = swipeDismissBehavior;
        this.b = view;
    }
}
