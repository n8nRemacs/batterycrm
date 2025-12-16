package com.avito.android.social.di;

import com.avito.android.H0;
import com.avito.android.social.apple.AppleAuthFragment;
import com.avito.android.social.apple.n;
import com.avito.android.social.di.a;
import dagger.internal.t;

/* compiled from: DaggerAppleAuthComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: DaggerAppleAuthComponent.java */
    public static final class b implements com.avito.android.social.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.social.di.b f284330a;

        public b(com.avito.android.social.di.b bVar, a aVar) {
            this.f284330a = bVar;
        }

        @Override // com.avito.android.social.di.a
        public final void a(AppleAuthFragment appleAuthFragment) {
            H0 h0Zm = this.f284330a.zm();
            t.c(h0Zm);
            appleAuthFragment.f284305f0 = new com.avito.android.social.apple.f(h0Zm);
            appleAuthFragment.f284306g0 = new n();
        }
    }

    /* compiled from: DaggerAppleAuthComponent.java */
    public static final class c implements a.InterfaceC8498a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.social.di.b f284331a;

        public c() {
        }

        @Override // com.avito.android.social.di.a.InterfaceC8498a
        public final a.InterfaceC8498a a(com.avito.android.social.di.b bVar) {
            this.f284331a = bVar;
            return this;
        }

        @Override // com.avito.android.social.di.a.InterfaceC8498a
        public final com.avito.android.social.di.a build() {
            t.a(com.avito.android.social.di.b.class, this.f284331a);
            return new b(this.f284331a, null);
        }
    }

    public static a.InterfaceC8498a a() {
        return new c();
    }
}
