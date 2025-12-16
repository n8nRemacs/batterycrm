package com.my.target;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import e11.C39875i0;
import e11.C39880k;
import e11.C39884l0;
import e11.C39899q0;
import e11.C39922y0;
import e11.C39924z;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class Z0 extends N0 {
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16;
        C39875i0 c39875i0;
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        C39922y0 c39922y0 = this.f364497k;
        C39875i0 c39875i02 = this.f364498l;
        View view = this.f364502p;
        View view2 = this.f364501o;
        C39922y0 c39922y02 = this.f364496j;
        m7 m7Var = this.f364491e;
        b4 b4Var = this.f364493g;
        C39899q0 c39899q0 = this.f364507u;
        int i19 = this.f364478E;
        int i22 = this.f364474A;
        C39880k c39880k = this.f364490d;
        if (i17 < i18) {
            if (c39880k.getVisibility() == 0) {
                int i23 = i22 - i19;
                C39924z.l(c39880k, i13 + i23, i17 - i23);
            } else {
                C39924z.l(c39899q0, i13 + i22, i17 - i22);
            }
            C39924z.p(m7Var, i13, i12);
            Button button = this.f364503q;
            int i24 = i15 - this.f364479F;
            C39924z.h(button, 0, i24 - button.getMeasuredHeight(), i14, i24);
            C39924z.h(c39922y02, i12, i13, i14, i15);
            TextView textView = this.f364505s;
            int measuredHeight = (i22 / 2) + textView.getMeasuredHeight();
            TextView textView2 = this.f364504r;
            if (textView2.getVisibility() == 0) {
                measuredHeight = textView2.getMeasuredHeight() + i22 + measuredHeight;
            }
            int i25 = i17 - (i22 * 2);
            int measuredWidth = ((i25 - textView2.getMeasuredWidth()) / 2) + i22;
            int measuredWidth2 = ((i25 - textView.getMeasuredWidth()) / 2) + i22;
            int bottom = c39922y02.getBottom();
            if (measuredHeight < button.getTop() - bottom) {
                int top = (((button.getTop() - bottom) - measuredHeight) / 2) + bottom;
                C39924z.p(textView2, top, measuredWidth);
                C39924z.p(textView, C39924z.d(top, textView2.getBottom() + this.f364483J), measuredWidth2);
            } else {
                C39924z.s(textView, button.getTop() - i22, measuredWidth2);
                textView2.layout(0, 0, 0, 0);
            }
            int top2 = textView2.getTop() > 0 ? textView2.getTop() : textView.getTop() > 0 ? textView.getTop() : button.getTop();
            C39924z.p(view2, m7Var.getTop(), m7Var.getLeft());
            C39924z.p(view, top2 - i22, i12);
            b4Var.b(((double) (c39922y02.getBottom() - view.getTop())) > ((double) c39922y02.getMeasuredHeight()) * 0.1d);
            int i26 = i15 - i22;
            C39924z.r(c39875i02, i26, i14 - i22);
            C39924z.s(c39922y0, i26, i22);
            return;
        }
        int visibility = c39880k.getVisibility();
        int i27 = this.f364482I;
        if (visibility == 0) {
            int i28 = i27 - i19;
            c39875i0 = c39875i02;
            i16 = i22;
            C39924z.l(c39880k, i13 + i28, i17 - i28);
        } else {
            i16 = i22;
            c39875i0 = c39875i02;
            C39924z.l(c39899q0, i13 + i27, i17 - i27);
        }
        boolean zC2 = c(i17);
        FrameLayout frameLayout = this.f364484K;
        if (!zC2) {
            C39924z.p(c39922y0, i27, i27);
            C39924z.s(m7Var, i18, i12);
            C39924z.h(c39922y02, i12, i13, i14, i15);
            C39924z.h(frameLayout, i12, i13, i14, i15);
            this.f364500n.layout(c39922y02.getLeft(), c39922y02.getTop(), c39922y02.getRight(), c39922y02.getBottom());
            view2.layout(0, 0, 0, 0);
            C39924z.p(view, m7Var.getTop(), m7Var.getLeft());
            b4Var.b(true);
            C39924z.r(c39875i0, m7Var.getTop() - i16, i14 - i27);
            return;
        }
        C39924z.h(c39922y02, i12, i13, c39922y02.getMeasuredWidth() + i12, i15);
        int right = c39922y02.getRight() + i27;
        int measuredHeight2 = c39922y0.getMeasuredHeight();
        TextView textView3 = this.f364506t;
        C39924z.e(i27, right, C39924z.d(measuredHeight2, textView3.getMeasuredHeight()) + i19, i19, c39922y0, textView3);
        C39924z.h(frameLayout, i12, i13, i12 + (frameLayout != null ? frameLayout.getMeasuredWidth() : 0), i15);
        m7Var.layout(c39922y02.getRight(), i13, i14, i15);
        view2.layout(0, 0, 0, 0);
        b4Var.b(false);
        int left = c39880k.getVisibility() == 0 ? (c39880k.getLeft() - i16) + i19 : c39899q0.getVisibility() == 0 ? c39899q0.getLeft() - i16 : i14 - i27;
        C39875i0 c39875i03 = c39875i0;
        C39924z.l(c39875i03, i27, left);
        C39924z.l(c39875i03, i27, left);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.Z0.onMeasure(int, int):void");
    }

    @Override // com.my.target.N0, com.my.target.I0
    public void setBanner(@j.N C39884l0 c39884l0) {
        super.setBanner(c39884l0);
        FrameLayout frameLayout = this.f364484K;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.f364500n.setVisibility(8);
    }
}
