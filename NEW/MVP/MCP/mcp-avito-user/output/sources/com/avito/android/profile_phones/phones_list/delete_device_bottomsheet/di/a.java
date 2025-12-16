package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.C;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.DeleteDeviceBottomSheetFragment;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.b;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.DeleteDeviceBottomSheetArgument;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.g;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.i;
import com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.k;
import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerDeleteDeviceBottomSheetComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerDeleteDeviceBottomSheetComponent.java */
    public static final class b implements com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<ML.a> f227572a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f227573b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.d f227574c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35741a1> f227575d;

        /* renamed from: e, reason: collision with root package name */
        public final i f227576e;

        /* renamed from: f, reason: collision with root package name */
        public final l f227577f;

        /* renamed from: g, reason: collision with root package name */
        public final C f227578g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f227579h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f227580i;

        /* compiled from: DaggerDeleteDeviceBottomSheetComponent.java */
        /* renamed from: com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.a$b$a, reason: collision with other inner class name */
        public static final class C6919a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c f227581a;

            public C6919a(com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c cVar) {
                this.f227581a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f227581a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerDeleteDeviceBottomSheetComponent.java */
        /* renamed from: com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.a$b$b, reason: collision with other inner class name */
        public static final class C6920b implements u<ML.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c f227582a;

            public C6920b(com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c cVar) {
                this.f227582a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f227582a.Z4();
            }
        }

        /* compiled from: DaggerDeleteDeviceBottomSheetComponent.java */
        public static final class c implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c f227583a;

            public c(com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c cVar) {
                this.f227583a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f227583a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerDeleteDeviceBottomSheetComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c f227584a;

            public d(com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c cVar) {
                this.f227584a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f227584a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c cVar, Fragment fragment, Resources resources, DeleteDeviceBottomSheetArgument deleteDeviceBottomSheetArgument, C28478k c28478k, C6918a c6918a) {
            this.f227574c = new com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.d(new C6920b(cVar), new C6919a(cVar));
            this.f227576e = new i(new c(cVar));
            this.f227577f = l.a(deleteDeviceBottomSheetArgument);
            this.f227578g = new C(new g(this.f227574c, this.f227576e, k.a(), this.f227577f));
            this.f227579h = new d(cVar);
            this.f227580i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f227579h);
        }

        @Override // com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.b
        public final void a(DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment) {
            deleteDeviceBottomSheetFragment.f227519h0 = this.f227578g;
            deleteDeviceBottomSheetFragment.f227521j0 = this.f227580i.get();
        }
    }

    /* compiled from: DaggerDeleteDeviceBottomSheetComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.b.a
        public final com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.b a(DeleteDeviceBottomSheetFragment deleteDeviceBottomSheetFragment, Resources resources, DeleteDeviceBottomSheetArgument deleteDeviceBottomSheetArgument, C28478k c28478k, com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c cVar) {
            deleteDeviceBottomSheetArgument.getClass();
            return new b(cVar, deleteDeviceBottomSheetFragment, resources, deleteDeviceBottomSheetArgument, c28478k, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
