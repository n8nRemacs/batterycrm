package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class xwe extends ugc {
    public laj E0;
    public final TextView F0;
    public final AppCompatEditText G0;
    public final AppCompatTextView H0;
    public final OneMeButton I0;
    public final ImageView J0;
    public final ImageView K0;
    public final LinearLayout L0;
    public final TextView M0;
    public final TextView N0;

    public xwe(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        textView.setGravity(16);
        t5g t5gVar = dpg.h;
        t5gVar.b(textView, t75.b);
        this.F0 = textView;
        final AppCompatEditText appCompatEditText = new AppCompatEditText(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        float f = 0;
        float f2 = 12;
        appCompatEditText.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), appCompatEditText.getPaddingTop(), kti.d(vw4.d().getDisplayMetrics().density * f2), appCompatEditText.getPaddingBottom());
        appCompatEditText.setLayoutParams(layoutParams);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatEditText.setEllipsize(truncateAt);
        appCompatEditText.setInputType(524288);
        t5gVar.b(appCompatEditText, t75.b);
        appCompatEditText.setBackground(null);
        appCompatEditText.setSingleLine(true);
        v1a v1aVar = a93.s0;
        appCompatEditText.setHintTextColor(v1aVar.y(appCompatEditText).getText().i);
        appCompatEditText.setHint(appCompatEditText.getResources().getText(u8b.x0));
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: wwe
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Editable text;
                xwe xweVar = this.a;
                xweVar.J0.setVisibility((!z || (text = appCompatEditText.getText()) == null || text.length() == 0) ? 8 : 0);
                if (xweVar.E0 instanceof twe) {
                    xweVar.K0.setVisibility(8);
                }
            }
        });
        appCompatEditText.setOnEditorActionListener(new hu4(1));
        this.G0 = appCompatEditText;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        int iD = kti.d(f * vw4.d().getDisplayMetrics().density);
        float f3 = 10;
        appCompatTextView.setPaddingRelative(iD, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3));
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setGravity(16);
        t5gVar.b(appCompatTextView, t75.b);
        appCompatTextView.setBackground(null);
        appCompatTextView.setSingleLine(true);
        this.H0 = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), oneMeButton.getPaddingTop(), kti.d(vw4.d().getDisplayMetrics().density * f2), oneMeButton.getPaddingBottom());
        oneMeButton.setSize(jza.b);
        oneMeButton.setMode(iza.b);
        oneMeButton.setAppearance(gza.a);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.I0 = oneMeButton;
        ImageView imageView = new ImageView(context);
        int i = r8b.v0;
        imageView.setId(i);
        imageView.setVisibility(8);
        float f4 = 24;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f4));
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
        int marginEnd = layoutParams3.getMarginEnd();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
        layoutParams3.setMarginStart(iD2);
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = i2;
        layoutParams3.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i3;
        imageView.setLayoutParams(layoutParams3);
        f8j.d(imageView, 300L, new pcc(12, this));
        int i4 = yud.r0;
        int i5 = v1aVar.y(imageView).getIcon().j;
        Drawable drawableMutate = r34.b(imageView.getContext(), i4).mutate();
        cei.k(drawableMutate, i5);
        imageView.setImageDrawable(drawableMutate);
        this.J0 = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(i);
        imageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(kti.d(f4 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f4));
        int iD3 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
        int marginEnd2 = layoutParams4.getMarginEnd();
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        layoutParams4.setMarginStart(iD3);
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = i6;
        layoutParams4.setMarginEnd(marginEnd2);
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = i7;
        imageView2.setLayoutParams(layoutParams4);
        int i8 = yud.v0;
        int i9 = v1aVar.y(imageView2).getIcon().f;
        Drawable drawableMutate2 = r34.b(imageView2.getContext(), i8).mutate();
        cei.k(drawableMutate2, i9);
        imageView2.setImageDrawable(drawableMutate2);
        this.K0 = imageView2;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(52 * vw4.d().getDisplayMetrics().density)));
        linearLayout2.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), linearLayout2.getPaddingTop(), kti.d(vw4.d().getDisplayMetrics().density * f2), linearLayout2.getPaddingBottom());
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipToOutline(true);
        linearLayout2.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 12.0f));
        linearLayout2.setBackgroundColor(v1aVar.y(linearLayout2).b().k);
        linearLayout2.addView(textView);
        linearLayout2.addView(appCompatEditText);
        linearLayout2.addView(appCompatTextView);
        linearLayout2.addView(imageView2);
        linearLayout2.addView(imageView);
        this.L0 = linearLayout2;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(v1aVar.y(textView2).getText().b);
        t5g t5gVar2 = dpg.l;
        t5gVar2.b(textView2, t75.b);
        textView2.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), textView2.getPaddingTop(), textView2.getPaddingEnd(), textView2.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams5);
        this.M0 = textView2;
        TextView textView3 = new TextView(context);
        t5gVar2.b(textView3, t75.b);
        textView3.setText(textView3.getResources().getText(u8b.w0));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        textView3.setLayoutParams(layoutParams6);
        this.N0 = textView3;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(oneMeButton);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        linearLayout.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), linearLayout.getPaddingTop(), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        tqi.c(new kga(this, (Continuation) null, 24), linearLayout);
    }

    public final void F(laj lajVar) {
        Editable text;
        boolean z = lajVar instanceof uwe;
        View view = this.a;
        TextView textView = this.N0;
        ImageView imageView = this.K0;
        ImageView imageView2 = this.J0;
        LinearLayout linearLayout = this.L0;
        OneMeButton oneMeButton = this.I0;
        TextView textView2 = this.F0;
        AppCompatTextView appCompatTextView = this.H0;
        AppCompatEditText appCompatEditText = this.G0;
        int i = 8;
        if (z) {
            oneMeButton.setVisibility(8);
            linearLayout.setVisibility(0);
            appCompatEditText.setVisibility(8);
            appCompatTextView.setVisibility(0);
            textView2.setVisibility(8);
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            textView.setVisibility(8);
            appCompatTextView.setText(((uwe) lajVar).a.b(view.getContext()));
        } else {
            if (!(lajVar instanceof twe)) {
                throw new NoWhenBranchMatchedException();
            }
            oneMeButton.setVisibility(8);
            linearLayout.setVisibility(0);
            appCompatEditText.setVisibility(0);
            appCompatTextView.setVisibility(8);
            textView2.setVisibility(0);
            imageView2.setVisibility((!appCompatEditText.isFocused() || (text = appCompatEditText.getText()) == null || text.length() == 0) ? 8 : 0);
            twe tweVar = (twe) lajVar;
            String str = tweVar.b;
            imageView.setVisibility(8);
            textView.setVisibility(tweVar.d ? 0 : 8);
            textView2.setText(tweVar.a);
            if (!(this.E0 instanceof twe)) {
                appCompatEditText.setText(str);
            }
            appCompatEditText.setHint(tweVar.c.b(view.getContext()));
        }
        this.E0 = lajVar;
        if (lajVar.a() != null && lajVar.b() != null) {
            i = 0;
        }
        TextView textView3 = this.M0;
        textView3.setVisibility(i);
        s5g s5gVarA = lajVar.a();
        textView3.setText(s5gVarA != null ? s5gVarA.b(textView3.getContext()) : null);
        Integer numB = lajVar.b();
        if (numB != null) {
            textView3.setTextColor(a93.s0.y(textView3).g(numB.intValue()));
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        F(((vwe) t98Var).a);
    }
}
