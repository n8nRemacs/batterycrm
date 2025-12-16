package s3;

import com.avito.android.C29640d;
import com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: RiseIcebreakersItemConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/Q;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/RiseIcebreakersItemTestGroup;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Q extends AbstractC48780d<RiseIcebreakersItemTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29640d f437357a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437358b = "rise_icebreakers_item";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437359c = true;

    public Q(@Y61.k C29640d c29640d) {
        this.f437357a = c29640d;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437359c() {
        return this.f437359c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437358b() {
        return this.f437358b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return RiseIcebreakersItemTestGroup.f67920f;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return RiseIcebreakersItemTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return RiseIcebreakersItemTestGroup.f67920f;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C29640d c29640d = this.f437357a;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[31];
        return ((Boolean) c29640d.f132180E.a().invoke()).booleanValue();
    }
}
