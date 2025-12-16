package com.avito.android.service_booking_user_profile.view;

import au0.C24176b;
import com.avito.android.service_booking_user_profile.view.b;
import com.avito.android.service_booking_user_profile.view.mvi.l;
import com.avito.android.service_booking_user_profile.view.mvi.q;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.t;

/* compiled from: DaggerServiceBookingBlockComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerServiceBookingBlockComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerServiceBookingBlockComponent.java */
    public static final class c implements com.avito.android.service_booking_user_profile.view.b {

        /* renamed from: a, reason: collision with root package name */
        public final i f278154a;

        /* renamed from: b, reason: collision with root package name */
        public final g f278155b;

        public c(g gVar, i iVar, C8260a c8260a) {
            this.f278154a = iVar;
            this.f278155b = gVar;
        }

        @Override // com.avito.android.service_booking_user_profile.view.j
        public final l a() {
            g gVar = this.f278155b;
            C24176b c24176bK6 = gVar.K6();
            R0 r0C = gVar.c();
            t.c(r0C);
            com.avito.android.service_booking_user_profile.view.mvi.a aVar = new com.avito.android.service_booking_user_profile.view.mvi.a(new com.avito.android.service_booking_user_profile.view.domain.b(c24176bK6, r0C), gVar.xd());
            InterfaceC35863o4 interfaceC35863o4M = gVar.m();
            t.c(interfaceC35863o4M);
            q qVar = new q(new com.avito.android.service_booking_user_profile.view.item.c(interfaceC35863o4M));
            com.avito.android.service_booking_user_profile.view.mvi.j jVar = new com.avito.android.service_booking_user_profile.view.mvi.j();
            R0 r0C2 = gVar.c();
            t.c(r0C2);
            return new l(this.f278154a, aVar, qVar, jVar, r0C2);
        }
    }
}
