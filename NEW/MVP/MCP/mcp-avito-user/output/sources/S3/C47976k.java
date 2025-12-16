package s3;

import com.avito.android.C29640d;
import com.avito.android.ab_tests.configs.CrossFadeOpenAbTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: CrossFadeOpenAbTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/k;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/CrossFadeOpenAbTestGroup;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47976k extends AbstractC48780d<CrossFadeOpenAbTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29640d f437406a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437407b = "advert_opens";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437408c = true;

    public C47976k(@Y61.k C29640d c29640d) {
        this.f437406a = c29640d;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437408c() {
        return this.f437408c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437407b() {
        return this.f437407b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return CrossFadeOpenAbTestGroup.f67797e;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (CrossFadeOpenAbTestGroup[]) ((AbstractC42734a) CrossFadeOpenAbTestGroup.f67799g).toArray(new CrossFadeOpenAbTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return CrossFadeOpenAbTestGroup.f67797e;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C29640d c29640d = this.f437406a;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[48];
        return ((Boolean) c29640d.f132197V.a().invoke()).booleanValue();
    }
}
