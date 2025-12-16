package oL0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import com.avito.conveyor_item.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import wJ0.g;

/* compiled from: AdvertItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoL0/a;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44663a implements UserAdvertItem {

    /* renamed from: A, reason: collision with root package name */
    @l
    public final String f419711A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final DeepLink f419712B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final String f419713C;

    /* renamed from: D, reason: collision with root package name */
    @l
    public final String f419714D;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f419715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f419716c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f419717d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f419718e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f419719f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f419720g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f419721h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UserAdvertItem.p f419722i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Map<String, Image> f419723j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final UserAdvertItem.q f419724k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f419725l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f419726m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final UserAdvertItem.l f419727n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f419728o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final DeepLink f419729p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f419730q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final UserAdvertItem.Status f419731r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final UserAdvertItem.j f419732s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final UserAdvertItem.k f419733t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final UserAdvertItem.t f419734u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final UserAdvertItem.i f419735v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final UserAdvertItem.h f419736w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public final UserAdvertItem.g f419737x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f419738y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final UserAdvertItem.u f419739z;

    public C44663a() {
        throw null;
    }

    public C44663a(String str, String str2, String str3, Image image, String str4, AttributedText attributedText, String str5, UserAdvertItem.p pVar, Map map, UserAdvertItem.q qVar, String str6, String str7, UserAdvertItem.l lVar, boolean z12, DeepLink deepLink, boolean z13, UserAdvertItem.Status status, UserAdvertItem.j jVar, UserAdvertItem.k kVar, UserAdvertItem.t tVar, UserAdvertItem.i iVar, UserAdvertItem.h hVar, UserAdvertItem.g gVar, boolean z14, UserAdvertItem.u uVar, String str8, DeepLink deepLink2, String str9, String str10, int i12, C42822w c42822w) {
        AttributedText attributedText2 = (i12 & 32) != 0 ? null : attributedText;
        String str11 = (i12 & 2048) != 0 ? null : str7;
        boolean z15 = (i12 & 8192) != 0 ? false : z12;
        UserAdvertItem.j jVar2 = (131072 & i12) != 0 ? null : jVar;
        UserAdvertItem.k kVar2 = (262144 & i12) != 0 ? null : kVar;
        UserAdvertItem.t tVar2 = (524288 & i12) != 0 ? null : tVar;
        UserAdvertItem.i iVar2 = (1048576 & i12) != 0 ? null : iVar;
        UserAdvertItem.h hVar2 = (2097152 & i12) != 0 ? null : hVar;
        UserAdvertItem.g gVar2 = (4194304 & i12) != 0 ? null : gVar;
        UserAdvertItem.u uVar2 = (16777216 & i12) != 0 ? null : uVar;
        String str12 = (33554432 & i12) != 0 ? null : str8;
        DeepLink deepLink3 = (67108864 & i12) != 0 ? null : deepLink2;
        String str13 = (134217728 & i12) != 0 ? null : str9;
        String str14 = (i12 & 268435456) == 0 ? str10 : null;
        this.f419715b = str;
        this.f419716c = str2;
        this.f419717d = str3;
        this.f419718e = image;
        this.f419719f = str4;
        this.f419720g = attributedText2;
        this.f419721h = str5;
        this.f419722i = pVar;
        this.f419723j = map;
        this.f419724k = qVar;
        this.f419725l = str6;
        this.f419726m = str11;
        this.f419727n = lVar;
        this.f419728o = z15;
        this.f419729p = deepLink;
        this.f419730q = z13;
        this.f419731r = status;
        this.f419732s = jVar2;
        this.f419733t = kVar2;
        this.f419734u = tVar2;
        this.f419735v = iVar2;
        this.f419736w = hVar2;
        this.f419737x = gVar2;
        this.f419738y = z14;
        this.f419739z = uVar2;
        this.f419711A = str12;
        this.f419712B = deepLink3;
        this.f419713C = str13;
        this.f419714D = str14;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: B, reason: from getter */
    public final UserAdvertItem.g getF419737x() {
        return this.f419737x;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: B1 */
    public final UserAdvertItem.CpxPromoWidget getF393798Q() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: C */
    public final UserAdvertItem.a getF393785D() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: D, reason: from getter */
    public final UserAdvertItem.q getF419724k() {
        return this.f419724k;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: E, reason: from getter */
    public final String getF419726m() {
        return this.f419726m;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: E1, reason: from getter */
    public final String getF419713C() {
        return this.f419713C;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: F, reason: from getter */
    public final String getF419714D() {
        return this.f419714D;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: F0 */
    public final String getF393797P() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    /* renamed from: G, reason: from getter */
    public final boolean getF419728o() {
        return this.f419728o;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: G1, reason: from getter */
    public final UserAdvertItem.t getF419734u() {
        return this.f419734u;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: H */
    public final UserAdvertItem.r getF393808k() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: J0 */
    public final UserAdvertItem.b getF393793L() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: M1, reason: from getter */
    public final UserAdvertItem.k getF419733t() {
        return this.f419733t;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: N1 */
    public final UserAdvertItem.c getF393789H() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: O1 */
    public final UserAdvertItem.m getF393794M() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: U */
    public final UserAdvertItem.o getF393796O() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: U0 */
    public final UserAdvertItem.s getF393791J() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: W1 */
    public final UserAdvertItem.e getF393790I() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: X0, reason: from getter */
    public final UserAdvertItem.p getF419722i() {
        return this.f419722i;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: Z1, reason: from getter */
    public final String getF419711A() {
        return this.f419711A;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: a2, reason: from getter */
    public final UserAdvertItem.h getF419736w() {
        return this.f419736w;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: c1, reason: from getter */
    public final AttributedText getF419720g() {
        return this.f419720g;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    /* renamed from: f1, reason: from getter */
    public final boolean getF419730q() {
        return this.f419730q;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: g1, reason: from getter */
    public final String getF419725l() {
        return this.f419725l;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @k
    /* renamed from: getAdvertId, reason: from getter */
    public final String getF419716c() {
        return this.f419716c;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @k
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF419729p() {
        return this.f419729p;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85216b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: getImage, reason: from getter */
    public final Image getF419718e() {
        return this.f419718e;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: getPrice, reason: from getter */
    public final String getF419719f() {
        return this.f419719f;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: getStatus, reason: from getter */
    public final UserAdvertItem.Status getF419731r() {
        return this.f419731r;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272451b() {
        return this.f419715b;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF419717d() {
        return this.f419717d;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    /* renamed from: h2, reason: from getter */
    public final boolean getF419738y() {
        return this.f419738y;
    }

    @Override // wJ0.f
    @k
    public final List<g<?>> i() {
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: j */
    public final String getF393788G() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: k, reason: from getter */
    public final String getF419721h() {
        return this.f419721h;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: m2, reason: from getter */
    public final UserAdvertItem.j getF419732s() {
        return this.f419732s;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: n0, reason: from getter */
    public final UserAdvertItem.i getF419735v() {
        return this.f419735v;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: n1 */
    public final UserAdvertItem.RightAction getF393795N() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: r */
    public final AttributedText getF20864f() {
        return null;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: r1, reason: from getter */
    public final UserAdvertItem.l getF419727n() {
        return this.f419727n;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: u, reason: from getter */
    public final UserAdvertItem.u getF419739z() {
        return this.f419739z;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    public final Map<String, Image> u0() {
        return this.f419723j;
    }

    @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem
    @l
    /* renamed from: w, reason: from getter */
    public final DeepLink getF419712B() {
        return this.f419712B;
    }
}
