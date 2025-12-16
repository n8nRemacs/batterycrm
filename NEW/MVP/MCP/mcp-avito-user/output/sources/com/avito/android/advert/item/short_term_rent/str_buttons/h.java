package com.avito.android.advert.item.short_term_rent.str_buttons;

import Ju.C14248b;
import Ju.InterfaceC14249c;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.short_term_rent.entity.ShortTermRentStrButtons;
import com.avito.android.advert.item.short_term_rent.str_buttons.c;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.str_core.OpenBuyerOrderBookingDeepLink;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.o;
import l41.r;

/* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/str_buttons/h;", "Lcom/avito/android/advert/item/short_term_rent/str_buttons/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements com.avito.android.advert.item.short_term_rent.str_buttons.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f80151b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f80152c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f80153d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final c.a f80154e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f80155f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f80156g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.short_term_rent.str_buttons.k f80157h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f80158i;

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            h.this.f80154e.q();
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f80160b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "key_advert_details_str_buttons");
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f80161b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof C14248b;
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.advert.item.short_term_rent.str_buttons.k kVar = h.this.f80157h;
            if (kVar != null) {
                kVar.hide();
            }
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f80163b = new e<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "key_advert_details_str_buttons");
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f80164b = new f<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof CalendarLink.b.C3988b;
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "LJu/c;", "apply", "(Lkv/a;)LJu/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f80165b = new g<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((C43501a) obj).f413261b;
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJu/c;", "it", "Lkotlin/G0;", "accept", "(LJu/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.short_term_rent.str_buttons.h$h, reason: collision with other inner class name */
    public static final class C2369h<T> implements l41.g {
        public C2369h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            h hVar = h.this;
            hVar.getClass();
            CalendarLink.b.C3988b c3988b = (CalendarLink.b.C3988b) ((InterfaceC14249c) obj);
            hVar.f80154e.E0(c3988b.f133080b, c3988b.f133081c);
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f80167b = new i<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "key_advert_details_str_buttons");
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T> f80168b = new j<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof OpenBuyerOrderBookingDeepLink.c;
        }
    }

    /* compiled from: AdvertDetailsShortTermRentStrButtonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<Uri, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            h hVar = h.this;
            h.k(hVar, hVar.f80152c.e(uri));
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k x xVar, @Y61.k @InterfaceC30174s String str, @Y61.k c.a aVar2, @Y61.k InterfaceC28265d interfaceC28265d) {
        this.f80151b = aVar;
        this.f80152c = xVar;
        this.f80153d = str;
        this.f80154e = aVar2;
        this.f80155f = interfaceC28265d;
    }

    public static final void k(h hVar, DeepLink deepLink) {
        hVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("advert_id", hVar.f80153d);
        G0 g02 = G0.f406611a;
        hVar.f80151b.r6(bundle, deepLink, "key_advert_details_str_buttons");
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.advert.item.short_term_rent.str_buttons.k kVar = (com.avito.android.advert.item.short_term_rent.str_buttons.k) eVar;
        AdvertDetailsShortTermRentStrButtonsItem advertDetailsShortTermRentStrButtonsItem = (AdvertDetailsShortTermRentStrButtonsItem) aVar;
        this.f80157h = kVar;
        boolean z12 = advertDetailsShortTermRentStrButtonsItem.f80140e;
        this.f80158i = z12;
        kVar.LJ(advertDetailsShortTermRentStrButtonsItem.f80139d, z12, new com.avito.android.advert.item.short_term_rent.str_buttons.g(this));
    }

    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.c
    public final void W4(@Y61.k ShortTermRentStrButtons shortTermRentStrButtons) {
        com.avito.android.advert.item.short_term_rent.str_buttons.k kVar = this.f80157h;
        if (kVar != null) {
            kVar.LJ(shortTermRentStrButtons, this.f80158i, new k());
        }
    }

    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.c
    public final void i() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f80151b;
        io.reactivex.rxjava3.disposables.d dVarT0 = aVar.V9().N(b.f80160b).N(c.f80161b).t0(new d());
        io.reactivex.rxjava3.disposables.c cVar = this.f80156g;
        cVar.b(dVarT0);
        cVar.b(aVar.d9().N(e.f80163b).N(f.f80164b).d0(g.f80165b).t0(new C2369h()));
        cVar.b(aVar.d9().N(i.f80167b).N(j.f80168b).t0(new a()));
    }

    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.c
    public final void q1() {
        this.f80156g.b(A1.h(this.f80155f.getF83157A().N(com.avito.android.advert.item.short_term_rent.str_buttons.d.f80148b), new com.avito.android.advert.item.short_term_rent.str_buttons.e(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new com.avito.android.advert.item.short_term_rent.str_buttons.f(this), 2));
    }

    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.c
    public final void t() {
        this.f80156g.e();
        this.f80157h = null;
    }
}
