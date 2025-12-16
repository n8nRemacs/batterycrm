package com.avito.android.messenger.channels.mvi.header_feature;

import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsHeaderBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "", "error", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderBootstrap$subscribeToLogouts$1", f = "ChannelsHeaderBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class A extends SuspendLambda implements Y41.q<InterfaceC43172j<? super G0>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f187452q;

    public A() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        A a12 = new A(3, continuation);
        a12.f187452q = th2;
        return a12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        V2.f318762a.a("ChannelsHeaderBootstrap", "channelsErrorInteractor.loggedOutStream subscription encountered an error!", this.f187452q);
        return G0.f406611a;
    }
}
