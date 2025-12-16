package XK0;

import XK0.g;
import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoUxFeedbackSettingModule_Declarations_ProvideAvitoUxFeedbackFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LXK0/h;", "Ldagger/internal/h;", "Lcom/avito/android/ux/feedback/impl/b;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<com.avito.android.ux.feedback.impl.b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f18838e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f18839a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f18840b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f18841c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final VK0.c f18842d;

    /* compiled from: AvitoUxFeedbackSettingModule_Declarations_ProvideAvitoUxFeedbackFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXK0/h$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k dagger.internal.l lVar, @Y61.k u uVar, @Y61.k dagger.internal.f fVar, @Y61.k VK0.c cVar) {
        this.f18839a = lVar;
        this.f18840b = uVar;
        this.f18841c = fVar;
        this.f18842d = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f18839a.f393949a;
        h31.e eVarA = dagger.internal.g.a(w.a(this.f18840b));
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f18841c.get();
        VK0.a aVar = (VK0.a) this.f18842d.get();
        f18838e.getClass();
        g.a.f18837a.getClass();
        return new com.avito.android.ux.feedback.impl.b(application, eVarA, interfaceC28373a, aVar);
    }
}
