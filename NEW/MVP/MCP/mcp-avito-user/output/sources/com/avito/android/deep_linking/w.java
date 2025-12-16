package com.avito.android.deep_linking;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppShortcutsDeeplinkViewModelImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/w;", "Ldagger/internal/h;", "Lcom/avito/android/deep_linking/v;", "a", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements dagger.internal.h<C29698v> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f134072e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final cv.e f134075c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.deeplink_handler.mapping.checker.c> f134076d;

    /* compiled from: AppShortcutsDeeplinkViewModelImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/w$a;", "", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.f fVar2, @Y61.k cv.e eVar, @Y61.k Provider provider) {
        this.f134073a = fVar;
        this.f134074b = fVar2;
        this.f134075c = eVar;
        this.f134076d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f134073a.get();
        x xVar = (x) this.f134074b.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134075c.get();
        com.avito.android.deeplink_handler.mapping.checker.c cVar = this.f134076d.get();
        f134072e.getClass();
        return new C29698v(interfaceC28373a, xVar, aVar, cVar);
    }
}
