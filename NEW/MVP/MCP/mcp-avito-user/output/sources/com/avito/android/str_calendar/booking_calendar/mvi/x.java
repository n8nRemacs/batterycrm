package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StrBookingCalendarInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_calendar.booking_calendar.mvi.StrBookingCalendarInteractorImpl", f = "StrBookingCalendarInteractor.kt", i = {0, 0, 0}, l = {275, 299}, m = "mapBookingCalendarItems", n = {"this", "bookingCalendarItems", "selectedDateRange"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class x extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f286609q;

    /* renamed from: r, reason: collision with root package name */
    public List f286610r;

    /* renamed from: s, reason: collision with root package name */
    public SelectedDateRange f286611s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f286612t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f286613u;

    /* renamed from: v, reason: collision with root package name */
    public int f286614v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f286613u = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f286612t = obj;
        this.f286614v |= BeduinInputModel.MIN_TEXT_VERSION;
        return q.c(this.f286613u, null, null, null, null, this);
    }
}
