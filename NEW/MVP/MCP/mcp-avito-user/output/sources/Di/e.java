package DI;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HotelApi_Module_ProvideHotelApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LDI/e;", "Ldagger/internal/h;", "LDI/c;", "a", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements h<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f3143b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f3144a;

    /* compiled from: HotelApi_Module_ProvideHotelApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDI/e$a;", "", "<init>", "()V", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k f fVar) {
        this.f3144a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f3144a.get();
        f3143b.getClass();
        d.f3142a.getClass();
        c cVar = (c) r02.create(c.class);
        t.b(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
