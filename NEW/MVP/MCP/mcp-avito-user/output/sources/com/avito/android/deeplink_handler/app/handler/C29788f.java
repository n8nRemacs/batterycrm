package com.avito.android.deeplink_handler.app.handler;

import Ic.InterfaceC14058a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppVersionLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/f;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/app/handler/e;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_handler.app.handler.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29788f implements dagger.internal.h<C29787e> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f134417d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134418a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Ic.d f134419b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.deeplink_handler.mapping.checker.c> f134420c;

    /* compiled from: AppVersionLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/f$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.app.handler.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29788f(@Y61.k dagger.internal.f fVar, @Y61.k Ic.d dVar, @Y61.k Provider provider) {
        this.f134418a = fVar;
        this.f134419b = dVar;
        this.f134420c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134418a.get();
        InterfaceC14058a interfaceC14058a = (InterfaceC14058a) this.f134419b.get();
        com.avito.android.deeplink_handler.mapping.checker.c cVar = this.f134420c.get();
        f134417d.getClass();
        return new C29787e(aVar, interfaceC14058a, cVar);
    }
}
