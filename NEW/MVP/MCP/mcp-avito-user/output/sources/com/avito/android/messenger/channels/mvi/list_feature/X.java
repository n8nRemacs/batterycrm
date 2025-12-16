package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$catchAndLogErrors$1", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class X extends SuspendLambda implements Y41.q<InterfaceC43172j<Object>, Throwable, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f187893q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f187894r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(String str, Continuation<? super X> continuation) {
        super(3, continuation);
        this.f187894r = str;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
        X x12 = new X(this.f187894r, continuation);
        x12.f187893q = th2;
        return x12.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        X2.f318778a.a("ChannelsListActorSubscriptions", this.f187894r.concat(" subscription encountered an error!"), this.f187893q);
        return kotlin.G0.f406611a;
    }
}
