package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37027j;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.C37586h;
import com.google.firebase.crashlytics.internal.model.C;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import mZ0.C44034a;
import mZ0.C44035b;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C37598u {

    /* renamed from: r, reason: collision with root package name */
    public static final C37592n f360999r = new C37592n(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f361000a;

    /* renamed from: b, reason: collision with root package name */
    public final L f361001b;

    /* renamed from: c, reason: collision with root package name */
    public final F f361002c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.metadata.j f361003d;

    /* renamed from: e, reason: collision with root package name */
    public final C37591m f361004e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f361005f;

    /* renamed from: g, reason: collision with root package name */
    public final C44035b f361006g;

    /* renamed from: h, reason: collision with root package name */
    public final C37579a f361007h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.metadata.c f361008i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.b f361009j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.firebase.crashlytics.a f361010k;

    /* renamed from: l, reason: collision with root package name */
    public final Z f361011l;

    /* renamed from: m, reason: collision with root package name */
    public J f361012m;

    /* renamed from: n, reason: collision with root package name */
    public final C37028k<Boolean> f361013n = new C37028k<>();

    /* renamed from: o, reason: collision with root package name */
    public final C37028k<Boolean> f361014o = new C37028k<>();

    /* renamed from: p, reason: collision with root package name */
    public final C37028k<Void> f361015p = new C37028k<>();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f361016q = new AtomicBoolean(false);

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.u$a */
    public class a implements InterfaceC37027j<Boolean, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task f361017a;

        public a(Task task) {
            this.f361017a = task;
        }

        @Override // com.google.android.gms.tasks.InterfaceC37027j
        @j.N
        public final Task<Void> a(@j.P Boolean bool) {
            return C37598u.this.f361004e.b(new CallableC37597t(this, bool));
        }
    }

    public C37598u(Context context, C37591m c37591m, Q q12, L l12, C44035b c44035b, F f12, C37579a c37579a, com.google.firebase.crashlytics.internal.metadata.j jVar, com.google.firebase.crashlytics.internal.metadata.c cVar, Z z12, com.google.firebase.crashlytics.internal.b bVar, com.google.firebase.crashlytics.a aVar) {
        this.f361000a = context;
        this.f361004e = c37591m;
        this.f361005f = q12;
        this.f361001b = l12;
        this.f361006g = c44035b;
        this.f361002c = f12;
        this.f361007h = c37579a;
        this.f361003d = jVar;
        this.f361008i = cVar;
        this.f361009j = bVar;
        this.f361010k = aVar;
        this.f361011l = z12;
    }

    public static void a(C37598u c37598u, String str) {
        Integer num;
        c37598u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        dVar.a(3);
        Locale locale = Locale.US;
        Q q12 = c37598u.f361005f;
        String str2 = q12.f360936c;
        C37579a c37579a = c37598u.f361007h;
        C.a aVarB = C.a.b(str2, c37579a.f360953f, c37579a.f360954g, q12.c(), (c37579a.f360951d != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).f360887b, c37579a.f360955h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        C.c cVarA = C.c.a(str3, str4, C37586h.i());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        C37586h.a aVar = C37586h.a.f360976b;
        String str5 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str5);
        C37586h.a aVar2 = C37586h.a.f360976b;
        if (zIsEmpty) {
            dVar.a(2);
        } else {
            C37586h.a aVar3 = (C37586h.a) C37586h.a.f360977c.get(str5.toLowerCase(locale));
            if (aVar3 != null) {
                aVar2 = aVar3;
            }
        }
        int iOrdinal = aVar2.ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jF2 = C37586h.f();
        boolean zH2 = C37586h.h();
        int iD2 = C37586h.d();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        c37598u.f361009j.a(str, jCurrentTimeMillis, com.google.firebase.crashlytics.internal.model.C.b(aVarB, cVarA, C.b.c(iOrdinal, str6, iAvailableProcessors, jF2, blockCount, zH2, iD2, str7, str8)));
        c37598u.f361008i.d(str);
        Z z12 = c37598u.f361011l;
        H h12 = z12.f360943a;
        CrashlyticsReport.c cVarA2 = CrashlyticsReport.a();
        cVarA2.i("18.3.7");
        C37579a c37579a2 = h12.f360909c;
        cVarA2.e(c37579a2.f360948a);
        Q q13 = h12.f360908b;
        cVarA2.f(q13.c());
        String str9 = c37579a2.f360953f;
        cVarA2.c(str9);
        String str10 = c37579a2.f360954g;
        cVarA2.d(str10);
        cVarA2.h(4);
        CrashlyticsReport.f.b bVarA = CrashlyticsReport.f.a();
        bVarA.k(jCurrentTimeMillis);
        bVarA.i(str);
        bVarA.g(H.f360906g);
        CrashlyticsReport.f.a.AbstractC10702a abstractC10702aA = CrashlyticsReport.f.a.a();
        abstractC10702aA.e(q13.f360936c);
        abstractC10702aA.g(str9);
        abstractC10702aA.d(str10);
        abstractC10702aA.f(q13.c());
        com.google.firebase.crashlytics.internal.c cVar = c37579a2.f360955h;
        abstractC10702aA.b(cVar.a());
        abstractC10702aA.c(cVar.b());
        bVarA.b(abstractC10702aA.a());
        CrashlyticsReport.f.e.a aVarA = CrashlyticsReport.f.e.a();
        aVarA.d(3);
        aVarA.e(str3);
        aVarA.b(str4);
        aVarA.c(C37586h.i());
        bVarA.j(aVarA.a());
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str5) && (num = (Integer) H.f360905f.get(str5.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jF3 = C37586h.f();
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zH3 = C37586h.h();
        int iD3 = C37586h.d();
        CrashlyticsReport.f.c.a aVarA2 = CrashlyticsReport.f.c.a();
        aVarA2.b(iIntValue);
        aVarA2.f(str6);
        aVarA2.c(iAvailableProcessors2);
        aVarA2.h(jF3);
        aVarA2.d(blockCount2);
        aVarA2.i(zH3);
        aVarA2.j(iD3);
        aVarA2.e(str7);
        aVarA2.g(str8);
        bVarA.d(aVarA2.a());
        bVarA.h(3);
        cVarA2.j(bVarA.a());
        CrashlyticsReport crashlyticsReportA = cVarA2.a();
        C44035b c44035b = z12.f360944b.f414581b;
        CrashlyticsReport.f fVarJ = crashlyticsReportA.j();
        if (fVarJ == null) {
            dVar.a(3);
            return;
        }
        String strH = fVarJ.h();
        try {
            C44034a.f414577f.getClass();
            C44034a.f(c44035b.c(strH, "report"), com.google.firebase.crashlytics.internal.model.serialization.b.f361385a.a(crashlyticsReportA));
            File fileC = c44035b.c(strH, "start-time");
            long j12 = fVarJ.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileC), C44034a.f414575d);
            try {
                outputStreamWriter.write("");
                fileC.setLastModified(j12 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
            dVar.a(3);
        }
    }

    public static Task b(C37598u c37598u) throws NumberFormatException, ClassNotFoundException {
        Task taskC;
        c37598u.getClass();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        ArrayList arrayList = new ArrayList();
        for (File file : C44035b.f(c37598u.f361006g.f414584b.listFiles(f360999r))) {
            try {
                long j12 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    dVar.a(5);
                    taskC = C37030m.f(null);
                } catch (ClassNotFoundException unused) {
                    dVar.a(3);
                    taskC = C37030m.c(new CallableC37602y(c37598u, j12), new ScheduledThreadPoolExecutor(1));
                }
                arrayList.add(taskC);
            } catch (NumberFormatException unused2) {
                file.getName();
                dVar.a(5);
            }
            file.delete();
        }
        return C37030m.g(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0455 A[LOOP:3: B:126:0x0455->B:128:0x045b, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05d4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Type inference failed for: r24v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.google.firebase.crashlytics.internal.common.P] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r24, com.google.firebase.crashlytics.internal.settings.k r25) {
        /*
            Method dump skipped, instructions count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C37598u.c(boolean, com.google.firebase.crashlytics.internal.settings.k):void");
    }

    public final void d(long j12) {
        try {
            C44035b c44035b = this.f361006g;
            String str = ".ae" + j12;
            c44035b.getClass();
            if (new File(c44035b.f414584b, str).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
        }
    }

    public final boolean e(com.google.firebase.crashlytics.internal.settings.k kVar) {
        if (!Boolean.TRUE.equals(this.f361004e.f360985d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        J j12 = this.f361012m;
        boolean z12 = j12 != null && j12.f360916e.get();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        if (z12) {
            dVar.a(5);
            return false;
        }
        dVar.a(2);
        try {
            c(true, kVar);
            dVar.a(2);
            return true;
        } catch (Exception unused) {
            dVar.b();
            return false;
        }
    }

    @j.P
    public final String f() {
        NavigableSet navigableSetC = this.f361011l.f360944b.c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g() throws java.io.IOException {
        /*
            r6 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            com.google.firebase.crashlytics.internal.d r1 = com.google.firebase.crashlytics.internal.d.f361031a
            r2 = 0
            if (r0 != 0) goto L13
            r0 = 5
            r1.a(r0)
        L11:
            r0 = r2
            goto L20
        L13:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L20
            r0 = 4
            r1.a(r0)
            goto L11
        L20:
            if (r0 != 0) goto L23
            return r2
        L23:
            r2 = 3
            r1.a(r2)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L30:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L3c
            r1.write(r2, r5, r3)
            goto L30
        L3c:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C37598u.g():java.lang.String");
    }

    public final void h() {
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        try {
            String strG = g();
            if (strG != null) {
                try {
                    this.f361003d.g(strG);
                } catch (IllegalArgumentException e12) {
                    Context context = this.f361000a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e12;
                        }
                    }
                    dVar.b();
                }
                dVar.a(4);
            }
        } catch (IOException unused) {
            dVar.a(5);
        }
    }

    @SuppressLint({"TaskMainThread"})
    public final Task<Void> i(Task<com.google.firebase.crashlytics.internal.settings.d> task) {
        com.google.android.gms.tasks.P p12;
        Task taskF;
        C44035b c44035b = this.f361011l.f360944b.f414581b;
        boolean zIsEmpty = C44035b.f(c44035b.f414586d.listFiles()).isEmpty();
        C37028k<Boolean> c37028k = this.f361013n;
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        if (zIsEmpty && C44035b.f(c44035b.f414587e.listFiles()).isEmpty() && C44035b.f(c44035b.f414588f.listFiles()).isEmpty()) {
            dVar.a(2);
            c37028k.d(Boolean.FALSE);
            return C37030m.f(null);
        }
        dVar.a(2);
        L l12 = this.f361001b;
        if (l12.b()) {
            dVar.a(3);
            c37028k.d(Boolean.FALSE);
            taskF = C37030m.f(Boolean.TRUE);
        } else {
            dVar.a(3);
            dVar.a(2);
            c37028k.d(Boolean.TRUE);
            synchronized (l12.f360919c) {
                p12 = l12.f360920d.f355672a;
            }
            Task<TContinuationResult> taskS = p12.s(new r());
            dVar.a(3);
            com.google.android.gms.tasks.P p13 = this.f361014o.f355672a;
            ExecutorService executorService = e0.f360968a;
            C37028k c37028k2 = new C37028k();
            d0 d0Var = new d0(0, c37028k2);
            taskS.j(d0Var);
            p13.j(d0Var);
            taskF = c37028k2.f355672a;
        }
        return taskF.s(new a(task));
    }
}
