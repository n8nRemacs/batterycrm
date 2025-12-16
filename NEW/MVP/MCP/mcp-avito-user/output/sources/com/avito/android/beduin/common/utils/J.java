package com.avito.android.beduin.common.utils;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class J {
    public static final int a(@Y61.k View view, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i14 = (i13 - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) + i12;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return (i14 + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) / 2;
    }

    public static final void b(@Y61.k View view, @Y61.l BeduinContainerIndent beduinContainerIndent) {
        D6.b(view, Integer.valueOf(y6.d(com.avito.android.beduin.common.component.model.a.b(beduinContainerIndent))), Integer.valueOf(y6.d(com.avito.android.beduin.common.component.model.a.d(beduinContainerIndent))), Integer.valueOf(y6.d(com.avito.android.beduin.common.component.model.a.c(beduinContainerIndent))), Integer.valueOf(y6.d(com.avito.android.beduin.common.component.model.a.a(beduinContainerIndent))));
    }
}
