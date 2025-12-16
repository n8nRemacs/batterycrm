package com.avito.android.services_realty_sheet.link;

import Y61.k;
import com.avito.android.B2;
import com.avito.android.D2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import tv0.C48729c;
import tv0.InterfaceC48727a;

/* compiled from: ServicesRealtySheetLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_realty_sheet/link/f;", "Ldagger/internal/h;", "Lcom/avito/android/services_realty_sheet/link/e;", "a", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f280435f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f280436a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dagger.internal.f f280437b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final D2 f280438c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C48729c f280439d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final dagger.internal.f f280440e;

    /* compiled from: ServicesRealtySheetLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_realty_sheet/link/f$a;", "", "<init>", "()V", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k dv.b bVar, @k dagger.internal.f fVar, @k D2 d22, @k C48729c c48729c, @k dagger.internal.f fVar2) {
        this.f280436a = bVar;
        this.f280437b = fVar;
        this.f280438c = d22;
        this.f280439d = c48729c;
        this.f280440e = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.d dVar = (a.d) this.f280436a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f280437b.get();
        B2 b22 = (B2) this.f280438c.get();
        InterfaceC48727a interfaceC48727a = (InterfaceC48727a) this.f280439d.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f280440e.get();
        f280435f.getClass();
        return new e(dVar, aVar, b22, interfaceC48727a, interfaceC28373a);
    }
}
