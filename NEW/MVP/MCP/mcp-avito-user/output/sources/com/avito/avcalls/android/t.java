package com.avito.avcalls.android;

import com.avito.avcalls.android.utils.AvCallsException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AvCallsImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.AvCallsImpl$terminateCall$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f332420q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f332421r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ xQ0.k f332422s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g gVar, String str, xQ0.k kVar, Continuation<? super t> continuation) {
        super(1, continuation);
        this.f332420q = gVar;
        this.f332421r = str;
        this.f332422s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new t(this.f332420q, this.f332421r, this.f332422s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return ((t) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws AvCallsException.CallNotFoundException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f332420q.f331703b.n(this.f332421r, this.f332422s, true);
        return G0.f406611a;
    }
}
