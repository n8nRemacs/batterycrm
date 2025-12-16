package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import j.InterfaceC42150f;
import j.f0;
import j.g0;

/* compiled from: ThemeEnforcement.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f356729a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f356730b = {R.attr.colorPrimaryVariant};

    public static void a(@j.N Context context, AttributeSet attributeSet, @InterfaceC42150f int i12, @f0 int i13) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i12, i13);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z12) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f356730b, "Theme.MaterialComponents");
            }
        }
        c(context, f356729a, "Theme.AppCompat");
    }

    public static void b(@j.N Context context, AttributeSet attributeSet, @j.N @g0 int[] iArr, @InterfaceC42150f int i12, @f0 int i13, @g0 @j.P int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i12, i13);
        boolean z12 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i12, i13);
            for (int i14 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i14, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z12 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
            z12 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z12) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(@j.N Context context, @j.N int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i12)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AK.c.k("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @j.N
    public static TypedArray d(@j.N Context context, AttributeSet attributeSet, @j.N @g0 int[] iArr, @InterfaceC42150f int i12, @f0 int i13, @g0 int... iArr2) {
        a(context, attributeSet, i12, i13);
        b(context, attributeSet, iArr, i12, i13, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i12, i13);
    }
}
