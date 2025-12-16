package com.avito.android.crm_paid_cvs.view.list_items.searches_item;

import Y41.l;
import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.crm_paid_cvs.dto.SearchItem;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchesItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/searches_item/g;", "Lcom/avito/android/crm_paid_cvs/view/list_items/searches_item/d;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f130997b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f130998c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f130999d;

    @Inject
    public g(@k l lVar, @k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f130997b = lVar;
        this.f130998c = interfaceC28373a;
        this.f130999d = e12.a();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        SearchItem searchItem = (SearchItem) aVar;
        iVar.setTitle(searchItem.f130377c);
        iVar.h(searchItem.f130378d);
        iVar.ZK(searchItem.f130379e);
        iVar.jH(new e(this, searchItem));
        iVar.eK(new f(this, searchItem));
    }
}
