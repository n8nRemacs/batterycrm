package defpackage;

import android.net.Uri;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class sbe extends d2f {
    public static final /* synthetic */ int I0 = 0;
    public final u4e E0;
    public final OneMeDraweeView F0;
    public final AppCompatTextView G0;
    public wo6 H0;

    public sbe(u4e u4eVar, OneMeDraweeView oneMeDraweeView, AppCompatTextView appCompatTextView, LinearLayout linearLayout) {
        super(linearLayout);
        this.E0 = u4eVar;
        this.F0 = oneMeDraweeView;
        this.G0 = appCompatTextView;
        f8j.d(linearLayout, 300L, new pcc(8, this));
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(wo6 wo6Var) throws NumberFormatException {
        String string;
        this.H0 = wo6Var;
        l4 l4VarC = wo6Var.a.a.c();
        boolean z = l4VarC instanceof jo6;
        AppCompatTextView appCompatTextView = this.G0;
        if (z) {
            string = appCompatTextView.getContext().getString(((jo6) l4VarC).a);
        } else {
            if (!(l4VarC instanceof ko6)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((ko6) l4VarC).a;
        }
        appCompatTextView.setText(string);
        tqi.c(new z8e(wo6Var, this, (Continuation) null), appCompatTextView);
        Uri uri = wo6Var.b;
        OneMeDraweeView oneMeDraweeView = this.F0;
        if (uri == null) {
            int i = OneMeDraweeView.B0;
            oneMeDraweeView.i(null, null);
            return;
        }
        sf7 sf7VarD = sf7.d(uri);
        sf7VarD.h = true;
        rf7 rf7VarA = sf7VarD.a();
        int i2 = OneMeDraweeView.B0;
        oneMeDraweeView.i(rf7VarA, null);
    }
}
