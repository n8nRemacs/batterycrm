package com.avito.android.offlinization.beduin;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinCacheStarter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.offlinization.beduin.BeduinCacheStarter$registerSpaceCheck$1", f = "BeduinCacheStarter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f208513q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f208514r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, p pVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f208513q = cVar;
        this.f208514r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f208513q, this.f208514r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        c cVar = this.f208513q;
        cVar.getClass();
        if (this.f208514r.f208563a.getFreeSpace() - 10485760 < 10485760 * 6) {
            cVar.f208535f.b();
        }
        return G0.f406611a;
    }
}
