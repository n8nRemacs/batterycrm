package qN;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import rN.C47569a;

/* compiled from: ImvSimilarAdvertsModule_ProvideItemBinderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LqN/l;", "Ldagger/internal/h;", "Lcom/avito/konveyor/a;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f429257c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C47569a> f429258a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_similiar_adverts.item.header.b f429259b;

    /* compiled from: ImvSimilarAdvertsModule_ProvideItemBinderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqN/l$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k Provider provider, @Y61.k com.avito.android.imv_similiar_adverts.item.header.b bVar) {
        this.f429258a = provider;
        this.f429259b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C47569a c47569a = this.f429258a.get();
        com.avito.android.imv_similiar_adverts.item.header.a aVar = (com.avito.android.imv_similiar_adverts.item.header.a) this.f429259b.get();
        f429257c.getClass();
        e.f429244a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c47569a);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
