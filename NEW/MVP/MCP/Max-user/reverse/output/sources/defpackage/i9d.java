package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* loaded from: classes2.dex */
public final class i9d implements RLottieDrawable.DrawableLoadListener {
    public boolean a;
    public final /* synthetic */ k9d b;
    public final /* synthetic */ RLottieImageView c;

    public i9d(k9d k9dVar, RLottieImageView rLottieImageView) {
        this.b = k9dVar;
        this.c = rLottieImageView;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        ho7.q("Reaction effect. OnLoaded, called:", this.b.a, this.a);
        if (this.a) {
            return;
        }
        this.a = true;
        this.c.playAnimation();
    }
}
