package com.avito.android.inline_filters.dialog.calendar;

import EN.b;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.Date;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FiltersCalendarPickerDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/str_calendar/common/models/DateRange;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/str_calendar/common/models/DateRange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.calendar.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31004d extends N implements Y41.l<DateRange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31003c f171196l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31004d(C31003c c31003c) {
        super(1);
        this.f171196l = c31003c;
    }

    @Override // Y41.l
    public final G0 invoke(DateRange dateRange) {
        DateRange dateRange2 = dateRange;
        C31003c c31003c = this.f171196l;
        Y41.l<EN.b, G0> lVar = c31003c.f171187d;
        Date date = dateRange2.f286636b;
        o oVar = c31003c.f171189f;
        if (oVar == null) {
            oVar = null;
        }
        lVar.invoke(new b.d(date, dateRange2.f286637c, oVar.de()));
        c31003c.a();
        return G0.f406611a;
    }
}
