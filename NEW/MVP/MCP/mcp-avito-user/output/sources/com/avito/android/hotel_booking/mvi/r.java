package com.avito.android.hotel_booking.mvi;

import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HotelBookingInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingInteractor$loadForm$1", f = "HotelBookingInteractor.kt", i = {0}, l = {43, 53, 54}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f163949A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ boolean f163950B;

    /* renamed from: q, reason: collision with root package name */
    public int f163951q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163952r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f163953s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f163954t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f163955u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f163956v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f163957w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f163958x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f163959y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f163960z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, List<Integer> list, String str, Integer num, String str2, String str3, String str4, String str5, Map<String, String> map, boolean z12, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f163953s = tVar;
        this.f163954t = list;
        this.f163955u = str;
        this.f163956v = num;
        this.f163957w = str2;
        this.f163958x = str3;
        this.f163959y = str4;
        this.f163960z = str5;
        this.f163949A = map;
        this.f163950B = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f163953s, this.f163954t, this.f163955u, this.f163956v, this.f163957w, this.f163958x, this.f163959y, this.f163960z, this.f163949A, this.f163950B, continuation);
        rVar.f163952r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object objC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f163951q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f163952r;
            t tVar = this.f163953s;
            DI.c cVar = tVar.f163963a;
            List list = this.f163954t;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            HashMap mapA = t.a(tVar, list);
            this.f163952r = interfaceC43172j;
            this.f163951q = 1;
            objC = cVar.c(this.f163955u, this.f163956v, this.f163957w, this.f163958x, this.f163959y, this.f163960z, mapA, this.f163949A, this);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f163952r;
            C42729a0.b(obj);
            interfaceC43172j = interfaceC43172j2;
            objC = obj;
        }
        TypedResult typedResult = (TypedResult) objC;
        if (typedResult instanceof TypedResult.Success) {
            HotelBookingInternalAction.ContentLoaded contentLoaded = new HotelBookingInternalAction.ContentLoaded((HotelBookingFormResponse) ((TypedResult.Success) typedResult).getResult());
            this.f163952r = null;
            this.f163951q = 2;
            if (interfaceC43172j.emit(contentLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            HotelBookingInternalAction.ContentError contentError = new HotelBookingInternalAction.ContentError(com.avito.android.error.z.n(C35936s.a(error.getError(), error.getCause())), this.f163950B);
            this.f163952r = null;
            this.f163951q = 3;
            if (interfaceC43172j.emit(contentError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
