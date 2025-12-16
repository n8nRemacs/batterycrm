package com.avito.android.user_adverts_filters.main.vm;

import com.avito.android.user_adverts_filters.main.vm.h;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Y1;
import rJ0.InterfaceC47555b;

/* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.vm.UserAdvertsFiltersMainMviViewModel$bindMainFeatureEvents$2$2", f = "UserAdvertsFiltersMainMviViewModel.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f316446q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f316447r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47555b f316448s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, Continuation continuation, InterfaceC47555b interfaceC47555b) {
        super(2, continuation);
        this.f316447r = hVar;
        this.f316448s = interfaceC47555b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f316447r, continuation, this.f316448s);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f316446q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Y1 y12 = (Y1) this.f316447r.f316410T.getValue();
            h.d.b bVar = new h.d.b(((InterfaceC47555b.C12369b) this.f316448s).f429737a);
            this.f316446q = 1;
            if (y12.emit(bVar, this) == coroutine_suspended) {
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
