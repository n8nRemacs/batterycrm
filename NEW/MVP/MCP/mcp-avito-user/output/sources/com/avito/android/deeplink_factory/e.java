package com.avito.android.deeplink_factory;

import Y61.k;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: DeeplinkFactoryProxyImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/e;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_factory/c;", "a", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements h<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f134191c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.deeplink_events.registry.d> f134192a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ur.e f134193b;

    /* compiled from: DeeplinkFactoryProxyImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/e$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k Provider provider, @k ur.e eVar) {
        this.f134192a = provider;
        this.f134193b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_events.registry.d dVar = this.f134192a.get();
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f134193b.get();
        f134191c.getClass();
        return new c(dVar, interfaceC49101b);
    }
}
