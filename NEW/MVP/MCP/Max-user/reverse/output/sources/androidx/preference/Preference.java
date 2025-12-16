package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.fni;
import defpackage.i1d;
import defpackage.q7c;
import defpackage.t5d;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final Object X;
    public q7c Y;
    public final Context a;
    public final int b;
    public final CharSequence c;
    public final CharSequence d;
    public final String o;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.b = Integer.MAX_VALUE;
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.Preference, i, 0);
        typedArrayObtainStyledAttributes.getResourceId(t5d.Preference_icon, typedArrayObtainStyledAttributes.getResourceId(t5d.Preference_android_icon, 0));
        int i2 = t5d.Preference_key;
        int i3 = t5d.Preference_android_key;
        String string = typedArrayObtainStyledAttributes.getString(i2);
        this.o = string == null ? typedArrayObtainStyledAttributes.getString(i3) : string;
        int i4 = t5d.Preference_title;
        int i5 = t5d.Preference_android_title;
        CharSequence text = typedArrayObtainStyledAttributes.getText(i4);
        this.c = text == null ? typedArrayObtainStyledAttributes.getText(i5) : text;
        int i6 = t5d.Preference_summary;
        int i7 = t5d.Preference_android_summary;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(i6);
        this.d = text2 == null ? typedArrayObtainStyledAttributes.getText(i7) : text2;
        this.b = typedArrayObtainStyledAttributes.getInt(t5d.Preference_order, typedArrayObtainStyledAttributes.getInt(t5d.Preference_android_order, Integer.MAX_VALUE));
        int i8 = t5d.Preference_fragment;
        int i9 = t5d.Preference_android_fragment;
        if (typedArrayObtainStyledAttributes.getString(i8) == null) {
            typedArrayObtainStyledAttributes.getString(i9);
        }
        typedArrayObtainStyledAttributes.getResourceId(t5d.Preference_layout, typedArrayObtainStyledAttributes.getResourceId(t5d.Preference_android_layout, i1d.preference));
        typedArrayObtainStyledAttributes.getResourceId(t5d.Preference_widgetLayout, typedArrayObtainStyledAttributes.getResourceId(t5d.Preference_android_widgetLayout, 0));
        typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_enabled, typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_android_enabled, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_selectable, typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_android_selectable, true));
        typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_persistent, typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_android_persistent, true));
        int i10 = t5d.Preference_dependency;
        int i11 = t5d.Preference_android_dependency;
        if (typedArrayObtainStyledAttributes.getString(i10) == null) {
            typedArrayObtainStyledAttributes.getString(i11);
        }
        int i12 = t5d.Preference_allowDividerAbove;
        typedArrayObtainStyledAttributes.getBoolean(i12, typedArrayObtainStyledAttributes.getBoolean(i12, z));
        int i13 = t5d.Preference_allowDividerBelow;
        typedArrayObtainStyledAttributes.getBoolean(i13, typedArrayObtainStyledAttributes.getBoolean(i13, z));
        if (typedArrayObtainStyledAttributes.hasValue(t5d.Preference_defaultValue)) {
            this.X = d(typedArrayObtainStyledAttributes, t5d.Preference_defaultValue);
        } else if (typedArrayObtainStyledAttributes.hasValue(t5d.Preference_android_defaultValue)) {
            this.X = d(typedArrayObtainStyledAttributes, t5d.Preference_android_defaultValue);
        }
        typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_shouldDisableView, typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_android_shouldDisableView, true));
        if (typedArrayObtainStyledAttributes.hasValue(t5d.Preference_singleLineTitle)) {
            typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_singleLineTitle, typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_android_singleLineTitle, true));
        }
        typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_iconSpaceReserved, typedArrayObtainStyledAttributes.getBoolean(t5d.Preference_android_iconSpaceReserved, false));
        int i14 = t5d.Preference_isPreferenceVisible;
        typedArrayObtainStyledAttributes.getBoolean(i14, typedArrayObtainStyledAttributes.getBoolean(i14, true));
        int i15 = t5d.Preference_enableCopying;
        typedArrayObtainStyledAttributes.getBoolean(i15, typedArrayObtainStyledAttributes.getBoolean(i15, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        q7c q7cVar = this.Y;
        return q7cVar != null ? q7cVar.e(this) : this.d;
    }

    public void c() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = preference2.b;
        CharSequence charSequence = preference2.c;
        int i2 = this.b;
        if (i2 != i) {
            return i2 - i;
        }
        CharSequence charSequence2 = this.c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public Object d(TypedArray typedArray, int i) {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceA = a();
        if (!TextUtils.isEmpty(charSequenceA)) {
            sb.append(charSequenceA);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fni.d(bvc.preferenceStyle, R.attr.preferenceStyle, context));
    }
}
