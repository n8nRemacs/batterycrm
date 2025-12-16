package com.avito.android.hotel_booking.mvi;

import RI.b;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HotelBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingActor$handleDeeplinkResultEvent$1", f = "HotelBookingActor.kt", i = {0, 0}, l = {153, 163, 164, 165, 169, 173}, m = "invokeSuspend", n = {"$this$flow", "isValueUpdated"}, s = {"L$0", "I$0"})
/* renamed from: com.avito.android.hotel_booking.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30800a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f163821q;

    /* renamed from: r, reason: collision with root package name */
    public int f163822r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f163823s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.g f163824t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f163825u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ HotelBookingState f163826v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30800a(b.g gVar, g gVar2, HotelBookingState hotelBookingState, Continuation<? super C30800a> continuation) {
        super(2, continuation);
        this.f163824t = gVar;
        this.f163825u = gVar2;
        this.f163826v = hotelBookingState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30800a c30800a = new C30800a(this.f163824t, this.f163825u, this.f163826v, continuation);
        c30800a.f163823s = obj;
        return c30800a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30800a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.mvi.C30800a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
