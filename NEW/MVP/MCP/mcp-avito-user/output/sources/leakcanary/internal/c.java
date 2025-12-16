package leakcanary.internal;

import Y41.l;
import Y61.k;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.lang.reflect.Proxy;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C42822w;
import leakcanary.D;

/* compiled from: BackgroundListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/internal/c;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "a", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final b f414080b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f414081c;

    /* renamed from: d, reason: collision with root package name */
    public final D f414082d;

    /* renamed from: e, reason: collision with root package name */
    public final l<Boolean, G0> f414083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Application.ActivityLifecycleCallbacks f414084f;

    /* compiled from: BackgroundListener.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lleakcanary/internal/c$a;", "", "<init>", "()V", "", "BACKGROUND_DELAY_MS", "J", "BACKGROUND_REPEAT_DELAY_MS", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: BackgroundListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/internal/c$b", "Ljava/lang/Runnable;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            boolean zB2 = cVar.f414082d.b();
            if (cVar.f414081c != zB2) {
                cVar.f414081c = zB2;
                cVar.f414083e.invoke(Boolean.valueOf(zB2));
            }
            if (zB2) {
                return;
            }
            d.b().removeCallbacks(this);
            d.b().postDelayed(this, 5000L);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k D d12, @k l<? super Boolean, G0> lVar) throws IllegalArgumentException {
        Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, f.f414092a);
        if (objNewProxyInstance == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
        }
        this.f414084f = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
        this.f414082d = d12;
        this.f414083e = lVar;
        this.f414080b = new b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull @k Activity activity, @Y61.l @Nullable Bundle bundle) {
        this.f414084f.onActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull @k Activity activity) {
        this.f414084f.onActivityDestroyed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@k Activity activity) {
        Handler handlerB = d.b();
        b bVar = this.f414080b;
        handlerB.removeCallbacks(bVar);
        d.b().postDelayed(bVar, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@k Activity activity) {
        if (this.f414081c) {
            this.f414081c = false;
            this.f414083e.invoke(Boolean.FALSE);
        }
        d.b().removeCallbacks(this.f414080b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull @k Activity activity, @NonNull @k Bundle bundle) {
        this.f414084f.onActivitySaveInstanceState(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull @k Activity activity) {
        this.f414084f.onActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull @k Activity activity) {
        this.f414084f.onActivityStopped(activity);
    }
}
