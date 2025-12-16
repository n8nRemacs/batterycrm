package s3;

import com.avito.android.Z0;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: UniversalMapMviTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/X;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "_avito-discouraged_avito-feature_marketplace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Z0 f437374a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437375b = "universal_map_mvi";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437376c = true;

    public X(@Y61.k Z0 z02) {
        this.f437374a = z02;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437376c() {
        return this.f437376c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437375b() {
        return this.f437375b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return SimpleTestGroupWithNone.f67971e;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return SimpleTestGroupWithNone.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        Z0 z02 = this.f437374a;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[5];
        return ((Boolean) z02.f67605h.a().invoke()).booleanValue();
    }
}
