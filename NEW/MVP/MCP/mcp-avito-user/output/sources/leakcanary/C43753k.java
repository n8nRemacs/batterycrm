package leakcanary;

import android.annotation.NonNull;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.v0;

/* compiled from: FragmentAndViewModelWatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/k;", "Lleakcanary/s;", "a", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: leakcanary.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43753k implements InterfaceC43760s {

    /* renamed from: e, reason: collision with root package name */
    public static final String f414096e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f414097a;

    /* renamed from: b, reason: collision with root package name */
    public final b f414098b;

    /* renamed from: c, reason: collision with root package name */
    public final Application f414099c;

    /* renamed from: d, reason: collision with root package name */
    public final E f414100d;

    /* compiled from: FragmentAndViewModelWatcher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lleakcanary/k$a;", "", "<init>", "()V", "", "ANDROIDX_FRAGMENT_CLASS_NAME", "Ljava/lang/String;", "ANDROIDX_FRAGMENT_DESTROY_WATCHER_CLASS_NAME", "ANDROID_SUPPORT_FRAGMENT_DESTROY_WATCHER_CLASS_NAME", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: leakcanary.k$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: FragmentAndViewModelWatcher.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/k$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: leakcanary.k$b */
    public static final class b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application.ActivityLifecycleCallbacks f414101b;

        public b() throws IllegalArgumentException {
            Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, leakcanary.internal.f.f414092a);
            if (objNewProxyInstance == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
            }
            this.f414101b = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            Iterator it = C43753k.this.f414097a.iterator();
            while (it.hasNext()) {
                ((Y41.l) it.next()).invoke(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NonNull @Y61.k Activity activity) {
            this.f414101b.onActivityDestroyed(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull @Y61.k Activity activity) {
            this.f414101b.onActivityPaused(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NonNull @Y61.k Activity activity) {
            this.f414101b.onActivityResumed(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NonNull @Y61.k Activity activity, @NonNull @Y61.k Bundle bundle) {
            this.f414101b.onActivitySaveInstanceState(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NonNull @Y61.k Activity activity) {
            this.f414101b.onActivityStarted(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NonNull @Y61.k Activity activity) {
            this.f414101b.onActivityStopped(activity);
        }
    }

    static {
        new a(null);
        f414096e = "android.support.v4.app.Fragment";
    }

    public C43753k(@Y61.k Application application, @Y61.k E e12) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        this.f414099c = application;
        this.f414100d = e12;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new leakcanary.internal.a(e12));
        Y41.l lVarB = b("androidx.fragment.app.Fragment", "leakcanary.internal.AndroidXFragmentDestroyWatcher", e12);
        if (lVarB != null) {
            arrayList.add(lVarB);
        }
        Y41.l lVarB2 = b(f414096e, "leakcanary.internal.AndroidSupportFragmentDestroyWatcher", e12);
        if (lVarB2 != null) {
            arrayList.add(lVarB2);
        }
        this.f414097a = arrayList;
        this.f414098b = new b();
    }

    public static Y41.l b(String str, String str2, E e12) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName(str);
            Class.forName(str2);
            Object objNewInstance = Class.forName(str2).getDeclaredConstructor(E.class).newInstance(e12);
            if (objNewInstance == null) {
                throw new TypeCastException("null cannot be cast to non-null type (android.app.Activity) -> kotlin.Unit");
            }
            v0.e(1, objNewInstance);
            return (Y41.l) objNewInstance;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // leakcanary.InterfaceC43760s
    public final void a() {
        this.f414099c.registerActivityLifecycleCallbacks(this.f414098b);
    }
}
