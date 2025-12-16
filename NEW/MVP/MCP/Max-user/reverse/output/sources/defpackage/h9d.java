package defpackage;

import android.view.View;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* loaded from: classes2.dex */
public final class h9d implements View.OnAttachStateChangeListener {
    public final /* synthetic */ RLottieImageView a;
    public final /* synthetic */ k9d b;
    public final /* synthetic */ RLottieDrawable c;
    public final /* synthetic */ i9d d;
    public final /* synthetic */ j9d o;

    public h9d(RLottieImageView rLottieImageView, k9d k9dVar, RLottieDrawable rLottieDrawable, i9d i9dVar, j9d j9dVar) {
        this.a = rLottieImageView;
        this.b = k9dVar;
        this.c = rLottieDrawable;
        this.d = i9dVar;
        this.o = j9dVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        wqi.c(this.b.a, "onDetach", new Object[0]);
        i9d i9dVar = this.d;
        RLottieDrawable rLottieDrawable = this.c;
        rLottieDrawable.removeDrawableLoadListener(i9dVar);
        rLottieDrawable.removeOnAllFramesRenderedListener(this.o);
    }
}
