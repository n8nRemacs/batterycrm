package tu0;

import Y61.k;
import com.avito.android.geo.j;
import com.avito.android.location.find.InterfaceC31503a;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderMapModule_ProvideDefaultLocationInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ltu0/f;", "Ldagger/internal/h;", "Lcom/avito/android/location/find/a;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tu0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48724f implements h<InterfaceC31503a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439656b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<j> f439657a;

    /* compiled from: ServiceOrderMapModule_ProvideDefaultLocationInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltu0/f$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tu0.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48724f(@k C48721c c48721c, @k Provider<j> provider) {
        this.f439657a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = this.f439657a.get();
        f439656b.getClass();
        return new com.avito.android.location.find.c(jVar);
    }
}
