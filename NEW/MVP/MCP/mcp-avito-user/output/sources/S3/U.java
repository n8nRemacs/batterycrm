package s3;

import com.avito.android.C29640d;
import com.avito.android.ab_tests.configs.SparePartsGarageItemCompatV2RenaissanceTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: SparePartsGarageItemCompatV2RenaissanceTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/U;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/SparePartsGarageItemCompatV2RenaissanceTestGroup;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U extends AbstractC48780d<SparePartsGarageItemCompatV2RenaissanceTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29640d f437366a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437367b = "spareparts_compatibilities_block";

    public U(@Y61.k C29640d c29640d) {
        this.f437366a = c29640d;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a */
    public final boolean getF437329c() {
        return false;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437328b() {
        return this.f437367b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C29640d c29640d = this.f437366a;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[35];
        return d(((OptionSet) c29640d.f132184I.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return SparePartsGarageItemCompatV2RenaissanceTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SparePartsGarageItemCompatV2RenaissanceTestGroup.f67924c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        return true;
    }
}
