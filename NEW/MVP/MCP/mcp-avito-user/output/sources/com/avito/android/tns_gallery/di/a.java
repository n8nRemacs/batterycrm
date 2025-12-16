package com.avito.android.tns_gallery.di;

import android.app.Activity;
import com.avito.android.tns_gallery.di.b;
import com.avito.android.tns_gallery.i;
import com.avito.android.tns_gallery.r;
import com.avito.android.tns_gallery.t;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.u;

/* compiled from: DaggerTnsGalleryComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTnsGalleryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tns_gallery.di.b.a
        public final com.avito.android.tns_gallery.di.b a(Activity activity, r rVar) {
            activity.getClass();
            rVar.getClass();
            return new c(activity, rVar, null);
        }
    }

    /* compiled from: DaggerTnsGalleryComponent.java */
    public static final class c implements com.avito.android.tns_gallery.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f301528a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.tns_gallery.f> f301529b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f301530c;

        public c(Activity activity, r rVar, C9226a c9226a) {
            this.f301528a = l.a(activity);
            l lVarA = l.a(rVar);
            u<com.avito.android.tns_gallery.f> uVarD = g.d(new i(new com.avito.android.tns_gallery.l(this.f301528a, lVarA), new com.avito.android.tns_gallery.e(lVarA)));
            this.f301529b = uVarD;
            this.f301530c = g.d(new d(new e(uVarD)));
        }

        @Override // com.avito.android.tns_gallery.di.b
        public final void a(t tVar) throws BlueprintCollisionException {
            u<com.avito.android.tns_gallery.f> uVar = this.f301529b;
            u<com.avito.konveyor.adapter.a> uVar2 = this.f301530c;
            com.avito.konveyor.adapter.a aVar = uVar2.get();
            com.avito.android.tns_gallery.f fVar = uVar.get();
            int i12 = com.avito.android.tns_gallery.di.c.f301531a;
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(new com.avito.android.tns_gallery.b(fVar));
            tVar.f301562b = new j(aVar, c10493a.a());
            tVar.f301563c = uVar2.get();
            tVar.f301564d = uVar.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
