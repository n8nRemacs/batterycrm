package com.avito.android.mortgage.landing.list.items.programs.di;

import Y41.l;
import androidx.recyclerview.widget.C;
import com.avito.android.mortgage.landing.list.items.programs.di.b;
import com.avito.android.mortgage.landing.list.items.programs.di.d;
import com.avito.android.mortgage.landing.list.items.programs.k;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerProgramsViewComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerProgramsViewComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.landing.list.items.programs.di.b.a
        public final com.avito.android.mortgage.landing.list.items.programs.di.b a(l<? super String, G0> lVar) {
            return new c(lVar, null);
        }
    }

    /* compiled from: DaggerProgramsViewComponent.java */
    public static final class c implements com.avito.android.mortgage.landing.list.items.programs.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final f f199888a;

        /* renamed from: b, reason: collision with root package name */
        public final u<C> f199889b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199890c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f199891d;

        /* renamed from: e, reason: collision with root package name */
        public final u<h> f199892e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f199893f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f199894g;

        public c() {
            throw null;
        }

        public c(l lVar, C5909a c5909a) {
            f fVar = new f();
            this.f199888a = fVar;
            this.f199889b = g.d(new com.avito.android.mortgage.landing.di.g(fVar));
            this.f199890c = g.d(new com.avito.android.mortgage.landing.list.items.programs.program.b(new com.avito.android.mortgage.landing.list.items.programs.program.f(dagger.internal.l.a(lVar))));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f199890c);
            u<com.avito.konveyor.a> uVarD = g.d(new com.avito.android.mortgage.landing.di.f(bVarA.b()));
            this.f199891d = uVarD;
            this.f199892e = g.d(new com.avito.android.mortgage.landing.di.d(uVarD));
            u<com.avito.android.recycler.data_aware.e> uVarD2 = g.d(d.a.f199896a);
            this.f199893f = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = g.d(new com.avito.android.mortgage.landing.di.e(uVarD2, this.f199889b, this.f199892e));
            this.f199894g = uVarD3;
            f.a(this.f199888a, g.d(new com.avito.android.mortgage.landing.di.h(uVarD3, this.f199891d)));
        }

        @Override // com.avito.android.mortgage.landing.list.items.programs.di.b
        public final void a(k kVar) {
            kVar.f199910e = (j) this.f199888a.get();
            kVar.f199911f = this.f199892e.get();
            kVar.f199912g = new com.avito.android.mortgage.landing.list.decoration.c();
        }
    }

    public static b.a a() {
        return new b();
    }
}
