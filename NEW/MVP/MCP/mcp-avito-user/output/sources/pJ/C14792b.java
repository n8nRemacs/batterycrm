package Pj;

import Rj.C15047a;
import Y61.k;
import com.avito.android.bottom_navigation.ab_tests.configs.AvitoBusiness360NavbarTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: AvitoBusiness360NavbarTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LPj/b;", "Lu3/d;", "Lcom/avito/android/bottom_navigation/ab_tests/configs/AvitoBusiness360NavbarTestGroup;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14792b extends AbstractC48780d<AvitoBusiness360NavbarTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C15047a f13255a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13256b = "navbar_business360_2";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13257c = true;

    public C14792b(@k C15047a c15047a) {
        this.f13255a = c15047a;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF13257c() {
        return this.f13257c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF13256b() {
        return this.f13256b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        C15047a c15047a = this.f13255a;
        c15047a.getClass();
        n<Object> nVar = C15047a.f14573m[4];
        return d(((OptionSet) c15047a.f14578f.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (AvitoBusiness360NavbarTestGroup[]) ((AbstractC42734a) AvitoBusiness360NavbarTestGroup.f106998f).toArray(new AvitoBusiness360NavbarTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return AvitoBusiness360NavbarTestGroup.f106995c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        return true;
    }
}
