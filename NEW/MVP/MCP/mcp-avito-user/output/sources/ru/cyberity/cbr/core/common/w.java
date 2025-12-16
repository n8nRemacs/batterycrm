package ru.cyberity.cbr.core.common;

import android.graphics.BlendMode;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.ui.graphics.C22241a;
import kotlin.Metadata;

/* compiled from: DrawableExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "color", "Lkotlin/G0;", "a", "(Landroid/graphics/drawable/Drawable;I)V", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class w {
    public static final void a(@Y61.k Drawable drawable, int i12) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            C22241a.e();
            porterDuffColorFilter = C22241a.d(i12, BlendMode.SRC_ATOP);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_ATOP);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }
}
