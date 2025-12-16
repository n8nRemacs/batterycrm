package com.avito.android.sbc.create.mvi;

import Uo0.e;
import Uo0.f;
import com.avito.android.R;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.sbc.create.model.Offer;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import com.avito.android.sbc.create.mvi.entity.DiscountAlternativesDialogData;
import com.avito.android.sbc.create.mvi.entity.DiscountAlternativesDialogItem;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToMutableStateFrom$4", f = "CreateDiscountDispatchActor.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sbc.create.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34497o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super f.l>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259847q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259848r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259849s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.n f259850t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259851u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.o$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<f.l, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(f.l lVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(lVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34497o(com.avito.android.arch.mvi.utils.o oVar, e.n nVar, Continuation continuation, C34469a c34469a) {
        super(2, continuation);
        this.f259849s = oVar;
        this.f259850t = nVar;
        this.f259851u = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34497o c34497o = new C34497o(this.f259849s, this.f259850t, continuation, this.f259851u);
        c34497o.f259848r = obj;
        return c34497o;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super f.l> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34497o) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259847q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259848r;
            o.a aVar = this.f259849s.f92114c;
            a aVar2 = new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) aVar.getValue();
            if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
                ArrayList<Offer> arrayList = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState).f259619D.f259692h;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                for (Offer offer : arrayList) {
                    arrayList2.add(new DiscountAlternativesDialogItem(offer.getF119974b(), offer.getF259204b(), false));
                }
                f.l lVar = new f.l(new DiscountAlternativesDialogData(this.f259851u.f259540a.f259298a.getString(R.string.messenger_create_discount_dispatch_offer_selection_dialog_title), arrayList2));
                this.f259847q = 1;
                if (aVar2.invoke(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
