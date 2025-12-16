package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class dhh {
    public final WeakReference a;

    public dhh(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(ehh ehhVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (ehhVar != null) {
                view.animate().setListener(new kh(ehhVar, 5, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
