package com.akita.compose.component.segmented_control;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.gestures.InterfaceC20509u1;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SegmentedControlScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class v implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f62598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62600d;

    /* compiled from: SegmentedControlScope.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.segmented_control.SegmentedControlScopeKt$segmentTapModifier$1$1", f = "SegmentedControlScope.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f62601q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f62602r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f62603s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, Y41.a<G0> aVar, Y41.a<G0> aVar2, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f62601q = z12;
            this.f62602r = aVar;
            this.f62603s = aVar2;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super G0> continuation) {
            long j12 = gVar.f413387a;
            Y41.a<G0> aVar = this.f62603s;
            return new a(this.f62601q, this.f62602r, aVar, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (this.f62601q) {
                this.f62602r.invoke();
            } else {
                Y41.a<G0> aVar = this.f62603s;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return G0.f406611a;
        }
    }

    public v(Y41.a aVar, Y41.a aVar2, boolean z12) {
        this.f62598b = z12;
        this.f62599c = aVar;
        this.f62600d = aVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    @Y61.l
    public final Object invoke(@Y61.k K k12, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C20445d2.g(k12, null, new a(this.f62598b, this.f62599c, this.f62600d, null), null, continuation, 11);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
