package com.avito.android.profile_phones.phones_list.actions.di;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.profile_phones.phones_list.actions.PhoneActionsSheetDialogFragment;
import com.avito.android.profile_phones.phones_list.actions.di.b;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPhoneActionsComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerPhoneActionsComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.profile_phones.phones_list.actions.di.c f227479a;

        public b() {
        }

        @Override // com.avito.android.profile_phones.phones_list.actions.di.b.a
        public final b.a a(com.avito.android.profile_phones.phones_list.actions.di.c cVar) {
            this.f227479a = cVar;
            return this;
        }

        @Override // com.avito.android.profile_phones.phones_list.actions.di.b.a
        public final com.avito.android.profile_phones.phones_list.actions.di.b build() {
            t.a(com.avito.android.profile_phones.phones_list.actions.di.c.class, this.f227479a);
            return new c(new d(), this.f227479a, null);
        }
    }

    /* compiled from: DaggerPhoneActionsComponent.java */
    public static final class c implements com.avito.android.profile_phones.phones_list.actions.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile_phones.phones_list.actions.di.c f227480a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.phones_list.actions.items.d> f227481b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.phones_list.actions.items.b> f227482c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f227483d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f227484e;

        /* renamed from: f, reason: collision with root package name */
        public final u<RecyclerView.Adapter<com.avito.konveyor.adapter.b>> f227485f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.phones_list.actions.a> f227486g;

        public c(d dVar, com.avito.android.profile_phones.phones_list.actions.di.c cVar, C6916a c6916a) {
            this.f227480a = cVar;
            u<com.avito.android.profile_phones.phones_list.actions.items.d> uVarD = dagger.internal.g.d(com.avito.android.profile_phones.phones_list.actions.items.g.a());
            this.f227481b = uVarD;
            u<com.avito.android.profile_phones.phones_list.actions.items.b> uVarD2 = dagger.internal.g.d(new e(dVar, uVarD));
            this.f227482c = uVarD2;
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new h(dVar, uVarD2));
            this.f227483d = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new g(dVar, uVarD3));
            this.f227484e = uVarD4;
            this.f227485f = dagger.internal.g.d(new f(dVar, uVarD4, this.f227483d));
            this.f227486g = dagger.internal.g.d(com.avito.android.profile_phones.phones_list.actions.c.a());
        }

        @Override // com.avito.android.profile_phones.phones_list.actions.di.b
        public final void a(PhoneActionsSheetDialogFragment phoneActionsSheetDialogFragment) {
            phoneActionsSheetDialogFragment.f227470h0 = this.f227484e.get();
            phoneActionsSheetDialogFragment.f227471i0 = this.f227485f.get();
            phoneActionsSheetDialogFragment.f227472j0 = this.f227481b.get();
            phoneActionsSheetDialogFragment.f227473k0 = this.f227486g.get();
            InterfaceC35745a5 interfaceC35745a5D = this.f227480a.d();
            t.c(interfaceC35745a5D);
            phoneActionsSheetDialogFragment.f227474l0 = interfaceC35745a5D;
        }
    }

    public static b.a a() {
        return new b();
    }
}
