package ur;

import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppTypeProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lur/e;", "Ldagger/internal/h;", "Lur/c;", "a", "_avito_config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements h<C49102c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f440310b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.configuration.c f440311a;

    /* compiled from: AppTypeProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lur/e$a;", "", "<init>", "()V", "_avito_config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k com.avito.android.configuration.c cVar) {
        this.f440311a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49100a interfaceC49100a = (InterfaceC49100a) this.f440311a.get();
        f440310b.getClass();
        return new C49102c(interfaceC49100a);
    }
}
