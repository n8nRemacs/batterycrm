package com.avito.android.deeplink_handler.app.handler;

import Ic.InterfaceC14058a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MultipleLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/K;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/app/handler/J;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f134387d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134388a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Ic.d f134389b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.deeplink_handler.mapping.checker.c> f134390c;

    /* compiled from: MultipleLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/K$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public K(@Y61.k dagger.internal.f fVar, @Y61.k Ic.d dVar, @Y61.k Provider provider) {
        this.f134388a = fVar;
        this.f134389b = dVar;
        this.f134390c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134388a.get();
        InterfaceC14058a interfaceC14058a = (InterfaceC14058a) this.f134389b.get();
        com.avito.android.deeplink_handler.mapping.checker.c cVar = this.f134390c.get();
        f134387d.getClass();
        return new J(aVar, interfaceC14058a, cVar);
    }
}
