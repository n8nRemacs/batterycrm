package com.avito.android.app.task;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.geo.GeoService;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RegisterGeoPositionCheckingCallbacksTask.kt */
@C11.a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/app/task/RegisterGeoPositionCheckingCallbacksTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/util/a5;", "schedulers", "Lcom/avito/android/permissions/u;", "permissionChecker", "Lcom/avito/android/geo/d;", "model", "<init>", "(Lcom/avito/android/util/a5;Lcom/avito/android/permissions/u;Lcom/avito/android/geo/d;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/util/a5;", "getSchedulers", "()Lcom/avito/android/util/a5;", "Lcom/avito/android/permissions/u;", "getPermissionChecker", "()Lcom/avito/android/permissions/u;", "Lcom/avito/android/geo/d;", "getModel", "()Lcom/avito/android/geo/d;", "Lio/reactivex/rxjava3/disposables/d;", "disposable", "Lio/reactivex/rxjava3/disposables/d;", "_avito_geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RegisterGeoPositionCheckingCallbacksTask implements ApplicationBlockingStartupTask {

    @Y61.l
    private io.reactivex.rxjava3.disposables.d disposable;

    @Y61.k
    private final com.avito.android.geo.d model;

    @Y61.k
    private final com.avito.android.permissions.u permissionChecker;

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    /* compiled from: RegisterGeoPositionCheckingCallbacksTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app/task/RegisterGeoPositionCheckingCallbacksTask$a", "Lid/i;", "_avito_geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends id.i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Application f91510c;

        /* compiled from: RegisterGeoPositionCheckingCallbacksTask.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isLocationExpired", "Lkotlin/G0;", "accept", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.app.task.RegisterGeoPositionCheckingCallbacksTask$a$a, reason: collision with other inner class name */
        public static final class C2694a<T> implements l41.g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterGeoPositionCheckingCallbacksTask f91511b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Application f91512c;

            public C2694a(RegisterGeoPositionCheckingCallbacksTask registerGeoPositionCheckingCallbacksTask, Application application) {
                this.f91511b = registerGeoPositionCheckingCallbacksTask;
                this.f91512c = application;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                if (((Boolean) obj).booleanValue() && this.f91511b.getPermissionChecker().b("android.permission.ACCESS_FINE_LOCATION")) {
                    GeoService.a aVar = GeoService.f159279i;
                    Application application = this.f91512c;
                    aVar.getClass();
                    application.startService(new Intent(application, (Class<?>) GeoService.class).putExtra("accuracy", 0).putExtra("force_update", false).putExtra("timeout", 20000L));
                }
            }
        }

        /* compiled from: RegisterGeoPositionCheckingCallbacksTask.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements l41.g {

            /* renamed from: b, reason: collision with root package name */
            public static final b<T> f91513b = new b<>();

            @Override // l41.g
            public final void accept(Object obj) {
                V2.f318762a.f((Throwable) obj);
            }
        }

        public a(Application application) {
            this.f91510c = application;
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@Y61.k Activity activity) {
            RegisterGeoPositionCheckingCallbacksTask registerGeoPositionCheckingCallbacksTask = RegisterGeoPositionCheckingCallbacksTask.this;
            registerGeoPositionCheckingCallbacksTask.disposable = io.reactivex.rxjava3.core.z.W(new VH0.c(registerGeoPositionCheckingCallbacksTask, 7)).j0(registerGeoPositionCheckingCallbacksTask.getSchedulers().e()).x0(registerGeoPositionCheckingCallbacksTask.getSchedulers().a()).v0(new C2694a(registerGeoPositionCheckingCallbacksTask, this.f91510c), b.f91513b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@Y61.k Activity activity) {
            io.reactivex.rxjava3.disposables.d dVar = RegisterGeoPositionCheckingCallbacksTask.this.disposable;
            if (dVar != null) {
                dVar.dispose();
            }
        }
    }

    @Inject
    public RegisterGeoPositionCheckingCallbacksTask(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.permissions.u uVar, @Y61.k com.avito.android.geo.d dVar) {
        this.schedulers = interfaceC35745a5;
        this.permissionChecker = uVar;
        this.model = dVar;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        application.registerActivityLifecycleCallbacks(new a(application));
        return InterfaceC28559h.a.c.f91606a;
    }

    @Y61.k
    public final com.avito.android.geo.d getModel() {
        return this.model;
    }

    @Y61.k
    public final com.avito.android.permissions.u getPermissionChecker() {
        return this.permissionChecker;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }

    @Y61.k
    public final InterfaceC35745a5 getSchedulers() {
        return this.schedulers;
    }
}
