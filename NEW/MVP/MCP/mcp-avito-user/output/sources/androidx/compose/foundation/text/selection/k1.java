package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", f = "TextFieldSelectionManager.kt", i = {0, 0}, l = {781}, m = "invokeSuspend", n = {"copy", "cut"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class k1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f32055q;

    /* renamed from: r, reason: collision with root package name */
    public Object f32056r;

    /* renamed from: s, reason: collision with root package name */
    public int f32057s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f32058t;

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f32059l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21011f1 c21011f1) {
            super(0);
            this.f32059l = c21011f1;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ?? r02 = this.f32059l.f31989g;
            if (r02 != 0) {
                r02.invoke();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f32060l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C21011f1 c21011f1) {
            super(0);
            this.f32060l = c21011f1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C21011f1 c21011f1 = this.f32060l;
            kotlinx.coroutines.T t12 = c21011f1.f31991i;
            if (t12 != null) {
                C43259k.d(t12, null, CoroutineStart.f410683e, new l1(c21011f1, null), 1);
            }
            c21011f1.n();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f32061l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C21011f1 c21011f1) {
            super(0);
            this.f32061l = c21011f1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C21011f1 c21011f1 = this.f32061l;
            kotlinx.coroutines.T t12 = c21011f1.f31991i;
            if (t12 != null) {
                C43259k.d(t12, null, CoroutineStart.f410683e, new m1(c21011f1, null), 1);
            }
            c21011f1.n();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f32062l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C21011f1 c21011f1) {
            super(0);
            this.f32062l = c21011f1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C21011f1 c21011f1 = this.f32062l;
            kotlinx.coroutines.T t12 = c21011f1.f31991i;
            if (t12 != null) {
                C43259k.d(t12, null, CoroutineStart.f410683e, new n1(c21011f1, null), 1);
            }
            c21011f1.n();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f32063l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C21011f1 c21011f1) {
            super(0);
            this.f32063l = c21011f1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f32063l.p();
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(C21011f1 c21011f1, Continuation<? super k1> continuation) {
        super(2, continuation);
        this.f32058t = c21011f1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new k1(this.f32058t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((k1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af A[PHI: r2 r7
  0x00af: PHI (r2v15 androidx.compose.foundation.text.selection.k1$c) = (r2v6 androidx.compose.foundation.text.selection.k1$c), (r2v33 androidx.compose.foundation.text.selection.k1$c) binds: [B:28:0x007e, B:42:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r7v7 androidx.compose.foundation.text.selection.k1$b) = (r7v4 androidx.compose.foundation.text.selection.k1$b), (r7v18 androidx.compose.foundation.text.selection.k1$b) binds: [B:28:0x007e, B:42:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Type inference failed for: r1v33, types: [Y41.a] */
    /* JADX WARN: Type inference failed for: r2v39, types: [Y41.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
