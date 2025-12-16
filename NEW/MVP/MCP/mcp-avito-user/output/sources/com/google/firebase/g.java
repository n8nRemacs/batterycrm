package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Trace;
import androidx.collection.C20199a;
import androidx.core.os.N;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C36631d;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.common.util.x;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.l;
import com.google.firebase.components.p;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.provider.FirebaseInitProvider;
import j.B;
import j.P;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tZ0.InterfaceC48623c;

/* compiled from: FirebaseApp.java */
/* loaded from: classes10.dex */
public class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f361593j = new Object();

    /* renamed from: k, reason: collision with root package name */
    @B
    public static final C20199a f361594k = new C20199a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f361595a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361596b;

    /* renamed from: c, reason: collision with root package name */
    public final m f361597c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.components.l f361598d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f361599e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f361600f;

    /* renamed from: g, reason: collision with root package name */
    public final p<AZ0.a> f361601g;

    /* renamed from: h, reason: collision with root package name */
    public final wZ0.b<com.google.firebase.heartbeatinfo.f> f361602h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f361603i;

    /* compiled from: FirebaseApp.java */
    @RX0.a
    public interface a {
        @RX0.a
        void a(boolean z12);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    public static class b implements ComponentCallbacks2C36631d.a {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicReference<b> f361604a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C36631d.a
        public final void a(boolean z12) {
            synchronized (g.f361593j) {
                try {
                    Iterator it = new ArrayList(g.f361594k.values()).iterator();
                    while (it.hasNext()) {
                        g gVar = (g) it.next();
                        if (gVar.f361599e.get()) {
                            Iterator it2 = gVar.f361603i.iterator();
                            while (it2.hasNext()) {
                                ((a) it2.next()).a(z12);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final AtomicReference<c> f361605b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        public final Context f361606a;

        public c(Context context) {
            this.f361606a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (g.f361593j) {
                try {
                    Iterator it = g.f361594k.values().iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f361606a.unregisterReceiver(this);
        }
    }

    public g(final Context context, String str, m mVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f361599e = atomicBoolean;
        this.f361600f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f361603i = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.f361595a = context;
        C36729v.f(str);
        this.f361596b = str;
        this.f361597c = mVar;
        o oVar = FirebaseInitProvider.f361950b;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListA = com.google.firebase.components.e.b(context, ComponentDiscoveryService.class).a();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l.b bVar = new l.b(UiExecutor.f360801b);
        ArrayList arrayList = bVar.f360761b;
        arrayList.addAll(arrayListA);
        arrayList.add(new com.google.firebase.components.d(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new com.google.firebase.components.d(new ExecutorsRegistrar(), 1));
        bVar.a(com.google.firebase.components.b.c(context, Context.class, new Class[0]));
        bVar.a(com.google.firebase.components.b.c(this, g.class, new Class[0]));
        bVar.a(com.google.firebase.components.b.c(mVar, m.class, new Class[0]));
        bVar.f360763d = new FZ0.a();
        if (N.a(context) && FirebaseInitProvider.f361951c.get()) {
            bVar.a(com.google.firebase.components.b.c(oVar, o.class, new Class[0]));
        }
        com.google.firebase.components.l lVar = new com.google.firebase.components.l(bVar.f360760a, arrayList, bVar.f360762c, bVar.f360763d, null);
        this.f361598d = lVar;
        Trace.endSection();
        this.f361601g = new p<>(new wZ0.b() { // from class: com.google.firebase.e
            @Override // wZ0.b
            public final Object get() {
                Object obj = g.f361593j;
                g gVar = this.f361542a;
                return new AZ0.a(context, gVar.d(), (InterfaceC48623c) gVar.f361598d.a(InterfaceC48623c.class));
            }
        });
        this.f361602h = lVar.b(com.google.firebase.heartbeatinfo.f.class);
        a aVar = new a() { // from class: com.google.firebase.f
            @Override // com.google.firebase.g.a
            public final void a(boolean z12) {
                g gVar = this.f361592a;
                if (!z12) {
                    gVar.f361602h.get().c();
                } else {
                    Object obj = g.f361593j;
                    gVar.getClass();
                }
            }
        };
        a();
        if (atomicBoolean.get() && ComponentCallbacks2C36631d.f349105f.f349106b.get()) {
            aVar.a(true);
        }
        copyOnWriteArrayList.add(aVar);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.N
    public static g c() {
        g gVar;
        synchronized (f361593j) {
            try {
                gVar = (g) f361594k.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + x.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                gVar.f361602h.get().c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @j.N
    public static g f(@j.N Context context, @j.N m mVar) {
        g gVar;
        AtomicReference<b> atomicReference = b.f361604a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f361604a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        ComponentCallbacks2C36631d.b(application);
                        ComponentCallbacks2C36631d componentCallbacks2C36631d = ComponentCallbacks2C36631d.f349105f;
                        componentCallbacks2C36631d.getClass();
                        synchronized (componentCallbacks2C36631d) {
                            componentCallbacks2C36631d.f349108d.add(bVar);
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
        synchronized (f361593j) {
            C20199a c20199a = f361594k;
            C36729v.l("FirebaseApp name [DEFAULT] already exists!", !c20199a.containsKey("[DEFAULT]"));
            C36729v.k(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", mVar);
            c20199a.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    @P
    public static void g(@j.N Context context) {
        synchronized (f361593j) {
            try {
                if (f361594k.containsKey("[DEFAULT]")) {
                    c();
                    return;
                }
                m mVarA = m.a(context);
                if (mVarA == null) {
                    return;
                }
                f(context, mVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        C36729v.l("FirebaseApp was deleted", !this.f361600f.get());
    }

    @RX0.a
    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.f361598d.a(cls);
    }

    @RX0.a
    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(C36749c.b(this.f361596b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(C36749c.b(this.f361597c.f361725b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        Context context = this.f361595a;
        if (N.a(context)) {
            a();
            a();
            this.f361598d.k("[DEFAULT]".equals(this.f361596b));
            this.f361602h.get().c();
            return;
        }
        a();
        AtomicReference<c> atomicReference = c.f361605b;
        if (atomicReference.get() == null) {
            c cVar = new c(context);
            while (!atomicReference.compareAndSet(null, cVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f361596b.equals(gVar.f361596b);
    }

    @RX0.a
    public final boolean h() {
        boolean z12;
        a();
        AZ0.a aVar = this.f361601g.get();
        synchronized (aVar) {
            z12 = aVar.f447b;
        }
        return z12;
    }

    public final int hashCode() {
        return this.f361596b.hashCode();
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f361596b, "name");
        aVarB.a(this.f361597c, "options");
        return aVarB.toString();
    }
}
