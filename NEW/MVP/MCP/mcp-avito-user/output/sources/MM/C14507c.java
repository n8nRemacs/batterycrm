package Mm;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartBundlesApi_Module_ProvideCartBundlesApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LMm/c;", "Ldagger/internal/h;", "LMm/a;", "a", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14507c implements h<InterfaceC14505a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11010b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f11011a;

    /* compiled from: CartBundlesApi_Module_ProvideCartBundlesApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMm/c$a;", "", "<init>", "()V", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mm.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14507c(@k f fVar) {
        this.f11011a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11011a.get();
        f11010b.getClass();
        C14506b.f11009a.getClass();
        InterfaceC14505a interfaceC14505a = (InterfaceC14505a) r02.create(InterfaceC14505a.class);
        t.b(interfaceC14505a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14505a;
    }
}
