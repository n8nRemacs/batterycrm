package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class tv8 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ tv8(j3 j3Var, zkb zkbVar, iv6 iv6Var, Callable callable, n2g n2gVar) {
        this.a = 4;
        this.b = j3Var;
        this.c = zkbVar;
        this.X = iv6Var;
        this.d = callable;
        this.o = n2gVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.a) {
            case 0:
                IBinder binder = ((wv8) this.b).a.getBinder();
                t9f t9fVar = (t9f) this.o;
                pv8 pv8Var = (pv8) ((k89) t9fVar.b).o.get(binder);
                if (pv8Var == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + ((String) this.c));
                    return;
                }
                HashMap map = pv8Var.f;
                k89 k89Var = (k89) t9fVar.b;
                String str = (String) this.c;
                IBinder iBinder = (IBinder) this.X;
                Bundle bundle = (Bundle) this.d;
                List<kmb> arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (kmb kmbVar : arrayList) {
                    if (iBinder == kmbVar.a) {
                        Bundle bundle2 = (Bundle) kmbVar.b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            hsi.h(bundle2);
                            if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1)) {
                            return;
                        }
                    }
                }
                arrayList.add(new kmb(iBinder, bundle));
                map.put(str, arrayList);
                ov8 ov8Var = new ov8(k89Var, str, pv8Var, str, bundle);
                k89Var.X = pv8Var;
                if (bundle == null) {
                    ov8Var.b();
                } else {
                    ov8Var.b = 1;
                    ov8Var.b();
                }
                k89Var.X = null;
                if (!ov8Var.c) {
                    throw new IllegalStateException(ctd.j(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), pv8Var.a, " id=", str));
                }
                k89Var.X = null;
                return;
            case 1:
                Bundle bundle3 = (Bundle) this.d;
                IBinder binder2 = ((wv8) this.b).a.getBinder();
                t9f t9fVar2 = (t9f) this.o;
                pv8 pv8Var2 = (pv8) ((k89) t9fVar2.b).o.get(binder2);
                if (pv8Var2 == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + ((String) this.c) + ", extras=" + bundle3);
                    return;
                }
                k89 k89Var2 = (k89) t9fVar2.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.X;
                k89Var2.X = pv8Var2;
                if (bundle3 == null) {
                    Bundle bundle4 = Bundle.EMPTY;
                }
                resultReceiver.send(-1, null);
                k89Var2.X = null;
                return;
            case 2:
                View view = (View) this.c;
                eve eveVar = (eve) this.o;
                ArrayList arrayList2 = eveVar.Z;
                View view2 = (View) this.b;
                WeakHashMap weakHashMap = hfh.a;
                arrayList2.remove(veh.k(view2));
                eveVar.s0.add(new dve(view2, (ViewGroup) view2.getParent()));
                ((ViewGroup) view2.getParent()).removeView(view2);
                if (arrayList2.size() == 0) {
                    view.getViewTreeObserver().removeOnPreDrawListener((yue) this.X);
                    view.setVisibility(4);
                    ((i40) this.d).e();
                    return;
                }
                return;
            case 3:
                try {
                    if (!(((ike) this.b).a instanceof c1)) {
                        String string = ((UUID) this.c).toString();
                        r5i r5iVarP = ((u4i) this.o).c.p(string);
                        if (r5iVarP == null || r5iVarP.b.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((jac) ((u4i) this.o).b).g(string, (qe6) this.X);
                        ((Context) this.d).startService(pwf.b((Context) this.d, nsi.d(r5iVarP), (qe6) this.X));
                    }
                    ((ike) this.b).i(null);
                    return;
                } catch (Throwable th) {
                    ((ike) this.b).j(th);
                    return;
                }
            default:
                j3 j3Var = (j3) this.b;
                zkb zkbVar = (zkb) this.c;
                iv6 iv6Var = (iv6) this.X;
                Callable callable = (Callable) this.d;
                n2g n2gVar = (n2g) this.o;
                try {
                    if (((ybj) zkbVar.b).g()) {
                        iv6Var.j();
                        return;
                    }
                    try {
                        if (!((AtomicBoolean) j3Var.c).get()) {
                            fyi fyiVar = (fyi) j3Var;
                            synchronized (fyiVar) {
                                fyiVar.s0 = fyiVar.o.h();
                            }
                            ((AtomicBoolean) j3Var.c).set(true);
                        }
                        if (((ybj) zkbVar.b).g()) {
                            iv6Var.j();
                            return;
                        }
                        Object objCall = callable.call();
                        if (((ybj) zkbVar.b).g()) {
                            iv6Var.j();
                            return;
                        } else {
                            n2gVar.b(objCall);
                            return;
                        }
                    } catch (RuntimeException e) {
                        throw new MlKitException("Internal error has occurred when executing ML Kit tasks", e);
                    }
                } catch (Exception e2) {
                    if (((ybj) zkbVar.b).g()) {
                        iv6Var.j();
                        return;
                    } else {
                        n2gVar.a(e2);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ tv8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
        this.X = obj4;
        this.d = obj5;
    }

    public tv8(t9f t9fVar, wv8 wv8Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 1;
        this.o = t9fVar;
        this.b = wv8Var;
        this.c = str;
        this.d = bundle;
        this.X = resultReceiver;
    }
}
