package com.avito.android.service_booking_calendar.flexible.content.mvi;

import Y41.p;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import gt0.InterfaceC40734b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarContentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lgt0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.content.mvi.CalendarContentActor$process$3", f = "CalendarContentActor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40734b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275659q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275660r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gt0.d f275661s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gt0.d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f275661s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f275661s, continuation);
        cVar.f275660r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC40734b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275659q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275660r;
            gt0.d dVar = this.f275661s;
            DayItem dayItem = dVar.f396924c;
            if (dayItem != null) {
                InterfaceC40734b.C11233b c11233b = new InterfaceC40734b.C11233b(dayItem, dVar.f396925d);
                this.f275659q = 1;
                if (interfaceC43172j.emit(c11233b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
