package ru.mts.biometry.sdk.view;

import B91.q;
import H91.c;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.annotation.Keep;
import com.avito.android.R;
import g2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import z91.c;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u0010R$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioRadioButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "ta", "Lkotlin/G0;", "setupAttrs", "(Landroid/content/res/TypedArray;)V", "", "enabled", "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "LB91/q;", "binding", "LB91/q;", "value", "isChecked", "Z", "()Z", "setChecked", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioRadioButton extends FrameLayout {

    @k
    private final q binding;
    private boolean isChecked;

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public SdkBioRadioButton(@k Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    private final void setupAttrs(TypedArray ta2) {
        try {
            this.binding.f1159a.setBackground(ta2.getDrawable(0));
        } finally {
            ta2.recycle();
        }
    }

    @k
    public final CharSequence getText() {
        return this.binding.f1160b.getText();
    }

    /* renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z12) {
        this.binding.f1160b.setChecked(z12);
        this.isChecked = z12;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            return;
        }
        this.binding.f1160b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.binding.f1160b.setTextColor(getContext().getColor(R.color.sdk_bio_greyscale_500));
    }

    @Override // android.view.View
    public void setOnClickListener(@l View.OnClickListener l12) {
        this.binding.f1160b.setOnClickListener(l12);
    }

    public final void setText(@k CharSequence charSequence) {
        this.binding.f1160b.setText(charSequence);
    }

    @j
    public SdkBioRadioButton(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.sdk_bio_radio_button, this);
        RadioButton radioButton = (RadioButton) d.a(this, R.id.radio_button);
        if (radioButton == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(R.id.radio_button)));
        }
        this.binding = new q(this, radioButton);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, c.a(4), 0, c.a(4));
        setLayoutParams(marginLayoutParams);
        setPadding(c.a(16), 0, c.a(16), 0);
        setupAttrs(context.obtainStyledAttributes(attributeSet, c.m.f443899g));
    }

    public /* synthetic */ SdkBioRadioButton(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}
