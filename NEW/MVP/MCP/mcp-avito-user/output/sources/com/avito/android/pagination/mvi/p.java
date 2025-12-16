package com.avito.android.pagination.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import r50.AbstractC47493a;

/* compiled from: RequestNewPortionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lr50/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.pagination.mvi.RequestNewPortionHandler$requestNewPortion$1", f = "RequestNewPortionHandler.kt", i = {}, l = {35, 40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super r50.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f210588q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC47493a f210589r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f210590s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f210591t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f210592u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f210593v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AbstractC47493a abstractC47493a, boolean z12, s sVar, Y41.a<Boolean> aVar, Y41.a<Boolean> aVar2, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f210589r = abstractC47493a;
        this.f210590s = z12;
        this.f210591t = sVar;
        this.f210592u = aVar;
        this.f210593v = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f210589r, this.f210590s, this.f210591t, this.f210592u, this.f210593v, continuation);
        pVar.f210588q = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super r50.f> interfaceC43172j, Continuation<? super G0> continuation) {
        ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        s sVar = this.f210591t;
        C42729a0.b(obj);
        if (this.f210589r == null || this.f210590s) {
            sVar.getClass();
            throw null;
        }
        sVar.getClass();
        throw null;
    }
}
