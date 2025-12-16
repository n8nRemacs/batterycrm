package com.avito.android.beduin.di.inline_filters;

import android.app.Activity;
import com.avito.android.B2;
import com.avito.android.beduin.di.inline_filters.c;
import com.avito.android.inline_filters.di.o;
import com.avito.android.inline_filters.dialog.C31011e;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.inline_filters.dialog.s;
import com.avito.android.inline_filters.dialog.v;
import com.avito.android.select.x;
import com.avito.android.select.z;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import lE.C43624b;

/* compiled from: DaggerInlineFiltersComponent.java */
@e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerInlineFiltersComponent.java */
    /* renamed from: com.avito.android.beduin.di.inline_filters.b$b, reason: collision with other inner class name */
    public static final class C3110b implements c.a {
        public C3110b() {
        }

        @Override // com.avito.android.beduin.di.inline_filters.c.a
        public final com.avito.android.beduin.di.inline_filters.c a(Activity activity, o oVar) {
            activity.getClass();
            return new c(oVar, activity, null);
        }
    }

    /* compiled from: DaggerInlineFiltersComponent.java */
    public static final class c implements com.avito.android.beduin.di.inline_filters.c {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.select.variant.b> f103922a = g.d(com.avito.android.select.variant.d.a());

        /* renamed from: b, reason: collision with root package name */
        public final l f103923b;

        /* renamed from: c, reason: collision with root package name */
        public final u<NN.c> f103924c;

        /* renamed from: d, reason: collision with root package name */
        public final u<s> f103925d;

        /* renamed from: e, reason: collision with root package name */
        public final u<x> f103926e;

        /* renamed from: f, reason: collision with root package name */
        public final u<B2> f103927f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C43624b> f103928g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f103929h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC30999b> f103930i;

        /* compiled from: DaggerInlineFiltersComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f103931a;

            public a(o oVar) {
                this.f103931a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f103931a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerInlineFiltersComponent.java */
        /* renamed from: com.avito.android.beduin.di.inline_filters.b$c$b, reason: collision with other inner class name */
        public static final class C3111b implements u<NN.c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f103932a;

            public C3111b(o oVar) {
                this.f103932a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f103932a.H0();
            }
        }

        /* compiled from: DaggerInlineFiltersComponent.java */
        /* renamed from: com.avito.android.beduin.di.inline_filters.b$c$c, reason: collision with other inner class name */
        public static final class C3112c implements u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final o f103933a;

            public C3112c(o oVar) {
                this.f103933a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f103933a.D();
            }
        }

        /* compiled from: DaggerInlineFiltersComponent.java */
        public static final class d implements u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final o f103934a;

            public d(o oVar) {
                this.f103934a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f103934a.J();
            }
        }

        public c(o oVar, Activity activity, a aVar) {
            l lVarA = l.a(activity);
            this.f103923b = lVarA;
            this.f103925d = g.d(new v(lVarA, new C3111b(oVar), this.f103922a));
            u<x> uVarA = B.a(z.a());
            this.f103926e = uVarA;
            C3112c c3112c = new C3112c(oVar);
            d dVar = new d(oVar);
            this.f103929h = new a(oVar);
            this.f103930i = g.d(new C31011e(this.f103923b, uVarA, this.f103925d, c3112c, dVar, com.avito.android.inline_filters.dialog.calendar.date_range.b.a(), this.f103929h));
        }

        @Override // com.avito.android.beduin.di.inline_filters.c
        public final void a(com.avito.android.beduin.common.component.inline_filter.g gVar) {
            gVar.f101497a = this.f103925d.get();
            gVar.f101498b = this.f103930i.get();
        }
    }

    public static c.a a() {
        return new C3110b();
    }
}
