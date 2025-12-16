package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public class uc {
    public final qc a;
    public final int b;

    public uc(Context context) {
        this(context, vc.f(context, 0));
    }

    public vc create() {
        qc qcVar = this.a;
        vc vcVar = new vc(qcVar.a, this.b);
        View view = qcVar.e;
        tc tcVar = vcVar.X;
        if (view != null) {
            tcVar.w = view;
        } else {
            CharSequence charSequence = qcVar.d;
            if (charSequence != null) {
                tcVar.d = charSequence;
                TextView textView = tcVar.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = qcVar.c;
            if (drawable != null) {
                tcVar.s = drawable;
                ImageView imageView = tcVar.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    tcVar.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = qcVar.f;
        if (charSequence2 != null) {
            tcVar.e = charSequence2;
            TextView textView2 = tcVar.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = qcVar.g;
        if (charSequence3 != null) {
            tcVar.c(-1, charSequence3, qcVar.h);
        }
        CharSequence charSequence4 = qcVar.i;
        if (charSequence4 != null) {
            tcVar.c(-2, charSequence4, qcVar.j);
        }
        CharSequence charSequence5 = qcVar.k;
        if (charSequence5 != null) {
            tcVar.c(-3, charSequence5, qcVar.l);
        }
        if (qcVar.o != null || qcVar.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) qcVar.b.inflate(tcVar.A, (ViewGroup) null);
            int i = qcVar.s ? tcVar.B : tcVar.C;
            ListAdapter scVar = qcVar.p;
            if (scVar == null) {
                scVar = new sc(qcVar.a, i, R.id.text1, qcVar.o);
            }
            tcVar.x = scVar;
            tcVar.y = qcVar.t;
            if (qcVar.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new pc(qcVar, tcVar));
            }
            if (qcVar.s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            tcVar.f = alertController$RecycleListView;
        }
        View view2 = qcVar.r;
        if (view2 != null) {
            tcVar.g = view2;
            tcVar.h = false;
        }
        vcVar.setCancelable(qcVar.m);
        if (qcVar.m) {
            vcVar.setCanceledOnTouchOutside(true);
        }
        vcVar.setOnCancelListener(null);
        vcVar.setOnDismissListener(null);
        wf9 wf9Var = qcVar.n;
        if (wf9Var != null) {
            vcVar.setOnKeyListener(wf9Var);
        }
        return vcVar;
    }

    public Context getContext() {
        return this.a.a;
    }

    public uc setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        qc qcVar = this.a;
        qcVar.i = qcVar.a.getText(i);
        qcVar.j = onClickListener;
        return this;
    }

    public uc setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        qc qcVar = this.a;
        qcVar.g = qcVar.a.getText(i);
        qcVar.h = onClickListener;
        return this;
    }

    public uc setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public uc setView(View view) {
        this.a.r = view;
        return this;
    }

    public uc(Context context, int i) {
        this.a = new qc(new ContextThemeWrapper(context, vc.f(context, i)));
        this.b = i;
    }
}
