package com.avito.android.bxcontent.mvi.sources;

import Y41.p;
import Y61.k;
import com.avito.android.bxcontent.mvi.entity.l;
import com.avito.android.serp.adapter.l1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceOrderRequestsDataSource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/serp/adapter/l1;", "<anonymous>", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.sources.ServiceOrderRequestsDataSourceImpl$observeServiceOrderRequests$2", f = "ServiceOrderRequestsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<String, Continuation<? super InterfaceC43160i<? extends l1>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112555q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<l> f112556r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f112557s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Y41.a<l> aVar, e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f112556r = aVar;
        this.f112557s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f112556r, this.f112557s, continuation);
        cVar.f112555q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super InterfaceC43160i<? extends l1>> continuation) {
        return ((c) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = (String) this.f112555q;
        l lVarInvoke = this.f112556r.invoke();
        return this.f112557s.f112559a.a(str, lVarInvoke.f112306I, lVarInvoke.f112345l, lVarInvoke.f112304G, lVarInvoke.f112312O);
    }
}
