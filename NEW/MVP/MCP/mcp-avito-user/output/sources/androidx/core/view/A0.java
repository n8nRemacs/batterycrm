package androidx.core.view;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f44903a;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @j.X
    public static class a {
    }

    public A0(View view) {
        this.f44903a = new WeakReference<>(view);
    }

    @j.N
    public final void a(float f12) {
        View view = this.f44903a.get();
        if (view != null) {
            view.animate().alpha(f12);
        }
    }

    public final void b() {
        View view = this.f44903a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    @j.N
    public final void c(long j12) {
        View view = this.f44903a.get();
        if (view != null) {
            view.animate().setDuration(j12);
        }
    }

    @j.N
    public final void d(@j.P BaseInterpolator baseInterpolator) {
        View view = this.f44903a.get();
        if (view != null) {
            view.animate().setInterpolator(baseInterpolator);
        }
    }

    @j.N
    public final void e(@j.P B0 b02) {
        View view = this.f44903a.get();
        if (view != null) {
            if (b02 != null) {
                view.animate().setListener(new z0(b02, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void f() {
        View view = this.f44903a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @j.N
    public final void g(float f12) {
        View view = this.f44903a.get();
        if (view != null) {
            view.animate().translationY(f12);
        }
    }

    @j.N
    public final void h(@j.N Runnable runnable) {
        View view = this.f44903a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
    }
}
