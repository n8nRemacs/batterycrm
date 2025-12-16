package androidx.compose.material3;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.gestures.InterfaceC20509u1;
import androidx.compose.material3.Wf;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22061e3;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", f = "Slider.kt", i = {}, l = {1469}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Sf extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f35411q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f35412r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Wf f35413s;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ long f35414q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Wf f35415r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Wf wf2, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f35415r = wf2;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super kotlin.G0> continuation) {
            long j12 = gVar.f413387a;
            a aVar = new a(this.f35415r, continuation);
            aVar.f35414q = j12;
            return aVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            long j12 = this.f35414q;
            Wf wf2 = this.f35415r;
            ((C22040c3) wf2.f35781m).S6((wf2.f35776h ? ((C22061e3) wf2.f35775g).e() - l0.g.g(j12) : l0.g.g(j12)) - ((C22040c3) wf2.f35780l).f());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Wf f35416l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Wf wf2) {
            super(1);
            this.f35416l = wf2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            Wf wf2 = this.f35416l;
            wf2.b(0.0f);
            ((Wf.c) wf2.f35779k).invoke();
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sf(Wf wf2, Continuation<? super Sf> continuation) {
        super(2, continuation);
        this.f35413s = wf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Sf sf2 = new Sf(this.f35413s, continuation);
        sf2.f35412r = obj;
        return sf2;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((Sf) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f35411q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.input.pointer.K k12 = (androidx.compose.ui.input.pointer.K) this.f35412r;
            Wf wf2 = this.f35413s;
            a aVar = new a(wf2, null);
            b bVar = new b(wf2);
            this.f35411q = 1;
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
