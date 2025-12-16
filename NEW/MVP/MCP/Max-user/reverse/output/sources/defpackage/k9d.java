package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* loaded from: classes2.dex */
public final class k9d extends FrameLayout {
    public final String a;
    public int b;

    public k9d(Context context) {
        super(context, null, 0);
        this.a = k9d.class.getName();
        this.b = 3;
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public static float c(int i, Rect rect) {
        return ((kti.d(20 * vw4.d().getDisplayMetrics().density) / 2) + u45.c(10, vw4.d().getDisplayMetrics().density, rect.left)) - (i / 2.0f);
    }

    private final zde getLotties() {
        return lee.g(new at(8, this), zx0.A0);
    }

    public final void a(long j, RLottieDrawable rLottieDrawable, Rect rect) {
        nz5 nz5Var = new nz5(lee.g(getLotties(), new c46(j, 2)));
        while (nz5Var.hasNext()) {
            RLottieImageView rLottieImageView = (RLottieImageView) nz5Var.next();
            rLottieImageView.stopAnimation();
            removeView(rLottieImageView);
        }
        int childCount = getChildCount();
        int i = this.b;
        String str = this.a;
        if (childCount >= i) {
            wqi.q(str, "Reaction effect. Reached max count of lotties effects", new Object[0]);
            return;
        }
        int intrinsicWidth = rLottieDrawable.getIntrinsicWidth();
        int intrinsicHeight = rLottieDrawable.getIntrinsicHeight();
        RLottieImageView rLottieImageView2 = new RLottieImageView(getContext());
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView2, rLottieDrawable);
        rLottieImageView2.playAnimation();
        rqi.e(p0d.tag_reaction_effects_view, rLottieImageView2, Long.valueOf(j));
        setLayoutDirection(0);
        rLottieImageView2.setLayoutParams(new FrameLayout.LayoutParams(intrinsicWidth, intrinsicHeight));
        rLottieImageView2.setX(c(intrinsicWidth, rect));
        rLottieImageView2.setY(rect.centerY() - (intrinsicHeight / 2.0f));
        addView(rLottieImageView2);
        i9d i9dVar = new i9d(this, rLottieImageView2);
        rLottieDrawable.addDrawableLoadListener(i9dVar);
        j9d j9dVar = new j9d(this, rLottieImageView2);
        rLottieDrawable.addOnAllFramesRenderedListener(j9dVar);
        if (rLottieImageView2.isAttachedToWindow()) {
            rLottieImageView2.addOnAttachStateChangeListener(new h9d(rLottieImageView2, this, rLottieDrawable, i9dVar, j9dVar));
            return;
        }
        wqi.c(str, "onDetach", new Object[0]);
        rLottieDrawable.removeDrawableLoadListener(i9dVar);
        rLottieDrawable.removeOnAllFramesRenderedListener(j9dVar);
    }

    public final void b() {
        for (RLottieImageView rLottieImageView : getLotties()) {
            rLottieImageView.stopAnimation();
            removeView(rLottieImageView);
        }
    }

    public final void d(long j, Rect rect) {
        Object next;
        Iterator it = getLotties().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (fni.a(rqi.c((RLottieImageView) next, p0d.tag_reaction_effects_view), Long.valueOf(j))) {
                    break;
                }
            }
        }
        RLottieImageView rLottieImageView = (RLottieImageView) next;
        if (rLottieImageView == null) {
            return;
        }
        if (!rLottieImageView.isPlaying()) {
            wqi.c(this.a, "Reaction effect. Skip move", new Object[0]);
            return;
        }
        rLottieImageView.setX(c(rLottieImageView.getDrawable().getIntrinsicWidth(), rect));
        rLottieImageView.setY(rect.centerY() - (r5.getIntrinsicHeight() / 2.0f));
    }

    public final int getLottieMaxCount() {
        return this.b;
    }

    public final void setLottieMaxCount(int i) {
        this.b = i;
    }

    public final void setScrollOffset(int i) {
        float f = i;
        f2 f2Var = new f2(9, this);
        while (f2Var.hasNext()) {
            View view = (View) f2Var.next();
            view.setTranslationY(view.getTranslationY() + f);
        }
    }
}
