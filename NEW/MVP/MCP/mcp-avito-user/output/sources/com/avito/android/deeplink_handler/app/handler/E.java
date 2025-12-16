package com.avito.android.deeplink_handler.app.handler;

import Ic.InterfaceC14058a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FallbackableLinkPublicHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/E;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/app/handler/D;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f134369d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134370a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Ic.d f134371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.deeplink_handler.mapping.checker.c> f134372c;

    /* compiled from: FallbackableLinkPublicHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/E$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public E(@Y61.k dagger.internal.f fVar, @Y61.k Ic.d dVar, @Y61.k Provider provider) {
        this.f134370a = fVar;
        this.f134371b = dVar;
        this.f134372c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134370a.get();
        InterfaceC14058a interfaceC14058a = (InterfaceC14058a) this.f134371b.get();
        com.avito.android.deeplink_handler.mapping.checker.c cVar = this.f134372c.get();
        f134369d.getClass();
        return new D(aVar, interfaceC14058a, cVar);
    }
}
