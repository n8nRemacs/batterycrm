package com.avito.android.lib.util;

import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: EdgeToEdgeHelper.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class n extends H implements Y41.r<Integer, Integer, Integer, Integer, G0> {
    @Override // Y41.r
    public final G0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        ((View) this.receiver).setPadding(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        return G0.f406611a;
    }
}
