package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* loaded from: classes2.dex */
public final class j9d implements RLottieDrawable.OnAllFramesRenderedListener {
    public boolean a;
    public final /* synthetic */ k9d b;
    public final /* synthetic */ RLottieImageView c;

    public j9d(k9d k9dVar, RLottieImageView rLottieImageView) {
        this.b = k9dVar;
        this.c = rLottieImageView;
    }

    @Override // one.me.rlottie.RLottieDrawable.OnAllFramesRenderedListener
    public final void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z) {
        k9d k9dVar = this.b;
        ho7.q("Reaction effect. OnAllFramesRendered, called:", k9dVar.a, this.a);
        if (this.a) {
            return;
        }
        k9dVar.post(new se5(this, k9dVar, this.c, 29));
    }
}
