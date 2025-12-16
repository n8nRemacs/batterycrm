package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    @RestrictTo
    public PreferenceScreen(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.res.l.a(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
    }

    @Override // androidx.preference.Preference
    public final void h() {
        if (this.f53348i == null && this.f53389C.size() != 0) {
            throw null;
        }
    }
}
