package s3;

import com.avito.android.C30566f2;
import com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: CrmNotificationCenterBeduinRedesignTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/j;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/CrmNotificationCenterBeduinRedesignTestGroup;", "_avito-discouraged_avito-feature_sbc"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47975j extends AbstractC48780d<CrmNotificationCenterBeduinRedesignTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30566f2 f437403a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437404b = "crm_test_nc_redesign";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437405c = true;

    public C47975j(@Y61.k C30566f2 c30566f2) {
        this.f437403a = c30566f2;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437405c() {
        return this.f437405c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437404b() {
        return this.f437404b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C30566f2 c30566f2 = this.f437403a;
        c30566f2.getClass();
        kotlin.reflect.n<Object> nVar = C30566f2.f155067o[8];
        return d(((OptionSet) c30566f2.f155076j.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (CrmNotificationCenterBeduinRedesignTestGroup[]) ((AbstractC42734a) CrmNotificationCenterBeduinRedesignTestGroup.f67793h).toArray(new CrmNotificationCenterBeduinRedesignTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return CrmNotificationCenterBeduinRedesignTestGroup.f67788c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C30566f2 c30566f2 = this.f437403a;
        c30566f2.getClass();
        kotlin.reflect.n<Object> nVar = C30566f2.f155067o[7];
        return ((Boolean) c30566f2.f155075i.a().invoke()).booleanValue();
    }
}
