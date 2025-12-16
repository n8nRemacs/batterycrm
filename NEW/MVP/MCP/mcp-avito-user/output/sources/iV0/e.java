package Iv0;

import Y61.k;
import com.avito.android.services_video_call.deeplink.ServicesVideoCallDeepLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ServicesVideoCallModule_ProvideMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIv0/e;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f8606b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f8607a;

    /* compiled from: ServicesVideoCallModule_ProvideMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIv0/e$a;", "", "<init>", "()V", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k c cVar) {
        this.f8607a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f8606b.getClass();
        d.f8605a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServicesVideoCallDeepLink.class, new C14162a(), new C43834a.b.C11809b(this.f8607a));
    }
}
