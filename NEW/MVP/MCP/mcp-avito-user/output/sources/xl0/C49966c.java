package xl0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoResellerApi_Module_ProvideAutoResellerApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lxl0/c;", "Ldagger/internal/h;", "Lxl0/a;", "a", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xl0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49966c implements h<InterfaceC49964a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f442621b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f442622a;

    /* compiled from: AutoResellerApi_Module_ProvideAutoResellerApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxl0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xl0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49966c(@k f fVar) {
        this.f442622a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f442622a.get();
        f442621b.getClass();
        C49965b.f442620a.getClass();
        InterfaceC49964a interfaceC49964a = (InterfaceC49964a) r02.create(InterfaceC49964a.class);
        t.b(interfaceC49964a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC49964a;
    }
}
