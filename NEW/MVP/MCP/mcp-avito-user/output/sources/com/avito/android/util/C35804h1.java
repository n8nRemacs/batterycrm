package com.avito.android.util;

import android.content.res.TypedArray;
import kotlin.Metadata;

/* compiled from: ExpandablePanelLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.h1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35804h1 {
    public static final Integer a(TypedArray typedArray, int i12) {
        if ((typedArray.hasValue(i12) ? typedArray : null) != null) {
            return Integer.valueOf(typedArray.getResourceId(i12, 0));
        }
        return null;
    }
}
