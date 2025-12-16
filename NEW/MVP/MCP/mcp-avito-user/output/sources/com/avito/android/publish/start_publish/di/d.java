package com.avito.android.publish.start_publish.di;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.publish.start_publish.StartPublishSheet;
import com.avito.android.publish.start_publish.di.i;
import dagger.internal.u;

/* compiled from: DaggerStartPublishSheetComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: DaggerStartPublishSheetComponent.java */
    public static final class b implements i.a {
        public b() {
        }

        @Override // com.avito.android.publish.start_publish.di.i.a
        public final i build() {
            return new c(new j(), null);
        }
    }

    /* compiled from: DaggerStartPublishSheetComponent.java */
    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.publish.start_publish.blueprint.d> f245389a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.publish.start_publish.blueprint.a> f245390b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f245391c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f245392d;

        /* renamed from: e, reason: collision with root package name */
        public final u<RecyclerView.Adapter<?>> f245393e;

        public c(j jVar, a aVar) {
            u<com.avito.android.publish.start_publish.blueprint.d> uVarD = dagger.internal.g.d(com.avito.android.publish.start_publish.blueprint.g.a());
            this.f245389a = uVarD;
            u<com.avito.android.publish.start_publish.blueprint.a> uVarD2 = dagger.internal.g.d(new com.avito.android.publish.start_publish.blueprint.c(uVarD));
            this.f245390b = uVarD2;
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new m(jVar, uVarD2));
            this.f245391c = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new l(jVar, uVarD3));
            this.f245392d = uVarD4;
            this.f245393e = dagger.internal.g.d(new k(jVar, uVarD4, this.f245391c));
        }

        @Override // com.avito.android.publish.start_publish.di.i
        public final void a(StartPublishSheet startPublishSheet) {
            startPublishSheet.f245302H = this.f245393e.get();
            startPublishSheet.f245303I = this.f245392d.get();
            startPublishSheet.f245304J = this.f245389a.get();
        }
    }

    public static i.a a() {
        return new b();
    }
}
