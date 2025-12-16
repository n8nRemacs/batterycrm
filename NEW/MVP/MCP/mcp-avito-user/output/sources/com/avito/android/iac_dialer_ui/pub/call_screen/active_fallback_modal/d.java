package com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43125y;

/* compiled from: IacUIActiveFallbackModal.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal.IacUIActiveFallbackModalKt$IacUIActiveFallbackModal$1", f = "IacUIActiveFallbackModal.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f166939q;

    /* renamed from: r, reason: collision with root package name */
    public int f166940r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43108m f166941s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f166942t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C43108m c43108m, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f166941s = c43108m;
        this.f166942t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f166941s, this.f166942t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f166940r
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlinx.coroutines.channels.y r1 = r4.f166939q
            kotlin.C42729a0.b(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            kotlin.C42729a0.b(r5)
            kotlinx.coroutines.channels.m r5 = r4.f166941s
            kotlinx.coroutines.channels.y r5 = r5.iterator()
            r1 = r5
        L23:
            r4.f166939q = r1
            r4.f166940r = r2
            java.lang.Object r5 = r1.a(r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L45
            java.lang.Object r5 = r1.next()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            androidx.compose.runtime.y1<java.lang.Boolean> r3 = r4.f166942t
            r3.setValue(r5)
            goto L23
        L45:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
