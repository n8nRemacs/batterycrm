package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import defpackage.bvc;
import defpackage.fni;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, fni.d(bvc.preferenceScreenStyle, R.attr.preferenceScreenStyle, context), 0);
    }
}
