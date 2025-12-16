package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o7h extends FrameLayout {
    public final odh a;
    public final ShapeDrawable b;
    public final Drawable c;
    public final ImageView d;
    public ViewPropertyAnimator o;

    public o7h(Context context) {
        super(context, null);
        odh odhVar = new odh(context);
        odhVar.setId(m1b.C);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        odhVar.setLayoutParams(layoutParams);
        odhVar.setVideoShape(jdh.a);
        odhVar.setVideoContentMode(idh.b);
        this.a = odhVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setTintList(ColorStateList.valueOf(getVolumeIconBackgroundColor()));
        this.b = shapeDrawable;
        int i = yud.L0;
        int volumeIconColor = getVolumeIconColor();
        Drawable drawableMutate = r34.b(getContext(), i).mutate();
        cei.k(drawableMutate, volumeIconColor);
        this.c = drawableMutate;
        ImageView imageView = new ImageView(context);
        float f = 24;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = kti.d(20 * vw4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams2);
        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
        imageView.setPadding(iD, iD, iD, iD);
        imageView.setBackground(shapeDrawable);
        imageView.setImageDrawable(drawableMutate);
        tqi.c(new er(this, (Continuation) null, 14), imageView);
        this.d = imageView;
        addView(odhVar);
        addView(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getVolumeIconBackgroundColor() {
        return a93.s0.y(this).b().g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getVolumeIconColor() {
        a93.s0.y(this).getIcon();
        return -1;
    }

    public final void c(boolean z) {
        ViewPropertyAnimator viewPropertyAnimator = this.o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator duration = this.d.animate().alpha(z ? 1.0f : 0.0f).setDuration(200L);
        this.o = duration;
        if (duration != null) {
            duration.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewPropertyAnimator viewPropertyAnimator = this.o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.o = null;
        super.onDetachedFromWindow();
    }
}
