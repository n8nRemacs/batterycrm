package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getContent$1", f = "BxContentInteractor.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class H extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, Throwable, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f111359q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f111360r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.h<SearchParams> f111361s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.h<NavigationBarStyle> f111362t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l0.h<BxContentBusiness360.ReplaceMain> f111363u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(l0.h<SearchParams> hVar, l0.h<NavigationBarStyle> hVar2, l0.h<BxContentBusiness360.ReplaceMain> hVar3, Continuation<? super H> continuation) {
        super(3, continuation);
        this.f111361s = hVar;
        this.f111362t = hVar2;
        this.f111363u = hVar3;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
        l0.h<BxContentBusiness360.ReplaceMain> hVar = this.f111363u;
        H h12 = new H(this.f111361s, this.f111362t, hVar, continuation);
        h12.f111360r = interfaceC43172j;
        return h12.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111359q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f111360r;
            BxContentInternalAction.ShowOnboardings showOnboardings = new BxContentInternalAction.ShowOnboardings(this.f111361s.f406842b, this.f111362t.f406842b, this.f111363u.f406842b);
            this.f111359q = 1;
            if (interfaceC43172j.emit(showOnboardings, this) == coroutine_suspended) {
                return coroutine_suspended;
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
