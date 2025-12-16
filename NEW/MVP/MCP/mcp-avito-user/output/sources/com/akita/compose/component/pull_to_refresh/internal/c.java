package com.akita.compose.component.pull_to_refresh.internal;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.Q1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.input.nestedscroll.i;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22421l;
import com.akita.compose.component.pull_to_refresh.j;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import l0.g;

/* compiled from: PullToRefreshElement.kt */
@P
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/akita/compose/component/pull_to_refresh/internal/c;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/input/nestedscroll/a;", "Lkotlin/Function0;", "Lkotlin/G0;", "onRefresh", "", "enabled", "Lcom/akita/compose/component/pull_to_refresh/j;", VoiceInfo.STATE, "Landroidx/compose/ui/unit/h;", "threshold", "isRefreshing", "<init>", "(LY41/a;ZLcom/akita/compose/component/pull_to_refresh/j;FZLkotlin/jvm/internal/w;)V", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends AbstractC22425n implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: r, reason: collision with root package name */
    @k
    public Y41.a<G0> f62448r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f62449s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public j f62450t;

    /* renamed from: u, reason: collision with root package name */
    public float f62451u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f62452v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final androidx.compose.ui.input.nestedscroll.f f62453w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final InterfaceC22192v1 f62454x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final InterfaceC22192v1 f62455y;

    /* compiled from: PullToRefreshElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.pull_to_refresh.internal.PullToRefreshModifierNode$onAttach$1", f = "PullToRefreshElement.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM, 103}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f62456q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f62456q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = c.this;
                if (cVar.f62452v) {
                    j jVar = cVar.f62450t;
                    this.f62456q = 1;
                    if (jVar.b(1.0f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    j jVar2 = cVar.f62450t;
                    this.f62456q = 2;
                    if (jVar2.b(0.0f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PullToRefreshElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.pull_to_refresh.internal.PullToRefreshModifierNode$onPostScroll$1", f = "PullToRefreshElement.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f62458q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f62458q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = c.this;
                if (!cVar.f62450t.f62474a.g()) {
                    j jVar = cVar.f62450t;
                    float f12 = ((C22040c3) cVar.f62454x).f() / cVar.p2();
                    this.f62458q = 1;
                    if (jVar.b(f12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: PullToRefreshElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.akita.compose.component.pull_to_refresh.internal.PullToRefreshModifierNode", f = "PullToRefreshElement.kt", i = {}, l = {155}, m = "onPreFling-QWom1Mo", n = {}, s = {})
    /* renamed from: com.akita.compose.component.pull_to_refresh.internal.c$c, reason: collision with other inner class name */
    public static final class C2095c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f62460q;

        /* renamed from: s, reason: collision with root package name */
        public int f62462s;

        public C2095c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f62460q = obj;
            this.f62462s |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.k0(0L, this);
        }
    }

    public c() {
        throw null;
    }

    public c(Y41.a aVar, boolean z12, j jVar, float f12, boolean z13, C42822w c42822w) {
        this.f62448r = aVar;
        this.f62449s = z12;
        this.f62450t = jVar;
        this.f62451u = f12;
        this.f62452v = z13;
        this.f62453w = new androidx.compose.ui.input.nestedscroll.f(this, null);
        this.f62454x = Q1.a(0.0f);
        this.f62455y = Q1.a(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n2(com.akita.compose.component.pull_to_refresh.internal.c r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.akita.compose.component.pull_to_refresh.internal.e
            if (r0 == 0) goto L17
            r0 = r9
            com.akita.compose.component.pull_to_refresh.internal.e r0 = (com.akita.compose.component.pull_to_refresh.internal.e) r0
            int r1 = r0.f62471t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f62471t = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            com.akita.compose.component.pull_to_refresh.internal.e r0 = new com.akita.compose.component.pull_to_refresh.internal.e
            r0.<init>(r8, r9)
            goto L15
        L1d:
            java.lang.Object r9 = r6.f62469r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f62471t
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            com.akita.compose.component.pull_to_refresh.internal.c r8 = r6.f62468q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L30
            goto L63
        L30:
            r9 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.C42729a0.b(r9)
            com.akita.compose.component.pull_to_refresh.j r9 = r8.f62450t     // Catch: java.lang.Throwable -> L30
            r6.f62468q = r8     // Catch: java.lang.Throwable -> L30
            r6.f62471t = r2     // Catch: java.lang.Throwable -> L30
            r9.getClass()     // Catch: java.lang.Throwable -> L30
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)     // Catch: java.lang.Throwable -> L30
            androidx.compose.animation.core.c<java.lang.Float, androidx.compose.animation.core.t> r1 = r9.f62474a     // Catch: java.lang.Throwable -> L30
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            java.lang.Object r9 = androidx.compose.animation.core.C20268c.c(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto L5e
            goto L60
        L5e:
            kotlin.G0 r9 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L30
        L60:
            if (r9 != r0) goto L63
            goto L7d
        L63:
            boolean r9 = r8.f42893o
            if (r9 == 0) goto L7b
            int r9 = r8.p2()
            float r9 = (float) r9
            r8.s2(r9)
            int r9 = r8.p2()
            float r9 = (float) r9
            androidx.compose.runtime.v1 r8 = r8.f62454x
            androidx.compose.runtime.c3 r8 = (androidx.compose.runtime.C22040c3) r8
            r8.S6(r9)
        L7b:
            kotlin.G0 r0 = kotlin.G0.f406611a
        L7d:
            return r0
        L7e:
            boolean r0 = r8.f42893o
            if (r0 == 0) goto L96
            int r0 = r8.p2()
            float r0 = (float) r0
            r8.s2(r0)
            int r0 = r8.p2()
            float r0 = (float) r0
            androidx.compose.runtime.v1 r8 = r8.f62454x
            androidx.compose.runtime.c3 r8 = (androidx.compose.runtime.C22040c3) r8
            r8.S6(r0)
        L96:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.pull_to_refresh.internal.c.n2(com.akita.compose.component.pull_to_refresh.internal.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        if (this.f62450t.f62474a.g()) {
            g.f413384b.getClass();
            return 0L;
        }
        if (this.f62452v) {
            g.f413384b.getClass();
            return 0L;
        }
        if (!this.f62449s) {
            g.f413384b.getClass();
            return 0L;
        }
        i.f40105b.getClass();
        if (i.a(i12, i.f40106c) && Float.intBitsToFloat((int) (4294967295L & j12)) < 0.0f) {
            return o2(j12);
        }
        g.f413384b.getClass();
        return 0L;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        k2(this.f62453w);
        C43259k.d(Y1(), null, null, new a(null), 3);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        if (this.f62450t.f62474a.g()) {
            g.f413384b.getClass();
            return 0L;
        }
        if (this.f62452v) {
            g.f413384b.getClass();
            return 0L;
        }
        if (!this.f62449s) {
            g.f413384b.getClass();
            return 0L;
        }
        i.f40105b.getClass();
        if (!i.a(i12, i.f40106c)) {
            g.f413384b.getClass();
            return 0L;
        }
        long jO2 = o2(j13);
        C43259k.d(Y1(), null, null, new b(null), 3);
        return jO2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(long r5, @Y61.k kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.akita.compose.component.pull_to_refresh.internal.c.C2095c
            if (r0 == 0) goto L13
            r0 = r7
            com.akita.compose.component.pull_to_refresh.internal.c$c r0 = (com.akita.compose.component.pull_to_refresh.internal.c.C2095c) r0
            int r1 = r0.f62462s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62462s = r1
            goto L1a
        L13:
            com.akita.compose.component.pull_to_refresh.internal.c$c r0 = new com.akita.compose.component.pull_to_refresh.internal.c$c
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f62460q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62462s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r7)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            float r5 = androidx.compose.ui.unit.B.d(r5)
            r0.f62462s = r3
            java.lang.Object r7 = r4.r2(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = androidx.compose.ui.unit.C.a(r6, r5)
            androidx.compose.ui.unit.B r5 = androidx.compose.ui.unit.B.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.pull_to_refresh.internal.c.k0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long o2(long j12) {
        float f12;
        float fP2;
        if (this.f62452v) {
            f12 = 0.0f;
        } else {
            InterfaceC22192v1 interfaceC22192v1 = this.f62455y;
            C22040c3 c22040c3 = (C22040c3) interfaceC22192v1;
            float fA2 = s.a(Float.intBitsToFloat((int) (j12 & 4294967295L)) + c22040c3.f(), 0.0f);
            f12 = fA2 - c22040c3.f();
            s2(fA2);
            if (((C22040c3) interfaceC22192v1).f() * 0.5f <= p2()) {
                fP2 = ((C22040c3) interfaceC22192v1).f() * 0.5f;
            } else {
                float f13 = s.f(Math.abs((((C22040c3) interfaceC22192v1).f() * 0.5f) / p2()) - 1.0f, 0.0f, 2.0f);
                fP2 = p2() + (p2() * (f13 - (((float) Math.pow(f13, 2)) / 4)));
            }
            ((C22040c3) this.f62454x).S6(fP2);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    public final int p2() {
        return C22421l.g(this).f40608B.y0(this.f62451u);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q2(kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.akita.compose.component.pull_to_refresh.internal.b
            if (r0 == 0) goto L14
            r0 = r10
            com.akita.compose.component.pull_to_refresh.internal.b r0 = (com.akita.compose.component.pull_to_refresh.internal.b) r0
            int r1 = r0.f62447t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f62447t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.akita.compose.component.pull_to_refresh.internal.b r0 = new com.akita.compose.component.pull_to_refresh.internal.b
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f62445r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f62447t
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            com.akita.compose.component.pull_to_refresh.internal.c r0 = r6.f62444q
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L60
        L2e:
            r10 = move-exception
            goto L71
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            kotlin.C42729a0.b(r10)
            com.akita.compose.component.pull_to_refresh.j r10 = r9.f62450t     // Catch: java.lang.Throwable -> L6f
            r6.f62444q = r9     // Catch: java.lang.Throwable -> L6f
            r6.f62447t = r2     // Catch: java.lang.Throwable -> L6f
            r10.getClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)     // Catch: java.lang.Throwable -> L6f
            androidx.compose.animation.core.c<java.lang.Float, androidx.compose.animation.core.t> r1 = r10.f62474a     // Catch: java.lang.Throwable -> L6f
            r4 = 0
            r5 = 0
            r7 = 14
            r3 = 0
            java.lang.Object r10 = androidx.compose.animation.core.C20268c.c(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L6f
            if (r10 != r1) goto L5a
            goto L5c
        L5a:
            kotlin.G0 r10 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L6f
        L5c:
            if (r10 != r0) goto L5f
            return r0
        L5f:
            r0 = r9
        L60:
            r0.s2(r8)
            androidx.compose.runtime.v1 r10 = r0.f62454x
            androidx.compose.runtime.c3 r10 = (androidx.compose.runtime.C22040c3) r10
            r10.S6(r8)
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        L6d:
            r0 = r9
            goto L71
        L6f:
            r10 = move-exception
            goto L6d
        L71:
            r0.s2(r8)
            androidx.compose.runtime.v1 r0 = r0.f62454x
            androidx.compose.runtime.c3 r0 = (androidx.compose.runtime.C22040c3) r0
            r0.S6(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.pull_to_refresh.internal.c.q2(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r2(float r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.akita.compose.component.pull_to_refresh.internal.d
            if (r0 == 0) goto L13
            r0 = r8
            com.akita.compose.component.pull_to_refresh.internal.d r0 = (com.akita.compose.component.pull_to_refresh.internal.d) r0
            int r1 = r0.f62467u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62467u = r1
            goto L18
        L13:
            com.akita.compose.component.pull_to_refresh.internal.d r0 = new com.akita.compose.component.pull_to_refresh.internal.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f62465s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f62467u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            float r7 = r0.f62464r
            com.akita.compose.component.pull_to_refresh.internal.c r0 = r0.f62463q
            kotlin.C42729a0.b(r8)
            goto L7b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.C42729a0.b(r8)
            boolean r8 = r6.f62452v
            if (r8 == 0) goto L42
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r4)
            return r7
        L42:
            androidx.compose.runtime.v1 r8 = r6.f62455y
            r2 = r8
            androidx.compose.runtime.c3 r2 = (androidx.compose.runtime.C22040c3) r2
            float r2 = r2.f()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r5
            int r5 = r6.p2()
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L5c
            Y41.a<kotlin.G0> r2 = r6.f62448r
            r2.invoke()
        L5c:
            androidx.compose.runtime.c3 r8 = (androidx.compose.runtime.C22040c3) r8
            float r8 = r8.f()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L68
        L66:
            r7 = r4
            goto L6d
        L68:
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 >= 0) goto L6d
            goto L66
        L6d:
            r0.f62463q = r6
            r0.f62464r = r7
            r0.f62467u = r3
            java.lang.Object r8 = r6.q2(r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            r0 = r6
        L7b:
            r0.s2(r4)
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.pull_to_refresh.internal.c.r2(float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void s2(float f12) {
        ((C22040c3) this.f62455y).S6(f12);
    }
}
