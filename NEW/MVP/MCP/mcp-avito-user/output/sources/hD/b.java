package HD;

import Y61.k;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import u3.l;

/* compiled from: HomeAbTestsModule_ProvideRecsReloadButtonTestGroupFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LHD/b;", "Ldagger/internal/h;", "Lu3/l;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "LX41/o;", "a", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements h<l<SimpleTestGroupWithNone>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f7004b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FD.c f7005a;

    /* compiled from: HomeAbTestsModule_ProvideRecsReloadButtonTestGroupFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHD/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k FD.c cVar) {
        this.f7005a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FD.a aVar = (FD.a) this.f7005a.get();
        f7004b.getClass();
        HD.a.f7003a.getClass();
        return aVar.a();
    }
}
