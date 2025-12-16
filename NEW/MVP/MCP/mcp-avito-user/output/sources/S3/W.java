package s3;

import com.avito.android.C29270c0;
import com.avito.android.ab_tests.configs.TabBarRe23TestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: TabBarRe23TestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/W;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/TabBarRe23TestGroup;", "_avito-discouraged_avito-feature_design-system"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class W extends AbstractC48780d<TabBarRe23TestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29270c0 f437371a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437372b = "tab_bar_re23";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437373c = true;

    public W(@Y61.k C29270c0 c29270c0) {
        this.f437371a = c29270c0;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF13674b() {
        return this.f437373c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF13673a() {
        return this.f437372b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return TabBarRe23TestGroup.f67929c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return TabBarRe23TestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return TabBarRe23TestGroup.f67931e;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C29270c0 c29270c0 = this.f437371a;
        c29270c0.getClass();
        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[0];
        return ((Boolean) c29270c0.f113264b.a().invoke()).booleanValue();
    }
}
