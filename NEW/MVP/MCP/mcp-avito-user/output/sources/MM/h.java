package MM;

import Y61.k;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GetImportantAddressesDataUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LMM/h;", "Ldagger/internal/h;", "LMM/g;", "a", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f10658c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<LM.a> f10659a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f10660b;

    /* compiled from: GetImportantAddressesDataUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMM/h$a;", "", "<init>", "()V", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k l lVar, @k Provider provider) {
        this.f10659a = provider;
        this.f10660b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f10659a);
        JM.a aVar = (JM.a) this.f10660b.f393949a;
        f10658c.getClass();
        return new g(eVarB, aVar);
    }
}
