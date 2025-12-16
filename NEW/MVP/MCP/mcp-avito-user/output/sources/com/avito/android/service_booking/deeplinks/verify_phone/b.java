package com.avito.android.service_booking.deeplinks.verify_phone;

import It0.C14157a;
import It0.C14158b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_booking.deeplinks.verify_phone.ServiceBookingVerifyPhoneLink;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import zs0.m;

/* compiled from: ServiceBookingVerifyPhoneLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LIt0/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/util/P2;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking.deeplinks.verify_phone.ServiceBookingVerifyPhoneLinkHandler$doHandleWithAuth$1", f = "ServiceBookingVerifyPhoneLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<P2<? super C14157a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f274264q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f274265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingVerifyPhoneLink f274266s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ServiceBookingVerifyPhoneLink serviceBookingVerifyPhoneLink, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f274265r = cVar;
        this.f274266s = serviceBookingVerifyPhoneLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f274265r, this.f274266s, continuation);
        bVar.f274264q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(P2<? super C14157a> p22, Continuation<? super G0> continuation) {
        return ((b) create(p22, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        DeepLink uri;
        DeepLink uri2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        P2 p22 = (P2) this.f274264q;
        boolean z12 = p22 instanceof P2.b;
        c cVar = this.f274265r;
        if (z12) {
            C14157a c14157a = (C14157a) ((P2.b) p22).f318720a;
            cVar.getClass();
            String status = c14157a.getStatus();
            boolean zF2 = L.f(status, "ok");
            com.avito.android.deeplink_handler.handler.composite.a aVar = cVar.f274270j;
            a.g gVar = cVar.f274269i;
            if (zF2) {
                gVar.g(cVar.d(), false);
                C14158b content = c14157a.getContent();
                if (content != null && (uri2 = content.getUri()) != null) {
                    cVar.i(ServiceBookingVerifyPhoneLink.b.C8145b.f274261b, aVar, uri2);
                }
            } else if (L.f(status, "need-phone-verification")) {
                ServiceBookingVerifyPhoneLink serviceBookingVerifyPhoneLink = this.f274266s;
                cVar.f274272l.c(new m(serviceBookingVerifyPhoneLink.getAdvertId(), serviceBookingVerifyPhoneLink.getMcId(), serviceBookingVerifyPhoneLink.getLocationId()));
                gVar.g(cVar.d(), false);
                C14158b content2 = c14157a.getContent();
                if (content2 != null && (uri = content2.getUri()) != null) {
                    cVar.i(ServiceBookingVerifyPhoneLink.b.C8145b.f274261b, aVar, uri);
                }
            }
        } else if (p22 instanceof P2.c) {
            cVar.f274269i.g(cVar.d(), true);
        } else if (p22 instanceof P2.a) {
            ApiError apiError = ((P2.a) p22).f318719a;
            cVar.f274269i.g(cVar.d(), false);
            a.i.C4057a.d(cVar.f274271k, InterfaceC35741a1.a.a(cVar.f274273m, new ApiException(apiError, null, 2, null), null, null, 6), null, null, new f.c(apiError), 0, null, null, null, 2030);
            cVar.j(ServiceBookingVerifyPhoneLink.b.a.f274260b);
        }
        return G0.f406611a;
    }
}
