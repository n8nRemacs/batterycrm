package mv0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesPortfolioApi_Module_ProvideServicesPortfolioApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lmv0/c;", "Ldagger/internal/h;", "Lmv0/a;", "a", "_avito_services-portfolio_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44143c implements h<InterfaceC44141a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414801b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f414802a;

    /* compiled from: ServicesPortfolioApi_Module_ProvideServicesPortfolioApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmv0/c$a;", "", "<init>", "()V", "_avito_services-portfolio_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mv0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44143c(@k f fVar) {
        this.f414802a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414802a.get();
        f414801b.getClass();
        C44142b.f414800a.getClass();
        InterfaceC44141a interfaceC44141a = (InterfaceC44141a) r02.create(InterfaceC44141a.class);
        t.b(interfaceC44141a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC44141a;
    }
}
