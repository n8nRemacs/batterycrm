package com.yandex.metrica.networktasks.api;

import android.net.Uri;
import com.yandex.metrica.impl.ob.C38952ld;
import com.yandex.metrica.impl.ob.C39027od;
import com.yandex.metrica.impl.ob.Gm;
import java.util.List;

/* loaded from: classes7.dex */
public class NetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public d f382417a = d.f382449b;

    /* renamed from: b, reason: collision with root package name */
    public final Gm f382418b;

    /* renamed from: c, reason: collision with root package name */
    public final C39027od f382419c;

    /* renamed from: d, reason: collision with root package name */
    public final C38952ld f382420d;

    /* renamed from: e, reason: collision with root package name */
    public final UnderlyingNetworkTask f382421e;

    /* renamed from: f, reason: collision with root package name */
    public final List f382422f;

    /* renamed from: g, reason: collision with root package name */
    public final String f382423g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Method {

        /* renamed from: b, reason: collision with root package name */
        public static final Method f382424b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f382425c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Method[] f382426d;

        static {
            Method method = new Method("GET", 0);
            f382424b = method;
            Method method2 = new Method("POST", 1);
            f382425c = method2;
            f382426d = new Method[]{method, method2};
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) f382426d.clone();
        }
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i12);
    }

    public NetworkTask(Gm gm2, C39027od c39027od, C38952ld c38952ld, UnderlyingNetworkTask underlyingNetworkTask, List list, String str) {
        this.f382418b = gm2;
        this.f382419c = c39027od;
        this.f382420d = c38952ld;
        this.f382421e = underlyingNetworkTask;
        this.f382422f = list;
        this.f382423g = str;
    }

    public final synchronized boolean a(d dVar) {
        if (!b(dVar)) {
            return false;
        }
        this.f382417a = dVar;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b(com.yandex.metrica.networktasks.api.d... r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L27
            com.yandex.metrica.networktasks.api.d r1 = r7.f382417a     // Catch: java.lang.Throwable -> L27
            int r2 = r8.length     // Catch: java.lang.Throwable -> L27
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r2) goto L87
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L27
            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L27
            r6 = 1
            switch(r5) {
                case 0: goto L79;
                case 1: goto L72;
                case 2: goto L64;
                case 3: goto L52;
                case 4: goto L48;
                case 5: goto L48;
                case 6: goto L64;
                case 7: goto L2a;
                case 8: goto L16;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L27
        L14:
            goto L6f
        L16:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382449b     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L1c
            goto L79
        L1c:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382457j     // Catch: java.lang.Throwable -> L27
            if (r1 == r5) goto L21
            goto L22
        L21:
            r6 = r3
        L22:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            goto L7a
        L27:
            r8 = move-exception
            goto L92
        L2a:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382453f     // Catch: java.lang.Throwable -> L27
            if (r1 == r5) goto L68
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382454g     // Catch: java.lang.Throwable -> L27
            if (r1 == r5) goto L68
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382455h     // Catch: java.lang.Throwable -> L27
            if (r1 == r5) goto L68
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382450c     // Catch: java.lang.Throwable -> L27
            if (r1 == r5) goto L68
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382451d     // Catch: java.lang.Throwable -> L27
            if (r1 == r5) goto L68
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382452e     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L43
            goto L68
        L43:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382457j     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L79
            goto L6f
        L48:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382452e     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L4d
            goto L68
        L4d:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382457j     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L79
            goto L6f
        L52:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382451d     // Catch: java.lang.Throwable -> L27
            if (r1 == r5) goto L68
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382453f     // Catch: java.lang.Throwable -> L27
            if (r1 == r5) goto L68
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382454g     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L5f
            goto L68
        L5f:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382457j     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L79
            goto L6f
        L64:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382450c     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L6b
        L68:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L27
            goto L7a
        L6b:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382457j     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L79
        L6f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L27
            goto L7a
        L72:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382449b     // Catch: java.lang.Throwable -> L27
            if (r1 != r5) goto L77
            goto L22
        L77:
            r6 = r3
            goto L22
        L79:
            r5 = 0
        L7a:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L84
            r0 = r5
            goto L87
        L84:
            int r4 = r4 + 1
            goto L8
        L87:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L27
            r8.equals(r0)     // Catch: java.lang.Throwable -> L27
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r7)
            return r8
        L92:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.networktasks.api.NetworkTask.b(com.yandex.metrica.networktasks.api.d[]):boolean");
    }

    public final boolean c() {
        if (a(d.f382451d)) {
            return this.f382421e.onCreateTask();
        }
        return false;
    }

    public final boolean d() {
        boolean zA2 = a(d.f382452e);
        if (zA2) {
            UnderlyingNetworkTask underlyingNetworkTask = this.f382421e;
            underlyingNetworkTask.getFullUrlFormer().f382406b++;
            FullUrlFormer fullUrlFormer = underlyingNetworkTask.getFullUrlFormer();
            Uri.Builder builderBuildUpon = Uri.parse((String) fullUrlFormer.f382405a.get(fullUrlFormer.f382406b)).buildUpon();
            fullUrlFormer.f382408d.appendParams(builderBuildUpon, fullUrlFormer.f382409e.getConfig());
            fullUrlFormer.f382407c = builderBuildUpon.build().toString();
            underlyingNetworkTask.onPerformRequest();
        }
        return zA2;
    }

    public final boolean e() {
        boolean zOnRequestComplete;
        boolean z12;
        synchronized (this) {
            try {
                d dVar = d.f382453f;
                d dVar2 = d.f382454g;
                if (b(dVar, dVar2)) {
                    zOnRequestComplete = this.f382421e.onRequestComplete();
                    if (zOnRequestComplete) {
                        this.f382417a = dVar;
                    } else {
                        this.f382417a = dVar2;
                    }
                    z12 = true;
                } else {
                    zOnRequestComplete = false;
                    z12 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            this.f382421e.onPostRequestComplete(zOnRequestComplete);
        }
        return zOnRequestComplete;
    }

    public final void f(Throwable th2) {
        if (a(d.f382454g)) {
            this.f382421e.onRequestError(th2);
        }
    }

    public final void g() {
        if (a(d.f382455h)) {
            this.f382421e.onShouldNotExecute();
        }
    }

    public final void h() {
        d dVar;
        boolean zA2;
        synchronized (this) {
            dVar = this.f382417a;
            zA2 = a(d.f382456i);
        }
        if (zA2) {
            this.f382421e.onTaskFinished();
            if (dVar == d.f382453f) {
                this.f382421e.onSuccessfulTaskFinished();
            } else if (dVar == d.f382454g || dVar == d.f382455h) {
                this.f382421e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public final void i() {
        if (a(d.f382457j)) {
            this.f382421e.onTaskRemoved();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean j() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.yandex.metrica.networktasks.api.UnderlyingNetworkTask r0 = r6.f382421e     // Catch: java.lang.Throwable -> L39
            com.yandex.metrica.networktasks.api.FullUrlFormer r0 = r0.getFullUrlFormer()     // Catch: java.lang.Throwable -> L39
            int r1 = r0.f382406b     // Catch: java.lang.Throwable -> L39
            r2 = 1
            int r1 = r1 + r2
            java.util.List r0 = r0.f382405a     // Catch: java.lang.Throwable -> L39
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L39
            r3 = 0
            if (r1 >= r0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            com.yandex.metrica.networktasks.api.UnderlyingNetworkTask r1 = r6.f382421e     // Catch: java.lang.Throwable -> L39
            com.yandex.metrica.networktasks.api.ResponseDataHolder r1 = r1.getResponseDataHolder()     // Catch: java.lang.Throwable -> L39
            int r1 = r1.f382435a     // Catch: java.lang.Throwable -> L39
            java.util.List r4 = r6.f382422f     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L39
        L25:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L39
            com.yandex.metrica.networktasks.api.NetworkTask$ShouldTryNextHostCondition r5 = (com.yandex.metrica.networktasks.api.NetworkTask.ShouldTryNextHostCondition) r5     // Catch: java.lang.Throwable -> L39
            boolean r5 = r5.shouldTryNextHost(r1)     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L25
            r1 = r3
            goto L3c
        L39:
            r0 = move-exception
            goto L4e
        L3b:
            r1 = r2
        L3c:
            com.yandex.metrica.networktasks.api.d r4 = r6.f382417a     // Catch: java.lang.Throwable -> L39
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382457j     // Catch: java.lang.Throwable -> L39
            if (r4 == r5) goto L4b
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.f382456i     // Catch: java.lang.Throwable -> L39
            if (r4 == r5) goto L4b
            if (r0 == 0) goto L4b
            if (r1 == 0) goto L4b
            goto L4c
        L4b:
            r2 = r3
        L4c:
            monitor-exit(r6)
            return r2
        L4e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.networktasks.api.NetworkTask.j():boolean");
    }
}
