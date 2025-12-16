package f90;

import com.avito.android.di.module.C30214v6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileNotificationStateStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lf90/H;", "Ldagger/internal/h;", "Lf90/F;", "a", "_avito_preferences-profile-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H implements dagger.internal.h<F> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f395693b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30214v6 f395694a;

    /* compiled from: ProfileNotificationStateStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf90/H$a;", "", "<init>", "()V", "_avito_preferences-profile-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public H(@Y61.k C30214v6 c30214v6) {
        this.f395694a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f395694a.get();
        f395693b.getClass();
        return new F(lVar);
    }
}
