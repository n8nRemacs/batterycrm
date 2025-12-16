package Me;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CompositeBrokerAnalyticsImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LMe/k;", "Ldagger/internal/h;", "LMe/j;", "a", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f10952c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC28373a> f10953a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f10954b;

    /* compiled from: CompositeBrokerAnalyticsImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMe/k$a;", "", "<init>", "()V", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider) {
        this.f10953a = provider;
        this.f10954b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f10953a.get();
        String str = (String) this.f10954b.f393949a;
        f10952c.getClass();
        return new j(interfaceC28373a, str);
    }
}
