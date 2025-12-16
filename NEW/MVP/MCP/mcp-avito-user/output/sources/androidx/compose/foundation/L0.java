package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.gestures.InterfaceC20509u1;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.platform.InterfaceC22544x2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import p0.InterfaceC44967a;
import p0.b;

/* compiled from: Clickable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/L0;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/foundation/a;", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "", "hapticFeedbackEnabled", "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "enabled", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "<init>", "(LY41/a;Ljava/lang/String;LY41/a;LY41/a;ZLandroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class L0 extends AbstractC20407a implements InterfaceC22415i {

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public String f26754I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public Y41.a<kotlin.G0> f26755J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public Y41.a<kotlin.G0> f26756K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f26757L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.H0<kotlinx.coroutines.N0> f26758M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.H0<a> f26759N;

    /* compiled from: Clickable.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/L0$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.N0 f26760a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f26761b;

        public a(@Y61.k kotlinx.coroutines.N0 n02) {
            this.f26760a = n02;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Y41.a<kotlin.G0> aVar = L0.this.f26755J;
            if (aVar != null) {
                aVar.invoke();
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            Y41.a<kotlin.G0> aVar = L0.this.f26756K;
            if (aVar != null) {
                aVar.invoke();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            L0 l02 = L0.this;
            Y41.a<kotlin.G0> aVar = l02.f26755J;
            if (aVar != null) {
                aVar.invoke();
            }
            if (l02.f26757L) {
                InterfaceC44967a interfaceC44967a = (InterfaceC44967a) C22417j.a(l02, androidx.compose.ui.platform.Q0.f41203l);
                p0.b.f422385b.getClass();
                b.a.a();
                interfaceC44967a.a(0);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "offset", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", f = "Clickable.kt", i = {}, l = {770}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f26765q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC20509u1 f26766r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ long f26767s;

        public e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super kotlin.G0> continuation) {
            long j12 = gVar.f413387a;
            e eVar = L0.this.new e(continuation);
            eVar.f26766r = interfaceC20509u1;
            eVar.f26767s = j12;
            return eVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f26765q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC20509u1 interfaceC20509u1 = this.f26766r;
                long j12 = this.f26767s;
                L0 l02 = L0.this;
                if (l02.f26919v) {
                    this.f26765q = 1;
                    androidx.compose.foundation.interaction.m mVar = l02.f26915r;
                    if (mVar == null || (objC = kotlinx.coroutines.U.c(new C20421e(interfaceC20509u1, j12, mVar, l02, null), this)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objC = kotlin.G0.f406611a;
                    }
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            L0 l02 = L0.this;
            if (l02.f26919v) {
                l02.f26920w.invoke();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", i = {}, l = {852}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f26770q;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return L0.this.new g(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f26770q;
            L0 l02 = L0.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                long jC2 = ((InterfaceC22544x2) C22417j.a(l02, androidx.compose.ui.platform.Q0.f41210s)).c();
                this.f26770q = 1;
                if (C43131e0.b(jC2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            Y41.a<kotlin.G0> aVar = l02.f26755J;
            if (aVar != null) {
                aVar.invoke();
            }
            return kotlin.G0.f406611a;
        }
    }

    public L0() {
        throw null;
    }

    public L0(Y41.a aVar, String str, Y41.a aVar2, Y41.a aVar3, boolean z12, androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z13, String str2, androidx.compose.ui.semantics.i iVar, C42822w c42822w) {
        super(mVar, interfaceC21084v1, z13, str2, iVar, aVar, null);
        this.f26754I = str;
        this.f26755J = aVar2;
        this.f26756K = aVar3;
        this.f26757L = z12;
        this.f26758M = androidx.collection.Z.a();
        this.f26759N = androidx.collection.Z.a();
    }

    @Override // androidx.compose.ui.v.d
    public final void e2() {
        v2();
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    public final void n2(@Y61.k androidx.compose.ui.semantics.F f12) {
        if (this.f26755J != null) {
            androidx.compose.ui.semantics.C.i(f12, this.f26754I, new b());
        }
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    @Y61.l
    public final Object o2(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objF = C20445d2.f((!this.f26919v || this.f26756K == null) ? null : new c(), (!this.f26919v || this.f26755J == null) ? null : new d(), new f(), new e(null), k12, continuation);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : kotlin.G0.f406611a;
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    public final void r2() {
        v2();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // androidx.compose.foundation.AbstractC20407a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s2(@Y61.k android.view.KeyEvent r8) {
        /*
            r7 = this;
            long r0 = androidx.compose.ui.input.key.e.a(r8)
            Y41.a<kotlin.G0> r8 = r7.f26755J
            r2 = 0
            if (r8 == 0) goto L24
            androidx.collection.H0<kotlinx.coroutines.N0> r8 = r7.f26758M
            java.lang.Object r3 = r8.b(r0)
            if (r3 != 0) goto L24
            kotlinx.coroutines.T r3 = r7.Y1()
            androidx.compose.foundation.L0$g r4 = new androidx.compose.foundation.L0$g
            r4.<init>(r2)
            r5 = 3
            kotlinx.coroutines.N0 r3 = kotlinx.coroutines.C43259k.d(r3, r2, r2, r4, r5)
            r8.h(r0, r3)
            r8 = 1
            goto L25
        L24:
            r8 = 0
        L25:
            androidx.collection.H0<androidx.compose.foundation.L0$a> r3 = r7.f26759N
            java.lang.Object r4 = r3.b(r0)
            androidx.compose.foundation.L0$a r4 = (androidx.compose.foundation.L0.a) r4
            if (r4 == 0) goto L4f
            kotlinx.coroutines.N0 r5 = r4.f26760a
            r6 = r5
            kotlinx.coroutines.a r6 = (kotlinx.coroutines.AbstractC43075a) r6
            boolean r6 = r6.isActive()
            if (r6 == 0) goto L4c
            kotlinx.coroutines.V0 r5 = (kotlinx.coroutines.V0) r5
            r5.c(r2)
            boolean r2 = r4.f26761b
            if (r2 != 0) goto L4f
            Y41.a<kotlin.G0> r2 = r7.f26920w
            r2.invoke()
            r3.g(r0)
            goto L4f
        L4c:
            r3.g(r0)
        L4f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.L0.s2(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    public final void t2(@Y61.k KeyEvent keyEvent) {
        Y41.a<kotlin.G0> aVar;
        long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
        androidx.collection.H0<kotlinx.coroutines.N0> h02 = this.f26758M;
        boolean z12 = false;
        if (h02.b(jA2) != null) {
            kotlinx.coroutines.N0 n0B = h02.b(jA2);
            if (n0B != null) {
                if (n0B.isActive()) {
                    n0B.c(null);
                } else {
                    z12 = true;
                }
            }
            h02.g(jA2);
        }
        if (this.f26756K == null) {
            if (z12) {
                return;
            }
            this.f26920w.invoke();
            return;
        }
        androidx.collection.H0<a> h03 = this.f26759N;
        if (h03.b(jA2) == null) {
            if (z12) {
                return;
            }
            h03.h(jA2, new a(C43259k.d(Y1(), null, null, new M0(this, jA2, null), 3)));
        } else {
            if (!z12 && (aVar = this.f26756K) != null) {
                aVar.invoke();
            }
            h03.g(jA2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v2() {
        /*
            r22 = this;
            r0 = r22
            androidx.collection.H0<kotlinx.coroutines.N0> r1 = r0.f26758M
            java.lang.Object[] r2 = r1.f25654c
            long[] r3 = r1.f25652a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            if (r4 < 0) goto L4b
            r15 = 0
        L16:
            r5 = r3[r15]
            long r8 = ~r5
            long r7 = r8 << r10
            long r7 = r7 & r5
            long r7 = r7 & r11
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = r15 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L29:
            if (r8 >= r7) goto L44
            r18 = 255(0xff, double:1.26E-321)
            long r20 = r5 & r18
            r16 = 128(0x80, double:6.3E-322)
            int r9 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r9 >= 0) goto L40
            int r9 = r15 << 3
            int r9 = r9 + r8
            r9 = r2[r9]
            kotlinx.coroutines.N0 r9 = (kotlinx.coroutines.N0) r9
            r14 = 0
            r9.c(r14)
        L40:
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L29
        L44:
            if (r7 != r13) goto L4b
        L46:
            if (r15 == r4) goto L4b
            int r15 = r15 + 1
            goto L16
        L4b:
            r1.c()
            androidx.collection.H0<androidx.compose.foundation.L0$a> r1 = r0.f26759N
            java.lang.Object[] r2 = r1.f25654c
            long[] r3 = r1.f25652a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto Lae
            r5 = 0
        L5a:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L9e
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = 0
        L6c:
            if (r9 >= r8) goto L96
            r14 = 255(0xff, double:1.26E-321)
            long r18 = r6 & r14
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r18 >= 0) goto L8b
            int r18 = r5 << 3
            int r18 = r18 + r9
            r18 = r2[r18]
            r10 = r18
            androidx.compose.foundation.L0$a r10 = (androidx.compose.foundation.L0.a) r10
            kotlinx.coroutines.N0 r10 = r10.f26760a
            kotlinx.coroutines.V0 r10 = (kotlinx.coroutines.V0) r10
            r11 = 0
            r10.c(r11)
            goto L8c
        L8b:
            r11 = 0
        L8c:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L6c
        L96:
            r11 = 0
            r14 = 255(0xff, double:1.26E-321)
            r16 = 128(0x80, double:6.3E-322)
            if (r8 != r13) goto Lae
            goto La3
        L9e:
            r11 = 0
            r14 = 255(0xff, double:1.26E-321)
            r16 = 128(0x80, double:6.3E-322)
        La3:
            if (r5 == r4) goto Lae
            int r5 = r5 + 1
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L5a
        Lae:
            r1.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.L0.v2():void");
    }
}
