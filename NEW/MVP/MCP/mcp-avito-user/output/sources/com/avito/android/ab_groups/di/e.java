package com.avito.android.ab_groups.di;

import androidx.view.T0;
import com.avito.android.ab_groups.AbExperimentsActivity;
import com.avito.android.ab_groups.di.a;
import com.avito.android.ab_groups.q;
import com.avito.android.ab_groups.w;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import q3.InterfaceC47190b;
import q3.f;

/* compiled from: DaggerAbExperimentsActivityComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class e {

    /* compiled from: DaggerAbExperimentsActivityComponent.java */
    public static final class b implements com.avito.android.ab_groups.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC47190b> f67658a;

        /* renamed from: b, reason: collision with root package name */
        public final u<q> f67659b;

        /* compiled from: DaggerAbExperimentsActivityComponent.java */
        public static final class a implements u<InterfaceC47190b> {

            /* renamed from: a, reason: collision with root package name */
            public final d f67660a;

            public a(d dVar) {
                this.f67660a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC47190b interfaceC47190bAl = this.f67660a.al();
                t.c(interfaceC47190bAl);
                return interfaceC47190bAl;
            }
        }

        public b(com.avito.android.ab_groups.di.b bVar, d dVar, T0 t02, a aVar) {
            this.f67659b = g.d(new com.avito.android.ab_groups.di.c(bVar, l.a(t02), new w(new f(new a(dVar)))));
        }

        @Override // com.avito.android.ab_groups.di.a
        public final void a(AbExperimentsActivity abExperimentsActivity) {
            abExperimentsActivity.f67645m = this.f67659b.get();
        }
    }

    /* compiled from: DaggerAbExperimentsActivityComponent.java */
    public static final class c implements a.InterfaceC2128a {
        public c() {
        }

        @Override // com.avito.android.ab_groups.di.a.InterfaceC2128a
        public final com.avito.android.ab_groups.di.a a(d dVar, AbExperimentsActivity abExperimentsActivity) {
            return new b(new com.avito.android.ab_groups.di.b(), dVar, abExperimentsActivity, null);
        }
    }

    public static a.InterfaceC2128a a() {
        return new c();
    }
}
