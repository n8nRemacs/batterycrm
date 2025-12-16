package PL;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30214v6;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MiUiShowOnLockScreenAnalyticInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPL/c;", "Ldagger/internal/h;", "LPL/b;", "a", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f13006d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30214v6 f13007a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<i> f13008b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f13009c;

    /* compiled from: MiUiShowOnLockScreenAnalyticInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPL/c$a;", "", "<init>", "()V", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k C30214v6 c30214v6, @Y61.k Provider provider, @Y61.k dagger.internal.f fVar) {
        this.f13007a = c30214v6;
        this.f13008b = provider;
        this.f13009c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f13007a.get();
        i iVar = this.f13008b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f13009c.get();
        f13006d.getClass();
        return new b(lVar, iVar, interfaceC28373a);
    }
}
