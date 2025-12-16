package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.platform.InterfaceC22509o2;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: BasicTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/H;", "Landroidx/compose/foundation/text/input/internal/selection/Z;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H implements androidx.compose.foundation.text.input.internal.selection.Z {

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", f = "BasicTextField.kt", i = {0}, l = {321}, m = "showTextToolbar", n = {"$this$showTextToolbar_u24lambda_u245"}, s = {"L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.T f30275q;

        /* renamed from: r, reason: collision with root package name */
        public TextFieldSelectionState f30276r;

        /* renamed from: s, reason: collision with root package name */
        public TextFieldSelectionState f30277s;

        /* renamed from: t, reason: collision with root package name */
        public e f30278t;

        /* renamed from: u, reason: collision with root package name */
        public l0.j f30279u;

        /* renamed from: v, reason: collision with root package name */
        public InterfaceC22509o2 f30280v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f30281w;

        /* renamed from: y, reason: collision with root package name */
        public int f30283y;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f30281w = obj;
            this.f30283y |= BeduinInputModel.MIN_TEXT_VERSION;
            return H.this.b(null, null, this);
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$1$1", f = "BasicTextField.kt", i = {}, l = {317}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30284q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30285r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextFieldSelectionState textFieldSelectionState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f30285r = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f30285r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30284q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f30284q = 1;
                if (this.f30285r.d(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1", f = "BasicTextField.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30286q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30287r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextFieldSelectionState textFieldSelectionState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f30287r = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f30287r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30286q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f30286q = 1;
                if (this.f30287r.q(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$3$1", f = "BasicTextField.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30288q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30289r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextFieldSelectionState textFieldSelectionState, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f30289r = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f30289r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30288q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f30288q = 1;
                if (this.f30289r.f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "androidx/compose/foundation/text/input/internal/selection/O", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30290l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f30291m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30292n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextFieldSelectionState textFieldSelectionState, kotlinx.coroutines.T t12, TextFieldSelectionState textFieldSelectionState2) {
            super(0);
            TextToolbarState textToolbarState = TextToolbarState.f31344b;
            this.f30290l = textFieldSelectionState;
            this.f30291m = t12;
            this.f30292n = textFieldSelectionState2;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C43259k.d(this.f30291m, null, CoroutineStart.f410683e, new b(this.f30292n, null), 1);
            this.f30290l.v(TextToolbarState.f31344b);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "androidx/compose/foundation/text/input/internal/selection/O", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30293l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f30294m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30295n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextFieldSelectionState textFieldSelectionState, kotlinx.coroutines.T t12, TextFieldSelectionState textFieldSelectionState2) {
            super(0);
            TextToolbarState textToolbarState = TextToolbarState.f31344b;
            this.f30293l = textFieldSelectionState;
            this.f30294m = t12;
            this.f30295n = textFieldSelectionState2;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C43259k.d(this.f30294m, null, CoroutineStart.f410683e, new c(this.f30295n, null), 1);
            this.f30293l.v(TextToolbarState.f31344b);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "androidx/compose/foundation/text/input/internal/selection/O", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30296l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f30297m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30298n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TextFieldSelectionState textFieldSelectionState, kotlinx.coroutines.T t12, TextFieldSelectionState textFieldSelectionState2) {
            super(0);
            TextToolbarState textToolbarState = TextToolbarState.f31344b;
            this.f30296l = textFieldSelectionState;
            this.f30297m = t12;
            this.f30298n = textFieldSelectionState2;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C43259k.d(this.f30297m, null, CoroutineStart.f410683e, new d(this.f30298n, null), 1);
            this.f30296l.v(TextToolbarState.f31344b);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "androidx/compose/foundation/text/input/internal/selection/O", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30299l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30300m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(TextFieldSelectionState textFieldSelectionState, TextFieldSelectionState textFieldSelectionState2) {
            super(0);
            TextToolbarState textToolbarState = TextToolbarState.f31344b;
            this.f30299l = textFieldSelectionState;
            this.f30300m = textFieldSelectionState2;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f30300m.s();
            this.f30299l.v(TextToolbarState.f31346d);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "androidx/compose/foundation/text/input/internal/selection/O", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30301l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f30302m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(TextFieldSelectionState textFieldSelectionState, TextFieldSelectionState textFieldSelectionState2) {
            super(0);
            TextToolbarState textToolbarState = TextToolbarState.f31344b;
            this.f30301l = textFieldSelectionState;
            this.f30302m = textFieldSelectionState2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ?? r02 = this.f30302m.f31268i;
            if (r02 != 0) {
                r02.invoke();
            }
            this.f30301l.v(TextToolbarState.f31344b);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.Z
    public final void a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // androidx.compose.foundation.text.input.internal.selection.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5, l0.j r6, kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r4 = this;
            r6 = 0
            boolean r0 = r7 instanceof androidx.compose.foundation.text.H.a
            if (r0 == 0) goto L14
            r0 = r7
            androidx.compose.foundation.text.H$a r0 = (androidx.compose.foundation.text.H.a) r0
            int r1 = r0.f30283y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f30283y = r1
            goto L19
        L14:
            androidx.compose.foundation.text.H$a r0 = new androidx.compose.foundation.text.H$a
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.f30281w
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f30283y
            r2 = 1
            if (r1 == 0) goto L4a
            if (r1 != r2) goto L42
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = r0.f30277s
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = r0.f30276r
            kotlinx.coroutines.T r0 = r0.f30275q
            kotlin.C42729a0.b(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.f31344b
            if (r7 != 0) goto L39
            goto L3e
        L39:
            androidx.compose.foundation.text.H$f r7 = new androidx.compose.foundation.text.H$f
            r7.<init>(r5, r0, r1)
        L3e:
            r1.getClass()
            throw r6
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L4a:
            kotlin.C42729a0.b(r7)
            r5.getClass()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.H.b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, l0.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
