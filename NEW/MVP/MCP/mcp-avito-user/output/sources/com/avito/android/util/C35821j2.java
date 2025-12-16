package com.avito.android.util;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;

/* compiled from: ImageViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.j2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35821j2 {
    public static final void a(@Y61.k ImageView imageView, @Y61.l Drawable drawable) {
        if (drawable == null) {
            D6.w(imageView);
        } else {
            imageView.setImageDrawable(drawable);
            D6.H(imageView);
        }
    }
}
