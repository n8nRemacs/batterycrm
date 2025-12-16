package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public final class h06 {
    public static final Object j = new Object();
    public static final us k = new us(0);
    public final Context a;
    public final String b;
    public final q06 c;
    public final vl3 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final l18 g;
    public final rpc h;
    public final CopyOnWriteArrayList i;

    public h06(Context context, String str, q06 q06Var) throws PackageManager.NameNotFoundException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.a = context;
        s5j.c(str);
        this.b = str;
        this.c = q06Var;
        lb0 lb0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListH = new py0(context, 10, new ukd(12, ComponentDiscoveryService.class)).h();
        Trace.endSection();
        Trace.beginSection("Runtime");
        eqg eqgVar = eqg.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListH);
        int i = 1;
        arrayList.add(new ql3(i, new FirebaseCommonRegistrar()));
        arrayList.add(new ql3(i, new ExecutorsRegistrar()));
        arrayList2.add(cl3.c(context, Context.class, new Class[0]));
        arrayList2.add(cl3.c(this, h06.class, new Class[0]));
        arrayList2.add(cl3.c(q06Var, q06.class, new Class[0]));
        uha uhaVar = new uha(16);
        if (mxg.a(context) && FirebaseInitProvider.b.get()) {
            arrayList2.add(cl3.c(lb0Var, lb0.class, new Class[0]));
        }
        vl3 vl3Var = new vl3(eqgVar, arrayList, arrayList2, uhaVar);
        this.d = vl3Var;
        Trace.endSection();
        this.g = new l18(new ul3(this, 2, context));
        this.h = vl3Var.c(vm4.class);
        e06 e06Var = new e06(this);
        a();
        if (atomicBoolean.get()) {
            gf0.o.a.get();
        }
        copyOnWriteArrayList.add(e06Var);
        Trace.endSection();
    }

    public static h06 b() {
        h06 h06Var;
        synchronized (j) {
            try {
                h06Var = (h06) k.get("[DEFAULT]");
                if (h06Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + b6j.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((vm4) h06Var.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return h06Var;
    }

    public static h06 e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return b();
                }
                q06 q06VarA = q06.a(context);
                if (q06VarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, q06VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static h06 f(Context context, q06 q06Var) {
        h06 h06Var;
        AtomicReference atomicReference = f06.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f06.a;
            if (atomicReference2.get() == null) {
                f06 f06Var = new f06();
                while (true) {
                    if (atomicReference2.compareAndSet(null, f06Var)) {
                        gf0.a(application);
                        gf0 gf0Var = gf0.o;
                        gf0Var.getClass();
                        synchronized (gf0Var) {
                            gf0Var.c.add(f06Var);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            us usVar = k;
            s5j.i("FirebaseApp name [DEFAULT] already exists!", !usVar.containsKey("[DEFAULT]"));
            s5j.h(context, "Application context cannot be null.");
            h06Var = new h06(context, "[DEFAULT]", q06Var);
            usVar.put("[DEFAULT]", h06Var);
        }
        h06Var.d();
        return h06Var;
    }

    public final void a() {
        s5j.i("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        Context context = this.a;
        boolean zA = mxg.a(context);
        String str = this.b;
        if (zA) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            a();
            this.d.o("[DEFAULT]".equals(str));
            ((vm4) this.h.get()).b();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        AtomicReference atomicReference = g06.b;
        if (atomicReference.get() == null) {
            g06 g06Var = new g06(context);
            while (!atomicReference.compareAndSet(null, g06Var)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(g06Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h06)) {
            return false;
        }
        h06 h06Var = (h06) obj;
        h06Var.a();
        return this.b.equals(h06Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(this.b, SdkMetricStatEvent.NAME_KEY);
        h79Var.t(this.c, "options");
        return h79Var.toString();
    }
}
