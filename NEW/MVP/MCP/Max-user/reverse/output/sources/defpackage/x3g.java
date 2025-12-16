package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class x3g extends i3 {
    public static final x3g c = new x3g(16, null);

    @Override // defpackage.i3
    public final boolean i0() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
