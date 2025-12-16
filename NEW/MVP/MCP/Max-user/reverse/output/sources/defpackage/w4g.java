package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes2.dex */
public final class w4g extends i3 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ View d;

    /* JADX WARN: Illegal instructions before constructor call */
    public w4g(x4g x4gVar) {
        Boolean bool = Boolean.FALSE;
        this.d = x4gVar;
        super(12, bool);
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        int i = this.c;
        View view = this.d;
        switch (i) {
            case 0:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                x4g x4gVar = (x4g) view;
                x4gVar.requestLayout();
                x4gVar.invalidate();
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    b6h b6hVar = (b6h) view;
                    ValueAnimator valueAnimator = b6hVar.E0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f = b6hVar.A0;
                    if (f != 0.0f) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, b6hVar.g());
                        valueAnimatorOfFloat.setDuration(100L);
                        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new y5h(b6hVar, 1));
                        valueAnimatorOfFloat.addListener(new a6h(b6hVar, 1));
                        valueAnimatorOfFloat.start();
                        b6hVar.E0 = valueAnimatorOfFloat;
                        break;
                    }
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    v6h.o((v6h) view);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w4g(b6h b6hVar) {
        Boolean bool = Boolean.FALSE;
        this.d = b6hVar;
        super(12, bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4g(v6h v6hVar) {
        super(12, (Object) null);
        this.d = v6hVar;
    }
}
