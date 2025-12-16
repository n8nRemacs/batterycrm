package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.d;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.y81;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class CallToActionView extends Button {

    /* renamed from: a, reason: collision with root package name */
    @P
    private CharSequence f383155a;

    public CallToActionView(@N Context context) {
        this(context, null);
    }

    @N
    private static Drawable a(@N Context context, int i12) {
        return d.getDrawable(context, i12);
    }

    @Override // android.widget.TextView
    @P
    public final CharSequence getText() {
        return this.f383155a;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence instanceof String) {
            this.f383155a = charSequence;
        }
        super.setText(this.f383155a, TextView.BufferType.SPANNABLE);
    }

    public CallToActionView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f383155a);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@N Context context, @P AttributeSet attributeSet, int i12) {
        int i13;
        super(context, attributeSet, i12);
        int i14 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalIconButton, i12, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_size, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_offset, 0);
            typedArrayObtainStyledAttributes.recycle();
            drawableA = resourceId != 0 ? a(context, resourceId) : null;
            i13 = dimensionPixelSize2;
            i14 = dimensionPixelSize;
        } else {
            i13 = 0;
        }
        setSpannableFactory(new y81(drawableA, i14, i13));
    }
}
