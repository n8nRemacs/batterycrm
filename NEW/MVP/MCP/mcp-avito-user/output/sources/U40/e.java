package u40;

import Y61.k;
import com.avito.android.I1;
import com.avito.android.K1;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import r40.C47487a;

/* compiled from: OfflineModule_InnerCache$_common_offlinization_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu40/e;", "Ldagger/internal/h;", "Lr40/h;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements h<r40.h> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f439779d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C48795d f439780a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.zstd.g f439781b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final K1 f439782c;

    /* compiled from: OfflineModule_InnerCache$_common_offlinization_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/offlinization/di/OfflineModule_InnerCache$_common_offlinization_implFactory.Companion", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k C48795d c48795d, @k com.avito.android.zstd.g gVar, @k K1 k12) {
        this.f439780a = c48795d;
        this.f439781b = gVar;
        this.f439782c = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C47487a c47487a = (C47487a) this.f439780a.get();
        this.f439781b.getClass();
        com.avito.android.zstd.f fVar = new com.avito.android.zstd.f();
        I1 i12 = (I1) this.f439782c.get();
        f439779d.getClass();
        C48792a.f439771a.getClass();
        return new com.avito.android.offlinization.cache.lru.a(c47487a, fVar, i12);
    }
}
