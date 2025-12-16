package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import androidx.camera.core.impl.r0;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import mZ0.C44034a;
import nZ0.C44360a;
import nZ0.C44364e;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes4.dex */
public class Z implements G {

    /* renamed from: a, reason: collision with root package name */
    public final H f360943a;

    /* renamed from: b, reason: collision with root package name */
    public final C44034a f360944b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.send.a f360945c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.metadata.c f360946d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.metadata.j f360947e;

    public Z(H h12, C44034a c44034a, com.google.firebase.crashlytics.internal.send.a aVar, com.google.firebase.crashlytics.internal.metadata.c cVar, com.google.firebase.crashlytics.internal.metadata.j jVar) {
        this.f360943a = h12;
        this.f360944b = c44034a;
        this.f360945c = aVar;
        this.f360946d = cVar;
        this.f360947e = jVar;
    }

    public static CrashlyticsReport.f.d a(CrashlyticsReport.f.d dVar, com.google.firebase.crashlytics.internal.metadata.c cVar, com.google.firebase.crashlytics.internal.metadata.j jVar) {
        CrashlyticsReport.f.d.b bVarG = dVar.g();
        String strC = cVar.c();
        if (strC != null) {
            CrashlyticsReport.f.d.AbstractC10714d.a aVarA = CrashlyticsReport.f.d.AbstractC10714d.a();
            aVarA.b(strC);
            bVarG.d(aVarA.a());
        } else {
            com.google.firebase.crashlytics.internal.d.f361031a.a(2);
        }
        ArrayList arrayListB = b(jVar.a());
        ArrayList arrayListB2 = b(jVar.b());
        if (!arrayListB.isEmpty() || !arrayListB2.isEmpty()) {
            CrashlyticsReport.f.d.a.AbstractC10704a abstractC10704aG = dVar.b().g();
            abstractC10704aG.c(new com.google.firebase.crashlytics.internal.model.B<>(arrayListB));
            abstractC10704aG.e(new com.google.firebase.crashlytics.internal.model.B<>(arrayListB2));
            bVarG.b(abstractC10704aG.a());
        }
        return bVarG.a();
    }

    @j.N
    public static ArrayList b(@j.N Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            CrashlyticsReport.d.a aVarA = CrashlyticsReport.d.a();
            aVarA.b((String) entry.getKey());
            aVarA.c((String) entry.getValue());
            arrayList.add(aVarA.a());
        }
        Collections.sort(arrayList, new r0(6));
        return arrayList;
    }

    public final void c(@j.N Throwable th2, @j.N Thread thread, @j.N String str, @j.N String str2, long j12, boolean z12) {
        ActivityManager.RunningAppProcessInfo next;
        boolean zEquals = str2.equals(CrashHianalyticsData.EVENT_ID_CRASH);
        H h12 = this.f360943a;
        Context context = h12.f360907a;
        int i12 = context.getResources().getConfiguration().orientation;
        C44360a c44360a = h12.f360910d;
        C44364e c44364e = new C44364e(th2, c44360a);
        CrashlyticsReport.f.d.b bVarA = CrashlyticsReport.f.d.a();
        bVarA.f(str2);
        bVarA.e(j12);
        C37579a c37579a = h12.f360909c;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.processName.equals(c37579a.f360952e)) {
                    break;
                }
            }
            next = null;
        } else {
            next = null;
        }
        Boolean boolValueOf = next != null ? Boolean.valueOf(next.importance != 100) : null;
        CrashlyticsReport.f.d.a.AbstractC10704a abstractC10704aA = CrashlyticsReport.f.d.a.a();
        abstractC10704aA.b(boolValueOf);
        abstractC10704aA.f(i12);
        CrashlyticsReport.f.d.a.b.AbstractC10707b abstractC10707bA = CrashlyticsReport.f.d.a.b.a();
        ArrayList arrayList = new ArrayList();
        CrashlyticsReport.f.d.a.b.e.AbstractC10711a abstractC10711aA = CrashlyticsReport.f.d.a.b.e.a();
        abstractC10711aA.d(thread.getName());
        abstractC10711aA.c(4);
        abstractC10711aA.b(new com.google.firebase.crashlytics.internal.model.B<>(H.d(c44364e.f415183c, 4)));
        arrayList.add(abstractC10711aA.a());
        if (z12) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrA = c44360a.a(entry.getValue());
                    CrashlyticsReport.f.d.a.b.e.AbstractC10711a abstractC10711aA2 = CrashlyticsReport.f.d.a.b.e.a();
                    abstractC10711aA2.d(key.getName());
                    abstractC10711aA2.c(0);
                    abstractC10711aA2.b(new com.google.firebase.crashlytics.internal.model.B<>(H.d(stackTraceElementArrA, 0)));
                    arrayList.add(abstractC10711aA2.a());
                }
            }
        }
        abstractC10707bA.f(new com.google.firebase.crashlytics.internal.model.B<>(arrayList));
        abstractC10707bA.d(H.c(c44364e, 0));
        CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a abstractC10710aA = CrashlyticsReport.f.d.a.b.AbstractC10709d.a();
        abstractC10710aA.d("0");
        abstractC10710aA.c("0");
        abstractC10710aA.b(0L);
        abstractC10707bA.e(abstractC10710aA.a());
        abstractC10707bA.c(h12.a());
        abstractC10704aA.d(abstractC10707bA.a());
        bVarA.b(abstractC10704aA.a());
        bVarA.c(h12.b(i12));
        this.f360944b.d(a(bVarA.a(), this.f360946d, this.f360947e), str, zEquals);
    }

    public final Task d(@j.N ExecutorService executorService, @j.P String str) {
        ArrayList arrayListB = this.f360944b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                com.google.firebase.crashlytics.internal.model.serialization.b bVar = C44034a.f414577f;
                String strE = C44034a.e(file);
                bVar.getClass();
                arrayList.add(new C37580b(com.google.firebase.crashlytics.internal.model.serialization.b.h(strE), file.getName(), file));
            } catch (IOException unused) {
                com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
                Objects.toString(file);
                dVar.a(5);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            I i12 = (I) it2.next();
            if (str == null || str.equals(i12.c())) {
                arrayList2.add(this.f360945c.b(i12, str != null).i(executorService, new com.avito.android.str_seller_orders.orders_seller.d(this, 29)));
            }
        }
        return C37030m.g(arrayList2);
    }
}
