package com.avito.android.lib.beduin_v2.component.date_picker;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.ranges.o;

/* compiled from: DatePickerCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class g extends H implements Y41.l<List<? extends o>, G0> {
    @Override // Y41.l
    public final G0 invoke(List<? extends o> list) {
        ((j) this.receiver).onSelectedDatesChange.invoke(list);
        return G0.f406611a;
    }
}
