package EI;

import Y61.k;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lE.C43624b;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: RedesignAdvertHotelOffersTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LEI/c;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroup;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends AbstractC48780d<SimpleTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43624b f3917a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f3918b = "mk_ab_offers_in_itemcard";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3919c = true;

    /* compiled from: RedesignAdvertHotelOffersTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroup> f3920a = kotlin.enums.c.a(SimpleTestGroup.values());
    }

    public c(@k C43624b c43624b) {
        this.f3917a = c43624b;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF3919c() {
        return this.f3919c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF3918b() {
        return this.f3918b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return SimpleTestGroup.f67962d;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (SimpleTestGroup[]) ((AbstractC42734a) a.f3920a).toArray(new SimpleTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return SimpleTestGroup.f67962d;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C43624b c43624b = this.f3917a;
        c43624b.getClass();
        n<Object> nVar = C43624b.f413639o[7];
        return ((Boolean) c43624b.f413647i.a().invoke()).booleanValue();
    }
}
