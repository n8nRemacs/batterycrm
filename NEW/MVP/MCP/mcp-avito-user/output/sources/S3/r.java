package s3;

import com.avito.android.C36135w2;
import com.avito.android.ab_tests.configs.GridLayoutWithTwoColumnsAbTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: GridLayoutWithTwoColumnsAbTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/r;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/GridLayoutWithTwoColumnsAbTestGroup;", "_avito-discouraged_avito-feature_serp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r extends AbstractC48780d<GridLayoutWithTwoColumnsAbTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f437428a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437429b = "grid_layout_with_two_columns";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437430c = true;

    public r(@Y61.k C36135w2 c36135w2) {
        this.f437428a = c36135w2;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437430c() {
        return this.f437430c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437429b() {
        return this.f437429b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C36135w2 c36135w2 = this.f437428a;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[18];
        return d(((OptionSet) c36135w2.f327495p.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (GridLayoutWithTwoColumnsAbTestGroup[]) ((AbstractC42734a) GridLayoutWithTwoColumnsAbTestGroup.f67823f).toArray(new GridLayoutWithTwoColumnsAbTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return GridLayoutWithTwoColumnsAbTestGroup.f67820c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C36135w2 c36135w2 = this.f437428a;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[17];
        return ((Boolean) c36135w2.f327494o.a().invoke()).booleanValue();
    }
}
