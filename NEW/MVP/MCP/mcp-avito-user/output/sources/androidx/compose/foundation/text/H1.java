package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.C22342u;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: PointerMoveDetector.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class H1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* compiled from: PointerMoveDetector.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
    public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.h f30322q;

        /* renamed from: r, reason: collision with root package name */
        public int f30323r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f30324s;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            throw null;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v11, types: [T, l0.g] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC22325c interfaceC22325c;
            l0.h hVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30323r;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC22325c = (InterfaceC22325c) this.f30324s;
                hVar = new l0.h();
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = this.f30322q;
                interfaceC22325c = (InterfaceC22325c) this.f30324s;
                C42729a0.b(obj);
                C22340s c22340s = (C22340s) obj;
                int i13 = c22340s.f40282e;
                C22342u.f40283b.getClass();
                if (C22342u.a(i13, C22342u.f40286e) ? true : C22342u.a(i13, C22342u.f40287f) ? true : C22342u.a(i13, C22342u.f40288g)) {
                    l0.g gVarA = l0.g.a(((androidx.compose.ui.input.pointer.C) C42745f0.E(c22340s.f40278a)).f40118c);
                    T t12 = hVar.f406842b;
                    boolean z12 = false;
                    if (t12 instanceof l0.g) {
                        if (gVarA.f413387a == ((l0.g) t12).f413387a) {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        gVarA = null;
                    }
                    if (gVarA != null) {
                        long j12 = gVarA.f413387a;
                        hVar.f406842b = l0.g.a(j12);
                        l0.g.a(j12);
                        throw null;
                    }
                }
            }
            if (!kotlinx.coroutines.Q0.h(null)) {
                return kotlin.G0.f406611a;
            }
            this.f30324s = interfaceC22325c;
            this.f30322q = hVar;
            this.f30323r = 1;
            throw null;
        }
    }

    public H1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        getF411447c();
        throw null;
    }
}
