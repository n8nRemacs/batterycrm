package com.avito.android.publish.premoderation.di;

import androidx.view.InterfaceC23487e;
import androidx.view.P0;
import com.avito.android.publish.di.InterfaceC33816g;
import com.avito.android.publish.premoderation.WrongCategoryFragment;
import com.avito.android.publish.premoderation.di.h;
import com.avito.android.publish.premoderation.r;
import com.avito.android.publish.premoderation.s;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import dagger.internal.l;
import dagger.internal.u;

/* compiled from: DaggerWrongCategoryComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: DaggerWrongCategoryComponent.java */
    public static final class b implements h.a {
        public b() {
        }

        @Override // com.avito.android.publish.premoderation.di.h.a
        public final h a(WrongCategoryFragment wrongCategoryFragment, InterfaceC33816g interfaceC33816g, r rVar, AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest, String str) {
            return new c(new i(), interfaceC33816g, wrongCategoryFragment, rVar, wrongCategorySuggest, str, null);
        }
    }

    /* compiled from: DaggerWrongCategoryComponent.java */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final l f238284a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC23487e> f238285b;

        /* renamed from: c, reason: collision with root package name */
        public final l f238286c;

        /* renamed from: d, reason: collision with root package name */
        public final l f238287d;

        /* renamed from: e, reason: collision with root package name */
        public final u<P0.c> f238288e;

        /* renamed from: f, reason: collision with root package name */
        public final u<s> f238289f;

        public c(i iVar, InterfaceC33816g interfaceC33816g, WrongCategoryFragment wrongCategoryFragment, r rVar, AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest, String str, a aVar) {
            l lVarA = l.a(wrongCategoryFragment);
            this.f238284a = lVarA;
            this.f238285b = dagger.internal.g.d(new j(iVar, lVarA));
            this.f238286c = l.a(wrongCategorySuggest);
            this.f238287d = l.a(str);
            u<P0.c> uVarD = dagger.internal.g.d(new com.avito.android.publish.premoderation.u(this.f238286c, this.f238287d, l.a(rVar), this.f238285b));
            this.f238288e = uVarD;
            this.f238289f = dagger.internal.g.d(new k(iVar, this.f238284a, uVarD));
        }

        @Override // com.avito.android.publish.premoderation.di.h
        public final void a(WrongCategoryFragment wrongCategoryFragment) {
            wrongCategoryFragment.f238270f0 = this.f238289f.get();
        }
    }

    public static h.a a() {
        return new b();
    }
}
