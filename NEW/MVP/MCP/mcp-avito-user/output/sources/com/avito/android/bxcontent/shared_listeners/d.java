package com.avito.android.bxcontent.shared_listeners;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.C29235n;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.remote.model.Location;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxSharedLocationListenerInteractor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "Lcom/avito/android/remote/model/Location;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.shared_listeners.BxSharedLocationListenerInteractorImpl$listenLocationForAllSearch$3", f = "BxSharedLocationListenerInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements q<InterfaceC43172j<? super Q<? extends Location, ? extends Boolean>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f112918q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f112919r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f112919r = hVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Q<? extends Location, ? extends Boolean>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f112919r, continuation);
        dVar.f112918q = th2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f112918q;
        ((C29235n) this.f112919r.e()).accept(new InterfaceC29127b.C29161u(new Exception(th2), null, 2, null));
        return G0.f406611a;
    }
}
