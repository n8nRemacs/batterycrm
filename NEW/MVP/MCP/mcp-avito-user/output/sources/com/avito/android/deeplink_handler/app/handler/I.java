package com.avito.android.deeplink_handler.app.handler;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LogFirebaseEventLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/I;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/app/handler/H;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f134384c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134386b;

    /* compiled from: LogFirebaseEventLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/I$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public I(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.f fVar2) {
        this.f134385a = fVar;
        this.f134386b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f134385a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134386b.get();
        f134384c.getClass();
        return new H(interfaceC28373a, aVar);
    }
}
