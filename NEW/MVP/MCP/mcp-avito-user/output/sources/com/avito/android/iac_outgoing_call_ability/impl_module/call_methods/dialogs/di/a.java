package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.b;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce.IacForceCallMethodsDialogFragment;
import com.avito.android.permissions.z;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerIacCallMethodsDialogComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacCallMethodsDialogComponent.java */
    public static final class b implements b.c {
        public b() {
        }

        @Override // com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.b.c
        public final com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.b a(IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment, r rVar, b.InterfaceC4984b interfaceC4984b) {
            return new c(interfaceC4984b, iacForceCallMethodsDialogFragment, rVar, null);
        }
    }

    /* compiled from: DaggerIacCallMethodsDialogComponent.java */
    public static final class c implements com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final b.InterfaceC4984b f168459a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f168460b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f168461c;

        /* compiled from: DaggerIacCallMethodsDialogComponent.java */
        /* renamed from: com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.a$c$a, reason: collision with other inner class name */
        public static final class C4983a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final b.InterfaceC4984b f168462a;

            public C4983a(b.InterfaceC4984b interfaceC4984b) {
                this.f168462a = interfaceC4984b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f168462a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(b.InterfaceC4984b interfaceC4984b, Fragment fragment, r rVar, C4982a c4982a) {
            this.f168459a = interfaceC4984b;
            this.f168460b = new C4983a(interfaceC4984b);
            this.f168461c = g.d(new f(l.a(rVar), this.f168460b));
        }

        @Override // com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.b
        public final void a(IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment) {
            b.InterfaceC4984b interfaceC4984b = this.f168459a;
            z zVarA = interfaceC4984b.A();
            t.c(zVarA);
            iacForceCallMethodsDialogFragment.f168468h0 = zVarA;
            iacForceCallMethodsDialogFragment.f168469i0 = this.f168461c.get();
            iacForceCallMethodsDialogFragment.f168470j0 = interfaceC4984b.h1();
        }
    }

    public static b.c a() {
        return new b();
    }
}
