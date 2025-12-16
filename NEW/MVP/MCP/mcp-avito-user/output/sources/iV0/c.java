package Iv0;

import Y61.k;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesVideoCallDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIv0/c;", "Ldagger/internal/h;", "LIv0/b;", "a", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f8602c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f8603a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.services_video_call.deeplink.service.a> f8604b;

    /* compiled from: ServicesVideoCallDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIv0/c$a;", "", "<init>", "()V", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar, @k Provider provider) {
        this.f8603a = fVar;
        this.f8604b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f8603a.get();
        h31.e eVarB = g.b(this.f8604b);
        f8602c.getClass();
        return new b(aVar, eVarB);
    }
}
