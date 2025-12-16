package com.avito.android.service_booking_calendar.flexible.content.mvi;

import Y41.p;
import gt0.InterfaceC40733a;
import gt0.InterfaceC40734b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarContentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lgt0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.content.mvi.CalendarContentActor$process$1", f = "CalendarContentActor.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40734b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275651q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275652r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40733a f275653s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ gt0.d f275654t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC40733a interfaceC40733a, gt0.d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f275653s = interfaceC40733a;
        this.f275654t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f275653s, this.f275654t, continuation);
        aVar.f275652r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC40734b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275651q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f275652r;
            InterfaceC40733a.d dVar = (InterfaceC40733a.d) this.f275653s;
            if (!L.f(dVar.f396899a, this.f275654t.f396924c)) {
                InterfaceC40734b.e eVar = new InterfaceC40734b.e(dVar.f396899a);
                this.f275651q = 1;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
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
