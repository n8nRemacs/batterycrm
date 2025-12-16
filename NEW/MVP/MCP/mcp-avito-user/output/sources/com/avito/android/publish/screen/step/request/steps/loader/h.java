package com.avito.android.publish.screen.step.request.steps.loader;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.publish.FromPage;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import io.reactivex.rxjava3.core.I;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: StepsRequestLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/publish/PublishParametersInteractor$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/publish/PublishParametersInteractor$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.steps.loader.StepsRequestLoaderImpl$loadPublishSteps$2", f = "StepsRequestLoader.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super PublishParametersInteractor.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f242041q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f242042r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f242042r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new h(this.f242042r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super PublishParametersInteractor.a> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f242041q;
        if (i12 == 0) {
            C42729a0.b(obj);
            b bVar = this.f242042r;
            bVar.f242017f.f443212d = FromPage.f90272b;
            bVar.f242017f.f443213e = null;
            b bVar2 = this.f242042r;
            C0 c02 = bVar2.f242014c;
            I<PublishParametersInteractor.a> iG2 = bVar2.f242012a ? bVar2.f242019h.g(c02.f231861Y.getNavigation(), c02.f231865c0, c02.f231877o0, c02.f231878p0, c02.f231879q0, c02.f231868f0) : bVar2.f242019h.e(c02.f231861Y.getNavigation(), c02.f231873k0, c02.f231875m0, c02.f231868f0);
            this.f242041q = 1;
            obj = C43292o.b(iG2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return (PublishParametersInteractor.a) obj;
    }
}
