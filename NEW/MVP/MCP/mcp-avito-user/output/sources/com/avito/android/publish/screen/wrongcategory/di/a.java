package com.avito.android.publish.screen.wrongcategory.di;

import com.avito.android.publish.di.InterfaceC33816g;
import com.avito.android.publish.screen.wrongcategory.WrongCategoryFragment;
import com.avito.android.publish.screen.wrongcategory.d;
import com.avito.android.publish.screen.wrongcategory.di.b;
import com.avito.android.publish.screen.wrongcategory.f;
import com.avito.android.publish.screen.wrongcategory.mvi.d;
import com.avito.android.publish.screen.wrongcategory.mvi.i;
import com.avito.android.publish.screen.wrongcategory.mvi.k;
import com.avito.android.publish.screen.wrongcategory.mvi.m;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import dagger.internal.e;
import dagger.internal.l;

/* compiled from: DaggerWrongCategoryComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerWrongCategoryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.screen.wrongcategory.di.b.a
        public final com.avito.android.publish.screen.wrongcategory.di.b a(AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest, InterfaceC33816g interfaceC33816g) {
            return new c(interfaceC33816g, wrongCategorySuggest, null);
        }
    }

    /* compiled from: DaggerWrongCategoryComponent.java */
    public static final class c implements com.avito.android.publish.screen.wrongcategory.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC33816g f242580a;

        /* renamed from: b, reason: collision with root package name */
        public final l f242581b;

        public c(InterfaceC33816g interfaceC33816g, AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest, C7275a c7275a) {
            this.f242580a = interfaceC33816g;
            l lVarA = l.a(wrongCategorySuggest);
            this.f242581b = l.a(new f(new com.avito.android.publish.screen.wrongcategory.e(new i(new com.avito.android.publish.screen.wrongcategory.mvi.f(lVarA), new d(lVarA), k.a(), m.a()))));
        }

        @Override // com.avito.android.publish.screen.wrongcategory.di.b
        public final void a(WrongCategoryFragment wrongCategoryFragment) {
            wrongCategoryFragment.f242559n0 = (d.a) this.f242581b.f393949a;
            wrongCategoryFragment.f242561p0 = this.f242580a.z0();
        }
    }

    public static b.a a() {
        return new b();
    }
}
