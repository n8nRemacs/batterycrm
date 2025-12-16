package com.avito.android.deeplink_handler.app.handler;

import com.avito.android.deep_linking.links.ConditionChainLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: CommonDeeplinkMappingsModule_ProvideConditionChainMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/j;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_handler.app.handler.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29792j implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f134429b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29800s f134430a;

    /* compiled from: CommonDeeplinkMappingsModule_ProvideConditionChainMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/j$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.app.handler.j$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static C43834a a(@Y61.k C29800s c29800s) {
            C29791i.f134428a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(ConditionChainLink.class, new Yu.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ConditionChainLink.class), c29800s));
        }

        public a() {
        }
    }

    public C29792j(@Y61.k C29800s c29800s) {
        this.f134430a = c29800s;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f134429b.getClass();
        return a.a(this.f134430a);
    }
}
