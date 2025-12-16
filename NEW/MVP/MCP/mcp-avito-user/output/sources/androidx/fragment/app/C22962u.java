package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C22962u {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final CopyOnWriteArrayList<a> f46603a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final FragmentManager f46604b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* renamed from: androidx.fragment.app.u$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final FragmentManager.n f46605a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46606b;

        public a(@j.N FragmentManager.n nVar, boolean z12) {
            this.f46605a = nVar;
            this.f46606b = z12;
        }
    }

    public C22962u(@j.N FragmentManager fragmentManager) {
        this.f46604b = fragmentManager;
    }

    public final void a(@j.N Fragment fragment, @j.P Bundle bundle, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.a(fragment, bundle, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentActivityCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void b(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        ActivityC22955m activityC22955m = fragmentManager.f46384v.f46584c;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.b(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentAttached(fragmentManager, fragment, activityC22955m);
            }
        }
    }

    public final void c(@j.N Fragment fragment, @j.P Bundle bundle, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.c(fragment, bundle, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void d(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.d(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentDestroyed(fragmentManager, fragment);
            }
        }
    }

    public final void e(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.e(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentDetached(fragmentManager, fragment);
            }
        }
    }

    public final void f(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.f(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentPaused(fragmentManager, fragment);
            }
        }
    }

    public final void g(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        ActivityC22955m activityC22955m = fragmentManager.f46384v.f46584c;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.g(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentPreAttached(fragmentManager, fragment, activityC22955m);
            }
        }
    }

    public final void h(@j.N Fragment fragment, @j.P Bundle bundle, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.h(fragment, bundle, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentPreCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void i(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.i(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentResumed(fragmentManager, fragment);
            }
        }
    }

    public final void j(@j.N Fragment fragment, @j.N Bundle bundle, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.j(fragment, bundle, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void k(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.k(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentStarted(fragmentManager, fragment);
            }
        }
    }

    public final void l(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.l(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentStopped(fragmentManager, fragment);
            }
        }
    }

    public final void m(@j.N Fragment fragment, @j.N View view, @j.P Bundle bundle, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            }
        }
    }

    public final void n(@j.N Fragment fragment, boolean z12) {
        FragmentManager fragmentManager = this.f46604b;
        Fragment fragment2 = fragmentManager.f46386x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f46376n.n(fragment, true);
        }
        Iterator<a> it = this.f46603a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z12 || next.f46606b) {
                next.f46605a.onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }
    }
}
