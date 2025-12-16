package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.extended_profile_serp.C30558v;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import com.avito.android.search.filter.FilterAnalyticsData;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.http.StatusLine;

/* compiled from: ExtendedProfileSerpActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor$navigateToFilters$1", f = "ExtendedProfileSerpActor.kt", i = {}, l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f152909q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f152910r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f152911s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSerpState f152912t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, ExtendedProfileSerpState extendedProfileSerpState, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f152911s = nVar;
        this.f152912t = extendedProfileSerpState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f152911s, this.f152912t, continuation);
        dVar.f152910r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f152909q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f152910r;
            FilterAnalyticsData.Source source = FilterAnalyticsData.Source.f261814g;
            String str = this.f152911s.f153021a.f152442b;
            ExtendedProfileSerpState extendedProfileSerpState = this.f152912t;
            C30558v c30558v = extendedProfileSerpState.f152955e;
            ExtendedProfileSerpInternalAction.OpenFiltersScreen openFiltersScreen = new ExtendedProfileSerpInternalAction.OpenFiltersScreen(extendedProfileSerpState.f152954d, c30558v != null ? c30558v.f153112c : null, new FilterAnalyticsData(source, str, null, c30558v != null ? c30558v.f153113d : null));
            this.f152909q = 1;
            if (interfaceC43172j.emit(openFiltersScreen, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
