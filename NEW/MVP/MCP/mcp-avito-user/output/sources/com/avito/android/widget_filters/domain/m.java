package com.avito.android.widget_filters.domain;

import com.avito.android.util.P2;
import com.avito.android.widget_filters.mvi.entity.LoadingType;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.avito.android.widget_filters.remote.model.WidgetFiltersResponse;
import com.avito.android.widget_filters.remote.model.toast.WidgetFiltersToast;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/widget_filters/remote/model/WidgetFiltersResponse;", "loadingState", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "<anonymous>", "(Lcom/avito/android/util/P2;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.domain.WidgetFiltersInteractorImpl$loadWidgetFilters$4", f = "WidgetFiltersInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class m extends SuspendLambda implements Y41.p<P2<? super WidgetFiltersResponse>, Continuation<? super InterfaceC43160i<? extends WidgetFiltersInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f329881q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LoadingType f329882r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f329883s;

    /* compiled from: WidgetFiltersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.domain.WidgetFiltersInteractorImpl$loadWidgetFilters$4$1", f = "WidgetFiltersInteractor.kt", i = {0}, l = {85, 86}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f329884q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f329885r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ h f329886s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ P2<WidgetFiltersResponse> f329887t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h hVar, P2<? super WidgetFiltersResponse> p22, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f329886s = hVar;
            this.f329887t = p22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f329886s, this.f329887t, continuation);
            aVar.f329885r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f329884q;
            P2<WidgetFiltersResponse> p22 = this.f329887t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f329885r;
                WidgetFiltersToast toast = ((WidgetFiltersResponse) ((P2.b) p22).f318720a).getToast();
                this.f329885r = interfaceC43172j;
                this.f329884q = 1;
                if (h.c(this.f329886s, interfaceC43172j, toast, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f329885r;
                C42729a0.b(obj);
            }
            WidgetFiltersInternalAction.ShowContent showContent = new WidgetFiltersInternalAction.ShowContent((WidgetFiltersResponse) ((P2.b) p22).f318720a);
            this.f329885r = null;
            this.f329884q = 2;
            if (interfaceC43172j.emit(showContent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(LoadingType loadingType, h hVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f329882r = loadingType;
        this.f329883s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f329882r, this.f329883s, continuation);
        mVar.f329881q = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(P2<? super WidgetFiltersResponse> p22, Continuation<? super InterfaceC43160i<? extends WidgetFiltersInternalAction>> continuation) {
        return ((m) create(p22, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        P2 p22 = (P2) this.f329881q;
        if (p22 instanceof P2.c) {
            return new C43210w(new WidgetFiltersInternalAction.StartContentLoading(this.f329882r));
        }
        if (p22 instanceof P2.a) {
            return new C43210w(new WidgetFiltersInternalAction.ShowContentError(((P2.a) p22).f318719a));
        }
        if (p22 instanceof P2.b) {
            return C43175k.G(new a(this.f329883s, p22, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
