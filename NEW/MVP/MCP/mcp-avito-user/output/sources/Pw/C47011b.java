package pW;

import com.avito.android.location.find.InterfaceC31503a;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FindDetectLocationModule_ProvideDefaultLocationInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LpW/b;", "Ldagger/internal/h;", "Lcom/avito/android/location/find/a;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pW.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47011b implements dagger.internal.h<InterfaceC31503a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f428554b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f428555a;

    /* compiled from: FindDetectLocationModule_ProvideDefaultLocationInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpW/b$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pW.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47011b(@Y61.k u uVar) {
        this.f428555a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.geo.j jVar = (com.avito.android.geo.j) this.f428555a.get();
        f428554b.getClass();
        int i12 = C47010a.f428553a;
        return new com.avito.android.location.find.c(jVar);
    }
}
