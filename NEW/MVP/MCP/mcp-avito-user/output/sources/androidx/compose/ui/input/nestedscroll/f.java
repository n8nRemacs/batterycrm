package androidx.compose.ui.input.nestedscroll;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.Z0;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.T;

/* compiled from: NestedScrollNode.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/f;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/a;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends v.d implements TraversableNode, androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: p, reason: collision with root package name */
    @k
    public androidx.compose.ui.input.nestedscroll.a f40088p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public androidx.compose.ui.input.nestedscroll.b f40089q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public f f40090r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final String f40091s;

    /* compiled from: NestedScrollNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 0, 1}, l = {103, 113}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public f f40092q;

        /* renamed from: r, reason: collision with root package name */
        public long f40093r;

        /* renamed from: s, reason: collision with root package name */
        public long f40094s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f40095t;

        /* renamed from: v, reason: collision with root package name */
        public int f40097v;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f40095t = obj;
            this.f40097v |= BeduinInputModel.MIN_TEXT_VERSION;
            return f.this.U0(0L, 0L, this);
        }
    }

    /* compiled from: NestedScrollNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {96, 97}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public f f40098q;

        /* renamed from: r, reason: collision with root package name */
        public long f40099r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f40100s;

        /* renamed from: u, reason: collision with root package name */
        public int f40102u;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f40100s = obj;
            this.f40102u |= BeduinInputModel.MIN_TEXT_VERSION;
            return f.this.k0(0L, this);
        }
    }

    /* compiled from: NestedScrollNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/T;", "invoke", "()Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<T> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final T invoke() {
            return f.this.k2();
        }
    }

    public f(@k androidx.compose.ui.input.nestedscroll.a aVar, @l androidx.compose.ui.input.nestedscroll.b bVar) {
        this.f40088p = aVar;
        this.f40089q = bVar == null ? new androidx.compose.ui.input.nestedscroll.b() : bVar;
        this.f40091s = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(long r16, long r18, @Y61.k kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.f.a
            if (r2 == 0) goto L16
            r2 = r1
            androidx.compose.ui.input.nestedscroll.f$a r2 = (androidx.compose.ui.input.nestedscroll.f.a) r2
            int r3 = r2.f40097v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f40097v = r3
            goto L1d
        L16:
            androidx.compose.ui.input.nestedscroll.f$a r2 = new androidx.compose.ui.input.nestedscroll.f$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r1 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r1
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.f40095t
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.f40097v
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L48
            if (r3 == r4) goto L3c
            if (r3 != r10) goto L34
            long r2 = r2.f40093r
            kotlin.C42729a0.b(r1)
            goto L9d
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            long r3 = r2.f40094s
            long r5 = r2.f40093r
            androidx.compose.ui.input.nestedscroll.f r7 = r2.f40092q
            kotlin.C42729a0.b(r1)
            r13 = r3
            r11 = r5
            goto L66
        L48:
            kotlin.C42729a0.b(r1)
            androidx.compose.ui.input.nestedscroll.a r3 = r0.f40088p
            r2.f40092q = r0
            r11 = r16
            r2.f40093r = r11
            r13 = r18
            r2.f40094s = r13
            r2.f40097v = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.U0(r4, r6, r8)
            if (r1 != r9) goto L65
            return r9
        L65:
            r7 = r0
        L66:
            androidx.compose.ui.unit.B r1 = (androidx.compose.ui.unit.B) r1
            long r4 = r1.f42837a
            boolean r1 = androidx.compose.ui.l.f40321b
            if (r1 == 0) goto L7b
            boolean r1 = r7.f42893o
            if (r1 == 0) goto L78
            androidx.compose.ui.input.nestedscroll.f r1 = r7.l2()
        L76:
            r3 = r1
            goto L80
        L78:
            androidx.compose.ui.input.nestedscroll.f r1 = r7.f40090r
            goto L76
        L7b:
            androidx.compose.ui.input.nestedscroll.f r1 = r7.l2()
            goto L76
        L80:
            if (r3 == 0) goto La3
            long r6 = androidx.compose.ui.unit.B.f(r11, r4)
            long r11 = androidx.compose.ui.unit.B.e(r13, r4)
            r1 = 0
            r2.f40092q = r1
            r2.f40093r = r4
            r2.f40097v = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.U0(r4, r6, r8)
            if (r1 != r9) goto L9c
            return r9
        L9c:
            r2 = r13
        L9d:
            androidx.compose.ui.unit.B r1 = (androidx.compose.ui.unit.B) r1
            long r4 = r1.f42837a
            r13 = r2
            goto Lab
        La3:
            r13 = r4
            androidx.compose.ui.unit.B$a r1 = androidx.compose.ui.unit.B.f42836b
            r1.getClass()
            r4 = 0
        Lab:
            long r1 = androidx.compose.ui.unit.B.f(r13, r4)
            androidx.compose.ui.unit.B r1 = androidx.compose.ui.unit.B.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.f.U0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        long jA1;
        f fVarL2 = l2();
        if (fVarL2 != null) {
            jA1 = fVarL2.a1(i12, j12);
        } else {
            l0.g.f413384b.getClass();
            jA1 = 0;
        }
        return l0.g.j(jA1, this.f40088p.a1(i12, l0.g.i(j12, jA1)));
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        m2();
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        if (androidx.compose.ui.l.f40321b) {
            l0.h hVar = new l0.h();
            Z0.b(this, new g(hVar));
            f fVar = (f) ((TraversableNode) hVar.f406842b);
            this.f40090r = fVar;
            this.f40089q.f40078b = fVar;
        }
        androidx.compose.ui.input.nestedscroll.b bVar = this.f40089q;
        if (bVar.f40077a == this) {
            bVar.f40077a = null;
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        long jH1;
        long jH12 = this.f40088p.h1(i12, j12, j13);
        f fVarL2 = l2();
        if (fVarL2 != null) {
            jH1 = fVarL2.h1(i12, l0.g.j(j12, jH12), l0.g.i(j13, jH12));
        } else {
            l0.g.f413384b.getClass();
            jH1 = 0;
        }
        return l0.g.j(jH12, jH1);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(long r9, @Y61.k kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.f.b
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.f$b r0 = (androidx.compose.ui.input.nestedscroll.f.b) r0
            int r1 = r0.f40102u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40102u = r1
            goto L1a
        L13:
            androidx.compose.ui.input.nestedscroll.f$b r0 = new androidx.compose.ui.input.nestedscroll.f$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            r0.<init>(r11)
        L1a:
            java.lang.Object r11 = r0.f40100s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f40102u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            long r9 = r0.f40099r
            kotlin.C42729a0.b(r11)
            goto L7c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            long r9 = r0.f40099r
            androidx.compose.ui.input.nestedscroll.f r2 = r0.f40098q
            kotlin.C42729a0.b(r11)
            goto L57
        L40:
            kotlin.C42729a0.b(r11)
            androidx.compose.ui.input.nestedscroll.f r11 = r8.l2()
            if (r11 == 0) goto L5f
            r0.f40098q = r8
            r0.f40099r = r9
            r0.f40102u = r4
            java.lang.Object r11 = r11.k0(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            androidx.compose.ui.unit.B r11 = (androidx.compose.ui.unit.B) r11
            long r4 = r11.f42837a
        L5b:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L68
        L5f:
            androidx.compose.ui.unit.B$a r11 = androidx.compose.ui.unit.B.f42836b
            r11.getClass()
            r4 = 0
            r2 = r8
            goto L5b
        L68:
            androidx.compose.ui.input.nestedscroll.a r11 = r2.f40088p
            long r4 = androidx.compose.ui.unit.B.e(r4, r9)
            r2 = 0
            r0.f40098q = r2
            r0.f40099r = r9
            r0.f40102u = r3
            java.lang.Object r11 = r11.k0(r4, r0)
            if (r11 != r1) goto L7c
            return r1
        L7c:
            androidx.compose.ui.unit.B r11 = (androidx.compose.ui.unit.B) r11
            long r0 = r11.f42837a
            long r9 = androidx.compose.ui.unit.B.f(r9, r0)
            androidx.compose.ui.unit.B r9 = androidx.compose.ui.unit.B.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.f.k0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final T k2() {
        f fVar = this.f42893o ? (f) Z0.a(this) : null;
        if (fVar != null) {
            return fVar.k2();
        }
        T t12 = this.f40089q.f40080d;
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final f l2() {
        boolean z12 = this.f42893o;
        if (z12 && z12) {
            return (f) Z0.a(this);
        }
        return null;
    }

    public final void m2() {
        androidx.compose.ui.input.nestedscroll.b bVar = this.f40089q;
        bVar.f40077a = this;
        if (androidx.compose.ui.l.f40321b) {
            bVar.f40078b = null;
            this.f40090r = null;
        }
        bVar.f40079c = new c();
        this.f40089q.f40080d = Y1();
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @k
    /* renamed from: o0 */
    public final Object getF39003r() {
        return this.f40091s;
    }
}
