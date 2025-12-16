package com.avito.android.deeplink_handler.handler.registry;

import X41.n;
import Y61.k;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.deeplink_handler.app.handler.C29802u;
import com.avito.android.deeplink_handler.app.handler.w;
import com.avito.android.version_conflict.i;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import gv.InterfaceC40741c;
import iv.C42114a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkHandlerRegistryFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/registry/c;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/handler/registry/b;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f134554h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final cv.k f134555a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f134556b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final iv.b f134557c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u f134558d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.version_conflict.k f134559e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final S f134560f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final l f134561g;

    /* compiled from: DeeplinkHandlerRegistryFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/registry/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k cv.k kVar, @k w wVar, @k iv.b bVar, @k u uVar, @k com.avito.android.version_conflict.k kVar2, @k S s5, @k l lVar) {
        this.f134555a = kVar;
        this.f134556b = wVar;
        this.f134557c = bVar;
        this.f134558d = uVar;
        this.f134559e = kVar2;
        this.f134560f = s5;
        this.f134561g = lVar;
    }

    @n
    @k
    public static final c a(@k cv.k kVar, @k w wVar, @k iv.b bVar, @k u uVar, @k com.avito.android.version_conflict.k kVar2, @k S s5, @k l lVar) {
        f134554h.getClass();
        return new c(kVar, wVar, bVar, uVar, kVar2, s5, lVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Map map = (Map) this.f134555a.get();
        this.f134556b.getClass();
        C29802u c29802u = new C29802u();
        this.f134557c.getClass();
        C42114a c42114a = new C42114a();
        com.avito.android.deeplink_events.registry.d dVar = (com.avito.android.deeplink_events.registry.d) this.f134558d.get();
        i iVar = (i) this.f134559e.get();
        P p12 = (P) this.f134560f.get();
        InterfaceC40741c interfaceC40741c = (InterfaceC40741c) this.f134561g.f393949a;
        f134554h.getClass();
        return new b(map, c29802u, c42114a, dVar, iVar, p12, interfaceC40741c);
    }
}
