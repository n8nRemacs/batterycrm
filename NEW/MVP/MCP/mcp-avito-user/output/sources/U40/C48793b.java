package u40;

import Y61.k;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OfflineModule_BeduinCacheProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu40/b;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/beduin/e;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48793b implements h<com.avito.android.offlinization.beduin.e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439772b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f439773a;

    /* compiled from: OfflineModule_BeduinCacheProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu40/b$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u40.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48793b(@k u uVar) {
        this.f439773a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.offlinization.beduin.c cVar = (com.avito.android.offlinization.beduin.c) this.f439773a.get();
        f439772b.getClass();
        C48792a.f439771a.getClass();
        com.avito.android.offlinization.beduin.e eVarA = cVar.a();
        t.b(eVarA, "Cannot return null from a non-@Nullable @Provides method");
        return eVarA;
    }
}
