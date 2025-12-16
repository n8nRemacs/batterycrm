package androidx.compose.ui.input.nestedscroll;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: NestedScrollModifier.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/b;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public f f40077a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public f f40078b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public N f40079c = new a();

    /* renamed from: d, reason: collision with root package name */
    @l
    public T f40080d;

    /* compiled from: NestedScrollModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/T;", "invoke", "()Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<T> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final T invoke() {
            return b.this.f40080d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.c
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.c r0 = (androidx.compose.ui.input.nestedscroll.c) r0
            int r1 = r0.f40084s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f40084s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.c r0 = new androidx.compose.ui.input.nestedscroll.c
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f40082q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f40084s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.C42729a0.b(r12)
            goto L8c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.C42729a0.b(r12)
            goto L65
        L3a:
            kotlin.C42729a0.b(r12)
            androidx.compose.ui.input.nestedscroll.f r12 = r7.f40077a
            r1 = 0
            if (r12 == 0) goto L4d
            boolean r4 = r12.f42893o
            if (r4 == 0) goto L4d
            androidx.compose.ui.node.TraversableNode r12 = androidx.compose.ui.node.Z0.a(r12)
            androidx.compose.ui.input.nestedscroll.f r12 = (androidx.compose.ui.input.nestedscroll.f) r12
            goto L4e
        L4d:
            r12 = r1
        L4e:
            r4 = 0
            if (r12 != 0) goto L70
            boolean r12 = androidx.compose.ui.l.f40321b
            if (r12 == 0) goto L70
            androidx.compose.ui.input.nestedscroll.f r1 = r7.f40078b
            if (r1 == 0) goto L6a
            r6.f40084s = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.U0(r2, r4, r6)
            if (r12 != r0) goto L65
            return r0
        L65:
            androidx.compose.ui.unit.B r12 = (androidx.compose.ui.unit.B) r12
            long r4 = r12.f42837a
            goto L96
        L6a:
            androidx.compose.ui.unit.B$a r8 = androidx.compose.ui.unit.B.f42836b
            r8.getClass()
            goto L96
        L70:
            androidx.compose.ui.input.nestedscroll.f r12 = r7.f40077a
            if (r12 == 0) goto L7f
            boolean r3 = r12.f42893o
            if (r3 == 0) goto L7f
            androidx.compose.ui.node.TraversableNode r12 = androidx.compose.ui.node.Z0.a(r12)
            r1 = r12
            androidx.compose.ui.input.nestedscroll.f r1 = (androidx.compose.ui.input.nestedscroll.f) r1
        L7f:
            if (r1 == 0) goto L91
            r6.f40084s = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.U0(r2, r4, r6)
            if (r12 != r0) goto L8c
            return r0
        L8c:
            androidx.compose.ui.unit.B r12 = (androidx.compose.ui.unit.B) r12
            long r4 = r12.f42837a
            goto L96
        L91:
            androidx.compose.ui.unit.B$a r8 = androidx.compose.ui.unit.B.f42836b
            r8.getClass()
        L96:
            androidx.compose.ui.unit.B r8 = androidx.compose.ui.unit.B.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.b.a(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final long b(int i12, long j12, long j13) {
        f fVar = this.f40077a;
        f fVar2 = null;
        if (fVar != null && fVar.f42893o) {
            fVar2 = (f) Z0.a(fVar);
        }
        f fVar3 = fVar2;
        if (fVar3 != null) {
            return fVar3.h1(i12, j12, j13);
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.input.nestedscroll.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.input.nestedscroll.d r0 = (androidx.compose.ui.input.nestedscroll.d) r0
            int r1 = r0.f40087s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40087s = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.d r0 = new androidx.compose.ui.input.nestedscroll.d
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f40085q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f40087s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L4f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.C42729a0.b(r8)
            androidx.compose.ui.input.nestedscroll.f r8 = r5.f40077a
            r2 = 0
            if (r8 == 0) goto L44
            boolean r4 = r8.f42893o
            if (r4 == 0) goto L44
            androidx.compose.ui.node.TraversableNode r8 = androidx.compose.ui.node.Z0.a(r8)
            r2 = r8
            androidx.compose.ui.input.nestedscroll.f r2 = (androidx.compose.ui.input.nestedscroll.f) r2
        L44:
            if (r2 == 0) goto L54
            r0.f40087s = r3
            java.lang.Object r8 = r2.k0(r6, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.unit.B r8 = (androidx.compose.ui.unit.B) r8
            long r6 = r8.f42837a
            goto L5b
        L54:
            androidx.compose.ui.unit.B$a r6 = androidx.compose.ui.unit.B.f42836b
            r6.getClass()
            r6 = 0
        L5b:
            androidx.compose.ui.unit.B r6 = androidx.compose.ui.unit.B.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.b.c(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @k
    public final T d() {
        T t12 = (T) this.f40079c.invoke();
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
