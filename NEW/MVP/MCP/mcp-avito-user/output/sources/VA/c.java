package Va;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertCollectionSharingAnalyticsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LVa/c;", "Ldagger/internal/h;", "LVa/a;", "a", "_avito_advert-collection-sharing-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements h<C15659a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f17201b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f17202a;

    /* compiled from: AdvertCollectionSharingAnalyticsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVa/c$a;", "", "<init>", "()V", "_avito_advert-collection-sharing-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f17202a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f17202a.get();
        f17201b.getClass();
        return new C15659a(interfaceC28373a);
    }
}
