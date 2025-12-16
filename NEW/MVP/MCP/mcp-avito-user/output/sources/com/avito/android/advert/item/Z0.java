package com.avito.android.advert.item;

import Zd.InterfaceC19542a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.widget.PopupWindow;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert.AdvertDetailsActivity;
import com.avito.android.advert.InterfaceC27793e;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogFragment;
import com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogOpenParams;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.analytics.event.service_booking.SbSignUpEvent;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliverySavedAddressCheckLink;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.NavigationSource;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.job.cv_packages.links.CvPackagesLink;
import com.avito.android.lib.design.modal.a;
import com.avito.android.photo_gallery.InterfaceC33199l;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBar;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.remote.model.GeoZones;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.LocationMap;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.GalleryBuyButtonData;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import nN.InterfaceC44295a;
import oO.f;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertDetailsRouter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/Z0;", "Lcom/avito/android/advert/item/W0;", "Lcom/avito/android/advert_core/map/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Z0 implements W0, com.avito.android.advert_core.map.j {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final ActivityC22955m f72292A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_core.analytics.a f72293B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f72294C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public androidx.appcompat.app.l f72295D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.advert_details_popup.e f72296E = new com.avito.android.advert.advert_details_popup.e();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f72297b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsFragment f72298c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C29640d f72299d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f72300e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27793e f72301f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19542a f72302g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final yf.m f72303h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.webview.l f72304i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f72305j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deal_confirmation.sheet.j f72306k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final oO.f f72307l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.f f72308m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30751h f72309n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final PhotoGalleryIntentFactory f72310o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33199l f72311p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_advice.l f72312q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.spare_parts.bottom_sheet.i f72313r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f72314s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f72315t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f72316u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44295a f72317v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.early_access_advert.d f72318w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f72319x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.properties.f f72320y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_amenities.dialog.a f72321z;

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Exception, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Intent f72322l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Intent intent) {
            super(1);
            this.f72322l = intent;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Exception exc) {
            V2.f318762a.e("Failed to open intent: " + this.f72322l, null);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.jakewharton.rxrelay3.c<H6.c> f72323l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.jakewharton.rxrelay3.c<H6.c> cVar) {
            super(0);
            this.f72323l = cVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f72323l.accept(H6.b.f6958a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.jakewharton.rxrelay3.c<H6.c> f72324l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.jakewharton.rxrelay3.c<H6.c> cVar) {
            super(0);
            this.f72324l = cVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f72324l.accept(H6.a.f6957a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.jakewharton.rxrelay3.c<H6.c> f72325l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.jakewharton.rxrelay3.c<H6.c> cVar) {
            super(0);
            this.f72325l = cVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f72325l.accept(H6.b.f6958a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.jakewharton.rxrelay3.c<H6.c> f72326l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.jakewharton.rxrelay3.c<H6.c> cVar) {
            super(0);
            this.f72326l = cVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f72326l.accept(H6.a.f6957a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.jakewharton.rxrelay3.c<H6.c> f72327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.jakewharton.rxrelay3.c<H6.c> cVar) {
            super(0);
            this.f72327l = cVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f72327l.accept(H6.b.f6958a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.jakewharton.rxrelay3.c<H6.c> f72328l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.jakewharton.rxrelay3.c<H6.c> cVar) {
            super(0);
            this.f72328l = cVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f72328l.accept(H6.a.f6957a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f72329l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f72330m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f72331n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f72332o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Context f72333p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f72334q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f72335r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Image f72336s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, String str2, String str3, String str4, Context context, Y41.a<kotlin.G0> aVar, Y41.a<kotlin.G0> aVar2, Image image) {
            super(2);
            this.f72329l = str;
            this.f72330m = str2;
            this.f72331n = str3;
            this.f72332o = str4;
            this.f72333p = context;
            this.f72334q = (kotlin.jvm.internal.N) aVar;
            this.f72335r = (kotlin.jvm.internal.N) aVar2;
            this.f72336s = image;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            bVar2.setTitle(this.f72329l);
            bVar2.setSubtitle(this.f72330m);
            bVar2.setButtonsOrientation(1);
            bVar2.L3(this.f72331n, new C27813a1(this.f72334q, dialogInterface2));
            bVar2.M3(this.f72332o, new C27817b1(this.f72335r, dialogInterface2));
            bVar2.K3(new C28125e1(this.f72336s));
            Context context = this.f72333p;
            bVar2.S3(context.getResources().getDimensionPixelSize(R.dimen.advert_details_return_checkout_dialog_image_width), context.getResources().getDimensionPixelSize(R.dimen.advert_details_return_checkout_dialog_image_height));
            return kotlin.G0.f406611a;
        }
    }

    public Z0(@Y61.k String str, @Y61.k AdvertDetailsFragment advertDetailsFragment, @Y61.k C29640d c29640d, @Y61.k com.avito.android.L l12, @Y61.k InterfaceC27793e interfaceC27793e, @Y61.k InterfaceC19542a interfaceC19542a, @Y61.k yf.m mVar, @Y61.k com.avito.android.webview.l lVar, @Y61.k com.avito.android.messenger.F f12, @Y61.k com.avito.android.deal_confirmation.sheet.j jVar, @Y61.k oO.f fVar, @Y61.k com.avito.android.credits.f fVar2, @Y61.k InterfaceC30751h interfaceC30751h, @Y61.k PhotoGalleryIntentFactory photoGalleryIntentFactory, @Y61.k InterfaceC33199l interfaceC33199l, @Y61.k com.avito.android.developments_advice.l lVar2, @Y61.k com.avito.android.spare_parts.bottom_sheet.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC44295a interfaceC44295a, @Y61.k com.avito.android.early_access_advert.d dVar, @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @Y61.k com.avito.android.advert.item.properties.f fVar3, @Y61.k com.avito.android.advert_amenities.dialog.a aVar2) {
        this.f72297b = str;
        this.f72298c = advertDetailsFragment;
        this.f72299d = c29640d;
        this.f72300e = l12;
        this.f72301f = interfaceC27793e;
        this.f72302g = interfaceC19542a;
        this.f72303h = mVar;
        this.f72304i = lVar;
        this.f72305j = f12;
        this.f72306k = jVar;
        this.f72307l = fVar;
        this.f72308m = fVar2;
        this.f72309n = interfaceC30751h;
        this.f72310o = photoGalleryIntentFactory;
        this.f72311p = interfaceC33199l;
        this.f72312q = lVar2;
        this.f72313r = iVar;
        this.f72314s = aVar;
        this.f72315t = interfaceC35845m2;
        this.f72316u = e12;
        this.f72317v = interfaceC44295a;
        this.f72318w = dVar;
        this.f72319x = interfaceC35945t1;
        this.f72320y = fVar3;
        this.f72321z = aVar2;
        this.f72292A = advertDetailsFragment.l1();
        Bundle bundleM = com.avito.android.actions_sheet.a.m("key_advert_id", str);
        NavigationSource[] navigationSourceArr = NavigationSource.f134362b;
        bundleM.putString("DeepLinkNavigationSource", "AdvertDetails");
        aVar.Qb(bundleM);
    }

    public final void A(@Y61.k DetailsSheetLinkBody detailsSheetLinkBody, @Y61.l ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
        ParametrizedEvent parametrizedEvent;
        if (parametrizedClickStreamEvent != null) {
            parametrizedEvent = new ParametrizedEvent(parametrizedClickStreamEvent.f90247b, parametrizedClickStreamEvent.f90248c, parametrizedClickStreamEvent.f90249d);
        } else {
            parametrizedEvent = null;
        }
        b.a.a(this.f72314s, new DetailsSheetLink(detailsSheetLinkBody, parametrizedEvent), null, null, 6);
    }

    @Override // com.avito.android.advert.item.sellersubscription.p.a, com.avito.android.favorite_sellers.adapter.recommendation.h.a
    public final void A0() {
        this.f72298c.startActivity(this.f72315t.a());
    }

    public final void B(@Y61.k AdvertDetails advertDetails, @Y61.l String str) {
        String id2 = advertDetails.getId();
        String title = advertDetails.getTitle();
        String note = advertDetails.getNote();
        this.f72298c.startActivityForResult(this.f72301f.c(id2, V9.a.c(advertDetails, null, false, false, false, false, false, 255), title, note, advertDetails.getIsFavorite(), str), 8);
    }

    @Override // com.avito.android.advert.item.sellersubscription.p.a
    public final void B0(@Y61.l Parcelable parcelable) {
        this.f72298c.G5(parcelable);
    }

    public final void C(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k AdvertDetailsStyle advertDetailsStyle, @Y61.l AdvertDetailsMultiItemState advertDetailsMultiItemState, @Y61.l AdvertNavBarStyle advertNavBarStyle, @Y61.l Parcelable parcelable, @Y61.k AdvertDetailsFastOpenParams.FromSpace fromSpace, @Y61.l String str3, @Y61.l PreloadCacheKey preloadCacheKey, @Y61.l String str4, @Y61.l AdvertDetailsFastOpenParams.GigAction gigAction) {
        ActivityC22955m activityC22955m = this.f72292A;
        if (activityC22955m == null) {
            return;
        }
        Integer num2 = null;
        AdvertDetailsArguments advertDetailsArguments = new AdvertDetailsArguments(str, num, str2, new AdvertDetailsFastOpenParams(null, null, null, null, null, null, null, advertDetailsStyle, null, fromSpace, str3, new AdvertDetailsFastOpenParams.GigParams(str4, gigAction), advertNavBarStyle), treeClickStreamParent, SystemClock.elapsedRealtime(), num2, ScreenSource.ADVERT.f251774d, null, advertDetailsMultiItemState, null, parcelable, preloadCacheKey, 1024, null);
        if (activityC22955m instanceof AdvertDetailsActivity) {
            AdvertDetailsFragment.f71351B5.getClass();
            AdvertDetailsFragment advertDetailsFragmentA = AdvertDetailsFragment.C27803a.a(advertDetailsArguments);
            androidx.fragment.app.H hE2 = ((AdvertDetailsActivity) activityC22955m).getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, advertDetailsFragmentA, "AdvertDetailsFragment");
            hE2.f();
            return;
        }
        NavigationTabSetItem navigationTabSetItemQ5 = this.f72298c.q5();
        if (navigationTabSetItemQ5 == null) {
            navigationTabSetItemQ5 = NavigationTab.f106970f;
        }
        activityC22955m.startActivity(this.f72300e.d(new AdvertDetailsFragmentData(advertDetailsArguments, navigationTabSetItemQ5, NavigationScreenAction.f107101c)));
    }

    public final void D(@Y61.k String str, @Y61.l Integer num, @Y61.l ConsultationFormData consultationFormData, @Y61.l String str2) {
        SerpResultCategoryDetails categoryDetails;
        AdvertDetails advertDetails = this.f72294C;
        this.f72298c.startActivityForResult(this.f72312q.a(consultationFormData, null, str, null, null, num != null ? num.toString() : null, str2, null, (advertDetails == null || (categoryDetails = advertDetails.getCategoryDetails()) == null) ? null : categoryDetails.getMicroCategoryId()), 21);
    }

    @Y61.k
    public final io.reactivex.rxjava3.core.q<H6.c> E(@Y61.k SafeDeal.ReturnCheckoutDialog.AddToFavoriteDialog addToFavoriteDialog) {
        Context context = this.f72298c.getContext();
        if (context == null) {
            return C41928w.f403335b;
        }
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        I(context, addToFavoriteDialog.getTitle(), addToFavoriteDialog.getSubtitle(), addToFavoriteDialog.getConfirmButtonTitle(), addToFavoriteDialog.getBlockDialogButtonTitle(), addToFavoriteDialog.getHeaderImage(), new b(cVar), new c(cVar), addToFavoriteDialog.getOnShowDialogDeepLink());
        return new io.reactivex.rxjava3.internal.operators.observable.S(new C41981q0(cVar));
    }

    @Y61.k
    public final io.reactivex.rxjava3.core.q<H6.c> F(@Y61.k SafeDeal.ReturnCheckoutDialog.DefaultDialog defaultDialog) {
        Context context = this.f72298c.getContext();
        if (context == null) {
            return C41928w.f403335b;
        }
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        I(context, defaultDialog.getTitle(), defaultDialog.getSubtitle(), defaultDialog.getConfirmButtonTitle(), defaultDialog.getBlockDialogButtonTitle(), defaultDialog.getHeaderImage(), new d(cVar), new e(cVar), defaultDialog.getOnShowDialogDeepLink());
        return new io.reactivex.rxjava3.internal.operators.observable.S(new C41981q0(cVar));
    }

    @Y61.k
    public final io.reactivex.rxjava3.core.q<H6.c> G(@Y61.k SafeDeal.ReturnCheckoutDialog.ChatDialog chatDialog) {
        Context context = this.f72298c.getContext();
        if (context == null) {
            return C41928w.f403335b;
        }
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        I(context, chatDialog.getTitle(), chatDialog.getSubtitle(), chatDialog.getConfirmButtonTitle(), chatDialog.getBlockDialogButtonTitle(), chatDialog.getHeaderImage(), new f(cVar), new g(cVar), chatDialog.getOnShowDialogDeepLink());
        return new io.reactivex.rxjava3.internal.operators.observable.S(new C41981q0(cVar));
    }

    public final void H(int i12, @Y61.l List list, @Y61.l List list2, @Y61.l Map map, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.l List list3, @Y61.k TreeClickStreamParent treeClickStreamParent, @Y61.l String str, @Y61.l AdvertActions advertActions, @Y61.l ContactBarData contactBarData, @Y61.l GalleryBuyButtonData galleryBuyButtonData, @Y61.l Long l12, @Y61.l String str2, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.l GalleryTeaser galleryTeaser, @Y61.l ArrayList arrayList, boolean z12, @Y61.l AddedByAvitoParams addedByAvitoParams, @Y61.l List list4, @Y61.l PhotoGalleryNavBar photoGalleryNavBar) {
        Intent intentA = this.f72310o.a(list, list2, map, bool, bool2, video, nativeVideo, list3 == null ? C42784z0.f406748b : list3, i12, this.f72297b, str, treeClickStreamParent, advertActions, contactBarData, galleryBuyButtonData, l12, str2, autotekaTeaserResult, galleryTeaser, arrayList, z12, addedByAvitoParams, list4, photoGalleryNavBar);
        C29640d c29640d = this.f72299d;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[0];
        if (!((Boolean) c29640d.f132199b.a().invoke()).booleanValue() && photoGalleryNavBar == null) {
            intentA.setFlags(603979776);
        } else {
            intentA.setFlags(536870912);
        }
        this.f72298c.startActivityForResult(intentA, 4);
    }

    public final void I(Context context, String str, String str2, String str3, String str4, Image image, Y41.a<kotlin.G0> aVar, Y41.a<kotlin.G0> aVar2, DeepLink deepLink) {
        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23), new h(str, str2, str3, str4, context, aVar, aVar2, image)));
        if (deepLink != null) {
            b.a.a(this.f72314s, deepLink, null, null, 6);
        }
    }

    public final void J(@Y61.k PrintableText printableText) {
        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, this.f72298c, printableText, null, null, null, 0, null, 1022);
    }

    @Override // x4.InterfaceC49759a.b, com.avito.android.advert.item.autoteka.teaser_v2.c.a, com.avito.android.advert.item.autoteka.teaser_v3.c.a
    public final void a(@Y61.k DeepLink deepLink) {
        b.a.a(this.f72314s, deepLink, null, null, 6);
    }

    @Override // x4.InterfaceC49759a.b, com.avito.android.advert.item.autoteka.teaser_v2.c.a
    public final void b() {
        FromBlock fromBlock = FromBlock.f96083c;
        this.f72298c.startActivity(this.f72303h.a(102, this.f72297b));
    }

    @Override // com.avito.android.advert.item.autoteka.teaser_v2.c.a, com.avito.android.advert.item.autoteka.teaser_v3.c.a
    public final void c(@Y61.k Uri uri) {
        C35966w1.f(this.f72298c, this.f72315t.t(uri));
    }

    @Override // com.avito.android.advert_core.price_list.preview.f.a
    public final void d(@Y61.k PriceList priceList) {
        AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment = new AdvertPriceListBottomSheetDialogFragment();
        AdvertPriceListBottomSheetDialogOpenParams advertPriceListBottomSheetDialogOpenParams = new AdvertPriceListBottomSheetDialogOpenParams(priceList);
        advertPriceListBottomSheetDialogFragment.f84035h0.setValue(advertPriceListBottomSheetDialogFragment, AdvertPriceListBottomSheetDialogFragment.f84034p0[0], advertPriceListBottomSheetDialogOpenParams);
        advertPriceListBottomSheetDialogFragment.show(this.f72298c.getParentFragmentManager(), "AdvertPriceListPreviewBottomSheetDialog");
    }

    @Override // com.avito.android.advert.item.note.c.a
    public final void e(@Y61.k AdvertDetails advertDetails, @Y61.l String str) {
        if (this.f72316u.b()) {
            B(advertDetails, str);
            return;
        }
        this.f72298c.startActivityForResult(this.f72302g.a(AuthSource.f92704h), 7);
    }

    @Override // com.avito.android.advert_core.advert_badge_bar.e.a, com.avito.android.advert_core.body_condition.f.a
    public final void f(@Y61.k DeepLink deepLink) {
        g(null, deepLink, null);
    }

    @Override // com.avito.android.advert_core.advert.b
    public final void g(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        com.avito.android.advert_core.analytics.a aVar = this.f72293B;
        bundle2.putParcelable("DeepLinkNavigationAdvertDetailsTree", aVar != null ? aVar.Q5(false) : null);
        boolean z12 = deepLink instanceof CreateChannelLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f72314s;
        if (z12) {
            aVar2.r6(bundle, deepLink, "req_create_channel");
        } else {
            aVar2.r6(bundle2, deepLink, str);
        }
    }

    @Override // com.avito.android.advert.item.autoteka_select.teaser.c.b
    public final void h(@Y61.k DeepLink deepLink) {
        b.a.a(this.f72314s, deepLink, null, null, 6);
    }

    @Override // com.avito.android.advert.item.service_booking.m.a
    public final void i(@Y61.k DeepLink deepLink, @Y61.k SbSignUpEvent.ServiceBookingSource serviceBookingSource) {
        String id2;
        com.avito.android.advert_core.analytics.a aVar;
        AdjustParameters adjustParameters;
        AdvertDetails advertDetails = this.f72294C;
        if (advertDetails != null && (id2 = advertDetails.getId()) != null && (aVar = this.f72293B) != null) {
            AdvertDetails advertDetails2 = this.f72294C;
            String microCategoryId = (advertDetails2 == null || (adjustParameters = advertDetails2.getAdjustParameters()) == null) ? null : adjustParameters.getMicroCategoryId();
            AdvertDetails advertDetails3 = this.f72294C;
            aVar.P1(id2, microCategoryId, advertDetails3 != null ? advertDetails3.getLocationId() : null, serviceBookingSource);
        }
        b.a.a(this.f72314s, deepLink, null, null, 6);
    }

    @Override // com.avito.android.deal_confirmation.k
    public final void j(@Y61.k String str) {
        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, this.f72298c, com.avito.android.printable_text.b.f(str), null, null, null, 0, null, 1022);
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.d.a
    public final void k(@Y61.k DeepLink deepLink) {
        boolean z12 = deepLink instanceof ChannelDetailsLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f72314s;
        if (z12) {
            b.a.a(aVar, deepLink, null, C22777e.b(new kotlin.Q("with_up_intent", Boolean.FALSE)), 2);
        } else {
            b.a.a(aVar, deepLink, null, null, 6);
        }
    }

    @Override // com.avito.android.deal_confirmation.k
    public final void l(@Y61.k DealConfirmationSheet dealConfirmationSheet) {
        this.f72298c.startActivityForResult(this.f72306k.a(dealConfirmationSheet), 20);
    }

    @Override // com.avito.android.advert_core.advert.a
    public final void m(@Y61.l Parcelable parcelable, @Y61.l String str) {
        Intent intentB = this.f72302g.b(parcelable, str);
        intentB.setFlags(603979776);
        this.f72298c.startActivityForResult(intentB, 1);
    }

    @Override // com.avito.android.advert_core.price_list.preview.f.a
    public final void n(@Y61.k String str, @Y61.k ImvServices imvServices) {
        this.f72317v.a(str, imvServices).show(this.f72298c.getParentFragmentManager(), "ImvServicesBottomSheetDialog");
    }

    @Override // x4.InterfaceC49759a.b
    public final void o(@Y61.k CpoDescription cpoDescription) {
        this.f72298c.startActivity(this.f72301f.d(cpoDescription));
    }

    @Override // com.avito.android.advert_core.map.j
    public final void p(@Y61.l String str, @Y61.k String str2, @Y61.l MultiAddressesInfo multiAddressesInfo, @Y61.k Coordinates coordinates, @Y61.k String str3, @Y61.l List list, @Y61.l SellerAddressesInfo sellerAddressesInfo, @Y61.l RouteButtons routeButtons, @Y61.l List list2, boolean z12, @Y61.l ContactBarData contactBarData, @Y61.l AdvertActions advertActions, @Y61.l String str4, @Y61.l LocationMap locationMap, @Y61.l String str5, @Y61.l Boolean bool, @Y61.l GeoZones geoZones, boolean z13, boolean z14) {
        AdvertDetailsFragment advertDetailsFragment = this.f72298c;
        advertDetailsFragment.startActivity(f.a.a(this.f72307l, coordinates, z12, contactBarData, advertActions, str4, str2, multiAddressesInfo, str3, list, sellerAddressesInfo, str, list2, routeButtons, false, advertDetailsFragment.q5(), advertDetailsFragment.f71548z5, advertDetailsFragment.f71355A5, locationMap, geoZones, kotlin.jvm.internal.L.f(bool, Boolean.TRUE), str5, z13, z14, 16924676));
    }

    @Override // com.avito.android.advert.item.services_review_volunteers.e.a
    public final void q(@Y61.k DeepLink deepLink) {
        b.a.a(this.f72314s, deepLink, null, null, 6);
        com.avito.android.advert_core.analytics.a aVar = this.f72293B;
        if (aVar != null) {
            aVar.f6();
        }
    }

    @Override // com.avito.android.advert_core.advert.b
    public final void r(@Y61.k CvPackagesLink cvPackagesLink) {
        b.a.a(this.f72314s, cvPackagesLink, null, null, 6);
    }

    @Override // com.avito.android.advert.item.service_order_request.n.a
    public final void s(@Y61.k DeepLink deepLink) {
        b.a.a(this.f72314s, deepLink, "service_order_request_req", null, 4);
    }

    public final void t() {
        Intent intent;
        ActivityC22955m activityC22955m = this.f72292A;
        if (activityC22955m != null) {
            if (!(activityC22955m instanceof AdvertDetailsActivity)) {
                this.f72298c.r5();
                return;
            }
            AdvertDetailsActivity advertDetailsActivity = (AdvertDetailsActivity) activityC22955m;
            if (!advertDetailsActivity.isTaskRoot() || (intent = advertDetailsActivity.f304538c) == null) {
                advertDetailsActivity.finish();
            } else {
                advertDetailsActivity.startActivity(intent);
            }
        }
    }

    public final void u(@Y61.k SimpleAdvertAction simpleAdvertAction, @Y61.k String str) {
        com.avito.android.advert_core.analytics.a aVar = this.f72293B;
        if (aVar != null) {
            aVar.n(str);
        }
        DeepLink deepLink = simpleAdvertAction.getDeepLink();
        if (deepLink != null) {
            g(null, deepLink, null);
        }
    }

    public final void v() {
        com.avito.android.advert.advert_details_popup.e eVar = this.f72296E;
        eVar.f68620b.clear();
        PopupWindow popupWindow = eVar.f68619a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void w(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str) {
        if (deepLink instanceof NoMatchLink) {
            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, this.f72298c, com.avito.android.printable_text.b.c(R.string.no_match_deep_link_try_to_update_the_app, new Serializable[0]), null, null, null, 0, null, 1022);
        } else {
            if (deepLink instanceof AuthenticateLink) {
                String str2 = ((AuthenticateLink) deepLink).f133883b;
                if (str2 == null || str2.length() == 0) {
                    AuthSource authSource = AuthSource.f92694c;
                    str2 = "tst7";
                }
                m(null, str2);
                return;
            }
            boolean z12 = deepLink instanceof DeliverySavedAddressCheckLink;
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f72314s;
            if (z12) {
                aVar.r6(bundle, deepLink, "delivery_saved_address_check_deep_link_handler");
            } else {
                aVar.r6(bundle, deepLink, str);
            }
        }
    }

    public final void x(@Y61.k Uri uri) {
        C35966w1.f(this.f72298c, this.f72315t.t(uri));
    }

    public final void y(@Y61.k List<Image> list) {
        com.avito.android.advert_core.analytics.a aVar = this.f72293B;
        TreeClickStreamParent treeClickStreamParentQ5 = aVar != null ? aVar.Q5(false) : null;
        AdvertDetails advertDetails = this.f72294C;
        this.f72298c.startActivity(this.f72310o.a(null, null, null, null, null, null, null, list, 0, this.f72297b, (16773151 & 1024) != 0 ? null : advertDetails != null ? advertDetails.getCategoryId() : null, (16773151 & 2048) != 0 ? null : treeClickStreamParentQ5, (16773151 & 4096) != 0 ? null : null, (16773151 & 8192) != 0 ? null : null, (16773151 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, (32768 & 16773151) != 0 ? null : null, null, null, (262144 & 16773151) != 0 ? null : null, null, false, (16773151 & 2097152) != 0 ? null : null, null, null).setFlags(603979776));
    }

    public final void z(@Y61.k Intent intent) {
        C35966w1.g(this.f72298c, intent, new a(intent));
    }
}
