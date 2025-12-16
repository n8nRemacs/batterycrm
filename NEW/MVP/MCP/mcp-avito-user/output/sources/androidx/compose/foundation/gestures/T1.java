package androidx.compose.foundation.gestures;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/g;", "offset", "<anonymous>", "(Ll0/g;)Ll0/g;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class T1 extends SuspendLambda implements Y41.p<l0.g, Continuation<? super l0.g>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27479q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f27480r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O1 f27481s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(O1 o12, Continuation<? super T1> continuation) {
        super(2, continuation);
        this.f27481s = o12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        T1 t12 = new T1(this.f27481s, continuation);
        t12.f27480r = ((l0.g) obj).f413387a;
        return t12;
    }

    @Override // Y41.p
    public final Object invoke(l0.g gVar, Continuation<? super l0.g> continuation) {
        return ((T1) create(l0.g.a(gVar.f413387a), continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27479q;
        if (i12 == 0) {
            C42729a0.b(obj);
            long j12 = this.f27480r;
            C20433a2 c20433a2 = this.f27481s.f27395E;
            this.f27479q = 1;
            obj = K1.a(c20433a2, j12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
