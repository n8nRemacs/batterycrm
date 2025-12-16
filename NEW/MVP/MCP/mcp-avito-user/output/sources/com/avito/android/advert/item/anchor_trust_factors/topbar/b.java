package com.avito.android.advert.item.anchor_trust_factors.topbar;

import android.view.ViewStub;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.I1;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.N;
import r4.C47486a;

/* compiled from: AdvertDetailsTopBarAnchorsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/topbar/b;", "Lcom/avito/android/advert/item/anchor_trust_factors/topbar/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.anchor_trust_factors.topbar.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f72849a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f72850b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public I1 f72851c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public k f72852d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72853e = y6.b(20);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super C47486a.C12352a, G0> f72854f = new a();

    /* compiled from: AdvertDetailsTopBarAnchorsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr4/a$a;", "button", "Lkotlin/G0;", "invoke", "(Lr4/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<C47486a.C12352a, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C47486a.C12352a c12352a) {
            String str;
            Integer numB;
            C47486a.C12352a c12352a2 = c12352a;
            b bVar = b.this;
            I1 i12 = bVar.f72851c;
            k kVar = bVar.f72852d;
            if (i12 != null && kVar != null && (str = c12352a2.f429575a) != null && (numB = bVar.f72850b.b(str, i12)) != null) {
                i12.L(numB.intValue(), kVar.c().height());
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k h hVar, @Y61.k d dVar) {
        this.f72849a = hVar;
        this.f72850b = dVar;
    }

    @Override // z7.InterfaceC50381a
    public final void a(int i12, int i13) {
        k kVar;
        I1 i14 = this.f72851c;
        if (i14 == null || (kVar = this.f72852d) == null) {
            return;
        }
        d dVar = this.f72850b;
        boolean zA2 = dVar.a(i12, i14);
        h hVar = this.f72849a;
        if (!zA2) {
            kVar.hide();
            dVar.d();
            hVar.c(B0.f406639b);
            kVar.b(hVar.getF72866a());
            return;
        }
        dVar.g(hVar.getF72866a(), i14);
        if (dVar.c()) {
            hVar.c(dVar.f(i12, i13, kVar.c().bottom + this.f72853e, i14));
            kVar.b(hVar.getF72866a());
        }
        kVar.show();
    }

    @Override // z7.InterfaceC50381a
    public final void b() {
        this.f72851c = null;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.a
    public final void c() {
        this.f72852d = null;
    }

    @Override // z7.InterfaceC50381a
    public final void d(@Y61.k I1 i12) {
        this.f72851c = i12;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.a
    public final void e(@Y61.k l lVar) {
        this.f72852d = lVar;
    }

    @Override // z7.InterfaceC50381a
    public final void f(@Y61.k AdvertDetails advertDetails) {
        k kVar = this.f72852d;
        if (kVar == null) {
            return;
        }
        AnchorTrustFactors anchorTrustFactors = advertDetails.getAnchorTrustFactors();
        d dVar = this.f72850b;
        h hVar = this.f72849a;
        if (anchorTrustFactors == null) {
            hVar.reset();
            dVar.reset();
            kVar.b(hVar.getF72866a());
        } else {
            hVar.a(anchorTrustFactors, this.f72854f);
            hVar.b(anchorTrustFactors);
            dVar.e(hVar.getF72866a());
            kVar.b(hVar.getF72866a());
            kVar.a(hVar.getF72867b());
            kVar.d();
        }
        kVar.hide();
    }

    @Override // z7.InterfaceC50381a
    public final void g(@Y61.k AdvertDetails advertDetails) {
        I1 i12;
        ViewStub viewStub;
        if (advertDetails.getAnchorTrustFactors() == null || this.f72852d != null || (i12 = this.f72851c) == null || (viewStub = (ViewStub) i12.f71693b.findViewById(R.id.top_bar_bottom_sheet_style)) == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.advert_details_top_bar_anchors_container);
        l lVar = new l(viewStub, i12.f71712h0);
        i12.f71743u.e(lVar);
        i12.f71745v.e(lVar);
    }
}
