package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class b16 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FitFontImageSpan b;
    public final /* synthetic */ View c;
    public final /* synthetic */ e16 d;

    public /* synthetic */ b16(FitFontImageSpan fitFontImageSpan, View view, e16 e16Var, int i) {
        this.a = i;
        this.b = fitFontImageSpan;
        this.c = view;
        this.d = e16Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FitFontImageSpan fitFontImageSpan = this.b;
                boolean z = fitFontImageSpan.shouldInvalidateSpan;
                e16 e16Var = this.d;
                View view = this.c;
                if (!z) {
                    view.invalidate();
                    e16Var.c.set(false);
                    break;
                } else {
                    mgb.a(view, new b6i(2, view, view, fitFontImageSpan, e16Var, false));
                    break;
                }
            default:
                FitFontImageSpan fitFontImageSpan2 = this.b;
                boolean z2 = fitFontImageSpan2.shouldInvalidateSpan;
                e16 e16Var2 = this.d;
                View view2 = this.c;
                if (!z2) {
                    view2.invalidate();
                    e16Var2.c.set(false);
                    break;
                } else {
                    mgb.a(view2, new b6i(2, view2, view2, fitFontImageSpan2, e16Var2, false));
                    break;
                }
        }
    }
}
