package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34812j extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271327l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f271328m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34812j(AdvertItem advertItem, s sVar) {
        super(0);
        this.f271327l = advertItem;
        this.f271328m = sVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<AdvertAction> actions;
        Object next;
        AdvertItem advertItem = this.f271327l;
        AdvertActions advertActions = advertItem.f268408U;
        DeepLink deepLink = null;
        if (advertActions != null && (actions = advertActions.getActions()) != null) {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdvertAction) next) instanceof AdvertAction.Messenger) {
                    break;
                }
            }
            AdvertAction advertAction = (AdvertAction) next;
            if (advertAction != null) {
                deepLink = advertAction.getDeepLink();
            }
        }
        if (deepLink != null) {
            this.f271328m.f271371b.get().W(advertItem.f268425c, deepLink, ContactSource.f89919d, null, null);
        }
        return G0.f406611a;
    }
}
