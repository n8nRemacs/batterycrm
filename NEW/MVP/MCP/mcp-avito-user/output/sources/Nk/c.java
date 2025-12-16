package nk;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BrandspaceApi_Module_ProvideBrandspaceApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lnk/c;", "Ldagger/internal/h;", "Lnk/a;", "a", "_avito-discouraged_avito-api_brandspace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements h<InterfaceC44436a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f419132b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f419133a;

    /* compiled from: BrandspaceApi_Module_ProvideBrandspaceApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnk/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_brandspace"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f419133a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f419133a.get();
        f419132b.getClass();
        b.f419131a.getClass();
        InterfaceC44436a interfaceC44436a = (InterfaceC44436a) r02.create(InterfaceC44436a.class);
        t.b(interfaceC44436a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC44436a;
    }
}
