package androidx.compose.foundation.gestures;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: ScrollExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class D1 extends SuspendLambda implements Y41.p<G1, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f27215q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.e f27216r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f27217s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(l0.e eVar, float f12, Continuation<? super D1> continuation) {
        super(2, continuation);
        this.f27216r = eVar;
        this.f27217s = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        D1 d12 = new D1(this.f27216r, this.f27217s, continuation);
        d12.f27215q = obj;
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(G1 g12, Continuation<? super kotlin.G0> continuation) {
        return ((D1) create(g12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f27216r.f406839b = ((G1) this.f27215q).a(this.f27217s);
        return kotlin.G0.f406611a;
    }
}
