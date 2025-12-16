package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class ddb implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gdb b;

    public /* synthetic */ ddb(gdb gdbVar, int i) {
        this.a = i;
        this.b = gdbVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return gdb.v(this.b);
            case 1:
                v1a v1aVar = a93.s0;
                gdb gdbVar = this.b;
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(v1aVar.y(gdbVar).b().e, (int) 4285010943L);
                valueAnimatorOfArgb.addUpdateListener(new q00(19, gdbVar));
                valueAnimatorOfArgb.setDuration(650L);
                valueAnimatorOfArgb.setStartDelay(800L);
                return valueAnimatorOfArgb;
            default:
                uog.i(this.b, p07.CONFIRM);
                return qqg.a;
        }
    }
}
