package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20273d1;
import androidx.compose.animation.core.C20304o;
import androidx.compose.animation.core.C20315s;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.runtime.C22040c3;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: AnchoredDraggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/a;", "Landroidx/compose/foundation/gestures/T0;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "latestTarget", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", i = {}, l = {1391, 1409, 1433}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.gestures.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20470k extends SuspendLambda implements Y41.r<InterfaceC20430a, T0<Object>, Object, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27790q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC20430a f27791r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ T0 f27792s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27793t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C20501s<Object> f27794u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f27795v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20307p<Float> f27796w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l0.e f27797x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.H<Float> f27798y;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/o;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.gestures.k$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C20304o<Float, C20318t>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f27799l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.e f27800m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20430a f27801n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ l0.e f27802o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, l0.e eVar, InterfaceC20430a interfaceC20430a, l0.e eVar2) {
            super(1);
            this.f27799l = f12;
            this.f27800m = eVar;
            this.f27801n = interfaceC20430a;
            this.f27802o = eVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.animation.core.C20304o<java.lang.Float, androidx.compose.animation.core.C20318t> r8) {
            /*
                r7 = this;
                androidx.compose.animation.core.o r8 = (androidx.compose.animation.core.C20304o) r8
                androidx.compose.runtime.y1 r0 = r8.f26389e
                androidx.compose.runtime.i3 r0 = (androidx.compose.runtime.C22082i3) r0
                java.lang.Object r0 = r0.getF42167b()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r1 = r7.f27799l
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                androidx.compose.runtime.y1 r2 = r8.f26389e
                kotlin.jvm.internal.l0$e r3 = r7.f27802o
                androidx.compose.foundation.gestures.a r4 = r7.f27801n
                kotlin.jvm.internal.l0$e r5 = r7.f27800m
                if (r0 >= 0) goto L24
                float r0 = r5.f406839b
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L3b
            L24:
                r0 = r2
                androidx.compose.runtime.i3 r0 = (androidx.compose.runtime.C22082i3) r0
                java.lang.Object r6 = r0.getF42167b()
                java.lang.Number r6 = (java.lang.Number) r6
                float r6 = r6.floatValue()
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 <= 0) goto L8d
                float r6 = r5.f406839b
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L8d
            L3b:
                androidx.compose.runtime.i3 r2 = (androidx.compose.runtime.C22082i3) r2
                java.lang.Object r0 = r2.getF42167b()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                Y41.l<androidx.compose.ui.input.pointer.C, java.lang.Boolean> r2 = androidx.compose.foundation.gestures.C20438c.f27581a
                r2 = 0
                int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r6 != 0) goto L50
                r0 = r2
                goto L5d
            L50:
                int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r6 <= 0) goto L59
                float r0 = kotlin.ranges.s.c(r0, r1)
                goto L5d
            L59:
                float r0 = kotlin.ranges.s.a(r0, r1)
            L5d:
                java.lang.Object r1 = r8.b()
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                r4.a(r0, r1)
                java.lang.Object r1 = r8.b()
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                boolean r1 = java.lang.Float.isNaN(r1)
                if (r1 == 0) goto L7b
                goto L85
            L7b:
                java.lang.Object r1 = r8.b()
                java.lang.Number r1 = (java.lang.Number) r1
                float r2 = r1.floatValue()
            L85:
                r3.f406839b = r2
                r5.f406839b = r0
                r8.a()
                goto Lbc
            L8d:
                java.lang.Object r1 = r0.getF42167b()
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                java.lang.Object r2 = r8.b()
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                r4.a(r1, r2)
                java.lang.Object r8 = r8.b()
                java.lang.Number r8 = (java.lang.Number) r8
                float r8 = r8.floatValue()
                r3.f406839b = r8
                java.lang.Object r8 = r0.getF42167b()
                java.lang.Number r8 = (java.lang.Number) r8
                float r8 = r8.floatValue()
                r5.f406839b = r8
            Lbc:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20470k.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20470k(C20501s<Object> c20501s, float f12, InterfaceC20307p<Float> interfaceC20307p, l0.e eVar, androidx.compose.animation.core.H<Float> h12, Continuation<? super C20470k> continuation) {
        super(4, continuation);
        this.f27794u = c20501s;
        this.f27795v = f12;
        this.f27796w = interfaceC20307p;
        this.f27797x = eVar;
        this.f27798y = h12;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC20430a interfaceC20430a, T0<Object> t02, Object obj, Continuation<? super kotlin.G0> continuation) {
        l0.e eVar = this.f27797x;
        androidx.compose.animation.core.H<Float> h12 = this.f27798y;
        C20470k c20470k = new C20470k(this.f27794u, this.f27795v, this.f27796w, eVar, h12, continuation);
        c20470k.f27791r = interfaceC20430a;
        c20470k.f27792s = t02;
        c20470k.f27793t = obj;
        return c20470k.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27790q;
        l0.e eVar = this.f27797x;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC20430a interfaceC20430a = this.f27791r;
            T0 t02 = this.f27792s;
            Object obj2 = this.f27793t;
            float fC2 = t02.c(obj2);
            if (!Float.isNaN(fC2)) {
                l0.e eVar2 = new l0.e();
                C20501s<Object> c20501s = this.f27794u;
                float f12 = Float.isNaN(((C22040c3) c20501s.f27971j).f()) ? 0.0f : ((C22040c3) c20501s.f27971j).f();
                eVar2.f406839b = f12;
                if (f12 != fC2) {
                    float f13 = this.f27795v;
                    if ((fC2 - f12) * f13 < 0.0f || f13 == 0.0f) {
                        this.f27791r = null;
                        this.f27792s = null;
                        this.f27790q = 1;
                        if (C20438c.b(this.f27794u, f13, interfaceC20430a, t02, obj2, this.f27796w, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        eVar.f406839b = 0.0f;
                    } else {
                        androidx.compose.animation.core.H<Float> h12 = this.f27798y;
                        float fA2 = androidx.compose.animation.core.J.a(h12, f12, f13);
                        float f14 = this.f27795v;
                        if (f14 <= 0.0f ? fA2 > fC2 : fA2 < fC2) {
                            this.f27791r = null;
                            this.f27792s = null;
                            this.f27790q = 3;
                            if (C20438c.b(this.f27794u, f14, interfaceC20430a, t02, obj2, this.f27796w, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eVar.f406839b = 0.0f;
                        } else {
                            androidx.compose.animation.core.r rVarA = C20315s.a(eVar2.f406839b, f14, 28);
                            a aVar = new a(fC2, eVar2, interfaceC20430a, eVar);
                            this.f27791r = null;
                            this.f27792s = null;
                            this.f27790q = 2;
                            if (C20273d1.e(rVarA, h12, false, aVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                }
            }
        } else if (i12 == 1) {
            C42729a0.b(obj);
            eVar.f406839b = 0.0f;
        } else if (i12 == 2) {
            C42729a0.b(obj);
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            eVar.f406839b = 0.0f;
        }
        return kotlin.G0.f406611a;
    }
}
