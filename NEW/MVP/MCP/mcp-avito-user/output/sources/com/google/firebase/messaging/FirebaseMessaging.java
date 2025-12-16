package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37027j;
import com.google.android.gms.tasks.Task;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.G;
import j.k0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tZ0.C48621a;
import tZ0.InterfaceC48622b;
import tZ0.InterfaceC48624d;
import vZ0.InterfaceC49287a;

/* loaded from: classes6.dex */
public class FirebaseMessaging {

    /* renamed from: n, reason: collision with root package name */
    public static final long f361748n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o, reason: collision with root package name */
    @j.B
    public static G f361749o;

    /* renamed from: p, reason: collision with root package name */
    @k0
    @SuppressLint({"FirebaseUnknownNullness"})
    @j.P
    public static com.google.android.datatransport.h f361750p;

    /* renamed from: q, reason: collision with root package name */
    @j.B
    @k0
    public static ScheduledThreadPoolExecutor f361751q;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f361752a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final InterfaceC49287a f361753b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.firebase.installations.i f361754c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f361755d;

    /* renamed from: e, reason: collision with root package name */
    public final r f361756e;

    /* renamed from: f, reason: collision with root package name */
    public final C f361757f;

    /* renamed from: g, reason: collision with root package name */
    public final a f361758g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f361759h;

    /* renamed from: i, reason: collision with root package name */
    public final ExecutorService f361760i;

    /* renamed from: j, reason: collision with root package name */
    public final ThreadPoolExecutor f361761j;

    /* renamed from: k, reason: collision with root package name */
    public final u f361762k;

    /* renamed from: l, reason: collision with root package name */
    @j.B
    public boolean f361763l;

    /* renamed from: m, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f361764m;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC48624d f361765a;

        /* renamed from: b, reason: collision with root package name */
        @j.B
        public boolean f361766b;

        /* renamed from: c, reason: collision with root package name */
        @j.B
        @j.P
        public Boolean f361767c;

        public a(InterfaceC48624d interfaceC48624d) {
            this.f361765a = interfaceC48624d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.firebase.messaging.q] */
        public final synchronized boolean a() {
            try {
                synchronized (this) {
                    try {
                        if (!this.f361766b) {
                            Boolean boolB = b();
                            this.f361767c = boolB;
                            if (boolB == null) {
                                this.f361765a.b(new InterfaceC48622b() { // from class: com.google.firebase.messaging.q
                                    @Override // tZ0.InterfaceC48622b
                                    public final void a(C48621a c48621a) {
                                        FirebaseMessaging.a aVar = this.f361884a;
                                        if (aVar.a()) {
                                            G g12 = FirebaseMessaging.f361749o;
                                            FirebaseMessaging.this.f();
                                        }
                                    }
                                });
                            }
                            this.f361766b = true;
                        }
                    } finally {
                    }
                }
                return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f361752a.h();
            } catch (Throwable th2) {
                throw th2;
            }
            Boolean bool = this.f361767c;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f361752a.h();
        }

        @j.P
        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            com.google.firebase.g gVar = FirebaseMessaging.this.f361752a;
            gVar.a();
            Context context = gVar.f361595a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(com.google.firebase.g gVar, @j.P InterfaceC49287a interfaceC49287a, wZ0.b<com.google.firebase.platforminfo.i> bVar, wZ0.b<HeartBeatInfo> bVar2, com.google.firebase.installations.i iVar, @j.P com.google.android.datatransport.h hVar, InterfaceC48624d interfaceC48624d) {
        final int i12 = 1;
        final int i13 = 0;
        gVar.a();
        Context context = gVar.f361595a;
        final u uVar = new u(context);
        final r rVar = new r(gVar, uVar, bVar, bVar2, iVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.b("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b("Firebase-Messaging-File-Io"));
        this.f361763l = false;
        f361750p = hVar;
        this.f361752a = gVar;
        this.f361753b = interfaceC49287a;
        this.f361754c = iVar;
        this.f361758g = new a(interfaceC48624d);
        gVar.a();
        final Context context2 = gVar.f361595a;
        this.f361755d = context2;
        C37618l c37618l = new C37618l();
        this.f361762k = uVar;
        this.f361760i = executorServiceNewSingleThreadExecutor;
        this.f361756e = rVar;
        this.f361757f = new C(executorServiceNewSingleThreadExecutor);
        this.f361759h = scheduledThreadPoolExecutor;
        this.f361761j = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c37618l);
        } else {
            Objects.toString(context);
        }
        if (interfaceC49287a != null) {
            interfaceC49287a.b();
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f361875c;

            {
                this.f361875c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i13) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f361875c;
                        if (firebaseMessaging.f361758g.a()) {
                            firebaseMessaging.f();
                            break;
                        }
                        break;
                    default:
                        Context context3 = this.f361875c.f361755d;
                        Context applicationContext2 = context3.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context3;
                        }
                        if (!applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            try {
                                applicationContext = context3.getApplicationContext();
                                packageManager = applicationContext.getPackageManager();
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            boolean z12 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            if (Build.VERSION.SDK_INT < 29) {
                                C37030m.f(null);
                                break;
                            } else {
                                new com.avito.android.beduin.common.component.bar_chart.c(context3, z12, new C37028k()).run();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b("Firebase-Messaging-Topics-Io"));
        int i14 = L.f361794j;
        C37030m.c(new Callable() { // from class: com.google.firebase.messaging.K
            @Override // java.util.concurrent.Callable
            public final Object call() {
                J j12;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                u uVar2 = uVar;
                r rVar2 = rVar;
                int i15 = L.f361794j;
                synchronized (J.class) {
                    try {
                        WeakReference<J> weakReference = J.f361785c;
                        j12 = weakReference != null ? weakReference.get() : null;
                        if (j12 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            J j13 = new J(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (j13) {
                                j13.f361786a = F.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            J.f361785c = new WeakReference<>(j13);
                            j12 = j13;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new L(firebaseMessaging, uVar2, j12, rVar2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).h(scheduledThreadPoolExecutor, new C37620n(this, i13));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f361875c;

            {
                this.f361875c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i12) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f361875c;
                        if (firebaseMessaging.f361758g.a()) {
                            firebaseMessaging.f();
                            break;
                        }
                        break;
                    default:
                        Context context3 = this.f361875c.f361755d;
                        Context applicationContext2 = context3.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context3;
                        }
                        if (!applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            try {
                                applicationContext = context3.getApplicationContext();
                                packageManager = applicationContext.getPackageManager();
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            boolean z12 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            if (Build.VERSION.SDK_INT < 29) {
                                C37030m.f(null);
                                break;
                            } else {
                                new com.avito.android.beduin.common.component.bar_chart.c(context3, z12, new C37028k()).run();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(long j12, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f361751q == null) {
                    f361751q = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b("TAG"));
                }
                f361751q.schedule(runnable, j12, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @j.N
    public static synchronized G c(Context context) {
        try {
            if (f361749o == null) {
                f361749o = new G(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f361749o;
    }

    @j.N
    @Keep
    public static synchronized FirebaseMessaging getInstance(@j.N com.google.firebase.g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        C36729v.k(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        Task taskL;
        InterfaceC49287a interfaceC49287a = this.f361753b;
        if (interfaceC49287a != null) {
            try {
                return (String) C37030m.a(interfaceC49287a.d());
            } catch (InterruptedException | ExecutionException e12) {
                throw new IOException(e12);
            }
        }
        final G.a aVarE = e();
        if (!h(aVarE)) {
            return aVarE.f361773a;
        }
        final String strB = u.b(this.f361752a);
        C c12 = this.f361757f;
        synchronized (c12) {
            taskL = (Task) c12.f361735b.get(strB);
            if (taskL != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                r rVar = this.f361756e;
                taskL = rVar.a(rVar.c(u.b(rVar.f361885a), "*", new Bundle())).t(this.f361761j, new InterfaceC37027j() { // from class: com.google.firebase.messaging.p
                    @Override // com.google.android.gms.tasks.InterfaceC37027j
                    public final Task a(Object obj) {
                        String string;
                        FirebaseMessaging firebaseMessaging = this.f361881a;
                        String str = strB;
                        G.a aVar = aVarE;
                        String str2 = (String) obj;
                        G gC2 = FirebaseMessaging.c(firebaseMessaging.f361755d);
                        String strD = firebaseMessaging.d();
                        String strA = firebaseMessaging.f361762k.a();
                        synchronized (gC2) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i12 = G.a.f361772e;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("token", str2);
                                jSONObject.put("appVersion", strA);
                                jSONObject.put("timestamp", jCurrentTimeMillis);
                                string = jSONObject.toString();
                            } catch (JSONException e13) {
                                e13.toString();
                                string = null;
                            }
                            if (string != null) {
                                SharedPreferences.Editor editorEdit = gC2.f361770a.edit();
                                editorEdit.putString(G.a(strD, str), string);
                                editorEdit.commit();
                            }
                        }
                        if (aVar == null || !str2.equals(aVar.f361773a)) {
                            com.google.firebase.g gVar = firebaseMessaging.f361752a;
                            gVar.a();
                            if ("[DEFAULT]".equals(gVar.f361596b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    gVar.a();
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new C37616j(firebaseMessaging.f361755d).c(intent);
                            }
                        }
                        return C37030m.f(str2);
                    }
                }).l(c12.f361734a, new B(0, c12, strB));
                c12.f361735b.put(strB, taskL);
            }
        }
        try {
            return (String) C37030m.a(taskL);
        } catch (InterruptedException | ExecutionException e13) {
            throw new IOException(e13);
        }
    }

    public final String d() {
        com.google.firebase.g gVar = this.f361752a;
        gVar.a();
        return "[DEFAULT]".equals(gVar.f361596b) ? "" : gVar.d();
    }

    @k0
    @j.P
    public final G.a e() {
        G.a aVarA;
        G gC2 = c(this.f361755d);
        String strD = d();
        String strB = u.b(this.f361752a);
        synchronized (gC2) {
            aVarA = G.a.a(gC2.f361770a.getString(G.a(strD, strB), null));
        }
        return aVarA;
    }

    public final void f() {
        InterfaceC49287a interfaceC49287a = this.f361753b;
        if (interfaceC49287a != null) {
            interfaceC49287a.c();
        } else if (h(e())) {
            synchronized (this) {
                if (!this.f361763l) {
                    g(0L);
                }
            }
        }
    }

    public final synchronized void g(long j12) {
        b(j12, new H(this, Math.min(Math.max(30L, 2 * j12), f361748n)));
        this.f361763l = true;
    }

    @k0
    public final boolean h(@j.P G.a aVar) {
        if (aVar != null) {
            String strA = this.f361762k.a();
            if (System.currentTimeMillis() <= aVar.f361775c + G.a.f361771d && strA.equals(aVar.f361774b)) {
                return false;
            }
        }
        return true;
    }
}
