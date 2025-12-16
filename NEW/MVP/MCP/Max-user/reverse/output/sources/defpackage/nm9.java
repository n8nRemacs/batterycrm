package defpackage;

import android.text.Layout;
import android.text.Spanned;

/* loaded from: classes2.dex */
public final /* synthetic */ class nm9 implements cm6 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Layout b;

    public /* synthetic */ nm9(pm9 pm9Var, Layout layout) {
        this.b = layout;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        Object spans;
        switch (this.a) {
            case 0:
                CharSequence text = this.b.getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned == null || (spans = spanned.getSpans(0, spanned.length(), luc.class)) == null) {
                    spans = new luc[0];
                }
                return (luc[]) spans;
            default:
                return this.b;
        }
    }

    public /* synthetic */ nm9(Layout layout) {
        this.b = layout;
    }
}
