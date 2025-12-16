package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.bwf;
import defpackage.ey6;
import defpackage.gy6;
import defpackage.hy6;
import defpackage.n1d;
import defpackage.nca;
import defpackage.q0d;
import defpackage.q1g;
import defpackage.rw4;
import defpackage.uga;

/* loaded from: classes2.dex */
public class ContextMenuGridLayout extends hy6 {
    public final rw4 O0;

    public ContextMenuGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.O0 = rw4.a();
    }

    public void setupText(String str) {
        View viewInflate = View.inflate(getContext(), n1d.row_context_menu_action, null);
        ((ImageView) viewInflate.findViewById(q0d.row_options_action__iv_icon)).setVisibility(8);
        TextView textView = (TextView) viewInflate.findViewById(q0d.row_options_action__tv_title);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setGravity(8388611);
        ey6 ey6Var = new ey6();
        gy6 gy6Var = ey6Var.a;
        ey6Var.a = new gy6(gy6Var.a, gy6Var.b, hy6.d(7, false), gy6Var.d);
        gy6 gy6Var2 = ey6Var.b;
        ey6Var.b = new gy6(gy6Var2.a, gy6Var2.b, hy6.d(7, true), gy6Var2.d);
        ((ViewGroup.MarginLayoutParams) ey6Var).width = -1;
        ((ViewGroup.MarginLayoutParams) ey6Var).height = -1;
        addView(viewInflate, ey6Var);
        Context context = getContext();
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        int i = this.O0.n;
        int i2 = q1gVarD.M;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            ImageView imageView = (ImageView) childAt.findViewById(q0d.row_options_action__iv_icon);
            imageView.setColorFilter(q1gVarD.w);
            imageView.setBackground(uga.b(q1gVarD.I, q1gVarD.i, 0, i));
            ((TextView) childAt.findViewById(q0d.row_options_action__tv_title)).setTextColor(i2);
        }
    }
}
