package com.avito.android.advert_core.advert;

import com.facebook.imageutils.JfifUtil;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDetailsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertDetailsItem;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsItem {

    /* renamed from: D4, reason: collision with root package name */
    public static final /* synthetic */ AdvertDetailsItem[] f82439D4;

    /* renamed from: E4, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f82443E4;

    /* renamed from: b, reason: collision with root package name */
    public static final AdvertDetailsItem f82525b = new AdvertDetailsItem("ITEM_GALLERY", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final AdvertDetailsItem f82530c = new AdvertDetailsItem("ITEM_TITLE", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final AdvertDetailsItem f82535d = new AdvertDetailsItem("ITEM_PRICE", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final AdvertDetailsItem f82540e = new AdvertDetailsItem("ITEM_PRICE_WITH_NORMALIZED_PRICE_AND_PRICE_HISTORY", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final AdvertDetailsItem f82545f = new AdvertDetailsItem("ITEM_CAMPAIGNS", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final AdvertDetailsItem f82550g = new AdvertDetailsItem("ITEM_DISCLAIMER", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final AdvertDetailsItem f82555h = new AdvertDetailsItem("ITEM_PRIVACY_DISCLAIMER", 6);

    /* renamed from: i, reason: collision with root package name */
    public static final AdvertDetailsItem f82560i = new AdvertDetailsItem("ITEM_DESCRIPTION", 7);

    /* renamed from: j, reason: collision with root package name */
    public static final AdvertDetailsItem f82565j = new AdvertDetailsItem("ITEM_BODY_CONDITION", 8);

    /* renamed from: k, reason: collision with root package name */
    public static final AdvertDetailsItem f82570k = new AdvertDetailsItem("ITEM_ADDRESS", 9);

    /* renamed from: l, reason: collision with root package name */
    public static final AdvertDetailsItem f82575l = new AdvertDetailsItem("ITEM_ADDRESS_HINT", 10);

    /* renamed from: m, reason: collision with root package name */
    public static final AdvertDetailsItem f82580m = new AdvertDetailsItem("ITEM_SHOW_ON_MAP", 11);

    /* renamed from: n, reason: collision with root package name */
    public static final AdvertDetailsItem f82585n = new AdvertDetailsItem("ITEM_MULTI_ADDRESSES_SHOW_ON_MAP", 12);

    /* renamed from: o, reason: collision with root package name */
    public static final AdvertDetailsItem f82590o = new AdvertDetailsItem("ITEM_MAP", 13);

    /* renamed from: p, reason: collision with root package name */
    public static final AdvertDetailsItem f82595p = new AdvertDetailsItem("ITEM_GROUPS", 14);

    /* renamed from: q, reason: collision with root package name */
    public static final AdvertDetailsItem f82600q = new AdvertDetailsItem("ITEM_AUTOTEKA_TEASER", 15);

    /* renamed from: r, reason: collision with root package name */
    public static final AdvertDetailsItem f82605r = new AdvertDetailsItem("ITEM_AUTOTEKA_SELECT_TEASER", 16);

    /* renamed from: s, reason: collision with root package name */
    public static final AdvertDetailsItem f82610s = new AdvertDetailsItem("ITEM_NOTE", 17);

    /* renamed from: t, reason: collision with root package name */
    public static final AdvertDetailsItem f82615t = new AdvertDetailsItem("ITEM_BUZZOOLA_CREDIT_BANNER", 18);

    /* renamed from: u, reason: collision with root package name */
    public static final AdvertDetailsItem f82620u = new AdvertDetailsItem("ITEM_CREDIT_CALCULATOR", 19);

    /* renamed from: v, reason: collision with root package name */
    public static final AdvertDetailsItem f82624v = new AdvertDetailsItem("ITEM_CREDIT_CALCULATOR_LINK", 20);

    /* renamed from: w, reason: collision with root package name */
    public static final AdvertDetailsItem f82628w = new AdvertDetailsItem("ITEM_INSTALLMENTS_BLOCK", 21);

    /* renamed from: x, reason: collision with root package name */
    public static final AdvertDetailsItem f82632x = new AdvertDetailsItem("ITEM_MORTGAGE_CALCULATOR", 22);

    /* renamed from: y, reason: collision with root package name */
    public static final AdvertDetailsItem f82636y = new AdvertDetailsItem("ITEM_MORTGAGE_CALCULATOR_SNIPPET", 23);

    /* renamed from: z, reason: collision with root package name */
    public static final AdvertDetailsItem f82640z = new AdvertDetailsItem("ITEM_SELLER_PROFILE", 24);

    /* renamed from: A, reason: collision with root package name */
    public static final AdvertDetailsItem f82424A = new AdvertDetailsItem("ITEM_ADVERT_NUMBER", 25);

    /* renamed from: B, reason: collision with root package name */
    public static final AdvertDetailsItem f82428B = new AdvertDetailsItem("ITEM_ABUSE", 26);

    /* renamed from: C, reason: collision with root package name */
    public static final AdvertDetailsItem f82432C = new AdvertDetailsItem("ITEM_DELIVERY", 27);

    /* renamed from: D, reason: collision with root package name */
    public static final AdvertDetailsItem f82436D = new AdvertDetailsItem("ITEM_SAFEDEAL_BUTTON", 28);

    /* renamed from: E, reason: collision with root package name */
    public static final AdvertDetailsItem f82440E = new AdvertDetailsItem("ITEM_SAFEDEAL_LABEL", 29);

    /* renamed from: F, reason: collision with root package name */
    public static final AdvertDetailsItem f82444F = new AdvertDetailsItem("ITEM_SAFEDEAL_TRUST_FACTORS", 30);

    /* renamed from: G, reason: collision with root package name */
    public static final AdvertDetailsItem f82447G = new AdvertDetailsItem("ITEM_SAFEDEAL_PAYMENT_BLOCK", 31);

    /* renamed from: H, reason: collision with root package name */
    public static final AdvertDetailsItem f82450H = new AdvertDetailsItem("ITEM_SAFEDEAL_SERVICES", 32);

    /* renamed from: I, reason: collision with root package name */
    public static final AdvertDetailsItem f82455I = new AdvertDetailsItem("ITEM_DELIVERY_COMBINED_BUTTONS", 33);

    /* renamed from: J, reason: collision with root package name */
    public static final AdvertDetailsItem f82458J = new AdvertDetailsItem("ITEM_B2C_BLOCK", 34);

    /* renamed from: K, reason: collision with root package name */
    public static final AdvertDetailsItem f82461K = new AdvertDetailsItem("ITEM_ADDRESS_CENTRITY_BLOCK", 35);

    /* renamed from: L, reason: collision with root package name */
    public static final AdvertDetailsItem f82464L = new AdvertDetailsItem("ITEM_DELIVERY_BLOCK", 36);

    /* renamed from: M, reason: collision with root package name */
    public static final AdvertDetailsItem f82467M = new AdvertDetailsItem("ITEM_CONSULTATION", 37);

    /* renamed from: N, reason: collision with root package name */
    public static final AdvertDetailsItem f82470N = new AdvertDetailsItem("ITEM_CONSULTATION_BUTTON", 38);

    /* renamed from: O, reason: collision with root package name */
    public static final AdvertDetailsItem f82473O = new AdvertDetailsItem("ITEM_CONSULTATION_AFTER_ICE_BREAKERS", 39);

    /* renamed from: P, reason: collision with root package name */
    public static final AdvertDetailsItem f82476P = new AdvertDetailsItem("ITEM_CONSULTATION_SECONDARY_LTR", 40);

    /* renamed from: Q, reason: collision with root package name */
    public static final AdvertDetailsItem f82480Q = new AdvertDetailsItem("ITEM_CONSULTATION_DYNAMIC_AFTER_ICE_BREAKERS", 41);

    /* renamed from: R, reason: collision with root package name */
    public static final AdvertDetailsItem f82484R = new AdvertDetailsItem("ITEM_FORM_LEAD_AUTO", 42);

    /* renamed from: S, reason: collision with root package name */
    public static final AdvertDetailsItem f82488S = new AdvertDetailsItem("ITEM_REALTY_USP", 43);

    /* renamed from: T, reason: collision with root package name */
    public static final AdvertDetailsItem f82492T = new AdvertDetailsItem("ITEM_RENT_AGREEMENT", 44);

    /* renamed from: U, reason: collision with root package name */
    public static final AdvertDetailsItem f82496U = new AdvertDetailsItem("ITEM_SHORT_TERM_RENT_STR_BUTTONS", 45);

    /* renamed from: V, reason: collision with root package name */
    public static final AdvertDetailsItem f82500V = new AdvertDetailsItem("ITEM_SHORT_TERM_RENT_ITEM_DISCOUNT", 46);

    /* renamed from: W, reason: collision with root package name */
    public static final AdvertDetailsItem f82504W = new AdvertDetailsItem("ITEM_CAR_RENT", 47);

    /* renamed from: X, reason: collision with root package name */
    public static final AdvertDetailsItem f82508X = new AdvertDetailsItem("ITEM_CONTACT_BAR", 48);

    /* renamed from: Y, reason: collision with root package name */
    public static final AdvertDetailsItem f82513Y = new AdvertDetailsItem("ITEM_SIMPLE_CONTACT_BAR", 49);

    /* renamed from: Z, reason: collision with root package name */
    public static final AdvertDetailsItem f82517Z = new AdvertDetailsItem("ITEM_SIMILARS_LOADER", 50);

    /* renamed from: a0, reason: collision with root package name */
    public static final AdvertDetailsItem f82521a0 = new AdvertDetailsItem("ITEM_SIMILARS_START_MARKER", 51);

    /* renamed from: b0, reason: collision with root package name */
    public static final AdvertDetailsItem f82526b0 = new AdvertDetailsItem("ITEM_GAP", 52);

    /* renamed from: c0, reason: collision with root package name */
    public static final AdvertDetailsItem f82531c0 = new AdvertDetailsItem("ITEM_BOTTOM_GAP", 53);

    /* renamed from: d0, reason: collision with root package name */
    public static final AdvertDetailsItem f82536d0 = new AdvertDetailsItem("ITEM_GEO_MARKET_REPORT", 54);

    /* renamed from: e0, reason: collision with root package name */
    public static final AdvertDetailsItem f82541e0 = new AdvertDetailsItem("ITEM_DIVIDER", 55);

    /* renamed from: f0, reason: collision with root package name */
    public static final AdvertDetailsItem f82546f0 = new AdvertDetailsItem("ITEM_HEADER_REVIEWS_SCORE", 56);

    /* renamed from: g0, reason: collision with root package name */
    public static final AdvertDetailsItem f82551g0 = new AdvertDetailsItem("ITEM_MULTI_ITEM", 57);

    /* renamed from: h0, reason: collision with root package name */
    public static final AdvertDetailsItem f82556h0 = new AdvertDetailsItem("ITEM_GEO_REFERENCE", 58);

    /* renamed from: i0, reason: collision with root package name */
    public static final AdvertDetailsItem f82561i0 = new AdvertDetailsItem("ITEM_RICH_GEO_BLOCK", 59);

    /* renamed from: j0, reason: collision with root package name */
    public static final AdvertDetailsItem f82566j0 = new AdvertDetailsItem("ITEM_SELLER_SUBSCRIPTION", 60);

    /* renamed from: k0, reason: collision with root package name */
    public static final AdvertDetailsItem f82571k0 = new AdvertDetailsItem("ITEM_SERVICE_BOOKING", 61);

    /* renamed from: l0, reason: collision with root package name */
    public static final AdvertDetailsItem f82576l0 = new AdvertDetailsItem("ITEM_SERVICE_ORDER", 62);

    /* renamed from: m0, reason: collision with root package name */
    public static final AdvertDetailsItem f82581m0 = new AdvertDetailsItem("ITEM_SERVICE_DISCOUNT_AND_BUYER_GIFT_ITEM", 63);

    /* renamed from: n0, reason: collision with root package name */
    public static final AdvertDetailsItem f82586n0 = new AdvertDetailsItem("ITEM_STATUS_BADGE", 64);

    /* renamed from: o0, reason: collision with root package name */
    public static final AdvertDetailsItem f82591o0 = new AdvertDetailsItem("ITEM_CV_STATE", 65);

    /* renamed from: p0, reason: collision with root package name */
    public static final AdvertDetailsItem f82596p0 = new AdvertDetailsItem("ITEM_SIMILAR_ADDRESS_1", 66);

    /* renamed from: q0, reason: collision with root package name */
    public static final AdvertDetailsItem f82601q0 = new AdvertDetailsItem("ITEM_SIMILAR_ADDRESS_2", 67);

    /* renamed from: r0, reason: collision with root package name */
    public static final AdvertDetailsItem f82606r0 = new AdvertDetailsItem("ITEM_SIMILARS_BUTTON", 68);

    /* renamed from: s0, reason: collision with root package name */
    public static final AdvertDetailsItem f82611s0 = new AdvertDetailsItem("ITEM_SHOW_DESCRIPTION", 69);

    /* renamed from: t0, reason: collision with root package name */
    public static final AdvertDetailsItem f82616t0 = new AdvertDetailsItem("ITEM_VACANCY_ALTERNATE_ADDRESS", 70);

    /* renamed from: u0, reason: collision with root package name */
    public static final AdvertDetailsItem f82621u0 = new AdvertDetailsItem("ITEM_IMV", 71);

    /* renamed from: v0, reason: collision with root package name */
    public static final AdvertDetailsItem f82625v0 = new AdvertDetailsItem("ITEM_RATING_PUBLISH", 72);

    /* renamed from: w0, reason: collision with root package name */
    public static final AdvertDetailsItem f82629w0 = new AdvertDetailsItem("ITEM_GUIDE", 73);

    /* renamed from: x0, reason: collision with root package name */
    public static final AdvertDetailsItem f82633x0 = new AdvertDetailsItem("ITEM_ADVERT_VERIFICATION", 74);

    /* renamed from: y0, reason: collision with root package name */
    public static final AdvertDetailsItem f82637y0 = new AdvertDetailsItem("ITEM_RESERVATION_INFO", 75);

    /* renamed from: z0, reason: collision with root package name */
    public static final AdvertDetailsItem f82641z0 = new AdvertDetailsItem("ITEM_ICE_BREAKERS", 76);

    /* renamed from: A0, reason: collision with root package name */
    public static final AdvertDetailsItem f82425A0 = new AdvertDetailsItem("ITEM_CHECKED_BY_AVITO", 77);

    /* renamed from: B0, reason: collision with root package name */
    public static final AdvertDetailsItem f82429B0 = new AdvertDetailsItem("ITEM_BACK_TO_SEARCH", 78);

    /* renamed from: C0, reason: collision with root package name */
    public static final AdvertDetailsItem f82433C0 = new AdvertDetailsItem("ITEM_SERP_ITEMS_HEADER", 79);

    /* renamed from: D0, reason: collision with root package name */
    public static final AdvertDetailsItem f82437D0 = new AdvertDetailsItem("ITEM_PRICE_WITH_DISCOUNT", 80);

    /* renamed from: E0, reason: collision with root package name */
    public static final AdvertDetailsItem f82441E0 = new AdvertDetailsItem("ITEM_MARKETPLACE_STOCKS", 81);

    /* renamed from: F0, reason: collision with root package name */
    public static final AdvertDetailsItem f82445F0 = new AdvertDetailsItem("ITEM_MARKETPLACE_SALES_ADVERT_PROMO_BANNER", 82);

    /* renamed from: G0, reason: collision with root package name */
    public static final AdvertDetailsItem f82448G0 = new AdvertDetailsItem("ITEM_MARKETPLACE_SALES_BANNER", 83);

    /* renamed from: H0, reason: collision with root package name */
    public static final AdvertDetailsItem f82451H0 = new AdvertDetailsItem("ITEM_MARKETPLACE_SALES_BANNER_OUT_OF_BOUNDS", 84);

    /* renamed from: I0, reason: collision with root package name */
    public static final AdvertDetailsItem f82456I0 = new AdvertDetailsItem("ITEM_MARKETPLACE_REWARDS_BANNER", 85);

    /* renamed from: J0, reason: collision with root package name */
    public static final AdvertDetailsItem f82459J0 = new AdvertDetailsItem("ITEM_BANNER_HIGH_TRAFFIC", 86);

    /* renamed from: K0, reason: collision with root package name */
    public static final AdvertDetailsItem f82462K0 = new AdvertDetailsItem("ITEM_BANNER_HOUSEHOLD", 87);

    /* renamed from: L0, reason: collision with root package name */
    public static final AdvertDetailsItem f82465L0 = new AdvertDetailsItem("ITEM_BANNER_NO_SALES", 88);

    /* renamed from: M0, reason: collision with root package name */
    public static final AdvertDetailsItem f82468M0 = new AdvertDetailsItem("ITEM_BANNER_HAS_PROBLEM", 89);

    /* renamed from: N0, reason: collision with root package name */
    public static final AdvertDetailsItem f82471N0 = new AdvertDetailsItem("ITEM_ASK_QUESTION", 90);

    /* renamed from: O0, reason: collision with root package name */
    public static final AdvertDetailsItem f82474O0 = new AdvertDetailsItem("ITEM_SPARE_PARTS", 91);

    /* renamed from: P0, reason: collision with root package name */
    public static final AdvertDetailsItem f82477P0 = new AdvertDetailsItem("ITEM_BOOKING", 92);

    /* renamed from: Q0, reason: collision with root package name */
    public static final AdvertDetailsItem f82481Q0 = new AdvertDetailsItem("ITEM_BADGE_BAR", 93);

    /* renamed from: R0, reason: collision with root package name */
    public static final AdvertDetailsItem f82485R0 = new AdvertDetailsItem("ITEM_DEVELOPER_BUTTON", 94);

    /* renamed from: S0, reason: collision with root package name */
    public static final AdvertDetailsItem f82489S0 = new AdvertDetailsItem("ITEM_DEVELOPER_TRUST", 95);

    /* renamed from: T0, reason: collision with root package name */
    public static final AdvertDetailsItem f82493T0 = new AdvertDetailsItem("ITEM_ADDITIONAL_SELLER_TITLE", 96);

    /* renamed from: U0, reason: collision with root package name */
    public static final AdvertDetailsItem f82497U0 = new AdvertDetailsItem("ITEM_ADDITIONAL_SELLER_BUTTON", 97);

    /* renamed from: V0, reason: collision with root package name */
    public static final AdvertDetailsItem f82501V0 = new AdvertDetailsItem("ITEM_ADDITIONAL_SELLER_FEATURES", 98);

    /* renamed from: W0, reason: collision with root package name */
    public static final AdvertDetailsItem f82505W0 = new AdvertDetailsItem("ITEM_CAR_MARKET_PRICE", 99);

    /* renamed from: X0, reason: collision with root package name */
    public static final AdvertDetailsItem f82509X0 = new AdvertDetailsItem("ITEM_CAR_MARKET_PRICE_CHART", 100);

    /* renamed from: Y0, reason: collision with root package name */
    public static final AdvertDetailsItem f82514Y0 = new AdvertDetailsItem("ITEM_CAR_MARKET_PRICE_POLL", UpdateStatusCode.DialogButton.CONFIRM);

    /* renamed from: Z0, reason: collision with root package name */
    public static final AdvertDetailsItem f82518Z0 = new AdvertDetailsItem("ITEM_DESCRIPTION_HEADER", 102);

    /* renamed from: a1, reason: collision with root package name */
    public static final AdvertDetailsItem f82522a1 = new AdvertDetailsItem("ITEM_REALTY_IMV", 103);

    /* renamed from: b1, reason: collision with root package name */
    public static final AdvertDetailsItem f82527b1 = new AdvertDetailsItem("ITEM_EQUIPMENTS", 104);

    /* renamed from: c1, reason: collision with root package name */
    public static final AdvertDetailsItem f82532c1 = new AdvertDetailsItem("ITEM_SERVICE_APP_FILLING_BUTTON", 105);

    /* renamed from: d1, reason: collision with root package name */
    public static final AdvertDetailsItem f82537d1 = new AdvertDetailsItem("ITEM_SERVICE_APP_FILLING_INFO", 106);

    /* renamed from: e1, reason: collision with root package name */
    public static final AdvertDetailsItem f82542e1 = new AdvertDetailsItem("ITEM_MODEL_SPECS", 107);

    /* renamed from: f1, reason: collision with root package name */
    public static final AdvertDetailsItem f82547f1 = new AdvertDetailsItem("ITEM_PRICE_LIST_HEADER", 108);

    /* renamed from: g1, reason: collision with root package name */
    public static final AdvertDetailsItem f82552g1 = new AdvertDetailsItem("ITEM_PRICE_LIST_GROUP_TITLE", 109);

    /* renamed from: h1, reason: collision with root package name */
    public static final AdvertDetailsItem f82557h1 = new AdvertDetailsItem("ITEM_PRICE_CURRENCY_HINT", 110);

    /* renamed from: i1, reason: collision with root package name */
    public static final AdvertDetailsItem f82562i1 = new AdvertDetailsItem("ITEM_GARAGE_COMPATIBILITY_V2", 111);

    /* renamed from: j1, reason: collision with root package name */
    public static final AdvertDetailsItem f82567j1 = new AdvertDetailsItem("ITEM_GARAGE_COMPATIBILITY_V3", 112);

    /* renamed from: k1, reason: collision with root package name */
    public static final AdvertDetailsItem f82572k1 = new AdvertDetailsItem("ITEM_GARAGE_COMPATIBILITY_V4", 113);

    /* renamed from: l1, reason: collision with root package name */
    public static final AdvertDetailsItem f82577l1 = new AdvertDetailsItem("ITEM_MAP_PREVIEW", 114);

    /* renamed from: m1, reason: collision with root package name */
    public static final AdvertDetailsItem f82582m1 = new AdvertDetailsItem("ITEM_REVIEWS_SCORE", 115);

    /* renamed from: n1, reason: collision with root package name */
    public static final AdvertDetailsItem f82587n1 = new AdvertDetailsItem("ITEM_REVIEW", 116);

    /* renamed from: o1, reason: collision with root package name */
    public static final AdvertDetailsItem f82592o1 = new AdvertDetailsItem("ITEM_RATING_LLM_SUMMARY", 117);

    /* renamed from: p1, reason: collision with root package name */
    public static final AdvertDetailsItem f82597p1 = new AdvertDetailsItem("ITEM_IMV_CARS_V3", 118);

    /* renamed from: q1, reason: collision with root package name */
    public static final AdvertDetailsItem f82602q1 = new AdvertDetailsItem("ITEM_IMV_CARS_V4", 119);

    /* renamed from: r1, reason: collision with root package name */
    public static final AdvertDetailsItem f82607r1 = new AdvertDetailsItem("ITEM_LEASING_CALCULATOR", 120);

    /* renamed from: s1, reason: collision with root package name */
    public static final AdvertDetailsItem f82612s1 = new AdvertDetailsItem("ITEM_LEASING_CALCULATOR_LINK", 121);

    /* renamed from: t1, reason: collision with root package name */
    public static final AdvertDetailsItem f82617t1 = new AdvertDetailsItem("ITEM_LEASING_BEDUIN", 122);

    /* renamed from: H1, reason: collision with root package name */
    public static final AdvertDetailsItem f82452H1 = new AdvertDetailsItem("ITEM_DEVELOPMENT_OFFERS", 123);

    /* renamed from: X1, reason: collision with root package name */
    public static final AdvertDetailsItem f82510X1 = new AdvertDetailsItem("ITEM_OFFERS", 124);

    /* renamed from: H2, reason: collision with root package name */
    public static final AdvertDetailsItem f82453H2 = new AdvertDetailsItem("ITEM_CHAT_HISTORY", 125);

    /* renamed from: P2, reason: collision with root package name */
    public static final AdvertDetailsItem f82478P2 = new AdvertDetailsItem("ITEM_OWNERSHIP_COST", WebSocketProtocol.PAYLOAD_SHORT);

    /* renamed from: Q2, reason: collision with root package name */
    public static final AdvertDetailsItem f82482Q2 = new AdvertDetailsItem("ITEM_SELECT", 127);

    /* renamed from: R2, reason: collision with root package name */
    public static final AdvertDetailsItem f82486R2 = new AdvertDetailsItem("ITEM_SELECT_CONTROLS", 128);

    /* renamed from: S2, reason: collision with root package name */
    public static final AdvertDetailsItem f82490S2 = new AdvertDetailsItem("ITEM_SELECT_TEASER", 129);

    /* renamed from: T2, reason: collision with root package name */
    public static final AdvertDetailsItem f82494T2 = new AdvertDetailsItem("ITEM_SPARE_PARTS_COST", 130);

    /* renamed from: U2, reason: collision with root package name */
    public static final AdvertDetailsItem f82498U2 = new AdvertDetailsItem("ITEM_DISCLAIMER_PD", 131);

    /* renamed from: V2, reason: collision with root package name */
    public static final AdvertDetailsItem f82502V2 = new AdvertDetailsItem("ITEM_CV_PHONE_ACTUALIZATION_BANNER", 132);

    /* renamed from: W2, reason: collision with root package name */
    public static final AdvertDetailsItem f82506W2 = new AdvertDetailsItem("ITEM_IMV_SERVICES", 133);

    /* renamed from: X2, reason: collision with root package name */
    public static final AdvertDetailsItem f82511X2 = new AdvertDetailsItem("ITEM_JOB_SEARCH_STATUS", 134);

    /* renamed from: Y2, reason: collision with root package name */
    public static final AdvertDetailsItem f82515Y2 = new AdvertDetailsItem("ITEM_JOB_SEEKER_INFO", 135);

    /* renamed from: Z2, reason: collision with root package name */
    public static final AdvertDetailsItem f82519Z2 = new AdvertDetailsItem("ITEM_INFORMATION_ABOUT", 136);

    /* renamed from: a3, reason: collision with root package name */
    public static final AdvertDetailsItem f82523a3 = new AdvertDetailsItem("ITEM_REALTY_QUIZ_BANNER", 137);

    /* renamed from: b3, reason: collision with root package name */
    public static final AdvertDetailsItem f82528b3 = new AdvertDetailsItem("ITEM_HEADER", 138);

    /* renamed from: c3, reason: collision with root package name */
    public static final AdvertDetailsItem f82533c3 = new AdvertDetailsItem("ITEM_AVITO_BLACK_TITLE_AND_PRICE", 139);

    /* renamed from: d3, reason: collision with root package name */
    public static final AdvertDetailsItem f82538d3 = new AdvertDetailsItem("ITEM_DOCKING_BADGE_BAR", 140);

    /* renamed from: e3, reason: collision with root package name */
    public static final AdvertDetailsItem f82543e3 = new AdvertDetailsItem("ITEM_BADGE_BAR_LIGHT", 141);

    /* renamed from: f3, reason: collision with root package name */
    public static final AdvertDetailsItem f82548f3 = new AdvertDetailsItem("ITEM_PRICE_LIST_PREVIEW", 142);

    /* renamed from: g3, reason: collision with root package name */
    public static final AdvertDetailsItem f82553g3 = new AdvertDetailsItem("ITEM_MORTGAGE_BEST_OFFER", 143);

    /* renamed from: h3, reason: collision with root package name */
    public static final AdvertDetailsItem f82558h3 = new AdvertDetailsItem("ITEM_DOMOTEKA_REPORT_TEASER", 144);

    /* renamed from: i3, reason: collision with root package name */
    public static final AdvertDetailsItem f82563i3 = new AdvertDetailsItem("ITEM_OTHER_CATEGORIES", 145);

    /* renamed from: j3, reason: collision with root package name */
    public static final AdvertDetailsItem f82568j3 = new AdvertDetailsItem("ITEM_SELECT_BOOKING", 146);

    /* renamed from: k3, reason: collision with root package name */
    public static final AdvertDetailsItem f82573k3 = new AdvertDetailsItem("ITEM_BUYER_BONUSES", 147);

    /* renamed from: l3, reason: collision with root package name */
    public static final AdvertDetailsItem f82578l3 = new AdvertDetailsItem("ITEM_AUTO_SELECT_PARAMETERS", 148);

    /* renamed from: m3, reason: collision with root package name */
    public static final AdvertDetailsItem f82583m3 = new AdvertDetailsItem("ITEM_AUTO_SELECT_PARAMETERS_V2", 149);

    /* renamed from: n3, reason: collision with root package name */
    public static final AdvertDetailsItem f82588n3 = new AdvertDetailsItem("ITEM_AUTO_SELECT_BANNER", 150);

    /* renamed from: o3, reason: collision with root package name */
    public static final AdvertDetailsItem f82593o3 = new AdvertDetailsItem("ITEM_AUTO_SELECT_MANAGER", 151);

    /* renamed from: p3, reason: collision with root package name */
    public static final AdvertDetailsItem f82598p3 = new AdvertDetailsItem("ITEM_AUTO_SELECT_NO_CLICK_CONTACT", 152);

    /* renamed from: q3, reason: collision with root package name */
    public static final AdvertDetailsItem f82603q3 = new AdvertDetailsItem("ITEM_AUTO_SELECT_PARAMETERS_V3", 153);

    /* renamed from: r3, reason: collision with root package name */
    public static final AdvertDetailsItem f82608r3 = new AdvertDetailsItem("ITEM_PP_REALTY_PROMO", 154);

    /* renamed from: s3, reason: collision with root package name */
    public static final AdvertDetailsItem f82613s3 = new AdvertDetailsItem("ITEM_AUTO_RECALL_ME", 155);

    /* renamed from: t3, reason: collision with root package name */
    public static final AdvertDetailsItem f82618t3 = new AdvertDetailsItem("ITEM_SERVICE_EDUCATION", 156);

    /* renamed from: u3, reason: collision with root package name */
    public static final AdvertDetailsItem f82622u3 = new AdvertDetailsItem("ITEM_SERVICES_REVIEW_VOLUNTEERS", 157);

    /* renamed from: v3, reason: collision with root package name */
    public static final AdvertDetailsItem f82626v3 = new AdvertDetailsItem("ITEM_FAIR_PRICE", 158);

    /* renamed from: w3, reason: collision with root package name */
    public static final AdvertDetailsItem f82630w3 = new AdvertDetailsItem("ITEM_VIDEO_CALL_REQUEST", 159);

    /* renamed from: x3, reason: collision with root package name */
    public static final AdvertDetailsItem f82634x3 = new AdvertDetailsItem("ITEM_AUTO_MEDIA", 160);

    /* renamed from: y3, reason: collision with root package name */
    public static final AdvertDetailsItem f82638y3 = new AdvertDetailsItem("ITEM_AUTO_MEDIA_SELECT_PIXEL", 161);

    /* renamed from: z3, reason: collision with root package name */
    public static final AdvertDetailsItem f82642z3 = new AdvertDetailsItem("ITEM_PP_RECALL_PROMO", 162);

    /* renamed from: A3, reason: collision with root package name */
    public static final AdvertDetailsItem f82426A3 = new AdvertDetailsItem("ITEM_PP_RECALL_PROMO_CLOSED", 163);

    /* renamed from: B3, reason: collision with root package name */
    public static final AdvertDetailsItem f82430B3 = new AdvertDetailsItem("ITEM_COMFORTABLE_DEAL_PROMO", 164);

    /* renamed from: C3, reason: collision with root package name */
    public static final AdvertDetailsItem f82434C3 = new AdvertDetailsItem("ITEM_SERVICES_TITLE", 165);

    /* renamed from: D3, reason: collision with root package name */
    public static final AdvertDetailsItem f82438D3 = new AdvertDetailsItem("ITEM_SERVICES_PRICE", 166);

    /* renamed from: E3, reason: collision with root package name */
    public static final AdvertDetailsItem f82442E3 = new AdvertDetailsItem("ITEM_EARLY_ACCESS_ADVERT_FAKEDOOR", 167);

    /* renamed from: F3, reason: collision with root package name */
    public static final AdvertDetailsItem f82446F3 = new AdvertDetailsItem("ITEM_SEEKER_RESPONSES_INFO_V2", 168);

    /* renamed from: G3, reason: collision with root package name */
    public static final AdvertDetailsItem f82449G3 = new AdvertDetailsItem("ITEM_HOTEL_CHECKIN_RULES_DESCRIPTION", 169);

    /* renamed from: H3, reason: collision with root package name */
    public static final AdvertDetailsItem f82454H3 = new AdvertDetailsItem("ITEM_HOTEL_GUEST_INFO_DESCRIPTION", 170);

    /* renamed from: I3, reason: collision with root package name */
    public static final AdvertDetailsItem f82457I3 = new AdvertDetailsItem("ITEM_HOTEL_SHOW_ON_MAP", 171);

    /* renamed from: J3, reason: collision with root package name */
    public static final AdvertDetailsItem f82460J3 = new AdvertDetailsItem("ITEM_AMENITIES", 172);

    /* renamed from: K3, reason: collision with root package name */
    public static final AdvertDetailsItem f82463K3 = new AdvertDetailsItem("ITEM_HOTEL_OFFER", 173);

    /* renamed from: L3, reason: collision with root package name */
    public static final AdvertDetailsItem f82466L3 = new AdvertDetailsItem("ITEM_HOTEL_PROMO_WIDGET", 174);

    /* renamed from: M3, reason: collision with root package name */
    public static final AdvertDetailsItem f82469M3 = new AdvertDetailsItem("ITEM_HOTEL_RATING", 175);

    /* renamed from: N3, reason: collision with root package name */
    public static final AdvertDetailsItem f82472N3 = new AdvertDetailsItem("ITEM_HOTEL_LOCATION_TITLE", 176);

    /* renamed from: O3, reason: collision with root package name */
    public static final AdvertDetailsItem f82475O3 = new AdvertDetailsItem("ITEM_STICKED_SALES_BANNER", 177);

    /* renamed from: P3, reason: collision with root package name */
    public static final AdvertDetailsItem f82479P3 = new AdvertDetailsItem("ITEM_COMPOSITE_BROKER_CALCULATOR", 178);

    /* renamed from: Q3, reason: collision with root package name */
    public static final AdvertDetailsItem f82483Q3 = new AdvertDetailsItem("ITEM_GEO_ZONES_TITLE", 179);

    /* renamed from: R3, reason: collision with root package name */
    public static final AdvertDetailsItem f82487R3 = new AdvertDetailsItem("ITEM_WALLET_INFO", 180);

    /* renamed from: S3, reason: collision with root package name */
    public static final AdvertDetailsItem f82491S3 = new AdvertDetailsItem("ITEM_FMP_BANNER", 181);

    /* renamed from: T3, reason: collision with root package name */
    public static final AdvertDetailsItem f82495T3 = new AdvertDetailsItem("ITEM_FMP_OFFER", 182);

    /* renamed from: U3, reason: collision with root package name */
    public static final AdvertDetailsItem f82499U3 = new AdvertDetailsItem("ITEM_FMP_CALCULATOR", 183);

    /* renamed from: V3, reason: collision with root package name */
    public static final AdvertDetailsItem f82503V3 = new AdvertDetailsItem("ITEM_FMP_PRODUCTS", 184);

    /* renamed from: W3, reason: collision with root package name */
    public static final AdvertDetailsItem f82507W3 = new AdvertDetailsItem("ITEM_ANCHOR_TRUST_FACTORS", 185);

    /* renamed from: X3, reason: collision with root package name */
    public static final AdvertDetailsItem f82512X3 = new AdvertDetailsItem("ITEM_TIRES_BANNER", 186);

    /* renamed from: Y3, reason: collision with root package name */
    public static final AdvertDetailsItem f82516Y3 = new AdvertDetailsItem("PROMO_MECHANICS", 187);

    /* renamed from: Z3, reason: collision with root package name */
    public static final AdvertDetailsItem f82520Z3 = new AdvertDetailsItem("ITEM_DELIVERY_SUGGESTS", 188);

    /* renamed from: a4, reason: collision with root package name */
    public static final AdvertDetailsItem f82524a4 = new AdvertDetailsItem("ITEM_PARKING", 189);

    /* renamed from: b4, reason: collision with root package name */
    public static final AdvertDetailsItem f82529b4 = new AdvertDetailsItem("ITEM_EQUIPMENT_TILE", 190);

    /* renamed from: c4, reason: collision with root package name */
    public static final AdvertDetailsItem f82534c4 = new AdvertDetailsItem("ITEM_ADDRESS_GEO_DISTANCE", 191);

    /* renamed from: d4, reason: collision with root package name */
    public static final AdvertDetailsItem f82539d4 = new AdvertDetailsItem("ITEM_POPULARITY_INFO", 192);

    /* renamed from: e4, reason: collision with root package name */
    public static final AdvertDetailsItem f82544e4 = new AdvertDetailsItem("ITEM_CAR_RENTAL_BANNER", 193);

    /* renamed from: f4, reason: collision with root package name */
    public static final AdvertDetailsItem f82549f4 = new AdvertDetailsItem("ITEM_REPAIR_CALCULATOR_BANNER", 194);

    /* renamed from: g4, reason: collision with root package name */
    public static final AdvertDetailsItem f82554g4 = new AdvertDetailsItem("ITEM_SERVICES_TRANSPORT_INFO", 195);

    /* renamed from: h4, reason: collision with root package name */
    public static final AdvertDetailsItem f82559h4 = new AdvertDetailsItem("ITEM_SERVICES_TRANSPORTATION_GEO", 196);

    /* renamed from: i4, reason: collision with root package name */
    public static final AdvertDetailsItem f82564i4 = new AdvertDetailsItem("ITEM_PORTFOLIO_BLOCK", 197);

    /* renamed from: j4, reason: collision with root package name */
    public static final AdvertDetailsItem f82569j4 = new AdvertDetailsItem("ITEM_SERVICES_WORK_TIME", 198);

    /* renamed from: k4, reason: collision with root package name */
    public static final AdvertDetailsItem f82574k4 = new AdvertDetailsItem("ITEM_GIG_SIMILAR_SHIFTS", 199);

    /* renamed from: l4, reason: collision with root package name */
    public static final AdvertDetailsItem f82579l4 = new AdvertDetailsItem("ITEM_GIG_DUTIES", 200);

    /* renamed from: m4, reason: collision with root package name */
    public static final AdvertDetailsItem f82584m4 = new AdvertDetailsItem("ITEM_GIG_SELLER", 201);

    /* renamed from: n4, reason: collision with root package name */
    public static final AdvertDetailsItem f82589n4 = new AdvertDetailsItem("ITEM_GALLERY_BLOCK", 202);

    /* renamed from: o4, reason: collision with root package name */
    public static final AdvertDetailsItem f82594o4 = new AdvertDetailsItem("ITEM_GALLERY_BLOCK_ELEMENT", 203);

    /* renamed from: p4, reason: collision with root package name */
    public static final AdvertDetailsItem f82599p4 = new AdvertDetailsItem("BRANDING_ADVANTAGES_BLOCK", 204);

    /* renamed from: q4, reason: collision with root package name */
    public static final AdvertDetailsItem f82604q4 = new AdvertDetailsItem("BRANDING_ADVANTAGES_BLOCK_ELEMENT", 205);

    /* renamed from: r4, reason: collision with root package name */
    public static final AdvertDetailsItem f82609r4 = new AdvertDetailsItem("ITEM_PRICE_HISTORY", 206);

    /* renamed from: s4, reason: collision with root package name */
    public static final AdvertDetailsItem f82614s4 = new AdvertDetailsItem("ITEM_GIG_PERSONAL_INFO", 207);

    /* renamed from: t4, reason: collision with root package name */
    public static final AdvertDetailsItem f82619t4 = new AdvertDetailsItem("ITEM_DELIVERY_TRUST_FACTORS", JfifUtil.MARKER_RST0);

    /* renamed from: u4, reason: collision with root package name */
    public static final AdvertDetailsItem f82623u4 = new AdvertDetailsItem("ITEM_SEARCH_SUGGESTS", 209);

    /* renamed from: v4, reason: collision with root package name */
    public static final AdvertDetailsItem f82627v4 = new AdvertDetailsItem("ITEM_TRAVEL_PAYMENT_TOGGLES", 210);

    /* renamed from: w4, reason: collision with root package name */
    public static final AdvertDetailsItem f82631w4 = new AdvertDetailsItem("ITEM_TRAVEL_PRICE", 211);

    /* renamed from: x4, reason: collision with root package name */
    public static final AdvertDetailsItem f82635x4 = new AdvertDetailsItem("ITEM_TRAVEL_TRUST_ITEM", 212);

    /* renamed from: y4, reason: collision with root package name */
    public static final AdvertDetailsItem f82639y4 = new AdvertDetailsItem("ITEM_SCROLL_UP", 213);

    /* renamed from: z4, reason: collision with root package name */
    public static final AdvertDetailsItem f82643z4 = new AdvertDetailsItem("ITEM_EXPERT_BLOCK", 214);

    /* renamed from: A4, reason: collision with root package name */
    public static final AdvertDetailsItem f82427A4 = new AdvertDetailsItem("ITEM_ICEBREAKERS_REDESIGN", JfifUtil.MARKER_RST7);

    /* renamed from: B4, reason: collision with root package name */
    public static final AdvertDetailsItem f82431B4 = new AdvertDetailsItem("ITEM_PRICE_DESCRIPTION_BUTTON", JfifUtil.MARKER_SOI);

    /* renamed from: C4, reason: collision with root package name */
    public static final AdvertDetailsItem f82435C4 = new AdvertDetailsItem("ITEM_REUSABLE_AMENITIES", JfifUtil.MARKER_EOI);

    static {
        AdvertDetailsItem[] advertDetailsItemArr = {f82525b, f82530c, f82535d, f82540e, f82545f, f82550g, f82555h, f82560i, f82565j, f82570k, f82575l, f82580m, f82585n, f82590o, f82595p, f82600q, f82605r, f82610s, f82615t, f82620u, f82624v, f82628w, f82632x, f82636y, f82640z, f82424A, f82428B, f82432C, f82436D, f82440E, f82444F, f82447G, f82450H, f82455I, f82458J, f82461K, f82464L, f82467M, f82470N, f82473O, f82476P, f82480Q, f82484R, f82488S, f82492T, f82496U, f82500V, f82504W, f82508X, f82513Y, f82517Z, f82521a0, f82526b0, f82531c0, f82536d0, f82541e0, f82546f0, f82551g0, f82556h0, f82561i0, f82566j0, f82571k0, f82576l0, f82581m0, f82586n0, f82591o0, f82596p0, f82601q0, f82606r0, f82611s0, f82616t0, f82621u0, f82625v0, f82629w0, f82633x0, f82637y0, f82641z0, f82425A0, f82429B0, f82433C0, f82437D0, f82441E0, f82445F0, f82448G0, f82451H0, f82456I0, f82459J0, f82462K0, f82465L0, f82468M0, f82471N0, f82474O0, f82477P0, f82481Q0, f82485R0, f82489S0, f82493T0, f82497U0, f82501V0, f82505W0, f82509X0, f82514Y0, f82518Z0, f82522a1, f82527b1, f82532c1, f82537d1, f82542e1, f82547f1, f82552g1, f82557h1, f82562i1, f82567j1, f82572k1, f82577l1, f82582m1, f82587n1, f82592o1, f82597p1, f82602q1, f82607r1, f82612s1, f82617t1, f82452H1, f82510X1, f82453H2, f82478P2, f82482Q2, f82486R2, f82490S2, f82494T2, f82498U2, f82502V2, f82506W2, f82511X2, f82515Y2, f82519Z2, f82523a3, f82528b3, f82533c3, f82538d3, f82543e3, f82548f3, f82553g3, f82558h3, f82563i3, f82568j3, f82573k3, f82578l3, f82583m3, f82588n3, f82593o3, f82598p3, f82603q3, f82608r3, f82613s3, f82618t3, f82622u3, f82626v3, f82630w3, f82634x3, f82638y3, f82642z3, f82426A3, f82430B3, f82434C3, f82438D3, f82442E3, f82446F3, f82449G3, f82454H3, f82457I3, f82460J3, f82463K3, f82466L3, f82469M3, f82472N3, f82475O3, f82479P3, f82483Q3, f82487R3, f82491S3, f82495T3, f82499U3, f82503V3, f82507W3, f82512X3, f82516Y3, f82520Z3, f82524a4, f82529b4, f82534c4, f82539d4, f82544e4, f82549f4, f82554g4, f82559h4, f82564i4, f82569j4, f82574k4, f82579l4, f82584m4, f82589n4, f82594o4, f82599p4, f82604q4, f82609r4, f82614s4, f82619t4, f82623u4, f82627v4, f82631w4, f82635x4, f82639y4, f82643z4, f82427A4, f82431B4, f82435C4, new AdvertDetailsItem("ITEM_BUYER_TRUST_BANNER", JfifUtil.MARKER_SOS), new AdvertDetailsItem("ITEM_INTERIOR_PHOTOS", 219)};
        f82439D4 = advertDetailsItemArr;
        f82443E4 = kotlin.enums.c.a(advertDetailsItemArr);
    }

    public AdvertDetailsItem() {
        throw null;
    }

    public static AdvertDetailsItem valueOf(String str) {
        return (AdvertDetailsItem) Enum.valueOf(AdvertDetailsItem.class, str);
    }

    public static AdvertDetailsItem[] values() {
        return (AdvertDetailsItem[]) f82439D4.clone();
    }
}
