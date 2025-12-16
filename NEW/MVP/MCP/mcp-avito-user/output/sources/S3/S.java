package s3;

import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: SaveMainTabsStateToViewModelConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/S;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroup;", "_avito-discouraged_avito-feature_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S extends AbstractC48780d<SimpleTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f437360a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437361b = "save_main_tabs_state_to_view_model";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437362c = true;

    public S(@Y61.k com.avito.android.P p12) {
        this.f437360a = p12;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437362c() {
        return this.f437362c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437361b() {
        return this.f437361b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return SimpleTestGroup.f67961c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return SimpleTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SimpleTestGroup.f67962d;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        com.avito.android.P p12 = this.f437360a;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[71];
        return ((Boolean) p12.f67405e0.a().invoke()).booleanValue();
    }
}
