package P3;

import Y61.k;
import com.avito.android.adaptive.image.ab_test.AdaptiveImageLoadingAbTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: AdaptiveImageLoadingAbTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LP3/a;", "Lu3/d;", "Lcom/avito/android/adaptive/image/ab_test/AdaptiveImageLoadingAbTestGroup;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends AbstractC48780d<AdaptiveImageLoadingAbTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f12792a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12793b = "adaptive_image_loading";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12794c;

    public a(@k e eVar) {
        this.f12792a = eVar;
        Owners owners = Owners.f210476d;
        this.f12794c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF12794c() {
        return this.f12794c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF12793b() {
        return this.f12793b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        e eVar = this.f12792a;
        eVar.getClass();
        n<Object> nVar = e.f12801d[0];
        return d(((OptionSet) eVar.f12802b.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (AdaptiveImageLoadingAbTestGroup[]) ((AbstractC42734a) AdaptiveImageLoadingAbTestGroup.f68488f).toArray(new AdaptiveImageLoadingAbTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return AdaptiveImageLoadingAbTestGroup.f68485c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        e eVar = this.f12792a;
        eVar.getClass();
        n<Object> nVar = e.f12801d[1];
        return ((Boolean) eVar.f12803c.a().invoke()).booleanValue();
    }
}
