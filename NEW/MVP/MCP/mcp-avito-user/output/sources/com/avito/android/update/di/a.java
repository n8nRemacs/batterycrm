package com.avito.android.update.di;

import com.avito.android.update.UpdateApplicationActivity;
import com.avito.android.update.di.b;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerUpdateApplicationComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerUpdateApplicationComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.update.di.c f306640a;

        public b() {
        }

        @Override // com.avito.android.update.di.b.a
        public final b.a a(com.avito.android.update.di.c cVar) {
            this.f306640a = cVar;
            return this;
        }

        @Override // com.avito.android.update.di.b.a
        public final com.avito.android.update.di.b build() {
            t.a(com.avito.android.update.di.c.class, this.f306640a);
            return new c(this.f306640a, null);
        }
    }

    /* compiled from: DaggerUpdateApplicationComponent.java */
    public static final class c implements com.avito.android.update.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.update.di.c f306641a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.update.c> f306642b = dagger.internal.g.d(com.avito.android.update.g.a());

        public c(com.avito.android.update.di.c cVar, C9422a c9422a) {
            this.f306641a = cVar;
        }

        @Override // com.avito.android.update.di.b
        public final void a(UpdateApplicationActivity updateApplicationActivity) {
            updateApplicationActivity.f306637m = this.f306641a.h();
            updateApplicationActivity.f306638n = this.f306642b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
