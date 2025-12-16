package com.avito.android.beduin.common.utils;

import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;

/* compiled from: Inputs.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class x {
    public static final void a(@Y61.k Input input, @Y61.l Integer num) {
        int iIntValue = num != null ? num.intValue() : 1;
        if (iIntValue == 1) {
            input.r();
        } else {
            Input.p(input, iIntValue, 0, 2);
        }
    }
}
