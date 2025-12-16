package com.avito.android.crm_paid_cvs.view.list_items.cv_item;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ProfileTab;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CvItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/j;", "Lcom/avito/android/crm_paid_cvs/view/list_items/cv_item/d;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<CvItem, G0> f130843b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f130844c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f130845d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f130846e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f130847f;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k @Named("CV_ACTION") Y41.l<? super CvItem, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12) {
        this.f130843b = lVar;
        this.f130844c = lVar2;
        this.f130845d = interfaceC28373a;
        this.f130846e = e12.a();
        CvListState.Tab tab = CvListState.Tab.f130509c;
        this.f130847f = ProfileTab.ALL;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        CvItem cvItem = (CvItem) aVar;
        if (cvItem.f130344t) {
            lVar.c0();
            if (cvItem.f130345u) {
                return;
            }
            this.f130843b.invoke(cvItem);
            return;
        }
        if (cvItem.f130346v) {
            lVar.l9(new e(cvItem, this));
            return;
        }
        lVar.C0();
        lVar.qe(cvItem.f130327c);
        lVar.setTitle(cvItem.f130328d);
        CvStatus cvStatus = null;
        boolean z12 = cvItem.f130340p;
        CvStatus cvStatus2 = cvItem.f130331g;
        if (cvStatus2 != null && z12) {
            cvStatus = cvStatus2;
        }
        lVar.uK(cvStatus);
        lVar.f(cvItem.f130329e);
        lVar.pl(cvItem.f130330f);
        lVar.wC(cvItem.f130333i);
        lVar.j7(cvItem.f130334j);
        lVar.v7(cvItem.f130335k);
        lVar.Ze(new f(cvItem, this));
        lVar.setActive(z12);
        lVar.xG(new g(cvItem, this), z12);
        DeepLink deepLink = cvItem.f130337m;
        lVar.kr(new h(this, cvItem, deepLink), z12 && deepLink != null);
        DeepLink deepLink2 = cvItem.f130338n;
        lVar.DX(new i(this, cvItem, deepLink2), z12 && deepLink2 != null);
        lVar.Zm(m.f130852l, false);
        lVar.l60(false, false, p.f130853l);
        lVar.Fr(false, false, q.f130854l);
    }
}
