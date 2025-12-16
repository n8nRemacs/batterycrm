package com.avito.android.lib.util.darkTheme;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;

/* compiled from: DarkThemeManager.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    public static final boolean a(@k Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean b(@k Context context) {
        return c(context.getResources());
    }

    public static final boolean c(@k Resources resources) {
        return !((resources.getConfiguration().uiMode & 48) == 32);
    }
}
