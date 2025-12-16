package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class xv6 implements Handler.Callback {
    public static xv6 B0;
    public final tv6 X;
    public final ssb Y;
    public final AtomicInteger Z;
    public long a;
    public boolean b;
    public j3g c;
    public bci d;
    public final Context o;
    public final AtomicInteger s0;
    public final ConcurrentHashMap t0;
    public final xs u0;
    public final xs v0;
    public final y1a w0;
    public volatile boolean x0;
    public static final Status y0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status z0 = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object A0 = new Object();

    public xv6(Context context, Looper looper) {
        tv6 tv6Var = tv6.d;
        this.a = WorkRequest.MIN_BACKOFF_MILLIS;
        this.b = false;
        this.Z = new AtomicInteger(1);
        this.s0 = new AtomicInteger(0);
        this.t0 = new ConcurrentHashMap(5, 0.75f, 1);
        this.u0 = new xs(0);
        this.v0 = new xs(0);
        this.x0 = true;
        this.o = context;
        y1a y1aVar = new y1a(looper, this, 2);
        Looper.getMainLooper();
        this.w0 = y1aVar;
        this.X = tv6Var;
        this.Y = new ssb(19);
        PackageManager packageManager = context.getPackageManager();
        if (d9j.d == null) {
            d9j.d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (d9j.d.booleanValue()) {
            this.x0 = false;
        }
        y1aVar.sendMessage(y1aVar.obtainMessage(6));
    }

    public static Status c(cm cmVar, es3 es3Var) {
        return new Status(17, wy1.i("API: ", (String) cmVar.b.b, " is not available on this device. Connection failed with: ", String.valueOf(es3Var)), es3Var.c, es3Var);
    }

    public static xv6 e(Context context) {
        xv6 xv6Var;
        HandlerThread handlerThread;
        synchronized (A0) {
            if (B0 == null) {
                synchronized (p7j.g) {
                    try {
                        handlerThread = p7j.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            p7j.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = p7j.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = tv6.c;
                B0 = new xv6(applicationContext, looper);
            }
            xv6Var = B0;
        }
        return xv6Var;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        vsd vsdVar = (vsd) usd.h().b;
        if (vsdVar != null && !vsdVar.b) {
            return false;
        }
        int i = ((SparseIntArray) this.Y.b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(es3 es3Var, int i) throws Resources.NotFoundException {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        tv6 tv6Var = this.X;
        Context context = this.o;
        tv6Var.getClass();
        synchronized (jo7.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = jo7.b;
            if (context2 == null || (bool = jo7.c) == null || context2 != applicationContext) {
                jo7.c = null;
                boolean zIsInstantApp = applicationContext.getPackageManager().isInstantApp();
                jo7.c = Boolean.valueOf(zIsInstantApp);
                jo7.b = applicationContext;
                zBooleanValue = zIsInstantApp;
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            int i2 = es3Var.b;
            if ((i2 == 0 || es3Var.c == null) ? false : true) {
                activity = es3Var.c;
            } else {
                Intent intentB = tv6Var.b(context, null, i2);
                activity = intentB != null ? PendingIntent.getActivity(context, 0, intentB, 201326592) : null;
            }
            if (activity != null) {
                int i3 = es3Var.b;
                int i4 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                tv6Var.g(context, i3, PendingIntent.getActivity(context, 0, intent, dci.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final wai d(sv6 sv6Var) {
        cm cmVar = sv6Var.e;
        ConcurrentHashMap concurrentHashMap = this.t0;
        wai waiVar = (wai) concurrentHashMap.get(cmVar);
        if (waiVar == null) {
            waiVar = new wai(this, sv6Var);
            concurrentHashMap.put(cmVar, waiVar);
        }
        if (waiVar.d.j()) {
            this.v0.add(cmVar);
        }
        waiVar.k();
        return waiVar;
    }

    public final void f(es3 es3Var, int i) {
        if (b(es3Var, i)) {
            return;
        }
        y1a y1aVar = this.w0;
        y1aVar.sendMessage(y1aVar.obtainMessage(5, i, 0, es3Var));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        wai waiVar;
        qt5[] qt5VarArrG;
        Context context = this.o;
        xs xsVar = this.v0;
        y1a y1aVar = this.w0;
        ConcurrentHashMap concurrentHashMap = this.t0;
        int i = message.what;
        switch (i) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? WorkRequest.MIN_BACKOFF_MILLIS : 300000L;
                y1aVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    y1aVar.sendMessageDelayed(y1aVar.obtainMessage(12, (cm) it.next()), this.a);
                }
                return true;
            case 2:
                throw az1.g(message.obj);
            case 3:
                for (wai waiVar2 : concurrentHashMap.values()) {
                    s5j.b(waiVar2.o.w0);
                    waiVar2.m = null;
                    waiVar2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                fbi fbiVar = (fbi) message.obj;
                sv6 sv6Var = fbiVar.c;
                zbi zbiVar = fbiVar.a;
                wai waiVarD = (wai) concurrentHashMap.get(sv6Var.e);
                if (waiVarD == null) {
                    waiVarD = d(fbiVar.c);
                }
                if (!waiVarD.d.j() || this.s0.get() == fbiVar.b) {
                    waiVarD.l(zbiVar);
                    return true;
                }
                zbiVar.a(y0);
                waiVarD.o();
                return true;
            case 5:
                int i2 = message.arg1;
                es3 es3Var = (es3) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        waiVar = (wai) it2.next();
                        if (waiVar.i == i2) {
                        }
                    } else {
                        waiVar = null;
                    }
                }
                if (waiVar == null) {
                    Log.wtf("GoogleApiManager", wy1.e(i2, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i3 = es3Var.b;
                if (i3 != 13) {
                    waiVar.b(c(waiVar.e, es3Var));
                    return true;
                }
                this.X.getClass();
                int i4 = lw6.e;
                waiVar.b(new Status(17, wy1.i("Error resolution was canceled by the user, original error message: ", es3.b(i3), ": ", es3Var.d), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    gf0.a((Application) context.getApplicationContext());
                    gf0 gf0Var = gf0.o;
                    vai vaiVar = new vai(this);
                    gf0Var.getClass();
                    synchronized (gf0Var) {
                        gf0Var.c.add(vaiVar);
                    }
                    AtomicBoolean atomicBoolean = gf0Var.a;
                    AtomicBoolean atomicBoolean2 = gf0Var.b;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.a = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                d((sv6) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    wai waiVar3 = (wai) concurrentHashMap.get(message.obj);
                    s5j.b(waiVar3.o.w0);
                    if (waiVar3.k) {
                        waiVar3.k();
                        return true;
                    }
                }
                return true;
            case 10:
                xsVar.getClass();
                qs qsVar = new qs(xsVar);
                while (qsVar.hasNext()) {
                    wai waiVar4 = (wai) concurrentHashMap.remove((cm) qsVar.next());
                    if (waiVar4 != null) {
                        waiVar4.o();
                    }
                }
                xsVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    wai waiVar5 = (wai) concurrentHashMap.get(message.obj);
                    xv6 xv6Var = waiVar5.o;
                    s5j.b(xv6Var.w0);
                    boolean z = waiVar5.k;
                    if (z) {
                        cm cmVar = waiVar5.e;
                        y1a y1aVar2 = waiVar5.o.w0;
                        if (z) {
                            y1aVar2.removeMessages(11, cmVar);
                            y1aVar2.removeMessages(9, cmVar);
                            waiVar5.k = false;
                        }
                        waiVar5.b(xv6Var.X.c(xv6Var.o, uv6.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        waiVar5.d.b("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    wai waiVar6 = (wai) concurrentHashMap.get(message.obj);
                    s5j.b(waiVar6.o.w0);
                    fl flVar = waiVar6.d;
                    if (flVar.isConnected() && waiVar6.h.isEmpty()) {
                        xpb xpbVar = waiVar6.f;
                        if (((Map) xpbVar.b).isEmpty() && ((Map) xpbVar.c).isEmpty()) {
                            flVar.b("Timing out service connection.");
                            return true;
                        }
                        waiVar6.g();
                    }
                    return true;
                }
                return true;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                throw az1.g(message.obj);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                xai xaiVar = (xai) message.obj;
                if (concurrentHashMap.containsKey(xaiVar.a)) {
                    wai waiVar7 = (wai) concurrentHashMap.get(xaiVar.a);
                    if (waiVar7.l.contains(xaiVar) && !waiVar7.k) {
                        if (waiVar7.d.isConnected()) {
                            waiVar7.d();
                            return true;
                        }
                        waiVar7.k();
                        return true;
                    }
                }
                return true;
            case 16:
                xai xaiVar2 = (xai) message.obj;
                if (concurrentHashMap.containsKey(xaiVar2.a)) {
                    wai waiVar8 = (wai) concurrentHashMap.get(xaiVar2.a);
                    ArrayList arrayList = waiVar8.l;
                    xv6 xv6Var2 = waiVar8.o;
                    LinkedList<zbi> linkedList = waiVar8.c;
                    if (arrayList.remove(xaiVar2)) {
                        xv6Var2.w0.removeMessages(15, xaiVar2);
                        xv6Var2.w0.removeMessages(16, xaiVar2);
                        qt5 qt5Var = xaiVar2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (zbi zbiVar2 : linkedList) {
                            if ((zbiVar2 instanceof zai) && (qt5VarArrG = ((zai) zbiVar2).g(waiVar8)) != null) {
                                int length = qt5VarArrG.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!syi.c(qt5VarArrG[i5], qt5Var)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList2.add(zbiVar2);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            zbi zbiVar3 = (zbi) arrayList2.get(i6);
                            linkedList.remove(zbiVar3);
                            zbiVar3.b(new UnsupportedApiCallException(qt5Var));
                        }
                    }
                }
                return true;
            case LangUtils.HASH_SEED /* 17 */:
                j3g j3gVar = this.c;
                if (j3gVar != null) {
                    if (j3gVar.a > 0 || a()) {
                        if (this.d == null) {
                            this.d = new bci(this.o, bci.k, l3g.b, rv6.c);
                        }
                        this.d.d(j3gVar);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                ebi ebiVar = (ebi) message.obj;
                long j = ebiVar.c;
                mz9 mz9Var = ebiVar.a;
                int i7 = ebiVar.b;
                if (j == 0) {
                    j3g j3gVar2 = new j3g(i7, Arrays.asList(mz9Var));
                    if (this.d == null) {
                        this.d = new bci(this.o, bci.k, l3g.b, rv6.c);
                    }
                    this.d.d(j3gVar2);
                    return true;
                }
                j3g j3gVar3 = this.c;
                if (j3gVar3 != null) {
                    List list = j3gVar3.b;
                    if (j3gVar3.a != i7 || (list != null && list.size() >= ebiVar.d)) {
                        y1aVar.removeMessages(17);
                        j3g j3gVar4 = this.c;
                        if (j3gVar4 != null) {
                            if (j3gVar4.a > 0 || a()) {
                                if (this.d == null) {
                                    this.d = new bci(this.o, bci.k, l3g.b, rv6.c);
                                }
                                this.d.d(j3gVar4);
                            }
                            this.c = null;
                        }
                    } else {
                        j3g j3gVar5 = this.c;
                        if (j3gVar5.b == null) {
                            j3gVar5.b = new ArrayList();
                        }
                        j3gVar5.b.add(mz9Var);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(mz9Var);
                    this.c = new j3g(i7, arrayList3);
                    y1aVar.sendMessageDelayed(y1aVar.obtainMessage(17), ebiVar.c);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
