package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* loaded from: classes2.dex */
public final class ok8 extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener, pk8 {
    public String w0;
    public boolean x0;
    public nk8 y0;
    public mk8 z0;

    public final boolean a(int i, int i2, String str) {
        if (str == null || str.length() == 0) {
            f();
            return true;
        }
        String str2 = this.w0;
        if (str2 != null && fni.a(str2, str)) {
            return false;
        }
        this.x0 = true;
        this.w0 = str;
        RLottieDrawable rLottieDrawableCreate = RLottieFactory.create(new RLottieFactory.Config.Builder().setAutoStart(true).setAutoRepeat(true).setWay(new RLottieFactory.Way.Url.Builder().setUrl(str).setSize(i, i2).setNetworkFetchEnabled(true).build()).build());
        rLottieDrawableCreate.addDrawableLoadListener(this);
        rLottieDrawableCreate.addOnNextFrameRenderedListener(this);
        RLottieImageViewUtils.setLottieDrawable(this, rLottieDrawableCreate);
        return true;
    }

    @Override // defpackage.pk8
    public final void f() {
        RLottieImageViewUtils.release(this);
        this.w0 = null;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onError(Throwable th) {
        if (this.z0 != null) {
            wqi.e(sk8.class.getName(), "lottie set animation failed: ", th);
        }
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        wqi.c(ok8.class.getName(), "onLoaded %s", rLottieDrawable);
    }

    @Override // one.me.rlottie.RLottieDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.x0) {
            nk8 nk8Var = this.y0;
            if (nk8Var != null) {
                nk8Var.f();
            }
            this.x0 = false;
        }
    }

    public final void setFailureListener(mk8 mk8Var) {
        this.z0 = mk8Var;
    }

    public final void setOnFirstFrameListener(nk8 nk8Var) {
        this.y0 = nk8Var;
        this.x0 = true;
    }
}
