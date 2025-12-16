package androidx.compose.material;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/material/p;", "Landroidx/compose/material/e3;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "latestTarget", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21372v extends SuspendLambda implements Y41.r<InterfaceC21292p, InterfaceC21153e3<Object>, Object, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ InterfaceC21292p f34262q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC21153e3 f34263r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f34264s;

    public C21372v() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC21292p interfaceC21292p, InterfaceC21153e3<Object> interfaceC21153e3, Object obj, Continuation<? super kotlin.G0> continuation) {
        C21372v c21372v = new C21372v(4, continuation);
        c21372v.f34262q = interfaceC21292p;
        c21372v.f34263r = interfaceC21153e3;
        c21372v.f34264s = obj;
        return c21372v.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC21292p interfaceC21292p = this.f34262q;
        float fC2 = this.f34263r.c(this.f34264s);
        if (!Float.isNaN(fC2)) {
            interfaceC21292p.a(fC2, 0.0f);
        }
        return kotlin.G0.f406611a;
    }
}
