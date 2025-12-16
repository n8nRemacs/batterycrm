package com.avito.android.sbc.create.mvi;

import Uo0.e;
import Uo0.f;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/s"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToStateFromOverloaded$2", f = "CreateDiscountDispatchActor.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class B extends SuspendLambda implements Y41.p<InterfaceC43172j<? super f.k>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259214q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259215r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259216s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.w f259217t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259218u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<f.k, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(f.k kVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(kVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(com.avito.android.arch.mvi.utils.o oVar, e.w wVar, Continuation continuation, C34469a c34469a) {
        super(2, continuation);
        this.f259216s = oVar;
        this.f259217t = wVar;
        this.f259218u = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        B b12 = new B(this.f259216s, this.f259217t, continuation, this.f259218u);
        b12.f259215r = obj;
        return b12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super f.k> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((B) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259214q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259215r;
            Object value = this.f259216s.f92114c.getValue();
            a aVar = new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) value;
            if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
                CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar = discountDispatchDataLoaded.f259644x;
                if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) {
                    C34469a c34469a = this.f259218u;
                    com.avito.android.sbc.utils.g gVar = c34469a.f259544e;
                    LocalDate localDate = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) jVar).f259745d;
                    gVar.getClass();
                    String str = localDate.format(DateTimeFormatter.ofPattern(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT));
                    LocalDate localDate2 = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) discountDispatchDataLoaded.f259644x).f259746e;
                    c34469a.f259544e.getClass();
                    String str2 = localDate2.format(DateTimeFormatter.ofPattern(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT));
                    C42784z0 c42784z0 = C42784z0.f406748b;
                    f.k kVar = new f.k(new com.avito.android.sbc.create.mvi.util.b(str, str2, c42784z0, null, c42784z0, null, null, CalendarSelectionType.f113306b));
                    this.f259214q = 1;
                    if (aVar.invoke(kVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
