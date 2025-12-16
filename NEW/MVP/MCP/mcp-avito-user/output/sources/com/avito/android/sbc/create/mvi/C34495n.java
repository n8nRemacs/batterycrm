package com.avito.android.sbc.create.mvi;

import Uo0.e;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToMutableStateFrom$3", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sbc.create.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34495n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259841q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259842r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e.A f259843s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.A f259844t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259845u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.n$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34495n(com.avito.android.arch.mvi.utils.o oVar, e.A a12, Continuation continuation, e.A a13, C34469a c34469a) {
        super(2, continuation);
        this.f259842r = oVar;
        this.f259843s = a12;
        this.f259844t = a13;
        this.f259845u = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34495n c34495n = new C34495n(this.f259842r, this.f259843s, continuation, this.f259844t, this.f259845u);
        c34495n.f259841q = obj;
        return c34495n;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34495n) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Resources.NotFoundException {
        LocalDate localDate;
        String quantityString;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259841q;
        o.a aVar = this.f259842r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) aVar.getValue();
        Integer numY0 = C43066x.y0(this.f259844t.f16609a);
        if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar = discountDispatchDataLoaded.f259644x;
            if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) {
                C34469a c34469a = this.f259845u;
                int iC2 = c34469a.f259544e.c(((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar).f259752e);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar2 = discountDispatchDataLoaded.f259644x;
                LocalDate localDate2 = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar2).f259751d;
                com.avito.android.sbc.utils.g gVar = c34469a.f259544e;
                gVar.c(localDate2);
                H0 h02 = c34469a.f259540a;
                if (numY0 == null) {
                    quantityString = h02.f259298a.getString(R.string.sbc_enter_validity_date_error_message);
                    localDate = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar2).f259751d;
                } else if (numY0.intValue() < 2) {
                    quantityString = h02.f259298a.getQuantityString(R.plurals.sbc_validity_date_lower_limit_error_message, 2, 2);
                    localDate = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar2).f259751d;
                } else if (numY0.intValue() > iC2) {
                    quantityString = h02.f259298a.getQuantityString(R.plurals.sbc_validity_date_higher_limit_error_message, iC2, Integer.valueOf(iC2));
                    localDate = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar2).f259752e;
                } else {
                    localDate = LocalDate.now(gVar.f260186b).plusDays(numY0.intValue() - 1).atTime(LocalTime.MAX).toLocalDate();
                    quantityString = null;
                }
                String str = quantityString;
                LocalDate localDate3 = localDate;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVarA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.h.a(discountDispatchDataLoaded.f259619D, -1, false, 7679);
                int iIntValue = numY0 != null ? numY0.intValue() : 0;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d dVar = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar2;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d dVar2 = new CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d(localDate3, gVar.d(localDate3), dVar.f259750c, dVar.f259751d, dVar.f259752e, h02.f259298a.getQuantityString(R.plurals.messenger_create_discount_dispatch_validity_days_left, iIntValue, Integer.valueOf(iIntValue)), dVar.f259754g, numY0 != null ? numY0.intValue() : 0, str, false);
                aVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, null, 0L, false, null, this.f259845u.B(discountDispatchDataLoaded.f259635o, discountDispatchDataLoaded.f259623c, discountDispatchDataLoaded.f259640t, discountDispatchDataLoaded.f259641u, dVar2), null, false, null, null, false, false, dVar2, null, null, hVarA, C34469a.t(c34469a, hVarA, dVar2, 12), C34469a.o(discountDispatchDataLoaded.f259623c, dVar2, hVarA, discountDispatchDataLoaded.f259618C), 264224767));
            }
        }
        return kotlin.G0.f406611a;
    }
}
