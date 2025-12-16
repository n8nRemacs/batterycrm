package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: ContextMenuGestures.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", i = {0}, l = {58, 61}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
/* loaded from: classes.dex */
final class k extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27032q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27033r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<l0.g, G0> f27034s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Y41.l<? super l0.g, G0> lVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f27034s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        k kVar = new k(this.f27034s, continuation);
        kVar.f27033r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC22325c, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f27032q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r6)
            goto L55
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f27033r
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            kotlin.C42729a0.b(r6)
            goto L35
        L22:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f27033r
            r1 = r6
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            r5.f27033r = r1
            r5.f27032q = r3
            java.lang.Object r6 = androidx.compose.foundation.contextmenu.l.a(r1, r5)
            if (r6 != r0) goto L35
            return r0
        L35:
            androidx.compose.ui.input.pointer.C r6 = (androidx.compose.ui.input.pointer.C) r6
            r6.a()
            long r3 = r6.f40118c
            l0.g r6 = l0.g.a(r3)
            Y41.l<l0.g, kotlin.G0> r3 = r5.f27034s
            r3.invoke(r6)
            r6 = 0
            r5.f27033r = r6
            r5.f27032q = r2
            Y41.q<androidx.compose.foundation.gestures.u1, l0.g, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r6 = androidx.compose.foundation.gestures.C20445d2.f27614a
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
            java.lang.Object r6 = androidx.compose.foundation.gestures.C20445d2.l(r1, r6, r5)
            if (r6 != r0) goto L55
            return r0
        L55:
            androidx.compose.ui.input.pointer.C r6 = (androidx.compose.ui.input.pointer.C) r6
            if (r6 == 0) goto L5c
            r6.a()
        L5c:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
