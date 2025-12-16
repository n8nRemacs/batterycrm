package com.avito.android.str_calendar.seller.core.di;

import com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment;
import com.avito.android.str_calendar.seller.core.di.b;
import com.avito.android.str_calendar.seller.core.f;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerStrSellerCalendarCoreComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrSellerCalendarCoreComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_calendar.seller.core.di.b.a
        public final com.avito.android.str_calendar.seller.core.di.b a(e eVar) {
            return new c(eVar, null);
        }
    }

    /* compiled from: DaggerStrSellerCalendarCoreComponent.java */
    public static final class c implements com.avito.android.str_calendar.seller.core.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final e f287824a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.core.c> f287825b = g.d(f.a());

        public c(e eVar, C8644a c8644a) {
            this.f287824a = eVar;
        }

        @Override // com.avito.android.str_calendar.seller.core.di.b
        public final void Bf(StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment) {
            strSellerCalendarCoreDialogFragment.f287778i0 = this.f287825b.get();
            SK0.b bVarP = this.f287824a.p();
            t.c(bVarP);
            strSellerCalendarCoreDialogFragment.f287779j0 = bVarP;
        }

        @Override // com.avito.android.str_calendar.seller.core.di.c
        public final com.avito.android.str_calendar.seller.core.c zb() {
            return this.f287825b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
