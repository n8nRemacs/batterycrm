package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.d;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import dagger.internal.A;
import dagger.internal.u;
import java.util.List;
import kotlin.G0;
import wf0.InterfaceC49616a;

/* compiled from: DaggerSleepingPlacesComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class b {

    /* compiled from: DaggerSleepingPlacesComponent.java */
    /* renamed from: com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.b$b, reason: collision with other inner class name */
    public static final class C7343b implements d.a {
        public C7343b() {
        }

        @Override // com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.d.a
        public final d a(String str, Integer num, List<SleepingPlacesBedType> list, Y41.l<? super InterfaceC49616a, G0> lVar, C28478k c28478k, l lVar2) {
            return new c(new f(), lVar2, str, num, list, lVar, c28478k, null);
        }
    }

    /* compiled from: DaggerSleepingPlacesComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f244967a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f244968b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.d f244969c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.i> f244970d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.h f244971e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f244972f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f244973g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.g f244974h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.c f244975i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.subtitle.c f244976j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f244977k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f244978l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f244979m;

        /* compiled from: DaggerSleepingPlacesComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f244980a;

            public a(l lVar) {
                this.f244980a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f244980a.b();
            }
        }

        public c() {
            throw null;
        }

        public c(f fVar, l lVar, String str, Integer num, List list, Y41.l lVar2, C28478k c28478k, a aVar) {
            this.f244967a = dagger.internal.l.b(str);
            this.f244968b = dagger.internal.l.b(num);
            this.f244969c = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.d(this.f244967a, this.f244968b, dagger.internal.l.b(list));
            u<com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.i> uVarD = dagger.internal.g.d(new g(fVar));
            this.f244970d = uVarD;
            this.f244971e = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.h(uVarD);
            this.f244972f = new a(lVar);
            this.f244973g = dagger.internal.g.d(new k(fVar, this.f244972f, dagger.internal.l.a(c28478k)));
            this.f244974h = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.g(new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.e(this.f244969c, com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.b.a(), com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.f.a(), this.f244971e, this.f244973g));
            this.f244975i = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.c(new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.f(dagger.internal.l.a(lVar2)));
            this.f244976j = new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.subtitle.c(com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.subtitle.e.a());
            A.b bVarA = A.a(2, 0);
            com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.c cVar = this.f244975i;
            List<u<T>> list2 = bVarA.f393937a;
            list2.add(cVar);
            list2.add(this.f244976j);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new i(fVar, bVarA.b()));
            this.f244977k = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new h(fVar, uVarD2));
            this.f244978l = uVarD3;
            this.f244979m = dagger.internal.g.d(new j(fVar, uVarD3, this.f244977k));
        }

        @Override // com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.di.d
        public final void a(SleepingPlacesBedTypesDialog sleepingPlacesBedTypesDialog) {
            sleepingPlacesBedTypesDialog.f244930h0 = this.f244974h;
            sleepingPlacesBedTypesDialog.f244932j0 = this.f244979m.get();
            sleepingPlacesBedTypesDialog.f244934l0 = this.f244973g.get();
        }
    }

    public static d.a a() {
        return new C7343b();
    }
}
