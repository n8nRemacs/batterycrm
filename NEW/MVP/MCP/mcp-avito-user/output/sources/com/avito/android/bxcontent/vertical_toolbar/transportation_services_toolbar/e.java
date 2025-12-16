package com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar;

import Ev0.InterfaceC13533a;
import Ev0.InterfaceC13534b;
import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.serp.adapter.l1;
import com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import k3.C42483a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import tl.InterfaceC48685a;

/* compiled from: ServicesTransportationWidgetToolbarPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/transportation_services_toolbar/e;", "Lcom/avito/android/bxcontent/vertical_toolbar/transportation_services_toolbar/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.services_transportation_widget.item.d f113123b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f113124c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f113125d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Z1<com.avito.android.ui.status_bar.d> f113126e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final n2<com.avito.android.ui.status_bar.d> f113127f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public BxContentFragment.I f113128g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public com.avito.android.services_transportation_widget.item.k f113129h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public h f113130i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public ServiceTransportationWidgetItem f113131j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public InterfaceC48685a f113132k;

    @Inject
    public e(@k com.avito.android.services_transportation_widget.item.d dVar, @InterfaceC13533a @k j jVar, @InterfaceC13534b @k com.avito.konveyor.adapter.a aVar) {
        this.f113123b = dVar;
        this.f113124c = jVar;
        this.f113125d = aVar;
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f113126e = z1A;
        this.f113127f = z1A;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.a
    public final void N1(@k h hVar, @k BxContentFragment.I i12, @k InterfaceC48685a interfaceC48685a) {
        this.f113130i = hVar;
        this.f113128g = i12;
        this.f113132k = interfaceC48685a;
        this.f113129h = new com.avito.android.services_transportation_widget.item.k(hVar.T1(), this.f113125d, this.f113124c);
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.a
    public final void e(@l l1 l1Var) {
        h hVar;
        com.avito.android.services_transportation_widget.item.k kVar;
        ServiceTransportationWidgetItem serviceTransportationWidgetItem = l1Var instanceof ServiceTransportationWidgetItem ? (ServiceTransportationWidgetItem) l1Var : null;
        if (serviceTransportationWidgetItem == null) {
            if (this.f113131j == null) {
                return;
            }
            this.f113126e.setValue(null);
            BxContentFragment.I i12 = this.f113128g;
            if (i12 != null) {
                BxContentFragment bxContentFragment = BxContentFragment.this;
                BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
                bxContentFragment.a6(false, false);
                bxContentFragment.K5().Oy(false);
                return;
            }
            return;
        }
        if (new C42483a(serviceTransportationWidgetItem, this.f113131j).f406029c) {
            return;
        }
        this.f113131j = serviceTransportationWidgetItem;
        ServiceTransportationWidget.SearchHeaderConfig searchHeaderConfig = serviceTransportationWidgetItem.f280537k;
        if (searchHeaderConfig == null || (hVar = this.f113130i) == null || (kVar = this.f113129h) == null) {
            return;
        }
        this.f113123b.O5(kVar, serviceTransportationWidgetItem, -1);
        hVar.a(searchHeaderConfig.getHeaderTitle(), searchHeaderConfig.getHeaderDescription(), searchHeaderConfig.getBackgroundColor(), searchHeaderConfig.getBackgroundColor(), searchHeaderConfig.getThumbColor(), new b(this), new c(this), new d(this));
        BxContentFragment.I i13 = this.f113128g;
        if (i13 != null) {
            BxContentFragment bxContentFragment2 = BxContentFragment.this;
            BxContentFragment.C28907a c28907a2 = BxContentFragment.f108886v5;
            bxContentFragment2.a6(true, false);
            bxContentFragment2.K5().Oy(true);
        }
    }

    @Override // com.avito.android.ui.status_bar.k
    @k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f113127f;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.a
    public final void f0() {
        this.f113130i = null;
        this.f113128g = null;
        this.f113129h = null;
        this.f113132k = null;
        this.f113131j = null;
    }
}
