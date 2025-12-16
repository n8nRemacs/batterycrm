package com.avito.android.body_condition_sheet.di;

import Mj.InterfaceC14496a;
import com.avito.android.body_condition_sheet.BodyConditionSheetActivity;
import com.avito.android.body_condition_sheet.di.a;
import com.avito.android.body_condition_sheet.mvi.i;
import com.avito.android.body_condition_sheet.mvi.n;
import com.avito.android.body_condition_sheet.mvi.p;
import com.avito.android.body_condition_sheet.q;
import com.avito.android.body_condition_sheet.s;
import com.avito.android.body_condition_sheet.w;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.util.C;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerBodyConditionSheetActivityComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class g {

    /* compiled from: DaggerBodyConditionSheetActivityComponent.java */
    public static final class b implements com.avito.android.body_condition_sheet.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.body_condition_sheet.di.b f106856a;

        /* renamed from: b, reason: collision with root package name */
        public final l f106857b;

        /* renamed from: c, reason: collision with root package name */
        public final q f106858c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C> f106859d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC14496a> f106860e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.advert_core.body_condition.c> f106861f = dagger.internal.g.d(com.avito.android.advert_core.body_condition.e.a());

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.body_condition.f> f106862g = dagger.internal.g.d(w.a());

        /* compiled from: DaggerBodyConditionSheetActivityComponent.java */
        public static final class a implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.body_condition_sheet.di.b f106863a;

            public a(com.avito.android.body_condition_sheet.di.b bVar) {
                this.f106863a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f106863a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        public b(com.avito.android.body_condition_sheet.di.c cVar, com.avito.android.body_condition_sheet.di.b bVar, BodyCondition bodyCondition, String str, a aVar) {
            this.f106856a = bVar;
            this.f106857b = l.a(bodyCondition);
            this.f106858c = new q(new com.avito.android.body_condition_sheet.mvi.l(new i(this.f106857b, l.b(str)), com.avito.android.body_condition_sheet.mvi.g.a(), n.a(), p.a()));
            this.f106860e = dagger.internal.g.d(new d(cVar, new a(bVar)));
        }

        @Override // com.avito.android.body_condition_sheet.di.a
        public final void a(BodyConditionSheetActivity bodyConditionSheetActivity) {
            bodyConditionSheetActivity.f106837q = this.f106858c;
            bodyConditionSheetActivity.f106839s = this.f106860e.get();
            bodyConditionSheetActivity.f106840t = this.f106861f.get();
            bodyConditionSheetActivity.f106841u = this.f106862g.get();
            SK0.b bVarP = this.f106856a.p();
            t.c(bVarP);
            bodyConditionSheetActivity.f106842v = new s(bVarP);
        }
    }

    /* compiled from: DaggerBodyConditionSheetActivityComponent.java */
    public static final class c implements a.InterfaceC3194a {

        /* renamed from: a, reason: collision with root package name */
        public BodyCondition f106864a;

        /* renamed from: b, reason: collision with root package name */
        public String f106865b;

        /* renamed from: c, reason: collision with root package name */
        public com.avito.android.body_condition_sheet.di.b f106866c;

        public c() {
        }

        @Override // com.avito.android.body_condition_sheet.di.a.InterfaceC3194a
        public final a.InterfaceC3194a a(BodyCondition bodyCondition) {
            this.f106864a = bodyCondition;
            return this;
        }

        @Override // com.avito.android.body_condition_sheet.di.a.InterfaceC3194a
        public final a.InterfaceC3194a b(String str) {
            this.f106865b = str;
            return this;
        }

        @Override // com.avito.android.body_condition_sheet.di.a.InterfaceC3194a
        public final com.avito.android.body_condition_sheet.di.a build() {
            t.a(BodyCondition.class, this.f106864a);
            t.a(com.avito.android.body_condition_sheet.di.b.class, this.f106866c);
            return new b(new com.avito.android.body_condition_sheet.di.c(), this.f106866c, this.f106864a, this.f106865b, null);
        }

        @Override // com.avito.android.body_condition_sheet.di.a.InterfaceC3194a
        public final a.InterfaceC3194a c(com.avito.android.body_condition_sheet.di.b bVar) {
            this.f106866c = bVar;
            return this;
        }
    }

    public static a.InterfaceC3194a a() {
        return new c();
    }
}
