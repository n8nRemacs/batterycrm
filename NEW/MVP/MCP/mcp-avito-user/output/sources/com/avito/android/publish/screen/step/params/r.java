package com.avito.android.publish.screen.step.params;

import Ie0.InterfaceC14065a;
import androidx.view.C23056p0;
import androidx.view.C23071x;
import androidx.view.Lifecycle;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsFragment$collectHtmlEventsWhenStarted$2", f = "PublishDetailsFragment.kt", i = {}, l = {437}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f241529q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f241530r;

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsFragment$collectHtmlEventsWhenStarted$2$1", f = "PublishDetailsFragment.kt", i = {}, l = {438}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f241531q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ PublishDetailsFragment f241532r;

        /* compiled from: PublishDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.publish.screen.step.params.r$a$a, reason: collision with other inner class name */
        public static final class C7231a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PublishDetailsFragment f241533b;

            public C7231a(PublishDetailsFragment publishDetailsFragment) {
                this.f241533b = publishDetailsFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC14065a.d.z zVar = new InterfaceC14065a.d.z(((Number) obj).intValue());
                PublishDetailsFragment.a aVar = PublishDetailsFragment.f240417j1;
                this.f241533b.v5().accept(zVar);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PublishDetailsFragment publishDetailsFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f241532r = publishDetailsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f241532r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f241531q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PublishDetailsFragment publishDetailsFragment = this.f241532r;
                HtmlEditorViewModel htmlEditorViewModel = publishDetailsFragment.f240433R0;
                if (htmlEditorViewModel == null) {
                    htmlEditorViewModel = null;
                }
                InterfaceC43160i interfaceC43160iA = C23071x.a(htmlEditorViewModel.getF106310Q());
                C7231a c7231a = new C7231a(publishDetailsFragment);
                this.f241531q = 1;
                if (interfaceC43160iA.collect(c7231a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(PublishDetailsFragment publishDetailsFragment, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f241530r = publishDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f241530r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f241529q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            PublishDetailsFragment publishDetailsFragment = this.f241530r;
            a aVar = new a(publishDetailsFragment, null);
            this.f241529q = 1;
            if (C23056p0.b(publishDetailsFragment, state, aVar, this) == coroutine_suspended) {
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
