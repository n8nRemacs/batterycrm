package com.avito.android.player.di;

import com.avito.android.player.di.d;
import dagger.internal.t;

/* compiled from: DaggerPlayerActivityComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerPlayerActivityComponent.java */
    public static final class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public e f220053a;

        public b() {
        }

        @Override // com.avito.android.player.di.d.a
        public final d.a a(e eVar) {
            this.f220053a = eVar;
            return this;
        }

        @Override // com.avito.android.player.di.d.a
        public final d build() {
            t.a(e.class, this.f220053a);
            return new c(this.f220053a, null);
        }
    }

    /* compiled from: DaggerPlayerActivityComponent.java */
    public static final class c implements d {
        public c(e eVar, C6615a c6615a) {
        }
    }

    public static d.a a() {
        return new b();
    }
}
