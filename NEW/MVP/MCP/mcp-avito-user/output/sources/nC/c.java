package Nc;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnalyticsCallApi_Module_ProvideAnalyticsCallApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LNc/c;", "Ldagger/internal/h;", "LNc/a;", "a", "_avito_analytics-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements h<InterfaceC14558a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11615b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f11616a;

    /* compiled from: AnalyticsCallApi_Module_ProvideAnalyticsCallApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNc/c$a;", "", "<init>", "()V", "_avito_analytics-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f11616a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11616a.get();
        f11615b.getClass();
        b.f11614a.getClass();
        InterfaceC14558a interfaceC14558a = (InterfaceC14558a) r02.create(InterfaceC14558a.class);
        t.b(interfaceC14558a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14558a;
    }
}
