package com.avito.android.deeplink_handler.app.handler;

import Yu.C18327a;
import com.avito.android.deep_linking.links.AppVersionDeepLink;
import com.avito.android.deep_linking.links.FallbackableLink;
import com.avito.android.deep_linking.links.FallbackableLinkPublic;
import com.avito.android.deep_linking.links.MultipleLink;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: CommonDeeplinkMappingsModule_ProvideMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/n;", "Ldagger/internal/h;", "", "Llv/a;", "LX41/o;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_handler.app.handler.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29796n implements dagger.internal.h<Set<C43834a>> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f134438f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final K f134439a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f134440b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f134441c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C29788f f134442d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f134443e;

    /* compiled from: CommonDeeplinkMappingsModule_ProvideMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/n$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.app.handler.n$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static Set a(@Y61.k K k12, @Y61.k C c12, @Y61.k E e12, @Y61.k C29788f c29788f, @Y61.k com.avito.android.P p12) {
            C29791i.f134428a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            Yu.o oVar = new Yu.o();
            com.avito.android.deep_linking.links.storage.a aVar = com.avito.android.deep_linking.links.storage.a.f134018a;
            Set setL0 = C42756l.l0(new C43834a[]{new C43834a(MultipleLink.class, oVar, new C43834a.b.C11808a(aVar.a(MultipleLink.class), k12)), new C43834a(FallbackableLink.class, new Yu.k(), new C43834a.b.C11808a(aVar.a(FallbackableLink.class), c12)), new C43834a(FallbackableLinkPublic.class, new Yu.n(), new C43834a.b.C11808a(aVar.a(FallbackableLinkPublic.class), e12)), new C43834a(AppVersionDeepLink.class, new C18327a(p12.f().invoke()), new C43834a.b.C11808a(aVar.a(AppVersionDeepLink.class), c29788f))});
            dagger.internal.t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
            return setL0;
        }

        public a() {
        }
    }

    public C29796n(@Y61.k K k12, @Y61.k C c12, @Y61.k E e12, @Y61.k C29788f c29788f, @Y61.k com.avito.android.S s5) {
        this.f134439a = k12;
        this.f134440b = c12;
        this.f134441c = e12;
        this.f134442d = c29788f;
        this.f134443e = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f134443e.get();
        C29788f c29788f = this.f134442d;
        f134438f.getClass();
        return a.a(this.f134439a, this.f134440b, this.f134441c, c29788f, p12);
    }
}
