package com.avito.android.app.task;

import android.app.Application;
import android.content.Context;
import com.avito.android.analytics.screens.D;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.InterfaceC35874q1;
import com.facebook.drawee.backends.pipeline.c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.r;
import com.facebook.imagepipeline.nativecode.NativeCodeInitializer;
import iX0.C41358a;
import iX0.C41360c;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import uW0.C48986a;
import uW0.C48987b;

/* compiled from: InitFrescoTask.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/app/task/InitFrescoTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/util/C;", "buildInfo", "Lcom/avito/android/image_loader/fresco/h;", "memoryRegistry", "Lcom/avito/android/util/q1;", "foregroundStatusCallbacks", "Lcom/facebook/imagepipeline/backends/okhttp3/e;", "networkFetcher", "Lcom/avito/android/P;", "features", "Lcom/avito/android/analytics/task/a;", "tracker", "<init>", "(Lcom/avito/android/util/C;Lcom/avito/android/image_loader/fresco/h;Lcom/avito/android/util/q1;Lcom/facebook/imagepipeline/backends/okhttp3/e;Lcom/avito/android/P;Lcom/avito/android/analytics/task/a;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/util/C;", "Lcom/avito/android/image_loader/fresco/h;", "Lcom/avito/android/util/q1;", "Lcom/facebook/imagepipeline/backends/okhttp3/e;", "Lcom/avito/android/P;", "Lcom/avito/android/analytics/task/a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InitFrescoTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final com.avito.android.util.C buildInfo;

    @Y61.k
    private final com.avito.android.P features;

    @Y61.k
    private final InterfaceC35874q1 foregroundStatusCallbacks;

    @Y61.k
    private final com.avito.android.image_loader.fresco.h memoryRegistry;

    @Y61.k
    private final com.facebook.imagepipeline.backends.okhttp3.e networkFetcher;

    @Y61.k
    private final com.avito.android.analytics.task.a tracker;

    public InitFrescoTask(@Y61.k com.avito.android.util.C c12, @Y61.k com.avito.android.image_loader.fresco.h hVar, @Y61.k InterfaceC35874q1 interfaceC35874q1, @Y61.k com.facebook.imagepipeline.backends.okhttp3.e eVar, @Y61.k com.avito.android.P p12, @Y61.k com.avito.android.analytics.task.a aVar) {
        this.buildInfo = c12;
        this.memoryRegistry = hVar;
        this.foregroundStatusCallbacks = interfaceC35874q1;
        this.networkFetcher = eVar;
        this.features = p12;
        this.tracker = aVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        com.facebook.drawee.backends.pipeline.c cVar;
        boolean z12;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        this.foregroundStatusCallbacks.a(this.memoryRegistry);
        application.registerActivityLifecycleCallbacks(this.foregroundStatusCallbacks);
        application.registerComponentCallbacks(this.memoryRegistry);
        r.b bVar = com.facebook.imagepipeline.core.r.f340301y;
        r.a aVar = new r.a(application, null);
        com.avito.android.P p12 = this.features;
        p12.getClass();
        kotlin.reflect.n<Object>[] nVarArr = com.avito.android.P.f67370w0;
        kotlin.reflect.n<Object> nVar = nVarArr[67];
        if (((Boolean) p12.f67397a0.a().invoke()).booleanValue()) {
            aVar.f340329d = 1;
        }
        aVar.f340330e = this.networkFetcher;
        aVar.f340328c = this.memoryRegistry;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.buildInfo.o().getClass();
        aVar.f340331f = linkedHashSet;
        aVar.f340327b = true;
        com.facebook.imagepipeline.core.r rVar = new com.facebook.imagepipeline.core.r(aVar, null);
        com.avito.android.P p13 = this.features;
        p13.getClass();
        kotlin.reflect.n<Object> nVar2 = nVarArr[23];
        if (((Boolean) p13.f67430r.a().invoke()).booleanValue()) {
            c.b bVar2 = new c.b();
            bVar2.f339914a = com.facebook.common.internal.t.a(Boolean.TRUE);
            cVar = new com.facebook.drawee.backends.pipeline.c(bVar2, null);
        } else {
            cVar = null;
        }
        this.tracker.a(fA2.b(), "fresco-prepare");
        com.avito.android.analytics.screens.F fA3 = D.a.a();
        com.avito.android.image_loader.fresco.i iVar = com.avito.android.image_loader.fresco.i.f169544a;
        com.avito.android.P p14 = this.features;
        p14.getClass();
        kotlin.reflect.n<Object> nVar3 = nVarArr[68];
        boolean zBooleanValue = ((Boolean) p14.f67399b0.a().invoke()).booleanValue();
        iVar.getClass();
        if (zBooleanValue) {
            C41358a.a(new C41360c());
        }
        com.facebook.imagepipeline.systrace.b.a();
        if (com.facebook.drawee.backends.pipeline.d.f339916b) {
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(5)) {
                c48987b.b(5, com.facebook.drawee.backends.pipeline.d.class.getSimpleName(), "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            }
        } else {
            com.facebook.drawee.backends.pipeline.d.f339916b = true;
        }
        synchronized (C41358a.class) {
            z12 = C41358a.f398547a != null;
        }
        if (!z12) {
            com.facebook.imagepipeline.systrace.b.a();
            try {
                try {
                    try {
                        try {
                            try {
                                NativeCodeInitializer.class.getMethod("init", Context.class).invoke(null, application);
                            } catch (IllegalAccessException unused) {
                                C41358a.b(new C41360c());
                            }
                        } catch (ClassNotFoundException unused2) {
                            C41358a.b(new C41360c());
                        }
                    } catch (InvocationTargetException unused3) {
                        C41358a.b(new C41360c());
                    }
                } catch (NoSuchMethodException unused4) {
                    C41358a.b(new C41360c());
                }
                com.facebook.imagepipeline.systrace.b.a();
            } catch (Throwable th2) {
                com.facebook.imagepipeline.systrace.b.a();
                throw th2;
            }
        }
        Context applicationContext = application.getApplicationContext();
        synchronized (com.facebook.imagepipeline.core.u.class) {
            try {
                if (com.facebook.imagepipeline.core.u.f340344t != null) {
                    C48987b c48987b2 = C48986a.f440079a;
                    if (c48987b2.a(5)) {
                        c48987b2.b(5, com.facebook.imagepipeline.core.u.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                    }
                }
                com.facebook.imagepipeline.core.u.f340344t = new com.facebook.imagepipeline.core.u(rVar);
            } finally {
            }
        }
        com.facebook.imagepipeline.systrace.b.a();
        com.facebook.drawee.backends.pipeline.g gVar = new com.facebook.drawee.backends.pipeline.g(applicationContext, cVar);
        com.facebook.drawee.backends.pipeline.d.f339915a = gVar;
        SimpleDraweeView.f340162i = gVar;
        com.facebook.imagepipeline.systrace.b.a();
        com.facebook.imagepipeline.systrace.b.a();
        this.tracker.a(fA3.b(), "fresco-init");
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
