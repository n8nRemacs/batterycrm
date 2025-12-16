package androidx.compose.foundation;

import androidx.compose.foundation.gestures.InterfaceC20509u1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "offset", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", i = {}, l = {696}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class G0 extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f26706q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC20509u1 f26707r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ long f26708s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I0 f26709t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(I0 i02, Continuation<? super G0> continuation) {
        super(3, continuation);
        this.f26709t = i02;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super kotlin.G0> continuation) {
        long j12 = gVar.f413387a;
        G0 g02 = new G0(this.f26709t, continuation);
        g02.f26707r = interfaceC20509u1;
        g02.f26708s = j12;
        return g02.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f26706q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC20509u1 interfaceC20509u1 = this.f26707r;
            long j12 = this.f26708s;
            I0 i02 = this.f26709t;
            if (i02.f26919v) {
                this.f26706q = 1;
                androidx.compose.foundation.interaction.m mVar = i02.f26915r;
                if (mVar == null || (objC = kotlinx.coroutines.U.c(new C20421e(interfaceC20509u1, j12, mVar, i02, null), this)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objC = kotlin.G0.f406611a;
                }
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
