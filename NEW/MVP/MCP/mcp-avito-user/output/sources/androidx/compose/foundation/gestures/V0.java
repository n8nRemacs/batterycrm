package androidx.compose.foundation.gestures;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Draggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<kotlinx.coroutines.T, l0.g, Continuation<? super kotlin.G0>, Object> f27505a = new a(3, null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<kotlinx.coroutines.T, Float, Continuation<? super kotlin.G0>, Object> f27506b = new b(3, null);

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Ll0/g;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, l0.g, Continuation<? super kotlin.G0>, Object> {
        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(kotlinx.coroutines.T t12, l0.g gVar, Continuation<? super kotlin.G0> continuation) {
            long j12 = gVar.f413387a;
            return new a(3, continuation).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, Float, Continuation<? super kotlin.G0>, Object> {
        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(kotlinx.coroutines.T t12, Float f12, Continuation<? super kotlin.G0> continuation) {
            f12.floatValue();
            return new b(3, continuation).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
    }

    @Y61.k
    public static final Y0 a(@Y61.k Y41.l<? super Float, kotlin.G0> lVar) {
        return new S(lVar);
    }

    public static androidx.compose.ui.v b(androidx.compose.ui.v vVar, Y0 y02, Orientation orientation, boolean z12, androidx.compose.foundation.interaction.m mVar, boolean z13, Y41.q qVar, boolean z14, int i12) {
        return vVar.d0(new DraggableElement(y02, orientation, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? null : mVar, (i12 & 16) != 0 ? false : z13, f27505a, qVar, (i12 & 128) != 0 ? false : z14));
    }
}
