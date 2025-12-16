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
@DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingActor$onDeeplinkClick$1", f = "HotelBookingActor.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.hotel_booking.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30802c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f163831q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163832r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HotelBookingState f163833s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.f f163834t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30802c(HotelBookingState hotelBookingState, b.f fVar, Continuation<? super C30802c> continuation) {
        super(2, continuation);
        this.f163833s = hotelBookingState;
        this.f163834t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30802c c30802c = new C30802c(this.f163833s, this.f163834t, continuation);
        c30802c.f163832r = obj;
        return c30802c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30802c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f163831q
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.C42729a0.b(r9)
            goto L8d
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f163832r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.hotel_booking.mvi.entity.HotelBookingState r1 = r8.f163833s
            com.avito.android.hotel.model.HotelBookingFormResponse$Form r1 = r1.f163875i
            RI.b$f r3 = r8.f163834t
            r4 = 0
            if (r1 == 0) goto L67
            java.util.List r1 = r1.getItems()
            if (r1 == 0) goto L67
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r1.next()
            r6 = r5
            com.avito.android.hotel.model.HotelBookingFormItem r6 = (com.avito.android.hotel.model.HotelBookingFormItem) r6
            boolean r7 = r6 instanceof com.avito.android.hotel.model.HotelBookingParameter
            if (r7 == 0) goto L48
            com.avito.android.hotel.model.HotelBookingParameter r6 = (com.avito.android.hotel.model.HotelBookingParameter) r6
            goto L49
        L48:
            r6 = r4
        L49:
            if (r6 == 0) goto L50
            java.lang.String r6 = r6.getId()
            goto L51
        L50:
            r6 = r4
        L51:
            java.lang.String r7 = r3.f14274b
            boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
            if (r6 == 0) goto L34
            goto L5b
        L5a:
            r5 = r4
        L5b:
            com.avito.android.hotel.model.HotelBookingFormItem r5 = (com.avito.android.hotel.model.HotelBookingFormItem) r5
            if (r5 == 0) goto L67
            boolean r1 = r5 instanceof com.avito.android.hotel.model.HotelBookingParameter
            if (r1 != 0) goto L64
            r5 = r4
        L64:
            com.avito.android.hotel.model.HotelBookingParameter r5 = (com.avito.android.hotel.model.HotelBookingParameter) r5
            goto L68
        L67:
            r5 = r4
        L68:
            if (r5 == 0) goto L7d
            java.lang.String r1 = r5.getId()
            kotlin.Q r4 = new kotlin.Q
            java.lang.String r5 = "parameterId"
            r4.<init>(r5, r1)
            kotlin.Q[] r1 = new kotlin.Q[]{r4}
            android.os.Bundle r4 = androidx.core.os.C22777e.b(r1)
        L7d:
            com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction$ClickDeeplink r1 = new com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction$ClickDeeplink
            com.avito.android.deep_linking.links.DeepLink r3 = r3.f14273a
            r1.<init>(r3, r4)
            r8.f163831q = r2
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L8d
            return r0
        L8d:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.mvi.C30802c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
