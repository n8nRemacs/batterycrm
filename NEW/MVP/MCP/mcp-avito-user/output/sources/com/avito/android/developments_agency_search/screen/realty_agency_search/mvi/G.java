package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.remote.model.SearchParams;
import com.facebook.imageutils.JfifUtil;
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
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchInteractorImpl$loadDevelopments$1", f = "RealtyAgencySearchInteractor.kt", i = {0, 1}, l = {196, 198, JfifUtil.MARKER_SOI, 224}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class G extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138711q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f138713s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I f138714t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SearchParams f138715u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f138716v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DevelopmentSort f138717w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(int i12, I i13, SearchParams searchParams, boolean z12, DevelopmentSort developmentSort, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f138713s = i12;
        this.f138714t = i13;
        this.f138715u = searchParams;
        this.f138716v = z12;
        this.f138717w = developmentSort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        G g12 = new G(this.f138713s, this.f138714t, this.f138715u, this.f138716v, this.f138717w, continuation);
        g12.f138712r = obj;
        return g12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((G) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
