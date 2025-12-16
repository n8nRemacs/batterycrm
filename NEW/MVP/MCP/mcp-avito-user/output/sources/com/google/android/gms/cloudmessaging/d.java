package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.camera.camera2.internal.G;
import androidx.collection.o1;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.InterfaceC37027j;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import j.InterfaceC42148d;
import j.N;
import j.P;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    public static int f348806h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f348807i;

    /* renamed from: j, reason: collision with root package name */
    public static final C f348808j = C.f348803b;

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f348809k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f348811b;

    /* renamed from: c, reason: collision with root package name */
    public final w f348812c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f348813d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f348815f;

    /* renamed from: g, reason: collision with root package name */
    public zzd f348816g;

    /* renamed from: a, reason: collision with root package name */
    @J41.a
    public final o1<String, C37028k<Bundle>> f348810a = new o1<>();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f348814e = new Messenger(new f(this, Looper.getMainLooper()));

    public d(@N Context context) {
        this.f348811b = context;
        this.f348812c = new w(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f348813d = scheduledThreadPoolExecutor;
    }

    @N
    public final Task<Bundle> a(@N final Bundle bundle) {
        int i12;
        int i13;
        PackageInfo packageInfoB;
        w wVar = this.f348812c;
        synchronized (wVar) {
            if (wVar.f348849b == 0) {
                try {
                    packageInfoB = aY0.c.a(wVar.f348848a).b("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e12) {
                    new StringBuilder(String.valueOf(e12).length() + 23);
                    packageInfoB = null;
                }
                if (packageInfoB != null) {
                    wVar.f348849b = packageInfoB.versionCode;
                }
                i12 = wVar.f348849b;
            } else {
                i12 = wVar.f348849b;
            }
        }
        if (i12 < 12000000) {
            return this.f348812c.a() != 0 ? b(bundle).l(f348808j, new InterfaceC37020c() { // from class: com.google.android.gms.cloudmessaging.x
                @Override // com.google.android.gms.tasks.InterfaceC37020c
                public final Object then(Task task) {
                    Bundle bundle2;
                    d dVar = this.f348851b;
                    dVar.getClass();
                    return (task.r() && (bundle2 = (Bundle) task.n()) != null && bundle2.containsKey("google.messenger")) ? dVar.b(bundle).t(d.f348808j, new InterfaceC37027j() { // from class: com.google.android.gms.cloudmessaging.A
                        @Override // com.google.android.gms.tasks.InterfaceC37027j
                        public final Task a(Object obj) {
                            Bundle bundle3 = (Bundle) obj;
                            int i14 = d.f348806h;
                            return (bundle3 == null || !bundle3.containsKey("google.messenger")) ? C37030m.f(bundle3) : C37030m.f(null);
                        }
                    }) : task;
                }
            }) : C37030m.e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        v vVarA = v.a(this.f348811b);
        synchronized (vVarA) {
            i13 = vVarA.f348847d;
            vVarA.f348847d = i13 + 1;
        }
        return vVarA.b(new u(i13, 1, bundle)).i(f348808j, new InterfaceC37020c() { // from class: com.google.android.gms.cloudmessaging.y
            @Override // com.google.android.gms.tasks.InterfaceC37020c
            public final Object then(Task task) throws IOException {
                if (task.r()) {
                    return (Bundle) task.n();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    new StringBuilder(String.valueOf(task.m()).length() + 22);
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.m());
            }
        });
    }

    @InterfaceC42148d
    public final Task<Bundle> b(Bundle bundle) throws RemoteException {
        final String string;
        synchronized (d.class) {
            int i12 = f348806h;
            f348806h = i12 + 1;
            string = Integer.toString(i12);
        }
        final C37028k<Bundle> c37028k = new C37028k<>();
        synchronized (this.f348810a) {
            this.f348810a.put(string, c37028k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f348812c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f348811b;
        synchronized (d.class) {
            try {
                if (f348807i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f348807i = zza.zza(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", f348807i);
            } finally {
            }
        }
        intent.putExtra("kid", G.g(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, HiAnalyticsConstant.REPORT_VAL_SEPARATOR));
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 8);
        }
        intent.putExtra("google.messenger", this.f348814e);
        if (this.f348815f != null || this.f348816g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f348815f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f348816g.f348857b;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
        } else if (this.f348812c.a() == 2) {
            this.f348811b.sendBroadcast(intent);
        } else {
            this.f348811b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f348813d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.B
            @Override // java.lang.Runnable
            public final void run() {
                c37028k.c(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        c37028k.f355672a.d(f348808j, new InterfaceC37022e() { // from class: com.google.android.gms.cloudmessaging.z
            @Override // com.google.android.gms.tasks.InterfaceC37022e
            public final void onComplete(Task task) {
                d dVar = this.f348854b;
                String str = string;
                ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                synchronized (dVar.f348810a) {
                    dVar.f348810a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return c37028k.f355672a;
    }

    public final void c(@P Bundle bundle, String str) {
        synchronized (this.f348810a) {
            try {
                C37028k<Bundle> c37028kRemove = this.f348810a.remove(str);
                if (c37028kRemove != null) {
                    c37028kRemove.b(bundle);
                    return;
                }
                String strValueOf = String.valueOf(str);
                if (strValueOf.length() != 0) {
                    "Missing callback for ".concat(strValueOf);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
