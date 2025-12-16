package XK0;

import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: UxFeedbackStartCampaignLinkModule_ProvideUxFeedbackStartCampaignLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LXK0/n;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f18850b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WK0.c f18851a;

    /* compiled from: UxFeedbackStartCampaignLinkModule_ProvideUxFeedbackStartCampaignLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXK0/n$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k WK0.c cVar) {
        this.f18851a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WK0.c cVar = this.f18851a;
        f18850b.getClass();
        m.f18849a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UxFeedbackStartCampaignLink.class, new WK0.f(), new C43834a.b.C11809b(cVar));
    }
}
