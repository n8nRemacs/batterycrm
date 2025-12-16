package com.avito.android.deeplink_handler.app.handler;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConditionChainLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/s;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/app/handler/r;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_handler.app.handler.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29800s implements dagger.internal.h<r> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f134458b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f134459a;

    /* compiled from: ConditionChainLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/s$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.app.handler.s$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29800s(@Y61.k dagger.internal.f fVar) {
        this.f134459a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134459a.get();
        f134458b.getClass();
        return new r(aVar);
    }
}
