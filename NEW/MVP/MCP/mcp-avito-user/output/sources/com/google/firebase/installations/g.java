package com.google.firebase.installations;

import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.P;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.c;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import j.B;
import j.N;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import zZ0.C50533b;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes6.dex */
public class g implements i {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f361637m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f361638a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.installations.remote.c f361639b;

    /* renamed from: c, reason: collision with root package name */
    public final PersistedInstallation f361640c;

    /* renamed from: d, reason: collision with root package name */
    public final p f361641d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.components.p<com.google.firebase.installations.local.b> f361642e;

    /* renamed from: f, reason: collision with root package name */
    public final n f361643f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f361644g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f361645h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f361646i;

    /* renamed from: j, reason: collision with root package name */
    @B
    public String f361647j;

    /* renamed from: k, reason: collision with root package name */
    @B
    public final HashSet f361648k;

    /* renamed from: l, reason: collision with root package name */
    @B
    public final ArrayList f361649l;

    /* compiled from: FirebaseInstallations.java */
    public class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f361650b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f361650b.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f361651a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f361652b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f361652b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f361652b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f361652b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f361651a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f361651a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g(final com.google.firebase.g gVar, @N wZ0.b<com.google.firebase.heartbeatinfo.i> bVar, @N ExecutorService executorService, @N Executor executor) {
        gVar.a();
        com.google.firebase.installations.remote.c cVar = new com.google.firebase.installations.remote.c(gVar.f361595a, bVar);
        PersistedInstallation persistedInstallation = new PersistedInstallation(gVar);
        if (C50533b.f444077a == null) {
            Pattern pattern = p.f361685c;
            C50533b.f444077a = new C50533b();
        }
        C50533b c50533b = C50533b.f444077a;
        if (p.f361686d == null) {
            p.f361686d = new p(c50533b);
        }
        p pVar = p.f361686d;
        com.google.firebase.components.p<com.google.firebase.installations.local.b> pVar2 = new com.google.firebase.components.p<>(new wZ0.b() { // from class: com.google.firebase.installations.e
            @Override // wZ0.b
            public final Object get() {
                Object obj = g.f361637m;
                return new com.google.firebase.installations.local.b(gVar);
            }
        });
        n nVar = new n();
        this.f361644g = new Object();
        this.f361648k = new HashSet();
        this.f361649l = new ArrayList();
        this.f361638a = gVar;
        this.f361639b = cVar;
        this.f361640c = persistedInstallation;
        this.f361641d = pVar;
        this.f361642e = pVar2;
        this.f361643f = nVar;
        this.f361645h = executorService;
        this.f361646i = executor;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        com.google.firebase.installations.local.c cVarC;
        synchronized (f361637m) {
            try {
                com.google.firebase.g gVar = this.f361638a;
                gVar.a();
                d dVarA = d.a(gVar.f361595a);
                try {
                    cVarC = this.f361640c.c();
                    if (cVarC.f() == PersistedInstallation.RegistrationStatus.f361659c || cVarC.f() == PersistedInstallation.RegistrationStatus.f361658b) {
                        String strE = e(cVarC);
                        PersistedInstallation persistedInstallation = this.f361640c;
                        c.a aVarH = cVarC.h();
                        aVarH.d(strE);
                        aVarH.f(PersistedInstallation.RegistrationStatus.f361660d);
                        cVarC = aVarH.a();
                        persistedInstallation.b(cVarC);
                    }
                    if (dVarA != null) {
                        dVarA.b();
                    }
                } catch (Throwable th2) {
                    if (dVarA != null) {
                        dVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        h(cVarC);
        this.f361646i.execute(new f(this, 0));
    }

    public final com.google.firebase.installations.local.c b(@N com.google.firebase.installations.local.c cVar) throws FirebaseInstallationsException {
        com.google.firebase.g gVar = this.f361638a;
        gVar.a();
        String str = gVar.f361597c.f361724a;
        String strC = cVar.c();
        com.google.firebase.g gVar2 = this.f361638a;
        gVar2.a();
        TokenResult tokenResultB = this.f361639b.b(str, strC, gVar2.f361597c.f361730g, cVar.e());
        int iOrdinal = tokenResultB.b().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return cVar.i();
            }
            if (iOrdinal != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f361647j = null;
            }
            c.a aVarH = cVar.h();
            aVarH.f(PersistedInstallation.RegistrationStatus.f361659c);
            return aVarH.a();
        }
        String strC2 = tokenResultB.c();
        long jD2 = tokenResultB.d();
        p pVar = this.f361641d;
        pVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f361687a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        c.a aVarH2 = cVar.h();
        aVarH2.b(strC2);
        aVarH2.c(jD2);
        aVarH2.g(seconds);
        return aVarH2.a();
    }

    @Override // com.google.firebase.installations.i
    @N
    public final Task c() {
        d();
        C37028k c37028k = new C37028k();
        j jVar = new j(this.f361641d, c37028k);
        synchronized (this.f361644g) {
            this.f361649l.add(jVar);
        }
        this.f361645h.execute(new f(this, 2));
        return c37028k.f355672a;
    }

    public final void d() {
        com.google.firebase.g gVar = this.f361638a;
        gVar.a();
        C36729v.g(gVar.f361597c.f361725b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        C36729v.g(gVar.f361597c.f361730g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        C36729v.g(gVar.f361597c.f361724a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f361597c.f361725b;
        Pattern pattern = p.f361685c;
        C36729v.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        C36729v.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", p.f361685c.matcher(gVar.f361597c.f361724a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(com.google.firebase.installations.local.c r6) {
        /*
            r5 = this;
            com.google.firebase.g r0 = r5.f361638a
            r0.a()
            java.lang.String r0 = r0.f361596b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            com.google.firebase.g r0 = r5.f361638a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f361596b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5e
        L1e:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r6 = r6.f()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.f361658b
            if (r6 != r0) goto L5e
            com.google.firebase.components.p<com.google.firebase.installations.local.b> r6 = r5.f361642e
            java.lang.Object r6 = r6.get()
            com.google.firebase.installations.local.b r6 = (com.google.firebase.installations.local.b) r6
            android.content.SharedPreferences r0 = r6.f361679a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f361679a     // Catch: java.lang.Throwable -> L42
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L42
            android.content.SharedPreferences r2 = r6.f361679a     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            goto L49
        L42:
            r6 = move-exception
            goto L5c
        L44:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
        L49:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L58
            com.google.firebase.installations.n r6 = r5.f361643f
            r6.getClass()
            java.lang.String r2 = com.google.firebase.installations.n.a()
        L58:
            return r2
        L59:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            throw r6     // Catch: java.lang.Throwable -> L42
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r6
        L5e:
            com.google.firebase.installations.n r6 = r5.f361643f
            r6.getClass()
            java.lang.String r6 = com.google.firebase.installations.n.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.g.e(com.google.firebase.installations.local.c):java.lang.String");
    }

    public final com.google.firebase.installations.local.c f(com.google.firebase.installations.local.c cVar) throws FirebaseInstallationsException {
        String string = null;
        if (cVar.c() != null && cVar.c().length() == 11) {
            com.google.firebase.installations.local.b bVar = this.f361642e.get();
            synchronized (bVar.f361679a) {
                try {
                    String[] strArr = com.google.firebase.installations.local.b.f361678c;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= 4) {
                            break;
                        }
                        String str = strArr[i12];
                        String string2 = bVar.f361679a.getString("|T|" + bVar.f361680b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str, null);
                        if (string2 == null || string2.isEmpty()) {
                            i12++;
                        } else if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            string = string2;
                        }
                    }
                } finally {
                }
            }
        }
        String str2 = string;
        com.google.firebase.installations.remote.c cVar2 = this.f361639b;
        com.google.firebase.g gVar = this.f361638a;
        gVar.a();
        String str3 = gVar.f361597c.f361724a;
        String strC = cVar.c();
        com.google.firebase.g gVar2 = this.f361638a;
        gVar2.a();
        String str4 = gVar2.f361597c.f361730g;
        com.google.firebase.g gVar3 = this.f361638a;
        gVar3.a();
        InstallationResponse installationResponseA = cVar2.a(str3, strC, str4, gVar3.f361597c.f361725b, str2);
        int iOrdinal = installationResponseA.d().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return cVar.i();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        String strB = installationResponseA.b();
        String strC2 = installationResponseA.c();
        p pVar = this.f361641d;
        pVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f361687a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        String strC3 = installationResponseA.a().c();
        long jD2 = installationResponseA.a().d();
        c.a aVarH = cVar.h();
        aVarH.d(strB);
        aVarH.f(PersistedInstallation.RegistrationStatus.f361661e);
        aVarH.b(strC3);
        aVarH.e(strC2);
        aVarH.c(jD2);
        aVarH.g(seconds);
        return aVarH.a();
    }

    public final void g(Exception exc) {
        synchronized (this.f361644g) {
            try {
                Iterator it = this.f361649l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.installations.i
    @N
    public final Task<String> getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f361647j;
        }
        if (str != null) {
            return C37030m.f(str);
        }
        C37028k c37028k = new C37028k();
        k kVar = new k(c37028k);
        synchronized (this.f361644g) {
            this.f361649l.add(kVar);
        }
        P p12 = c37028k.f355672a;
        this.f361645h.execute(new f(this, 1));
        return p12;
    }

    public final void h(com.google.firebase.installations.local.c cVar) {
        synchronized (this.f361644g) {
            try {
                Iterator it = this.f361649l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).a(cVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
