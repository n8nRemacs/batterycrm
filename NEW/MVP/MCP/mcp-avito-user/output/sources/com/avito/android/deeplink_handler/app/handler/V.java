package com.avito.android.deeplink_handler.app.handler;

import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ToastLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/V;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/app/handler/S;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class V implements dagger.internal.h<S> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f134407c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dv.b f134408a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134409b;

    /* compiled from: ToastLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/V$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public V(@Y61.k dagger.internal.f fVar, @Y61.k dv.b bVar) {
        this.f134408a = bVar;
        this.f134409b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.i iVar = (a.i) this.f134408a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134409b.get();
        f134407c.getClass();
        return new S(iVar, aVar);
    }
}
