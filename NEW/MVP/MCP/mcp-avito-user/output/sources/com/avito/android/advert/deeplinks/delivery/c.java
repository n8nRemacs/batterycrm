package com.avito.android.advert.deeplinks.delivery;

import com.avito.android.R;
import com.avito.android.deep_linking.links.RequestDeliveryLink;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.G;
import kotlin.Metadata;

/* compiled from: RequestDeliveryDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "wasShowed", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f68926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RequestDeliveryLink f68927c;

    public c(a aVar, RequestDeliveryLink requestDeliveryLink) {
        this.f68926b = aVar;
        this.f68927c = requestDeliveryLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a aVar = this.f68926b;
        RequestDeliveryLink requestDeliveryLink = this.f68927c;
        if (zBooleanValue) {
            aVar.l(requestDeliveryLink);
            return;
        }
        aVar.f68905f.c(new Y3.c(aVar.f68906g.a(), requestDeliveryLink.f133634b));
        aVar.f68908i.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new k(aVar, requestDeliveryLink));
        G gB2 = aVar.f68916q.b();
        InterfaceC35745a5 interfaceC35745a5 = aVar.f68912m;
        aVar.f68918s.b(gB2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(e.f68929b, f.f68930b));
    }
}
