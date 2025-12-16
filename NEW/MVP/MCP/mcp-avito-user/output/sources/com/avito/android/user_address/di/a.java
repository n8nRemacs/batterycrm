package com.avito.android.user_address.di;

import android.app.Activity;
import android.content.res.Resources;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.di.b;
import dagger.internal.l;
import dagger.internal.u;

/* compiled from: DaggerUserAddressCommonComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerUserAddressCommonComponent.java */
    public static final class b implements b.InterfaceC9443b {
        public b() {
        }

        @Override // com.avito.android.user_address.di.b.InterfaceC9443b
        public final com.avito.android.user_address.di.b a(com.avito.android.user_address.di.c cVar, UserAddressActivity userAddressActivity, Resources resources, String str) {
            str.getClass();
            return new c(cVar, userAddressActivity, resources, str, null);
        }
    }

    /* compiled from: DaggerUserAddressCommonComponent.java */
    public static final class c implements com.avito.android.user_address.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_address.di.c f307297a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.user_address.a> f307298b;

        public c(com.avito.android.user_address.di.c cVar, Activity activity, Resources resources, String str, C9442a c9442a) {
            this.f307297a = cVar;
            this.f307298b = dagger.internal.g.d(new com.avito.android.user_address.c(l.a(str)));
        }

        @Override // com.avito.android.user_address.di.b
        public final void b(UserAddressActivity userAddressActivity) {
            userAddressActivity.f307103m = this.f307297a.Kg();
        }

        @Override // com.avito.android.user_address.di.e
        public final com.avito.android.user_address.a c() {
            return this.f307298b.get();
        }
    }

    public static b.InterfaceC9443b a() {
        return new b();
    }
}
