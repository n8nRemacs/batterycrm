package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import rn0.InterfaceC47691c;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34816n extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271337l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f271338m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f271339n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34816n(AdvertItem advertItem, v vVar, s sVar) {
        super(0);
        this.f271337l = advertItem;
        this.f271338m = vVar;
        this.f271339n = sVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertAction advertAction;
        List<AdvertAction> actions;
        Object next;
        AdvertActions advertActions = this.f271337l.f268408U;
        if (advertActions == null || (actions = advertActions.getActions()) == null) {
            advertAction = null;
        } else {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdvertAction) next) instanceof AdvertAction.ServiceOrderRequest) {
                    break;
                }
            }
            advertAction = (AdvertAction) next;
        }
        AdvertAction.ServiceOrderRequest serviceOrderRequest = advertAction instanceof AdvertAction.ServiceOrderRequest ? (AdvertAction.ServiceOrderRequest) advertAction : null;
        DeepLink deepLink = serviceOrderRequest != null ? serviceOrderRequest.getDeepLink() : null;
        if (deepLink != null) {
            if (deepLink instanceof com.avito.android.service_order_widget.link.a) {
                this.f271338m.y30();
                serviceOrderRequest.setLoading(true);
            }
            InterfaceC47691c.a.a(this.f271339n.f271371b.get(), deepLink, null, 14);
        }
        return G0.f406611a;
    }
}
