package com.avito.android.deeplink_handler.app.handler;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LogAdjustEventLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/G;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/app/handler/F;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f134377c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134378a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134379b;

    /* compiled from: LogAdjustEventLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/G$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public G(@Y61.k dagger.internal.f fVar, @Y61.k dagger.internal.f fVar2) {
        this.f134378a = fVar;
        this.f134379b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f134378a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134379b.get();
        f134377c.getClass();
        return new F(interfaceC28373a, aVar);
    }
}
