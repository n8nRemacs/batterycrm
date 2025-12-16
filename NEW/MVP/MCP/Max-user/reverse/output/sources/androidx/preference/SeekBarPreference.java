package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.t5d;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public final int Z;
    public final int s0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        int i = bvc.seekBarPreferenceStyle;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.SeekBarPreference, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(t5d.SeekBarPreference_min, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(t5d.SeekBarPreference_android_max, 100);
        i3 = i3 < i2 ? i2 : i3;
        if (i3 != this.Z) {
            this.Z = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(t5d.SeekBarPreference_seekBarIncrement, 0);
        if (i4 != this.s0) {
            this.s0 = Math.min(this.Z - i2, Math.abs(i4));
        }
        typedArrayObtainStyledAttributes.getBoolean(t5d.SeekBarPreference_adjustable, true);
        typedArrayObtainStyledAttributes.getBoolean(t5d.SeekBarPreference_showSeekBarValue, false);
        typedArrayObtainStyledAttributes.getBoolean(t5d.SeekBarPreference_updatesContinuously, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object d(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
