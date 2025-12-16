package om0;

import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RemoteDeviceIdHeaderProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lom0/b;", "Ldagger/internal/h;", "Lom0/a;", "a", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: om0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44822b implements h<C44821a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f420169b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f420170a;

    /* compiled from: RemoteDeviceIdHeaderProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lom0/b$a;", "", "<init>", "()V", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: om0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44822b(@k f fVar) {
        this.f420170a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC44824d interfaceC44824d = (InterfaceC44824d) this.f420170a.get();
        f420169b.getClass();
        return new C44821a(interfaceC44824d);
    }
}
