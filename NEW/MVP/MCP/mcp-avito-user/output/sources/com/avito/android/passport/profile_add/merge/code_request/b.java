package com.avito.android.passport.profile_add.merge.code_request;

import android.widget.TextView;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kd0.C42670a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;

/* compiled from: CodeRequestFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment$observeViewModel$1", f = "CodeRequestFragment.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212844q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CodeRequestFragment f212845r;

    /* compiled from: CodeRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment$observeViewModel$1$1", f = "CodeRequestFragment.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f212846q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CodeRequestFragment f212847r;

        /* compiled from: CodeRequestFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.code_request.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6368a extends H implements Y41.l<c60.c, G0> {
            public final void f(@Y61.k c60.c cVar) {
                CodeRequestFragment codeRequestFragment = (CodeRequestFragment) this.receiver;
                CodeRequestFragment.a aVar = CodeRequestFragment.f212821B0;
                codeRequestFragment.getClass();
                boolean z12 = cVar.f57657b;
                C47313c c47313c = codeRequestFragment.f212836z0;
                if (z12) {
                    kotlin.reflect.n<Object> nVar = CodeRequestFragment.f212822C0[7];
                    ((C42670a) c47313c.a()).c(null, new e(codeRequestFragment));
                    return;
                }
                if (cVar.f57658c) {
                    kotlin.reflect.n<Object> nVar2 = CodeRequestFragment.f212822C0[7];
                    C42670a.d((C42670a) c47313c.a());
                    return;
                }
                kotlin.reflect.n<Object>[] nVarArr = CodeRequestFragment.f212822C0;
                kotlin.reflect.n<Object> nVar3 = nVarArr[7];
                ((C42670a) c47313c.a()).b();
                C47313c c47313c2 = codeRequestFragment.f212833w0;
                PrintableText printableText = cVar.f57661f;
                if (printableText != null) {
                    kotlin.reflect.n<Object> nVar4 = nVarArr[4];
                    ComponentContainer.n((ComponentContainer) c47313c2.a(), printableText.k0(codeRequestFragment.requireContext()), 2);
                } else {
                    kotlin.reflect.n<Object> nVar5 = nVarArr[4];
                    ComponentContainer componentContainer = (ComponentContainer) c47313c2.a();
                    componentContainer.q(componentContainer.f178848i);
                }
                C47313c c47313c3 = codeRequestFragment.f212834x0;
                kotlin.reflect.n<Object> nVar6 = nVarArr[5];
                Button button = (Button) c47313c3.a();
                boolean z13 = cVar.f57659d;
                button.setLoading(z13);
                kotlin.reflect.n<Object> nVar7 = nVarArr[5];
                boolean z14 = !z13;
                ((Button) c47313c3.a()).setClickable(z14);
                codeRequestFragment.q5().setEnabled(z14);
                AttributedText attributedText = cVar.f57660e;
                if (attributedText != null) {
                    C47313c c47313c4 = codeRequestFragment.f212835y0;
                    kotlin.reflect.n<Object> nVar8 = nVarArr[6];
                    com.avito.android.util.text.j.a((TextView) c47313c4.a(), attributedText, null);
                    attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(codeRequestFragment, 27));
                }
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(c60.c cVar) {
                f(cVar);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CodeRequestFragment codeRequestFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f212847r = codeRequestFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f212847r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f212846q;
            if (i12 == 0) {
                C42729a0.b(obj);
                CodeRequestFragment.a aVar = CodeRequestFragment.f212821B0;
                CodeRequestFragment codeRequestFragment = this.f212847r;
                n2<c60.c> state = codeRequestFragment.r5().getState();
                ScreenPerformanceTracker screenPerformanceTracker = codeRequestFragment.f212826p0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                C6368a c6368a = new C6368a(1, codeRequestFragment, CodeRequestFragment.class, "renderState", "renderState(Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestState;)V", 0);
                this.f212846q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6368a, this) == coroutine_suspended) {
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
    public b(CodeRequestFragment codeRequestFragment, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f212845r = codeRequestFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f212845r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212844q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            CodeRequestFragment codeRequestFragment = this.f212845r;
            a aVar = new a(codeRequestFragment, null);
            this.f212844q = 1;
            if (C23056p0.b(codeRequestFragment, state, aVar, this) == coroutine_suspended) {
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
