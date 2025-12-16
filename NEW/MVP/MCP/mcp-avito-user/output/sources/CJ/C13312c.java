package Cj;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartTotalQuantityApi_Module_ProvideCartTotalQuantityApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LCj/c;", "Ldagger/internal/h;", "LCj/a;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cj.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13312c implements h<InterfaceC13310a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f2645b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f2646a;

    /* compiled from: CartTotalQuantityApi_Module_ProvideCartTotalQuantityApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCj/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cj.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13312c(@k f fVar) {
        this.f2646a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f2646a.get();
        f2645b.getClass();
        C13311b.f2644a.getClass();
        InterfaceC13310a interfaceC13310a = (InterfaceC13310a) r02.create(InterfaceC13310a.class);
        t.b(interfaceC13310a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC13310a;
    }
}
