package Gs;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import id.i;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CriticalSectionsWatcher.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGs/d;", "", "_common_critical-sections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f6756a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f6757b = new a();

    /* compiled from: CriticalSectionsWatcher.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Gs/d$a", "Lid/i;", "_common_critical-sections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends i {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C0377a f6758b;

        /* compiled from: CriticalSectionsWatcher.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Gs/d$a$a", "Landroidx/fragment/app/FragmentManager$n;", "_common_critical-sections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Gs.d$a$a, reason: collision with other inner class name */
        public static final class C0377a extends FragmentManager.n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f6760a;

            public C0377a(d dVar) {
                this.f6760a = dVar;
            }

            @Override // androidx.fragment.app.FragmentManager.n
            public final void onFragmentPreAttached(@k FragmentManager fragmentManager, @k Fragment fragment, @k Context context) {
                if (fragment instanceof InterfaceC13913b) {
                    c cVar = this.f6760a.f6756a;
                    C13912a.f6752b.getClass();
                    String name = fragment.getClass().getName();
                    cVar.getClass();
                    c.b(name);
                }
            }

            @Override // androidx.fragment.app.FragmentManager.n
            public final void onFragmentResumed(@k FragmentManager fragmentManager, @k Fragment fragment) {
                if (fragment instanceof InterfaceC13913b) {
                    c cVar = this.f6760a.f6756a;
                    C13912a.f6752b.getClass();
                    String name = fragment.getClass().getName();
                    cVar.getClass();
                    c.a(name);
                }
            }
        }

        public a() {
            this.f6758b = new C0377a(d.this);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
            ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
            FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                supportFragmentManager.e0(this.f6758b, true);
            }
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@k Activity activity) {
            ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
            FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                supportFragmentManager.v0(this.f6758b);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostResumed(@k Activity activity) {
            if (activity instanceof InterfaceC13913b) {
                c cVar = d.this.f6756a;
                C13912a.f6752b.getClass();
                String name = activity.getClass().getName();
                cVar.getClass();
                c.a(name);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreCreated(@k Activity activity, @l Bundle bundle) {
            if (activity instanceof InterfaceC13913b) {
                c cVar = d.this.f6756a;
                C13912a.f6752b.getClass();
                String name = activity.getClass().getName();
                cVar.getClass();
                c.b(name);
            }
        }
    }

    public d(@k c cVar) {
        this.f6756a = cVar;
    }
}
