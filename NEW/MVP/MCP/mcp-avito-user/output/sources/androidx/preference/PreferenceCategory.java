package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.res.l.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean c() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void f(@N u uVar) {
        super.f(uVar);
        if (Build.VERSION.SDK_INT >= 28) {
            uVar.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean l() {
        return !super.c();
    }
}
