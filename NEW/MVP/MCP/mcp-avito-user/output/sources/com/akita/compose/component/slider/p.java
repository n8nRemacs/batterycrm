package com.akita.compose.component.slider;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.gestures.InterfaceC20509u1;
import androidx.compose.runtime.C22040c3;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.akita.compose.component.slider.q;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class p implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f62734b;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.slider.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ long f62735q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ q f62736r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f62736r = qVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super G0> continuation) {
            long j12 = gVar.f413387a;
            a aVar = new a(this.f62736r, continuation);
            aVar.f62735q = j12;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            long j12 = this.f62735q;
            q qVar = this.f62736r;
            ((C22040c3) qVar.f62749l).S6(Float.intBitsToFloat((int) (j12 >> 32)) - ((C22040c3) qVar.f62748k).f());
            return G0.f406611a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<l0.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f62737l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar) {
            super(1);
            this.f62737l = qVar;
        }

        @Override // Y41.l
        public final G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            q qVar = this.f62737l;
            qVar.b(0.0f);
            ((q.c) qVar.f62751n).invoke();
            return G0.f406611a;
        }
    }

    public p(q qVar) {
        this.f62734b = qVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    @Y61.l
    public final Object invoke(@Y61.k K k12, @Y61.k Continuation<? super G0> continuation) {
        q qVar = this.f62734b;
        Object objG = C20445d2.g(k12, null, new a(qVar, null), new b(qVar), continuation, 3);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
