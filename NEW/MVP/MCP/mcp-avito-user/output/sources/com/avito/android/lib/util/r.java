package com.avito.android.lib.util;

import android.content.res.ColorStateList;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import kotlin.Metadata;
import wK0.AbstractC49528c;

/* compiled from: ImageViewExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r {
    public static final void a(@Y61.k ImageView imageView, int i12, int i13, @Y61.l ColorStateList colorStateList, @Y61.l ColorStateList colorStateList2) {
        LayerDrawable layerDrawableB;
        if (colorStateList != null) {
            AbstractC49528c.a aVar = AbstractC49528c.f441377b;
            aVar.getClass();
            layerDrawableB = AbstractC49528c.a.b(aVar, AbstractC49528c.a.a(), i12, i13, i12, i13, colorStateList, colorStateList2, null, null, 384);
        } else {
            layerDrawableB = null;
        }
        imageView.setBackground(layerDrawableB);
    }
}
