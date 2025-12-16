package com.avito.android.coil;

import Y61.k;
import android.app.Application;
import androidx.compose.runtime.internal.P;
import coil.disk.a;
import coil.j;
import coil.request.C27245b;
import coil.util.o;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.di.module.InterfaceC30071i5;
import com.avito.android.util.C;
import java.io.File;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C43074z;
import kotlin.Metadata;
import kotlin.io.j;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import okhttp3.OkHttpClient;
import okio.S;

/* compiled from: InitCoilTask.kt */
@C11.a
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/android/coil/InitCoilTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/util/C;", "buildInfo", "Lcom/avito/android/P;", "features", "Lokhttp3/OkHttpClient;", "httpClient", "<init>", "(Lcom/avito/android/util/C;Lcom/avito/android/P;Lokhttp3/OkHttpClient;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/util/C;", "Lcom/avito/android/P;", "Lokhttp3/OkHttpClient;", "Companion", "a", "_design-modules_compose_shared_coil_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InitCoilTask implements ApplicationBlockingStartupTask {

    @k
    private final C buildInfo;

    @k
    private final com.avito.android.P features;

    @k
    private final OkHttpClient httpClient;
    public static final int $stable = 8;

    /* compiled from: InitCoilTask.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcoil/disk/a;", "invoke", "()Lcoil/disk/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<coil.disk.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Application f119728l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Application application) {
            super(0);
            this.f119728l = application;
        }

        @Override // Y41.a
        public final coil.disk.a invoke() {
            a.C2070a c2070a = new a.C2070a();
            File cacheDir = this.f119728l.getCacheDir();
            cacheDir.mkdirs();
            c2070a.f58313a = S.a.a(S.f420033c, j.e(cacheDir, "coil_image_cache"));
            return c2070a.a();
        }
    }

    @Inject
    public InitCoilTask(@k C c12, @k com.avito.android.P p12, @InterfaceC30071i5 @k OkHttpClient okHttpClient) {
        this.buildInfo = c12;
        this.features = p12;
        this.httpClient = okHttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil.j execute$lambda$2(Application application, InitCoilTask initCoilTask) {
        j.a aVar = new j.a(application);
        aVar.f58509e = new C43074z(initCoilTask.httpClient);
        aVar.f58510f = d.f119731c;
        aVar.f58508d = C42727D.c(new b(application));
        com.avito.android.P p12 = initCoilTask.features;
        p12.getClass();
        n<Object> nVar = com.avito.android.P.f67370w0[80];
        if (((Boolean) p12.f67423n0.a().invoke()).booleanValue() && !initCoilTask.buildInfo.l()) {
            aVar.f58506b = C27245b.a(aVar.f58506b, 32639);
        }
        if (!initCoilTask.buildInfo.l()) {
            aVar.f58512h = new o(0, 1, null);
        }
        return aVar.a();
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        a aVar = new a(application, this);
        coil.d dVar = coil.d.f58265a;
        synchronized (coil.d.class) {
            coil.d.f58267c = aVar;
            coil.d.f58266b = null;
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
