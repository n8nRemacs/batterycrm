package com.avito.android.rating_form.mvi;

import ch0.InterfaceC27196b;
import com.avito.android.rating_form.mvi.entity.RatingFormInternalAction;
import com.avito.android.rating_form.mvi.entity.RatingFormState;
import dh0.InterfaceC39727a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.mvi.RatingFormActor$process$2", f = "RatingFormActor.kt", i = {}, l = {36, 38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f248696q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f248697r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39727a f248698s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f248699t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RatingFormState f248700u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC39727a interfaceC39727a, d dVar, RatingFormState ratingFormState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f248698s = interfaceC39727a;
        this.f248699t = dVar;
        this.f248700u = ratingFormState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f248698s, this.f248699t, this.f248700u, continuation);
        bVar.f248697r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f248696q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f248697r;
            if (((InterfaceC39727a.d) this.f248698s).f393999a) {
                RatingFormInternalAction.ShowProgress showProgress = new RatingFormInternalAction.ShowProgress(InterfaceC27196b.a.f58101a);
                this.f248696q = 1;
                if (interfaceC43172j.emit(showProgress, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                RatingFormInternalAction.ShowProgress showProgress2 = new RatingFormInternalAction.ShowProgress(this.f248699t.f248705c.a(this.f248700u.f248745c));
                this.f248696q = 2;
                if (interfaceC43172j.emit(showProgress2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
