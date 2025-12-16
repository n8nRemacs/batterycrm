package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20273d1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/t1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/t1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", i = {}, l = {1024}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class M1 extends SuspendLambda implements Y41.p<InterfaceC20506t1, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27357q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27358r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20433a2 f27359s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f27360t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l0.e f27361u;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Float, Float, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.e f27362l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C20433a2 f27363m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20506t1 f27364n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.e eVar, C20433a2 c20433a2, InterfaceC20506t1 interfaceC20506t1) {
            super(2);
            this.f27362l = eVar;
            this.f27363m = c20433a2;
            this.f27364n = interfaceC20506t1;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(Float f12, Float f13) {
            float fFloatValue = f12.floatValue();
            f13.floatValue();
            l0.e eVar = this.f27362l;
            float f14 = fFloatValue - eVar.f406839b;
            C20433a2 c20433a2 = this.f27363m;
            long jH2 = c20433a2.h(c20433a2.d(f14));
            androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
            eVar.f406839b += c20433a2.d(c20433a2.g(this.f27364n.b(androidx.compose.ui.input.nestedscroll.i.f40106c, jH2)));
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(C20433a2 c20433a2, long j12, l0.e eVar, Continuation<? super M1> continuation) {
        super(2, continuation);
        this.f27359s = c20433a2;
        this.f27360t = j12;
        this.f27361u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        M1 m12 = new M1(this.f27359s, this.f27360t, this.f27361u, continuation);
        m12.f27358r = obj;
        return m12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC20506t1 interfaceC20506t1, Continuation<? super kotlin.G0> continuation) {
        return ((M1) create(interfaceC20506t1, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27357q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC20506t1 interfaceC20506t1 = (InterfaceC20506t1) this.f27358r;
            C20433a2 c20433a2 = this.f27359s;
            float fG2 = c20433a2.g(this.f27360t);
            a aVar = new a(this.f27361u, c20433a2, interfaceC20506t1);
            this.f27357q = 1;
            if (C20273d1.c(0.0f, fG2, null, aVar, this, 12) == coroutine_suspended) {
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
