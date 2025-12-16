package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class rsg extends x4g {
    public final em6 B0;
    public final GradientDrawable C0;
    public final TextView D0;

    public rsg(Context context, em6 em6Var) {
        super(context);
        this.B0 = em6Var;
        GradientDrawable gradientDrawableE = uga.e(null, null, Integer.valueOf(kti.d(1 * vw4.d().getDisplayMetrics().density)), kti.d(12 * vw4.d().getDisplayMetrics().density));
        this.C0 = gradientDrawableE;
        TextView textView = new TextView(context);
        textView.setText(z7.e(textView.getContext(), mvd.g2));
        dpg.z.b(textView, t75.b);
        textView.setTextColor(a93.s0.y(textView).a().i().d.i);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setBackground(gradientDrawableE);
        this.D0 = textView;
        addView(textView);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, k18] */
    @Override // defpackage.x4g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int contentHorizontalPadding$message_list_release = getContentHorizontalPadding$message_list_release();
        int contentTopPadding$message_list_release = getContentTopPadding$message_list_release();
        if (dqi.r(getSenderNameViewStub$message_list_release().b)) {
            getSenderNameViewStub$message_list_release().c(contentHorizontalPadding$message_list_release, contentTopPadding$message_list_release);
            contentTopPadding$message_list_release = utb.j(4, vw4.d().getDisplayMetrics().density, getSenderNameViewStub$message_list_release().a(), contentTopPadding$message_list_release);
        }
        if (dqi.r(getSenderAliasDelegate().c) && dqi.r(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().W((getMeasuredWidth() - contentHorizontalPadding$message_list_release) - getSenderAliasDelegate().N(), getContentTopPadding$message_list_release() + ((getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().M() / 2)));
        }
        if (dqi.r(getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().W(contentHorizontalPadding$message_list_release, contentTopPadding$message_list_release);
            contentTopPadding$message_list_release = utb.j(4, vw4.d().getDisplayMetrics().density, getMessageLinkDelegate().M(), contentTopPadding$message_list_release);
        }
        cri.c(getMessageTextView$message_list_release(), contentHorizontalPadding$message_list_release, contentTopPadding$message_list_release, 0, 12);
        int measuredHeight = getMessageTextView$message_list_release().getMeasuredHeight() + contentTopPadding$message_list_release;
        TextView textView = this.D0;
        if (textView.getVisibility() == 0) {
            int iC = u45.c(8, vw4.d().getDisplayMetrics().density, measuredHeight);
            cri.c(textView, (getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2), iC, 0, 12);
            measuredHeight = iC + textView.getMeasuredHeight();
        }
        if (dqi.r(getReactionsDelegate().c)) {
            getReactionsDelegate().W(contentHorizontalPadding$message_list_release, u45.c(8, vw4.d().getDisplayMetrics().density, measuredHeight));
            getReactionsDelegate().M();
        }
        cri.c(getDate$message_list_release(), (getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth()) - getContentHorizontalPadding$message_list_release(), u45.q(4, vw4.d().getDisplayMetrics().density, getMeasuredHeight() - getDate$message_list_release().getMeasuredHeight()), 0, 12);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, k18] */
    @Override // defpackage.x4g, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 10;
        int iD = u45.d(f, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list_release().i();
        int measuredWidth = getDependOnOutsideView() ? iD : getMessageTextView$message_list_release().getMeasuredWidth();
        int measuredHeight = getMessageTextView$message_list_release().getMeasuredHeight();
        if (dqi.r(getSenderAliasDelegate().c) && dqi.r(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, getSenderAliasDelegate().N());
        }
        if (dqi.r(getSenderNameViewStub$message_list_release().b)) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, getSenderNameViewStub$message_list_release().b() + getSenderAliasDelegate().j0());
            measuredHeight = utb.j(4, vw4.d().getDisplayMetrics().density, getSenderNameViewStub$message_list_release().a(), measuredHeight);
        }
        if (dqi.r(getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, getMessageLinkDelegate().N());
            measuredHeight = utb.j(4, vw4.d().getDisplayMetrics().density, getMessageLinkDelegate().M(), measuredHeight);
        }
        if (dqi.r(getReactionsDelegate().c)) {
            getReactionsDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, getReactionsDelegate().N());
            measuredHeight = utb.j(f, vw4.d().getDisplayMetrics().density, getReactionsDelegate().M(), measuredHeight);
        }
        TextView textView = this.D0;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(iD, 1073741824), View.MeasureSpec.makeMeasureSpec(kti.d(40 * vw4.d().getDisplayMetrics().density), 1073741824));
            measuredWidth = Math.max(measuredWidth, textView.getMeasuredWidth());
            measuredHeight = utb.j(14, vw4.d().getDisplayMetrics().density, textView.getMeasuredHeight(), measuredHeight);
        }
        getDate$message_list_release().measure(i, i2);
        int iC = u45.c(f, vw4.d().getDisplayMetrics().density, getDate$message_list_release().getMeasuredWidth() + u45.c(6, vw4.d().getDisplayMetrics().density, dqi.r(getReactionsDelegate().c) ? getReactionsDelegate().N() : getMessageTextView$message_list_release().e(iD)));
        if (iC < iD) {
            measuredWidth = Math.max(measuredWidth, iC);
        } else {
            measuredHeight = u45.c(12, vw4.d().getDisplayMetrics().density, measuredHeight);
        }
        setMeasuredDimension((kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + measuredWidth, utb.j(f, vw4.d().getDisplayMetrics().density, kti.d(4 * vw4.d().getDisplayMetrics().density), measuredHeight));
    }

    @Override // defpackage.x4g, defpackage.y4g
    public void setTextMessageColors(yt0 yt0Var) {
        super.setTextMessageColors(yt0Var);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(yt0Var.a.m);
        GradientDrawable gradientDrawable = this.C0;
        gradientDrawable.setColor(colorStateListValueOf);
        gradientDrawable.setStroke(kti.d(1 * vw4.d().getDisplayMetrics().density), ColorStateList.valueOf(yt0Var.c.b));
        this.D0.setTextColor(yt0Var.d.i);
        invalidate();
    }
}
