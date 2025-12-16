package com.avito.android.advert.di;

import com.avito.android.advert.di.InterfaceC27692a;

/* compiled from: DaggerAdvertActivityComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class s0 {

    /* compiled from: DaggerAdvertActivityComponent.java */
    public static final class b implements InterfaceC27692a {
        public b(InterfaceC27693b interfaceC27693b, a aVar) {
        }
    }

    /* compiled from: DaggerAdvertActivityComponent.java */
    public static final class c implements InterfaceC27692a.InterfaceC2165a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC27693b f69462a;

        public c() {
        }

        @Override // com.avito.android.advert.di.InterfaceC27692a.InterfaceC2165a
        public final InterfaceC27692a.InterfaceC2165a a(InterfaceC27693b interfaceC27693b) {
            this.f69462a = interfaceC27693b;
            return this;
        }

        @Override // com.avito.android.advert.di.InterfaceC27692a.InterfaceC2165a
        public final InterfaceC27692a build() {
            dagger.internal.t.a(InterfaceC27693b.class, this.f69462a);
            return new b(this.f69462a, null);
        }
    }

    public static InterfaceC27692a.InterfaceC2165a a() {
        return new c();
    }
}
