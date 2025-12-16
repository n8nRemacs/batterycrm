package com.avito.android.profile_tab.summary.factory;

import Cd.C13243a;
import Fc0.InterfaceC13557a;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.profile_tab.summary.factory.e;
import com.avito.android.profile_tab.summary.factory.i;
import com.avito.android.profile_tab.summary.mvi.k;
import com.avito.android.profile_tab.summary.mvi.m;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerProfileSummaryComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: DaggerProfileSummaryComponent.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.profile_tab.summary.factory.i.b
        public final i a(com.avito.android.profile_tab.summary.a aVar, T0 t02, com.avito.android.profile.pro.impl.di.d dVar) {
            t02.getClass();
            dVar.getClass();
            return new c(dVar, aVar, t02, null);
        }
    }

    /* compiled from: DaggerProfileSummaryComponent.java */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final T0 f230872a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.profile_tab.summary.a f230873b;

        /* renamed from: c, reason: collision with root package name */
        public final i.a f230874c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC13557a> f230875d;

        /* compiled from: DaggerProfileSummaryComponent.java */
        public static final class a implements u<InterfaceC13557a> {

            /* renamed from: a, reason: collision with root package name */
            public final i.a f230876a;

            public a(i.a aVar) {
                this.f230876a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f230876a.M7();
            }
        }

        public c(i.a aVar, com.avito.android.profile_tab.summary.a aVar2, T0 t02, a aVar3) {
            this.f230872a = t02;
            this.f230873b = aVar2;
            this.f230874c = aVar;
            this.f230875d = new a(aVar);
        }

        @Override // com.avito.android.profile_tab.summary.factory.i
        public final com.avito.android.profile_tab.summary.f a() {
            i.a aVar = this.f230874c;
            ZS.b bVarA = aVar.a();
            t.c(bVarA);
            k kVar = new k(this.f230873b, bVarA, new com.avito.android.profile_tab.summary.mvi.a(aVar.c(), new com.avito.android.profile_tab.summary.domain.c(aVar.c(), dagger.internal.g.a(this.f230875d)), aVar.m(), aVar.d(), this.f230873b), new m(), aVar.c());
            f.f230877a.getClass();
            return (com.avito.android.profile_tab.summary.f) new P0(this.f230872a, new C13243a(new g(kVar))).a(com.avito.android.profile_tab.summary.c.class);
        }
    }
}
