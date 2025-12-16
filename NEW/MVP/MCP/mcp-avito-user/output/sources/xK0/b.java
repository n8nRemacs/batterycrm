package XK0;

import android.app.Application;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoUxFeedbackPersistenceModule_BindUxFeedbackStartCampaignStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LXK0/b;", "Ldagger/internal/h;", "LWK0/g;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<WK0.g> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f18830c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f18831a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<AK0.i> f18832b;

    /* compiled from: AvitoUxFeedbackPersistenceModule_BindUxFeedbackStartCampaignStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXK0/b$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider) {
        this.f18831a = lVar;
        this.f18832b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f18831a.f393949a;
        AK0.i iVar = this.f18832b.get();
        f18830c.getClass();
        int i12 = XK0.a.f18829a;
        return new WK0.h(iVar.a(application, "ux_feedback"));
    }
}
