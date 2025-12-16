package kotlinx.coroutines.flow;

import java.util.ArrayList;
import kotlin.InterfaceC42730b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.internal.C43170h;
import kotlinx.coroutines.flow.internal.w;

@Metadata(d1 = {"kotlinx/coroutines/flow/x", "kotlinx/coroutines/flow/z", "kotlinx/coroutines/flow/D", "kotlinx/coroutines/flow/G", "kotlinx/coroutines/flow/H", "kotlinx/coroutines/flow/M", "kotlinx/coroutines/flow/U", "kotlinx/coroutines/flow/V", "kotlinx/coroutines/flow/e0", "kotlinx/coroutines/flow/l0", "kotlinx/coroutines/flow/y0", "kotlinx/coroutines/flow/F0", "kotlinx/coroutines/flow/L0", "kotlinx/coroutines/flow/g1", "kotlinx/coroutines/flow/j1", "kotlinx/coroutines/flow/y1", "kotlinx/coroutines/flow/V1"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43175k {
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i r4, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.S0
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.S0 r0 = (kotlinx.coroutines.flow.S0) r0
            int r1 = r0.f411253t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411253t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.S0 r0 = new kotlinx.coroutines.flow.S0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f411252s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411253t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlinx.coroutines.flow.Q0 r4 = r0.f411251r
            kotlin.jvm.internal.l0$h r0 = r0.f411250q
            kotlin.C42729a0.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L57
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.l0$h r5 = androidx.compose.foundation.H.t(r5)
            kotlinx.coroutines.flow.Q0 r2 = new kotlinx.coroutines.flow.Q0
            r2.<init>(r5)
            r0.f411250q = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.f411251r = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.f411253t = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            if (r4 != r1) goto L4d
            goto L59
        L4d:
            r0 = r5
            goto L57
        L4f:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L53:
            java.lang.Object r1 = r5.f411440b
            if (r1 != r4) goto L5a
        L57:
            T r1 = r0.f406842b
        L59:
            return r1
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43175k.A(kotlinx.coroutines.flow.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @kotlinx.coroutines.B0
    @Y61.k
    public static final C0 B(@Y61.k Y41.p pVar, @Y61.k InterfaceC43160i interfaceC43160i) {
        int i12 = F0.f411136a;
        return D(new C43220z0(pVar, interfaceC43160i));
    }

    public static InterfaceC43160i C(Y41.p pVar, InterfaceC43160i interfaceC43160i) {
        return E(new B0(pVar, interfaceC43160i), F0.f411136a);
    }

    @kotlinx.coroutines.B0
    @Y61.k
    public static final C0 D(@Y61.k InterfaceC43160i interfaceC43160i) {
        int i12 = F0.f411136a;
        return new C0(interfaceC43160i);
    }

    @kotlinx.coroutines.B0
    @Y61.k
    public static final <T> InterfaceC43160i<T> E(@Y61.k InterfaceC43160i<? extends InterfaceC43160i<? extends T>> interfaceC43160i, int i12) {
        int i13 = F0.f411136a;
        if (i12 <= 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Expected positive concurrency level, but had ").toString());
        }
        if (i12 == 1) {
            return D(interfaceC43160i);
        }
        return new C43170h(interfaceC43160i, i12, null, 0, null, 28, null);
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> G(@InterfaceC42730b @Y61.k Y41.p<? super InterfaceC43172j<? super T>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        return new c2(pVar);
    }

    @X41.i
    @Y61.k
    public static final InterfaceC43160i H(@Y61.k n2 n2Var, @Y61.k n2 n2Var2, @InterfaceC42730b @Y61.k Y41.r rVar) {
        return new c2(new K1(new InterfaceC43160i[]{n2Var, n2Var2}, null, rVar));
    }

    @Y61.k
    public static final InterfaceC43160i I(@Y61.k CoroutineContext coroutineContext, @Y61.k InterfaceC43160i interfaceC43160i) {
        if (coroutineContext.get(kotlinx.coroutines.N0.f410716u2) == null) {
            return coroutineContext.equals(EmptyCoroutineContext.INSTANCE) ? interfaceC43160i : interfaceC43160i instanceof kotlinx.coroutines.flow.internal.w ? w.a.a((kotlinx.coroutines.flow.internal.w) interfaceC43160i, coroutineContext, 0, null, 6) : new kotlinx.coroutines.flow.internal.k(interfaceC43160i, coroutineContext, 0, null, 12, null);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlinx.coroutines.internal.a0] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.W0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.W0 r0 = (kotlinx.coroutines.flow.W0) r0
            int r1 = r0.f411289s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411289s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.W0 r0 = new kotlinx.coroutines.flow.W0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f411288r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411289s
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.flow.internal.z.f411583a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.jvm.internal.l0$h r5 = r0.f411287q
            kotlin.C42729a0.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.jvm.internal.l0$h r6 = androidx.compose.foundation.H.t(r6)
            r6.f406842b = r3
            kotlinx.coroutines.flow.X0 r2 = new kotlinx.coroutines.flow.X0
            r2.<init>(r6)
            r0.f411287q = r6
            r0.f411289s = r4
            kotlinx.coroutines.flow.internal.f r5 = (kotlinx.coroutines.flow.internal.AbstractC43168f) r5
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4d
            goto L52
        L4d:
            r5 = r6
        L4e:
            T r1 = r5.f406842b
            if (r1 == r3) goto L53
        L52:
            return r1
        L53:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43175k.J(kotlinx.coroutines.flow.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public static final <T> kotlinx.coroutines.N0 K(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k kotlinx.coroutines.T t12) {
        return C43259k.d(t12, null, null, new C(interfaceC43160i, null), 3);
    }

    @kotlinx.coroutines.B0
    @Y61.k
    public static final kotlinx.coroutines.flow.internal.l L(@InterfaceC42730b @Y61.k Y41.p pVar, @Y61.k InterfaceC43160i interfaceC43160i) {
        int i12 = F0.f411136a;
        return Y(interfaceC43160i, new E0(pVar, null));
    }

    @Y61.k
    public static final kotlinx.coroutines.flow.internal.m M(@Y61.k Iterable iterable) {
        int i12 = F0.f411136a;
        return new kotlinx.coroutines.flow.internal.m(iterable, null, 0, null, 14, null);
    }

    @Y61.k
    public static final kotlinx.coroutines.flow.internal.m N(@Y61.k InterfaceC43160i... interfaceC43160iArr) {
        int i12 = F0.f411136a;
        return M(C42756l.e(interfaceC43160iArr));
    }

    @Y61.k
    public static final C43197r1 O(@Y61.k Y41.p pVar, @Y61.k InterfaceC43160i interfaceC43160i) {
        return new C43197r1(pVar, interfaceC43160i);
    }

    @Y61.k
    public static final <T> d2<T> P(@Y61.k d2<? extends T> d2Var, @Y61.k Y41.p<? super InterfaceC43172j<? super T>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        return new t2(d2Var, pVar);
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> Q(@Y61.k kotlinx.coroutines.channels.K0<? extends T> k02) {
        return new C43148e(k02, false, null, 0, null, 28, null);
    }

    @Y61.k
    @kotlinx.coroutines.C0
    public static final kotlinx.coroutines.flow.internal.s R(@Y61.k InterfaceC43160i interfaceC43160i, long j12) {
        if (j12 > 0) {
            return new kotlinx.coroutines.flow.internal.s(new S(j12, null, interfaceC43160i));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    @Y61.k
    public static final <T> d2<T> S(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k kotlinx.coroutines.T t12, @Y61.k i2 i2Var, int i12) {
        h2 h2VarA = C43174j1.a(interfaceC43160i, i12);
        e2 e2VarA = f2.a(i12, h2VarA.f411427b, h2VarA.f411428c);
        kotlinx.coroutines.internal.a0 a0Var = f2.f411393a;
        i2.f411430a.getClass();
        return new a2(e2VarA, C43259k.c(t12, h2VarA.f411429d, kotlin.jvm.internal.L.f(i2Var, i2.a.f411432b) ? CoroutineStart.f410680b : CoroutineStart.f410683e, new C43159h1(i2Var, h2VarA.f411426a, e2VarA, a0Var, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlinx.coroutines.internal.a0] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C43144c1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.c1 r0 = (kotlinx.coroutines.flow.C43144c1) r0
            int r1 = r0.f411347s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411347s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.c1 r0 = new kotlinx.coroutines.flow.c1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f411346r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411347s
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.flow.internal.z.f411583a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.jvm.internal.l0$h r5 = r0.f411345q
            kotlin.C42729a0.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.jvm.internal.l0$h r6 = androidx.compose.foundation.H.t(r6)
            r6.f406842b = r3
            kotlinx.coroutines.flow.d1 r2 = new kotlinx.coroutines.flow.d1
            r2.<init>(r6)
            r0.f411345q = r6
            r0.f411347s = r4
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4b
            goto L50
        L4b:
            r5 = r6
        L4c:
            T r1 = r5.f406842b
            if (r1 == r3) goto L51
        L50:
            return r1
        L51:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Flow is empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43175k.T(kotlinx.coroutines.flow.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public static final <T> n2<T> U(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k kotlinx.coroutines.T t12, @Y61.k i2 i2Var, T t13) {
        h2 h2VarA = C43174j1.a(interfaceC43160i, 1);
        Z1 z1A = p2.a(t13);
        i2.f411430a.getClass();
        return new b2(z1A, C43259k.c(t12, h2VarA.f411429d, kotlin.jvm.internal.L.f(i2Var, i2.a.f411432b) ? CoroutineStart.f410680b : CoroutineStart.f410683e, new C43159h1(i2Var, h2VarA.f411426a, z1A, t13, null)));
    }

    @Y61.k
    public static final C43202t0 V(@Y61.k InterfaceC43160i interfaceC43160i, int i12) {
        if (i12 > 0) {
            return new C43202t0(interfaceC43160i, i12);
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested element count ", " should be positive").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i r4, @Y61.k java.util.Collection r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.E
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.E r0 = (kotlinx.coroutines.flow.E) r0
            int r1 = r0.f411129s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411129s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.E r0 = new kotlinx.coroutines.flow.E
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f411128r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411129s
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.util.Collection r4 = r0.f411127q
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.C42729a0.b(r6)
            goto L4c
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.flow.F r6 = new kotlinx.coroutines.flow.F
            r6.<init>(r5)
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            r0.f411127q = r2
            r0.f411129s = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L4c
            goto L4d
        L4c:
            r1 = r5
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43175k.W(kotlinx.coroutines.flow.i, java.util.Collection, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Object X(InterfaceC43160i interfaceC43160i, ContinuationImpl continuationImpl) {
        return W(interfaceC43160i, new ArrayList(), continuationImpl);
    }

    @kotlinx.coroutines.B0
    @Y61.k
    public static final kotlinx.coroutines.flow.internal.l Y(@Y61.k InterfaceC43160i interfaceC43160i, @InterfaceC42730b @Y61.k Y41.q qVar) {
        int i12 = F0.f411136a;
        return new kotlinx.coroutines.flow.internal.l(qVar, interfaceC43160i, null, 0, null, 28, null);
    }

    @Y61.k
    public static final <T, R> InterfaceC43160i<R> Z(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @InterfaceC42730b @Y61.k Y41.q<? super InterfaceC43172j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> qVar) {
        return new c2(new C43214x0(interfaceC43160i, qVar, null));
    }

    @Y61.k
    public static final <T> d2<T> a(@Y61.k Y1<T> y12) {
        return new a2(y12, null);
    }

    @Y61.k
    public static final <T> n2<T> b(@Y61.k Z1<T> z12) {
        return new b2(z12, null);
    }

    public static InterfaceC43160i c(InterfaceC43160i interfaceC43160i, int i12, int i13) {
        int i14;
        BufferOverflow bufferOverflow;
        BufferOverflow bufferOverflow2 = BufferOverflow.f410778c;
        if ((i13 & 1) != 0) {
            i12 = -2;
        }
        BufferOverflow bufferOverflow3 = (i13 & 2) != 0 ? BufferOverflow.f410777b : bufferOverflow2;
        if (i12 < 0 && i12 != -2 && i12 != -1) {
            throw new IllegalArgumentException(AK.c.g(i12, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i12 == -1 && bufferOverflow3 != BufferOverflow.f410777b) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i12 == -1) {
            i14 = 0;
            bufferOverflow = bufferOverflow2;
        } else {
            i14 = i12;
            bufferOverflow = bufferOverflow3;
        }
        return interfaceC43160i instanceof kotlinx.coroutines.flow.internal.w ? w.a.a((kotlinx.coroutines.flow.internal.w) interfaceC43160i, null, i14, bufferOverflow, 1) : new kotlinx.coroutines.flow.internal.k(interfaceC43160i, null, i14, bufferOverflow, 2, null);
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> d(@InterfaceC42730b @Y61.k Y41.p<? super kotlinx.coroutines.channels.I0<? super T>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        return new C43139b(pVar, null, 0, null, 14, null);
    }

    @Y61.k
    public static final InterfaceC43142c e(@Y61.k InterfaceC43160i interfaceC43160i) {
        if (!(interfaceC43160i instanceof InterfaceC43142c)) {
            interfaceC43160i = new C43145d(interfaceC43160i);
        }
        return (InterfaceC43142c) interfaceC43160i;
    }

    @Y61.k
    public static final C43152f0 f(@Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.q qVar) {
        return new C43152f0(interfaceC43160i, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i r4, @Y61.k kotlinx.coroutines.flow.InterfaceC43172j r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C43155g0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.g0 r0 = (kotlinx.coroutines.flow.C43155g0) r0
            int r1 = r0.f411405s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411405s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.g0 r0 = new kotlinx.coroutines.flow.g0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f411404r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411405s
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.jvm.internal.l0$h r4 = r0.f411403q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4a
        L2b:
            r5 = move-exception
            r1 = r5
            goto L4f
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.jvm.internal.l0$h r6 = androidx.compose.foundation.H.t(r6)
            kotlinx.coroutines.flow.h0 r2 = new kotlinx.coroutines.flow.h0     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4c
            r0.f411403q = r6     // Catch: java.lang.Throwable -> L4c
            r0.f411405s = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L4c
            if (r4 != r1) goto L4a
            goto L80
        L4a:
            r1 = 0
            goto L80
        L4c:
            r4 = move-exception
            r1 = r4
            r4 = r6
        L4f:
            T r4 = r4.f406842b
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L7d
        L5b:
            kotlin.coroutines.CoroutineContext r5 = r0.getF411447c()
            kotlinx.coroutines.N0$b r6 = kotlinx.coroutines.N0.f410716u2
            kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r6)
            kotlinx.coroutines.N0 r5 = (kotlinx.coroutines.N0) r5
            if (r5 == 0) goto L7e
            boolean r6 = r5.isCancelled()
            if (r6 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r5 = r5.J()
            if (r5 == 0) goto L7e
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L7d
            goto L7e
        L7d:
            throw r1
        L7e:
            if (r4 != 0) goto L81
        L80:
            return r1
        L81:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L89
            kotlin.C42833p.a(r4, r1)
            throw r4
        L89:
            kotlin.C42833p.a(r1, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43175k.g(kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> h(@InterfaceC42730b @Y61.k Y41.p<? super kotlinx.coroutines.channels.I0<? super T>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar) {
        return new C43151f(pVar, null, 0, null, 14, null);
    }

    @Y61.l
    public static final Object i(@Y61.k InterfaceC43160i<?> interfaceC43160i, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objCollect = interfaceC43160i.collect(kotlinx.coroutines.flow.internal.y.f411582b, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }

    @Y61.l
    public static final <T> Object j(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k Y41.p<? super T, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objI = i(c(L(pVar, interfaceC43160i), 0, 2), continuation);
        return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : kotlin.G0.f406611a;
    }

    @Y61.k
    public static final C43221z1 k(@Y61.k InterfaceC43160i interfaceC43160i, @Y61.k InterfaceC43160i interfaceC43160i2, @Y61.k InterfaceC43160i interfaceC43160i3, @InterfaceC42730b @Y61.k Y41.r rVar) {
        return new C43221z1(new InterfaceC43160i[]{interfaceC43160i, interfaceC43160i2, interfaceC43160i3}, rVar);
    }

    @Y61.k
    public static final InterfaceC43160i l(@Y61.k n2 n2Var, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k InterfaceC43160i interfaceC43160i2, @InterfaceC42730b @Y61.k Y41.s sVar) {
        return new c2(new M1(new InterfaceC43160i[]{n2Var, interfaceC43160i, interfaceC43160i2}, null, sVar));
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> m(@Y61.k kotlinx.coroutines.channels.K0<? extends T> k02) {
        return new C43148e(k02, true, null, 0, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    @kotlinx.coroutines.C0
    public static final <T> InterfaceC43160i<T> n(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, long j12) {
        if (j12 >= 0) {
            return j12 == 0 ? interfaceC43160i : new kotlinx.coroutines.flow.internal.s(new P(new N(j12), null, interfaceC43160i));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    @kotlin.P
    @Y61.k
    @kotlinx.coroutines.C0
    public static final kotlinx.coroutines.flow.internal.s o(@Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.l lVar) {
        return new kotlinx.coroutines.flow.internal.s(new P(lVar, null, interfaceC43160i));
    }

    @Y61.k
    @kotlinx.coroutines.C0
    public static final <T> InterfaceC43160i<T> p(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, long j12) {
        return n(interfaceC43160i, C43131e0.e(j12));
    }

    @Y61.k
    public static final InterfaceC43160i q(@Y61.k Y41.p pVar, @Y61.k InterfaceC43160i interfaceC43160i) {
        Y41.l<Object, Object> lVar = V.f411277a;
        kotlin.jvm.internal.v0.e(2, pVar);
        return V.a(interfaceC43160i, lVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final <T> InterfaceC43160i<T> r(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i) {
        Y41.l<Object, Object> lVar = V.f411277a;
        return interfaceC43160i instanceof n2 ? interfaceC43160i : V.a(interfaceC43160i, V.f411277a, V.f411278b);
    }

    @Y61.k
    public static final <T, K> InterfaceC43160i<T> s(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k Y41.l<? super T, ? extends K> lVar) {
        return V.a(interfaceC43160i, lVar, V.f411278b);
    }

    @Y61.k
    public static final C43188o0 t(@Y61.k InterfaceC43160i interfaceC43160i, int i12) {
        if (i12 >= 0) {
            return new C43188o0(interfaceC43160i, i12);
        }
        throw new IllegalArgumentException(AK.c.g(i12, "Drop count should be non-negative, but had ").toString());
    }

    @Y61.l
    public static final Object u(@Y61.k Continuation continuation, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k InterfaceC43172j interfaceC43172j) throws Throwable {
        if (interfaceC43172j instanceof u2) {
            throw ((u2) interfaceC43172j).f411788b;
        }
        Object objCollect = interfaceC43160i.collect(interfaceC43172j, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }

    @Y61.l
    public static final Object v(@Y61.k InterfaceC43172j interfaceC43172j, @Y61.k kotlinx.coroutines.channels.K0 k02, @Y61.k SuspendLambda suspendLambda) {
        Object objA = C43219z.a(interfaceC43172j, k02, true, suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> w() {
        return C43157h.f411408b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlinx.coroutines.internal.a0] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i r5, @Y61.k Y41.p r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.P0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.P0 r0 = (kotlinx.coroutines.flow.P0) r0
            int r1 = r0.f411215u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411215u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.P0 r0 = new kotlinx.coroutines.flow.P0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f411214t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411215u
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.flow.internal.z.f411583a
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            kotlinx.coroutines.flow.N0 r5 = r0.f411213s
            kotlin.jvm.internal.l0$h r6 = r0.f411212r
            Y41.p r0 = r0.f411211q
            Y41.p r0 = (Y41.p) r0
            kotlin.C42729a0.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L33
            goto L63
        L33:
            r7 = move-exception
            goto L5f
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.jvm.internal.l0$h r7 = androidx.compose.foundation.H.t(r7)
            r7.f406842b = r3
            kotlinx.coroutines.flow.N0 r2 = new kotlinx.coroutines.flow.N0
            r2.<init>(r6, r7)
            r0.f411211q = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.f411212r = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.f411213s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            r0.f411215u = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5a
            if (r5 != r1) goto L57
            goto L67
        L57:
            r0 = r6
            r6 = r7
            goto L63
        L5a:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L5f:
            java.lang.Object r1 = r7.f411440b
            if (r1 != r5) goto L7c
        L63:
            T r1 = r6.f406842b
            if (r1 == r3) goto L68
        L67:
            return r1
        L68:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43175k.x(kotlinx.coroutines.flow.i, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object y(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends T> r5, @Y61.k kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.O0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.O0 r0 = (kotlinx.coroutines.flow.O0) r0
            int r1 = r0.f411187t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411187t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.O0 r0 = new kotlinx.coroutines.flow.O0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f411186s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411187t
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.flow.internal.z.f411583a
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            kotlinx.coroutines.flow.M0 r5 = r0.f411185r
            kotlin.jvm.internal.l0$h r0 = r0.f411184q
            kotlin.C42729a0.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L5b
        L2f:
            r6 = move-exception
            goto L57
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.jvm.internal.l0$h r6 = androidx.compose.foundation.H.t(r6)
            r6.f406842b = r3
            kotlinx.coroutines.flow.M0 r2 = new kotlinx.coroutines.flow.M0
            r2.<init>(r6)
            r0.f411184q = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
            r0.f411185r = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
            r0.f411187t = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
            if (r5 != r1) goto L51
            goto L5f
        L51:
            r0 = r6
            goto L5b
        L53:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L57:
            java.lang.Object r1 = r6.f411440b
            if (r1 != r5) goto L68
        L5b:
            T r1 = r0.f406842b
            if (r1 == r3) goto L60
        L5f:
            return r1
        L60:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L68:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43175k.y(kotlinx.coroutines.flow.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i r4, @Y61.k Y41.p r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.T0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.T0 r0 = (kotlinx.coroutines.flow.T0) r0
            int r1 = r0.f411271t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411271t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.T0 r0 = new kotlinx.coroutines.flow.T0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f411270s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411271t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlinx.coroutines.flow.R0 r4 = r0.f411269r
            kotlin.jvm.internal.l0$h r5 = r0.f411268q
            kotlin.C42729a0.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L57
        L2d:
            r6 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.l0$h r6 = androidx.compose.foundation.H.t(r6)
            kotlinx.coroutines.flow.R0 r2 = new kotlinx.coroutines.flow.R0
            r2.<init>(r5, r6)
            r0.f411268q = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.f411269r = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.f411271t = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            if (r4 != r1) goto L4d
            goto L59
        L4d:
            r5 = r6
            goto L57
        L4f:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L53:
            java.lang.Object r0 = r6.f411440b
            if (r0 != r4) goto L5a
        L57:
            T r1 = r5.f406842b
        L59:
            return r1
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43175k.z(kotlinx.coroutines.flow.i, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
