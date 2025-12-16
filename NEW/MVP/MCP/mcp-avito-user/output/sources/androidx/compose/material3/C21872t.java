package androidx.compose.material3;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/material3/n;", "Landroidx/compose/material3/N6;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "latestTarget", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21872t extends SuspendLambda implements Y41.r<InterfaceC21735n, N6<Object>, Object, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ InterfaceC21735n f37287q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ N6 f37288r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f37289s;

    public C21872t() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC21735n interfaceC21735n, N6<Object> n62, Object obj, Continuation<? super kotlin.G0> continuation) {
        C21872t c21872t = new C21872t(4, continuation);
        c21872t.f37287q = interfaceC21735n;
        c21872t.f37288r = n62;
        c21872t.f37289s = obj;
        return c21872t.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC21735n interfaceC21735n = this.f37287q;
        float fC2 = this.f37288r.c(this.f37289s);
        if (!Float.isNaN(fC2)) {
            interfaceC21735n.a(fC2, 0.0f);
        }
        return kotlin.G0.f406611a;
    }
}
