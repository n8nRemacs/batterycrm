package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import e11.C39852a1;
import e11.C39875i0;
import e11.C39884l0;
import e11.C39906t;
import e11.C39924z;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class T0 extends N0 {

    /* renamed from: O, reason: collision with root package name */
    public final int f364612O;

    public T0(boolean z12, @j.N m7 m7Var, @j.N C39852a1 c39852a1, @j.N b4 b4Var, @j.P FrameLayout frameLayout, @j.N C39906t c39906t, @j.N Context context) {
        super(m7Var, c39852a1, b4Var, frameLayout, c39906t, context);
        this.f364612O = z12 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.T0.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        C39875i0 c39875i0;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        C39875i0 c39875i02 = this.f364498l;
        View view = this.f364502p;
        FrameLayout frameLayout = this.f364484K;
        TextView textView = this.f364505s;
        TextView textView2 = this.f364504r;
        View view2 = this.f364501o;
        m7 m7Var = this.f364491e;
        int i16 = this.f364474A;
        int i17 = this.f364477D;
        if (size < size2) {
            m7Var.setVisibility(0);
            view2.setVisibility(0);
            C39924z.f(size - i17, size2, BeduinInputModel.MIN_TEXT_VERSION, m7Var);
            C39924z.f(size, m7Var.getMeasuredHeight(), 1073741824, view2);
            if (TextUtils.isEmpty(textView2.getText())) {
                i15 = 8;
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                i15 = 8;
            }
            if (TextUtils.isEmpty(textView.getText())) {
                textView.setVisibility(i15);
            } else {
                textView.setVisibility(0);
            }
            Button button = this.f364503q;
            int i18 = this.f364612O;
            if (i18 == 0) {
                int i19 = i16 * 2;
                c39875i0 = c39875i02;
                button.measure(View.MeasureSpec.makeMeasureSpec(((size - (i16 * 4)) - c39875i02.getMeasuredWidth()) - this.f364497k.getMeasuredWidth(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(this.f364481H, 1073741824));
                int i22 = size - i19;
                int i23 = size2 - i19;
                C39924z.f(i22, i23, BeduinInputModel.MIN_TEXT_VERSION, textView2);
                C39924z.f(i22, i23, BeduinInputModel.MIN_TEXT_VERSION, textView);
                view.setVisibility(0);
                C39924z.f(size, size2, 1073741824, view);
            } else {
                c39875i0 = c39875i02;
                view.setVisibility(8);
            }
            if (i18 == 1) {
                C39924z.f(size, (size2 - view2.getMeasuredHeight()) - (i16 * 2), BeduinInputModel.MIN_TEXT_VERSION, frameLayout);
            } else if (i18 == 0) {
                C39924z.f(size, ((((size2 - m7Var.getMeasuredHeight()) - textView2.getMeasuredHeight()) - button.getMeasuredHeight()) - textView.getMeasuredHeight()) - (i16 * 8), BeduinInputModel.MIN_TEXT_VERSION, frameLayout);
            }
            i14 = 1073741824;
        } else {
            c39875i0 = c39875i02;
            textView2.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            m7Var.setVisibility(0);
            view.setVisibility(0);
            C39924z.f(size, size2, BeduinInputModel.MIN_TEXT_VERSION, m7Var);
            i14 = 1073741824;
            C39924z.f(m7Var.getMeasuredWidth(), m7Var.getMeasuredHeight(), 1073741824, view);
            C39924z.f(size, (size2 - m7Var.getMeasuredHeight()) - (i16 * 2), 1073741824, frameLayout);
        }
        C39924z.f(i17, i17, i14, this.f364507u);
        int i24 = (this.f364478E * 2) + i17;
        C39924z.f(i24, i24, i14, this.f364490d);
        C39924z.f(i24, i24, i14, c39875i0);
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.N0, com.my.target.I0
    public void setBanner(@j.N C39884l0 c39884l0) {
        super.setBanner(c39884l0);
        this.f364493g.b(true);
        FrameLayout frameLayout = this.f364484K;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
