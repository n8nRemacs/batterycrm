package Oj;

import Pj.C14791a;
import Pj.C14792b;
import Pj.C14793c;
import Rj.C15047a;
import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.bottom_navigation.ab_tests.configs.AvitoBusiness360NavbarTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.l;

/* compiled from: BottomNavigationAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOj/b;", "LOj/a;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC14702a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C15047a f12497a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f12498b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f12499c;

    @Inject
    public b(@k C15047a c15047a, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f12497a = c15047a;
        this.f12498b = c0Var;
        this.f12499c = interfaceC27642e;
    }

    @Override // Oj.InterfaceC14702a
    @k
    public final l<SimpleTestGroupWithNone> a() {
        return new l<>(this.f12499c.c(new C14793c(this.f12497a)), this.f12498b);
    }

    @Override // Oj.InterfaceC14702a
    @k
    public final l<SimpleTestGroupWithNone> b() {
        return new l<>(this.f12499c.c(new C14791a(this.f12497a)), this.f12498b);
    }

    @Override // Oj.InterfaceC14702a
    @k
    public final l<AvitoBusiness360NavbarTestGroup> c() {
        return new l<>(this.f12499c.c(new C14792b(this.f12497a)), this.f12498b);
    }
}
