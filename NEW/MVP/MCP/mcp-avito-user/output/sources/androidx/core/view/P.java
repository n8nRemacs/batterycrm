package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class P implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f44976b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f44977c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f44978d;

    public P(View view, Runnable runnable) {
        this.f44976b = view;
        this.f44977c = view.getViewTreeObserver();
        this.f44978d = runnable;
    }

    @j.N
    public static void b(@j.N View view, @j.N Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        P p12 = new P(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(p12);
        view.addOnAttachStateChangeListener(p12);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f44977c.isAlive();
        View view = this.f44976b;
        if (zIsAlive) {
            this.f44977c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f44978d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@j.N View view) {
        this.f44977c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@j.N View view) {
        boolean zIsAlive = this.f44977c.isAlive();
        View view2 = this.f44976b;
        if (zIsAlive) {
            this.f44977c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
