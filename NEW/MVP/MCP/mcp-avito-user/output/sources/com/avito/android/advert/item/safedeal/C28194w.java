package com.avito.android.advert.item.safedeal;

import android.os.Bundle;
import com.avito.android.advert.item.InterfaceC27816b0;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.remote.safedeal.SafeDeal;
import java.util.List;
import k4.InterfaceC42497a;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deeplink_handler/handler/bundle/a;", "Lcom/avito/android/remote/safedeal/a;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.safedeal.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28194w<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28180h f79255b;

    public C28194w(C28180h c28180h) {
        this.f79255b = c28180h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        com.avito.android.deeplink_handler.handler.bundle.a aVar = (com.avito.android.deeplink_handler.handler.bundle.a) q12.f406619b;
        com.avito.android.remote.safedeal.a aVar2 = (com.avito.android.remote.safedeal.a) q12.f406620c;
        C28180h c28180h = this.f79255b;
        c28180h.f78833n.qe(aVar2.getQuantity());
        Bundle bundle = aVar.f134522c;
        String string = bundle != null ? bundle.getString("componentId") : null;
        SafeDeal.Component.Button button = aVar2.getButton();
        String id2 = button.getId();
        if (id2 != null) {
            string = id2;
        } else if (string == null) {
            return;
        }
        C28193v c28193v = new C28193v(string, c28180h, button);
        com.avito.android.advert_core.safedeal.trust_factors.a aVar3 = c28180h.f78831l;
        List<? extends TrustFactorsComponent> listInvoke = c28193v.invoke(aVar3.f84276a);
        aVar3.f84276a = listInvoke;
        c28180h.f78838s.invoke(new InterfaceC42497a.n(listInvoke));
        InterfaceC27816b0 interfaceC27816b0Z = c28180h.z(c28180h.f78814C);
        if (interfaceC27816b0Z != null) {
            interfaceC27816b0Z.d(listInvoke, true);
        }
        c28180h.f78826g.K();
    }
}
