package com.avito.android.crm_paid_cvs.view.list_items.favorite_item;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import com.avito.android.crm_paid_cvs.view.list_items.cv_item.r;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FavoriteItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/favorite_item/l;", "Lcom/avito/android/crm_paid_cvs/view/list_items/favorite_item/d;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<CvItem, G0> f130900b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<CvItem, G0> f130901c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<CvItem, G0> f130902d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f130903e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f130904f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f130905g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f130906h;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public l(@Y61.k @Named("CV_ACTION") Y41.l<? super CvItem, G0> lVar, @Y61.k @Named("FAVORITES_ACTION") Y41.l<? super CvItem, G0> lVar2, @Y61.k @Named("COMPARISON_ACTION") Y41.l<? super CvItem, G0> lVar3, @Y61.k Y41.l<? super DeepLink, G0> lVar4, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12) {
        this.f130900b = lVar;
        this.f130901c = lVar2;
        this.f130902d = lVar3;
        this.f130903e = lVar4;
        this.f130904f = interfaceC28373a;
        this.f130905g = e12.a();
        CvListState.Tab tab = CvListState.Tab.f130509c;
        this.f130906h = "favorites";
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.crm_paid_cvs.view.list_items.cv_item.l lVar = (com.avito.android.crm_paid_cvs.view.list_items.cv_item.l) eVar;
        CvItem cvItem = (CvItem) aVar;
        if (cvItem.f130344t) {
            lVar.c0();
            if (cvItem.f130345u) {
                return;
            }
            this.f130900b.invoke(cvItem);
            return;
        }
        if (cvItem.f130346v) {
            lVar.l9(new e(cvItem, this));
            return;
        }
        lVar.C0();
        lVar.qe(cvItem.f130327c);
        lVar.setTitle(cvItem.f130328d);
        lVar.uK(cvItem.f130331g);
        lVar.f(cvItem.f130329e);
        lVar.pl(cvItem.f130330f);
        lVar.wC(cvItem.f130333i);
        lVar.j7(cvItem.f130334j);
        lVar.v7(cvItem.f130335k);
        lVar.Ze(new f(cvItem, this));
        boolean z12 = cvItem.f130340p;
        lVar.setActive(z12);
        boolean z13 = cvItem.f130343s;
        DeepLink deepLink = cvItem.f130339o;
        lVar.Zm(new g(this, cvItem, deepLink), (!z12 || z13 || deepLink == null) ? false : true);
        DeepLink deepLink2 = cvItem.f130337m;
        lVar.kr(new h(this, cvItem, deepLink2), z12 && z13 && deepLink2 != null);
        DeepLink deepLink3 = cvItem.f130338n;
        lVar.DX(new i(this, cvItem, deepLink3), z12 && z13 && deepLink3 != null);
        lVar.Fr(z12, cvItem.f130341q, new j(cvItem, this));
        lVar.l60(z12, cvItem.f130342r, new k(cvItem, this));
        lVar.xG(r.f130855l, false);
    }
}
