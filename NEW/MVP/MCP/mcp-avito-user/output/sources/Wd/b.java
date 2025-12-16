package WD;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.g;

/* compiled from: RatingAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWD/b;", "LWD/a;", "_avito-discouraged_avito-feature_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final VD.b f17828a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27642e f17829b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f17830c;

    @Inject
    public b(@k VD.b bVar, @k InterfaceC27642e interfaceC27642e, @k c0 c0Var) {
        this.f17828a = bVar;
        this.f17829b = interfaceC27642e;
        this.f17830c = c0Var;
    }

    @Override // WD.a
    @k
    public final g<SimpleTestGroup> a() {
        return new g<>(this.f17829b.c(new XD.c(this.f17828a)), this.f17830c);
    }

    @Override // WD.a
    @k
    public final g<SimpleTestGroup> b() {
        return new g<>(this.f17829b.c(new XD.b(this.f17828a)), this.f17830c);
    }

    @Override // WD.a
    @k
    public final g<SimpleTestGroup> c() {
        return new g<>(this.f17829b.c(new XD.a()), this.f17830c);
    }
}
