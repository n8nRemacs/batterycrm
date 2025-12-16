package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class cn1 implements ud {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.banner.f f384349a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final tn1<en1> f384350b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final an1 f384351c;

    public static final class a implements un1<en1> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final com.yandex.mobile.ads.banner.f f384352a;

        public a(@Y61.k com.yandex.mobile.ads.banner.f fVar) {
            this.f384352a = fVar;
        }

        @Override // com.yandex.mobile.ads.impl.un1
        public final void a(en1 en1Var) {
            en1Var.a(new bn1(this));
        }

        @Override // com.yandex.mobile.ads.impl.un1
        public final void a(@Y61.k w2 w2Var) {
            this.f384352a.b(w2Var);
        }
    }

    @X41.j
    public cn1(@Y61.k com.yandex.mobile.ads.banner.f fVar, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k sd sdVar, @Y61.k fn1 fn1Var, @Y61.k tn1<en1> tn1Var, @Y61.k an1 an1Var) {
        this.f384349a = fVar;
        this.f384350b = tn1Var;
        this.f384351c = an1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ud
    public final void a(@Y61.k Context context, @Y61.k AdResponse<String> adResponse) {
        this.f384351c.a(context, adResponse, (pl0) null);
        this.f384351c.a(context, adResponse, (ql0) null);
        this.f384350b.a(context, adResponse, new a(this.f384349a));
    }

    public /* synthetic */ cn1(com.yandex.mobile.ads.banner.f fVar, ko1 ko1Var) {
        n2 n2VarD = fVar.d();
        sd sdVar = new sd();
        fn1 fn1Var = new fn1(ko1Var, n2VarD, fVar);
        this(fVar, ko1Var, n2VarD, sdVar, fn1Var, new tn1(n2VarD, sdVar, fn1Var), new an1(n2VarD));
    }

    @Override // com.yandex.mobile.ads.impl.ud
    public final void a(@Y61.k Context context) {
        this.f384350b.a();
    }
}
