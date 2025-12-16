package androidx.compose.material;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21301p8 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.f<Float> f33884A;

    /* renamed from: q, reason: collision with root package name */
    public int f33885q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f33886r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f33887s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f33888t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f33889u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f33890v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f33891w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f33892x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l0.e f33893y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ l0.e f33894z;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/c;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.p8$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C20268c<Float, C20318t>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f33895l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f33896m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f33897n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f33898o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ l0.e f33899p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ l0.e f33900q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ kotlin.ranges.f<Float> f33901r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, InterfaceC22204y1 interfaceC22204y1, l0.e eVar, l0.e eVar2, kotlin.ranges.f fVar) {
            super(1);
            this.f33895l = z12;
            this.f33896m = interfaceC22192v1;
            this.f33897n = interfaceC22192v12;
            this.f33898o = interfaceC22204y1;
            this.f33899p = eVar;
            this.f33900q = eVar2;
            this.f33901r = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final kotlin.G0 invoke(C20268c<Float, C20318t> c20268c) {
            C20268c<Float, C20318t> c20268c2 = c20268c;
            boolean z12 = this.f33895l;
            InterfaceC22192v1 interfaceC22192v1 = this.f33897n;
            InterfaceC22192v1 interfaceC22192v12 = this.f33896m;
            (z12 ? interfaceC22192v12 : interfaceC22192v1).S6(c20268c2.f().floatValue());
            Y41.l lVar = (Y41.l) this.f33898o.getF42167b();
            kotlin.ranges.f fVarM = kotlin.ranges.s.m(interfaceC22192v12.f(), interfaceC22192v1.f());
            l0.e eVar = this.f33900q;
            float f12 = this.f33899p.f406839b;
            float f13 = eVar.f406839b;
            kotlin.ranges.f<Float> fVar = this.f33901r;
            float fFloatValue = fVar.d().floatValue();
            float fFloatValue2 = fVar.g().floatValue();
            float f14 = I8.f32762a;
            lVar.invoke(kotlin.ranges.s.m(I8.e(f12, f13, ((Number) fVarM.d()).floatValue(), fFloatValue, fFloatValue2), I8.e(f12, f13, ((Number) fVarM.g()).floatValue(), fFloatValue, fFloatValue2)));
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21301p8(float f12, float f13, Y41.a aVar, boolean z12, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, InterfaceC22204y1 interfaceC22204y1, l0.e eVar, l0.e eVar2, kotlin.ranges.f fVar, Continuation continuation) {
        super(2, continuation);
        this.f33886r = f12;
        this.f33887s = f13;
        this.f33888t = aVar;
        this.f33889u = z12;
        this.f33890v = interfaceC22192v1;
        this.f33891w = interfaceC22192v12;
        this.f33892x = interfaceC22204y1;
        this.f33893y = eVar;
        this.f33894z = eVar2;
        this.f33884A = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        l0.e eVar = this.f33894z;
        return new C21301p8(this.f33886r, this.f33887s, this.f33888t, this.f33889u, this.f33890v, this.f33891w, this.f33892x, this.f33893y, eVar, this.f33884A, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21301p8) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33885q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C20268c c20268cA = C20274e.a(this.f33886r);
            Float fBoxFloat = Boxing.boxFloat(this.f33887s);
            androidx.compose.animation.core.G1<Float> g12 = I8.f32768g;
            Float fBoxFloat2 = Boxing.boxFloat(0.0f);
            l0.e eVar = this.f33894z;
            a aVar = new a(this.f33889u, this.f33890v, this.f33891w, this.f33892x, this.f33893y, eVar, this.f33884A);
            this.f33885q = 1;
            if (c20268cA.b(fBoxFloat, g12, fBoxFloat2, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        Y41.a<kotlin.G0> aVar2 = this.f33888t;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return kotlin.G0.f406611a;
    }
}
