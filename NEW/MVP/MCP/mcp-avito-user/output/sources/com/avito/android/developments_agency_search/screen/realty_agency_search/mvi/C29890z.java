package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import android.os.Bundle;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.developments_agency_search.deeplink.DealCabinetLink;
import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RealtyAgencySearchBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/page/m$c;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<anonymous>", "(Lcom/avito/android/beduin/v2/page/m$c;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchBootstrap$observeDeeplinkResult$2", f = "RealtyAgencySearchBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29890z extends SuspendLambda implements Y41.p<m.c, Continuation<? super InterfaceC43160i<? extends RealtyAgencySearchInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f138989q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29887w f138990r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29890z(C29887w c29887w, Continuation<? super C29890z> continuation) {
        super(2, continuation);
        this.f138990r = c29887w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29890z c29890z = new C29890z(this.f138990r, continuation);
        c29890z.f138989q = obj;
        return c29890z;
    }

    @Override // Y41.p
    public final Object invoke(m.c cVar, Continuation<? super InterfaceC43160i<? extends RealtyAgencySearchInternalAction>> continuation) {
        return ((C29890z) create(cVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        m.c cVar = (m.c) this.f138989q;
        int i12 = C29887w.f138969h;
        C29887w c29887w = this.f138990r;
        c29887w.getClass();
        Bundle bundle = cVar.f105170b;
        if (bundle == null) {
            return C43175k.w();
        }
        if (bundle.containsKey(ContextActionHandler.Link.DEEPLINK)) {
            return new C43210w(new RealtyAgencySearchInternalAction.HandleDeeplink(c29887w.f138974e.b(bundle.getString(ContextActionHandler.Link.DEEPLINK, ""))));
        }
        return (bundle.containsKey("lotId") && bundle.containsKey("clientId") && bundle.containsKey("selectionName")) ? C43175k.G(new C29888x(c29887w, bundle, null)) : (bundle.containsKey("sessionId") && bundle.containsKey(SearchParamsConverterKt.LOCATION_ID) && bundle.containsKey("parentScreen") && bundle.containsKey("clientId")) ? new C43210w(new RealtyAgencySearchInternalAction.HandleDeeplink(new DealRoomLink(bundle.getString("clientId", ""), null, bundle.getString("parentScreen", "")))) : (bundle.containsKey(SearchParamsConverterKt.LOCATION_ID) && bundle.containsKey("parentScreen")) ? new C43210w(new RealtyAgencySearchInternalAction.HandleDeeplink(new DealCabinetLink(bundle.getString(SearchParamsConverterKt.LOCATION_ID, ""), bundle.getString("parentScreen", "")))) : C43175k.w();
    }
}
