package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class hf4 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ if4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hf4(if4 if4Var, int i, boolean z) {
        super(12, (Object) null);
        this.c = i;
        this.d = if4Var;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!fni.a((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    if4 if4Var = this.d;
                    BoringLayout.Metrics metrics = if4Var.getMetrics();
                    TextPaint textPaint = if4.L0;
                    metrics.width = kti.d(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(if4Var.y0);
                    if4Var.D0 = BoringLayout.make(charSequence, textPaint, metrics.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metrics, false);
                    if4Var.invalidate();
                    if4Var.requestLayout();
                    break;
                }
                break;
            case 1:
                CharSequence charSequence2 = (CharSequence) obj2;
                if (!fni.a((CharSequence) obj, charSequence2)) {
                    if4 if4Var2 = this.d;
                    if (charSequence2 != null) {
                        BoringLayout.Metrics metrics2 = if4Var2.getMetrics();
                        TextPaint textPaint2 = if4.L0;
                        metrics2.width = kti.d(textPaint2.measureText(charSequence2, 0, charSequence2.length()));
                        textPaint2.setColor(if4Var2.y0);
                        if4Var2.E0 = BoringLayout.make(charSequence2, textPaint2, metrics2.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metrics2, false);
                        if4Var2.invalidate();
                        if4Var2.requestLayout();
                        break;
                    } else {
                        if4Var2.E0 = null;
                        if4Var2.requestLayout();
                        break;
                    }
                }
                break;
            case 2:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                this.d.invalidate();
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    if4 if4Var3 = this.d;
                    if4Var3.d(if4Var3.B0);
                    if4Var3.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hf4(if4 if4Var, int i) {
        this.c = i;
        switch (i) {
            case 3:
                Boolean bool = Boolean.FALSE;
                this.d = if4Var;
                super(12, bool);
                break;
            default:
                Boolean bool2 = Boolean.FALSE;
                this.d = if4Var;
                super(12, bool2);
                break;
        }
    }
}
