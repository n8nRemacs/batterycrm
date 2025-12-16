package f90;

import com.avito.android.di.module.C30214v6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PrefUserAdvertsInfoStorage_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lf90/A;", "Ldagger/internal/h;", "Lf90/y;", "a", "_avito-discouraged_persistence_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f90.A, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40247A implements dagger.internal.h<y> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f395688b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30214v6 f395689a;

    /* compiled from: PrefUserAdvertsInfoStorage_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf90/A$a;", "", "<init>", "()V", "_avito-discouraged_persistence_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f90.A$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40247A(@Y61.k C30214v6 c30214v6) {
        this.f395689a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f395689a.get();
        f395688b.getClass();
        return new y(lVar);
    }
}
