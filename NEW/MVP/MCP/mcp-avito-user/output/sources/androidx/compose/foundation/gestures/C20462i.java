package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.runtime.C22040c3;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/a;", "Landroidx/compose/foundation/gestures/T0;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "latestTarget", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", i = {}, l = {1344}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.gestures.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20462i extends SuspendLambda implements Y41.r<InterfaceC20430a, T0<Object>, Object, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27744q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC20430a f27745r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ T0 f27746s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27747t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C20501s<Object> f27748u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20307p<Float> f27749v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20462i(C20501s<Object> c20501s, InterfaceC20307p<Float> interfaceC20307p, Continuation<? super C20462i> continuation) {
        super(4, continuation);
        this.f27748u = c20501s;
        this.f27749v = interfaceC20307p;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC20430a interfaceC20430a, T0<Object> t02, Object obj, Continuation<? super kotlin.G0> continuation) {
        C20462i c20462i = new C20462i(this.f27748u, this.f27749v, continuation);
        c20462i.f27745r = interfaceC20430a;
        c20462i.f27746s = t02;
        c20462i.f27747t = obj;
        return c20462i.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27744q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC20430a interfaceC20430a = this.f27745r;
            T0 t02 = this.f27746s;
            Object obj2 = this.f27747t;
            C20501s<Object> c20501s = this.f27748u;
            float f12 = ((C22040c3) c20501s.f27973l).f();
            this.f27745r = null;
            this.f27746s = null;
            this.f27744q = 1;
            if (C20438c.b(c20501s, f12, interfaceC20430a, t02, obj2, this.f27749v, this) == coroutine_suspended) {
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
