package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class k06 implements l06 {
    public static final Object m = new Object();
    public final h06 a;
    public final i06 b;
    public final enb c;
    public final dyg d;
    public final l18 e;
    public final l7d f;
    public final Object g;
    public final ExecutorService h;
    public final pee i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public k06(h06 h06Var, rpc rpcVar, ExecutorService executorService, pee peeVar) {
        h06Var.a();
        i06 i06Var = new i06(h06Var.a, rpcVar);
        enb enbVar = new enb(h06Var);
        if (lwf.a == null) {
            lwf.a = new lwf();
        }
        lwf lwfVar = lwf.a;
        if (dyg.d == null) {
            dyg.d = new dyg(lwfVar);
        }
        dyg dygVar = dyg.d;
        l18 l18Var = new l18(new ql3(2, h06Var));
        l7d l7dVar = new l7d();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = h06Var;
        this.b = i06Var;
        this.c = enbVar;
        this.d = dygVar;
        this.e = l18Var;
        this.f = l7dVar;
        this.h = executorService;
        this.i = peeVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        ab0 ab0VarO;
        synchronized (m) {
            try {
                h06 h06Var = this.a;
                h06Var.a();
                xt4 xt4VarI = xt4.i(h06Var.a);
                try {
                    ab0VarO = this.c.o();
                    int i = ab0VarO.b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strF = f(ab0VarO);
                        enb enbVar = this.c;
                        za0 za0VarA = ab0VarO.a();
                        za0VarA.b = strF;
                        za0VarA.a = 3;
                        ab0VarO = za0VarA.a();
                        enbVar.n(ab0VarO);
                    }
                    if (xt4VarI != null) {
                        xt4VarI.A();
                    }
                } catch (Throwable th) {
                    if (xt4VarI != null) {
                        xt4VarI.A();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(ab0VarO);
        this.i.execute(new j06(this, 2));
    }

    public final ab0 b(ab0 ab0Var) throws FirebaseInstallationsException {
        int responseCode;
        zb0 zb0VarF;
        i06 i06Var = this.b;
        h06 h06Var = this.a;
        h06Var.a();
        String str = h06Var.c.a;
        String str2 = ab0Var.a;
        h06 h06Var2 = this.a;
        h06Var2.a();
        String str3 = h06Var2.c.g;
        String str4 = ab0Var.d;
        dnd dndVar = i06Var.c;
        if (!dndVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = i06.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = i06Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnectionC.addRequestProperty(AUTH.WWW_AUTH_RESP, "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    i06.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dndVar.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                zb0VarF = i06.f(httpURLConnectionC);
            } else {
                i06.b(httpURLConnectionC, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    lk6 lk6VarA = zb0.a();
                    lk6VarA.b = 3;
                    zb0VarF = lk6VarA.t();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        lk6 lk6VarA2 = zb0.a();
                        lk6VarA2.b = 2;
                        zb0VarF = lk6VarA2.t();
                    }
                }
            }
            int iV = az1.v(zb0VarF.c);
            if (iV != 0) {
                if (iV == 1) {
                    za0 za0VarA = ab0Var.a();
                    za0VarA.e = "BAD CONFIG";
                    za0VarA.a = 5;
                    return za0VarA.a();
                }
                if (iV != 2) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.j = null;
                }
                za0 za0VarA2 = ab0Var.a();
                za0VarA2.a = 2;
                return za0VarA2.a();
            }
            String str5 = zb0VarF.a;
            long j = zb0VarF.b;
            dyg dygVar = this.d;
            dygVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dygVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            za0 za0VarA3 = ab0Var.a();
            za0VarA3.c = str5;
            za0VarA3.f = Long.valueOf(j);
            za0VarA3.g = Long.valueOf(seconds);
            return za0VarA3.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final ybj c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return n5e.f(str);
        }
        n2g n2gVar = new n2g();
        at6 at6Var = new at6(n2gVar);
        synchronized (this.g) {
            this.l.add(at6Var);
        }
        ybj ybjVar = n2gVar.a;
        this.h.execute(new j06(this, 0));
        return ybjVar;
    }

    public final ybj d() {
        e();
        n2g n2gVar = new n2g();
        wr6 wr6Var = new wr6(this.d, n2gVar);
        synchronized (this.g) {
            this.l.add(wr6Var);
        }
        ybj ybjVar = n2gVar.a;
        this.h.execute(new j06(this, 1));
        return ybjVar;
    }

    public final void e() {
        h06 h06Var = this.a;
        h06Var.a();
        s5j.d(h06Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        h06Var.a();
        s5j.d(h06Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        h06Var.a();
        s5j.d(h06Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        h06Var.a();
        String str = h06Var.c.b;
        Pattern pattern = dyg.c;
        s5j.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        h06Var.a();
        s5j.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", dyg.c.matcher(h06Var.c.a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(defpackage.ab0 r6) {
        /*
            r5 = this;
            h06 r0 = r5.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            h06 r0 = r5.a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            int r6 = r6.b
            r0 = 1
            if (r6 != r0) goto L5c
            l18 r6 = r5.e
            java.lang.Object r6 = r6.get()
            wc7 r6 = (defpackage.wc7) r6
            android.content.SharedPreferences r0 = r6.a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            l7d r6 = r5.f
            r6.getClass()
            java.lang.String r6 = defpackage.l7d.a()
            return r6
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        L5c:
            l7d r6 = r5.f
            r6.getClass()
            java.lang.String r6 = defpackage.l7d.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k06.f(ab0):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [i06] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [la0] */
    public final ab0 g(ab0 ab0Var) throws FirebaseInstallationsException {
        int responseCode;
        String str = ab0Var.a;
        String string = null;
        if (str != null && str.length() == 11) {
            wc7 wc7Var = (wc7) this.e.get();
            synchronized (wc7Var.a) {
                try {
                    String[] strArr = wc7.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = wc7Var.a.getString("|T|" + wc7Var.b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString(ApiProtocol.KEY_TOKEN);
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        i06 i06Var = this.b;
        h06 h06Var = this.a;
        h06Var.a();
        String str3 = h06Var.c.a;
        String str4 = ab0Var.a;
        h06 h06Var2 = this.a;
        h06Var2.a();
        String str5 = h06Var2.c.g;
        h06 h06Var3 = this.a;
        h06Var3.a();
        String str6 = h06Var3.c.b;
        dnd dndVar = i06Var.c;
        if (!dndVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = i06.a("projects/" + str5 + "/installations");
        int i2 = 0;
        la0 la0Var = i06Var;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = la0Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    i06.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dndVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    la0 la0VarE = i06.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    la0Var = la0VarE;
                } else {
                    try {
                        i06.b(httpURLConnectionC, str6, str3, str5);
                    } catch (IOException | AssertionError unused3) {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        la0Var = la0Var;
                    }
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        la0 la0Var2 = new la0(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        la0Var = la0Var2;
                    } else {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        la0Var = la0Var;
                    }
                }
                int iV = az1.v(la0Var.e);
                if (iV != 0) {
                    if (iV != 1) {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    za0 za0VarA = ab0Var.a();
                    za0VarA.e = "BAD CONFIG";
                    za0VarA.a = 5;
                    return za0VarA.a();
                }
                String str7 = la0Var.b;
                String str8 = la0Var.c;
                dyg dygVar = this.d;
                dygVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dygVar.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                zb0 zb0Var = la0Var.d;
                String str9 = zb0Var.a;
                long j = zb0Var.b;
                za0 za0VarA2 = ab0Var.a();
                za0VarA2.b = str7;
                za0VarA2.a = 4;
                za0VarA2.c = str9;
                za0VarA2.d = str8;
                za0VarA2.f = Long.valueOf(j);
                za0VarA2.g = Long.valueOf(seconds);
                return za0VarA2.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((ycf) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(ab0 ab0Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((ycf) it.next()).b(ab0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
