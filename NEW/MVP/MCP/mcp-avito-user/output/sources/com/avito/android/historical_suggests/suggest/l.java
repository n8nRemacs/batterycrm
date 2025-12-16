package com.avito.android.historical_suggests.suggest;

import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.historical_suggests.model.AddressType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vI.InterfaceC49217b;

/* compiled from: HistoricalSuggestsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.HistoricalSuggestsView$collectEvents$1", f = "HistoricalSuggestsView.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f162116q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f162117r;

    /* compiled from: HistoricalSuggestsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.historical_suggests.suggest.HistoricalSuggestsView$collectEvents$1$1", f = "HistoricalSuggestsView.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f162118q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ k f162119r;

        /* compiled from: HistoricalSuggestsView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.historical_suggests.suggest.l$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C4748a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f162120b;

            public C4748a(k kVar) {
                this.f162120b = kVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Y41.p<AddressParameter.Value, AddressType, G0> dataLoadedListener;
                InterfaceC49217b interfaceC49217b = (InterfaceC49217b) obj;
                int i12 = k.f162106i;
                k kVar = this.f162120b;
                kVar.getClass();
                if (interfaceC49217b instanceof InterfaceC49217b.C12762b) {
                    Y41.p<AddressParameter.Value, AddressType, G0> selectListener = kVar.getSelectListener();
                    if (selectListener != null) {
                        InterfaceC49217b.C12762b c12762b = (InterfaceC49217b.C12762b) interfaceC49217b;
                        selectListener.invoke(c12762b.f440656a, c12762b.f440657b);
                    }
                } else if ((interfaceC49217b instanceof InterfaceC49217b.a) && (dataLoadedListener = kVar.getDataLoadedListener()) != null) {
                    InterfaceC49217b.a aVar = (InterfaceC49217b.a) interfaceC49217b;
                    dataLoadedListener.invoke(aVar.f440654a, aVar.f440655b);
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f162120b, k.class, "handleEvent", "handleEvent(Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f162119r = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f162119r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f162118q;
            if (i12 == 0) {
                C42729a0.b(obj);
                k kVar = this.f162119r;
                InterfaceC43160i<InterfaceC49217b> events = kVar.getViewModel().getEvents();
                C4748a c4748a = new C4748a(kVar);
                this.f162118q = 1;
                if (events.collect(c4748a, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f162117r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f162117r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f162116q;
        if (i12 == 0) {
            C42729a0.b(obj);
            k kVar = this.f162117r;
            InterfaceC22983P lifecycleOwner = kVar.getLifecycleOwner();
            if (lifecycleOwner != null) {
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(kVar, null);
                this.f162116q = 1;
                if (C23056p0.b(lifecycleOwner, state, aVar, this) == coroutine_suspended) {
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
