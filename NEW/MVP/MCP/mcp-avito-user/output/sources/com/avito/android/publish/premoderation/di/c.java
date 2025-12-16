package com.avito.android.publish.premoderation.di;

import com.avito.android.publish.di.InterfaceC33816g;
import com.avito.android.publish.premoderation.AdvertDuplicateFragment;
import com.avito.android.publish.premoderation.di.e;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPublishAdvertDuplicateComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class c {

    /* compiled from: DaggerPublishAdvertDuplicateComponent.java */
    public static final class b implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC33816g f238279a;

        /* renamed from: b, reason: collision with root package name */
        public f f238280b;

        public b() {
        }

        @Override // com.avito.android.publish.premoderation.di.e.a
        public final e.a a(f fVar) {
            this.f238280b = fVar;
            return this;
        }

        @Override // com.avito.android.publish.premoderation.di.e.a
        public final e build() {
            t.a(InterfaceC33816g.class, this.f238279a);
            t.a(f.class, this.f238280b);
            return new C7159c(this.f238280b, this.f238279a, null);
        }

        @Override // com.avito.android.publish.premoderation.di.e.a
        public final e.a d(InterfaceC33816g interfaceC33816g) {
            this.f238279a = interfaceC33816g;
            return this;
        }
    }

    /* compiled from: DaggerPublishAdvertDuplicateComponent.java */
    /* renamed from: com.avito.android.publish.premoderation.di.c$c, reason: collision with other inner class name */
    public static final class C7159c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC35745a5> f238281a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.publish.premoderation.d> f238282b;

        /* compiled from: DaggerPublishAdvertDuplicateComponent.java */
        /* renamed from: com.avito.android.publish.premoderation.di.c$c$a */
        public static final class a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC33816g f238283a;

            public a(InterfaceC33816g interfaceC33816g) {
                this.f238283a = interfaceC33816g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f238283a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public C7159c(f fVar, InterfaceC33816g interfaceC33816g, a aVar) {
            this.f238282b = dagger.internal.g.d(new g(fVar, new a(interfaceC33816g)));
        }

        @Override // com.avito.android.publish.premoderation.di.e
        public final void a(AdvertDuplicateFragment advertDuplicateFragment) {
            advertDuplicateFragment.f238263h0 = this.f238282b.get();
        }
    }

    public static e.a a() {
        return new b();
    }
}
