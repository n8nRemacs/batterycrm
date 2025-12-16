package qN;

import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvSimilarAdvertsModule_ProvideAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LqN/f;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/j;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f429245c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f429246a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.konveyor.a> f429247b;

    /* compiled from: ImvSimilarAdvertsModule_ProvideAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqN/f$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k u uVar, @Y61.k Provider provider) {
        this.f429246a = uVar;
        this.f429247b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f429246a.get();
        com.avito.konveyor.a aVar2 = this.f429247b.get();
        f429245c.getClass();
        e.f429244a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
