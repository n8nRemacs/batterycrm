package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction;
import com.avito.android.remote.model.SearchParams;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ww.C49692c;

/* compiled from: BigFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.big_filters.mvi.BigFiltersActor$process$3", f = "BigFiltersActor.kt", i = {0, 0, 1, 1, 2}, l = {63, 64, 73, 76}, m = "invokeSuspend", n = {"$this$flow", "resetSearchParams", "$this$flow", "resetSearchParams", "$this$flow"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BigFiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public SearchParams f136683q;

    /* renamed from: r, reason: collision with root package name */
    public int f136684r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f136685s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f136686t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C49692c f136687u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, Continuation continuation, C49692c c49692c) {
        super(2, continuation);
        this.f136686t = jVar;
        this.f136687u = c49692c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f136686t, continuation, this.f136687u);
        cVar.f136685s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BigFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
