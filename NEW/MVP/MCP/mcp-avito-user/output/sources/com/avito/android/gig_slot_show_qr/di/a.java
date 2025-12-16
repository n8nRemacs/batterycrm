package com.avito.android.gig_slot_show_qr.di;

import com.avito.android.gig_slot_show_qr.di.b;
import com.avito.android.gig_slot_show_qr.mvi.h;
import com.avito.android.gig_slot_show_qr.mvi.n;
import com.avito.android.gig_slot_show_qr.mvi.q;
import com.avito.android.gig_slot_show_qr.ui.GigSlotShowQrFragment;
import com.avito.android.gig_slot_show_qr.ui.models.GigSlotShowQrOpenParams;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerGigSlotShowQrComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerGigSlotShowQrComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.gig_slot_show_qr.di.b.a
        public final com.avito.android.gig_slot_show_qr.di.b a(GigSlotShowQrOpenParams gigSlotShowQrOpenParams, com.avito.android.gig_slot_show_qr.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, gigSlotShowQrOpenParams, null);
        }
    }

    /* compiled from: DaggerGigSlotShowQrComponent.java */
    public static final class c implements com.avito.android.gig_slot_show_qr.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<OG.a> f160869a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.gig_slot_show_qr.domain.b f160870b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f160871c;

        /* renamed from: d, reason: collision with root package name */
        public final q f160872d;

        /* compiled from: DaggerGigSlotShowQrComponent.java */
        /* renamed from: com.avito.android.gig_slot_show_qr.di.a$c$a, reason: collision with other inner class name */
        public static final class C4706a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f160873a;

            public C4706a(cv.b bVar) {
                this.f160873a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f160873a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerGigSlotShowQrComponent.java */
        public static final class b implements u<OG.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_slot_show_qr.di.c f160874a;

            public b(com.avito.android.gig_slot_show_qr.di.c cVar) {
                this.f160874a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                OG.a aVarD9 = this.f160874a.D9();
                t.c(aVarD9);
                return aVarD9;
            }
        }

        public c(com.avito.android.gig_slot_show_qr.di.c cVar, cv.b bVar, GigSlotShowQrOpenParams gigSlotShowQrOpenParams, C4705a c4705a) {
            this.f160870b = new com.avito.android.gig_slot_show_qr.domain.b(new b(cVar));
            l lVarA = l.a(gigSlotShowQrOpenParams);
            com.avito.android.gig_slot_show_qr.domain.b bVar2 = this.f160870b;
            this.f160872d = new q(new h(new com.avito.android.gig_slot_show_qr.mvi.c(bVar2, lVarA), new com.avito.android.gig_slot_show_qr.mvi.l(new C4706a(bVar)), new com.avito.android.gig_slot_show_qr.mvi.e(bVar2, lVarA), n.a()));
        }

        @Override // com.avito.android.gig_slot_show_qr.di.b
        public final void a(GigSlotShowQrFragment gigSlotShowQrFragment) {
            gigSlotShowQrFragment.f160923n0 = this.f160872d;
        }
    }

    public static b.a a() {
        return new b();
    }
}
