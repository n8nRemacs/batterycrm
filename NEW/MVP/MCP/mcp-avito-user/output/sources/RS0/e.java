package rs0;

import Y61.k;
import com.avito.android.util.Kundle;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpElementWidgetStateProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lrs0/e;", "Ldagger/internal/h;", "Lrs0/d;", "a", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f430271b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f430272a;

    /* compiled from: SerpElementWidgetStateProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrs0/e$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k l lVar) {
        this.f430272a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Kundle kundle = (Kundle) this.f430272a.f393949a;
        f430271b.getClass();
        d dVar = new d();
        if (kundle == null) {
            kundle = new Kundle();
        }
        dVar.f430270a = kundle;
        return dVar;
    }
}
