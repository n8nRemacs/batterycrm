package s3;

import com.avito.android.C29640d;
import com.avito.android.ab_tests.configs.MultiItemOutlinedChipsTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: MultiItemOutlinedChipsConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/H;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/MultiItemOutlinedChipsTestGroup;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class H extends AbstractC48780d<MultiItemOutlinedChipsTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29640d f437330a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437331b = "multiitems_card_chips";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437332c;

    public H(@Y61.k C29640d c29640d) {
        this.f437330a = c29640d;
        Owners owners = Owners.f210476d;
        this.f437332c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437332c() {
        return this.f437332c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437331b() {
        return this.f437331b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C29640d c29640d = this.f437330a;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[32];
        return ((Boolean) c29640d.f132181F.a().invoke()).booleanValue() ? MultiItemOutlinedChipsTestGroup.f67883d : MultiItemOutlinedChipsTestGroup.f67882c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (MultiItemOutlinedChipsTestGroup[]) ((AbstractC42734a) MultiItemOutlinedChipsTestGroup.f67885f).toArray(new MultiItemOutlinedChipsTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return MultiItemOutlinedChipsTestGroup.f67882c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C29640d c29640d = this.f437330a;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[32];
        return ((Boolean) c29640d.f132181F.a().invoke()).booleanValue();
    }
}
