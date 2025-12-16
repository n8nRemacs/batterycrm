package androidx.compose.material3;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/vh;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/K;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21934vh extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public androidx.compose.runtime.I3<? extends List<Jh>> f37567p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37568q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public C20268c<androidx.compose.ui.unit.h, C20318t> f37569r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public C20268c<androidx.compose.ui.unit.h, C20318t> f37570s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.h f37571t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.h f37572u;

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.vh$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f37573l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.vh$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f37574q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20268c<androidx.compose.ui.unit.h, C20318t> f37575r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f37576s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20268c<androidx.compose.ui.unit.h, C20318t> c20268c, float f12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f37575r = c20268c;
            this.f37576s = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f37575r, this.f37576s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f37574q;
            if (i12 == 0) {
                C42729a0.b(obj);
                androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(this.f37576s);
                this.f37574q = 1;
                if (C20268c.c(this.f37575r, hVarA, null, null, null, this, 14) == coroutine_suspended) {
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

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", f = "TabRow.kt", i = {}, l = {552}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.vh$c */
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f37577q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20268c<androidx.compose.ui.unit.h, C20318t> f37578r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f37579s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C20268c<androidx.compose.ui.unit.h, C20318t> c20268c, float f12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f37578r = c20268c;
            this.f37579s = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f37578r, this.f37579s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f37577q;
            if (i12 == 0) {
                C42729a0.b(obj);
                androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(this.f37579s);
                this.f37577q = 1;
                if (C20268c.c(this.f37578r, hVarA, null, null, null, this, 14) == coroutine_suspended) {
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

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.vh$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37580l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f37581m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f37582n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f37583o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.layout.K0 k02, InterfaceC22369k0 interfaceC22369k0, float f12, long j12) {
            super(1);
            this.f37580l = k02;
            this.f37581m = interfaceC22369k0;
            this.f37582n = f12;
            this.f37583o = j12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            int iY02 = this.f37581m.y0(this.f37582n);
            int i12 = C22712b.i(this.f37583o);
            androidx.compose.ui.layout.K0 k02 = this.f37580l;
            aVar.e(k02, iY02, i12 - k02.f40346c, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public C21934vh() {
        throw null;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        InterfaceC22363h0 interfaceC22363h02;
        long jC2;
        if (((List) ((C22082i3) this.f37567p).getF42167b()).isEmpty()) {
            return interfaceC22369k0.L0(0, 0, kotlin.collections.P0.c(), a.f37573l);
        }
        float f12 = ((Jh) ((List) ((C22082i3) this.f37567p).getF42167b()).get(0)).f34966c;
        if (this.f37568q) {
            androidx.compose.ui.unit.h hVar = this.f37572u;
            if (hVar != null) {
                C20268c<androidx.compose.ui.unit.h, C20318t> c20268c = this.f37570s;
                if (c20268c == null) {
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                    c20268c = new C20268c<>(hVar, androidx.compose.animation.core.J1.f26077c, null, null, 12, null);
                    this.f37570s = c20268c;
                }
                if (!androidx.compose.ui.unit.h.b(f12, ((androidx.compose.ui.unit.h) ((C22082i3) c20268c.f26227f).getF42167b()).f42852b)) {
                    C43259k.d(Y1(), null, null, new b(c20268c, f12, null), 3);
                }
            } else {
                this.f37572u = androidx.compose.ui.unit.h.a(f12);
            }
        }
        float f13 = ((Jh) ((List) ((C22082i3) this.f37567p).getF42167b()).get(0)).f34964a;
        androidx.compose.ui.unit.h hVar2 = this.f37571t;
        if (hVar2 != null) {
            C20268c<androidx.compose.ui.unit.h, C20318t> c20268c2 = this.f37569r;
            if (c20268c2 == null) {
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                c20268c2 = new C20268c<>(hVar2, androidx.compose.animation.core.J1.f26077c, null, null, 12, null);
                this.f37569r = c20268c2;
            }
            if (!androidx.compose.ui.unit.h.b(f13, ((androidx.compose.ui.unit.h) ((C22082i3) c20268c2.f26227f).getF42167b()).f42852b)) {
                C43259k.d(Y1(), null, null, new c(c20268c2, f13, null), 3);
            }
        } else {
            this.f37571t = androidx.compose.ui.unit.h.a(f13);
        }
        C20268c<androidx.compose.ui.unit.h, C20318t> c20268c3 = this.f37569r;
        if (c20268c3 != null) {
            f13 = c20268c3.f().f42852b;
        }
        float f14 = f13;
        if (this.f37568q) {
            C20268c<androidx.compose.ui.unit.h, C20318t> c20268c4 = this.f37570s;
            if (c20268c4 != null) {
                f12 = c20268c4.f().f42852b;
            }
            jC2 = C22712b.c(j12, interfaceC22369k0.y0(f12), interfaceC22369k0.y0(f12), 0, 0, 12);
            interfaceC22363h02 = interfaceC22363h0;
        } else {
            interfaceC22363h02 = interfaceC22363h0;
            jC2 = j12;
        }
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h02.I(jC2);
        return interfaceC22369k0.L0(k0I.f40345b, C22712b.i(j12), kotlin.collections.P0.c(), new d(k0I, interfaceC22369k0, f14, j12));
    }
}
