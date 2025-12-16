package com.avito.android.date_time_picker.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.date_time_picker.TimePickerDialogFragment;
import com.avito.android.date_time_picker.di.b;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTimePickerDialogFragmentComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerTimePickerDialogFragmentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.date_time_picker.di.b.a
        public final com.avito.android.date_time_picker.di.b a(C28478k c28478k, com.avito.android.date_time_picker.di.c cVar) {
            return new c(cVar, c28478k, null);
        }
    }

    /* compiled from: DaggerTimePickerDialogFragmentComponent.java */
    public static final class c implements com.avito.android.date_time_picker.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f132670a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f132671b;

        /* compiled from: DaggerTimePickerDialogFragmentComponent.java */
        /* renamed from: com.avito.android.date_time_picker.di.a$c$a, reason: collision with other inner class name */
        public static final class C3971a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.date_time_picker.di.c f132672a;

            public C3971a(com.avito.android.date_time_picker.di.c cVar) {
                this.f132672a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f132672a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.date_time_picker.di.c cVar, C28478k c28478k, C3970a c3970a) {
            this.f132670a = new C3971a(cVar);
            this.f132671b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f132670a);
        }

        @Override // com.avito.android.date_time_picker.di.b
        public final void a(TimePickerDialogFragment timePickerDialogFragment) {
            timePickerDialogFragment.f132647i0 = this.f132671b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
