package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: VolleyLog.java */
/* loaded from: classes10.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f67166a = Log.isLoggable("Volley", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final String f67167b = z.class.getName();

    /* compiled from: VolleyLog.java */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f67168c = z.f67166a;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f67169a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public boolean f67170b = false;

        /* compiled from: VolleyLog.java */
        /* renamed from: com.android.volley.z$a$a, reason: collision with other inner class name */
        public static class C2126a {

            /* renamed from: a, reason: collision with root package name */
            public final String f67171a;

            /* renamed from: b, reason: collision with root package name */
            public final long f67172b;

            /* renamed from: c, reason: collision with root package name */
            public final long f67173c;

            public C2126a(String str, long j12, long j13) {
                this.f67171a = str;
                this.f67172b = j12;
                this.f67173c = j13;
            }
        }

        public final synchronized void a(long j12, String str) {
            if (this.f67170b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f67169a.add(new C2126a(str, j12, SystemClock.elapsedRealtime()));
        }

        public final synchronized void b(String str) {
            long j12;
            this.f67170b = true;
            ArrayList arrayList = this.f67169a;
            if (arrayList.size() == 0) {
                j12 = 0;
            } else {
                j12 = ((C2126a) arrayList.get(arrayList.size() - 1)).f67173c - ((C2126a) arrayList.get(0)).f67173c;
            }
            if (j12 <= 0) {
                return;
            }
            long j13 = ((C2126a) this.f67169a.get(0)).f67173c;
            z.a("(%-4d ms) %s", Long.valueOf(j12), str);
            Iterator it = this.f67169a.iterator();
            while (it.hasNext()) {
                C2126a c2126a = (C2126a) it.next();
                long j14 = c2126a.f67173c;
                z.a("(+%-4d) [%2d] %s", Long.valueOf(j14 - j13), Long.valueOf(c2126a.f67172b), c2126a.f67171a);
                j13 = j14;
            }
        }

        public final void finalize() {
            if (this.f67170b) {
                return;
            }
            b("Request on the loose");
            z.a("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public static String a(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i12 = 2;
        while (true) {
            if (i12 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i12].getClassName().equals(f67167b)) {
                String className = stackTrace[i12].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbZ = androidx.appcompat.app.r.z(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbZ.append(stackTrace[i12].getMethodName());
                string = sbZ.toString();
                break;
            }
            i12++;
        }
        Locale locale = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(string);
        return AK.c.s(sb2, ": ", str2);
    }

    public static void b(String str, Object... objArr) {
        if (f67166a) {
            a(str, objArr);
        }
    }
}
