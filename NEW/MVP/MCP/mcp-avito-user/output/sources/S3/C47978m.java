package s3;

import com.avito.android.I1;
import com.avito.android.ab_tests.configs.DegradeScrollTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: DegradeScrollTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/m;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/DegradeScrollTestGroup;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47978m extends AbstractC48780d<DegradeScrollTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I1 f437412a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437413b = "degrade_scroll";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437414c = true;

    public C47978m(@Y61.k I1 i12) {
        this.f437412a = i12;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437417c() {
        return this.f437414c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437416b() {
        return this.f437413b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        I1 i12 = this.f437412a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[36];
        return d(((OptionSet) i12.f67289K.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return DegradeScrollTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return DegradeScrollTestGroup.f67806c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        I1 i12 = this.f437412a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[35];
        return ((Boolean) i12.f67288J.a().invoke()).booleanValue();
    }
}
