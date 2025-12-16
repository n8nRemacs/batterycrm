package nW;

import Y61.k;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BackNavigationLocationInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LnW/d;", "Ldagger/internal/h;", "LnW/b;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<C44344b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f415169b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f415170a;

    /* compiled from: BackNavigationLocationInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LnW/d$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k u uVar) {
        this.f415170a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f415170a.get();
        f415169b.getClass();
        return new C44344b(eVar);
    }
}
