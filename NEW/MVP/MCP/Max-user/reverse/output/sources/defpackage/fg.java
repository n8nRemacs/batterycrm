package defpackage;

import android.animation.AnimatorSet;
import android.util.Property;
import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fg extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ View Z;
    public AnimatorSet o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(View view, Continuation continuation) {
        super(2, continuation);
        this.Z = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fg fgVar = new fg(this.Z, continuation);
        fgVar.Y = obj;
        return fgVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        AnimatorSet animatorSet;
        f84 f84Var;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.Y;
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property = View.ALPHA;
            View view = this.Z;
            animatorSet2.playSequentially(cqi.b(view, property, 1.0f, 0.0f, 300L, 0L, 112), cqi.b(view, property, 0.0f, 1.0f, 300L, 0L, 112));
            animatorSet = animatorSet2;
            f84Var = f84Var2;
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
            Object objC = s8j.c(1300L, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        }
        animatorSet.cancel();
        return qqg.a;
    }
}
