package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.webkit.WebView;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.Map;

/* loaded from: classes8.dex */
public final class en1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f385013a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ko1 f385014b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final n2 f385015c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final AdResponse<String> f385016d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.banner.h f385017e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final fe f385018f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final sd f385019g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final uh0 f385020h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private final m00 f385021i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private final je f385022j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    private final qd f385023k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    private a f385024l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final com.yandex.mobile.ads.banner.d f385025a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final k00 f385026b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final b f385027c;

        public a(@Y61.k com.yandex.mobile.ads.banner.d dVar, @Y61.k k00 k00Var, @Y61.k b bVar) {
            this.f385025a = dVar;
            this.f385026b = k00Var;
            this.f385027c = bVar;
        }

        @Y61.k
        public final com.yandex.mobile.ads.banner.d a() {
            return this.f385025a;
        }

        @Y61.k
        public final k00 b() {
            return this.f385026b;
        }

        @Y61.k
        public final b c() {
            return this.f385027c;
        }
    }

    public static final class b implements q00 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final Context f385028a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final ko1 f385029b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final n2 f385030c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        private final AdResponse<String> f385031d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        private final en1 f385032e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        private final com.yandex.mobile.ads.banner.d f385033f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        private un1<en1> f385034g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        private final g00 f385035h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        private WebView f385036i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        private Map<String, String> f385037j;

        public b(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k AdResponse<String> adResponse, @Y61.k en1 en1Var, @Y61.k com.yandex.mobile.ads.banner.d dVar, @Y61.k un1<en1> un1Var, @Y61.k g00 g00Var) {
            this.f385028a = context;
            this.f385029b = ko1Var;
            this.f385030c = n2Var;
            this.f385031d = adResponse;
            this.f385032e = en1Var;
            this.f385033f = dVar;
            this.f385034g = un1Var;
            this.f385035h = g00Var;
        }

        @Override // com.yandex.mobile.ads.impl.q00
        public final void a(boolean z12) {
        }

        @Y61.l
        public final WebView b() {
            return this.f385036i;
        }

        @Y61.l
        public final Map<String, String> a() {
            return this.f385037j;
        }

        @Override // com.yandex.mobile.ads.impl.q00
        public final void a(@Y61.k nr0 nr0Var, @Y61.l Map map) {
            this.f385036i = nr0Var;
            this.f385037j = map;
            this.f385034g.a((un1<en1>) this.f385032e);
        }

        @Override // com.yandex.mobile.ads.impl.q00
        public final void a(@Y61.k w2 w2Var) {
            this.f385034g.a(w2Var);
        }

        @Override // com.yandex.mobile.ads.impl.q00
        public final void a(@Y61.k String str) {
            this.f385035h.a(str, this.f385031d, new C39307b1(this.f385028a, this.f385029b, this.f385030c, this.f385033f.g(), 0));
        }

        public /* synthetic */ b(Context context, ko1 ko1Var, n2 n2Var, AdResponse adResponse, en1 en1Var, com.yandex.mobile.ads.banner.d dVar, un1 un1Var) {
            this(context, ko1Var, n2Var, adResponse, en1Var, dVar, un1Var, new g00(context, n2Var));
        }
    }

    public en1(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k AdResponse adResponse, @Y61.k com.yandex.mobile.ads.banner.h hVar, @Y61.k com.yandex.mobile.ads.banner.f fVar, @Y61.k sd sdVar, @Y61.k uh0 uh0Var, @Y61.k m00 m00Var, @Y61.k je jeVar, @Y61.k qd qdVar) {
        this.f385013a = context;
        this.f385014b = ko1Var;
        this.f385015c = n2Var;
        this.f385016d = adResponse;
        this.f385017e = hVar;
        this.f385018f = fVar;
        this.f385019g = sdVar;
        this.f385020h = uh0Var;
        this.f385021i = m00Var;
        this.f385022j = jeVar;
        this.f385023k = qdVar;
    }

    public final void a(@Y61.k SizeInfo sizeInfo, @Y61.k String str, @Y61.k ih1 ih1Var, @Y61.k un1<en1> un1Var) {
        ie ieVarA = this.f385022j.a(this.f385016d, sizeInfo);
        this.f385020h.getClass();
        boolean zA2 = uh0.a(str);
        qd qdVar = this.f385023k;
        Context context = this.f385013a;
        AdResponse<String> adResponse = this.f385016d;
        n2 n2Var = this.f385015c;
        com.yandex.mobile.ads.banner.h hVar = this.f385017e;
        fe feVar = this.f385018f;
        qdVar.getClass();
        com.yandex.mobile.ads.banner.d dVarA = qd.a(context, adResponse, n2Var, hVar, feVar);
        n30 n30VarH = dVarA.h();
        b bVar = new b(this.f385013a, this.f385014b, this.f385015c, this.f385016d, this, dVarA, un1Var);
        this.f385021i.getClass();
        k00 k00VarA = m00.a(zA2).a(ieVarA, bVar, ih1Var, n30VarH);
        this.f385024l = new a(dVarA, k00VarA, bVar);
        k00VarA.a(str);
    }

    public /* synthetic */ en1(Context context, ko1 ko1Var, n2 n2Var, AdResponse adResponse, com.yandex.mobile.ads.banner.h hVar, com.yandex.mobile.ads.banner.f fVar) {
        this(context, ko1Var, n2Var, adResponse, hVar, fVar, new sd(), new uh0(), m00.a(), new je(context, n2Var), new qd());
    }

    public final void a(@Y61.k bn1 bn1Var) {
        a aVar = this.f385024l;
        if (aVar == null) {
            bn1Var.a(i5.f386319k);
            return;
        }
        com.yandex.mobile.ads.banner.d dVarA = aVar.a();
        WebView webViewB = aVar.c().b();
        Map<String, String> mapA = aVar.c().a();
        if (webViewB instanceof ie) {
            ie ieVar = (ie) webViewB;
            SizeInfo sizeInfoK = ieVar.k();
            SizeInfo sizeInfoN = this.f385015c.n();
            if ((sizeInfoK == null || sizeInfoN == null) ? false : o41.a(this.f385013a, this.f385016d, sizeInfoK, this.f385019g, sizeInfoN)) {
                this.f385017e.setVisibility(0);
                fj1.a(this.f385017e, webViewB, this.f385013a, ieVar.k(), new gn1(this.f385013a, this.f385017e, this.f385015c, dVarA));
                dVarA.a(mapA);
                bn1Var.a();
                return;
            }
        }
        bn1Var.a(i5.f386317i);
    }

    public final void a() {
        a aVar = this.f385024l;
        if (aVar != null) {
            aVar.b().invalidate();
            aVar.a().l();
        }
        this.f385024l = null;
    }
}
