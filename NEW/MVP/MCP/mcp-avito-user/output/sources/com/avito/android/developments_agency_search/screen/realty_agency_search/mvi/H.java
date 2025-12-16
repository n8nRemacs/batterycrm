package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.remote.model.SearchParams;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchInteractorImpl$loadLots$1", f = "RealtyAgencySearchInteractor.kt", i = {0, 1}, l = {267, 269, 286, 294}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class H extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138718q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138719r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f138720s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I f138721t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SearchParams f138722u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f138723v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LotSort f138724w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(int i12, I i13, SearchParams searchParams, boolean z12, LotSort lotSort, Continuation<? super H> continuation) {
        super(2, continuation);
        this.f138720s = i12;
        this.f138721t = i13;
        this.f138722u = searchParams;
        this.f138723v = z12;
        this.f138724w = lotSort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        H h12 = new H(this.f138720s, this.f138721t, this.f138722u, this.f138723v, this.f138724w, continuation);
        h12.f138719r = obj;
        return h12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((H) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
