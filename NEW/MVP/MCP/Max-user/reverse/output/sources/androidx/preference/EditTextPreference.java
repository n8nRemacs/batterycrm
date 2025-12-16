package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.fni;
import defpackage.rha;
import defpackage.t5d;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iD = fni.d(bvc.editTextPreferenceStyle, R.attr.editTextPreferenceStyle, context);
        super(context, attributeSet, iD);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.EditTextPreference, iD, 0);
        int i = t5d.EditTextPreference_useSimpleSummaryProvider;
        if (typedArrayObtainStyledAttributes.getBoolean(i, typedArrayObtainStyledAttributes.getBoolean(i, false))) {
            if (rha.D0 == null) {
                rha.D0 = new rha(19);
            }
            this.Y = rha.D0;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object d(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
