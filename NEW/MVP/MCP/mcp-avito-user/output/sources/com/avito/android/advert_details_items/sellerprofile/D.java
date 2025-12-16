package com.avito.android.advert_details_items.sellerprofile;

import Ca.AbstractC13232a;
import android.os.Parcelable;
import com.avito.android.advert.item.W0;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSeller;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.auto_select.AutoSelectControls;
import com.avito.android.remote.model.auto_select.SelectLayoutMode;
import com.avito.android.remote.model.insights.Insight;
import com.avito.android.remote.model.item_popularity.ItemPopularity;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.O2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: AdvertSellerPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/D;", "Lcom/avito/android/advert_details_items/sellerprofile/j;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class D implements InterfaceC28280j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f85543a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f85544b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<S9.a> f85545c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f85546d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l41.g<AbstractC13232a> f85547e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.installments.d f85548f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.price_with_delivery.c f85549g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.short_term_rent.a f85550h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.toast_item_popularity.a f85551i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f85552j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final a0 f85553k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f85554l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public W0 f85555m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_core.contactbar.A f85556n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSellerProfileItem f85557o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsStyle f85558p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f85559q = new io.reactivex.rxjava3.disposables.c();

    /* JADX WARN: Multi-variable type inference failed */
    public D(@Y61.k E e12, @Y61.k InterfaceC28265d interfaceC28265d, @Y61.k List<? extends S9.a> list, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k l41.g<AbstractC13232a> gVar, @Y61.k com.avito.android.credits.installments.d dVar, @Y61.k com.avito.android.advert_core.price_with_delivery.c cVar, @Y61.k com.avito.android.advert_core.short_term_rent.a aVar2, @Y61.k com.avito.android.advert_details_items.toast_item_popularity.a aVar3, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l a0 a0Var) {
        this.f85543a = e12;
        this.f85544b = interfaceC28265d;
        this.f85545c = list;
        this.f85546d = aVar;
        this.f85547e = gVar;
        this.f85548f = dVar;
        this.f85549g = cVar;
        this.f85550h = aVar2;
        this.f85551i = aVar3;
        this.f85552j = interfaceC35745a5;
        this.f85553k = a0Var;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void I() {
        this.f85544b.e0();
        this.f85543a.e0();
        this.f85556n = null;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void J(@Y61.k InterfaceC28278h interfaceC28278h) {
        this.f85543a.J(interfaceC28278h);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void K() {
        AdvertDetails advertDetails = this.f85554l;
        if (advertDetails == null) {
            return;
        }
        this.f85544b.eb(advertDetails);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void L(@Y61.k com.avito.android.advert_core.contactbar.A a12) {
        this.f85556n = a12;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void M(@Y61.k AdvertDetails advertDetails, @Y61.l AdvertDetailsStyle advertDetailsStyle) {
        this.f85554l = advertDetails;
        this.f85558p = advertDetailsStyle;
        AdvertSeller seller = advertDetails.getSeller();
        if (seller != null) {
            advertDetails.isShopAdvert();
            advertDetails.isFromCompany();
            UserIconType userIconTypeB = V9.a.b(advertDetails);
            boolean z12 = advertDetails.isRedesign() || advertDetails.isServicesRedesign();
            boolean z13 = advertDetails.isRestyle() || advertDetails.isRealtyRedesign();
            advertDetails.isServicesRedesign();
            this.f85543a.w4(seller, userIconTypeB, null, z12, z13);
        }
        a(advertDetails);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void N(@Y61.k AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem) {
        AdvertSeller seller;
        this.f85557o = advertDetailsSellerProfileItem;
        AdvertDetails advertDetails = this.f85554l;
        if (advertDetails == null || (seller = advertDetails.getSeller()) == null) {
            return;
        }
        advertDetails.isShopAdvert();
        advertDetails.isFromCompany();
        UserIconType userIconTypeB = V9.a.b(advertDetails);
        SellerSubscriptionState sellerSubscriptionState = advertDetailsSellerProfileItem.f85535e.length() > 0 ? advertDetailsSellerProfileItem.f85536f : null;
        boolean zIsRedesign = advertDetails.isRedesign();
        boolean z12 = advertDetails.isRestyle() || advertDetails.isRealtyRedesign();
        advertDetails.isServicesRedesign();
        this.f85543a.w4(seller, userIconTypeB, sellerSubscriptionState, zIsRedesign, z12);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void R1(boolean z12) {
        this.f85544b.R1(z12);
    }

    public final void a(AdvertDetails advertDetails) {
        long j12;
        AdvertDetailsStyle advertDetailsStyle = this.f85558p;
        if (advertDetailsStyle == null) {
            advertDetailsStyle = AdvertDetailsStyle.f84409c;
        }
        AdvertDetailsStyle.a aVar = advertDetailsStyle.f84415b;
        InterfaceC28265d interfaceC28265d = this.f85544b;
        List<ContactBar.Button> listUa = interfaceC28265d.Ua();
        ArrayList arrayList = new ArrayList(C42745f0.q(listUa, 10));
        Iterator<T> it = listUa.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Parcelable parcelableD = (ContactBar.Button) it.next();
            if (parcelableD instanceof ContactBar.Button.Action) {
                parcelableD = ContactBar.Button.Action.d((ContactBar.Button.Action) parcelableD, true ^ aVar.f84416a, 1048063);
            }
            arrayList.add(parcelableD);
        }
        List<ContactBar.InfoStickyBlock> listVa = interfaceC28265d.Va();
        AutoSelectControls autoSelectControls = advertDetails.getAutoSelectControls();
        ContactBar.b c3717b = null;
        boolean z12 = (autoSelectControls != null ? autoSelectControls.getLayoutMode() : null) == SelectLayoutMode.PRIORITY_SCALED;
        AdvertShortTermRent shortTermRent = advertDetails.getShortTermRent();
        List<Insight> insights = shortTermRent != null ? shortTermRent.getInsights() : null;
        AdvertShortTermRent shortTermRent2 = advertDetails.getShortTermRent();
        ItemPopularity itemPopularity = shortTermRent2 != null ? shortTermRent2.getItemPopularity() : null;
        com.avito.android.advert_core.contactbar.A a12 = this.f85556n;
        ContactBarData contactBarDataC = V9.a.c(advertDetails, null, false, false, false, z12, false, 191);
        if (itemPopularity != null) {
            if (this.f85551i.b()) {
                com.avito.android.advert_details_items.toast_item_popularity.d dVar = com.avito.android.advert_details_items.toast_item_popularity.d.f85760a;
                long toastTimeDelay = itemPopularity.getToastTimeDelay();
                dVar.getClass();
                j12 = toastTimeDelay + 1800;
            } else {
                j12 = 0;
            }
            c3717b = new ContactBar.b.a(j12, insights, itemPopularity.getTagText());
        } else if (this.f85550h.c(advertDetails.getShortTermRent()) && O2.a(insights)) {
            c3717b = new ContactBar.b.C3717b(insights);
        }
        this.f85544b.vb(a12, contactBarDataC, arrayList, listVa, c3717b);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void c0() {
        this.f85559q.e();
        this.f85555m = null;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j
    public final void m(@Y61.k W0 w02) {
        this.f85555m = w02;
        Iterator<T> it = this.f85545c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            io.reactivex.rxjava3.disposables.c cVar = this.f85559q;
            if (!zHasNext) {
                InterfaceC28265d interfaceC28265d = this.f85544b;
                com.jakewharton.rxrelay3.c f83200i0 = interfaceC28265d.getF83200i0();
                C28291v c28291v = new C28291v(w02);
                l41.g<? super Throwable> gVar = C28292w.f85647b;
                f83200i0.getClass();
                InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar.b(f83200i0.v0(c28291v, gVar, interfaceC43543a));
                E e12 = this.f85543a;
                com.jakewharton.rxrelay3.c f85565f = e12.getF85565f();
                C28293x c28293x = new C28293x(w02);
                l41.g<? super Throwable> gVar2 = C28294y.f85649b;
                f85565f.getClass();
                cVar.b(f85565f.v0(c28293x, gVar2, interfaceC43543a));
                com.jakewharton.rxrelay3.c f83160d = interfaceC28265d.getF83160D();
                InterfaceC35745a5 interfaceC35745a5 = this.f85552j;
                cVar.b(A1.h(f83160d.j0(interfaceC35745a5.e()), new C28295z(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new A(this), 2));
                cVar.b(this.f85549g.getF395655f().j0(interfaceC35745a5.e()).t0(new B(this)));
                com.avito.android.credits.installments.d dVar = this.f85548f;
                cVar.b(dVar.getF128871d().j0(interfaceC35745a5.e()).t0(new C(this)));
                cVar.b(dVar.getF128873f().j0(interfaceC35745a5.e()).t0(new C28285o(this)));
                cVar.b(interfaceC28265d.getF83157A().N(C28286p.f85630b).t0(new C28287q(w02, this)));
                com.jakewharton.rxrelay3.c f83206l0 = interfaceC28265d.getF83206l0();
                r rVar = new r(this);
                l41.g<? super Throwable> gVar3 = C28288s.f85634b;
                f83206l0.getClass();
                cVar.b(f83206l0.v0(rVar, gVar3, interfaceC43543a));
                com.jakewharton.rxrelay3.c f85566g = e12.getF85566g();
                C28289t c28289t = new C28289t(this);
                l41.g<? super Throwable> gVar4 = C28290u.f85645b;
                f85566g.getClass();
                cVar.b(f85566g.v0(c28289t, gVar4, interfaceC43543a));
                return;
            }
            S9.a aVar = (S9.a) it.next();
            com.jakewharton.rxrelay3.c f85563d = aVar.getF85563d();
            C28281k c28281k = new C28281k(this, aVar);
            l41.g<? super Throwable> gVar5 = C28282l.f85626b;
            f85563d.getClass();
            InterfaceC43543a interfaceC43543a2 = io.reactivex.rxjava3.internal.functions.a.f401993c;
            cVar.b(f85563d.v0(c28281k, gVar5, interfaceC43543a2));
            if (aVar instanceof E) {
                com.jakewharton.rxrelay3.c f85564e = ((E) aVar).getF85564e();
                C28283m c28283m = new C28283m(this);
                l41.g<? super Throwable> gVar6 = C28284n.f85628b;
                f85564e.getClass();
                cVar.b(f85564e.v0(c28283m, gVar6, interfaceC43543a2));
            }
        }
    }
}
