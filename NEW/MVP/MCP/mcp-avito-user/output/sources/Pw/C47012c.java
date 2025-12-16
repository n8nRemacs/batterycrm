package pW;

import com.avito.android.location.find.InterfaceC31503a;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FindDetectLocationModule_ProvideDefaultLocationProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LpW/c;", "Ldagger/internal/h;", "Lcom/avito/android/location/find/d;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pW.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47012c implements dagger.internal.h<com.avito.android.location.find.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f428556b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f428557a;

    /* compiled from: FindDetectLocationModule_ProvideDefaultLocationProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpW/c$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pW.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47012c(@Y61.k u uVar) {
        this.f428557a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC31503a interfaceC31503a = (InterfaceC31503a) this.f428557a.get();
        f428556b.getClass();
        int i12 = C47010a.f428553a;
        return new com.avito.android.location.find.e(interfaceC31503a);
    }
}
