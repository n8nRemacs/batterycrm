package nD;

import Y61.k;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lD.C43617a;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: AutoGlowFiltersTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LnD/c;", "Lu3/d;", "Lcom/avito/android/features/auto/ab_tests/configs/AutoGlowFiltersTestGroup;", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nD.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44236c extends AbstractC48780d<AutoGlowFiltersTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43617a f414928a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414929b = "car_navigator";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f414930c;

    public C44236c(@k C43617a c43617a) {
        this.f414928a = c43617a;
        Owners owners = Owners.f210476d;
        this.f414930c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF414933c() {
        return this.f414930c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF414932b() {
        return this.f414929b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return AutoGlowFiltersTestGroup.f157643c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (AutoGlowFiltersTestGroup[]) ((AbstractC42734a) AutoGlowFiltersTestGroup.f157648h).toArray(new AutoGlowFiltersTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return AutoGlowFiltersTestGroup.f157643c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C43617a c43617a = this.f414928a;
        c43617a.getClass();
        n<Object> nVar = C43617a.f413588V[11];
        return ((Boolean) c43617a.f413621m.a().invoke()).booleanValue();
    }
}
