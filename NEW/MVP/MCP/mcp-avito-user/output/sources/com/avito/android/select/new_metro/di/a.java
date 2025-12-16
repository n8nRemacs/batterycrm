package com.avito.android.select.new_metro.di;

import com.avito.android.select.new_metro.di.c;
import dagger.internal.t;

/* compiled from: DaggerSelectMetroActivityComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSelectMetroActivityComponent.java */
    public static final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public d f266145a;

        public b() {
        }

        @Override // com.avito.android.select.new_metro.di.c.a
        public final c.a a(d dVar) {
            this.f266145a = dVar;
            return this;
        }

        @Override // com.avito.android.select.new_metro.di.c.a
        public final com.avito.android.select.new_metro.di.c build() {
            t.a(d.class, this.f266145a);
            return new c(this.f266145a, null);
        }
    }

    /* compiled from: DaggerSelectMetroActivityComponent.java */
    public static final class c implements com.avito.android.select.new_metro.di.c {
        public c(d dVar, C7942a c7942a) {
        }
    }

    public static c.a a() {
        return new b();
    }
}
