package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.C22126m3;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class N extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super N0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f31245q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31246r;

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31247q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f31248r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextFieldSelectionState textFieldSelectionState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31248r = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f31248r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f31247q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f31247q = 1;
                TextFieldSelectionState textFieldSelectionState = this.f31248r;
                textFieldSelectionState.getClass();
                Object objCollect = C43175k.t(C43175k.q(G.f31228b, C22126m3.n(new F(textFieldSelectionState))), 1).collect(new H(textFieldSelectionState), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
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

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {424}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31249q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f31250r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextFieldSelectionState textFieldSelectionState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f31250r = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f31250r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f31249q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f31249q = 1;
                TextFieldSelectionState textFieldSelectionState = this.f31250r;
                textFieldSelectionState.getClass();
                Object objCollect = C22126m3.n(new I(textFieldSelectionState)).collect(new J(textFieldSelectionState), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
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
    public N(TextFieldSelectionState textFieldSelectionState, Continuation<? super N> continuation) {
        super(2, continuation);
        this.f31246r = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        N n12 = new N(this.f31246r, continuation);
        n12.f31245q = obj;
        return n12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super N0> continuation) {
        return ((N) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f31245q;
        TextFieldSelectionState textFieldSelectionState = this.f31246r;
        C43259k.d(t12, null, null, new a(textFieldSelectionState, null), 3);
        return C43259k.d(t12, null, null, new b(textFieldSelectionState, null), 3);
    }
}
