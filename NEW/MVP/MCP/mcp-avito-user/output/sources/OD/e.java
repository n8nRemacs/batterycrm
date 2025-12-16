package oD;

import com.avito.android.features.auto.ab_tests.configs.AutoMediaMotoWaterTestGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mD.C43948c;
import mD.InterfaceC43946a;

/* compiled from: AutoAbTestsModule_ProvideAutoMediaAbConfigFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LoD/e;", "Ldagger/internal/h;", "Lu3/l;", "Lcom/avito/android/features/auto/ab_tests/configs/AutoMediaMotoWaterTestGroup;", "LX41/o;", "a", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<u3.l<AutoMediaMotoWaterTestGroup>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f419620b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43948c f419621a;

    /* compiled from: AutoAbTestsModule_ProvideAutoMediaAbConfigFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoD/e$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k C43948c c43948c) {
        this.f419621a = c43948c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43946a interfaceC43946a = (InterfaceC43946a) this.f419621a.get();
        f419620b.getClass();
        C44626a.f419613a.getClass();
        return interfaceC43946a.b();
    }
}
