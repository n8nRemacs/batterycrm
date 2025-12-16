package ix;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import kx.C43507a;

/* compiled from: DevelopmentsCatalogAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lix/f;", "Lix/e;", "_avito_developments-catalog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43507a f405400a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f405401b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f405402c;

    @Inject
    public f(@k C43507a c43507a, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f405400a = c43507a;
        this.f405401b = c0Var;
        this.f405402c = interfaceC27642e;
    }

    @Override // ix.e
    @k
    public final u3.f<SimpleTestGroupWithNone> a() {
        return new u3.f<>(this.f405402c.c(new C42125b(this.f405400a)), this.f405401b);
    }
}
