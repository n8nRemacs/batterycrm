package mF;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationApi_Module_ProvideLocationApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LmF/c;", "Ldagger/internal/h;", "LmF/a;", "a", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<InterfaceC43955a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414436b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f414437a;

    /* compiled from: LocationApi_Module_ProvideLocationApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmF/c$a;", "", "<init>", "()V", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f414437a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414437a.get();
        f414436b.getClass();
        C43956b.f414435a.getClass();
        InterfaceC43955a interfaceC43955a = (InterfaceC43955a) r02.create(InterfaceC43955a.class);
        t.b(interfaceC43955a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC43955a;
    }
}
