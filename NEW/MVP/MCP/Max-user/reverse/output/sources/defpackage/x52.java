package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class x52 implements Animatable {
    public AnimatorSet X;
    public boolean Y;
    public final ka5 Z;
    public final hdb a;
    public final wu7 b;
    public final hdb c;
    public final float d = (vw4.d().getDisplayMetrics().density * 28.0f) / (vw4.d().getDisplayMetrics().density * 24.0f);
    public final Float[] o;
    public final float s0;

    public x52(hdb hdbVar, wu7 wu7Var, hdb hdbVar2) {
        this.a = hdbVar;
        this.b = wu7Var;
        this.c = hdbVar2;
        Float[] fArr = new Float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = null;
        }
        this.o = fArr;
        this.Z = new ka5(2);
        this.s0 = ((vw4.d().getDisplayMetrics().density * 28.0f) - (vw4.d().getDisplayMetrics().density * 24.0f)) / 2;
    }

    public static final void a(x52 x52Var, int i) {
        ka5 ka5Var = x52Var.Z;
        if (x52Var.o[i] != null) {
            AtomicInteger atomicInteger = (AtomicInteger) ka5Var.a;
            if (atomicInteger.incrementAndGet() == 4) {
                atomicInteger.set(0);
                yf yfVar = (yf) ka5Var.b;
                ka5Var.c = yfVar != null ? Integer.valueOf(yfVar.b()) : null;
            }
            Integer num = (Integer) ka5Var.c;
            if (num != null && num.intValue() == i) {
                x52Var.b.invoke(Integer.valueOf(i));
                ka5Var.c = null;
            }
        }
    }

    public final ValueAnimator b(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(200L);
        valueAnimatorOfFloat.addUpdateListener(new v52(this, i, i2, 0));
        valueAnimatorOfFloat.addListener(new ug(this, i, 1));
        return valueAnimatorOfFloat;
    }

    public final void c(boolean z) {
        ValueAnimator valueAnimatorB;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (z) {
            valueAnimatorB = ValueAnimator.ofFloat(1.0f, this.d);
            valueAnimatorB.setStartDelay(200L);
            valueAnimatorB.setDuration(200L);
            valueAnimatorB.setInterpolator(new LinearInterpolator());
            valueAnimatorB.addUpdateListener(new q00(8, this));
            valueAnimatorB.addListener(new qe(4, this));
        } else {
            valueAnimatorB = b(1, 2);
        }
        arrayList.add(valueAnimatorB);
        arrayList.add(b(0, 1));
        arrayList.add(b(2, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setDuration(1200L);
        animatorSet.addListener(new w52(i, this));
        animatorSet.start();
        this.X = animatorSet;
    }

    public final void d(int i) {
        Object q85Var;
        int i2 = 0;
        this.Y = false;
        Float[] fArr = this.o;
        int length = fArr.length;
        while (true) {
            q85Var = null;
            Float fValueOf = null;
            if (i2 >= length) {
                break;
            }
            if (i2 < i) {
                this.Y = true;
                fValueOf = Float.valueOf(1.0f);
            }
            fArr[i2] = fValueOf;
            i2++;
        }
        ka5 ka5Var = this.Z;
        ka5Var.c = null;
        if (i != 0) {
            if (i == 1) {
                q85Var = new q85(13);
            } else if (i == 2) {
                l16 l16Var = new l16(4);
                l16Var.b = 1;
                q85Var = l16Var;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("avatars count must be in range 0..3");
                }
                q85Var = new zf(0);
            }
        }
        ka5Var.b = q85Var;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        AnimatorSet animatorSet = this.X;
        return animatorSet != null && animatorSet.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (isRunning()) {
            stop();
        }
        if (this.Y) {
            c(true);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        AnimatorSet animatorSet = this.X;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.X = null;
    }
}
