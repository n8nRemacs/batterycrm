package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.fni;
import defpackage.t5d;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iD = fni.d(bvc.switchPreferenceStyle, R.attr.switchPreferenceStyle, context);
        super(context, attributeSet, iD);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.SwitchPreference, iD, 0);
        int i = t5d.SwitchPreference_summaryOn;
        int i2 = t5d.SwitchPreference_android_summaryOn;
        if (typedArrayObtainStyledAttributes.getString(i) == null) {
            typedArrayObtainStyledAttributes.getString(i2);
        }
        int i3 = t5d.SwitchPreference_summaryOff;
        int i4 = t5d.SwitchPreference_android_summaryOff;
        if (typedArrayObtainStyledAttributes.getString(i3) == null) {
            typedArrayObtainStyledAttributes.getString(i4);
        }
        int i5 = t5d.SwitchPreference_switchTextOn;
        int i6 = t5d.SwitchPreference_android_switchTextOn;
        if (typedArrayObtainStyledAttributes.getString(i5) == null) {
            typedArrayObtainStyledAttributes.getString(i6);
        }
        int i7 = t5d.SwitchPreference_switchTextOff;
        int i8 = t5d.SwitchPreference_android_switchTextOff;
        if (typedArrayObtainStyledAttributes.getString(i7) == null) {
            typedArrayObtainStyledAttributes.getString(i8);
        }
        typedArrayObtainStyledAttributes.getBoolean(t5d.SwitchPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(t5d.SwitchPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
