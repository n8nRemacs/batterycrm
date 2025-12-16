package com.avito.android.calendar_select.presentation.mvicalendarselect;

import Y41.p;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CalendarSelectFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class a extends H implements p<Integer, Integer, Integer> {
    @Override // Y41.p
    public final Integer invoke(Integer num, Integer num2) {
        return Integer.valueOf(((GridLayoutManager.c) this.receiver).e(num.intValue(), num2.intValue()));
    }
}
