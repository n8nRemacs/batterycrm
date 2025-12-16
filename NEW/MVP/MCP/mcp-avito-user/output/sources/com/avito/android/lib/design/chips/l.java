package com.avito.android.lib.design.chips;

import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Chips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class l extends H implements Y41.l<Integer, Boolean> {
    @Override // Y41.l
    public final Boolean invoke(Integer num) {
        Boolean boolInvoke = ((Chips) this.receiver).selectCondition.invoke(Integer.valueOf(num.intValue()));
        boolInvoke.booleanValue();
        return boolInvoke;
    }
}
