package com.avito.android.select.new_metro.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.select.new_metro.ItemsHolder;
import com.avito.android.select.new_metro.SelectMetroFragment;
import com.avito.android.select.new_metro.SelectMetroParams;
import com.avito.android.select.new_metro.di.h;
import com.avito.android.select.new_metro.mvi.n;
import com.avito.android.select.new_metro.mvi.s;
import com.avito.android.select.new_metro.mvi.t;
import com.avito.android.select.new_metro.mvi.v;
import com.avito.android.select.new_metro.p;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import gq0.InterfaceC40721a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DaggerSelectMetroFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerSelectMetroFragmentComponent.java */
    /* renamed from: com.avito.android.select.new_metro.di.b$b, reason: collision with other inner class name */
    public static final class C7943b implements h.a {

        /* renamed from: a, reason: collision with root package name */
        public SelectMetroFragment f266146a;

        /* renamed from: b, reason: collision with root package name */
        public SelectMetroParams f266147b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f266148c;

        /* renamed from: d, reason: collision with root package name */
        public C28478k f266149d;

        /* renamed from: e, reason: collision with root package name */
        public g f266150e;

        public C7943b() {
        }

        @Override // com.avito.android.select.new_metro.di.h.a
        public final h.a a(SelectMetroFragment selectMetroFragment) {
            this.f266146a = selectMetroFragment;
            return this;
        }

        @Override // com.avito.android.select.new_metro.di.h.a
        public final h.a b(ArrayList arrayList) {
            this.f266148c = arrayList;
            return this;
        }

        @Override // com.avito.android.select.new_metro.di.h.a
        public final h build() {
            t.a(Fragment.class, this.f266146a);
            t.a(SelectMetroParams.class, this.f266147b);
            t.a(List.class, this.f266148c);
            t.a(C28478k.class, this.f266149d);
            t.a(g.class, this.f266150e);
            return new c(this.f266150e, this.f266146a, this.f266147b, this.f266148c, this.f266149d, null);
        }

        @Override // com.avito.android.select.new_metro.di.h.a
        public final h.a c(C28478k c28478k) {
            this.f266149d = c28478k;
            return this;
        }

        @Override // com.avito.android.select.new_metro.di.h.a
        public final h.a d(g gVar) {
            this.f266150e = gVar;
            return this;
        }

        @Override // com.avito.android.select.new_metro.di.h.a
        public final h.a e(SelectMetroParams selectMetroParams) {
            this.f266147b = selectMetroParams;
            return this;
        }
    }

    /* compiled from: DaggerSelectMetroFragmentComponent.java */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final g f266151a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f266152b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f266153c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ItemsHolder> f266154d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f266155e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC40721a> f266156f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.geo_common.interactor.g> f266157g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.select.new_metro.mvi.h f266158h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.select.new_metro.mvi.f f266159i;

        /* renamed from: j, reason: collision with root package name */
        public final s f266160j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f266161k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f266162l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f266163m;

        /* compiled from: DaggerSelectMetroFragmentComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f266164a;

            public a(g gVar) {
                this.f266164a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f266164a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSelectMetroFragmentComponent.java */
        /* renamed from: com.avito.android.select.new_metro.di.b$c$b, reason: collision with other inner class name */
        public static final class C7944b implements u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final g f266165a;

            public C7944b(g gVar) {
                this.f266165a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f266165a.u0();
                t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerSelectMetroFragmentComponent.java */
        /* renamed from: com.avito.android.select.new_metro.di.b$c$c, reason: collision with other inner class name */
        public static final class C7945c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final g f266166a;

            public C7945c(g gVar) {
                this.f266166a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f266166a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(g gVar, Fragment fragment, SelectMetroParams selectMetroParams, List list, C28478k c28478k, a aVar) {
            this.f266151a = gVar;
            this.f266152b = dagger.internal.l.a(selectMetroParams);
            this.f266153c = dagger.internal.l.a(fragment);
            this.f266154d = B.a(new m(this.f266152b, this.f266153c, dagger.internal.l.a(list)));
            u<InterfaceC40721a> uVarA = B.a(new f(new a(gVar)));
            this.f266156f = uVarA;
            p pVar = new p(new C7944b(gVar));
            dagger.internal.l lVar = this.f266152b;
            this.f266158h = new com.avito.android.select.new_metro.mvi.h(lVar, uVarA, pVar);
            u<ItemsHolder> uVar = this.f266154d;
            this.f266159i = new com.avito.android.select.new_metro.mvi.f(lVar, uVarA, uVar, pVar);
            this.f266160j = new s(lVar, uVar);
            this.f266161k = new C7945c(gVar);
            this.f266162l = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f266161k);
            this.f266163m = dagger.internal.l.a(new v(new com.avito.android.select.new_metro.mvi.u(new com.avito.android.select.new_metro.mvi.l(this.f266154d, this.f266158h, this.f266159i, n.a(), this.f266160j, this.f266162l))));
        }

        @Override // com.avito.android.select.new_metro.di.h
        public final void a(SelectMetroFragment selectMetroFragment) {
            selectMetroFragment.f265917t0 = (t.c) this.f266163m.f393949a;
            selectMetroFragment.f265919v0 = this.f266162l.get();
            this.f266151a.v0();
        }
    }

    public static h.a a() {
        return new C7943b();
    }
}
