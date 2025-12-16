package com.avito.android.mortgage.root.list.items.immutable_info.description.di;

import b10.C25388c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.root.list.items.immutable_info.description.ImmutableInfoDescriptionDialog;
import com.avito.android.mortgage.root.list.items.immutable_info.description.di.b;
import com.avito.android.mortgage.root.list.items.immutable_info.description.model.ImmutableInfoDescriptionArguments;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.d;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.g;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.i;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.k;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerImmutableInfoDescriptionComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerImmutableInfoDescriptionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.root.list.items.immutable_info.description.di.b.a
        public final com.avito.android.mortgage.root.list.items.immutable_info.description.di.b a(o oVar, C28478k c28478k, ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments) {
            return new c(oVar, c28478k, immutableInfoDescriptionArguments, null);
        }
    }

    /* compiled from: DaggerImmutableInfoDescriptionComponent.java */
    public static final class c implements com.avito.android.mortgage.root.list.items.immutable_info.description.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f202586a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f202587b;

        /* renamed from: c, reason: collision with root package name */
        public final d f202588c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.b f202589d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f202590e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f202591f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.mortgage.root.list.items.immutable_info.description.l f202592g;

        /* compiled from: DaggerImmutableInfoDescriptionComponent.java */
        /* renamed from: com.avito.android.mortgage.root.list.items.immutable_info.description.di.a$c$a, reason: collision with other inner class name */
        public static final class C6027a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202593a;

            public C6027a(o oVar) {
                this.f202593a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f202593a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerImmutableInfoDescriptionComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202594a;

            public b(o oVar) {
                this.f202594a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f202594a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, C28478k c28478k, ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments, C6026a c6026a) {
            l lVarA = l.a(immutableInfoDescriptionArguments);
            this.f202586a = lVarA;
            C25388c c25388c = new C25388c(new C6027a(oVar));
            this.f202588c = new d(lVarA, c25388c);
            this.f202589d = new com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.b(c25388c);
            this.f202590e = new b(oVar);
            this.f202591f = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f202590e);
            this.f202592g = new com.avito.android.mortgage.root.list.items.immutable_info.description.l(new g(this.f202586a, this.f202588c, this.f202589d, i.a(), k.a(), this.f202591f));
        }

        @Override // com.avito.android.mortgage.root.list.items.immutable_info.description.di.b
        public final void a(ImmutableInfoDescriptionDialog immutableInfoDescriptionDialog) {
            immutableInfoDescriptionDialog.f202560h0 = this.f202592g;
            immutableInfoDescriptionDialog.f202562j0 = this.f202591f.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
