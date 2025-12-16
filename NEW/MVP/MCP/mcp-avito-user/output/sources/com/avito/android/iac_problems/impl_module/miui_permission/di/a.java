package com.avito.android.iac_problems.impl_module.miui_permission.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_problems.impl_module.miui_permission.IacMiuiPermissionBottomSheetFragment;
import com.avito.android.iac_problems.impl_module.miui_permission.di.b;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerIacMiuiPermissionBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacMiuiPermissionBottomSheetComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_problems.impl_module.miui_permission.di.b.a
        public final com.avito.android.iac_problems.impl_module.miui_permission.di.b a(IacMiuiPermissionBottomSheetFragment iacMiuiPermissionBottomSheetFragment, r rVar, com.avito.android.iac_problems.impl_module.miui_permission.di.c cVar) {
            return new c(cVar, iacMiuiPermissionBottomSheetFragment, rVar, null);
        }
    }

    /* compiled from: DaggerIacMiuiPermissionBottomSheetComponent.java */
    public static final class c implements com.avito.android.iac_problems.impl_module.miui_permission.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f168796a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f168797b;

        /* compiled from: DaggerIacMiuiPermissionBottomSheetComponent.java */
        /* renamed from: com.avito.android.iac_problems.impl_module.miui_permission.di.a$c$a, reason: collision with other inner class name */
        public static final class C4998a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_problems.impl_module.miui_permission.di.c f168798a;

            public C4998a(com.avito.android.iac_problems.impl_module.miui_permission.di.c cVar) {
                this.f168798a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f168798a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.iac_problems.impl_module.miui_permission.di.c cVar, Fragment fragment, r rVar, C4997a c4997a) {
            this.f168796a = new C4998a(cVar);
            this.f168797b = g.d(new f(l.a(rVar), this.f168796a));
        }

        @Override // com.avito.android.iac_problems.impl_module.miui_permission.di.b
        public final void a(IacMiuiPermissionBottomSheetFragment iacMiuiPermissionBottomSheetFragment) {
            iacMiuiPermissionBottomSheetFragment.f168780h0 = this.f168797b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
