package androidx.compose.foundation.gestures;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", i = {}, l = {834}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.gestures.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20441c2 extends SuspendLambda implements Y41.p<G1, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27594q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27595r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20433a2 f27596s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f27597t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20441c2(Y41.p pVar, C20433a2 c20433a2, Continuation continuation) {
        super(2, continuation);
        this.f27596s = c20433a2;
        this.f27597t = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20441c2 c20441c2 = new C20441c2(this.f27597t, this.f27596s, continuation);
        c20441c2.f27595r = obj;
        return c20441c2;
    }

    @Override // Y41.p
    public final Object invoke(G1 g12, Continuation<? super kotlin.G0> continuation) {
        return ((C20441c2) create(g12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27594q;
        if (i12 == 0) {
            C42729a0.b(obj);
            G1 g12 = (G1) this.f27595r;
            C20433a2 c20433a2 = this.f27596s;
            c20433a2.f27557j = g12;
            this.f27594q = 1;
            if (this.f27597t.invoke(c20433a2.f27558k, this) == coroutine_suspended) {
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
