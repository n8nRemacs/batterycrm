package com.avito.android.profile_phones.phone_action.di;

import com.avito.android.profile_phones.phone_action.PhoneActionFragment;
import com.avito.android.profile_phones.phone_action.PhoneParcelableEntity;
import com.avito.android.profile_phones.phone_action.di.b;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneActionCode;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import sb0.C48149d;
import sb0.InterfaceC48146a;
import sb0.InterfaceC48147b;
import sb0.InterfaceC48150e;
import tb0.InterfaceC48640a;

/* compiled from: DaggerPhoneActionComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerPhoneActionComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.profile_phones.phone_action.di.c f227267a;

        /* renamed from: b, reason: collision with root package name */
        public d f227268b;

        public b() {
        }

        @Override // com.avito.android.profile_phones.phone_action.di.b.a
        public final b.a a(d dVar) {
            this.f227268b = dVar;
            return this;
        }

        @Override // com.avito.android.profile_phones.phone_action.di.b.a
        public final b.a b(com.avito.android.profile_phones.phone_action.di.c cVar) {
            this.f227267a = cVar;
            return this;
        }

        @Override // com.avito.android.profile_phones.phone_action.di.b.a
        public final com.avito.android.profile_phones.phone_action.di.b build() {
            t.a(com.avito.android.profile_phones.phone_action.di.c.class, this.f227267a);
            t.a(d.class, this.f227268b);
            return new c(this.f227268b, this.f227267a, null);
        }
    }

    /* compiled from: DaggerPhoneActionComponent.java */
    public static final class c implements com.avito.android.profile_phones.phone_action.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<String> f227269a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Integer> f227270b;

        /* renamed from: c, reason: collision with root package name */
        public final u<List<PhoneParcelableEntity>> f227271c;

        /* renamed from: d, reason: collision with root package name */
        public final u<PhoneActionCode> f227272d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC48640a> f227273e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC34401z0> f227274f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35745a5> f227275g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC48147b> f227276h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC48150e> f227277i;

        /* renamed from: j, reason: collision with root package name */
        public final u<sb0.h> f227278j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC48146a> f227279k;

        /* compiled from: DaggerPhoneActionComponent.java */
        /* renamed from: com.avito.android.profile_phones.phone_action.di.a$c$a, reason: collision with other inner class name */
        public static final class C6904a implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phone_action.di.c f227280a;

            public C6904a(com.avito.android.profile_phones.phone_action.di.c cVar) {
                this.f227280a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f227280a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerPhoneActionComponent.java */
        public static final class b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phone_action.di.c f227281a;

            public b(com.avito.android.profile_phones.phone_action.di.c cVar) {
                this.f227281a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f227281a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(d dVar, com.avito.android.profile_phones.phone_action.di.c cVar, C6903a c6903a) {
            this.f227269a = dagger.internal.g.d(new e(dVar));
            this.f227270b = dagger.internal.g.d(new g(dVar));
            this.f227271c = dagger.internal.g.d(new j(dVar));
            this.f227272d = dagger.internal.g.d(new f(dVar));
            this.f227273e = dagger.internal.g.d(new i(dVar));
            C6904a c6904a = new C6904a(cVar);
            this.f227274f = c6904a;
            b bVar = new b(cVar);
            this.f227275g = bVar;
            this.f227276h = dagger.internal.g.d(new C48149d(c6904a, bVar));
            this.f227277i = dagger.internal.g.d(new sb0.g(this.f227274f, this.f227275g));
            u<sb0.h> uVarD = dagger.internal.g.d(new sb0.j(this.f227274f, this.f227275g));
            this.f227278j = uVarD;
            this.f227279k = dagger.internal.g.d(new h(dVar, this.f227276h, this.f227277i, uVarD));
        }

        @Override // com.avito.android.profile_phones.phone_action.di.b
        public final void a(PhoneActionFragment phoneActionFragment) {
            String str = this.f227269a.get();
            int iIntValue = this.f227270b.get().intValue();
            List<PhoneParcelableEntity> list = this.f227271c.get();
            phoneActionFragment.f227257t0 = new com.avito.android.profile_phones.phone_action.view_model.b(iIntValue, this.f227272d.get(), str, list, this.f227279k.get(), this.f227273e.get());
        }
    }

    public static b.a a() {
        return new b();
    }
}
