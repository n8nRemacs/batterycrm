package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.t5d;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        int i = bvc.switchPreferenceCompatStyle;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.SwitchPreferenceCompat, i, 0);
        int i2 = t5d.SwitchPreferenceCompat_summaryOn;
        int i3 = t5d.SwitchPreferenceCompat_android_summaryOn;
        if (typedArrayObtainStyledAttributes.getString(i2) == null) {
            typedArrayObtainStyledAttributes.getString(i3);
        }
        int i4 = t5d.SwitchPreferenceCompat_summaryOff;
        int i5 = t5d.SwitchPreferenceCompat_android_summaryOff;
        if (typedArrayObtainStyledAttributes.getString(i4) == null) {
            typedArrayObtainStyledAttributes.getString(i5);
        }
        int i6 = t5d.SwitchPreferenceCompat_switchTextOn;
        int i7 = t5d.SwitchPreferenceCompat_android_switchTextOn;
        if (typedArrayObtainStyledAttributes.getString(i6) == null) {
            typedArrayObtainStyledAttributes.getString(i7);
        }
        int i8 = t5d.SwitchPreferenceCompat_switchTextOff;
        int i9 = t5d.SwitchPreferenceCompat_android_switchTextOff;
        if (typedArrayObtainStyledAttributes.getString(i8) == null) {
            typedArrayObtainStyledAttributes.getString(i9);
        }
        typedArrayObtainStyledAttributes.getBoolean(t5d.SwitchPreferenceCompat_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(t5d.SwitchPreferenceCompat_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
