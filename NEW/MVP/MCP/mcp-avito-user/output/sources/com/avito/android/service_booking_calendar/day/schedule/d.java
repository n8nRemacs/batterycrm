package com.avito.android.service_booking_calendar.day.schedule;

import bt0.InterfaceC25709a;
import com.avito.android.service_booking_common.link.details.ServiceBookingItemDetailsLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: DayScheduleFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25709a, G0> f275296b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Y41.l<? super InterfaceC25709a, G0> lVar) {
        this.f275296b = lVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        if (((C43501a) obj).f413261b instanceof ServiceBookingItemDetailsLink.c.b) {
            this.f275296b.invoke(InterfaceC25709a.b.f57519a);
        }
        return G0.f406611a;
    }
}
