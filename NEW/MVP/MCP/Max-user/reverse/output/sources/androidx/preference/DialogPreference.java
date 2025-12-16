package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.fni;
import defpackage.t5d;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final Drawable Z;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5d.DialogPreference, i, 0);
        int i2 = t5d.DialogPreference_dialogTitle;
        int i3 = t5d.DialogPreference_android_dialogTitle;
        if (typedArrayObtainStyledAttributes.getString(i2) == null) {
            typedArrayObtainStyledAttributes.getString(i3);
        }
        int i4 = t5d.DialogPreference_dialogMessage;
        int i5 = t5d.DialogPreference_android_dialogMessage;
        if (typedArrayObtainStyledAttributes.getString(i4) == null) {
            typedArrayObtainStyledAttributes.getString(i5);
        }
        int i6 = t5d.DialogPreference_dialogIcon;
        int i7 = t5d.DialogPreference_android_dialogIcon;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i6);
        this.Z = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(i7) : drawable;
        int i8 = t5d.DialogPreference_positiveButtonText;
        int i9 = t5d.DialogPreference_android_positiveButtonText;
        if (typedArrayObtainStyledAttributes.getString(i8) == null) {
            typedArrayObtainStyledAttributes.getString(i9);
        }
        int i10 = t5d.DialogPreference_negativeButtonText;
        int i11 = t5d.DialogPreference_android_negativeButtonText;
        if (typedArrayObtainStyledAttributes.getString(i10) == null) {
            typedArrayObtainStyledAttributes.getString(i11);
        }
        typedArrayObtainStyledAttributes.getResourceId(t5d.DialogPreference_dialogLayout, typedArrayObtainStyledAttributes.getResourceId(t5d.DialogPreference_android_dialogLayout, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fni.d(bvc.dialogPreferenceStyle, R.attr.dialogPreferenceStyle, context));
    }
}
