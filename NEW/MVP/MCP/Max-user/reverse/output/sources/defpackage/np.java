package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public class np extends h08 {
    public final /* synthetic */ AppCompatTextView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(AppCompatTextView appCompatTextView) {
        super(3, appCompatTextView);
        this.o = appCompatTextView;
    }

    @Override // defpackage.h08, defpackage.mp
    public final void C(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.h08, defpackage.mp
    public final void t(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
