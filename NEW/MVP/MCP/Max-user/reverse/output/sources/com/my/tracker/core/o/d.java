package com.my.tracker.core.o;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.my.tracker.core.EnginePrefs;
import com.my.tracker.core.Tracer;
import defpackage.vva;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d {
    private final Application a;
    private final EnginePrefs b;
    private final AtomicReference c = new AtomicReference();
    protected boolean d = false;

    public static final class a {
        public static final boolean a;

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        static {
            /*
                java.lang.Class<com.google.android.gms.appset.AppSet> r0 = com.google.android.gms.appset.AppSet.class
                java.lang.String r1 = "com.google.android.gms.appset.AppSet"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L28
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L38
                java.lang.Class<com.google.android.gms.appset.AppSetIdClient> r0 = com.google.android.gms.appset.AppSetIdClient.class
                java.lang.Class<com.google.android.gms.appset.AppSetIdClient> r1 = com.google.android.gms.appset.AppSetIdClient.class
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L38
                java.lang.Class<com.google.android.gms.appset.AppSetIdInfo> r0 = com.google.android.gms.appset.AppSetIdInfo.class
                java.lang.String r1 = "com.google.android.gms.appset.AppSetIdInfo"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L28
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L38
                r0 = 1
                goto L39
            L28:
                r0 = move-exception
                boolean r1 = r0 instanceof java.lang.NoClassDefFoundError
                if (r1 == 0) goto L33
                java.lang.String r0 = "AppSetIdProvider: App Set library classes not found"
                com.my.tracker.core.Tracer.d(r0)
                goto L38
            L33:
                java.lang.String r1 = "AppSetIdProvider: error occurred while working with App Set library classes"
                com.my.tracker.core.Tracer.d(r1, r0)
            L38:
                r0 = 0
            L39:
                com.my.tracker.core.o.d.a.a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.core.o.d.a.<clinit>():void");
        }
    }

    public d(Application application, EnginePrefs enginePrefs) {
        this.a = application;
        this.b = enginePrefs;
    }

    private void c() {
        final String string = this.b.getString("appSetId");
        final int i = (int) this.b.getLong("appSetIdScope");
        if (!TextUtils.isEmpty(string)) {
            this.c.set(new c(string, i));
        }
        if (!a.a) {
            Tracer.d("AppSetIdProvider: app set library is not available");
            return;
        }
        Executor executorA = g.a();
        if (executorA == null) {
            Tracer.e("AppSetIdProvider: background executor is not found");
            return;
        }
        try {
            AppSet.getClient(this.a).getAppSetIdInfo().d(executorA, new vva() { // from class: e9i
                @Override // defpackage.vva
                public final void a(Object obj) {
                    this.a.a(i, string, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th) {
            Tracer.d("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    public c b() {
        if (!this.d) {
            c();
            this.d = true;
        }
        return (c) this.c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != i) {
            this.b.setLong("appSetIdScope", scope);
        }
        String id = appSetIdInfo.getId();
        if (!id.equals(str)) {
            this.b.setString("appSetId", id);
            Tracer.d("AppSetIdProvider: new id value has been received: ".concat(id));
        }
        if (TextUtils.isEmpty(id) || scope == -1) {
            this.c.set(null);
        } else {
            this.c.set(new c(id, scope));
        }
        synchronized (this.c) {
            this.c.notify();
        }
    }

    private void a() {
        try {
            c cVar = (c) this.c.get();
            if (cVar != null) {
                Tracer.d("AppSetIdProvider: app set id has been collected, value: " + cVar.a);
            } else {
                synchronized (this.c) {
                    this.c.wait(300L);
                }
                Tracer.d("AppSetIdProvider: timeout for collecting id has exceeded");
            }
        } catch (Throwable th) {
            Tracer.d("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }
}
