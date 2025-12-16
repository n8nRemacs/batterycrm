package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
public final class rn1 implements sn1<qn1> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f389582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ko1 f389583b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final n2 f389584c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private qn1 f389585d;

    public rn1(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var) {
        this.f389582a = context;
        this.f389583b = ko1Var;
        this.f389584c = n2Var;
    }

    @Override // com.yandex.mobile.ads.impl.sn1
    public final void a(@Y61.k AdResponse<String> adResponse, @Y61.k SizeInfo sizeInfo, @Y61.k String str, @Y61.k un1<qn1> un1Var) {
        qn1 qn1Var = new qn1(this.f389582a, this.f389583b, this.f389584c, adResponse, str);
        this.f389585d = qn1Var;
        qn1Var.a(new a(qn1Var, un1Var));
        qn1Var.g();
    }

    public final class a implements ul {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final qn1 f389586a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final un1<qn1> f389587b;

        public a(qn1 qn1Var, @Y61.k un1<qn1> un1Var) {
            this.f389586a = qn1Var;
            this.f389587b = un1Var;
        }

        @Override // com.yandex.mobile.ads.impl.ul
        public final void a() {
            rn1.a(rn1.this);
            this.f389587b.a((un1<qn1>) this.f389586a);
        }

        @Override // com.yandex.mobile.ads.impl.ul
        public final void a(@Y61.k w2 w2Var) {
            rn1.a(rn1.this);
            this.f389587b.a(w2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sn1
    public final void a() {
        qn1 qn1Var = this.f389585d;
        if (qn1Var != null) {
            qn1Var.d();
        }
        qn1 qn1Var2 = this.f389585d;
        if (qn1Var2 != null) {
            qn1Var2.a((ul) null);
        }
        this.f389585d = null;
    }

    public static final void a(rn1 rn1Var) {
        qn1 qn1Var = rn1Var.f389585d;
        if (qn1Var != null) {
            qn1Var.a((ul) null);
        }
        rn1Var.f389585d = null;
    }
}
