package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.C37598u;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import mZ0.C44034a;
import mZ0.C44035b;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class CallableC37597t implements Callable<Task<Void>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f360997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37598u.a f360998c;

    public CallableC37597t(C37598u.a aVar, Boolean bool) {
        this.f360998c = aVar;
        this.f360997b = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        Boolean bool = this.f360997b;
        boolean zBooleanValue = bool.booleanValue();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        C37598u.a aVar = this.f360998c;
        if (zBooleanValue) {
            dVar.a(3);
            boolean zBooleanValue2 = bool.booleanValue();
            L l12 = C37598u.this.f361001b;
            if (!zBooleanValue2) {
                l12.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            l12.f360923g.d(null);
            ExecutorService executorService = C37598u.this.f361004e.f360982a;
            return aVar.f361017a.t(executorService, new C37596s(this, executorService));
        }
        dVar.a(2);
        C37598u c37598u = C37598u.this;
        Iterator it = C44035b.f(c37598u.f361006g.f414584b.listFiles(C37598u.f360999r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        C37598u c37598u2 = C37598u.this;
        C44035b c44035b = c37598u2.f361011l.f360944b.f414581b;
        C44034a.a(C44035b.f(c44035b.f414586d.listFiles()));
        C44034a.a(C44035b.f(c44035b.f414587e.listFiles()));
        C44034a.a(C44035b.f(c44035b.f414588f.listFiles()));
        c37598u2.f361015p.d(null);
        return C37030m.f(null);
    }
}
