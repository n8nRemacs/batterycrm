package defpackage;

import android.animation.ValueAnimator;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class ru8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public final /* synthetic */ o6c Y;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru8(MediaBarWidget mediaBarWidget, o6c o6cVar, Continuation continuation) {
        super(2, continuation);
        this.X = mediaBarWidget;
        this.Y = o6cVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        ru8 ru8Var = (ru8) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ru8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ru8 ru8Var = new ru8(this.X, this.Y, continuation);
        ru8Var.o = ((Boolean) obj).booleanValue();
        return ru8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean z = this.o;
        yy7[] yy7VarArr = MediaBarWidget.c1;
        MediaBarWidget mediaBarWidget = this.X;
        Object value = mediaBarWidget.N0().B0.a.getValue();
        d9c d9cVar = d9c.b;
        qqg qqgVar = qqg.a;
        if (value == d9cVar) {
            return qqgVar;
        }
        if (this.Y.getScrollState() == m6c.b && mediaBarWidget.J0().o == null) {
            mediaBarWidget.J0().k();
        }
        ValueAnimator valueAnimator = mediaBarWidget.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = mediaBarWidget.L0.getAlpha();
        int i = z ? (a93.s0.y(mediaBarWidget.F0()).b().f >> 24) & 255 : 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new v52(mediaBarWidget, alpha, i, 1));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.start();
        mediaBarWidget.M0 = valueAnimatorOfFloat;
        return qqgVar;
    }
}
