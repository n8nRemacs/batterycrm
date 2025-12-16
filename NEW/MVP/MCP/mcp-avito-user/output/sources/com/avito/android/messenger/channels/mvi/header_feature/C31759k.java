package com.avito.android.messenger.channels.mvi.header_feature;

import FY.b;
import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsHeaderBootstrap.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LFY/b$f;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderBootstrap$subscribeCrmEntryPointStatus$3", f = "ChannelsHeaderBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31759k extends SuspendLambda implements Y41.q<InterfaceC43172j<? super b.f>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f187561q;

    public C31759k() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super b.f> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C31759k c31759k = new C31759k(3, continuation);
        c31759k.f187561q = th2;
        return c31759k.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        X2.f318778a.a("ChannelsHeaderBootstrap", "CrmEntryPointStatus subscription encountered an error!", this.f187561q);
        return G0.f406611a;
    }
}
