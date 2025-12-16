package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.fni;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, fni.d(bvc.preferenceCategoryStyle, R.attr.preferenceCategoryStyle, context), 0);
    }
}
