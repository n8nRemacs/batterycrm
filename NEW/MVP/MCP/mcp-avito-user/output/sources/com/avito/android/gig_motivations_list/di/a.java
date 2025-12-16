package com.avito.android.gig_motivations_list.di;

import aG.InterfaceC19767a;
import com.avito.android.gig_motivations_list.di.b;
import com.avito.android.gig_motivations_list.ui.MotivationsListActivity;
import com.avito.android.gig_motivations_list.ui.MotivationsListOpenParams;
import com.avito.android.gig_motivations_list.ui.f;
import com.avito.android.gig_motivations_list.ui.mvi.j;
import com.avito.android.gig_motivations_list.ui.mvi.l;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import wH.h;

/* compiled from: DaggerMotivationsListComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerMotivationsListComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.gig_motivations_list.di.b.a
        public final com.avito.android.gig_motivations_list.di.b a(MotivationsListOpenParams motivationsListOpenParams, com.avito.android.gig_motivations_list.di.c cVar, InterfaceC39417a interfaceC39417a) {
            motivationsListOpenParams.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, motivationsListOpenParams, null);
        }
    }

    /* compiled from: DaggerMotivationsListComponent.java */
    public static final class c implements com.avito.android.gig_motivations_list.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC19767a> f160277a;

        /* renamed from: b, reason: collision with root package name */
        public final u<h> f160278b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f160279c;

        /* renamed from: d, reason: collision with root package name */
        public final f f160280d;

        /* compiled from: DaggerMotivationsListComponent.java */
        /* renamed from: com.avito.android.gig_motivations_list.di.a$c$a, reason: collision with other inner class name */
        public static final class C4683a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f160281a;

            public C4683a(cv.b bVar) {
                this.f160281a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f160281a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerMotivationsListComponent.java */
        public static final class b implements u<InterfaceC19767a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_motivations_list.di.c f160282a;

            public b(com.avito.android.gig_motivations_list.di.c cVar) {
                this.f160282a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19767a interfaceC19767aGk = this.f160282a.gk();
                t.c(interfaceC19767aGk);
                return interfaceC19767aGk;
            }
        }

        public c(com.avito.android.gig_motivations_list.di.c cVar, cv.b bVar, MotivationsListOpenParams motivationsListOpenParams, C4682a c4682a) {
            u<h> uVarD = g.d(new e(new b(cVar)));
            this.f160278b = uVarD;
            this.f160280d = new f(new com.avito.android.gig_motivations_list.ui.mvi.h(new com.avito.android.gig_motivations_list.ui.mvi.e(uVarD), new com.avito.android.gig_motivations_list.ui.mvi.c(uVarD, new C4683a(bVar)), j.a(), l.a()));
        }

        @Override // com.avito.android.gig_motivations_list.di.b
        public final void a(MotivationsListActivity motivationsListActivity) {
            motivationsListActivity.f160285m = this.f160280d;
        }
    }

    public static b.a a() {
        return new b();
    }
}
