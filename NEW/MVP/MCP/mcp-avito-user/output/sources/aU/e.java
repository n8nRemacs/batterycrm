package AU;

import AK0.l;
import Y61.k;
import com.avito.android.di.module.C30214v6;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import zU.C50511a;

/* compiled from: PreferencesPersistentClientModule_ProvideKeyValueStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001b\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LAU/e;", "Ldagger/internal/h;", "LoV0/d;", "", "LX41/o;", "a", "_design-modules_beduin-v2_interactions_repository_common_persistent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements h<oV0.d<String, String>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f343b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30214v6 f344a;

    /* compiled from: PreferencesPersistentClientModule_ProvideKeyValueStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAU/e$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_persistent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k C30214v6 c30214v6) {
        this.f344a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f344a.get();
        f343b.getClass();
        d.f342a.getClass();
        return new C50511a(lVar);
    }
}
