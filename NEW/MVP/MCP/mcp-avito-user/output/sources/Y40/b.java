package y40;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.offlinization.p;
import com.avito.android.offlinization.r;
import dagger.internal.g;
import dagger.internal.h;
import h31.e;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import r40.f;

/* compiled from: OfflinizationSessionChangedObserver_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ly40/b;", "Ldagger/internal/h;", "Ly40/a;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements h<C50054a> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f442890d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<f> f442891a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r f442892b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dagger.internal.f f442893c;

    /* compiled from: OfflinizationSessionChangedObserver_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly40/b$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k Provider provider, @k r rVar, @k dagger.internal.f fVar) {
        this.f442891a = provider;
        this.f442892b = rVar;
        this.f442893c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVarB = g.b(this.f442891a);
        p pVar = (p) this.f442892b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f442893c.get();
        f442890d.getClass();
        return new C50054a(eVarB, pVar, interfaceC28373a);
    }
}
