package com.avito.android.user_advert.advert;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import com.avito.android.user_advert.advert.items.support_automation.d;
import com.avito.android.util.Kundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_advert/advert/j0;", "Lcom/avito/android/user_advert/advert/t1;", "Lcom/avito/android/deep_linking/links/w;", "Lcom/avito/android/advert_core/expand_items_button/f;", "Lcom/avito/android/user_advert/advert/items/support_automation/d$a;", "b", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC35426j0 extends t1, com.avito.android.deep_linking.links.w, com.avito.android.advert_core.expand_items_button.f, d.a {

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.j0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC35426j0 interfaceC35426j0, boolean z12, b bVar, int i12) {
            if ((i12 & 1) != 0) {
                z12 = false;
            }
            if ((i12 & 2) != 0) {
                bVar = b.C9510b.f310420a;
            }
            interfaceC35426j0.n4(z12, bVar, true);
        }

        public static /* synthetic */ void b(InterfaceC35426j0 interfaceC35426j0, b bVar, int i12) {
            if ((i12 & 1) != 0) {
                bVar = b.C9510b.f310420a;
            }
            interfaceC35426j0.Hb(bVar);
        }
    }

    /* compiled from: MyAdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/user_advert/advert/j0$b;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/user_advert/advert/j0$b$a;", "Lcom/avito/android/user_advert/advert/j0$b$b;", "Lcom/avito/android/user_advert/advert/j0$b$c;", "Lcom/avito/android/user_advert/advert/j0$b$d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.j0$b */
    public static abstract class b {

        /* compiled from: MyAdvertDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/j0$b$a;", "Lcom/avito/android/user_advert/advert/j0$b;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_advert.advert.j0$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f310419a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: MyAdvertDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/j0$b$b;", "Lcom/avito/android/user_advert/advert/j0$b;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_advert.advert.j0$b$b, reason: collision with other inner class name */
        public static final class C9510b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9510b f310420a = new C9510b();

            public C9510b() {
                super(null);
            }
        }

        /* compiled from: MyAdvertDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/j0$b$c;", "Lcom/avito/android/user_advert/advert/j0$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_advert.advert.j0$b$c */
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final DeepLink f310421a;

            public c(@Y61.l DeepLink deepLink) {
                super(null);
                this.f310421a = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f310421a, ((c) obj).f310421a);
            }

            public final int hashCode() {
                DeepLink deepLink = this.f310421a;
                if (deepLink == null) {
                    return 0;
                }
                return deepLink.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Edit(postAction="), this.f310421a, ')');
            }
        }

        /* compiled from: MyAdvertDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/j0$b$d;", "Lcom/avito/android/user_advert/advert/j0$b;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_advert.advert.j0$b$d */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f310422a = new d();

            public d() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    void B1(@Y61.k OH0.e eVar, boolean z12);

    void F9(@Y61.k com.avito.android.user_advert.advert.items.realty.verification.a aVar);

    void G1(@Y61.k DeepLink deepLink, @Y61.k String str);

    void Hb(@Y61.k b bVar);

    void I6(@Y61.k CloseReason closeReason, @Y61.l String str);

    void J1(@Y61.k com.avito.android.user_advert.advert.items.alert_banner.a aVar);

    void J2(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity);

    void Jb(@Y61.k com.avito.android.user_advert.advert.items.stats.a aVar, @Y61.k DeepLink deepLink);

    void K0(@Y61.k com.avito.android.user_advert.advert.items.alert_banner.a aVar);

    void L1(@Y61.k com.avito.android.user_advert.advert.items.auto_publish.a aVar, boolean z12);

    void Nb(boolean z12);

    void O1(@Y61.k com.avito.android.user_advert.advert.items.services.a aVar, @Y61.k DeepLink deepLink);

    void O7(@Y61.k com.avito.android.user_advert.advert.items.service_booking_reminder.c cVar);

    void P0(@Y61.k com.avito.android.user_advert.advert.items.installments_promoblock.a aVar);

    void P1(@Y61.k c.b.a aVar, boolean z12);

    void Qa(@Y61.k ActionsItem.Action action);

    void R3(@Y61.k com.avito.android.user_advert.advert.items.machinery_rental_banner.e eVar);

    void S1(@Y61.k DeepLink deepLink);

    void T1(@Y61.k com.avito.android.user_advert.advert.items.auto_publish.a aVar, @Y61.k DeepLink deepLink);

    void U0(@Y61.k com.avito.android.user_advert.advert.items.gallery.c cVar, int i12);

    void U1(@Y61.k com.avito.android.user_advert.advert.items.address.a aVar);

    @Y61.k
    Kundle Ua();

    void V1(@Y61.k List<MultiAddressesItem> list);

    void Vd(@Y61.k DeepLink deepLink);

    void W0(@Y61.k OH0.a aVar);

    void W5(@Y61.k DeepLink deepLink);

    void X0(@Y61.k DeepLink deepLink);

    void X1(@Y61.k OH0.e eVar, @Y61.k DeepLink deepLink);

    void X3();

    void X4(@Y61.k DeepLink deepLink);

    void X5(@Y61.k com.avito.android.user_advert.advert.items.multi_urgency.l lVar);

    void Yd();

    void Z1(@Y61.k com.avito.android.user_advert.advert.items.address.a aVar);

    void Z8();

    void a1(@Y61.k com.avito.android.user_advert.advert.items.description.a aVar);

    void a2(@Y61.k com.avito.android.user_advert.advert.items.safe_show.a aVar);

    void bb(@Y61.k com.avito.android.user_advert.advert.items.realty.verification.a aVar);

    void c0();

    void d4(@Y61.k C35436m1 c35436m1);

    void e0();

    void f1(@Y61.k DeepLink deepLink);

    void i0();

    void i1(@Y61.k com.avito.android.user_advert.advert.items.auction_banner.a aVar);

    void k3(@Y61.k com.avito.android.user_advert.advert.items.promo_block_feed.a aVar);

    void l8(int i12);

    void lb();

    void n4(boolean z12, @Y61.k b bVar, boolean z13);

    void n5(boolean z12);

    void q7(@Y61.k AdvertParameters.Button button, @Y61.l String str);

    void rc(@Y61.k com.avito.android.user_advert.advert.items.machinery_rental_banner.e eVar);

    void s0();

    void sd(@Y61.k ActionsItem.Action action);

    void t7(@Y61.k DeepLink deepLink);

    void t9(@Y61.k String str, boolean z12);

    void tc(@Y61.k com.avito.android.user_advert.advert.items.realty.verification.a aVar, @Y61.k String str);

    void u6(@Y61.k ActionsItem.Action action, @Y61.k ActionsItem actionsItem);

    void u7(@Y61.k com.avito.android.user_advert.advert.items.realty.verification.a aVar);

    void ud(@Y61.k com.avito.android.user_advert.advert.items.reject.a aVar, @Y61.k DeepLink deepLink);

    void v0(@Y61.k DeepLink deepLink, @Y61.k String str);

    void v1(@Y61.k com.avito.android.user_advert.advert.items.sales_contract.a aVar);

    void w9(@Y61.k DeepLink deepLink);

    void wd(@Y61.k AbstractC35385e abstractC35385e, @Y61.l String str, @Y61.l String str2, @Y61.l MyAdvertPostAction myAdvertPostAction, boolean z12, boolean z13);

    void x0(@Y61.k com.avito.android.user_advert.advert.items.gallery.c cVar, int i12);

    void x7(@Y61.k com.avito.android.user_advert.advert.items.multiaddresses.a aVar);

    void x9();

    void y0(@Y61.k com.avito.android.user_advert.advert.items.verification.a aVar);

    void y1(@Y61.k com.avito.android.user_advert.advert.items.alert_banner.a aVar);

    void z0(@Y61.k OH0.b bVar, @Y61.k DeepLink deepLink);

    void z7();
}
