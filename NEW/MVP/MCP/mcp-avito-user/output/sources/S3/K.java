package s3;

import com.avito.android.I1;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: PreloadingPromiseTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/K;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/PreloadingPromiseTestGroup;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K extends AbstractC48780d<PreloadingPromiseTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I1 f437338a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437339b = "add_preloading_promise";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437340c = true;

    public K(@Y61.k I1 i12) {
        this.f437338a = i12;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437340c() {
        return this.f437340c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437339b() {
        return this.f437339b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        I1 i12 = this.f437338a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[45];
        return d(((OptionSet) i12.f67298T.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (PreloadingPromiseTestGroup[]) ((AbstractC42734a) PreloadingPromiseTestGroup.f67896f).toArray(new PreloadingPromiseTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return PreloadingPromiseTestGroup.f67893c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        I1 i12 = this.f437338a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[44];
        return ((Boolean) i12.f67297S.a().invoke()).booleanValue();
    }
}
