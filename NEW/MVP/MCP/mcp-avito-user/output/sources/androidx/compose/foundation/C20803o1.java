package androidx.compose.foundation;

import androidx.compose.foundation.interaction.g;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.C22342u;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.v;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/o1;", "Landroidx/compose/ui/node/P0;", "Landroidx/compose/ui/v$d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20803o1 extends v.d implements androidx.compose.ui.node.P0 {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public androidx.compose.foundation.interaction.m f29783p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public g.a f29784q;

    /* compiled from: Hoverable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.o1$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29785q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20803o1.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29785q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f29785q = 1;
                if (C20803o1.k2(C20803o1.this, this) == coroutine_suspended) {
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

    /* compiled from: Hoverable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.o1$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29787q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20803o1.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29787q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f29787q = 1;
                if (C20803o1.l2(C20803o1.this, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k2(androidx.compose.foundation.C20803o1 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof androidx.compose.foundation.C20797m1
            if (r0 == 0) goto L16
            r0 = r5
            androidx.compose.foundation.m1 r0 = (androidx.compose.foundation.C20797m1) r0
            int r1 = r0.f29768u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f29768u = r1
            goto L1b
        L16:
            androidx.compose.foundation.m1 r0 = new androidx.compose.foundation.m1
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f29766s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29768u
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            androidx.compose.foundation.interaction.g$a r4 = r0.f29765r
            java.lang.Object r0 = r0.f29764q
            androidx.compose.foundation.o1 r0 = (androidx.compose.foundation.C20803o1) r0
            kotlin.C42729a0.b(r5)
            r5 = r4
            r4 = r0
            goto L57
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.C42729a0.b(r5)
            androidx.compose.foundation.interaction.g$a r5 = r4.f29784q
            if (r5 != 0) goto L59
            androidx.compose.foundation.interaction.g$a r5 = new androidx.compose.foundation.interaction.g$a
            r5.<init>()
            androidx.compose.foundation.interaction.m r2 = r4.f29783p
            r0.f29764q = r4
            r0.f29765r = r5
            r0.f29768u = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L57
            goto L5b
        L57:
            r4.f29784q = r5
        L59:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C20803o1.k2(androidx.compose.foundation.o1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l2(androidx.compose.foundation.C20803o1 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof androidx.compose.foundation.C20800n1
            if (r0 == 0) goto L16
            r0 = r5
            androidx.compose.foundation.n1 r0 = (androidx.compose.foundation.C20800n1) r0
            int r1 = r0.f29777t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f29777t = r1
            goto L1b
        L16:
            androidx.compose.foundation.n1 r0 = new androidx.compose.foundation.n1
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f29775r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29777t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f29774q
            androidx.compose.foundation.o1 r4 = (androidx.compose.foundation.C20803o1) r4
            kotlin.C42729a0.b(r5)
            goto L51
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.C42729a0.b(r5)
            androidx.compose.foundation.interaction.g$a r5 = r4.f29784q
            if (r5 == 0) goto L54
            androidx.compose.foundation.interaction.g$b r2 = new androidx.compose.foundation.interaction.g$b
            r2.<init>(r5)
            androidx.compose.foundation.interaction.m r5 = r4.f29783p
            r0.f29774q = r4
            r0.f29777t = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L51
            goto L56
        L51:
            r5 = 0
            r4.f29784q = r5
        L54:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C20803o1.l2(androidx.compose.foundation.o1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        m2();
    }

    public final void m2() {
        g.a aVar = this.f29784q;
        if (aVar != null) {
            this.f29783p.a(new g.b(aVar));
            this.f29784q = null;
        }
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        m2();
    }

    @Override // androidx.compose.ui.node.P0
    public final void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        if (pointerEventPass == PointerEventPass.f40174c) {
            int i12 = c22340s.f40282e;
            C22342u.f40283b.getClass();
            if (C22342u.a(i12, C22342u.f40287f)) {
                C43259k.d(Y1(), null, null, new a(null), 3);
            } else if (C22342u.a(i12, C22342u.f40288g)) {
                C43259k.d(Y1(), null, null, new b(null), 3);
            }
        }
    }
}
