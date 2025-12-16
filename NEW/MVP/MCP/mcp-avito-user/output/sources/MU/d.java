package Mu;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkApi_Module_ProvideDeeplinkApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LMu/d;", "Ldagger/internal/h;", "LMu/b;", "a", "_avito-discouraged_avito-api_deep-linking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements h<InterfaceC14529b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11048b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f11049a;

    /* compiled from: DeeplinkApi_Module_ProvideDeeplinkApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_deep-linking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k f fVar) {
        this.f11049a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11049a.get();
        f11048b.getClass();
        C14530c.f11047a.getClass();
        InterfaceC14529b interfaceC14529b = (InterfaceC14529b) r02.create(InterfaceC14529b.class);
        t.b(interfaceC14529b, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14529b;
    }
}
