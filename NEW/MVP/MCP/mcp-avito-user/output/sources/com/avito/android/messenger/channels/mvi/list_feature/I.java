package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHY/a;", "action", "Lkotlin/G0;", "<anonymous>", "(LHY/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$2", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class I extends SuspendLambda implements Y41.p<HY.a, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f187744q;

    public I() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        I i12 = new I(2, continuation);
        i12.f187744q = obj;
        return i12;
    }

    @Override // Y41.p
    public final Object invoke(HY.a aVar, Continuation<? super kotlin.G0> continuation) {
        return ((I) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        HY.a aVar = (HY.a) this.f187744q;
        if (aVar instanceof HY.g) {
            X2.f318778a.i("Mvi-ChannelsList", "privateAction > " + aVar, null);
        }
        return kotlin.G0.f406611a;
    }
}
