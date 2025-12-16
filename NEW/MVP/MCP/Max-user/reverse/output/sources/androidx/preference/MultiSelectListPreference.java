package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.fni;
import defpackage.t5d;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iD = fni.d(bvc.dialogPreferenceStyle, R.attr.dialogPreferenceStyle, context);
        super(context, attributeSet, iD);
        new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.MultiSelectListPreference, iD, 0);
        int i = t5d.MultiSelectListPreference_entries;
        int i2 = t5d.MultiSelectListPreference_android_entries;
        if (typedArrayObtainStyledAttributes.getTextArray(i) == null) {
            typedArrayObtainStyledAttributes.getTextArray(i2);
        }
        int i3 = t5d.MultiSelectListPreference_entryValues;
        int i4 = t5d.MultiSelectListPreference_android_entryValues;
        if (typedArrayObtainStyledAttributes.getTextArray(i3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(i4);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object d(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
