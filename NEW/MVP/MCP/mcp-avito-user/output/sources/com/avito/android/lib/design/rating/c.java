package com.avito.android.lib.design.rating;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import kotlin.Metadata;

/* compiled from: RatingBar.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    public static final PorterDuffColorFilter a(int i12, int i13) {
        if (i13 != -1 && i13 != 0) {
            i12 = Color.rgb((int) ((Color.red(i13) * Color.red(i12)) / 255.0f), (int) ((Color.green(i13) * Color.green(i12)) / 255.0f), (int) ((Color.blue(i13) * Color.blue(i12)) / 255.0f));
        }
        return new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_ATOP);
    }
}
