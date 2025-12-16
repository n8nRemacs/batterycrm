package com.avito.android.lib.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: TypedArrayExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x {
    @Y61.l
    public static final ColorStateList a(@Y61.k TypedArray typedArray, @Y61.k Context context, int i12) {
        int resourceId = typedArray.getResourceId(i12, 0);
        Integer numValueOf = Integer.valueOf(resourceId);
        if (resourceId == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return androidx.core.content.d.getColorStateList(context, numValueOf.intValue());
        }
        return null;
    }

    @Y61.l
    public static final Drawable b(@Y61.k TypedArray typedArray, @Y61.k Context context, int i12) {
        int resourceId = typedArray.getResourceId(i12, 0);
        Integer numValueOf = Integer.valueOf(resourceId);
        if (resourceId == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return C43852a.a(context, numValueOf.intValue());
        }
        return null;
    }
}
