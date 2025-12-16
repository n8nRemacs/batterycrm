package WK0;

import Y61.k;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UxFeedbackStartCampaignLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LWK0/c;", "Ldagger/internal/h;", "LWK0/a;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<WK0.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f17865c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<SK0.b> f17866a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<g> f17867b;

    /* compiled from: UxFeedbackStartCampaignLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWK0/c$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Provider<SK0.b> provider, @k Provider<g> provider2) {
        this.f17866a = provider;
        this.f17867b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SK0.b bVar = this.f17866a.get();
        g gVar = this.f17867b.get();
        f17865c.getClass();
        return new WK0.a(bVar, gVar);
    }
}
