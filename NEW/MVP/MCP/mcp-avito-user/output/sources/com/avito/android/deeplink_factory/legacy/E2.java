package com.avito.android.deeplink_factory.legacy;

import Ru.d;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.collection.C20199a;
import com.avito.android.C30277e1;
import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.deep_linking.links.AddItemToCartLink;
import com.avito.android.deep_linking.links.AdvertAutoPublishLink;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.AppVersionDeepLink;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.BlockUserLink;
import com.avito.android.deep_linking.links.BlockUserWithReasonLink;
import com.avito.android.deep_linking.links.BlockedIpScreenLink;
import com.avito.android.deep_linking.links.BodyConditionBottomSheetLink;
import com.avito.android.deep_linking.links.BrandspaceLink;
import com.avito.android.deep_linking.links.BxContentLink;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.deep_linking.links.CalltrackingDeeplink;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deep_linking.links.CategoriesLink;
import com.avito.android.deep_linking.links.ChannelCallLink;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deep_linking.links.ChannelMapLink;
import com.avito.android.deep_linking.links.ChannelsLink;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.CreateChannelByOpponentUserLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.CreateChannelWithAvitoLink;
import com.avito.android.deep_linking.links.CreditPartnerLink;
import com.avito.android.deep_linking.links.CreditProductsLandingLink;
import com.avito.android.deep_linking.links.DealConfirmationFeedbackLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeleteChannelLink;
import com.avito.android.deep_linking.links.DeliveryCourierLocationSelectLink;
import com.avito.android.deep_linking.links.DeliveryCourierOrderPaymentFailureLink;
import com.avito.android.deep_linking.links.DeliveryCourierOrderPaymentSuccessLink;
import com.avito.android.deep_linking.links.DeliveryCourierPayoutInitLink;
import com.avito.android.deep_linking.links.DeliveryOrderCancelLink;
import com.avito.android.deep_linking.links.DeliveryOrderPaymentFailureLink;
import com.avito.android.deep_linking.links.DeliveryOrderPaymentSuccessLink;
import com.avito.android.deep_linking.links.DeliveryPayoutInitLink;
import com.avito.android.deep_linking.links.DeliverySavedAddressCheckLink;
import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutCourierDeepLink;
import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutLink;
import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutPvzDeepLink;
import com.avito.android.deep_linking.links.DeliveryUniversalPayDeepLink;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DevelopmentsCatalogInfrastructureLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deep_linking.links.DiscountDispatchLink;
import com.avito.android.deep_linking.links.DiscountDispatchLinkLegacy;
import com.avito.android.deep_linking.links.DiscountLink;
import com.avito.android.deep_linking.links.DraftPublicationLink;
import com.avito.android.deep_linking.links.EditProfileLink;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.deep_linking.links.ExtendedProfileSettingsLink;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import com.avito.android.deep_linking.links.FallbackableLink;
import com.avito.android.deep_linking.links.FavoriteSellerMuteLink;
import com.avito.android.deep_linking.links.HelpCenterArticleShowLink;
import com.avito.android.deep_linking.links.HelpCenterRequestLink;
import com.avito.android.deep_linking.links.HelpCenterShowLink;
import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.deep_linking.links.ImvGoodsAdvertLink;
import com.avito.android.deep_linking.links.ImvGoodsPollLink;
import com.avito.android.deep_linking.links.ImvSimilarAdvertsLink;
import com.avito.android.deep_linking.links.InAppBrowserLink;
import com.avito.android.deep_linking.links.IncomeSettingsLink;
import com.avito.android.deep_linking.links.InfoPageLink;
import com.avito.android.deep_linking.links.ItemReportLink;
import com.avito.android.deep_linking.links.ItemStatsLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deep_linking.links.LegacyPaymentSessionLink;
import com.avito.android.deep_linking.links.LogAdjustEventLink;
import com.avito.android.deep_linking.links.LogFirebaseEventLink;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.deep_linking.links.ManualPhoneVerificationLink;
import com.avito.android.deep_linking.links.MarkChannelUnreadLink;
import com.avito.android.deep_linking.links.ModelCardLink;
import com.avito.android.deep_linking.links.MultipleLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deep_linking.links.MyDraftAdvertDetailsLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.NotificationCenterLink;
import com.avito.android.deep_linking.links.NotificationCenterMainLandingLink;
import com.avito.android.deep_linking.links.OnboardingStepsLink;
import com.avito.android.deep_linking.links.PaymentGenericFormLink;
import com.avito.android.deep_linking.links.PaymentGenericLink;
import com.avito.android.deep_linking.links.PaymentSessionCpaLink;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.deep_linking.links.PaymentStatusFormLink;
import com.avito.android.deep_linking.links.PaymentStatusLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.PinChannelLink;
import com.avito.android.deep_linking.links.PlayerLink;
import com.avito.android.deep_linking.links.ProfileSettingsLink;
import com.avito.android.deep_linking.links.PublicDeeplink;
import com.avito.android.deep_linking.links.PublishLimitsHistoryLink;
import com.avito.android.deep_linking.links.RefreshLink;
import com.avito.android.deep_linking.links.RequestDeliveryLink;
import com.avito.android.deep_linking.links.RequestReviewLink;
import com.avito.android.deep_linking.links.SBOLPaymentLink;
import com.avito.android.deep_linking.links.SafeDealPayoutInitLink;
import com.avito.android.deep_linking.links.SbpPaymentAppLink;
import com.avito.android.deep_linking.links.SettingsNotificationsLink;
import com.avito.android.deep_linking.links.ShareLink;
import com.avito.android.deep_linking.links.ShowPinMapLink;
import com.avito.android.deep_linking.links.SingleTimeLink;
import com.avito.android.deep_linking.links.StrBookingPaymentSuccessLink;
import com.avito.android.deep_linking.links.StrPayoutInitLink;
import com.avito.android.deep_linking.links.SupportChatFormLink;
import com.avito.android.deep_linking.links.ThemeSettingsLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deep_linking.links.TopUpFormLink;
import com.avito.android.deep_linking.links.UniversalDeliveryCourierLocationSelectLink;
import com.avito.android.deep_linking.links.UniversalDeliveryTypeDeeplink;
import com.avito.android.deep_linking.links.UniversalMapSelectFailureLink;
import com.avito.android.deep_linking.links.UniversalMapSelectSuccessLink;
import com.avito.android.deep_linking.links.UnpinChannelLink;
import com.avito.android.deep_linking.links.UnsupportedPlatformActionLink;
import com.avito.android.deep_linking.links.UpdateFolderTagsLink;
import com.avito.android.deep_linking.links.UserAdvertsLink;
import com.avito.android.deep_linking.links.UserContactsLink;
import com.avito.android.deep_linking.links.VerificationConfirmRequisitesLink;
import com.avito.android.deep_linking.links.VerificationFetchInvoiceLink;
import com.avito.android.deep_linking.links.VerificationFinishLink;
import com.avito.android.deep_linking.links.VerificationInputBillAmountLink;
import com.avito.android.deep_linking.links.VerificationInputInnLink;
import com.avito.android.deep_linking.links.VerificationStatusListLink;
import com.avito.android.deep_linking.links.VerificationSumsubLink;
import com.avito.android.deep_linking.links.VerificationsMenuLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deep_linking.links.auth.LandlinePhoneVerificationLink;
import com.avito.android.deep_linking.links.auth.MobilePhoneVerificationLink;
import com.avito.android.deep_linking.links.auth.PasswordChangeLink;
import com.avito.android.deep_linking.links.auth.PasswordUpgradeLink;
import com.avito.android.deep_linking.links.auth.PhoneVerificationStatusLink;
import com.avito.android.deep_linking.links.auth.ProfileTfaSettingsLink;
import com.avito.android.deep_linking.links.auth.ResetPasswordLink;
import com.avito.android.deep_linking.links.auth.RestorePasswordLink;
import com.avito.android.deep_linking.links.auth.SessionDeleteLink;
import com.avito.android.deep_linking.links.auth.SessionsListLink;
import com.avito.android.deep_linking.links.auth.SessionsSocialLogoutLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deeplink_events.events.DeeplinkParsingFailReason;
import com.avito.android.deeplink_factory.legacy.C29699a;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.M6;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.text.C43066x;
import lE.C43624b;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_factory/legacy/E2;", "Lcom/avito/android/deep_linking/x;", "LKu/i;", "a", "b", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes12.dex */
public class E2 extends Ku.i implements com.avito.android.deep_linking.x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f134212a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f134213b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43624b f134214c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Gson f134215d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_events.registry.d f134216e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.L f134217f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final UriMatcher f134218g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f134219h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f134220i;

    /* compiled from: LegacyDeepLinkFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_factory/legacy/E2$a;", "", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        DeepLink a(@Y61.k Uri uri);
    }

    /* compiled from: LegacyDeepLinkFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_factory/legacy/E2$b;", "", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f134221a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final WebViewLinkSettings f134222b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ParametrizedEvent f134223c;

        public b(@Y61.k Uri uri, @Y61.k WebViewLinkSettings webViewLinkSettings, @Y61.l ParametrizedEvent parametrizedEvent) {
            this.f134221a = uri;
            this.f134222b = webViewLinkSettings;
            this.f134223c = parametrizedEvent;
        }
    }

    /* compiled from: LegacyDeepLinkFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.l<Uri, kotlin.Z<? extends DeepLink>> {
        @Y61.k
        public final Object f(@Y61.k Uri uri) {
            Object bVar;
            E2 e22 = (E2) this.receiver;
            e22.getClass();
            a aVar = (a) e22.f134219h.get(uri.getHost() + uri.getPath());
            com.avito.android.deeplink_events.registry.d dVar = e22.f134216e;
            if (aVar == null) {
                dVar.b(new d.a(uri, DeeplinkParsingFailReason.f134145b, null));
                int i12 = kotlin.Z.f406624c;
                return new Z.b(new DeeplinkParsingError.ParserNotFound(uri.toString(), "Parser for given deeplink not found. Check version and path", null));
            }
            try {
                int i13 = kotlin.Z.f406624c;
                bVar = aVar.a(uri);
            } catch (Throwable th2) {
                int i14 = kotlin.Z.f406624c;
                bVar = new Z.b(th2);
            }
            Object objA = com.avito.android.deeplink_factory.a.a(bVar, uri);
            com.avito.android.deeplink_factory.a.b(objA, dVar, uri);
            return objA;
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.Z<? extends DeepLink> invoke(Uri uri) {
            return kotlin.Z.a(f(uri));
        }
    }

    /* compiled from: LegacyDeepLinkFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.l<Uri, DeepLink> {
        @Override // Y41.l
        public final DeepLink invoke(Uri uri) {
            Uri uri2 = uri;
            E2 e22 = (E2) this.receiver;
            int iMatch = e22.f134218g.match(uri2);
            String lastPathSegment = uri2.getLastPathSegment();
            DeepLink advertDetailsLink = null;
            if (lastPathSegment == null) {
                return null;
            }
            if (iMatch == 0) {
                advertDetailsLink = new AdvertDetailsLink(lastPathSegment, null, null, null, null, null, null, null, null, null, null, 2044, null);
            } else if (iMatch == 1) {
                advertDetailsLink = new MyAdvertDetailsLink(lastPathSegment, null, false, 6, null);
            } else {
                if (iMatch == 2) {
                    if (C43066x.h0(lastPathSegment, SingleLineInputModel.STYLE_SEARCH, false)) {
                        return null;
                    }
                    return new ChannelDetailsLink(lastPathSegment, null, 2, null);
                }
                if (iMatch == 3) {
                    C43624b c43624b = e22.f134214c;
                    c43624b.getClass();
                    kotlin.reflect.n<Object> nVar = C43624b.f413639o[3];
                    if (((Boolean) c43624b.f413643e.a().invoke()).booleanValue()) {
                        return new NoMatchLink();
                    }
                    return null;
                }
            }
            if (advertDetailsLink == null) {
                return advertDetailsLink;
            }
            e22.f134216e.b(new d.C0991d(uri2, advertDetailsLink, true));
            return advertDetailsLink;
        }
    }

    public E2(@Y61.k C30277e1 c30277e1, @Y61.k com.avito.android.P p12, @Y61.k C43624b c43624b, @Y61.k dagger.internal.f fVar, @Y61.k Gson gson, @Y61.k com.avito.android.deeplink_events.registry.d dVar, @Y61.k com.avito.android.deep_linking.L l12) {
        this.f134212a = c30277e1;
        this.f134213b = p12;
        this.f134214c = c43624b;
        this.f134215d = gson;
        this.f134216e = dVar;
        this.f134217f = l12;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f134218g = uriMatcher;
        this.f134220i = C42727D.c(new F2(fVar));
        uriMatcher.addURI("1", "items/#", 0);
        uriMatcher.addURI("1", "profile/items/#", 1);
        uriMatcher.addURI("1", "channels/*", 2);
        C20199a c20199a = new C20199a(com.avito.android.deep_linking.links.storage.a.f134018a.getClassesToMetaInfo().size());
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        r(this, c20199a, n0Var.b(MainScreenLink.class), new C29769v0(this));
        r(this, c20199a, n0Var.b(DraftPublicationLink.class), new G0(this));
        r(this, c20199a, n0Var.b(EditProfileLink.class), R0.f134256l);
        r(this, c20199a, n0Var.b(ResetPasswordLink.class), new C29709c1(this));
        r(this, c20199a, n0Var.b(RestorePasswordLink.class), new C29750o1(this));
        r(this, c20199a, n0Var.b(AutotekaBuyReportLink.class), new F1(this));
        r(this, c20199a, n0Var.b(DevelopmentsCatalogInfrastructureLink.class), new X1(this));
        r(this, c20199a, n0Var.b(MyAdvertDetailsLink.class), new p2(this));
        r(this, c20199a, n0Var.b(MyDraftAdvertDetailsLink.class), new D2(this));
        r(this, c20199a, n0Var.b(CalendarLink.class), new r(this));
        r(this, c20199a, n0Var.b(ChannelsLink.class), new C(this));
        r(this, c20199a, n0Var.b(ChannelDetailsLink.class), new Q(this));
        r(this, c20199a, n0Var.b(ChannelMapLink.class), new C29740l0(this));
        r(this, c20199a, n0Var.b(ChannelCallLink.class), new C29752p0(this));
        r(this, c20199a, n0Var.b(BlockUserWithReasonLink.class), new C29755q0(this));
        r(this, c20199a, n0Var.b(UpdateFolderTagsLink.class), new C29757r0(this));
        r(this, c20199a, n0Var.b(PhoneLink.Call.class), new C29760s0(this));
        r(this, c20199a, n0Var.b(CreateChannelLink.class), new C29763t0(this));
        r(this, c20199a, n0Var.b(CreateChannelByOpponentUserLink.class), new C29766u0(this));
        r(this, c20199a, n0Var.b(CreateChannelWithAvitoLink.class), new C29772w0(this));
        r(this, c20199a, n0Var.b(InfoPageLink.class), new C29775x0(this));
        r(this, c20199a, n0Var.b(ItemReportLink.class), new C29778y0(this));
        r(this, c20199a, n0Var.b(CategoriesLink.class), new C29781z0(this));
        r(this, c20199a, n0Var.b(ItemsSearchLink.class), new A0(1, this, E2.class, "parseItemsSearchLink", "parseItemsSearchLink(Landroid/net/Uri;)Lcom/avito/android/deep_linking/links/ItemsSearchLink;", 0));
        r(this, c20199a, n0Var.b(BxContentLink.class), new B0(this));
        r(this, c20199a, n0Var.b(ExtendedProfileSettingsLink.class), C0.f134202l);
        r(this, c20199a, n0Var.b(ProfileSettingsLink.class), new D0(this));
        r(this, c20199a, n0Var.b(UserContactsLink.class), new E0(this));
        r(this, c20199a, n0Var.b(RequestReviewLink.class), new F0(this));
        r(this, c20199a, n0Var.b(ShareLink.class), new H0(this));
        r(this, c20199a, n0Var.b(UserAdvertsLink.class), new I0(this));
        r(this, c20199a, n0Var.b(MyAdvertLink.Delete.class), new J0(this));
        r(this, c20199a, n0Var.b(MyAdvertLink.Allow.class), new K0(this));
        r(this, c20199a, n0Var.b(MyAdvertLink.UpdateReservation.class), new L0(this));
        r(this, c20199a, n0Var.b(MyAdvertLink.Deactivate.class), new M0(this));
        r(this, c20199a, n0Var.b(MyAdvertLink.DeactivateBySoa.class), new N0(this));
        r(this, c20199a, n0Var.b(AdvertAutoPublishLink.class), new O0(this));
        r(this, c20199a, n0Var.b(DeleteChannelLink.class), new P0(this));
        r(this, c20199a, n0Var.b(MarkChannelUnreadLink.class), new Q0(this));
        r(this, c20199a, n0Var.b(PinChannelLink.class), new S0(this));
        r(this, c20199a, n0Var.b(UnpinChannelLink.class), new T0(this));
        r(this, c20199a, n0Var.b(WebViewLink.AnyDomain.class), new U0(this));
        r(this, c20199a, n0Var.b(WebViewLink.OnlyAvitoDomain.class), new V0(this));
        r(this, c20199a, n0Var.b(BlockUserLink.class), new W0(this));
        r(this, c20199a, n0Var.b(ExtendedProfilePhoneRequestLink.class), new X0(this));
        r(this, c20199a, n0Var.b(InAppBrowserLink.class), new Y0(this));
        r(this, c20199a, n0Var.b(ThemeSettingsLink.class), Z0.f134275l);
        r(this, c20199a, n0Var.b(NotificationCenterLink.class), C29701a1.f134278l);
        r(this, c20199a, n0Var.b(LegacyPaymentSessionLink.class), new C29705b1(this));
        r(this, c20199a, n0Var.b(PaymentSessionCpaLink.class), new C29713d1(this));
        r(this, c20199a, n0Var.b(PaymentSessionLink.class), new C29721f1(this));
        r(this, c20199a, n0Var.b(PaymentStatusLink.class), new C29725g1(this));
        r(this, c20199a, n0Var.b(TopUpFormLink.class), new C29729h1(this));
        r(this, c20199a, n0Var.b(DealConfirmationFeedbackLink.class), new C29732i1(this));
        r(this, c20199a, n0Var.b(DiscountDispatchLink.class), new C29735j1(this));
        r(this, c20199a, n0Var.b(DiscountDispatchLinkLegacy.class), new C29738k1(this));
        r(this, c20199a, n0Var.b(DiscountLink.class), new C29741l1(this));
        r(this, c20199a, n0Var.b(PaymentStatusFormLink.class), new C29744m1(this));
        r(this, c20199a, n0Var.b(MobilePhoneVerificationLink.class), new C29747n1(this));
        r(this, c20199a, n0Var.b(LandlinePhoneVerificationLink.class), new C29758r1(this));
        r(this, c20199a, n0Var.b(ManualPhoneVerificationLink.class), new C29767u1(this));
        r(this, c20199a, n0Var.b(PhoneVerificationStatusLink.class), new C29776x1(this));
        r(this, c20199a, n0Var.b(ItemStatsLink.class), new C29779y1(this));
        r(this, c20199a, n0Var.b(PaymentGenericLink.class), new C29782z1(this));
        r(this, c20199a, n0Var.b(PaymentGenericFormLink.class), new A1(this));
        r(this, c20199a, n0Var.b(SBOLPaymentLink.class), new B1(this));
        r(this, c20199a, n0Var.b(NotificationCenterMainLandingLink.class), new C1(this));
        r(this, c20199a, n0Var.b(ProfileTfaSettingsLink.class), D1.f134207l);
        r(this, c20199a, n0Var.b(DeliveryOrderCancelLink.class), new E1(this));
        r(this, c20199a, n0Var.b(BlockedIpScreenLink.class), I1.f134234l);
        r(this, c20199a, n0Var.b(DeliveryPayoutInitLink.class), new J1(this));
        r(this, c20199a, n0Var.b(ShowPinMapLink.class), new K1(this));
        r(this, c20199a, n0Var.b(ClickStreamLink.class), new M1(this));
        r(this, c20199a, n0Var.b(LogAdjustEventLink.class), new P1(this));
        r(this, c20199a, n0Var.b(LogFirebaseEventLink.class), new S1(this));
        r(this, c20199a, n0Var.b(HelpCenterShowLink.class), T1.f134262l);
        r(this, c20199a, n0Var.b(HelpCenterUrlShowLink.class), new U1(this));
        r(this, c20199a, n0Var.b(HelpCenterRequestLink.class), new V1(this));
        r(this, c20199a, n0Var.b(HelpCenterArticleShowLink.class), new W1(this));
        r(this, c20199a, n0Var.b(SupportChatFormLink.class), new Y1(this));
        r(this, c20199a, n0Var.b(DeliverySavedAddressCheckLink.class), new C29706b2(this));
        r(this, c20199a, n0Var.b(DeliveryUniversalCheckoutPvzDeepLink.class), new C29714d2(this));
        r(this, c20199a, n0Var.b(DeliveryUniversalCheckoutCourierDeepLink.class), new C29722f2(this));
        r(this, c20199a, n0Var.b(DeliveryUniversalCheckoutLink.class), new i2(this));
        r(this, c20199a, n0Var.b(DeliveryUniversalPayDeepLink.class), new k2(this));
        r(this, c20199a, n0Var.b(DeliveryOrderPaymentSuccessLink.class), new l2(this));
        r(this, c20199a, n0Var.b(DeliveryOrderPaymentFailureLink.class), new m2(this));
        r(this, c20199a, n0Var.b(DeliveryCourierOrderPaymentSuccessLink.class), new n2(this));
        r(this, c20199a, n0Var.b(DeliveryCourierOrderPaymentFailureLink.class), new o2(this));
        r(this, c20199a, n0Var.b(SettingsNotificationsLink.class), q2.f134329l);
        r(this, c20199a, n0Var.b(StrBookingPaymentSuccessLink.class), new r2(this));
        r(this, c20199a, n0Var.b(StrPayoutInitLink.class), new s2(this));
        r(this, c20199a, n0Var.b(DetailsSheetLink.class), new w2(this));
        r(this, c20199a, n0Var.b(PublishLimitsHistoryLink.class), new x2(this));
        r(this, c20199a, n0Var.b(PasswordChangeLink.class), new y2(this));
        r(this, c20199a, n0Var.b(PasswordUpgradeLink.class), new z2(this));
        r(this, c20199a, n0Var.b(SessionsListLink.class), new A2(this));
        r(this, c20199a, n0Var.b(SessionDeleteLink.class), new B2(this));
        r(this, c20199a, n0Var.b(SessionsSocialLogoutLink.class), new C2(this));
        r(this, c20199a, n0Var.b(FavoriteSellerMuteLink.class), new C29707c(this));
        r(this, c20199a, n0Var.b(IncomeSettingsLink.class), C29711d.f134284l);
        r(this, c20199a, n0Var.b(DeliveryCourierLocationSelectLink.class), new C29715e(this));
        r(this, c20199a, n0Var.b(UniversalDeliveryCourierLocationSelectLink.class), new C29719f(this));
        r(this, c20199a, n0Var.b(DeliveryCourierPayoutInitLink.class), new C29723g(this));
        r(this, c20199a, n0Var.b(SafeDealPayoutInitLink.class), new C29727h(this));
        r(this, c20199a, n0Var.b(DialogDeepLink.class), new C29733j(this));
        r(this, c20199a, n0Var.b(ToastMessageLink.class), new C29736k(this));
        r(this, c20199a, n0Var.b(MultipleLink.class), new C29745n(this));
        r(this, c20199a, n0Var.b(FallbackableLink.class), new C29754q(this));
        r(this, c20199a, n0Var.b(BrandspaceLink.class), new C29759s(this));
        r(this, c20199a, n0Var.b(PlayerLink.class), new C29762t(this));
        r(this, c20199a, n0Var.b(VerificationSumsubLink.class), new C29765u(this));
        r(this, c20199a, n0Var.b(VerificationStatusListLink.class), new C29768v(this));
        r(this, c20199a, n0Var.b(VerificationInputInnLink.class), new C29771w(this));
        r(this, c20199a, n0Var.b(VerificationConfirmRequisitesLink.class), new C29774x(this));
        r(this, c20199a, n0Var.b(VerificationInputBillAmountLink.class), new C29777y(this));
        r(this, c20199a, n0Var.b(VerificationFinishLink.class), new C29780z(this));
        r(this, c20199a, n0Var.b(VerificationFetchInvoiceLink.class), new A(this));
        r(this, c20199a, n0Var.b(RefreshLink.class), B.f134197l);
        r(this, c20199a, n0Var.b(VerificationsMenuLink.class), D.f134205l);
        r(this, c20199a, n0Var.b(BodyConditionBottomSheetLink.class), new G(this));
        r(this, c20199a, n0Var.b(CreditPartnerLink.class), new H(this));
        r(this, c20199a, n0Var.b(CreditProductsLandingLink.class), new I(this));
        r(this, c20199a, n0Var.b(EmptyDeepLink.class), J.f134235l);
        r(this, c20199a, n0Var.b(BeduinUniversalPageLink.class), new K(this));
        r(this, c20199a, n0Var.b(RequestDeliveryLink.class), new L(this));
        r(this, c20199a, n0Var.b(ModelCardLink.class), new M(this));
        r(this, c20199a, n0Var.b(OnboardingStepsLink.class), new N(this));
        r(this, c20199a, n0Var.b(AppVersionDeepLink.class), new P(this));
        r(this, c20199a, n0Var.b(CalltrackingDeeplink.class), S.f134257l);
        r(this, c20199a, n0Var.b(SingleTimeLink.class), new T(this));
        r(this, c20199a, n0Var.b(UniversalDeliveryTypeDeeplink.class), new W(this));
        r(this, c20199a, n0Var.b(CartLink.class), new Y(this));
        r(this, c20199a, n0Var.b(AddItemToCartLink.class), new C29700a0(this));
        r(this, c20199a, n0Var.b(FakeDoorDialogLink.class), new C29716e0(this));
        r(this, c20199a, n0Var.b(SbpPaymentAppLink.class), new C29720f0(this));
        r(this, c20199a, n0Var.b(ImvSimilarAdvertsLink.class), new C29724g0(this));
        r(this, c20199a, n0Var.b(ImvGoodsPollLink.class), new C29734j0(this));
        r(this, c20199a, n0Var.b(ImvGoodsAdvertLink.class), new C29737k0(this));
        r(this, c20199a, n0Var.b(UniversalMapSelectFailureLink.class), new C29743m0(this));
        r(this, c20199a, n0Var.b(UniversalMapSelectSuccessLink.class), C29746n0.f134317l);
        r(this, c20199a, n0Var.b(UnsupportedPlatformActionLink.class), C29749o0.f134321l);
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.P0.f(c20199a.f25790d));
        for (Map.Entry entry : c20199a.entrySet()) {
            linkedHashMap.put(com.avito.android.deep_linking.links.storage.a.f134018a.a((Class) entry.getKey()), entry.getValue());
        }
        this.f134219h = linkedHashMap;
    }

    public static final void r(E2 e22, C20199a c20199a, kotlin.reflect.d dVar, Y41.l lVar) {
        C29699a.C4038a c4038a = new C29699a.C4038a(lVar);
        e22.getClass();
        c20199a.put(((InterfaceC42819t) dVar).f(), c4038a);
    }

    public static final b s(E2 e22, Uri uri, String str) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        e22.getClass();
        Uri uriQ = Ku.i.q(uri, ContextActionHandler.Link.URL);
        if (str != null && !M6.a(uriQ, str)) {
            Ku.i.g(e22, uri, "url must have root domain ".concat(str));
            throw null;
        }
        WebViewLinkSettings webViewLinkSettings = new WebViewLinkSettings(Boolean.parseBoolean(uri.getQueryParameter("fullscreen")), Boolean.parseBoolean(uri.getQueryParameter("mavAuth")), Boolean.parseBoolean(uri.getQueryParameter("keep")), Boolean.parseBoolean(uri.getQueryParameter("quickLoader")), Boolean.parseBoolean(uri.getQueryParameter("needAuth")), uri.getQueryParameter("authSource"), null, false, Boolean.parseBoolean(uri.getQueryParameter("supportDeeplinkInRedirect")), false, Boolean.parseBoolean(uri.getQueryParameter("showPageTitle")), 704, null);
        Gson gson = e22.f134215d;
        try {
            Type type = new G2().getType();
            String queryParameter = uri.getQueryParameter("displayEvent");
            return new b(uriQ, webViewLinkSettings, (ParametrizedEvent) (queryParameter != null ? gson.e(queryParameter, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "displayEvent", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }

    @Override // com.avito.android.deep_linking.x
    @Y61.l
    public final PublicDeeplink a(@Y61.k Uri uri) throws Throwable {
        DeepLink deepLinkE = e(uri);
        if (deepLinkE instanceof PublicDeeplink) {
            return (PublicDeeplink) deepLinkE;
        }
        this.f134216e.b(new d.a(uri, DeeplinkParsingFailReason.f134147d, new DeeplinkParsingError.ExpectedPublicDeeplink(uri.toString())));
        return null;
    }

    @Override // com.avito.android.deep_linking.x
    @Y61.k
    @InterfaceC42830m
    public final DeepLink b(@Y61.k String str) {
        return e(Uri.parse(str));
    }

    @Override // com.avito.android.deep_linking.x
    @Y61.k
    public final Object c(@Y61.k String str) {
        return f(Uri.parse(str));
    }

    @Override // com.avito.android.deep_linking.x
    @Y61.l
    public final PublicDeeplink d(@Y61.k String str) {
        return a(Uri.parse(str));
    }

    @Override // com.avito.android.deep_linking.x
    @Y61.k
    @InterfaceC42830m
    public final DeepLink e(@Y61.k Uri uri) throws Throwable {
        Object objF = f(uri);
        Throwable thB = kotlin.Z.b(objF);
        if (thB != null) {
            if (!(thB instanceof JsonParseException ? true : thB instanceof DeeplinkParsingError)) {
                throw thB;
            }
            V2.f318762a.b("LegacyDeepLinkFactory", thB);
            objF = new NoMatchLink();
        }
        return (DeepLink) objF;
    }

    @Override // com.avito.android.deep_linking.x
    @Y61.k
    @InterfaceC42830m
    public final Object f(@Y61.k Uri uri) {
        return this.f134217f.a(uri, new c(1, this, E2.class, "createFromStaticUri", "createFromStaticUri-IoAF18A(Landroid/net/Uri;)Ljava/lang/Object;", 0), new d(1, this, E2.class, "createFromFlexibleUri", "createFromFlexibleUri(Landroid/net/Uri;)Lcom/avito/android/deep_linking/links/DeepLink;", 0));
    }
}
