package com.avito.android.rating_form.step.mvi;

import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.interactor.RatingFormInteractorInternalAction;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import ih0.InterfaceC41402a;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "<anonymous>", "(Lcom/avito/android/rating_form/interactor/RatingFormInteractorInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepBootstrap$mapInternalActions$1", f = "RatingFormStepBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class p extends SuspendLambda implements Y41.p<RatingFormInteractorInternalAction, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f249668q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f249669r;

    /* compiled from: RatingFormStepBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepBootstrap$mapInternalActions$1$1", f = "RatingFormStepBootstrap.kt", i = {0}, l = {232, 233}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249670q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249671r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RatingFormInteractorInternalAction f249672s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RatingFormInteractorInternalAction ratingFormInteractorInternalAction, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f249672s = ratingFormInteractorInternalAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f249672s, continuation);
            aVar.f249671r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249670q;
            int i13 = 2;
            Map map = null;
            Object[] objArr = 0;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f249671r;
                RatingFormStepInternalAction.UpdateItems updateItems = new RatingFormStepInternalAction.UpdateItems(Boxing.boxBoolean(false), map, i13, objArr == true ? 1 : 0);
                this.f249671r = interfaceC43172j;
                this.f249670q = 1;
                if (interfaceC43172j.emit(updateItems, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f249671r;
                C42729a0.b(obj);
            }
            RatingFormInteractorInternalAction.ShowErrorToast showErrorToast = (RatingFormInteractorInternalAction.ShowErrorToast) this.f249672s;
            PrintableText printableText = showErrorToast.f248199c;
            List<com.avito.android.rating_form.api.remote.model.a> list = showErrorToast.f248200d;
            RatingFormStepInternalAction.ShowErrorToast showErrorToast2 = new RatingFormStepInternalAction.ShowErrorToast(printableText, list != null ? new InterfaceC41402a.r(list) : null);
            this.f249671r = null;
            this.f249670q = 2;
            if (interfaceC43172j.emit(showErrorToast2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f249669r = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f249669r, continuation);
        pVar.f249668q = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(RatingFormInteractorInternalAction ratingFormInteractorInternalAction, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>> continuation) {
        return ((p) create(ratingFormInteractorInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
