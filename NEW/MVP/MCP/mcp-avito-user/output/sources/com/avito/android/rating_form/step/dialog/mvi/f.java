package com.avito.android.rating_form.step.dialog.mvi;

import Y41.p;
import com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DialogBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "<anonymous>", "(Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.dialog.mvi.DialogBootstrap$mapInternalActions$1", f = "DialogBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements p<RatingFormInteractorInternalAction, Continuation<? super InterfaceC43160i<? extends DialogInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f249443q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f249444r;

    /* compiled from: DialogBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.dialog.mvi.DialogBootstrap$mapInternalActions$1$1", f = "DialogBootstrap.kt", i = {0}, l = {45, 54}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super DialogInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249445q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249446r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f249447s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ RatingFormInteractorInternalAction f249448t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, RatingFormInteractorInternalAction ratingFormInteractorInternalAction, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f249447s = gVar;
            this.f249448t = ratingFormInteractorInternalAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f249447s, this.f249448t, continuation);
            aVar.f249446r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249445q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f249446r;
                DialogInfo dialogInfo = this.f249447s.f249449a;
                DialogInternalAction.Content content = new DialogInternalAction.Content(dialogInfo.f249342c, dialogInfo.f249343d, dialogInfo.f249344e, dialogInfo.f249345f);
                this.f249446r = interfaceC43172j;
                this.f249445q = 1;
                if (interfaceC43172j.emit(content, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f249446r;
                C42729a0.b(obj);
            }
            DialogInternalAction.ShowErrorToast showErrorToast = new DialogInternalAction.ShowErrorToast(((RatingFormInteractorInternalAction.ShowErrorToast) this.f249448t).f248199c);
            this.f249446r = null;
            this.f249445q = 2;
            if (interfaceC43172j.emit(showErrorToast, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f249444r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f249444r, continuation);
        fVar.f249443q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(RatingFormInteractorInternalAction ratingFormInteractorInternalAction, Continuation<? super InterfaceC43160i<? extends DialogInternalAction>> continuation) {
        return ((f) create(ratingFormInteractorInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        RatingFormInteractorInternalAction ratingFormInteractorInternalAction = (RatingFormInteractorInternalAction) this.f249443q;
        return ratingFormInteractorInternalAction instanceof RatingFormInteractorInternalAction.Step ? new C43210w(DialogInternalAction.CloseDialog.f249432b) : ratingFormInteractorInternalAction instanceof RatingFormInteractorInternalAction.ShowErrorToast ? C43175k.G(new a(this.f249444r, ratingFormInteractorInternalAction, null)) : new C43210w(DialogInternalAction.Empty.f249437b);
    }
}
