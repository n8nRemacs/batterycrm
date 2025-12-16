package GD;

import Y61.k;
import com.avito.android.features.home.ab_tests.configs.OpenAppAtTabFromNotificationTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: OpenAppAtTabFromNotificationConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LGD/a;", "Lu3/d;", "Lcom/avito/android/features/home/ab_tests/configs/OpenAppAtTabFromNotificationTestGroup;", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC48780d<OpenAppAtTabFromNotificationTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ED.a f6369a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6370b = "sellers_redirect_msg";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6371c;

    public a(@k ED.a aVar) {
        this.f6369a = aVar;
        Owners owners = Owners.f210476d;
        this.f6371c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF6371c() {
        return this.f6371c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF6370b() {
        return this.f6370b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return OpenAppAtTabFromNotificationTestGroup.f157663e;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (OpenAppAtTabFromNotificationTestGroup[]) ((AbstractC42734a) OpenAppAtTabFromNotificationTestGroup.f157665g).toArray(new OpenAppAtTabFromNotificationTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return OpenAppAtTabFromNotificationTestGroup.f157663e;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        ED.a aVar = this.f6369a;
        aVar.getClass();
        n<Object> nVar = ED.a.f3880g[2];
        return ((Boolean) aVar.f3883d.a().invoke()).booleanValue();
    }
}
