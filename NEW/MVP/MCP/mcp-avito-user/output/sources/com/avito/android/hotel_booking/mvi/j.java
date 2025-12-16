package com.avito.android.hotel_booking.mvi;

import com.avito.android.hotel_booking.HotelBookingOpenParams;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: HotelBookingBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements com.avito.android.arch.mvi.b<HotelBookingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HotelBookingOpenParams f163917a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f163918b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f163919c;

    /* compiled from: HotelBookingBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingBootstrap$produce$1", f = "HotelBookingBootstrap.kt", i = {0}, l = {22, 34}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f163920q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f163921r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(continuation);
            aVar.f163921r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f163920q;
            j jVar = j.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f163921r;
                if (jVar.f163919c) {
                    return G0.f406611a;
                }
                HotelBookingOpenParams hotelBookingOpenParams = jVar.f163917a;
                HotelBookingInternalAction.Init init = new HotelBookingInternalAction.Init(hotelBookingOpenParams.f163250b, hotelBookingOpenParams.f163251c, hotelBookingOpenParams.f163252d, hotelBookingOpenParams.f163253e, hotelBookingOpenParams.f163254f, hotelBookingOpenParams.f163255g, hotelBookingOpenParams.f163256h);
                this.f163921r = interfaceC43172j;
                this.f163920q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f163921r;
                C42729a0.b(obj);
            }
            t tVar = jVar.f163918b;
            HotelBookingOpenParams hotelBookingOpenParams2 = jVar.f163917a;
            C43137a0 c43137a0B = tVar.b(hotelBookingOpenParams2.f163250b, hotelBookingOpenParams2.f163251c, hotelBookingOpenParams2.f163252d, hotelBookingOpenParams2.f163253e, hotelBookingOpenParams2.f163254f, hotelBookingOpenParams2.f163255g, hotelBookingOpenParams2.f163256h, P0.c(), false);
            this.f163921r = null;
            this.f163920q = 2;
            if (C43175k.u(this, c43137a0B, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HotelBookingBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingBootstrap$produce$2", f = "HotelBookingBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super HotelBookingInternalAction>, Throwable, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            return j.this.new b(continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            j.this.f163919c = true;
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k HotelBookingOpenParams hotelBookingOpenParams, @Y61.k t tVar) {
        this.f163917a = hotelBookingOpenParams;
        this.f163918b = tVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<HotelBookingInternalAction> a() {
        return new X(C43175k.G(new a(null)), new b(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
