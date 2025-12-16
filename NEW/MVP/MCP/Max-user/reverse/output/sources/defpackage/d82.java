package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class d82 extends LinearLayout implements u6g {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final TextView c;
    public final OneMeButton d;

    public d82(ForgotPinCodeDialog forgotPinCodeDialog, Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        dpg.d.b(textView, t75.b);
        textView.setGravity(1);
        textView.setText(o4d.oneme_settings_privacy_forgot_pin_code);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = kti.d(10 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        dpg.i.b(textView2, t75.b);
        textView2.setText(o4d.oneme_settings_privacy_forgot_pin_code_write_support);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setText(mvd.s2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = kti.d(32 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        f8j.d(oneMeButton, 300L, new ye6(0, forgotPinCodeDialog));
        addView(oneMeButton);
        this.d = oneMeButton;
        onThemeChanged(a93.s0.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        switch (this.a) {
            case 0:
                this.b.setTextColor(yebVar.getText().e);
                this.c.setTextColor(yebVar.getText().g);
                this.d.onThemeChanged(yebVar);
                break;
            default:
                this.b.setTextColor(yebVar.getText().e);
                this.c.setTextColor(yebVar.getText().g);
                this.d.onThemeChanged(yebVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d82(ChangeDisabledDialog changeDisabledDialog, Context context) {
        super(context);
        int i = 0;
        v1a v1aVar = a93.s0;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        dpg.d.b(textView, t75.b);
        textView.setGravity(1);
        textView.setText(o4d.oneme_settings_privacy_change_disabled_title);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = kti.d(10 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        dpg.i.b(textView2, t75.b);
        int i2 = ChangeDisabledDialog.C0;
        SpannableString spannableStringValueOf = SpannableString.valueOf(changeDisabledDialog.getContext().getText(o4d.oneme_settings_privacy_change_disabled_description));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), URLSpan.class);
        l5c l5cVar = (l5c) ((age) bqe.a.getAccessor().d(47).getValue());
        l5cVar.getClass();
        String strP = l5cVar.p(PmsKey.f143supportaccount, "max.ru/support");
        int length = uRLSpanArr.length;
        while (true) {
            if (i >= length) {
                break;
            }
            URLSpan uRLSpan = uRLSpanArr[i];
            int i3 = length;
            int spanStart = spannableStringValueOf.getSpanStart(uRLSpan);
            int spanEnd = spannableStringValueOf.getSpanEnd(uRLSpan);
            if (spanStart >= 0 && spanStart < spanEnd) {
                spannableStringValueOf.removeSpan(uRLSpan);
                ssi.j(spannableStringValueOf, strP, spanStart, spanEnd, v1aVar.y(textView2).getText().j, new i62(3, changeDisabledDialog), 16);
                break;
            } else {
                i++;
                length = i3;
            }
        }
        textView2.setText(spannableStringValueOf);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setText(mvd.g0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = kti.d(32 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        f8j.d(oneMeButton, 300L, new j6(11, changeDisabledDialog));
        addView(oneMeButton);
        this.d = oneMeButton;
        onThemeChanged(v1aVar.y(this));
    }
}
