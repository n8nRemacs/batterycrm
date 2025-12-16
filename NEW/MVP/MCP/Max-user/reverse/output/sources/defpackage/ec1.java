package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ec1 extends Drawable implements Animatable {
    public static final /* synthetic */ yy7[] Z;
    public final nwe X;
    public final nk Y;
    public final Context a;
    public final Path b = new Path();
    public final lg c;
    public final ObjectAnimator d;
    public final Object o;

    static {
        z8a z8aVar = new z8a(ec1.class, "backgroundColor", "getBackgroundColor$calls_ui_release()Lone/me/calls/ui/animation/CallIndicatorWaveDrawable$Companion$BackgroundColor;");
        vid.a.getClass();
        Z = new yy7[]{z8aVar};
    }

    public ec1(Context context) {
        this.a = context;
        lg lgVar = new lg("waveX", 0);
        this.c = lgVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, lgVar, 0, context.getResources().getDisplayMetrics().widthPixels);
        objectAnimatorOfInt.setDuration(1200L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addUpdateListener(new q00(7, this));
        this.d = objectAnimatorOfInt;
        this.o = ipi.b(3, new i6(25, this));
        nwe nweVarA = a();
        this.X = nweVarA;
        this.Y = new nk(this);
        a().c(nweVarA.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final nwe a() {
        return (nwe) this.o.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Path path = this.b;
        lg lgVar = this.c;
        int iSave = canvas.save();
        try {
            if (this.d.isRunning()) {
                canvas.translate(-lgVar.a, 0.0f);
                canvas.clipOutPath(path);
                canvas.translate(getBounds().width(), 0.0f);
                canvas.clipOutPath(path);
                canvas.translate(lgVar.a - getBounds().width(), 0.0f);
                nk nkVar = this.Y;
                yy7 yy7Var = Z[0];
                int iOrdinal = ((dc1) nkVar.b).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    canvas.drawColor(a93.s0.z(this.a).c.b().l);
                }
            }
            a().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return a().isRunning() || this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        Context context = this.a;
        int iMin = Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        nwe nweVarA = a();
        nweVarA.y0.O(nweVarA, nwe.A0[7], Integer.valueOf(kti.d(100 * vw4.d().getDisplayMetrics().density) / 2));
        a().setBounds(new Rect(0, 0, rect.width(), iMin));
        float f = 15;
        float f2 = 2;
        float fD = fHeight - (kti.d(vw4.d().getDisplayMetrics().density * f) / f2);
        Path path = this.b;
        path.rewind();
        path.moveTo(0.0f, fD);
        float f3 = fWidth / 3.0f;
        path.cubicTo(f3, fHeight - kti.d(vw4.d().getDisplayMetrics().density * f), f3 * f2, fHeight, fWidth, fHeight - (kti.d(f * vw4.d().getDisplayMetrics().density) / f2));
        path.lineTo(fWidth, fHeight);
        path.lineTo(0.0f, fHeight);
        path.lineTo(0.0f, fD);
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
            objectAnimator.setValues(PropertyValuesHolder.ofInt(this.c, 0, context.getResources().getDisplayMetrics().widthPixels));
            objectAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        a().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        a().onThemeChanged(a93.s0.z(this.a).c);
        a().start();
        this.d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        a().onThemeChanged(a93.s0.z(this.a).c);
        a().stop();
        this.d.cancel();
    }
}
