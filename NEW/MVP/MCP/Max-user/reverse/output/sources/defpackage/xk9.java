package defpackage;

import android.graphics.Paint;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class xk9 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ yk9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk9(yk9 yk9Var, int i) {
        super(12, vk9.a);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.d = yk9Var;
                super(12, bool);
                break;
            default:
                this.d = yk9Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        float f;
        float f2;
        switch (this.c) {
            case 0:
                yk9 yk9Var = this.d;
                yk9Var.d = null;
                yk9Var.o = null;
                yk9Var.s0 = null;
                yk9Var.t0 = null;
                ?? r0 = yk9Var.u0;
                if (r0.e()) {
                    ((uxa) r0.getValue()).setVisibility(8);
                }
                yk9Var.y0 = null;
                ?? r02 = yk9Var.B0;
                if (r02.e()) {
                    ((OneMeDraweeView) r02.getValue()).setVisibility(8);
                }
                yk9Var.w0 = null;
                yk9Var.v0 = null;
                yk9Var.requestLayout();
                yk9Var.invalidate();
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    yk9 yk9Var2 = this.d;
                    Paint paint = yk9Var2.F0;
                    if (zBooleanValue) {
                        f = vw4.d().getDisplayMetrics().density;
                        f2 = 4.0f;
                    } else {
                        f = vw4.d().getDisplayMetrics().density;
                        f2 = 2.0f;
                    }
                    paint.setStrokeWidth(f * f2);
                    yk9Var2.requestLayout();
                    yk9Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
