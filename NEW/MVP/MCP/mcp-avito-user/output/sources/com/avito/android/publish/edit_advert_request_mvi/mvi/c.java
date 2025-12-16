package com.avito.android.publish.edit_advert_request_mvi.mvi;

import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.deep_linking.links.AuctionOfferLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.error.z;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.remote.model.publish.EditAdvertResult;
import ee0.InterfaceC40095b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: EditRequestActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lee0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.mvi.EditRequestActor$processDeeplinkResult$1", f = "EditRequestActor.kt", i = {}, l = {40, 45, 50, 54, 58, 66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40095b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f235614q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f235615r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43501a f235616s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f235617t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f235618u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C43501a c43501a, d dVar, String str, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f235616s = c43501a;
        this.f235617t = dVar;
        this.f235618u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f235616s, this.f235617t, this.f235618u, continuation);
        cVar.f235615r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC40095b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f235614q) {
            case 0:
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f235615r;
                C43501a c43501a = this.f235616s;
                InterfaceC14249c interfaceC14249c = c43501a.f413261b;
                boolean z12 = interfaceC14249c instanceof PaidServicesLink.a;
                String str = this.f235618u;
                d dVar = this.f235617t;
                if (z12) {
                    this.f235614q = 1;
                    if (d.c(dVar, str, interfaceC43172j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.a) {
                    String strI = z.i(((MyAdvertLink.ActivateV2.b.a) interfaceC14249c).f133470c);
                    if (strI != null) {
                        str = strI;
                    }
                    this.f235614q = 2;
                    if (d.c(dVar, str, interfaceC43172j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC14249c instanceof MyAdvertLink.ActivateV2.b.c) {
                    String str2 = ((MyAdvertLink.ActivateV2.b.c) interfaceC14249c).f133472b;
                    if (str2 != null) {
                        str = str2;
                    }
                    this.f235614q = 3;
                    if (d.c(dVar, str, interfaceC43172j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC14249c instanceof AuctionOfferLink.a.C3986a) {
                    this.f235614q = 4;
                    if (d.c(dVar, str, interfaceC43172j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC14249c instanceof AuctionOfferLink.a.c) {
                    com.avito.android.publish.edit_advert_request_mvi.f fVar = dVar.f235620b;
                    AuctionOfferLink.a.c cVar = (AuctionOfferLink.a.c) interfaceC14249c;
                    EditAdvertResult.Ok ok2 = cVar.f133027b;
                    String str3 = cVar.f133028c;
                    this.f235614q = 5;
                    if (fVar.a(ok2, str3, interfaceC43172j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (L.f(c43501a.f413260a.f134521b, "req_fees")) {
                    this.f235614q = 6;
                    if (d.c(dVar, str, interfaceC43172j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                C42729a0.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return G0.f406611a;
    }
}
