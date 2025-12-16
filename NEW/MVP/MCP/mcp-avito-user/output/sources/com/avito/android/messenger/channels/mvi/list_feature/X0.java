package com.avito.android.messenger.channels.mvi.list_feature;

import HY.m;
import Oq.InterfaceC14725a;
import com.avito.android.messenger.ChatListLoadingException;
import com.avito.android.messenger.ChatListPaginationException;
import com.avito.android.messenger.analytics.C31667x;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelsListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHY/m;", "prevState", "curState", "<anonymous>", "(LHY/m;LHY/m;)LHY/m;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$trackErrorsInPrivateListState$1", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class X0 extends SuspendLambda implements Y41.q<HY.m, HY.m, Continuation<? super HY.m>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ HY.m f187895q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ HY.m f187896r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f187897s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(W w12, Continuation<? super X0> continuation) {
        super(3, continuation);
        this.f187897s = w12;
    }

    @Override // Y41.q
    public final Object invoke(HY.m mVar, HY.m mVar2, Continuation<? super HY.m> continuation) {
        X0 x02 = new X0(this.f187897s, continuation);
        x02.f187895q = mVar;
        x02.f187896r = mVar2;
        return x02.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        HY.m mVar = this.f187895q;
        HY.m mVar2 = this.f187896r;
        W w12 = this.f187897s;
        w12.getClass();
        m.c cVar = mVar2.f7251b;
        boolean z12 = mVar.f7251b instanceof m.c.a;
        InterfaceC42726C interfaceC42726C = w12.f187877n;
        if (!z12 && (cVar instanceof m.c.a)) {
            InterfaceC14725a.C0808a.a((C31667x) interfaceC42726C.getValue(), new ChatListLoadingException("Failed to load channels list", ((m.c.a) cVar).f7264a), Collections.singletonMap("isRefresh", Boolean.FALSE), 2);
        }
        if (!(mVar.f7253d instanceof m.c.a)) {
            m.c cVar2 = mVar2.f7253d;
            if (cVar2 instanceof m.c.a) {
                InterfaceC14725a.C0808a.a((C31667x) interfaceC42726C.getValue(), new ChatListPaginationException("Failed to load next page of channels list", ((m.c.a) cVar2).f7264a), null, 6);
            }
        }
        if (!(mVar.f7252c instanceof m.c.a)) {
            m.c cVar3 = mVar2.f7252c;
            if (cVar3 instanceof m.c.a) {
                InterfaceC14725a.C0808a.a((C31667x) interfaceC42726C.getValue(), new ChatListLoadingException("Failed to refresh channels list", ((m.c.a) cVar3).f7264a), Collections.singletonMap("isRefresh", Boolean.TRUE), 2);
            }
        }
        return mVar2;
    }
}
