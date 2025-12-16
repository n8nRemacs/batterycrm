package com.avito.android.autoteka.presentation.previewsearch.mvi;

import Y41.p;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: AutotekaPreviewSearchActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction$SuccessPurchase;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$subscribeOnDeeplinkHandlerResult$2", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class f extends SuspendLambda implements p<C43501a, Continuation<? super InterfaceC43160i<? extends AutotekaPreviewSearchInternalAction.SuccessPurchase>>, Object> {
    public f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(2, continuation);
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends AutotekaPreviewSearchInternalAction.SuccessPurchase>> continuation) {
        return ((f) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new C43210w(AutotekaPreviewSearchInternalAction.SuccessPurchase.f97626b);
    }
}
