package com.avito.android.extended_profile.search;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.search.ExtendedProfileSearchInteractorImpl$searchAdverts$2", f = "ExtendedProfileSearchInteractor.kt", i = {0, 0}, l = {159, 167}, m = "invokeSuspend", n = {"$this$catch", "it"}, s = {"L$0", "L$1"})
/* loaded from: classes13.dex */
final class j extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150511q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f150512r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f150513s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.C4397a f150514t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a.C4397a c4397a, Continuation<? super j> continuation) {
        super(3, continuation);
        this.f150514t = c4397a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        j jVar = new j(this.f150514t, continuation);
        jVar.f150512r = interfaceC43172j;
        jVar.f150513s = th2;
        return jVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150511q;
        int i13 = 2;
        Integer num = null;
        Object[] objArr = 0;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = this.f150512r;
            Throwable th3 = this.f150513s;
            ExtendedProfileInternalAction.UpdateActiveAdvertsSearchState updateActiveAdvertsSearchState = new ExtendedProfileInternalAction.UpdateActiveAdvertsSearchState(a.C4397a.a(this.f150514t, false, true, null, null, null, null, null, false, null, null, null, null, 1048572), num, i13, objArr == true ? 1 : 0);
            this.f150512r = interfaceC43172j2;
            this.f150513s = th3;
            this.f150511q = 1;
            if (interfaceC43172j2.emit(updateActiveAdvertsSearchState, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
            th2 = th3;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            th2 = this.f150513s;
            interfaceC43172j = this.f150512r;
            C42729a0.b(obj);
        }
        ExtendedProfileInternalAction.ShowCommonErrorToastBar showCommonErrorToastBar = new ExtendedProfileInternalAction.ShowCommonErrorToastBar(th2);
        this.f150512r = null;
        this.f150513s = null;
        this.f150511q = 2;
        if (interfaceC43172j.emit(showCommonErrorToastBar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
