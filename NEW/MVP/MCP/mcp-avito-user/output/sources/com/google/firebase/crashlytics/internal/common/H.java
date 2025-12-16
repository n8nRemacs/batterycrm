package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import nZ0.C44360a;
import nZ0.C44364e;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes4.dex */
public class H {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f360905f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f360906g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f360907a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f360908b;

    /* renamed from: c, reason: collision with root package name */
    public final C37579a f360909c;

    /* renamed from: d, reason: collision with root package name */
    public final C44360a f360910d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.settings.g f360911e;

    static {
        HashMap map = new HashMap();
        f360905f = map;
        androidx.media3.common.S.e(5, map, "armeabi", 6, "armeabi-v7a");
        androidx.media3.common.S.e(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f360906g = "Crashlytics Android SDK/18.3.7";
    }

    public H(Context context, Q q12, C37579a c37579a, C44360a c44360a, com.google.firebase.crashlytics.internal.settings.g gVar) {
        this.f360907a = context;
        this.f360908b = q12;
        this.f360909c = c37579a;
        this.f360910d = c44360a;
        this.f360911e = gVar;
    }

    public static CrashlyticsReport.f.d.a.b.c c(C44364e c44364e, int i12) {
        String str = c44364e.f415182b;
        int i13 = 0;
        StackTraceElement[] stackTraceElementArr = c44364e.f415183c;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C44364e c44364e2 = c44364e.f415184d;
        if (i12 >= 8) {
            for (C44364e c44364e3 = c44364e2; c44364e3 != null; c44364e3 = c44364e3.f415184d) {
                i13++;
            }
        }
        CrashlyticsReport.f.d.a.b.c.AbstractC10708a abstractC10708aA = CrashlyticsReport.f.d.a.b.c.a();
        abstractC10708aA.f(str);
        abstractC10708aA.e(c44364e.f415181a);
        abstractC10708aA.c(new com.google.firebase.crashlytics.internal.model.B<>(d(stackTraceElementArr, 4)));
        abstractC10708aA.d(i13);
        if (c44364e2 != null && i13 == 0) {
            abstractC10708aA.b(c(c44364e2, i12 + 1));
        }
        return abstractC10708aA.a();
    }

    public static com.google.firebase.crashlytics.internal.model.B d(StackTraceElement[] stackTraceElementArr, int i12) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a abstractC10713aA = CrashlyticsReport.f.d.a.b.e.AbstractC10712b.a();
            abstractC10713aA.c(i12);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            abstractC10713aA.e(jMax);
            abstractC10713aA.f(str);
            abstractC10713aA.b(fileName);
            abstractC10713aA.d(lineNumber);
            arrayList.add(abstractC10713aA.a());
        }
        return new com.google.firebase.crashlytics.internal.model.B(arrayList);
    }

    public final com.google.firebase.crashlytics.internal.model.B<CrashlyticsReport.f.d.a.b.AbstractC10705a> a() {
        CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a abstractC10706aA = CrashlyticsReport.f.d.a.b.AbstractC10705a.a();
        abstractC10706aA.b(0L);
        abstractC10706aA.d(0L);
        C37579a c37579a = this.f360909c;
        abstractC10706aA.c(c37579a.f360952e);
        abstractC10706aA.e(c37579a.f360949b);
        return new com.google.firebase.crashlytics.internal.model.B<>(Arrays.asList(abstractC10706aA.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c b(int r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.f360907a
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch: java.lang.IllegalStateException -> L3d
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch: java.lang.IllegalStateException -> L3d
            android.content.Intent r5 = r0.registerReceiver(r2, r5)     // Catch: java.lang.IllegalStateException -> L3d
            if (r5 == 0) goto L3f
            java.lang.String r6 = "status"
            r7 = -1
            int r6 = r5.getIntExtra(r6, r7)     // Catch: java.lang.IllegalStateException -> L3d
            if (r6 != r7) goto L1e
        L1c:
            r6 = r3
            goto L24
        L1e:
            if (r6 == r1) goto L23
            r8 = 5
            if (r6 != r8) goto L1c
        L23:
            r6 = r4
        L24:
            java.lang.String r8 = "level"
            int r8 = r5.getIntExtra(r8, r7)     // Catch: java.lang.IllegalStateException -> L42
            java.lang.String r9 = "scale"
            int r5 = r5.getIntExtra(r9, r7)     // Catch: java.lang.IllegalStateException -> L42
            if (r8 == r7) goto L47
            if (r5 != r7) goto L35
            goto L47
        L35:
            float r7 = (float) r8     // Catch: java.lang.IllegalStateException -> L42
            float r5 = (float) r5     // Catch: java.lang.IllegalStateException -> L42
            float r7 = r7 / r5
            java.lang.Float r5 = java.lang.Float.valueOf(r7)     // Catch: java.lang.IllegalStateException -> L42
            goto L48
        L3d:
            r6 = r3
            goto L42
        L3f:
            r5 = r2
            r6 = r3
            goto L48
        L42:
            com.google.firebase.crashlytics.internal.d r5 = com.google.firebase.crashlytics.internal.d.f361031a
            r5.b()
        L47:
            r5 = r2
        L48:
            if (r5 == 0) goto L52
            double r7 = r5.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
        L52:
            if (r6 == 0) goto L68
            if (r5 != 0) goto L57
            goto L68
        L57:
            float r5 = r5.floatValue()
            double r5 = (double) r5
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L66
            goto L69
        L66:
            r1 = 3
            goto L69
        L68:
            r1 = r4
        L69:
            boolean r5 = com.google.firebase.crashlytics.internal.common.C37586h.h()
            if (r5 == 0) goto L70
            goto L81
        L70:
            java.lang.String r5 = "sensor"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5
            r6 = 8
            android.hardware.Sensor r5 = r5.getDefaultSensor(r6)
            if (r5 == 0) goto L81
            r3 = r4
        L81:
            long r4 = com.google.firebase.crashlytics.internal.common.C37586h.f()
            android.app.ActivityManager$MemoryInfo r6 = new android.app.ActivityManager$MemoryInfo
            r6.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r6)
            long r6 = r6.availMem
            long r4 = r4 - r6
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r6 = new android.os.StatFs
            r6.<init>(r0)
            int r0 = r6.getBlockSize()
            long r7 = (long) r0
            int r0 = r6.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r6.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$c$a r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a()
            r0.b(r2)
            r0.c(r1)
            r0.f(r3)
            r0.e(r14)
            r0.g(r4)
            r0.d(r9)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$c r14 = r0.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.H.b(int):com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$c");
    }
}
