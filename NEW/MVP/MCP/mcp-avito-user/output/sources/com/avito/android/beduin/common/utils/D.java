package com.avito.android.beduin.common.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import com.avito.android.beduin.network.model.StrikethroughStyle;
import com.avito.android.beduin.network.model.TextLineProperty;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: TextLineProperties.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D {
    @Y61.k
    public static final Ph.e a(@Y61.k TextLineProperty textLineProperty, @Y61.k Context context) {
        ColorStateList colorStateListE;
        StrikethroughStyle style = textLineProperty.getStyle();
        Float thickness = textLineProperty.getThickness();
        UniversalColor color = textLineProperty.getColor();
        if (color != null) {
            C48063a.f437606a.getClass();
            colorStateListE = C48063a.e(context, color);
        } else {
            colorStateListE = null;
        }
        return new Ph.e(style, thickness, colorStateListE);
    }
}
