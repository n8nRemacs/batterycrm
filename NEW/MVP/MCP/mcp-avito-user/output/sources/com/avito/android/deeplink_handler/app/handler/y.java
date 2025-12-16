package com.avito.android.deeplink_handler.app.handler;

import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DialogLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/y;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/app/handler/x;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f134473d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dv.b f134474a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dv.b f134475b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134476c;

    /* compiled from: DialogLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/y$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public y(@Y61.k dagger.internal.f fVar, @Y61.k dv.b bVar, @Y61.k dv.b bVar2) {
        this.f134474a = bVar;
        this.f134475b = bVar2;
        this.f134476c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.d dVar = (a.d) this.f134474a.get();
        a.f fVar = (a.f) this.f134475b.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134476c.get();
        f134473d.getClass();
        return new x(aVar, dVar, fVar);
    }
}
