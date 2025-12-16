package XK0;

import XK0.g;
import com.avito.android.util.C;
import com.avito.android.util.feature.OptionSet;
import com.avito.android.ux.feedback.impl.n;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoUxFeedbackSettingModule_Declarations_ProvideAvitoUxFeedbackSettingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LXK0/i;", "Ldagger/internal/h;", "Lcom/avito/android/ux/feedback/impl/n;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<com.avito.android.ux.feedback.impl.n> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f18843c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f18844a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VK0.c f18845b;

    /* compiled from: AvitoUxFeedbackSettingModule_Declarations_ProvideAvitoUxFeedbackSettingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXK0/i$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k Provider provider, @Y61.k VK0.c cVar) {
        this.f18844a = provider;
        this.f18845b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f18844a.get();
        VK0.a aVar = (VK0.a) this.f18845b.get();
        f18843c.getClass();
        g.a.f18837a.getClass();
        com.avito.android.ux.feedback.impl.n.f319163c.getClass();
        kotlin.reflect.n<Object> nVar = VK0.a.f17075f[0];
        return L.f(((OptionSet) aVar.f17076b.a().getValue()).f318873b, "prod") ? new n.c(c12, "cksrdd2v100013b5yk5mpdw2f", null) : new n.b(c12, "cksrdcssj00003b5yacbnkv66", null);
    }
}
