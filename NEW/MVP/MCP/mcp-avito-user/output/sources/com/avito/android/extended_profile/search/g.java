package com.avito.android.extended_profile.search;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateActiveAdvertsFiltersCount;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.search.ExtendedProfileSearchInteractorImpl$loadFilters$1", f = "ExtendedProfileSearchInteractor.kt", i = {0}, l = {173, 174}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction.UpdateActiveAdvertsFiltersCount>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150496q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f150497r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f150498s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.C4397a f150499t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, a.C4397a c4397a, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f150498s = kVar;
        this.f150499t = c4397a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f150498s, this.f150499t, continuation);
        gVar.f150497r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction.UpdateActiveAdvertsFiltersCount> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150496q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f150497r;
            SearchParams searchParamsA = q.a(this.f150499t.f150257g);
            this.f150497r = interfaceC43172j;
            this.f150496q = 1;
            obj = k.d(this.f150498s, searchParamsA, this);
            if (obj == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f150497r;
            C42729a0.b(obj);
        }
        ExtendedProfileInternalAction.UpdateActiveAdvertsFiltersCount updateActiveAdvertsFiltersCount = new ExtendedProfileInternalAction.UpdateActiveAdvertsFiltersCount(((Number) obj).intValue());
        this.f150497r = null;
        this.f150496q = 2;
        if (interfaceC43172j.emit(updateActiveAdvertsFiltersCount, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
