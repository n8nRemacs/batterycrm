package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.fni;
import defpackage.t5d;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iD = fni.d(bvc.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle, context);
        super(context, attributeSet, iD);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.CheckBoxPreference, iD, 0);
        int i = t5d.CheckBoxPreference_summaryOn;
        int i2 = t5d.CheckBoxPreference_android_summaryOn;
        if (typedArrayObtainStyledAttributes.getString(i) == null) {
            typedArrayObtainStyledAttributes.getString(i2);
        }
        int i3 = t5d.CheckBoxPreference_summaryOff;
        int i4 = t5d.CheckBoxPreference_android_summaryOff;
        if (typedArrayObtainStyledAttributes.getString(i3) == null) {
            typedArrayObtainStyledAttributes.getString(i4);
        }
        typedArrayObtainStyledAttributes.getBoolean(t5d.CheckBoxPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(t5d.CheckBoxPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
