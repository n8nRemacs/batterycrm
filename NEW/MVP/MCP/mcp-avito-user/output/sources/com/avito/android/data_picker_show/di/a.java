package com.avito.android.data_picker_show.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.data_picker_show.DataPickerArgs;
import com.avito.android.data_picker_show.datapickershow.DataPickerShowFragment;
import com.avito.android.data_picker_show.datapickershow.e;
import com.avito.android.data_picker_show.di.b;
import com.avito.beduin.v2.engine.core.z;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import iu.C42111a;
import mV0.C44020b;

/* compiled from: DaggerDataPickerShowComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerDataPickerShowComponent.java */
    public static final class b implements com.avito.android.data_picker_show.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f132538a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.data_picker_show.di.c f132539b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.data_picker_show.datapickershow.mvi.d f132540c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f132541d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f132542e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.data_picker_show.datapickershow.k f132543f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f132544g = dagger.internal.l.a(new com.avito.android.data_picker_show.datapickershow.i(com.avito.android.data_picker_show.datapickershow.h.a()));

        /* renamed from: h, reason: collision with root package name */
        public final u<z> f132545h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C42111a> f132546i;

        /* compiled from: DaggerDataPickerShowComponent.java */
        /* renamed from: com.avito.android.data_picker_show.di.a$b$a, reason: collision with other inner class name */
        public static final class C3968a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.data_picker_show.di.c f132547a;

            public C3968a(com.avito.android.data_picker_show.di.c cVar) {
                this.f132547a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f132547a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(i iVar, com.avito.android.data_picker_show.di.c cVar, cv.b bVar, C28478k c28478k, DataPickerArgs dataPickerArgs, C3967a c3967a) {
            this.f132538a = bVar;
            this.f132539b = cVar;
            this.f132540c = new com.avito.android.data_picker_show.datapickershow.mvi.d(dagger.internal.l.a(dataPickerArgs));
            this.f132541d = new C3968a(cVar);
            this.f132542e = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f132541d);
            this.f132543f = new com.avito.android.data_picker_show.datapickershow.k(new com.avito.android.data_picker_show.datapickershow.mvi.g(this.f132540c, com.avito.android.data_picker_show.datapickershow.mvi.b.a(), com.avito.android.data_picker_show.datapickershow.mvi.i.a(), com.avito.android.data_picker_show.datapickershow.mvi.l.a(), this.f132542e));
            u<z> uVarD = dagger.internal.g.d(new k(iVar));
            this.f132545h = uVarD;
            this.f132546i = dagger.internal.g.d(new j(iVar, uVarD));
        }

        @Override // com.avito.android.data_picker_show.di.b
        public final void fj(DataPickerShowFragment dataPickerShowFragment) {
            dataPickerShowFragment.f132473h0 = this.f132543f;
            dataPickerShowFragment.f132475j0 = this.f132542e.get();
            com.avito.android.deeplink_handler.view.d dVarC = this.f132538a.c();
            t.c(dVarC);
            dataPickerShowFragment.f132476k0 = dVarC;
            dataPickerShowFragment.f132477l0 = (e.a) this.f132544g.f393949a;
            C44020b c44020bZe = this.f132539b.Ze();
            t.c(c44020bZe);
            dataPickerShowFragment.f132478m0 = c44020bZe;
            dataPickerShowFragment.f132479n0 = this.f132546i.get();
        }
    }

    /* compiled from: DaggerDataPickerShowComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.data_picker_show.di.b.a
        public final com.avito.android.data_picker_show.di.b a(C28478k c28478k, DataPickerArgs dataPickerArgs, com.avito.android.data_picker_show.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(new i(), cVar, interfaceC39417a, c28478k, dataPickerArgs, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
