package rD;

import Y61.k;
import com.avito.android.features.autoteka.ab_tests.configs.ChoosingPurchaseTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import pD.C46934a;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: AutotekaChoosingPurchaseTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LrD/a;", "Lu3/d;", "Lcom/avito/android/features/autoteka/ab_tests/configs/ChoosingPurchaseTestGroup;", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rD.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47526a extends AbstractC48780d<ChoosingPurchaseTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C46934a f429654a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f429655b = "autoteka_product_selection_button_q4_2025";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f429656c = true;

    public C47526a(@k C46934a c46934a) {
        this.f429654a = c46934a;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF429656c() {
        return this.f429656c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF429655b() {
        return this.f429655b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return ChoosingPurchaseTestGroup.f157655c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (ChoosingPurchaseTestGroup[]) ((AbstractC42734a) ChoosingPurchaseTestGroup.f157659g).toArray(new ChoosingPurchaseTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return ChoosingPurchaseTestGroup.f157655c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C46934a c46934a = this.f429654a;
        c46934a.getClass();
        n<Object> nVar = C46934a.f428271c[0];
        return ((Boolean) c46934a.f428272b.a().invoke()).booleanValue();
    }
}
