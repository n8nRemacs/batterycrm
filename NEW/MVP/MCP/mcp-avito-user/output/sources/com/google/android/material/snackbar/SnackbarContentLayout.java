package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import j.N;
import j.P;
import java.util.WeakHashMap;
import lY0.C43707b;
import wY0.C49576a;

@RestrictTo
/* loaded from: classes6.dex */
public class SnackbarContentLayout extends LinearLayout implements n {

    /* renamed from: b, reason: collision with root package name */
    public TextView f357321b;

    /* renamed from: c, reason: collision with root package name */
    public Button f357322c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f357323d;

    /* renamed from: e, reason: collision with root package name */
    public int f357324e;

    public SnackbarContentLayout(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f357323d = C49576a.d(context, R.attr.motionEasingEmphasizedInterpolator, C43707b.f413880b);
    }

    public final boolean a(int i12, int i13, int i14) {
        boolean z12;
        if (i12 != getOrientation()) {
            setOrientation(i12);
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f357321b.getPaddingTop() == i13 && this.f357321b.getPaddingBottom() == i14) {
            return z12;
        }
        TextView textView = this.f357321b;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i13, textView.getPaddingEnd(), i14);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i13, textView.getPaddingRight(), i14);
        return true;
    }

    public Button getActionView() {
        return this.f357322c;
    }

    public TextView getMessageView() {
        return this.f357321b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f357321b = (TextView) findViewById(R.id.snackbar_text);
        this.f357322c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) throws Resources.NotFoundException {
        super.onMeasure(i12, i13);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f357321b.getLayout();
        boolean z12 = layout != null && layout.getLineCount() > 1;
        if (!z12 || this.f357324e <= 0 || this.f357322c.getMeasuredWidth() <= this.f357324e) {
            if (!z12) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i12, i13);
    }

    public void setMaxInlineActionWidth(int i12) {
        this.f357324e = i12;
    }
}
