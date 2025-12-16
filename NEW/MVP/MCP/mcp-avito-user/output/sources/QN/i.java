package qN;

import com.avito.android.serp.adapter.InterfaceC34904z0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvSimilarAdvertsModule_ProvideElementItemConverterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LqN/i;", "Ldagger/internal/h;", "Lcom/avito/android/imv_similiar_adverts/d;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<com.avito.android.imv_similiar_adverts.d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f429250c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34904z0> f429251a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f429252b;

    /* compiled from: ImvSimilarAdvertsModule_ProvideElementItemConverterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqN/i$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k u uVar, @Y61.k Provider provider) {
        this.f429251a = provider;
        this.f429252b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34904z0 interfaceC34904z0 = this.f429251a.get();
        com.avito.android.imv_similiar_adverts.a aVar = (com.avito.android.imv_similiar_adverts.a) this.f429252b.get();
        f429250c.getClass();
        e eVar = e.f429244a;
        return new com.avito.android.imv_similiar_adverts.e(interfaceC34904z0, aVar);
    }
}
