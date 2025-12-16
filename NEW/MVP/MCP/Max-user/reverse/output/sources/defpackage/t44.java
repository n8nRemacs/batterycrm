package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class t44 extends en9 {
    public ukd I0;

    @Override // defpackage.en9
    public final void F(MessageModel messageModel, List list) {
        CharSequence charSequence = messageModel.d;
        this.H0 = new fn9(messageModel.K0);
        el9 el9Var = messageModel.y0;
        View view = this.a;
        if (el9Var == null || el9Var.a <= 0) {
            ((TextView) view).setOnClickListener(null);
        } else {
            f8j.d(view, 300L, new ub(this, 24, el9Var));
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            jv3[] jv3VarArr = (jv3[]) spannable.getSpans(0, spannable.length(), jv3.class);
            if (jv3VarArr != null) {
                for (jv3 jv3Var : jv3VarArr) {
                    jv3Var.b = new i62(21, this);
                }
            }
        }
        ((TextView) view).setText(charSequence);
        G(messageModel, view);
    }

    @Override // defpackage.ry2
    public final void d(th3 th3Var) {
        TextView textView = (TextView) this.a;
        textView.setTextColor(th3Var.g.a);
        Drawable background = textView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(th3Var.b.g);
        }
    }
}
