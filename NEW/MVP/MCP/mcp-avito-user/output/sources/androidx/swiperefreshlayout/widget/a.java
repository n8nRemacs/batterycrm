package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

/* compiled from: CircleImageView.java */
/* loaded from: classes10.dex */
class a extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    public Animation.AnimationListener f54596b;

    /* renamed from: c, reason: collision with root package name */
    public int f54597c;

    /* compiled from: CircleImageView.java */
    /* renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    public static class C1928a extends OvalShape {
        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public final void draw(Canvas canvas, Paint paint) {
            throw null;
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public final void onResize(float f12, float f13) {
            super.onResize(f12, f13);
            float f14 = ((int) f12) / 2;
            new RadialGradient(f14, f14, 0, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            throw null;
        }
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f54596b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f54596b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i12) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i12);
            this.f54597c = i12;
        }
    }
}
