package ru.mts.biometry.sdk.view;

import B91.u;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import g2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import z91.c;

@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioTextField;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/G0;", "setupAttrs", "(Landroid/util/AttributeSet;)V", "", "value", "getFieldLabel", "()Ljava/lang/String;", "setFieldLabel", "(Ljava/lang/String;)V", "fieldLabel", "getFieldValue", "setFieldValue", "fieldValue", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioTextField extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final u f436589b;

    @j
    public SdkBioTextField(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.sdk_bio_simple_text_field, this);
        int i12 = R.id.tv_label;
        TextView textView = (TextView) d.a(this, R.id.tv_label);
        if (textView != null) {
            i12 = R.id.tv_value;
            TextView textView2 = (TextView) d.a(this, R.id.tv_value);
            if (textView2 != null) {
                this.f436589b = new u(this, textView, textView2);
                setOrientation(1);
                if (attributeSet != null) {
                    setupAttrs(attributeSet);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i12)));
    }

    private final void setupAttrs(AttributeSet attrs) {
        u uVar = this.f436589b;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, c.m.f443901i);
        try {
            uVar.f1176b.setTextColor(com.google.android.material.color.k.b(getContext(), R.attr.sdkBioTextSecondaryColor, -16777216));
            uVar.f1177c.setTextColor(com.google.android.material.color.k.b(getContext(), R.attr.sdkBioTextPrimaryColor, -16777216));
            uVar.f1176b.setText(typedArrayObtainStyledAttributes.getString(0));
            uVar.f1177c.setText(typedArrayObtainStyledAttributes.getString(1));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @k
    public final String getFieldLabel() {
        return this.f436589b.f1176b.getText().toString();
    }

    @l
    public final String getFieldValue() {
        return this.f436589b.f1177c.getText().toString();
    }

    public final void setFieldLabel(@k String str) {
        this.f436589b.f1176b.setText(str);
    }

    public final void setFieldValue(@l String str) {
        setVisibility(str == null || str.length() == 0 ? 8 : 0);
        this.f436589b.f1177c.setText(str);
    }

    public /* synthetic */ SdkBioTextField(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}
