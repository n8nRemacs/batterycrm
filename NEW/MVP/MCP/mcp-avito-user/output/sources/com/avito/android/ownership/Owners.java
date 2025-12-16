package com.avito.android.ownership;

import Y61.k;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.ws.WebSocketProtocol;
import zZ.InterfaceC50527a;
import zZ.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Owners.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ownership/Owners;", "", "LzZ/a;", "code-owners"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Owners implements InterfaceC50527a {

    /* renamed from: A, reason: collision with root package name */
    public static final Owners f210388A;

    /* renamed from: A0, reason: collision with root package name */
    public static final Owners f210389A0;

    /* renamed from: A3, reason: collision with root package name */
    public static final Owners f210390A3;

    /* renamed from: B, reason: collision with root package name */
    public static final Owners f210391B;

    /* renamed from: B0, reason: collision with root package name */
    public static final Owners f210392B0;

    /* renamed from: B3, reason: collision with root package name */
    public static final Owners f210393B3;

    /* renamed from: C, reason: collision with root package name */
    public static final Owners f210394C;

    /* renamed from: C0, reason: collision with root package name */
    public static final Owners f210395C0;

    /* renamed from: C3, reason: collision with root package name */
    public static final Owners f210396C3;

    /* renamed from: D, reason: collision with root package name */
    public static final Owners f210397D;

    /* renamed from: D0, reason: collision with root package name */
    public static final Owners f210398D0;

    /* renamed from: D3, reason: collision with root package name */
    public static final Owners f210399D3;

    /* renamed from: E, reason: collision with root package name */
    public static final Owners f210400E;

    /* renamed from: E0, reason: collision with root package name */
    public static final Owners f210401E0;

    /* renamed from: E3, reason: collision with root package name */
    public static final Owners f210402E3;

    /* renamed from: F, reason: collision with root package name */
    public static final Owners f210403F;

    /* renamed from: F0, reason: collision with root package name */
    public static final Owners f210404F0;

    /* renamed from: F3, reason: collision with root package name */
    public static final Owners f210405F3;

    /* renamed from: G, reason: collision with root package name */
    public static final Owners f210406G;

    /* renamed from: G0, reason: collision with root package name */
    public static final Owners f210407G0;

    /* renamed from: G3, reason: collision with root package name */
    public static final Owners f210408G3;

    /* renamed from: H, reason: collision with root package name */
    public static final Owners f210409H;

    /* renamed from: H0, reason: collision with root package name */
    public static final Owners f210410H0;

    /* renamed from: H1, reason: collision with root package name */
    public static final Owners f210411H1;

    /* renamed from: H2, reason: collision with root package name */
    public static final Owners f210412H2;

    /* renamed from: H3, reason: collision with root package name */
    public static final Owners f210413H3;

    /* renamed from: I, reason: collision with root package name */
    public static final Owners f210414I;

    /* renamed from: I0, reason: collision with root package name */
    public static final Owners f210415I0;

    /* renamed from: I3, reason: collision with root package name */
    public static final Owners f210416I3;

    /* renamed from: J, reason: collision with root package name */
    public static final Owners f210417J;

    /* renamed from: J0, reason: collision with root package name */
    public static final Owners f210418J0;

    /* renamed from: J3, reason: collision with root package name */
    public static final Owners f210419J3;

    /* renamed from: K, reason: collision with root package name */
    public static final Owners f210420K;

    /* renamed from: K0, reason: collision with root package name */
    public static final Owners f210421K0;

    /* renamed from: K3, reason: collision with root package name */
    public static final Owners f210422K3;

    /* renamed from: L, reason: collision with root package name */
    public static final Owners f210423L;

    /* renamed from: L0, reason: collision with root package name */
    public static final Owners f210424L0;

    /* renamed from: L3, reason: collision with root package name */
    public static final /* synthetic */ Owners[] f210425L3;

    /* renamed from: M, reason: collision with root package name */
    public static final Owners f210426M;

    /* renamed from: M0, reason: collision with root package name */
    public static final Owners f210427M0;

    /* renamed from: M3, reason: collision with root package name */
    public static final /* synthetic */ a f210428M3;

    /* renamed from: N, reason: collision with root package name */
    public static final Owners f210429N;

    /* renamed from: N0, reason: collision with root package name */
    public static final Owners f210430N0;

    /* renamed from: O, reason: collision with root package name */
    public static final Owners f210431O;

    /* renamed from: O0, reason: collision with root package name */
    public static final Owners f210432O0;

    /* renamed from: P, reason: collision with root package name */
    public static final Owners f210433P;

    /* renamed from: P0, reason: collision with root package name */
    public static final Owners f210434P0;

    /* renamed from: P2, reason: collision with root package name */
    public static final Owners f210435P2;

    /* renamed from: Q, reason: collision with root package name */
    public static final Owners f210436Q;

    /* renamed from: Q0, reason: collision with root package name */
    public static final Owners f210437Q0;

    /* renamed from: Q2, reason: collision with root package name */
    public static final Owners f210438Q2;

    /* renamed from: R, reason: collision with root package name */
    public static final Owners f210439R;

    /* renamed from: R0, reason: collision with root package name */
    public static final Owners f210440R0;

    /* renamed from: R2, reason: collision with root package name */
    public static final Owners f210441R2;

    /* renamed from: S, reason: collision with root package name */
    public static final Owners f210442S;

    /* renamed from: S0, reason: collision with root package name */
    public static final Owners f210443S0;

    /* renamed from: S2, reason: collision with root package name */
    public static final Owners f210444S2;

    /* renamed from: T, reason: collision with root package name */
    public static final Owners f210445T;

    /* renamed from: T0, reason: collision with root package name */
    public static final Owners f210446T0;

    /* renamed from: T2, reason: collision with root package name */
    public static final Owners f210447T2;

    /* renamed from: U, reason: collision with root package name */
    public static final Owners f210448U;

    /* renamed from: U0, reason: collision with root package name */
    public static final Owners f210449U0;

    /* renamed from: U2, reason: collision with root package name */
    public static final Owners f210450U2;

    /* renamed from: V, reason: collision with root package name */
    public static final Owners f210451V;

    /* renamed from: V0, reason: collision with root package name */
    public static final Owners f210452V0;

    /* renamed from: V2, reason: collision with root package name */
    public static final Owners f210453V2;

    /* renamed from: W, reason: collision with root package name */
    public static final Owners f210454W;

    /* renamed from: W0, reason: collision with root package name */
    public static final Owners f210455W0;

    /* renamed from: W2, reason: collision with root package name */
    public static final Owners f210456W2;

    /* renamed from: X, reason: collision with root package name */
    public static final Owners f210457X;

    /* renamed from: X0, reason: collision with root package name */
    public static final Owners f210458X0;

    /* renamed from: X1, reason: collision with root package name */
    public static final Owners f210459X1;

    /* renamed from: X2, reason: collision with root package name */
    public static final Owners f210460X2;

    /* renamed from: Y, reason: collision with root package name */
    public static final Owners f210461Y;

    /* renamed from: Y0, reason: collision with root package name */
    public static final Owners f210462Y0;

    /* renamed from: Y2, reason: collision with root package name */
    public static final Owners f210463Y2;

    /* renamed from: Z, reason: collision with root package name */
    public static final Owners f210464Z;

    /* renamed from: Z0, reason: collision with root package name */
    public static final Owners f210465Z0;

    /* renamed from: Z2, reason: collision with root package name */
    public static final Owners f210466Z2;

    /* renamed from: a0, reason: collision with root package name */
    public static final Owners f210467a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final Owners f210468a1;

    /* renamed from: a3, reason: collision with root package name */
    public static final Owners f210469a3;

    /* renamed from: b0, reason: collision with root package name */
    public static final Owners f210470b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final Owners f210471b1;

    /* renamed from: b3, reason: collision with root package name */
    public static final Owners f210472b3;

    /* renamed from: c0, reason: collision with root package name */
    public static final Owners f210473c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final Owners f210474c1;

    /* renamed from: c3, reason: collision with root package name */
    public static final Owners f210475c3;

    /* renamed from: d, reason: collision with root package name */
    public static final Owners f210476d;

    /* renamed from: d0, reason: collision with root package name */
    public static final Owners f210477d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final Owners f210478d1;

    /* renamed from: d3, reason: collision with root package name */
    public static final Owners f210479d3;

    /* renamed from: e, reason: collision with root package name */
    public static final Owners f210480e;

    /* renamed from: e0, reason: collision with root package name */
    public static final Owners f210481e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final Owners f210482e1;

    /* renamed from: e3, reason: collision with root package name */
    public static final Owners f210483e3;

    /* renamed from: f, reason: collision with root package name */
    public static final Owners f210484f;

    /* renamed from: f0, reason: collision with root package name */
    public static final Owners f210485f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final Owners f210486f1;

    /* renamed from: f3, reason: collision with root package name */
    public static final Owners f210487f3;

    /* renamed from: g, reason: collision with root package name */
    public static final Owners f210488g;

    /* renamed from: g0, reason: collision with root package name */
    public static final Owners f210489g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final Owners f210490g1;

    /* renamed from: g3, reason: collision with root package name */
    public static final Owners f210491g3;

    /* renamed from: h, reason: collision with root package name */
    public static final Owners f210492h;

    /* renamed from: h0, reason: collision with root package name */
    public static final Owners f210493h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final Owners f210494h1;

    /* renamed from: h3, reason: collision with root package name */
    public static final Owners f210495h3;

    /* renamed from: i, reason: collision with root package name */
    public static final Owners f210496i;

    /* renamed from: i0, reason: collision with root package name */
    public static final Owners f210497i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final Owners f210498i1;

    /* renamed from: i3, reason: collision with root package name */
    public static final Owners f210499i3;

    /* renamed from: j, reason: collision with root package name */
    public static final Owners f210500j;

    /* renamed from: j0, reason: collision with root package name */
    public static final Owners f210501j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final Owners f210502j1;

    /* renamed from: j3, reason: collision with root package name */
    public static final Owners f210503j3;

    /* renamed from: k, reason: collision with root package name */
    public static final Owners f210504k;

    /* renamed from: k0, reason: collision with root package name */
    public static final Owners f210505k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final Owners f210506k1;

    /* renamed from: k3, reason: collision with root package name */
    public static final Owners f210507k3;

    /* renamed from: l, reason: collision with root package name */
    public static final Owners f210508l;

    /* renamed from: l0, reason: collision with root package name */
    public static final Owners f210509l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final Owners f210510l1;

    /* renamed from: l3, reason: collision with root package name */
    public static final Owners f210511l3;

    /* renamed from: m, reason: collision with root package name */
    public static final Owners f210512m;

    /* renamed from: m0, reason: collision with root package name */
    public static final Owners f210513m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final Owners f210514m1;

    /* renamed from: m3, reason: collision with root package name */
    public static final Owners f210515m3;

    /* renamed from: n, reason: collision with root package name */
    public static final Owners f210516n;

    /* renamed from: n0, reason: collision with root package name */
    public static final Owners f210517n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final Owners f210518n1;

    /* renamed from: n3, reason: collision with root package name */
    public static final Owners f210519n3;

    /* renamed from: o, reason: collision with root package name */
    public static final Owners f210520o;

    /* renamed from: o0, reason: collision with root package name */
    public static final Owners f210521o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final Owners f210522o1;

    /* renamed from: o3, reason: collision with root package name */
    public static final Owners f210523o3;

    /* renamed from: p, reason: collision with root package name */
    public static final Owners f210524p;

    /* renamed from: p0, reason: collision with root package name */
    public static final Owners f210525p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final Owners f210526p1;

    /* renamed from: p3, reason: collision with root package name */
    public static final Owners f210527p3;

    /* renamed from: q, reason: collision with root package name */
    public static final Owners f210528q;

    /* renamed from: q0, reason: collision with root package name */
    public static final Owners f210529q0;

    /* renamed from: q1, reason: collision with root package name */
    public static final Owners f210530q1;

    /* renamed from: q3, reason: collision with root package name */
    public static final Owners f210531q3;

    /* renamed from: r, reason: collision with root package name */
    public static final Owners f210532r;

    /* renamed from: r0, reason: collision with root package name */
    public static final Owners f210533r0;

    /* renamed from: r1, reason: collision with root package name */
    public static final Owners f210534r1;

    /* renamed from: r3, reason: collision with root package name */
    public static final Owners f210535r3;

    /* renamed from: s, reason: collision with root package name */
    public static final Owners f210536s;

    /* renamed from: s0, reason: collision with root package name */
    public static final Owners f210537s0;

    /* renamed from: s1, reason: collision with root package name */
    public static final Owners f210538s1;

    /* renamed from: s3, reason: collision with root package name */
    public static final Owners f210539s3;

    /* renamed from: t, reason: collision with root package name */
    public static final Owners f210540t;

    /* renamed from: t0, reason: collision with root package name */
    public static final Owners f210541t0;

    /* renamed from: t1, reason: collision with root package name */
    public static final Owners f210542t1;

    /* renamed from: t3, reason: collision with root package name */
    public static final Owners f210543t3;

    /* renamed from: u, reason: collision with root package name */
    public static final Owners f210544u;

    /* renamed from: u0, reason: collision with root package name */
    public static final Owners f210545u0;

    /* renamed from: u3, reason: collision with root package name */
    public static final Owners f210546u3;

    /* renamed from: v, reason: collision with root package name */
    public static final Owners f210547v;

    /* renamed from: v0, reason: collision with root package name */
    public static final Owners f210548v0;

    /* renamed from: v3, reason: collision with root package name */
    public static final Owners f210549v3;

    /* renamed from: w, reason: collision with root package name */
    public static final Owners f210550w;

    /* renamed from: w0, reason: collision with root package name */
    public static final Owners f210551w0;

    /* renamed from: w3, reason: collision with root package name */
    public static final Owners f210552w3;

    /* renamed from: x, reason: collision with root package name */
    public static final Owners f210553x;

    /* renamed from: x0, reason: collision with root package name */
    public static final Owners f210554x0;

    /* renamed from: x3, reason: collision with root package name */
    public static final Owners f210555x3;

    /* renamed from: y, reason: collision with root package name */
    public static final Owners f210556y;

    /* renamed from: y0, reason: collision with root package name */
    public static final Owners f210557y0;

    /* renamed from: y3, reason: collision with root package name */
    public static final Owners f210558y3;

    /* renamed from: z, reason: collision with root package name */
    public static final Owners f210559z;

    /* renamed from: z0, reason: collision with root package name */
    public static final Owners f210560z0;

    /* renamed from: z3, reason: collision with root package name */
    public static final Owners f210561z3;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f210562b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<String> f210563c;

    static {
        final String str = "AIX";
        final String str2 = "2f09103a-5dcd-400c-8c95-aba9dfddfb30";
        final Owners owners = new Owners("AIX_Unit", 0, new f(str, str2) { // from class: zZ.g
        }, b1.j("aix-public"));
        f210476d = owners;
        final String str3 = "LolKek";
        final String str4 = "234f7a72-d596-4601-abdd-e1b3fcefa9a8";
        f210480e = new Owners("LolKek_Team", 1, new f(str3, str4, owners) { // from class: zZ.e
        }, b1.j("aix-public"));
        final String str5 = "ProTools";
        final String str6 = "cf626abd-776d-4bf2-9d8e-0c32e34fee89";
        f210484f = new Owners("ProTools_Team", 2, new f(str5, str6, owners) { // from class: zZ.e
        }, b1.j("aix-public"));
        final String str7 = "Advertising";
        final String str8 = "36fbda5f-3ef7-443b-a472-d68eea929820";
        f210488g = new Owners("Advertising_Unit", 3, new f(str7, str8) { // from class: zZ.g
        }, b1.b());
        final String str9 = "Antifraud";
        final String str10 = "57435ab5-a9ac-4110-b88c-929970d47f20";
        final Owners owners2 = new Owners("Antifraud_Unit", 4, new f(str9, str10) { // from class: zZ.g
        }, b1.j("anti-fraud"));
        f210492h = owners2;
        final String str11 = "AUF";
        final String str12 = "ec28a52a-e2c9-47bd-90bc-f6374cd53d1c";
        f210496i = new Owners("AUF_Team", 5, new f(str11, str12, owners2) { // from class: zZ.e
        }, b1.j("auth-support"));
        final String str13 = "Auction";
        final String str14 = "28e83f45-6496-4529-91ff-fb72a2ba81ac";
        f210500j = new Owners("Auction_Unit", 6, new f(str13, str14) { // from class: zZ.g
        }, b1.j("quick-deal-public"));
        final String str15 = "Auto Paid Services";
        final String str16 = "10d15a36-93d1-4a46-8eb1-3668043e837b";
        final Owners owners3 = new Owners("Auto_Paid_Services_Unit", 7, new f(str15, str16) { // from class: zZ.g
        }, b1.j("autoteka-public"));
        f210504k = owners3;
        final String str17 = "AI Assistant";
        final String str18 = "51b5f2be-074d-4e6c-8b96-0a089469ba9c";
        f210508l = new Owners("AI_Assistant_Team", 8, new f(str17, str18, owners3) { // from class: zZ.e
        }, b1.b());
        final String str19 = "Sales";
        final String str20 = "9546a75f-9cdb-4be3-81d5-691416719628";
        f210512m = new Owners("Sales_Team", 9, new f(str19, str20, owners3) { // from class: zZ.e
        }, b1.b());
        final String str21 = "AutoPrivate";
        final String str22 = "fad10892-c7c1-4476-ac80-f5adcc12f217";
        final Owners owners4 = new Owners("AutoPrivate_Unit", 10, new f(str21, str22) { // from class: zZ.g
        }, b1.b());
        f210516n = owners4;
        final String str23 = "PUMBA";
        final String str24 = "9d51c28e-6091-45ae-9f26-b7a2d3efd8ba";
        f210520o = new Owners("PUMBA_Team", 11, new f(str23, str24, owners4) { // from class: zZ.e
        }, b1.k("puma-public", "puma-dev", "auto-public"));
        final String str25 = "AvitoID";
        final String str26 = "138404a4-fb59-11eb-80f6-44a84244a6a1";
        final Owners owners5 = new Owners("AvitoID_Unit", 12, new f(str25, str26) { // from class: zZ.g
        }, b1.j("avitoid-public"));
        f210524p = owners5;
        final String str27 = "Ahaha";
        final String str28 = "76ea08d8-10e6-4327-856d-f3681ca6d147";
        f210528q = new Owners("Ahaha_Team", 13, new f(str27, str28, owners5) { // from class: zZ.e
        }, b1.j("accounts-hierarchy-public"));
        final String str29 = "Passport AvIDo";
        final String str30 = "e7014a7d-ffe0-4bea-87ad-cc5063701ab3";
        f210532r = new Owners("Passport_AvIDo_Team", 14, new f(str29, str30, owners5) { // from class: zZ.e
        }, b1.j("avitoid-public"));
        final String str31 = "Passport Flippers";
        final String str32 = "25958079-61c6-461b-813c-2bc148641b62";
        f210536s = new Owners("Passport_Flippers_Team", 15, new f(str31, str32, owners5) { // from class: zZ.e
        }, b1.j("avitoid-public"));
        final String str33 = "Profiles SNOW";
        final String str34 = "9d702430-dba3-4c20-a88b-dca3a8318f13";
        f210540t = new Owners("Profiles_SNOW_Team", 16, new f(str33, str34, owners5) { // from class: zZ.e
        }, b1.j("profiles"));
        final String str35 = "B2B";
        final String str36 = "a77d4b2b-9eab-435b-ad84-557b99d90869";
        final Owners owners6 = new Owners("B2B_Unit", 17, new f(str35, str36) { // from class: zZ.g
        }, b1.j("goods-b2b-public"));
        f210544u = owners6;
        final String str37 = "ed12159d-569e-4450-831f-55ef9f1b2156";
        f210547v = new Owners("B2B_Team", 18, new f(str35, str37, owners6) { // from class: zZ.e
        }, b1.j("goods-b2b-public"));
        final String str38 = "Enterprise";
        final String str39 = "a01e5685-652a-4308-8914-399bb8022d1b";
        f210550w = new Owners("Enterprise_Team", 19, new f(str38, str39, owners6) { // from class: zZ.e
        }, b1.j("goods-afb-public"));
        final String str40 = "Galileo";
        final String str41 = "c25faab0-833c-4e06-a68b-67a1611847a5";
        f210553x = new Owners("Galileo_Team", 20, new f(str40, str41, owners6) { // from class: zZ.e
        }, b1.j("goods-afb-public"));
        final String str42 = "BDUI";
        final String str43 = "50e4759c-f3bc-4ae5-9858-2d82b7cd2438";
        final Owners owners7 = new Owners("BDUI_Unit", 21, new f(str42, str43) { // from class: zZ.g
        }, b1.k("beduin-v2", "beduin-news"));
        f210556y = owners7;
        final String str44 = "Engine";
        final String str45 = "b8895dea-c766-4255-8bc8-f2914807185f";
        f210559z = new Owners("Engine_Team", 22, new f(str44, str45, owners7) { // from class: zZ.e
        }, b1.k("beduin-v2", "beduin-news"));
        final String str46 = "Renderer";
        final String str47 = "acd8234d-77c4-4828-bccf-ffc2d2963f62";
        f210388A = new Owners("Renderer_Team", 23, new f(str46, str47, owners7) { // from class: zZ.e
        }, b1.k("beduin-v2", "beduin-news"));
        final String str48 = "BX Core";
        final String str49 = "9c178e3e-26f1-404d-8d66-84345b95865e";
        final Owners owners8 = new Owners("BX_Core_Unit", 24, new f(str48, str49) { // from class: zZ.g
        }, b1.j("buyer-experience"));
        f210391B = owners8;
        final String str50 = "Deimos";
        final String str51 = "1d153b19-86d2-4b63-ba5c-1ea9433cc823";
        f210394C = new Owners("Deimos_Team", 25, new f(str50, str51, owners8) { // from class: zZ.e
        }, b1.j("buyer-experience"));
        final String str52 = "Phobos";
        final String str53 = "f14fa837-fcbf-42cf-ab87-d5ea2e62b738";
        f210397D = new Owners("Phobos_Team", 26, new f(str52, str53, owners8) { // from class: zZ.e
        }, b1.j("bx-platform-item-card"));
        final String str54 = "TechTok";
        final String str55 = "c02e6056-ed98-47fa-9631-86452ef9f89b";
        f210400E = new Owners("TechTok_Team", 27, new f(str54, str55, owners8) { // from class: zZ.e
        }, b1.b());
        final String str56 = "Business Services";
        final String str57 = "162fdf63-9df7-4012-bfca-d5733daf18e8";
        final Owners owners9 = new Owners("Business_Services_Unit", 28, new f(str56, str57) { // from class: zZ.g
        }, b1.j("services-business-public"));
        f210403F = owners9;
        final String str58 = "Hold My Deal";
        final String str59 = "030c0dc6-1a4b-4297-b4ae-3d72e6d19eea";
        f210406G = new Owners("Hold_My_Deal_Team", 29, new f(str58, str59, owners9) { // from class: zZ.e
        }, b1.j("services-hold-my-deal-public"));
        final String str60 = "Husky";
        final String str61 = "57d99f38-a1d0-4b6e-a6f9-3af47dd5c385";
        f210409H = new Owners("Husky_Team", 30, new f(str60, str61, owners9) { // from class: zZ.e
        }, b1.j("services-husky-public"));
        final String str62 = "Buyers";
        final String str63 = "83add825-baf2-4d1f-967e-86fe6b4c1903";
        final Owners owners10 = new Owners("Buyers_Unit", 31, new f(str62, str63) { // from class: zZ.g
        }, b1.b());
        f210414I = owners10;
        final String str64 = "Private Users Global";
        final String str65 = "99d30efc-bd74-4f25-8d20-57df6ff62e3d";
        f210417J = new Owners("Private_Users_Global_Team", 32, new f(str64, str65, owners10) { // from class: zZ.e
        }, b1.j("private-users-global-public"));
        final String str66 = "Buyout";
        final String str67 = "7d9bfecd-21cb-4a77-abe3-0466a67b8b58";
        final Owners owners11 = new Owners("Buyout_Unit", 33, new f(str66, str67) { // from class: zZ.g
        }, b1.j("auto-buyout-public"));
        f210420K = owners11;
        final String str68 = "ProXy";
        final String str69 = "5a633312-a8dd-4130-8748-372e536f0c26";
        f210423L = new Owners("ProXy_Team", 34, new f(str68, str69, owners11) { // from class: zZ.e
        }, b1.j("haraba-public"));
        final String str70 = "CRE";
        final String str71 = "7b16cec8-d115-406f-93f1-15b236292d51";
        final Owners owners12 = new Owners("CRE_Unit", 35, new f(str70, str71) { // from class: zZ.g
        }, b1.j("real-cre"));
        f210426M = owners12;
        final String str72 = "CREam Soda";
        final String str73 = "5249ad71-d5e9-44c2-b8f6-eb6bfe943b3f";
        f210429N = new Owners("CREam_Soda_Team", 36, new f(str72, str73, owners12) { // from class: zZ.e
        }, b1.b());
        final String str74 = "CRM";
        final String str75 = "51c3af3e-58c2-11ec-80f8-44a84244a6a1";
        final Owners owners13 = new Owners("CRM_Unit", 37, new f(str74, str75) { // from class: zZ.g
        }, b1.j("communications-platform"));
        f210431O = owners13;
        final String str76 = "SBC Automation";
        final String str77 = "43e09c41-7b5f-48ac-86c1-1ee4a130fb79";
        f210433P = new Owners("SBC_Automation_Team", 38, new f(str76, str77, owners13) { // from class: zZ.e
        }, b1.j("sbc-public"));
        final String str78 = "SBC Boosty";
        final String str79 = "5486ae3e-dded-4a83-a46d-32bedc6ca7af";
        f210436Q = new Owners("SBC_Boosty_Team", 39, new f(str78, str79, owners13) { // from class: zZ.e
        }, b1.j("sbc-public"));
        final String str80 = "Calls";
        final String str81 = "9d7dc92e-1d7e-4e1b-b99d-f82953ccf0af";
        final Owners owners14 = new Owners("Calls_Unit", 40, new f(str80, str81) { // from class: zZ.g
        }, b1.j("calls"));
        f210439R = owners14;
        final String str82 = "Calls Platform";
        final String str83 = "74a30684-7984-4953-8e48-0aecc4b0797d";
        f210442S = new Owners("Calls_Platform_Team", 41, new f(str82, str83, owners14) { // from class: zZ.e
        }, b1.j("calls"));
        final String str84 = "Categorization platform";
        final String str85 = "d53ed91e-207a-4738-8474-6f4e14d8d35e";
        final Owners owners15 = new Owners("Categorization_Platform_Unit", 42, new f(str84, str85) { // from class: zZ.g
        }, b1.b());
        f210445T = owners15;
        final String str86 = "iDroid";
        final String str87 = "30374564-5cff-4af4-97b3-64a39bc16c81";
        f210448U = new Owners("IDroid_Team", 43, new f(str86, str87, owners15) { // from class: zZ.e
        }, b1.j("goods-mobile"));
        final String str88 = "Commercial Transport";
        final String str89 = "a1db12ed-a36c-42c4-b88b-9fb79a076110";
        f210451V = new Owners("Commercial_Transport_Unit", 44, new f(str88, str89) { // from class: zZ.g
        }, b1.j("special-machinery-public"));
        final String str90 = "Customer Delivery Services";
        final String str91 = "14cfa444-7306-11ec-80fa-44a84244a6a1";
        final Owners owners16 = new Owners("Customer_Delivery_Services_Unit", 45, new f(str90, str91) { // from class: zZ.g
        }, b1.j("cds-unit-public"));
        f210454W = owners16;
        final String str92 = "DBS";
        final String str93 = "702ccd47-7482-4c91-b45c-19374d587cb5";
        f210457X = new Owners("DBS_Team", 46, new f(str92, str93, owners16) { // from class: zZ.e
        }, b1.j("dbs_delivery_by_seller"));
        final String str94 = "Solid";
        final String str95 = "c87b2517-32bf-4947-b370-af5ccfdcce7c";
        f210461Y = new Owners("Solid_Team", 47, new f(str94, str95, owners16) { // from class: zZ.e
        }, b1.j("solid-team-services"));
        final String str96 = "Deal on Auto";
        final String str97 = "96539898-0a3c-4c80-b971-748991add58b";
        final Owners owners17 = new Owners("Deal_On_Auto_Unit", 48, new f(str96, str97) { // from class: zZ.g
        }, b1.j("auto-deal-public"));
        f210464Z = owners17;
        final String str98 = "Loans Gate";
        final String str99 = "5da62d52-2363-43f8-8d67-4d62a04d8f34";
        f210467a0 = new Owners("Loans_Gate_Team", 49, new f(str98, str99, owners17) { // from class: zZ.e
        }, b1.j("auto-fi-public"));
        final String str100 = "Select";
        final String str101 = "34baabce-c032-4a75-9ad6-1f6779e5d0fa";
        f210470b0 = new Owners("Select_Team", 50, new f(str100, str101, owners17) { // from class: zZ.e
        }, b1.j("auto-select-public"));
        final String str102 = "Decision";
        final String str103 = "e0d2703a-779f-11ec-80fa-44a84244a6a1";
        final Owners owners18 = new Owners("Decision_Unit", 51, new f(str102, str103) { // from class: zZ.g
        }, b1.j("buyer-experience"));
        f210473c0 = owners18;
        final String str104 = "Big Deal";
        final String str105 = "50a4e1b1-77bf-4b7f-afe3-f6bc5f1f77dc";
        f210477d0 = new Owners("Big_Deal_Team", 52, new f(str104, str105, owners18) { // from class: zZ.e
        }, b1.k("buyer-experience", "motivation"));
        final String str106 = "bt_clicks";
        final String str107 = "48278232-288c-4b12-b3a7-620b98e9f303";
        f210481e0 = new Owners("Bt_Clicks_Team", 53, new f(str106, str107, owners18) { // from class: zZ.e
        }, b1.k("buyer-experience", "short-videos", "short-videos-support"));
        final String str108 = "Explore";
        final String str109 = "d100ce12-779f-11ec-80fa-44a84244a6a1";
        final Owners owners19 = new Owners("Explore_Unit", 54, new f(str108, str109) { // from class: zZ.g
        }, b1.j("buyer-experience"));
        f210485f0 = owners19;
        final String str110 = "GeoGang";
        final String str111 = "2d094bdd-ca7c-4b06-b96a-59f1901c19de";
        f210489g0 = new Owners("GeoGang_Team", 55, new f(str110, str111, owners19) { // from class: zZ.e
        }, b1.j("geo"));
        final String str112 = "GinTonic";
        final String str113 = "b5a5ff6d-73ef-400e-abda-6a89b19e4729";
        f210493h0 = new Owners("GinTonic_Team", 56, new f(str112, str113, owners19) { // from class: zZ.e
        }, b1.b());
        final String str114 = "Stonks";
        final String str115 = "672c7183-27b3-46e0-ad6a-2ea91e28ce3a";
        f210497i0 = new Owners("Stonks_Team", 57, new f(str114, str115, owners19) { // from class: zZ.e
        }, b1.k("buyer-experience", "stonks-public"));
        final String str116 = "FMP";
        final String str117 = "c7afd0c3-b0e6-4a09-a274-331c1170f1e9";
        final Owners owners20 = new Owners("FMP_Unit", 58, new f(str116, str117) { // from class: zZ.g
        }, b1.b());
        f210501j0 = owners20;
        final String str118 = "GreenLight";
        final String str119 = "623e5d06-2ebf-49c2-8352-a419ba5e0e01";
        f210505k0 = new Owners("GreenLight_Team", 59, new f(str118, str119, owners20) { // from class: zZ.e
        }, b1.j("fmp"));
        final String str120 = "Interfaces";
        final String str121 = "85e38dc3-0f94-448e-9e18-ead5b3d21819";
        f210509l0 = new Owners("Interfaces_Team", 60, new f(str120, str121, owners20) { // from class: zZ.e
        }, b1.b());
        final String str122 = "Firewall";
        final String str123 = "6822ec9e-7a4f-4a7f-9ae4-ad92d421a716";
        f210513m0 = new Owners("Firewall_Unit", 61, new f(str122, str123) { // from class: zZ.g
        }, b1.b());
        final String str124 = "Gigs Client Experience";
        final String str125 = "337ee3d5-8792-4c73-bdbf-6d4b761f6a60";
        f210517n0 = new Owners("Gigs_Client_Experience_Unit", 62, new f(str124, str125) { // from class: zZ.g
        }, b1.j("gig-public"));
        final String str126 = "Gigs Worker Experience";
        final String str127 = "fc896b28-e215-4ab8-8794-084ae35f4074";
        final Owners owners21 = new Owners("Gigs_Worker_Experience_Unit", 63, new f(str126, str127) { // from class: zZ.g
        }, b1.j("gig-public"));
        f210521o0 = owners21;
        final String str128 = "Magic";
        final String str129 = "6eed4aab-f51b-4663-b509-badc0024ecd4";
        f210525p0 = new Owners("Magic_Team", 64, new f(str128, str129, owners21) { // from class: zZ.e
        }, b1.j("gig-team-magic"));
        final String str130 = "Team Amigos";
        final String str131 = "7f9dc5b0-f764-467b-9705-4bf738cc7589";
        f210529q0 = new Owners("Team_Amigos_Team", 65, new f(str130, str131, owners21) { // from class: zZ.e
        }, b1.j("gigs-team-amigos"));
        final String str132 = "Hotels";
        final String str133 = "a38ff5a6-35f6-427e-b25d-dcdcdc7c444b";
        final Owners owners22 = new Owners("Hotels_Unit", 66, new f(str132, str133) { // from class: zZ.g
        }, b1.j("travolta-public"));
        f210533r0 = owners22;
        final String str134 = "Travolta";
        final String str135 = "970d3111-8c9c-4481-a292-dfa744a403ee";
        f210537s0 = new Owners("Travolta_Team", 67, new f(str134, str135, owners22) { // from class: zZ.e
        }, b1.j("travolta-public"));
        final String str136 = "Jobs CV&Apply";
        final String str137 = "568d9159-07ed-47c5-9da9-72cf4ffeb315";
        final Owners owners23 = new Owners("Jobs_CV_And_Apply_Unit", 68, new f(str136, str137) { // from class: zZ.g
        }, b1.j("jobs-cvapply"));
        f210541t0 = owners23;
        final String str138 = "Team A";
        final String str139 = "08541a43-3d77-4edc-9bee-5ec69072e4b0";
        f210545u0 = new Owners("Team_A_Team", 69, new f(str138, str139, owners23) { // from class: zZ.e
        }, b1.j("job-team-a"));
        final String str140 = "Jobs Employer&TnS&MNZ";
        final String str141 = "a992953b-1c36-4184-9c5d-42095bb49e12";
        final Owners owners24 = new Owners("Jobs_Employer_And_TnS_And_MNZ_Unit", 70, new f(str140, str141) { // from class: zZ.g
        }, b1.k("job", "jobs-employer-tns-mnz"));
        f210548v0 = owners24;
        final String str142 = "Team Fene4ki";
        final String str143 = "1ad4be8b-2bf2-44c0-b391-350f7028c299";
        f210551w0 = new Owners("Team_Fene4ki_Team", 71, new f(str142, str143, owners24) { // from class: zZ.e
        }, b1.j("jobs-team-fene4ki"));
        final String str144 = "Jobs JobSeeker";
        final String str145 = "d0a14c09-94b2-483b-9606-340310ebe358";
        final Owners owners25 = new Owners("Jobs_JobSeeker_Unit", 72, new f(str144, str145) { // from class: zZ.g
        }, b1.j("job"));
        f210554x0 = owners25;
        final String str146 = "Team Sigma";
        final String str147 = "1d5d85fc-a941-4950-80cd-82990188787c";
        f210557y0 = new Owners("Team_Sigma_Team", 73, new f(str146, str147, owners25) { // from class: zZ.e
        }, b1.j("jobs-team-sigma"));
        final String str148 = "Mall and Sales";
        final String str149 = "64e194ce-db7d-47d6-9bc9-57ebd89229be";
        final Owners owners26 = new Owners("Mall_And_Sales_Unit", 74, new f(str148, str149) { // from class: zZ.g
        }, b1.j("mall-and-sales-public"));
        f210560z0 = owners26;
        final String str150 = "Assortment & Pricing";
        final String str151 = "7ee76eaf-a08e-4f22-aa01-086af5fd6cd0";
        f210389A0 = new Owners("Assortment__And__Pricing_Team", 75, new f(str150, str151, owners26) { // from class: zZ.e
        }, b1.j("mall-and-sales-public"));
        final String str152 = "MTS";
        final String str153 = "3fe7e6c3-da0d-4a7e-a3e6-9ce36803e20d";
        f210392B0 = new Owners("MTS_Team", 76, new f(str152, str153, owners26) { // from class: zZ.e
        }, b1.j("avito-sales-public"));
        final String str154 = "Market Intelligence";
        final String str155 = "908055a2-7d85-11e9-80d9-44a84244a6a1";
        f210395C0 = new Owners("Market_Intelligence_Unit", 77, new f(str154, str155) { // from class: zZ.g
        }, b1.j("mi-public"));
        final String str156 = "Marketplace Buyer";
        final String str157 = "7a58b7b7-6f4b-11ed-b0ed-40a6b7069875";
        final Owners owners27 = new Owners("Marketplace_Buyer_Unit", 78, new f(str156, str157) { // from class: zZ.g
        }, b1.j("marketplace-public"));
        f210398D0 = owners27;
        final String str158 = "Bayes";
        final String str159 = "ee040864-2726-41f1-a983-b00a24f5415e";
        f210401E0 = new Owners("Bayes_Team", 79, new f(str158, str159, owners27) { // from class: zZ.e
        }, b1.k("marketplace-public", "bayes-crossboard", "bayes_qa", "bayes-qa-alerts"));
        final String str160 = "Cart";
        final String str161 = "49a53fe8-3ede-4351-997d-697b82edc748";
        f210404F0 = new Owners("Cart_Team", 80, new f(str160, str161, owners27) { // from class: zZ.e
        }, b1.b());
        final String str162 = "DA VINCI";
        final String str163 = "4e578d68-a4fb-4cdb-b904-5b6739911a55";
        f210407G0 = new Owners("DA_VINCI_Team", 81, new f(str162, str163, owners27) { // from class: zZ.e
        }, b1.j("marketplace-public"));
        final String str164 = "Marketplace Seller";
        final String str165 = "896eafa5-6f4b-11ed-b0ed-40a6b7069875";
        final Owners owners28 = new Owners("Marketplace_Seller_Unit", 82, new f(str164, str165) { // from class: zZ.g
        }, b1.j("marketplace-public"));
        f210410H0 = owners28;
        final String str166 = "LSD";
        final String str167 = "fc72e5a9-5ce1-4c45-b618-26cb3fed49f9";
        f210415I0 = new Owners("LSD_Team", 83, new f(str166, str167, owners28) { // from class: zZ.e
        }, b1.j("marketplace-public"));
        final String str168 = "Scale";
        final String str169 = "315b2750-2d8b-42f9-ba62-6b3566bc927e";
        f210418J0 = new Owners("Scale_Team", 84, new f(str168, str169, owners28) { // from class: zZ.e
        }, b1.j("marketplace-public"));
        final String str170 = "Wolf";
        final String str171 = "46441ab4-2c7b-404f-9cd0-c54e7ac2e1cf";
        f210421K0 = new Owners("Wolf_Team", 85, new f(str170, str171, owners28) { // from class: zZ.e
        }, b1.j("marketplace-public"));
        final String str172 = "Messenger and Bots automation";
        final String str173 = "4321e9e4-9e4f-11ed-b0ed-40a6b7069875";
        final Owners owners29 = new Owners("Messenger_And_Bots_Automation_Unit", 86, new f(str172, str173) { // from class: zZ.g
        }, b1.j(NotificationsSettings.Section.SECTION_MESSENGER));
        f210424L0 = owners29;
        final String str174 = "Chats automation team";
        final String str175 = "47226cae-98d4-4b55-9188-d1a86ab29d25";
        f210427M0 = new Owners("Chats_Automation_Team_Team", 87, new f(str174, str175, owners29) { // from class: zZ.e
        }, b1.j("avito_chatbots"));
        final String str176 = "Messenger Platform";
        final String str177 = "9edd065e-7d6f-458b-87d3-db8015ce6939";
        f210430N0 = new Owners("Messenger_Platform_Team", 88, new f(str176, str177, owners29) { // from class: zZ.e
        }, b1.j(NotificationsSettings.Section.SECTION_MESSENGER));
        final String str178 = "f86cb0b4-cf64-11eb-80f1-44a84244a6a1";
        final String str179 = "Mobile Architecture";
        final Owners owners30 = new Owners("Mobile_Architecture_Unit", 89, new f(str179, str178) { // from class: zZ.g
        }, b1.k("mobile-arch-public", "apps-design-platform", "ds-apps-news", "mob-arch-news"));
        f210432O0 = owners30;
        final String str180 = "Design System";
        final String str181 = "f754ee5c-d3d1-4415-8cf8-df5bf7e206fc";
        f210434P0 = new Owners("Design_System_Team", 90, new f(str180, str181, owners30) { // from class: zZ.e
        }, b1.k("apps-design-platform", "ds-apps-news"));
        final String str182 = "Mobile ArchOps";
        final String str183 = "4b0d4389-f3d2-42a1-b649-f044b07ca7ac";
        f210437Q0 = new Owners("Mobile_ArchOps_Team", 91, new f(str182, str183, owners30) { // from class: zZ.e
        }, b1.k("mobile-arch-public", "mob-arch-news"));
        final String str184 = "4c491200-fa24-48c9-82f0-063de67c006b";
        f210440R0 = new Owners("Mobile_Architecture_Team", 92, new f(str179, str184, owners30) { // from class: zZ.e
        }, b1.k("mobile-arch-public", "mob-arch-news"));
        final String str185 = "PRO Efficiency";
        final String str186 = "b91d592d-9810-49fb-bd8a-6961ae6be0a8";
        final Owners owners31 = new Owners("PRO_Efficiency_Unit", 93, new f(str185, str186) { // from class: zZ.g
        }, b1.j("pro-efficiency-public"));
        f210443S0 = owners31;
        final String str187 = "ResellersMNZ";
        final String str188 = "21accbb4-bdd6-4c23-865c-98d4a97a0f6d";
        f210446T0 = new Owners("ResellersMNZ_Team", 94, new f(str187, str188, owners31) { // from class: zZ.e
        }, b1.j("pro-efficiency-public"));
        final String str189 = "Pay & Ship";
        final String str190 = "9c4a27bf-1add-44dc-aad2-9cfdaf647b07";
        final Owners owners32 = new Owners("Pay__And__Ship_Unit", 95, new f(str189, str190) { // from class: zZ.g
        }, b1.b());
        f210449U0 = owners32;
        final String str191 = "Marketplace Global";
        final String str192 = "3fc6863f-9acc-4f03-95d7-e84f3732a1c0";
        f210452V0 = new Owners("Marketplace_Global_Team", 96, new f(str191, str192, owners32) { // from class: zZ.e
        }, b1.b());
        final String str193 = "Payments";
        final String str194 = "767af2ce-24dc-4adf-bc44-e3316ee1c4d1";
        final Owners owners33 = new Owners("Payments_Unit", 97, new f(str193, str194) { // from class: zZ.g
        }, b1.j("payments-tech"));
        f210455W0 = owners33;
        final String str195 = "Wallet Acquisition";
        final String str196 = "5fd570d4-6d0a-4d13-8bd0-ad084dafec0a";
        f210458X0 = new Owners("Wallet_Acquisition_Team", 98, new f(str195, str196, owners33) { // from class: zZ.e
        }, b1.j("fmp"));
        final String str197 = "Wallet Core";
        final String str198 = "312b67e4-a410-4241-874c-e8d6ff126f8d";
        f210462Y0 = new Owners("Wallet_Core_Team", 99, new f(str197, str198, owners33) { // from class: zZ.e
        }, b1.j("fmp"));
        final String str199 = "Performance";
        final String str200 = "d4ed4cf8-e7e2-11e8-80d4-44a84244a6a1";
        final Owners owners34 = new Owners("Performance_Unit", 100, new f(str199, str200) { // from class: zZ.g
        }, b1.k("performance", "load-news", "mobile-performance-news", "frontend-performance-news", "performance-analytics-news"));
        f210465Z0 = owners34;
        final String str201 = "Client-side Performance";
        final String str202 = "3910349f-82f2-4bd6-9784-5848e5c01b22";
        f210468a1 = new Owners("Client_Side_Performance_Team", UpdateStatusCode.DialogButton.CONFIRM, new f(str201, str202, owners34) { // from class: zZ.e
        }, b1.k("frontend-profiler", "frontend-performance", "frontend-performance-news", "mobile-performance", "mobile-performance-news"));
        final String str203 = "Mobile Performance";
        final String str204 = "f3e33791-769e-473f-af4c-fd2482ca0e5d";
        f210471b1 = new Owners("Mobile_Performance_Team", 102, new f(str203, str204, owners34) { // from class: zZ.e
        }, b1.k("mobile-performance", "mobile-performance-news"));
        final String str205 = "Performance Money";
        final String str206 = "f233a602-ebd7-41bf-9d55-fbe123cb9afc";
        final Owners owners35 = new Owners("Performance_Money_Unit", 103, new f(str205, str206) { // from class: zZ.g
        }, b1.b());
        f210474c1 = owners35;
        final String str207 = "Easy Money";
        final String str208 = "68391931-f373-4f98-ab8e-d80d0923c333";
        f210478d1 = new Owners("Easy_Money_Team", 104, new f(str207, str208, owners35) { // from class: zZ.e
        }, b1.j("easymoney-public"));
        final String str209 = "Private Cars Classified";
        final String str210 = "e7cbc272-4742-4aa6-981a-6b2eb78acb0f";
        final Owners owners36 = new Owners("Private_Cars_Classified_Unit", 105, new f(str209, str210) { // from class: zZ.g
        }, b1.j("auto-public"));
        f210482e1 = owners36;
        final String str211 = "Car Model";
        final String str212 = "3b0dc5ef-e1d0-467d-b0b1-33ba1e9ecf42";
        f210486f1 = new Owners("Car_Model_Team", 106, new f(str211, str212, owners36) { // from class: zZ.e
        }, b1.j("auto-public"));
        final String str213 = "Private Auto Mobile";
        final String str214 = "332f0c12-8fa6-4ae5-b966-4feee1e3405c";
        f210490g1 = new Owners("Private_Auto_Mobile_Team", 107, new f(str213, str214, owners36) { // from class: zZ.e
        }, b1.j("private-auto-mobile-public"));
        final String str215 = "Publish items";
        final String str216 = "2c77d231-986b-411b-a0d8-5dfa6dcd0f61";
        final Owners owners37 = new Owners("Publish_Items_Unit", 108, new f(str215, str216) { // from class: zZ.g
        }, b1.k("sxc-publish-support", "api4biz-autoload", "mnz-listing", "open-api"));
        f210494h1 = owners37;
        final String str217 = "Smoothie";
        final String str218 = "719974a1-a95a-4e20-b7e7-51cfefc06b6e";
        f210498i1 = new Owners("Smoothie_Team", 109, new f(str217, str218, owners37) { // from class: zZ.e
        }, b1.j("sxc-publish-support"));
        final String str219 = "RRE Buyer Experience";
        final String str220 = "ceb894cb-8128-4212-bf1b-f40a91b04f3e";
        final Owners owners38 = new Owners("RRE_Buyer_Experience_Unit", 110, new f(str219, str220) { // from class: zZ.g
        }, b1.b());
        f210502j1 = owners38;
        final String str221 = "BREw";
        final String str222 = "87160532-d2e9-41be-8d18-b9d7784a1dd7";
        f210506k1 = new Owners("BREw_Team", 111, new f(str221, str222, owners38) { // from class: zZ.e
        }, b1.j("real-brew"));
        final String str223 = "NewB";
        final String str224 = "2e87db1d-96be-4eaa-96b9-819096fe60d0";
        f210510l1 = new Owners("NewB_Team", 112, new f(str223, str224, owners38) { // from class: zZ.e
        }, b1.j("nd-newb"));
        final String str225 = "Shelter";
        final String str226 = "5fa0d5c1-43a5-404a-ba3a-9c985118a749";
        f210514m1 = new Owners("Shelter_Team", 113, new f(str225, str226, owners38) { // from class: zZ.e
        }, b1.j("real-shelter"));
        final String str227 = "uLTRas";
        final String str228 = "a1fbf4bf-8cd1-413b-9346-b075bd4bf241";
        f210518n1 = new Owners("ULTRas_Team", 114, new f(str227, str228, owners38) { // from class: zZ.e
        }, b1.j("real-ultras"));
        final String str229 = "RRE TRX";
        final String str230 = "0d54cd0c-c641-4115-85b0-328f3d5cee77";
        final Owners owners39 = new Owners("RRE_TRX_Unit", 115, new f(str229, str230) { // from class: zZ.g
        }, b1.j("rre-trx-support"));
        f210522o1 = owners39;
        final String str231 = "Ditto";
        final String str232 = "fdd65aeb-b1e8-43d0-9323-5e0e9769babb";
        f210526p1 = new Owners("Ditto_Team", 116, new f(str231, str232, owners39) { // from class: zZ.e
        }, b1.j("real-pp-growth"));
        final String str233 = "T-Rex";
        final String str234 = "7dadf232-c657-4b9d-937f-77d927797997";
        f210530q1 = new Owners("T_Rex_Team", 117, new f(str233, str234, owners39) { // from class: zZ.e
        }, b1.j("rre-trx-support"));
        final String str235 = "RRE Trust&Safety";
        final String str236 = "159f7e0d-d9b2-442a-a87d-5221073b3539";
        final Owners owners40 = new Owners("RRE_Trust_And_Safety_Unit", 118, new f(str235, str236) { // from class: zZ.g
        }, b1.b());
        f210534r1 = owners40;
        final String str237 = "Sputnik";
        final String str238 = "0310f08b-89b6-4ade-baac-b0221edee942";
        f210538s1 = new Owners("Sputnik_Team", 119, new f(str237, str238, owners40) { // from class: zZ.e
        }, b1.j("nd-sputnik"));
        final String str239 = "TaNoS";
        final String str240 = "5b2b097c-29a3-45f2-bf00-efd6ced85ece";
        f210542t1 = new Owners("TaNoS_Team", 120, new f(str239, str240, owners40) { // from class: zZ.e
        }, b1.j("nd-tanos"));
        final String str241 = "Ratings and Reviews";
        final String str242 = "24cacf85-fb59-11eb-80f6-44a84244a6a1";
        final Owners owners41 = new Owners("Ratings_And_Reviews_Unit", 121, new f(str241, str242) { // from class: zZ.g
        }, b1.j("ratings-and-reviews"));
        f210411H1 = owners41;
        final String str243 = "BestSeller";
        final String str244 = "9a556b53-9a90-4967-8654-9736970263ce";
        f210459X1 = new Owners("BestSeller_Team", 122, new f(str243, str244, owners41) { // from class: zZ.e
        }, b1.j("ratings-and-reviews"));
        final String str245 = "TopModel";
        final String str246 = "e488cce9-f0a7-4948-8779-61aeadcbbe81";
        f210412H2 = new Owners("TopModel_Team", 123, new f(str245, str246, owners41) { // from class: zZ.e
        }, b1.j("ratings-and-reviews"));
        final String str247 = "Rec";
        final String str248 = "f9d2b477-a9c5-11e7-80da-44a842449faf";
        f210435P2 = new Owners("Rec_Unit", 124, new f(str247, str248) { // from class: zZ.g
        }, b1.j("recommendations"));
        final String str249 = "Reputation System";
        final String str250 = "e1c735d2-7d4a-11ed-b0ed-40a6b7069875";
        final Owners owners42 = new Owners("Reputation_System_Unit", 125, new f(str249, str250) { // from class: zZ.g
        }, b1.k("rs-unit-support", "reputation-system"));
        f210438Q2 = owners42;
        final String str251 = "MTV";
        final String str252 = "33ae9e64-d262-474e-9f3d-fff63af74846";
        f210441R2 = new Owners("MTV_Team", WebSocketProtocol.PAYLOAD_SHORT, new f(str251, str252, owners42) { // from class: zZ.e
        }, b1.j("reputation-system"));
        final String str253 = "RepCore";
        final String str254 = "1c51bede-4aa9-4123-a866-aa209017a856";
        f210444S2 = new Owners("RepCore_Team", 127, new f(str253, str254, owners42) { // from class: zZ.e
        }, b1.j("reputation-system"));
        final String str255 = "Seller Hub";
        final String str256 = "143f4cd0-1408-4ed5-aa3c-ea06ce4d06d2";
        final Owners owners43 = new Owners("Seller_Hub_Unit", 128, new f(str255, str256) { // from class: zZ.g
        }, b1.j("sx-sellerhub-public"));
        f210447T2 = owners43;
        final String str257 = "Born To Be Pro";
        final String str258 = "014f619e-fdce-4c90-b513-a3c11f30fcda";
        f210450U2 = new Owners("Born_To_Be_Pro_Team", 129, new f(str257, str258, owners43) { // from class: zZ.e
        }, b1.j("born-to-be-pro"));
        final String str259 = "Sellers";
        final String str260 = "7fe8ae63-8f69-4659-911d-2633ac93e2be";
        final Owners owners44 = new Owners("Sellers_Unit", 130, new f(str259, str260) { // from class: zZ.g
        }, b1.b());
        f210453V2 = owners44;
        final String str261 = "Seller experience Global";
        final String str262 = "3ce8c11c-98c1-416b-a472-898da32f3913";
        f210456W2 = new Owners("Seller_Experience_Global_Team", 131, new f(str261, str262, owners44) { // from class: zZ.e
        }, b1.b());
        final String str263 = "Services Base";
        final String str264 = "c4d0f27d-6b08-4966-b382-1c1dedb27fe5";
        final Owners owners45 = new Owners("Services_Base_Unit", 132, new f(str263, str264) { // from class: zZ.g
        }, b1.j("services-base-public"));
        f210460X2 = owners45;
        final String str265 = "Bakers";
        final String str266 = "0c38db87-5b31-4ad7-af90-34938d6c00f9";
        f210463Y2 = new Owners("Bakers_Team", 133, new f(str265, str266, owners45) { // from class: zZ.e
        }, b1.j("services-bakers-public"));
        final String str267 = "Three Axes";
        final String str268 = "9d1411a4-595a-4577-86ac-c76950efc65a";
        f210466Z2 = new Owners("Three_Axes_Team", 134, new f(str267, str268, owners45) { // from class: zZ.e
        }, b1.j("three_axes-public"));
        final String str269 = "Services High Frequency";
        final String str270 = "7905a37e-2566-4f9a-b87f-3e7d51a64960";
        final Owners owners46 = new Owners("Services_High_Frequency_Unit", 135, new f(str269, str270) { // from class: zZ.g
        }, b1.j("services-public"));
        f210469a3 = owners46;
        final String str271 = "Freyja";
        final String str272 = "60aeae80-add9-4030-852e-da8c7e639be7";
        f210472b3 = new Owners("Freyja_Team", 136, new f(str271, str272, owners46) { // from class: zZ.e
        }, b1.j("services-freyja-public"));
        final String str273 = "Tubix";
        final String str274 = "f97b7ed5-8471-4a9c-ac2e-90311cb8c589";
        f210475c3 = new Owners("Tubix_Team", 137, new f(str273, str274, owners46) { // from class: zZ.e
        }, b1.j("services-tubix-public"));
        final String str275 = "Vesper";
        final String str276 = "9456dfeb-5d42-417c-b81a-40536a41c22e";
        f210479d3 = new Owners("Vesper_Team", 138, new f(str275, str276, owners46) { // from class: zZ.e
        }, b1.j("services-vesper-public"));
        final String str277 = "Services Low Frequency";
        final String str278 = "f0f4b1ae-547b-4d59-acc0-6758d6cbe890";
        final Owners owners47 = new Owners("Services_Low_Frequency_Unit", 139, new f(str277, str278) { // from class: zZ.g
        }, b1.j("services-public"));
        f210483e3 = owners47;
        final String str279 = "Build Busters";
        final String str280 = "b6a15866-85b2-4611-b54a-7265b040d121";
        f210487f3 = new Owners("Build_Busters_Team", 140, new f(str279, str280, owners47) { // from class: zZ.e
        }, b1.j("build_busters-public"));
        final String str281 = "Restless Hamsters";
        final String str282 = "d11da761-fc42-4673-a99b-bf7cf95f24bd";
        f210491g3 = new Owners("Restless_Hamsters_Team", 141, new f(str281, str282, owners47) { // from class: zZ.e
        }, b1.j("restless-hamsters-public"));
        final String str283 = "Truck Dealers";
        final String str284 = "3fe40adc-ed69-465c-9572-79ab6309c4ce";
        f210495h3 = new Owners("Truck_Dealers_Team", 142, new f(str283, str284, owners47) { // from class: zZ.e
        }, b1.j("truckdealers_public"));
        final String str285 = "Shipping Experience";
        final String str286 = "0a2c5c9f-a2f9-483e-a172-46e35bd2ca37";
        final Owners owners48 = new Owners("Shipping_Experience_Unit", 143, new f(str285, str286) { // from class: zZ.g
        }, b1.j("shipping-ex-public"));
        f210499i3 = owners48;
        final String str287 = "Vega";
        final String str288 = "216686ac-30a6-49ab-9659-03917bfa04b0";
        f210503j3 = new Owners("Vega_Team", 144, new f(str287, str288, owners48) { // from class: zZ.e
        }, b1.j("vega-team-public"));
        final String str289 = "Short Term Rent";
        final String str290 = "e22178a6-ed99-48fe-a85d-3ad67e26806c";
        final Owners owners49 = new Owners("Short_Term_Rent_Unit", 145, new f(str289, str290) { // from class: zZ.g
        }, b1.j("travel"));
        f210507k3 = owners49;
        final String str291 = "ASTRo";
        final String str292 = "7ffd4195-e90c-48ac-97ee-e85368708d90";
        f210511l3 = new Owners("ASTRo_Team", 146, new f(str291, str292, owners49) { // from class: zZ.e
        }, b1.j("real-astro"));
        final String str293 = "BedTrip";
        final String str294 = "beb0ad66-884f-4acf-a08b-720e62c78769";
        f210515m3 = new Owners("BedTrip_Team", 147, new f(str293, str294, owners49) { // from class: zZ.e
        }, b1.j("travel-bedtrip"));
        final String str295 = "Honey Badger";
        final String str296 = "f79a3c01-0484-4ffd-91a5-d15eccad8a6b";
        f210519n3 = new Owners("Honey_Badger_Team", 148, new f(str295, str296, owners49) { // from class: zZ.e
        }, b1.j("re-str-sx-support"));
        final String str297 = "STellaR";
        final String str298 = "1f62750c-eff5-457a-8993-6cfe22845dc0";
        f210523o3 = new Owners("STellaR_Team", 149, new f(str297, str298, owners49) { // from class: zZ.e
        }, b1.j("travel-stellar"));
        final String str299 = "Spare Parts";
        final String str300 = "7696f00e-2d35-4f2e-8851-1cbffd678b4e";
        final Owners owners50 = new Owners("Spare_Parts_Unit", 150, new f(str299, str300) { // from class: zZ.g
        }, b1.j("spare-parts-unit"));
        f210527p3 = owners50;
        final String str301 = "Spare Parts 3";
        final String str302 = "032ba28d-6744-462c-bdf5-1dd2c3b0c3bc";
        f210531q3 = new Owners("Spare_Parts_3_Team", 151, new f(str301, str302, owners50) { // from class: zZ.e
        }, b1.j("spare-parts-unit"));
        final String str303 = "Speed";
        final String str304 = "43fac84b-67e4-11e8-80d1-44a84244a6a1";
        final Owners owners51 = new Owners("Speed_Unit", 152, new f(str303, str304) { // from class: zZ.g
        }, b1.k("speed-android", "speed-ios", "mobile-apps-releases"));
        f210535r3 = owners51;
        final String str305 = "Speed Android";
        final String str306 = "b9f5a0e0-12c9-436e-8258-ef163ba94b6d";
        f210539s3 = new Owners("Speed_Android_Team", 153, new f(str305, str306, owners51) { // from class: zZ.e
        }, b1.j("speed-android"));
        final String str307 = "Statistics";
        final String str308 = "de86d88f-9661-42ad-8dd8-487ad6592ef3";
        final Owners owners52 = new Owners("Statistics_Unit", 154, new f(str307, str308) { // from class: zZ.g
        }, b1.j("statistics-support"));
        f210543t3 = owners52;
        final String str309 = "AllStats";
        final String str310 = "fc265bd9-cc3c-4111-adff-5bb76f1c4341";
        f210546u3 = new Owners("AllStats_Team", 155, new f(str309, str310, owners52) { // from class: zZ.e
        }, b1.j("all-stats"));
        final String str311 = "Jet";
        final String str312 = "f6787912-7739-4dde-9a85-01250bbbc54d";
        f210549v3 = new Owners("Jet_Team", 156, new f(str311, str312, owners52) { // from class: zZ.e
        }, b1.j("jet_public"));
        final String str313 = "Stock";
        final String str314 = "12348d0d-78ae-48f4-8146-77d33320a245";
        final Owners owners53 = new Owners("Stock_Unit", 157, new f(str313, str314) { // from class: zZ.g
        }, b1.j("auto-stock-public"));
        f210552w3 = owners53;
        final String str315 = "Atom";
        final String str316 = "4d410364-c6f9-443d-bf6d-6977e400c336";
        f210555x3 = new Owners("Atom_Team", 158, new f(str315, str316, owners53) { // from class: zZ.e
        }, b1.j("autohub-atom-public"));
        final String str317 = "Support Systems";
        final String str318 = "27d39ccf-db4e-11e7-80dc-44a842449fb0";
        f210558y3 = new Owners("Support_Systems_Unit", 159, new f(str317, str318) { // from class: zZ.g
        }, b1.j("support-systems"));
        final String str319 = "Target Contacts";
        final String str320 = "78370029-f90e-495d-a2f4-50f91ece7afa";
        final Owners owners54 = new Owners("Target_Contacts_Unit", 160, new f(str319, str320) { // from class: zZ.g
        }, b1.j("target_contact"));
        f210561z3 = owners54;
        final String str321 = "Match";
        final String str322 = "4d316487-faad-4d2b-a175-6a36578b3c45";
        f210390A3 = new Owners("Match_Team", 161, new f(str321, str322, owners54) { // from class: zZ.e
        }, b1.j("target_contact"));
        final String str323 = "Simplify";
        final String str324 = "0367bce7-31d5-4010-82d7-6ff694f0d19e";
        f210393B3 = new Owners("Simplify_Team", 162, new f(str323, str324, owners54) { // from class: zZ.e
        }, b1.j("target_contact"));
        final String str325 = "Transaction";
        final String str326 = "36e7f658-00cf-4ee1-bd59-d3604920a848";
        final Owners owners55 = new Owners("Transaction_Unit", 163, new f(str325, str326) { // from class: zZ.g
        }, b1.j("marketplace-public"));
        f210396C3 = owners55;
        final String str327 = "SpaceTrx";
        final String str328 = "e64a542d-9e4d-4593-a467-4bd32fa44775";
        f210399D3 = new Owners("SpaceTrx_Team", 164, new f(str327, str328, owners55) { // from class: zZ.e
        }, b1.k("trx-platform-public", "orders-constructor"));
        final String str329 = "Travel Core";
        final String str330 = "5d1d9dcd-63ee-44c3-a425-6ff9ad627a32";
        final Owners owners56 = new Owners("Travel_Core_Unit", 165, new f(str329, str330) { // from class: zZ.g
        }, b1.j("travel-core"));
        f210402E3 = owners56;
        final String str331 = "Full House";
        final String str332 = "192808ca-38a7-403d-97d4-5eda3bbfc2b3";
        f210405F3 = new Owners("Full_House_Team", 166, new f(str331, str332, owners56) { // from class: zZ.e
        }, b1.j("real-fh"));
        final String str333 = "Lavanda";
        final String str334 = "a235c843-a225-44d1-899f-7e3a4374d38a";
        f210408G3 = new Owners("Lavanda_Team", 167, new f(str333, str334, owners56) { // from class: zZ.e
        }, b1.j("travel-lavanda-public"));
        final String str335 = "Verification/GR";
        final String str336 = "1a14ebf2-ff55-11eb-80f6-44a84244a6a1";
        final Owners owners57 = new Owners("Verification_GR_Unit", 168, new f(str335, str336) { // from class: zZ.g
        }, b1.j("verification-support"));
        f210413H3 = owners57;
        final String str337 = "Headcrabs";
        final String str338 = "d0778628-8650-4d55-b3a1-9b281cd16f29";
        f210416I3 = new Owners("Headcrabs_Team", 169, new f(str337, str338, owners57) { // from class: zZ.e
        }, b1.j("verification-support"));
        final String str339 = "TnS GEO TT (Temp)";
        final String str340 = "3f1d151c-3bbd-4cbf-9141-d19faf7d1d46";
        f210419J3 = new Owners("TnS_GEO_TT_Temp_Team", 170, new f(str339, str340, owners57) { // from class: zZ.e
        }, b1.b());
        final String str341 = "Verification Growth";
        final String str342 = "1d0e77f9-38e7-4502-a75c-f47f4b426b6e";
        f210422K3 = new Owners("Verification_Growth_Team", 171, new f(str341, str342, owners57) { // from class: zZ.e
        }, b1.j("verification-support"));
        Owners[] ownersArrA = a();
        f210425L3 = ownersArrA;
        f210428M3 = c.a(ownersArrA);
    }

    public Owners(String str, int i12, f fVar, Set set) {
        this.f210562b = fVar;
        this.f210563c = set;
    }

    public static final /* synthetic */ Owners[] a() {
        return new Owners[]{f210476d, f210480e, f210484f, f210488g, f210492h, f210496i, f210500j, f210504k, f210508l, f210512m, f210516n, f210520o, f210524p, f210528q, f210532r, f210536s, f210540t, f210544u, f210547v, f210550w, f210553x, f210556y, f210559z, f210388A, f210391B, f210394C, f210397D, f210400E, f210403F, f210406G, f210409H, f210414I, f210417J, f210420K, f210423L, f210426M, f210429N, f210431O, f210433P, f210436Q, f210439R, f210442S, f210445T, f210448U, f210451V, f210454W, f210457X, f210461Y, f210464Z, f210467a0, f210470b0, f210473c0, f210477d0, f210481e0, f210485f0, f210489g0, f210493h0, f210497i0, f210501j0, f210505k0, f210509l0, f210513m0, f210517n0, f210521o0, f210525p0, f210529q0, f210533r0, f210537s0, f210541t0, f210545u0, f210548v0, f210551w0, f210554x0, f210557y0, f210560z0, f210389A0, f210392B0, f210395C0, f210398D0, f210401E0, f210404F0, f210407G0, f210410H0, f210415I0, f210418J0, f210421K0, f210424L0, f210427M0, f210430N0, f210432O0, f210434P0, f210437Q0, f210440R0, f210443S0, f210446T0, f210449U0, f210452V0, f210455W0, f210458X0, f210462Y0, f210465Z0, f210468a1, f210471b1, f210474c1, f210478d1, f210482e1, f210486f1, f210490g1, f210494h1, f210498i1, f210502j1, f210506k1, f210510l1, f210514m1, f210518n1, f210522o1, f210526p1, f210530q1, f210534r1, f210538s1, f210542t1, f210411H1, f210459X1, f210412H2, f210435P2, f210438Q2, f210441R2, f210444S2, f210447T2, f210450U2, f210453V2, f210456W2, f210460X2, f210463Y2, f210466Z2, f210469a3, f210472b3, f210475c3, f210479d3, f210483e3, f210487f3, f210491g3, f210495h3, f210499i3, f210503j3, f210507k3, f210511l3, f210515m3, f210519n3, f210523o3, f210527p3, f210531q3, f210535r3, f210539s3, f210543t3, f210546u3, f210549v3, f210552w3, f210555x3, f210558y3, f210561z3, f210390A3, f210393B3, f210396C3, f210399D3, f210402E3, f210405F3, f210408G3, f210413H3, f210416I3, f210419J3, f210422K3};
    }

    public static Owners valueOf(String str) {
        return (Owners) Enum.valueOf(Owners.class, str);
    }

    public static Owners[] values() {
        return (Owners[]) f210425L3.clone();
    }

    public Owners(String str, int i12, f fVar, Set set, int i13, C42822w c42822w) {
        this(str, i12, fVar, (i13 & 2) != 0 ? B0.f406639b : set);
    }
}
