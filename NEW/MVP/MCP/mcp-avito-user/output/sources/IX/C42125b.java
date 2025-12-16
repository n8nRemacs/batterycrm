package ix;

import Y61.k;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kx.C43507a;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: DevelopmentBeduinV2RedirectAbTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lix/b;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "_avito_developments-catalog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ix.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42125b extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43507a f405393a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405394b = "nd_development_beduin_v2";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f405395c = true;

    /* compiled from: DevelopmentBeduinV2RedirectAbTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ix.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroupWithNone> f405396a = kotlin.enums.c.a(SimpleTestGroupWithNone.values());
    }

    public C42125b(@k C43507a c43507a) {
        this.f405393a = c43507a;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF405395c() {
        return this.f405395c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF405394b() {
        return this.f405394b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (SimpleTestGroupWithNone[]) ((AbstractC42734a) a.f405396a).toArray(new SimpleTestGroupWithNone[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C43507a c43507a = this.f405393a;
        c43507a.getClass();
        n<Object> nVar = C43507a.f413292d[0];
        return ((Boolean) c43507a.f413293b.a().invoke()).booleanValue();
    }
}
