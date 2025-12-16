package eN;

import Y61.k;
import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvGoodsPollModule_ProvideAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LeN/e;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/j;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<j> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f395154c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f395155a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<com.avito.konveyor.a> f395156b;

    /* compiled from: ImvGoodsPollModule_ProvideAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeN/e$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k u uVar, @k Provider provider) {
        this.f395155a = uVar;
        this.f395156b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f395155a.get();
        com.avito.konveyor.a aVar2 = this.f395156b.get();
        f395154c.getClass();
        d.f395153a.getClass();
        return new j(aVar, aVar2);
    }
}
