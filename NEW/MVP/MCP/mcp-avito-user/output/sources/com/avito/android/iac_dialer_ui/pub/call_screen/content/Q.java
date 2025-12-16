package com.avito.android.iac_dialer_ui.pub.call_screen.content;

import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: IacUICallScreenIdleModeContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_ui.pub.call_screen.content.IacUICallScreenIdleModeContentKt$IacUICallScreenIdleModeContent$2$1", f = "IacUICallScreenIdleModeContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class Q extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ IacUICallScreenState.IdleModeContent f167092q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f167093r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(IacUICallScreenState.IdleModeContent idleModeContent, Y41.l<? super IacUICallScreenState.IdleModeContent.LaunchedAction, G0> lVar, Continuation<? super Q> continuation) {
        super(2, continuation);
        this.f167092q = idleModeContent;
        this.f167093r = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Q(this.f167092q, this.f167093r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((Q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        IacUICallScreenState.IdleModeContent idleModeContent = this.f167092q;
        if (idleModeContent.getLaunchedAction() != null) {
            this.f167093r.invoke(idleModeContent.getLaunchedAction());
        }
        return G0.f406611a;
    }
}
