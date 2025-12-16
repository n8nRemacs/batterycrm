package Uj0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfigApi_Module_ProvideConfigApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LUj0/c;", "Ldagger/internal/h;", "LUj0/a;", "a", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class c implements h<InterfaceC15529a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f16579b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f16580a;

    /* compiled from: ConfigApi_Module_ProvideConfigApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUj0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f16580a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f16580a.get();
        f16579b.getClass();
        b.f16578a.getClass();
        InterfaceC15529a interfaceC15529a = (InterfaceC15529a) r02.create(InterfaceC15529a.class);
        t.b(interfaceC15529a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC15529a;
    }
}
