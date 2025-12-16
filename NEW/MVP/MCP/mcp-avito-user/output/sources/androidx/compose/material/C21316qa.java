package androidx.compose.material;

import androidx.compose.runtime.C22040c3;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/foundation/gestures/O0;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/O0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21316qa extends SuspendLambda implements Y41.p<androidx.compose.foundation.gestures.O0, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f33999q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f34000r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C21238ka<Object> f34001s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21316qa(float f12, C21238ka<Object> c21238ka, Continuation<? super C21316qa> continuation) {
        super(2, continuation);
        this.f34000r = f12;
        this.f34001s = c21238ka;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C21316qa c21316qa = new C21316qa(this.f34000r, this.f34001s, continuation);
        c21316qa.f33999q = obj;
        return c21316qa;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.foundation.gestures.O0 o02, Continuation<? super kotlin.G0> continuation) {
        return ((C21316qa) create(o02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((androidx.compose.foundation.gestures.O0) this.f33999q).a(this.f34000r - ((C22040c3) this.f34001s.f33758g).f());
        return kotlin.G0.f406611a;
    }
}
