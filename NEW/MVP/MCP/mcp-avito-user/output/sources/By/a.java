package BY;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.screens.InterfaceC28477j;
import id.i;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ForegroundScreenProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBY/a;", "Lid/i;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C0058a f1460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f1461c;

    /* compiled from: ForegroundScreenProvider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"BY/a$a", "Landroidx/fragment/app/FragmentManager$n;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BY.a$a, reason: collision with other inner class name */
    public static final class C0058a extends FragmentManager.n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f1462a;

        public C0058a(b bVar) {
            this.f1462a = bVar;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentPaused(@k FragmentManager fragmentManager, @k Fragment fragment) {
            b bVar = this.f1462a;
            WeakReference<Fragment> weakReference = bVar.f1464b;
            if (L.f(weakReference != null ? weakReference.get() : null, fragment)) {
                bVar.f1464b = null;
            }
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentResumed(@k FragmentManager fragmentManager, @k Fragment fragment) {
            if (fragment instanceof InterfaceC28477j.b) {
                this.f1462a.f1464b = new WeakReference<>(fragment);
            }
        }
    }

    public a(b bVar) {
        this.f1461c = bVar;
        this.f1460b = new C0058a(bVar);
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
        ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
        FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            supportFragmentManager.e0(this.f1460b, true);
        }
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@k Activity activity) {
        ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
        FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            supportFragmentManager.v0(this.f1460b);
        }
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@k Activity activity) {
        b bVar = this.f1461c;
        WeakReference<Activity> weakReference = bVar.f1463a;
        if (L.f(weakReference != null ? weakReference.get() : null, activity)) {
            bVar.f1463a = null;
        }
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@k Activity activity) {
        if (activity instanceof InterfaceC28477j.b) {
            this.f1461c.f1463a = new WeakReference<>(activity);
        }
    }
}
