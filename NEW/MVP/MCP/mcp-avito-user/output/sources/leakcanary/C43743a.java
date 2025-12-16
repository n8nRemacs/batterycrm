package leakcanary;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.TypeCastException;

/* compiled from: ActivityWatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/a;", "Lleakcanary/s;", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: leakcanary.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43743a implements InterfaceC43760s {

    /* renamed from: a, reason: collision with root package name */
    public final C11795a f414032a = new C11795a();

    /* renamed from: b, reason: collision with root package name */
    public final Application f414033b;

    /* renamed from: c, reason: collision with root package name */
    public final E f414034c;

    /* compiled from: ActivityWatcher.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/a$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: leakcanary.a$a, reason: collision with other inner class name */
    public static final class C11795a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application.ActivityLifecycleCallbacks f414035b;

        public C11795a() throws IllegalArgumentException {
            Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, leakcanary.internal.f.f414092a);
            if (objNewProxyInstance == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
            }
            this.f414035b = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NonNull @Y61.k Activity activity, @Y61.l @Nullable Bundle bundle) {
            this.f414035b.onActivityCreated(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@Y61.k Activity activity) {
            C43743a.this.f414034c.a(activity, activity.getClass().getName().concat(" received Activity#onDestroy() callback"));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull @Y61.k Activity activity) {
            this.f414035b.onActivityPaused(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NonNull @Y61.k Activity activity) {
            this.f414035b.onActivityResumed(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NonNull @Y61.k Activity activity, @NonNull @Y61.k Bundle bundle) {
            this.f414035b.onActivitySaveInstanceState(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NonNull @Y61.k Activity activity) {
            this.f414035b.onActivityStarted(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NonNull @Y61.k Activity activity) {
            this.f414035b.onActivityStopped(activity);
        }
    }

    public C43743a(@Y61.k Application application, @Y61.k E e12) {
        this.f414033b = application;
        this.f414034c = e12;
    }

    @Override // leakcanary.InterfaceC43760s
    public final void a() {
        this.f414033b.registerActivityLifecycleCallbacks(this.f414032a);
    }
}
