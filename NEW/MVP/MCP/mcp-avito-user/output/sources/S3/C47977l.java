package s3;

import com.avito.android.I1;
import com.avito.android.ab_tests.configs.DegradeApplicationColdStartTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: DegradeApplicationColdStartTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/l;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/DegradeApplicationColdStartTestGroup;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47977l extends AbstractC48780d<DegradeApplicationColdStartTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I1 f437409a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437410b = "degrade_cold_startup_time";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437411c = true;

    public C47977l(@Y61.k I1 i12) {
        this.f437409a = i12;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437411c() {
        return this.f437411c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437410b() {
        return this.f437410b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        I1 i12 = this.f437409a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[43];
        return d(((OptionSet) i12.f67296R.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return DegradeApplicationColdStartTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return DegradeApplicationColdStartTestGroup.f67801d;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        I1 i12 = this.f437409a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[42];
        return ((Boolean) i12.f67295Q.a().invoke()).booleanValue();
    }
}
