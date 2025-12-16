package androidx.compose.foundation.gestures;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/a;", "Landroidx/compose/foundation/gestures/T0;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "latestTarget", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.gestures.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20482n extends SuspendLambda implements Y41.r<InterfaceC20430a, T0<Object>, Object, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ InterfaceC20430a f27872q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ T0 f27873r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27874s;

    public C20482n() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC20430a interfaceC20430a, T0<Object> t02, Object obj, Continuation<? super kotlin.G0> continuation) {
        C20482n c20482n = new C20482n(4, continuation);
        c20482n.f27872q = interfaceC20430a;
        c20482n.f27873r = t02;
        c20482n.f27874s = obj;
        return c20482n.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC20430a interfaceC20430a = this.f27872q;
        float fC2 = this.f27873r.c(this.f27874s);
        if (!Float.isNaN(fC2)) {
            interfaceC20430a.a(fC2, 0.0f);
        }
        return kotlin.G0.f406611a;
    }
}
