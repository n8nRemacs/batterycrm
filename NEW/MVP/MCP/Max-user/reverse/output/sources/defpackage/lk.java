package defpackage;

import android.graphics.Rect;
import java.util.LinkedHashSet;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class lk implements RLottieDrawable.DrawableLoadListener {
    public final /* synthetic */ ok a;
    public final /* synthetic */ String b;

    public lk(ok okVar, String str) {
        this.a = okVar;
        this.b = str;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onError(Throwable th) {
        ok okVar = this.a;
        wqi.e(okVar.s0, "Animoji lottie download. Fail", th);
        String str = this.b;
        if (str == null || str.length() == 0) {
            okVar.i(jk.a);
        } else {
            okVar.g(str);
        }
        bwf bwfVar = okVar.w0;
        if (bwfVar.e()) {
            nwg nwgVar = (nwg) bwfVar.getValue();
            int i = okVar.a;
            nwgVar.setBounds(new Rect(0, 0, i, i));
        }
        RLottieDrawable rLottieDrawable = okVar.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        okVar.x0 = null;
        okVar.z0.clear();
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        ok okVar = this.a;
        rLottieDrawable.setCallback(okVar.t0);
        okVar.x0 = rLottieDrawable;
        okVar.i(jk.c);
        LinkedHashSet<ImageReceiver> linkedHashSet = okVar.z0;
        for (ImageReceiver imageReceiver : linkedHashSet) {
            RLottieDrawable rLottieDrawable2 = okVar.x0;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.addParentView(imageReceiver);
            }
        }
        linkedHashSet.clear();
        if (!rLottieDrawable.isRunning() && d7j.f(okVar.A0)) {
            rLottieDrawable.start();
        }
        if (rLottieDrawable.getBounds().isEmpty() && !okVar.getBounds().isEmpty()) {
            rLottieDrawable.setBounds(okVar.getBounds());
        }
        rLottieDrawable.invalidateInternal();
        rLottieDrawable.removeDrawableLoadListener(this);
    }
}
