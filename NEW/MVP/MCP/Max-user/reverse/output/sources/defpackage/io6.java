package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class io6 extends l98 {
    public final tq6 o;

    public io6(tq6 tq6Var) {
        super(yf4.d);
        this.o = tq6Var;
    }

    @Override // defpackage.phd
    public final int l(int i) {
        pp6 pp6Var = (pp6) C(i);
        if (pp6Var != null) {
            return pp6Var.a;
        }
        return 0;
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) throws NumberFormatException {
        q1g q1gVarD;
        up6 up6Var = (up6) midVar;
        pp6 pp6Var = (pp6) C(i);
        if (pp6Var == null) {
            return;
        }
        int i2 = 1;
        if ((up6Var instanceof tp6) && (pp6Var instanceof op6)) {
            tp6 tp6Var = (tp6) up6Var;
            op6 op6Var = (op6) pp6Var;
            vd8 vd8Var = op6Var.c;
            VideoInfoTextView videoInfoTextView = tp6Var.H0;
            ud8 ud8Var = vd8Var.v0;
            ud8 ud8Var2 = ud8.d;
            ud8 ud8Var3 = ud8.c;
            videoInfoTextView.setVisibility((ud8Var == ud8Var3 || ud8Var == ud8Var2) ? 0 : 8);
            ud8 ud8Var4 = vd8Var.v0;
            if (ud8Var4 == ud8Var3) {
                videoInfoTextView.setText(videoInfoTextView.getContext().getString(mvd.C0));
                videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                videoInfoTextView.setVisibility(0);
            } else if (ud8Var4 == ud8Var2) {
                long j = op6Var.m;
                Context context = videoInfoTextView.getContext();
                int i3 = ivd.V0;
                if (videoInfoTextView.isInEditMode()) {
                    q1gVarD = bq4.e0;
                } else {
                    Context context2 = videoInfoTextView.getContext();
                    bwf bwfVar = q1g.a0;
                    q1gVarD = nca.d(context2);
                }
                Drawable drawableH = cei.h(i3, q1gVarD.t, context);
                videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableH, (Drawable) null, (Drawable) null, (Drawable) null);
                if (drawableH instanceof AnimationDrawable) {
                    videoInfoTextView.post(new qm9(drawableH, 1));
                }
                String[] strArr = l6g.b;
                videoInfoTextView.setText(z7i.a(j));
                videoInfoTextView.setVisibility(0);
            }
            OneMeDraweeView oneMeDraweeView = tp6Var.G0;
            Context context3 = tp6Var.a.getContext();
            Uri uri = op6Var.g;
            sf7 sf7VarD = sf7.d(op6Var.l);
            sf7VarD.h = false;
            sf7VarD.m = Boolean.FALSE;
            sf7VarD.d = op6Var.d;
            int i4 = op6Var.k;
            if (i4 != 0) {
                sf7VarD.k = new avb(i4, i2);
            }
            if (uri != null) {
                sf7VarD.k = new rkb(context3, uri);
            }
            rf7 rf7VarA = sf7VarD.a();
            int i5 = OneMeDraweeView.B0;
            oneMeDraweeView.i(rf7VarA, null);
            NumericCheckButton numericCheckButton = tp6Var.F0;
            if (numericCheckButton != null) {
                if (op6Var.i) {
                    numericCheckButton.setEnabled(true);
                    numericCheckButton.setNumber(op6Var.h);
                } else {
                    numericCheckButton.setNumber(0);
                    numericCheckButton.setEnabled(false);
                }
                f8j.d(numericCheckButton, 300L, new ye6(3, tp6Var));
            }
        }
        f8j.d(up6Var.a, 300L, new iq5(this, i, pp6Var, i2));
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        return i == 5 ? new rp6(layoutInflaterFrom.inflate(hab.b, viewGroup, false)) : new tp6(layoutInflaterFrom.inflate(hab.c, viewGroup, false), this.o);
    }
}
