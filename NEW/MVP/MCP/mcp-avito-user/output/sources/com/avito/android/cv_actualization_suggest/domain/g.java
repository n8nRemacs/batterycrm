package com.avito.android.cv_actualization_suggest.domain;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JsxActualizationSuggestInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization_suggest.domain.JsxActualizationSuggestInteractorImpl$getDeeplinkActualizationIfNeeded$2", f = "JsxActualizationSuggestInteractorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements q<InterfaceC43172j<? super DeepLink>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f131580q;

    public g() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super DeepLink> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        g gVar = new g(3, continuation);
        gVar.f131580q = th2;
        return gVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        V2.f318762a.a("JsxOnePerDayActualizationSuggestInteractor", "error while load actualization suggest", this.f131580q);
        return G0.f406611a;
    }
}
