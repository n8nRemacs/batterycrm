package com.avito.android.app.task;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import com.avito.android.util.V2;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import kotlin.Metadata;
import leakcanary.C43744b;
import leakcanary.C43748f;
import leakcanary.C43756n;
import leakcanary.L;

/* compiled from: LeakCanaryReleaseTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/app/task/LeakCanaryReleaseTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/I1;", "performanceFeatures", "Lcom/avito/android/leakcanary/release/f;", "leakCanaryInitializer", "<init>", "(Lcom/avito/android/I1;Lcom/avito/android/leakcanary/release/f;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/I1;", "Lcom/avito/android/leakcanary/release/f;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LeakCanaryReleaseTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final com.avito.android.leakcanary.release.f leakCanaryInitializer;

    @Y61.k
    private final com.avito.android.I1 performanceFeatures;

    @Inject
    public LeakCanaryReleaseTask(@Y61.k com.avito.android.I1 i12, @Y61.k com.avito.android.leakcanary.release.f fVar) {
        this.performanceFeatures = i12;
        this.leakCanaryInitializer = fVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    @j.l0
    public void execute(@Y61.k Application application) {
        final com.avito.android.leakcanary.release.f fVar = this.leakCanaryInitializer;
        com.avito.android.I1 i12 = this.performanceFeatures;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.I1.f67278k0[8];
        boolean zBooleanValue = ((Boolean) i12.f67320i.a().invoke()).booleanValue();
        fVar.getClass();
        try {
            ((C43756n) fVar.f175083d.getValue()).a();
        } catch (IOException e12) {
            V2.f318762a.a("DEFAULT_TAG", "ReleaseLeakCanaryInitializer could not delete dump files", e12);
        }
        if (zBooleanValue) {
            fVar.f175081b.e().d(new Runnable() { // from class: com.avito.android.leakcanary.release.d
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar;
                    boolean z12;
                    C43744b c43744b = C43744b.f414040d;
                    c43744b.getClass();
                    if (C43744b.f414038b != null) {
                        z12 = true;
                        dVar = this;
                    } else {
                        dVar = this;
                        z12 = false;
                    }
                    f fVar2 = fVar;
                    if (!z12) {
                        C43744b.a(c43744b, fVar2.f175080a);
                    }
                    C43756n c43756n = (C43756n) fVar2.f175083d.getValue();
                    k kVar = fVar2.f175082c;
                    i iVar = new i(1, kVar, k.class, "report", "report(Lleakcanary/HeapAnalysisJob$Result;)V", 0);
                    Application application2 = fVar2.f175080a;
                    ExecutorService executorService = fVar2.f175084e;
                    C43748f c43748f = new C43748f(application2, c43756n, executorService, null, iVar, 8, null);
                    leakcanary.internal.d.a();
                    leakcanary.internal.c cVar = c43748f.f414055b;
                    cVar.getClass();
                    c43748f.f414056c.registerActivityLifecycleCallbacks(cVar);
                    if (cVar.f414081c) {
                        cVar.f414081c = false;
                        cVar.f414083e.invoke(Boolean.FALSE);
                    }
                    cVar.f414080b.run();
                    C43756n c43756n2 = (C43756n) fVar2.f175083d.getValue();
                    j jVar = new j(1, kVar, k.class, "report", "report(Lleakcanary/HeapAnalysisJob$Result;)V", 0);
                    Application application3 = fVar2.f175080a;
                    L l12 = new L(application3, c43756n2, executorService, jVar);
                    leakcanary.internal.d.a();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    int i13 = Build.VERSION.SDK_INT;
                    L.b bVar = l12.f414001b;
                    if (i13 >= 33) {
                        application3.registerReceiver(bVar, intentFilter, 2);
                    } else {
                        application3.registerReceiver(bVar, intentFilter);
                    }
                }
            });
        }
    }
}
