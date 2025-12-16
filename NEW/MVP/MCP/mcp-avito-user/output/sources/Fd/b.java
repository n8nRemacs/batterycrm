package FD;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.features.home.ab_tests.configs.OpenAppAtTabFromNotificationTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.l;

/* compiled from: HomeAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFD/b;", "LFD/a;", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ED.a f4637a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f4638b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f4639c;

    @Inject
    public b(@k ED.a aVar, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f4637a = aVar;
        this.f4638b = c0Var;
        this.f4639c = interfaceC27642e;
    }

    @Override // FD.a
    @k
    public final l<SimpleTestGroupWithNone> a() {
        return new l<>(this.f4639c.c(new GD.b(this.f4637a)), this.f4638b);
    }

    @k
    public final l<OpenAppAtTabFromNotificationTestGroup> b() {
        return new l<>(this.f4639c.c(new GD.a(this.f4637a)), this.f4638b);
    }
}
