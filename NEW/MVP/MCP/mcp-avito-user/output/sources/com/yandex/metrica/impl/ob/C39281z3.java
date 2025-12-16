package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.z3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39281z3 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final A3 f382297a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final CounterConfiguration f382298b;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39281z3(@j.N android.os.Bundle r5) {
        /*
            r4 = this;
            r4.<init>()
            com.yandex.metrica.impl.ob.A3 r0 = com.yandex.metrica.impl.ob.A3.a(r5)
            r4.f382297a = r0
            android.os.Parcelable$Creator<com.yandex.metrica.CounterConfiguration> r0 = com.yandex.metrica.CounterConfiguration.CREATOR
            r0 = 0
            if (r5 == 0) goto L17
            java.lang.String r1 = "COUNTER_CFG_OBJ"
            android.os.Parcelable r1 = r5.getParcelable(r1)     // Catch: java.lang.Throwable -> Lb2
            com.yandex.metrica.CounterConfiguration r1 = (com.yandex.metrica.CounterConfiguration) r1     // Catch: java.lang.Throwable -> Lb2
            r0 = r1
        L17:
            if (r0 != 0) goto L1e
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            r0.<init>()
        L1e:
            monitor-enter(r0)
            if (r5 != 0) goto L23
            goto Lb1
        L23:
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L45
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f
            android.content.ContentValues r2 = r0.f377493b     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "CFG_DISPATCH_PERIOD"
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L45
        L3f:
            r5 = move-exception
            goto Lb5
        L42:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5     // Catch: java.lang.Throwable -> L3f
        L45:
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L64
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f
            android.content.ContentValues r2 = r0.f377493b     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "CFG_SESSION_TIMEOUT"
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L64
        L61:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5     // Catch: java.lang.Throwable -> L3f
        L64:
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L88
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f
            android.content.ContentValues r2 = r0.f377493b     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "CFG_MAX_REPORTS_COUNT"
            if (r1 > 0) goto L7c
            r1 = 2147483647(0x7fffffff, float:NaN)
        L7c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L85
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L88
        L85:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5     // Catch: java.lang.Throwable -> L3f
        L88:
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto Lb1
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "-1"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r5 = r5.getString(r1)     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f
            android.content.ContentValues r1 = r0.f377493b     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "CFG_API_KEY"
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto Lb1
        Lae:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r5     // Catch: java.lang.Throwable -> L3f
        Lb1:
            monitor-exit(r0)
        Lb2:
            r4.f382298b = r0
            return
        Lb5:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39281z3.<init>(android.os.Bundle):void");
    }

    @j.N
    public A3 a() {
        return this.f382297a;
    }

    @j.N
    public CounterConfiguration b() {
        return this.f382298b;
    }

    public String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f382297a + ", mCounterConfiguration=" + this.f382298b + '}';
    }

    public static boolean a(@j.P C39281z3 c39281z3, @j.N Context context) {
        return (c39281z3.f382297a != null && context.getPackageName().equals(c39281z3.f382297a.f()) && c39281z3.f382297a.i() == YandexMetrica.getLibraryApiLevel()) ? false : true;
    }

    public C39281z3(@j.N A3 a32, @j.N CounterConfiguration counterConfiguration) {
        this.f382297a = a32;
        this.f382298b = counterConfiguration;
    }
}
