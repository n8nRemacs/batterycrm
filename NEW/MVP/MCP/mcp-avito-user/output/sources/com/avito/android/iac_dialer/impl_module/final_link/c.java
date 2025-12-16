package com.avito.android.iac_dialer.impl_module.final_link;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: IacFinalLinkInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/deep_linking/links/DeepLink;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractorImpl$getFinalLink$2", f = "IacFinalLinkInteractor.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super DeepLink>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166018q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f166019r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacFinalLinkInteractor.Params f166020s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IacMetaInfoStorage.Data f166021t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, IacFinalLinkInteractor.Params params, IacMetaInfoStorage.Data data, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f166019r = aVar;
        this.f166020s = params;
        this.f166021t = data;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f166019r, this.f166020s, this.f166021t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super DeepLink> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166018q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f166018q = 1;
            obj = a.b(this.f166019r, this.f166020s, this.f166021t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
