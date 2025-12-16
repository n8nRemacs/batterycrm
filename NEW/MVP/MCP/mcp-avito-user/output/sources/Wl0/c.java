package Wl0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertsApi_Module_ProvideUserAdvertsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LWl0/c;", "Ldagger/internal/h;", "LWl0/a;", "a", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements h<InterfaceC15774a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f18031b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f18032a;

    /* compiled from: UserAdvertsApi_Module_ProvideUserAdvertsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWl0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f18032a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f18032a.get();
        f18031b.getClass();
        b.f18030a.getClass();
        InterfaceC15774a interfaceC15774a = (InterfaceC15774a) r02.create(InterfaceC15774a.class);
        t.b(interfaceC15774a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC15774a;
    }
}
