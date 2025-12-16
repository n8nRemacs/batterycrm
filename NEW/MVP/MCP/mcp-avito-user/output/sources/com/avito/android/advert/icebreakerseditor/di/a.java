package com.avito.android.advert.icebreakerseditor.di;

import Zf.InterfaceC19551a;
import com.avito.android.advert.icebreakerseditor.E;
import com.avito.android.advert.icebreakerseditor.IcebreakersEditorActivity;
import com.avito.android.advert.icebreakerseditor.analytics.IcebreakersEditorAnalyticsData;
import com.avito.android.advert.icebreakerseditor.di.b;
import com.avito.android.advert.icebreakerseditor.h;
import com.avito.android.advert.icebreakerseditor.mvi.i;
import com.avito.android.advert.icebreakerseditor.mvi.k;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DaggerIcebreakerEditorComponent.java */
@e
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: DaggerIcebreakerEditorComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.advert.icebreakerseditor.di.b.a
        public final com.avito.android.advert.icebreakerseditor.di.b a(com.avito.android.advert.icebreakerseditor.di.c cVar, ArrayList arrayList, int i12, IcebreakersEditorAnalyticsData icebreakersEditorAnalyticsData) {
            return new c(cVar, arrayList, Integer.valueOf(i12), icebreakersEditorAnalyticsData, null);
        }
    }

    /* compiled from: DaggerIcebreakerEditorComponent.java */
    public static final class c implements com.avito.android.advert.icebreakerseditor.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f71197a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f71198b;

        /* renamed from: c, reason: collision with root package name */
        public final l f71199c;

        /* renamed from: d, reason: collision with root package name */
        public final u<a4.b> f71200d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.advert.icebreakerseditor.mvi.d f71201e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC19551a> f71202f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.advert.icebreakerseditor.mvi.b f71203g;

        /* renamed from: h, reason: collision with root package name */
        public final l f71204h;

        /* renamed from: i, reason: collision with root package name */
        public final k f71205i;

        /* renamed from: j, reason: collision with root package name */
        public final E f71206j;

        /* compiled from: DaggerIcebreakerEditorComponent.java */
        /* renamed from: com.avito.android.advert.icebreakerseditor.di.a$c$a, reason: collision with other inner class name */
        public static final class C2171a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.icebreakerseditor.di.c f71207a;

            public C2171a(com.avito.android.advert.icebreakerseditor.di.c cVar) {
                this.f71207a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f71207a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerIcebreakerEditorComponent.java */
        public static final class b implements u<InterfaceC19551a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.icebreakerseditor.di.c f71208a;

            public b(com.avito.android.advert.icebreakerseditor.di.c cVar) {
                this.f71208a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19551a interfaceC19551aKf = this.f71208a.kf();
                t.c(interfaceC19551aKf);
                return interfaceC19551aKf;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.advert.icebreakerseditor.di.c cVar, List list, Integer num, IcebreakersEditorAnalyticsData icebreakersEditorAnalyticsData, C2170a c2170a) {
            this.f71197a = l.a(list);
            this.f71198b = new C2171a(cVar);
            l lVarA = l.a(icebreakersEditorAnalyticsData);
            this.f71199c = lVarA;
            u<a4.b> uVarD = g.d(new a4.d(lVarA, this.f71198b));
            this.f71200d = uVarD;
            this.f71201e = new com.avito.android.advert.icebreakerseditor.mvi.d(this.f71197a, uVarD);
            this.f71203g = new com.avito.android.advert.icebreakerseditor.mvi.b(uVarD, new h(new b(cVar)), this.f71199c);
            l lVarA2 = l.a(num);
            this.f71204h = lVarA2;
            this.f71205i = new k(lVarA2);
            this.f71206j = new E(new com.avito.android.advert.icebreakerseditor.mvi.g(this.f71201e, this.f71203g, i.a(), this.f71205i, this.f71197a, this.f71204h));
        }

        @Override // com.avito.android.advert.icebreakerseditor.di.b
        public final void a(IcebreakersEditorActivity icebreakersEditorActivity) {
            icebreakersEditorActivity.f71188m = this.f71206j;
        }
    }

    public static b.a a() {
        return new b();
    }
}
