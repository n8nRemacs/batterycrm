package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.InterfaceC14443a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$12", f = "RealtyAgencySearchActor.kt", i = {0, 1, 2, 3}, l = {268, 276, 277, 278, 292}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29870e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138807q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138808r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14443a f138809s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138810t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C29866a f138811u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29870e(InterfaceC14443a interfaceC14443a, Lw.c cVar, C29866a c29866a, Continuation<? super C29870e> continuation) {
        super(2, continuation);
        this.f138809s = interfaceC14443a;
        this.f138810t = cVar;
        this.f138811u = c29866a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29870e c29870e = new C29870e(this.f138809s, this.f138810t, this.f138811u, continuation);
        c29870e.f138808r = obj;
        return c29870e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29870e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.C29870e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
