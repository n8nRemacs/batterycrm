package com.avito.android.di;

import com.avito.android.di.InterfaceC30269v;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.remote.notification.NotificationService;
import com.avito.android.service.d;

/* compiled from: DaggerNotificationServiceComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.di.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29974k {

    /* compiled from: DaggerNotificationServiceComponent.java */
    /* renamed from: com.avito.android.di.k$b */
    public static final class b implements InterfaceC30269v.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC30270w f143797a;

        /* renamed from: b, reason: collision with root package name */
        public String f143798b;

        /* renamed from: c, reason: collision with root package name */
        public NotificationService f143799c;

        public b() {
        }

        @Override // com.avito.android.di.InterfaceC30269v.a
        public final InterfaceC30269v.a a() {
            this.f143798b = "NotificationService";
            return this;
        }

        @Override // com.avito.android.di.InterfaceC30269v.a
        public final InterfaceC30269v.a b(NotificationService notificationService) {
            this.f143799c = notificationService;
            return this;
        }

        @Override // com.avito.android.di.InterfaceC30269v.a
        public final InterfaceC30269v build() {
            dagger.internal.t.a(InterfaceC30270w.class, this.f143797a);
            dagger.internal.t.a(String.class, this.f143798b);
            dagger.internal.t.a(d.a.class, this.f143799c);
            return new c(this.f143797a, this.f143798b, this.f143799c, null);
        }

        @Override // com.avito.android.di.InterfaceC30269v.a
        public final InterfaceC30269v.a c(InterfaceC30270w interfaceC30270w) {
            this.f143797a = interfaceC30270w;
            return this;
        }
    }

    /* compiled from: DaggerNotificationServiceComponent.java */
    /* renamed from: com.avito.android.di.k$c */
    public static final class c implements InterfaceC30269v {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC30270w f143800a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f143801b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service.d> f143802c;

        public c(InterfaceC30270w interfaceC30270w, String str, d.a aVar, a aVar2) {
            this.f143800a = interfaceC30270w;
            this.f143801b = dagger.internal.l.a(str);
            dagger.internal.l lVarA = dagger.internal.l.a(aVar);
            dagger.internal.l lVar = this.f143801b;
            com.avito.android.service.f.f274016c.getClass();
            this.f143802c = dagger.internal.g.d(new com.avito.android.service.f(lVar, lVarA));
        }

        @Override // com.avito.android.di.InterfaceC30269v
        public final void a(NotificationService notificationService) {
            InterfaceC34350q interfaceC34350qE3 = this.f143800a.E3();
            dagger.internal.t.c(interfaceC34350qE3);
            notificationService.f253967c = interfaceC34350qE3;
            notificationService.f253968d = this.f143802c.get();
        }
    }

    public static InterfaceC30269v.a a() {
        return new b();
    }
}
