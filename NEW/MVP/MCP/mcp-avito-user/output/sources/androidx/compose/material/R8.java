package androidx.compose.material;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.InterfaceC20509u1;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import com.adjust.sdk.network.ErrorCodes;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {ErrorCodes.SSL_HANDSHAKE_EXCEPTION}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class R8 extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f33122q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f33123r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f33124s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f33125t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f33126u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f33127v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f33128w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.Y0 f33129x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f33130y;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "pos", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", i = {}, l = {1011}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f33131q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC20509u1 f33132r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ long f33133s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f33134t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ float f33135u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f33136v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f33137w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, float f12, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, Continuation continuation) {
            super(3, continuation);
            this.f33134t = z12;
            this.f33135u = f12;
            this.f33136v = interfaceC22192v1;
            this.f33137w = interfaceC22192v12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super kotlin.G0> continuation) {
            long j12 = gVar.f413387a;
            InterfaceC22192v1 interfaceC22192v1 = this.f33136v;
            InterfaceC22192v1 interfaceC22192v12 = this.f33137w;
            a aVar = new a(this.f33134t, this.f33135u, interfaceC22192v1, interfaceC22192v12, continuation);
            aVar.f33132r = interfaceC20509u1;
            aVar.f33133s = j12;
            return aVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f33131q;
            InterfaceC22192v1 interfaceC22192v1 = this.f33136v;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC20509u1 interfaceC20509u1 = this.f33132r;
                    long j12 = this.f33133s;
                    interfaceC22192v1.setValue(Boxing.boxFloat((this.f33134t ? this.f33135u - l0.g.g(j12) : l0.g.g(j12)) - this.f33137w.getF42167b().floatValue()));
                    this.f33131q = 1;
                    if (interfaceC20509u1.k1(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
            } catch (GestureCancellationException unused) {
                interfaceC22192v1.setValue(Boxing.boxFloat(0.0f));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f33138l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.gestures.Y0 f33139m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f33140n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.T t12, androidx.compose.foundation.gestures.Y0 y02, InterfaceC22204y1 interfaceC22204y1) {
            super(1);
            this.f33138l = t12;
            this.f33139m = y02;
            this.f33140n = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            C43259k.d(this.f33138l, null, null, new S8(this.f33139m, this.f33140n, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R8(boolean z12, float f12, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, kotlinx.coroutines.T t12, androidx.compose.foundation.gestures.Y0 y02, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f33124s = z12;
        this.f33125t = f12;
        this.f33126u = interfaceC22192v1;
        this.f33127v = interfaceC22192v12;
        this.f33128w = t12;
        this.f33129x = y02;
        this.f33130y = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        androidx.compose.foundation.gestures.Y0 y02 = this.f33129x;
        InterfaceC22204y1 interfaceC22204y1 = this.f33130y;
        R8 r82 = new R8(this.f33124s, this.f33125t, this.f33126u, this.f33127v, this.f33128w, y02, interfaceC22204y1, continuation);
        r82.f33123r = obj;
        return r82;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((R8) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33122q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.input.pointer.K k12 = (androidx.compose.ui.input.pointer.K) this.f33123r;
            a aVar = new a(this.f33124s, this.f33125t, this.f33126u, this.f33127v, null);
            b bVar = new b(this.f33128w, this.f33129x, this.f33130y);
            this.f33122q = 1;
            if (C20445d2.g(k12, null, aVar, bVar, this, 3) == coroutine_suspended) {
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
