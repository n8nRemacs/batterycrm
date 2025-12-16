package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class tp6 extends up6 {
    public final tq6 E0;
    public NumericCheckButton F0;
    public final OneMeDraweeView G0;
    public final VideoInfoTextView H0;

    public tp6(View view, tq6 tq6Var) {
        q1g q1gVarD;
        q1g q1gVarD2;
        super(view);
        this.E0 = tq6Var;
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) view.findViewById(gab.e);
        this.G0 = oneMeDraweeView;
        ViewStub viewStub = (ViewStub) view.findViewById(gab.c);
        this.H0 = (VideoInfoTextView) view.findViewById(gab.f);
        Drawable drawableB = r34.b(view.getContext(), ivd.Y);
        if (view.isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context = view.getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context);
        }
        drawableB.setTint(zob.b(q1gVarD.w, 0.3f));
        gr6 gr6Var = (gr6) oneMeDraweeView.getHierarchy();
        if (gr6Var != null) {
            gr6Var.i(drawableB, 1);
        }
        if (view.isInEditMode()) {
            q1gVarD2 = bq4.e0;
        } else {
            Context context2 = view.getContext();
            bwf bwfVar2 = q1g.a0;
            q1gVarD2 = nca.d(context2);
        }
        oneMeDraweeView.setBackgroundColor(q1gVarD2.H);
        if (tq6Var.b.c) {
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: sp6
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view2) {
                    View viewFindViewById = view2.findViewById(gab.b);
                    NumericCheckButton numericCheckButton = (NumericCheckButton) view2.findViewById(gab.a);
                    tp6 tp6Var = this.a;
                    tp6Var.F0 = numericCheckButton;
                    int iD = kti.d(10 * tp6Var.a.getContext().getResources().getDisplayMetrics().density);
                    if (viewFindViewById == null) {
                        return;
                    }
                    viewFindViewById.post(new nm3(numericCheckButton, iD, iD, iD, iD, viewFindViewById, 1));
                }
            });
            viewStub.inflate();
        }
    }
}
