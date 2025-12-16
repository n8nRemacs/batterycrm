package com.avito.android.imv_similiar_adverts.mvi;

import Y41.q;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsParams;
import com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pN.C46979a;

/* compiled from: ImvSimilarAdvertsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.imv_similiar_adverts.mvi.ImvSimilarAdvertsActor$Companion$getSimilarAdverts$2", f = "ImvSimilarAdvertsActor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements q<InterfaceC43172j<?>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f170884q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f170885r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f170886s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f170887t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ImvSimilarAdvertsParams f170888u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.remote.error.f f170889v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC28373a interfaceC28373a, ImvSimilarAdvertsParams imvSimilarAdvertsParams, com.avito.android.remote.error.f fVar, Continuation<? super b> continuation) {
        super(3, continuation);
        this.f170887t = interfaceC28373a;
        this.f170888u = imvSimilarAdvertsParams;
        this.f170889v = fVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        b bVar = new b(this.f170887t, this.f170888u, this.f170889v, continuation);
        bVar.f170885r = interfaceC43172j;
        bVar.f170886s = th2;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f170884q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f170885r;
            Throwable th2 = this.f170886s;
            ImvSimilarAdvertsParams imvSimilarAdvertsParams = this.f170888u;
            this.f170887t.c(new C46979a(imvSimilarAdvertsParams.f170851g, imvSimilarAdvertsParams.f170852h, imvSimilarAdvertsParams.f170850f, imvSimilarAdvertsParams.f170848d, imvSimilarAdvertsParams.f170849e, true));
            ImvSimilarAdvertsInternalAction.ShowError showError = new ImvSimilarAdvertsInternalAction.ShowError(this.f170889v.a(th2));
            this.f170885r = null;
            this.f170884q = 1;
            if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
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
