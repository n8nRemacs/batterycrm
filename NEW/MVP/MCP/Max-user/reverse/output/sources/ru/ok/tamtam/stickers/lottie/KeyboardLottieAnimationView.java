package ru.ok.tamtam.stickers.lottie;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.sz7;
import defpackage.tz7;
import defpackage.wqi;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

@Deprecated
/* loaded from: classes2.dex */
public class KeyboardLottieAnimationView extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener {
    public boolean w0;

    public KeyboardLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onError(Throwable th) {
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        wqi.c("ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView", "onLoaded %s", rLottieDrawable);
    }

    @Override // one.me.rlottie.RLottieDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.w0) {
            this.w0 = false;
        }
    }

    public void setFailureListener(sz7 sz7Var) {
    }

    public void setOnFirstFrameListener(tz7 tz7Var) {
        this.w0 = true;
    }
}
