package com.avito.android.sbc.create.mvi;

import Uo0.e;
import com.avito.android.R;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToMutableStateFrom$5", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sbc.create.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34499p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259853q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259854r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e.C15548b f259855s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.C15548b f259856t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259857u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.p$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34499p(com.avito.android.arch.mvi.utils.o oVar, e.C15548b c15548b, Continuation continuation, e.C15548b c15548b2, C34469a c34469a) {
        super(2, continuation);
        this.f259854r = oVar;
        this.f259855s = c15548b;
        this.f259856t = c15548b2;
        this.f259857u = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34499p c34499p = new C34499p(this.f259854r, this.f259855s, continuation, this.f259856t, this.f259857u);
        c34499p.f259853q = obj;
        return c34499p;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34499p) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoadedA;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259853q;
        o.a aVar = this.f259854r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) aVar.getValue();
        if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
            Long lZ02 = C43066x.z0(this.f259856t.f16621a);
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
            CreateDiscountDispatchState.c cVar = discountDispatchDataLoaded.f259638r;
            CreateDiscountDispatchState.c.a aVar2 = cVar instanceof CreateDiscountDispatchState.c.a ? (CreateDiscountDispatchState.c.a) cVar : null;
            Long lBoxLong = aVar2 != null ? Boxing.boxLong(aVar2.f259761a) : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVarA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.h.a(discountDispatchDataLoaded.f259619D, -1, false, 7679);
            C34469a c34469a = this.f259857u;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.e eVarT = C34469a.t(c34469a, hVarA, discountDispatchDataLoaded.f259644x, 12);
            if (lZ02 == null || lZ02.longValue() == 0) {
                discountDispatchDataLoadedA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, null, 0L, true, c34469a.f259540a.f259298a.getString(R.string.messenger_create_discount_dispatch_set_recipient_count), null, null, false, null, null, false, false, null, null, null, hVarA, eVarT, null, 1342176495);
            } else if (lBoxLong == null || lZ02.longValue() <= lBoxLong.longValue()) {
                long jLongValue = lZ02.longValue();
                long j12 = discountDispatchDataLoaded.f259627g;
                if (jLongValue > j12) {
                    H0 h02 = c34469a.f259540a;
                    discountDispatchDataLoadedA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, null, lZ02.longValue(), true, h02.f259298a.getQuantityString(R.plurals.messenger_create_discount_dispatch_available_audience_error, (int) j12, Long.valueOf(j12)), null, null, false, null, null, false, false, null, null, null, hVarA, eVarT, null, 1342176431);
                } else {
                    discountDispatchDataLoadedA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, null, lZ02.longValue(), false, "", null, this.f259857u.v(discountDispatchDataLoaded.f259619D, lZ02.longValue(), discountDispatchDataLoaded.f259623c, discountDispatchDataLoaded.f259618C, null, discountDispatchDataLoaded.f259638r), false, null, null, false, false, null, null, null, hVarA, eVarT, null, 1342110895);
                }
            } else {
                discountDispatchDataLoadedA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, null, lZ02.longValue(), true, c34469a.f259540a.f259298a.getString(R.string.messenger_create_discount_dispatch_recipient_count_exceeds_tariff_limit), null, null, false, null, null, false, false, null, null, null, hVarA, eVarT, null, 1342176431);
            }
            aVar.setValue(discountDispatchDataLoadedA);
        }
        return kotlin.G0.f406611a;
    }
}
