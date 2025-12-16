package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class mz {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final oz f388117a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final C39360r1 f388118b;

    public final class a implements pz {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final InterfaceC39337j1 f388119a;

        public a(InterfaceC39337j1 interfaceC39337j1) {
            this.f388119a = interfaceC39337j1;
        }

        @Override // com.yandex.mobile.ads.impl.pz
        public final void a(@Y61.l Boolean bool) {
            mz.this.f388118b.a(bool);
            this.f388119a.a();
        }
    }

    @X41.j
    public mz(@Y61.k Context context, @Y61.k oz ozVar, @Y61.k C39360r1 c39360r1) {
        this.f388117a = ozVar;
        this.f388118b = c39360r1;
    }

    public final void a(@Y61.k InterfaceC39337j1 interfaceC39337j1) {
        this.f388117a.a(new a(interfaceC39337j1));
    }

    public /* synthetic */ mz(Context context) {
        this(context, new oz(), new C39360r1(context));
    }
}
