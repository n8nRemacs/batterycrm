package com.avito.android.rating_form.pseudo_done.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction;
import com.avito.android.rating_form.pseudo_done.mvi.entity.RatingFormPseudoDoneInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingFormPseudoDoneBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction;", "<anonymous>", "(Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.pseudo_done.mvi.RatingFormPseudoDoneBootstrap$mapInternalActions$1", f = "RatingFormPseudoDoneBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements p<RatingFormInteractorInternalAction, Continuation<? super InterfaceC43160i<? extends RatingFormPseudoDoneInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f248851q;

    public d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(2, continuation);
        dVar.f248851q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(RatingFormInteractorInternalAction ratingFormInteractorInternalAction, Continuation<? super InterfaceC43160i<? extends RatingFormPseudoDoneInternalAction>> continuation) {
        return ((d) create(ratingFormInteractorInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return ((RatingFormInteractorInternalAction) this.f248851q) instanceof RatingFormInteractorInternalAction.StartClosing ? new C43210w(RatingFormPseudoDoneInternalAction.Close.f248853b) : new C43210w(RatingFormPseudoDoneInternalAction.Empty.f248854b);
    }
}
