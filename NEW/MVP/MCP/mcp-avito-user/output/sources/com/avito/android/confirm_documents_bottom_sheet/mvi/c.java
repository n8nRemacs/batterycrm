package com.avito.android.confirm_documents_bottom_sheet.mvi;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.confirm_documents_bottom_sheet.models.ConfirmDocumentsInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import wr.AbstractC49673a;

/* compiled from: ConfirmDocumentsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.confirm_documents_bottom_sheet.mvi.ConfirmDocumentsActor$process$3", f = "ConfirmDocumentsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ConfirmDocumentsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC49673a f125608q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f125609r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC49673a abstractC49673a, e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f125608q = abstractC49673a;
        this.f125609r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f125608q, this.f125609r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ConfirmDocumentsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        AbstractC49673a.d dVar = (AbstractC49673a.d) this.f125608q;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = dVar.f441814a.f125593f;
        e eVar = this.f125609r;
        if (parametrizedClickStreamEvent != null) {
            eVar.f125614c.c(parametrizedClickStreamEvent);
        }
        DeepLink deepLink = dVar.f441814a.f125592e;
        if (deepLink != null) {
            b.a.a(eVar.f125612a, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
