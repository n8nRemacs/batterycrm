package com.avito.android.lib.beduin_v2.component.date_picker;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: DatePickerCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class f extends H implements Y41.l<Long, G0> {
    @Override // Y41.l
    public final G0 invoke(Long l12) {
        ((j) this.receiver).onSpecialDateClicked.invoke(Long.valueOf(l12.longValue()));
        return G0.f406611a;
    }
}
