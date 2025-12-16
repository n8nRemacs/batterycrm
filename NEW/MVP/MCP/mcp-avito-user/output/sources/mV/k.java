package Mv;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorWarningsTrackerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LMv/k;", "Ldagger/internal/h;", "LMv/j;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f11093c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f11094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f11095b;

    /* compiled from: TarifikatorWarningsTrackerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMv/k$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k dagger.internal.f fVar, @Y61.k u uVar) {
        this.f11094a = fVar;
        this.f11095b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f11094a.get();
        InterfaceC14533a interfaceC14533a = (InterfaceC14533a) this.f11095b.get();
        f11093c.getClass();
        return new j(interfaceC28373a, interfaceC14533a);
    }
}
