package leakcanary.internal;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import leakcanary.E;

/* compiled from: AndroidOFragmentDestroyWatcher.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lleakcanary/internal/a;", "Lkotlin/Function1;", "Landroid/app/Activity;", "Lkotlin/G0;", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
@SuppressLint({"NewApi"})
/* loaded from: classes8.dex */
public final class a implements l<Activity, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManagerFragmentLifecycleCallbacksC11798a f414077b = new FragmentManagerFragmentLifecycleCallbacksC11798a();

    /* renamed from: c, reason: collision with root package name */
    public final E f414078c;

    /* compiled from: AndroidOFragmentDestroyWatcher.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/internal/a$a", "Landroid/app/FragmentManager$FragmentLifecycleCallbacks;", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: leakcanary.internal.a$a, reason: collision with other inner class name */
    public static final class FragmentManagerFragmentLifecycleCallbacksC11798a extends FragmentManager.FragmentLifecycleCallbacks {
        public FragmentManagerFragmentLifecycleCallbacksC11798a() {
        }

        @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentDestroyed(@k FragmentManager fragmentManager, @k Fragment fragment) {
            a.this.f414078c.a(fragment, fragment.getClass().getName().concat(" received Fragment#onDestroy() callback"));
        }

        @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentViewDestroyed(@k FragmentManager fragmentManager, @k Fragment fragment) {
            View view = fragment.getView();
            if (view != null) {
                a.this.f414078c.a(view, fragment.getClass().getName().concat(" received Fragment#onDestroyView() callback (references to its views should be cleared to prevent leaks)"));
            }
        }
    }

    public a(@k E e12) {
        this.f414078c = e12;
    }

    @Override // Y41.l
    public final G0 invoke(Activity activity) {
        activity.getFragmentManager().registerFragmentLifecycleCallbacks(this.f414077b, true);
        return G0.f406611a;
    }
}
