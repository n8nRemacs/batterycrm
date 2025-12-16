package com.avito.android.lib.beduin_v2.component.date_picker;

import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: DatePickerCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class i extends H implements Y41.l<Long, Boolean> {
    @Override // Y41.l
    public final Boolean invoke(Long l12) {
        Boolean boolInvoke = ((j) this.receiver).specialDateValidator.invoke(Long.valueOf(l12.longValue()));
        boolInvoke.booleanValue();
        return boolInvoke;
    }
}
