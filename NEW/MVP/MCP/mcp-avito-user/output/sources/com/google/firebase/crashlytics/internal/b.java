package com.google.firebase.crashlytics.internal;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.h;
import com.google.firebase.crashlytics.internal.model.C;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import wZ0.InterfaceC49583a;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes4.dex */
public final class b implements com.google.firebase.crashlytics.internal.a {

    /* renamed from: c, reason: collision with root package name */
    public static final e f360871c = new C10699b();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC49583a<com.google.firebase.crashlytics.internal.a> f360872a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<com.google.firebase.crashlytics.internal.a> f360873b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* renamed from: com.google.firebase.crashlytics.internal.b$b, reason: collision with other inner class name */
    public static final class C10699b implements e {
        public C10699b() {
        }

        @Override // com.google.firebase.crashlytics.internal.e
        public final CrashlyticsReport.a a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.e
        public final File b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.e
        public final File c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.e
        public final File d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.e
        public final File e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.e
        public final File f() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.e
        public final File g() {
            return null;
        }
    }

    public b(InterfaceC49583a<com.google.firebase.crashlytics.internal.a> interfaceC49583a) {
        this.f360872a = interfaceC49583a;
        interfaceC49583a.a(new com.avito.android.str_seller_orders.orders_seller.d(this, 28));
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public final void a(@N String str, long j12, @N C c12) {
        d.f361031a.a(2);
        this.f360872a.a(new h(str, j12, c12));
    }

    @Override // com.google.firebase.crashlytics.internal.a
    @N
    public final e b(@N String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f360873b.get();
        return aVar == null ? f360871c : aVar.b(str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public final boolean c() {
        com.google.firebase.crashlytics.internal.a aVar = this.f360873b.get();
        return aVar != null && aVar.c();
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public final boolean d(@N String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f360873b.get();
        return aVar != null && aVar.d(str);
    }
}
