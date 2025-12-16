package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentBootstrap$getSearchActionsFlow$1", f = "BxContentBootstrap.kt", i = {0}, l = {164, 165}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.bxcontent.mvi.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29223u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f112569q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112570r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29225v f112571s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29223u(C29225v c29225v, Continuation<? super C29223u> continuation) {
        super(2, continuation);
        this.f112571s = c29225v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29223u c29223u = new C29223u(this.f112571s, continuation);
        c29223u.f112570r = obj;
        return c29223u;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29223u) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f112569q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f112570r;
            e.a aVar = kotlin.time.e.f410651c;
            long jG2 = kotlin.time.g.g(300, DurationUnit.f410633e);
            this.f112570r = interfaceC43172j;
            this.f112569q = 1;
            if (C43131e0.c(jG2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f112570r;
            C42729a0.b(obj);
        }
        C29225v c29225v = this.f112571s;
        SearchParams searchParams = c29225v.f112579a.f108864c;
        String query = searchParams != null ? searchParams.getQuery() : null;
        if (query == null) {
            query = "";
        }
        String str = query;
        BxContentArguments bxContentArguments = c29225v.f112579a;
        PresentationType presentationType = bxContentArguments.f108868g;
        SearchParams empty = bxContentArguments.f108864c;
        if (empty == null) {
            empty = SearchParams.INSTANCE.getEMPTY();
        }
        SearchParams searchParams2 = empty;
        SerpSpaceType serpSpaceType = bxContentArguments.f108872k;
        if (serpSpaceType == null) {
            serpSpaceType = SerpSpaceType.Default;
        }
        BxContentInternalAction.OpenSearchBar openSearchBar = new BxContentInternalAction.OpenSearchBar(null, true, c29225v.f112588j.d() ? new SearchSuggestInternalShowLink(str, "", searchParams2, presentationType, serpSpaceType, bxContentArguments.f108874m) : null, 1, null);
        this.f112570r = null;
        this.f112569q = 2;
        if (interfaceC43172j.emit(openSearchBar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}
