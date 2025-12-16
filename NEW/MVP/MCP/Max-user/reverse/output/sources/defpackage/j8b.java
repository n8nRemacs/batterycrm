package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class j8b extends LinearLayout implements u6g {
    public i8b a;
    public em6 b;
    public x2b c;
    public final yid d;
    public boolean o;
    public final TextView s0;
    public final TextView t0;
    public final ImageView u0;
    public final EditText v0;
    public p3 w0;

    public j8b(Context context) {
        super(context, null);
        this.d = new yid("^[+\\d][\\d\\s\\u00A0-]*$");
        InputFilter[] inputFilterArr = {new InputFilter() { // from class: g8b
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.a.d.a(charSequence) ? charSequence : "";
            }
        }};
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        this.s0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(zud.R);
        t5g t5gVar = dpg.h;
        t5gVar.b(textView2, t75.b);
        float f = 4;
        float f2 = 0;
        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        this.t0 = textView2;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(yud.a0);
        this.u0 = imageView;
        iob iobVar = new iob(context, new wu7(26, this));
        EditText editText = new EditText(context);
        editText.setId(zud.S);
        editText.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(kti.d(8 * vw4.d().getDisplayMetrics().density), 0, 0, 0);
        editText.setLayoutParams(layoutParams);
        t5gVar.b(editText, t75.b);
        editText.setAutofillHints("phone");
        editText.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(kti.c(vw4.d().getDisplayMetrics().density * 1.5d), editText.getLineHeight());
        mfh.l(editText, gradientDrawable);
        editText.setFilters(inputFilterArr);
        editText.setKeyListener(DigitsKeyListener.getInstance("0123456789 -()"));
        editText.setImportantForAutofill(1);
        editText.setInputType(3);
        editText.setSingleLine(true);
        editText.setSaveEnabled(false);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setCustomSelectionActionModeCallback(iobVar);
        editText.setCustomInsertionActionModeCallback(iobVar);
        editText.setOnFocusChangeListener(new wa3(3, this));
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: h8b
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                this.a.o = keyEvent.getAction() == 0 && i == 67;
                return false;
            }
        });
        this.v0 = editText;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        float f3 = 12;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), getPaddingTop(), kti.d(f3 * vw4.d().getDisplayMetrics().density), getPaddingBottom());
        setOrientation(0);
        setMinimumHeight(kti.d(52 * vw4.d().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 16.0f));
        addView(textView);
        addView(textView2);
        addView(imageView);
        addView(editText);
        onThemeChanged(a93.s0.y(this));
        p3 p3Var = new p3(3, this);
        editText.addTextChangedListener(p3Var);
        this.w0 = p3Var;
    }

    public final String getCode() {
        return String.valueOf(this.t0.getText());
    }

    public final em6 getOnWindowFocusChanged() {
        return this.b;
    }

    public final String getPhone() {
        CharSequence text = this.t0.getText();
        Editable text2 = this.v0.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        return sb.toString();
    }

    public final i8b getPhoneFormatterProvider() {
        return this.a;
    }

    public final String getPhoneWithoutCode() {
        return String.valueOf(this.v0.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.v0.removeTextChangedListener(this.w0);
        this.w0 = null;
        this.a = null;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackgroundColor(yebVar.b().a.h);
        EditText editText = this.v0;
        Drawable drawableF = mfh.f(editText);
        GradientDrawable gradientDrawable = drawableF instanceof GradientDrawable ? (GradientDrawable) drawableF : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(yebVar.getText().j));
        }
        editText.setTextColor(yebVar.getText().e);
        editText.setHintTextColor(yebVar.getText().g);
        this.u0.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().j));
        this.t0.setTextColor(yebVar.getText().e);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        em6 em6Var = this.b;
        if (em6Var != null) {
            em6Var.invoke(Boolean.valueOf(z));
        }
    }

    public final void setCountry(x2b x2bVar) {
        this.c = x2bVar;
        this.t0.setText("+" + x2bVar.b);
        CharSequence charSequence = x2bVar.d;
        if (charSequence != null) {
            this.s0.setText(charSequence);
        }
    }

    public final void setHint(CharSequence charSequence) {
        this.v0.setHint(charSequence);
    }

    public final void setOnCountryViewClickListener(cm6 cm6Var) {
        x6 x6Var = new x6(10, cm6Var);
        this.s0.setOnClickListener(x6Var);
        this.t0.setOnClickListener(x6Var);
        this.u0.setOnClickListener(x6Var);
    }

    public final void setOnWindowFocusChanged(em6 em6Var) {
        this.b = em6Var;
    }

    public final void setPhoneFormatterProvider(i8b i8bVar) {
        this.a = i8bVar;
    }

    public final void setText(CharSequence charSequence) {
        TextView.BufferType bufferType = TextView.BufferType.NORMAL;
        EditText editText = this.v0;
        editText.setText(charSequence, bufferType);
        try {
            editText.setSelection(charSequence.length());
        } catch (IndexOutOfBoundsException e) {
            wqi.e(j8b.class.getName(), e.toString(), e);
        }
    }
}
