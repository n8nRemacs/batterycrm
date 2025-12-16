package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a5h extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Drawable Z;
    public AnimatorSet o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5h(Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.Z = drawable;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((a5h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        a5h a5hVar = new a5h(this.Z, continuation);
        a5hVar.Y = obj;
        return a5hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        AnimatorSet animatorSet;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.Y;
            Drawable drawable = this.Z;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, "alpha", 255, 0);
            objectAnimatorOfInt.setDuration(300L);
            ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, "alpha", 0, 255);
            objectAnimatorOfInt2.setDuration(300L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(objectAnimatorOfInt, objectAnimatorOfInt2);
            f84Var = f84Var2;
            animatorSet = animatorSet2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            animatorSet = this.o;
            f84Var = (f84) this.Y;
            try {
                g8j.b(obj);
            } catch (Throwable th) {
                animatorSet.cancel();
                throw th;
            }
        }
        while (d7j.f(f84Var)) {
            animatorSet.cancel();
            animatorSet.start();
            this.Y = f84Var;
            this.o = animatorSet;
            this.X = 1;
            Object objC = s8j.c((2 * 300) + 1000, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        }
        animatorSet.cancel();
        return qqg.a;
    }
}
