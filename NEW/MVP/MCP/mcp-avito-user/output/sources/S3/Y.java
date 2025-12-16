package s3;

import com.avito.android.ab_tests.configs.ZstdTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: ZstdTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ls3/Y;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/ZstdTestGroup;", "<init>", "()V", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y extends AbstractC48780d<ZstdTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f437377a = "add_zstd";

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437378b = true;

    public Y() {
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437378b() {
        return this.f437378b;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437377a() {
        return this.f437377a;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return ZstdTestGroup.f67935c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (ZstdTestGroup[]) ((AbstractC42734a) ZstdTestGroup.f67938f).toArray(new ZstdTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return ZstdTestGroup.f67935c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        return true;
    }
}
