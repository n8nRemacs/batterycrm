package com.google.android.gms.common.api.internal;

import aY0.C19841a;
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
import androidx.collection.AbstractC20248z;
import androidx.collection.C20203c;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.C36690i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.AbstractC36711k;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.C36731x;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import r61.InterfaceC47501c;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
@InterfaceC36733z
/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36646i implements Handler.Callback {

    /* renamed from: q, reason: collision with root package name */
    @j.N
    public static final Status f349117q = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Status f349118r = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: s, reason: collision with root package name */
    public static final Object f349119s = new Object();

    /* renamed from: t, reason: collision with root package name */
    @InterfaceC25600a
    @j.P
    public static C36646i f349120t;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public TelemetryData f349123d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public com.google.android.gms.common.internal.service.p f349124e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f349125f;

    /* renamed from: g, reason: collision with root package name */
    public final C36687f f349126g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.common.internal.V f349127h;

    /* renamed from: o, reason: collision with root package name */
    @InterfaceC47501c
    public final zau f349134o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f349135p;

    /* renamed from: b, reason: collision with root package name */
    public long f349121b = 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f349122c = false;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f349128i = new AtomicInteger(1);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f349129j = new AtomicInteger(0);

    /* renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap f349130k = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: l, reason: collision with root package name */
    @InterfaceC25600a
    @j.P
    public I f349131l = null;

    /* renamed from: m, reason: collision with root package name */
    @InterfaceC25600a
    public final C20203c f349132m = new C20203c();

    /* renamed from: n, reason: collision with root package name */
    public final C20203c f349133n = new C20203c();

    @RX0.a
    public C36646i(Context context, Looper looper, C36687f c36687f) {
        this.f349135p = true;
        this.f349125f = context;
        zau zauVar = new zau(looper, this);
        this.f349134o = zauVar;
        this.f349126g = c36687f;
        this.f349127h = new com.google.android.gms.common.internal.V(c36687f);
        PackageManager packageManager = context.getPackageManager();
        if (com.google.android.gms.common.util.l.f349615d == null) {
            com.google.android.gms.common.util.l.f349615d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (com.google.android.gms.common.util.l.f349615d.booleanValue()) {
            this.f349135p = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    @RX0.a
    public static void a() {
        synchronized (f349119s) {
            try {
                C36646i c36646i = f349120t;
                if (c36646i != null) {
                    c36646i.f349129j.incrementAndGet();
                    zau zauVar = c36646i.f349134o;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status e(C36628c c36628c, ConnectionResult connectionResult) {
        return new Status(17, androidx.compose.ui.graphics.colorspace.e.n("API: ", c36628c.f349100b.f348912c, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.f348861d, connectionResult);
    }

    @ResultIgnorabilityUnspecified
    @j.N
    public static C36646i h(@j.N Context context) {
        C36646i c36646i;
        HandlerThread handlerThread;
        synchronized (f349119s) {
            if (f349120t == null) {
                synchronized (AbstractC36711k.f349444a) {
                    try {
                        handlerThread = AbstractC36711k.f349446c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            AbstractC36711k.f349446c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = AbstractC36711k.f349446c;
                        }
                    } finally {
                    }
                }
                f349120t = new C36646i(context.getApplicationContext(), handlerThread.getLooper(), C36687f.f349287e);
            }
            c36646i = f349120t;
        }
        return c36646i;
    }

    public final void b(@j.N I i12) {
        synchronized (f349119s) {
            try {
                if (this.f349131l != i12) {
                    this.f349131l = i12;
                    this.f349132m.clear();
                }
                this.f349132m.addAll(i12.f349011g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @j.l0
    public final boolean c() {
        if (this.f349122c) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C36731x.a().f349476a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f349370c) {
            return false;
        }
        int i12 = this.f349127h.f349386a.get(203400000, -1);
        return i12 == -1 || i12 == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(ConnectionResult connectionResult, int i12) throws Resources.NotFoundException {
        PendingIntent activity;
        C36687f c36687f = this.f349126g;
        c36687f.getClass();
        Context context = this.f349125f;
        if (C19841a.a(context)) {
            return false;
        }
        boolean zH2 = connectionResult.h();
        int i13 = connectionResult.f348860c;
        if (zH2) {
            activity = connectionResult.f348861d;
        } else {
            activity = null;
            Intent intentB = c36687f.b(context, i13, null);
            if (intentB != null) {
                activity = PendingIntent.getActivity(context, 0, intentB, com.google.android.gms.internal.common.zzd.zza | 134217728);
            }
        }
        if (activity == null) {
            return false;
        }
        int i14 = GoogleApiActivity.f348896c;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i12);
        intent.putExtra("notify_manager", true);
        c36687f.i(context, i13, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
        return true;
    }

    @ResultIgnorabilityUnspecified
    @j.l0
    public final C36676w0 f(com.google.android.gms.common.api.h hVar) {
        ConcurrentHashMap concurrentHashMap = this.f349130k;
        C36628c apiKey = hVar.getApiKey();
        C36676w0 c36676w0 = (C36676w0) concurrentHashMap.get(apiKey);
        if (c36676w0 == null) {
            c36676w0 = new C36676w0(this, hVar);
            concurrentHashMap.put(apiKey, c36676w0);
        }
        if (c36676w0.f349233b.requiresSignIn()) {
            this.f349133n.add(apiKey);
        }
        c36676w0.l();
        return c36676w0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.android.gms.tasks.C37028k r9, int r10, com.google.android.gms.common.api.h r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L78
            com.google.android.gms.common.api.internal.c r3 = r11.getApiKey()
            boolean r11 = r8.c()
            if (r11 != 0) goto Ld
            goto L49
        Ld:
            com.google.android.gms.common.internal.x r11 = com.google.android.gms.common.internal.C36731x.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = r11.f349476a
            r0 = 1
            if (r11 == 0) goto L4b
            boolean r1 = r11.f349370c
            if (r1 == 0) goto L49
            java.util.concurrent.ConcurrentHashMap r1 = r8.f349130k
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.common.api.internal.w0 r1 = (com.google.android.gms.common.api.internal.C36676w0) r1
            if (r1 == 0) goto L46
            com.google.android.gms.common.api.a$f r2 = r1.f349233b
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.AbstractC36699e
            if (r4 == 0) goto L49
            com.google.android.gms.common.internal.e r2 = (com.google.android.gms.common.internal.AbstractC36699e) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L46
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L46
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = com.google.android.gms.common.api.internal.K0.a(r1, r2, r10)
            if (r11 == 0) goto L49
            int r2 = r1.f349243y
            int r2 = r2 + r0
            r1.f349243y = r2
            boolean r0 = r11.f349308d
            goto L4b
        L46:
            boolean r0 = r11.f349371d
            goto L4b
        L49:
            r10 = 0
            goto L67
        L4b:
            com.google.android.gms.common.api.internal.K0 r11 = new com.google.android.gms.common.api.internal.K0
            r1 = 0
            if (r0 == 0) goto L56
            long r4 = java.lang.System.currentTimeMillis()
            goto L57
        L56:
            r4 = r1
        L57:
            if (r0 == 0) goto L5f
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L60
        L5f:
            r6 = r1
        L60:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L67:
            if (r10 == 0) goto L78
            com.google.android.gms.internal.base.zau r11 = r8.f349134o
            r11.getClass()
            com.google.android.gms.common.api.internal.q0 r0 = new com.google.android.gms.common.api.internal.q0
            r0.<init>()
            com.google.android.gms.tasks.P r9 = r9.f355672a
            r9.d(r0, r10)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C36646i.g(com.google.android.gms.tasks.k, int, com.google.android.gms.common.api.h):void");
    }

    @Override // android.os.Handler.Callback
    @j.l0
    public final boolean handleMessage(@j.N Message message) {
        C36676w0 c36676w0;
        Feature[] featureArrG;
        int i12 = message.what;
        zau zauVar = this.f349134o;
        ConcurrentHashMap concurrentHashMap = this.f349130k;
        switch (i12) {
            case 1:
                this.f349121b = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zauVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, (C36628c) it.next()), this.f349121b);
                }
                return true;
            case 2:
                ((s1) message.obj).getClass();
                throw null;
            case 3:
                for (C36676w0 c36676w02 : concurrentHashMap.values()) {
                    C36729v.d(c36676w02.f349244z.f349134o);
                    c36676w02.f349242x = null;
                    c36676w02.l();
                }
                return true;
            case 4:
            case 8:
            case 13:
                O0 o02 = (O0) message.obj;
                C36676w0 c36676w0F = (C36676w0) concurrentHashMap.get(o02.f349043c.getApiKey());
                if (c36676w0F == null) {
                    c36676w0F = f(o02.f349043c);
                }
                boolean zRequiresSignIn = c36676w0F.f349233b.requiresSignIn();
                p1 p1Var = o02.f349041a;
                if (!zRequiresSignIn || this.f349129j.get() == o02.f349042b) {
                    c36676w0F.m(p1Var);
                } else {
                    p1Var.a(f349117q);
                    c36676w0F.p();
                }
                return true;
            case 5:
                int i13 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c36676w0 = (C36676w0) it2.next();
                        if (c36676w0.f349238t == i13) {
                        }
                    } else {
                        c36676w0 = null;
                    }
                }
                if (c36676w0 == null) {
                    Log.wtf("GoogleApiManager", androidx.camera.camera2.internal.G.e(i13, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                } else if (connectionResult.f348860c == 13) {
                    this.f349126g.getClass();
                    AtomicBoolean atomicBoolean = C36690i.f349291a;
                    StringBuilder sbA = androidx.appcompat.app.r.A("Error resolution was canceled by the user, original error message: ", ConnectionResult.j(connectionResult.f348860c), ": ");
                    sbA.append(connectionResult.f348862e);
                    c36676w0.c(new Status(17, sbA.toString(), null, null));
                } else {
                    c36676w0.c(e(c36676w0.f349234p, connectionResult));
                }
                return true;
            case 6:
                Context context = this.f349125f;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C36631d.b((Application) context.getApplicationContext());
                    ComponentCallbacks2C36631d componentCallbacks2C36631d = ComponentCallbacks2C36631d.f349105f;
                    C36666r0 c36666r0 = new C36666r0(this);
                    componentCallbacks2C36631d.getClass();
                    synchronized (componentCallbacks2C36631d) {
                        componentCallbacks2C36631d.f349108d.add(c36666r0);
                    }
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C36631d.f349107c;
                    boolean z12 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C36631d.f349106b;
                    if (!z12) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f349121b = 300000L;
                    }
                }
                return true;
            case 7:
                f((com.google.android.gms.common.api.h) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C36676w0 c36676w03 = (C36676w0) concurrentHashMap.get(message.obj);
                    C36729v.d(c36676w03.f349244z.f349134o);
                    if (c36676w03.f349240v) {
                        c36676w03.l();
                    }
                }
                return true;
            case 10:
                C20203c c20203c = this.f349133n;
                Iterator it3 = c20203c.iterator();
                while (true) {
                    AbstractC20248z abstractC20248z = (AbstractC20248z) it3;
                    if (!abstractC20248z.hasNext()) {
                        c20203c.clear();
                        return true;
                    }
                    C36676w0 c36676w04 = (C36676w0) concurrentHashMap.remove((C36628c) abstractC20248z.next());
                    if (c36676w04 != null) {
                        c36676w04.p();
                    }
                }
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C36676w0 c36676w05 = (C36676w0) concurrentHashMap.get(message.obj);
                    C36646i c36646i = c36676w05.f349244z;
                    C36729v.d(c36646i.f349134o);
                    boolean z13 = c36676w05.f349240v;
                    if (z13) {
                        if (z13) {
                            C36646i c36646i2 = c36676w05.f349244z;
                            zau zauVar2 = c36646i2.f349134o;
                            C36628c c36628c = c36676w05.f349234p;
                            zauVar2.removeMessages(11, c36628c);
                            c36646i2.f349134o.removeMessages(9, c36628c);
                            c36676w05.f349240v = false;
                        }
                        c36676w05.c(c36646i.f349126g.c(C36688g.f349288a, c36646i.f349125f) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        c36676w05.f349233b.disconnect("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((C36676w0) concurrentHashMap.get(message.obj)).k(true);
                }
                return true;
            case 14:
                ((J) message.obj).getClass();
                if (!concurrentHashMap.containsKey(null)) {
                    throw null;
                }
                ((C36676w0) concurrentHashMap.get(null)).k(false);
                throw null;
            case 15:
                C36680y0 c36680y0 = (C36680y0) message.obj;
                if (concurrentHashMap.containsKey(c36680y0.f349250a)) {
                    C36676w0 c36676w06 = (C36676w0) concurrentHashMap.get(c36680y0.f349250a);
                    if (c36676w06.f349241w.contains(c36680y0) && !c36676w06.f349240v) {
                        if (c36676w06.f349233b.isConnected()) {
                            c36676w06.e();
                        } else {
                            c36676w06.l();
                        }
                    }
                }
                return true;
            case 16:
                C36680y0 c36680y02 = (C36680y0) message.obj;
                if (concurrentHashMap.containsKey(c36680y02.f349250a)) {
                    C36676w0 c36676w07 = (C36676w0) concurrentHashMap.get(c36680y02.f349250a);
                    if (c36676w07.f349241w.remove(c36680y02)) {
                        C36646i c36646i3 = c36676w07.f349244z;
                        c36646i3.f349134o.removeMessages(15, c36680y02);
                        c36646i3.f349134o.removeMessages(16, c36680y02);
                        LinkedList linkedList = c36676w07.f349232a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it4 = linkedList.iterator();
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            Feature feature = c36680y02.f349251b;
                            if (zHasNext) {
                                p1 p1Var2 = (p1) it4.next();
                                if ((p1Var2 instanceof G0) && (featureArrG = ((G0) p1Var2).g(c36676w07)) != null) {
                                    int length = featureArrG.length;
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= length) {
                                            break;
                                        }
                                        if (!C36727t.a(featureArrG[i14], feature)) {
                                            i14++;
                                        } else if (i14 >= 0) {
                                            arrayList.add(p1Var2);
                                        }
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i15 = 0; i15 < size; i15++) {
                                    p1 p1Var3 = (p1) arrayList.get(i15);
                                    linkedList.remove(p1Var3);
                                    p1Var3.b(new UnsupportedApiCallException(feature));
                                }
                            }
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.f349123d;
                if (telemetryData != null) {
                    if (telemetryData.f349375b > 0 || c()) {
                        if (this.f349124e == null) {
                            this.f349124e = new com.google.android.gms.common.internal.service.p(this.f349125f, com.google.android.gms.common.internal.service.p.f349461k, com.google.android.gms.common.internal.D.f349312c, h.a.f348930c);
                        }
                        this.f349124e.d(telemetryData);
                    }
                    this.f349123d = null;
                }
                return true;
            case 18:
                L0 l02 = (L0) message.obj;
                long j12 = l02.f349031c;
                MethodInvocation methodInvocation = l02.f349029a;
                int i16 = l02.f349030b;
                if (j12 == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i16, Arrays.asList(methodInvocation));
                    if (this.f349124e == null) {
                        this.f349124e = new com.google.android.gms.common.internal.service.p(this.f349125f, com.google.android.gms.common.internal.service.p.f349461k, com.google.android.gms.common.internal.D.f349312c, h.a.f348930c);
                    }
                    this.f349124e.d(telemetryData2);
                } else {
                    TelemetryData telemetryData3 = this.f349123d;
                    if (telemetryData3 != null) {
                        List list = telemetryData3.f349376c;
                        if (telemetryData3.f349375b != i16 || (list != null && list.size() >= l02.f349032d)) {
                            zauVar.removeMessages(17);
                            TelemetryData telemetryData4 = this.f349123d;
                            if (telemetryData4 != null) {
                                if (telemetryData4.f349375b > 0 || c()) {
                                    if (this.f349124e == null) {
                                        this.f349124e = new com.google.android.gms.common.internal.service.p(this.f349125f, com.google.android.gms.common.internal.service.p.f349461k, com.google.android.gms.common.internal.D.f349312c, h.a.f348930c);
                                    }
                                    this.f349124e.d(telemetryData4);
                                }
                                this.f349123d = null;
                            }
                        } else {
                            TelemetryData telemetryData5 = this.f349123d;
                            if (telemetryData5.f349376c == null) {
                                telemetryData5.f349376c = new ArrayList();
                            }
                            telemetryData5.f349376c.add(methodInvocation);
                        }
                    }
                    if (this.f349123d == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(methodInvocation);
                        this.f349123d = new TelemetryData(i16, arrayList2);
                        zauVar.sendMessageDelayed(zauVar.obtainMessage(17), l02.f349031c);
                    }
                }
                return true;
            case 19:
                this.f349122c = false;
                return true;
            default:
                return false;
        }
    }

    @j.N
    public final Task i(@j.N com.google.android.gms.common.api.h hVar, @j.N AbstractC36669t abstractC36669t, @j.N C c12, @j.N Runnable runnable) {
        C37028k c37028k = new C37028k();
        g(c37028k, abstractC36669t.f349211d, hVar);
        O0 o02 = new O0(new m1(new P0(abstractC36669t, c12, runnable), c37028k), this.f349129j.get(), hVar);
        zau zauVar = this.f349134o;
        zauVar.sendMessage(zauVar.obtainMessage(8, o02));
        return c37028k.f355672a;
    }

    public final void j(@j.N ConnectionResult connectionResult, int i12) {
        if (d(connectionResult, i12)) {
            return;
        }
        zau zauVar = this.f349134o;
        zauVar.sendMessage(zauVar.obtainMessage(5, i12, 0, connectionResult));
    }
}
