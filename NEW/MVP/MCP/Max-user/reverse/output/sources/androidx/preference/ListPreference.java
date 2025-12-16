package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.bvc;
import defpackage.fni;
import defpackage.q7c;
import defpackage.t5d;
import defpackage.u1j;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] s0;
    public final String t0;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.ListPreference, i, 0);
        int i2 = t5d.ListPreference_entries;
        int i3 = t5d.ListPreference_android_entries;
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(i2);
        this.s0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(i3) : textArray;
        int i4 = t5d.ListPreference_entryValues;
        int i5 = t5d.ListPreference_android_entryValues;
        if (typedArrayObtainStyledAttributes.getTextArray(i4) == null) {
            typedArrayObtainStyledAttributes.getTextArray(i5);
        }
        int i6 = t5d.ListPreference_useSimpleSummaryProvider;
        if (typedArrayObtainStyledAttributes.getBoolean(i6, typedArrayObtainStyledAttributes.getBoolean(i6, false))) {
            if (u1j.C0 == null) {
                u1j.C0 = new u1j(22);
            }
            this.Y = u1j.C0;
            c();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t5d.Preference, i, 0);
        int i7 = t5d.Preference_summary;
        int i8 = t5d.Preference_android_summary;
        String string = typedArrayObtainStyledAttributes2.getString(i7);
        this.t0 = string == null ? typedArrayObtainStyledAttributes2.getString(i8) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        q7c q7cVar = this.Y;
        if (q7cVar != null) {
            return q7cVar.e(this);
        }
        CharSequence charSequenceA = super.a();
        String str = this.t0;
        if (str != null) {
            String str2 = String.format(str, "");
            if (!TextUtils.equals(str2, charSequenceA)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceA;
    }

    @Override // androidx.preference.Preference
    public final Object d(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fni.d(bvc.dialogPreferenceStyle, R.attr.dialogPreferenceStyle, context));
    }
}
