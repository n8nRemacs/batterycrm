package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class op extends np {
    public final /* synthetic */ AppCompatTextView X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.X = appCompatTextView;
    }

    @Override // defpackage.h08, defpackage.mp
    public final void H(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
