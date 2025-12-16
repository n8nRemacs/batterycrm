package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$loadSerpAdvertsInPin$2", f = "MapInteractor.kt", i = {}, l = {349}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class E extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184946q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f184947r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.C5436a.C5437a f184948s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f184949t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(a.C5436a.C5437a c5437a, boolean z12, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f184948s = c5437a;
        this.f184949t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E e12 = new E(this.f184948s, this.f184949t, continuation);
        e12.f184947r = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((E) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184946q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f184947r;
            a.C5436a.C5437a c5437a = this.f184948s;
            if (c5437a != null) {
                MapInternalAction.PinAdvertsLoading pinAdvertsLoading = new MapInternalAction.PinAdvertsLoading(c5437a, this.f184949t);
                this.f184946q = 1;
                if (interfaceC43172j.emit(pinAdvertsLoading, this) == coroutine_suspended) {
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
