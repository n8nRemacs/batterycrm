package cU;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinRendererModule_ProvideScreenStyleProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LcU/B;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/theme/k;", "a", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cU.B, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C27096B implements dagger.internal.h<com.avito.beduin.v2.theme.k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f57869b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.theme.all.c f57870a;

    /* compiled from: BeduinRendererModule_ProvideScreenStyleProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcU/B$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cU.B$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27096B(@Y61.k com.avito.android.lib.beduin_v2.theme.all.c cVar) {
        this.f57870a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        GQ0.a aVar = (GQ0.a) this.f57870a.get();
        f57869b.getClass();
        w.f57892a.getClass();
        return aVar.b();
    }
}
