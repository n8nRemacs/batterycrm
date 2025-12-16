package pW;

import X41.n;
import com.avito.android.location.find.InterfaceC31503a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FindLocationModule_ProvideDefaultLocationInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LpW/h;", "Ldagger/internal/h;", "Lcom/avito/android/location/find/a;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pW.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47017h implements dagger.internal.h<InterfaceC31503a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f428568b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.geo.j> f428569a;

    /* compiled from: FindLocationModule_ProvideDefaultLocationInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpW/h$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pW.h$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47017h(@Y61.k Provider<com.avito.android.geo.j> provider) {
        this.f428569a = provider;
    }

    @n
    @Y61.k
    public static final C47017h a(@Y61.k Provider<com.avito.android.geo.j> provider) {
        f428568b.getClass();
        return new C47017h(provider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.geo.j jVar = this.f428569a.get();
        f428568b.getClass();
        int i12 = C47016g.f428567a;
        return new com.avito.android.location.find.c(jVar);
    }
}
