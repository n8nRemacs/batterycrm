package nD;

import Y61.k;
import com.avito.android.features.auto.ab_tests.configs.AutoMediaMotoWaterTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lD.C43617a;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: AutoMediaMotoWaterTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LnD/e;", "Lu3/d;", "Lcom/avito/android/features/auto/ab_tests/configs/AutoMediaMotoWaterTestGroup;", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends AbstractC48780d<AutoMediaMotoWaterTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43617a f414931a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414932b = "avito_media_item_moto_water";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f414933c;

    public e(@k C43617a c43617a) {
        this.f414931a = c43617a;
        Owners owners = Owners.f210476d;
        this.f414933c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF414933c() {
        return this.f414933c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF414932b() {
        return this.f414932b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return AutoMediaMotoWaterTestGroup.f157650c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (AutoMediaMotoWaterTestGroup[]) ((AbstractC42734a) AutoMediaMotoWaterTestGroup.f157653f).toArray(new AutoMediaMotoWaterTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return AutoMediaMotoWaterTestGroup.f157650c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C43617a c43617a = this.f414931a;
        c43617a.getClass();
        n<Object> nVar = C43617a.f413588V[16];
        return ((Boolean) c43617a.f413626r.a().invoke()).booleanValue();
    }
}
