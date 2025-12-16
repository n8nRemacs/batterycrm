package com.avito.android.bxcontent.shared_listeners;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.C29235n;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxSharedLocationListenerInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "", "it", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.shared_listeners.BxSharedLocationListenerInteractorImpl$listenLocationForMain$3", f = "BxSharedLocationListenerInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements q<InterfaceC43172j<? super G0>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f112922q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f112923r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation<? super g> continuation) {
        super(3, continuation);
        this.f112923r = hVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        g gVar = new g(this.f112923r, continuation);
        gVar.f112922q = th2;
        return gVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f112922q;
        ((C29235n) this.f112923r.e()).accept(new InterfaceC29127b.C29161u(new Exception(th2), null, 2, null));
        return G0.f406611a;
    }
}
