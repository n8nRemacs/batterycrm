package XD;

import Y61.k;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: RatingReviewStatusRedesignUserRatingConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LXD/b;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroup;", "_avito-discouraged_avito-feature_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC48780d<SimpleTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final VD.b f18772a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f18773b = "new_obtained_review_view";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18774c = true;

    /* compiled from: RatingReviewStatusRedesignUserRatingConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroup> f18775a = kotlin.enums.c.a(SimpleTestGroup.values());
    }

    public b(@k VD.b bVar) {
        this.f18772a = bVar;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF18774c() {
        return this.f18774c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF18773b() {
        return this.f18773b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        VD.b bVar = this.f18772a;
        bVar.getClass();
        n<Object> nVar = VD.b.f16995i[2];
        return d(((OptionSet) bVar.f16998d.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (SimpleTestGroup[]) ((AbstractC42734a) a.f18775a).toArray(new SimpleTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return SimpleTestGroup.f67962d;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        VD.b bVar = this.f18772a;
        bVar.getClass();
        n<Object> nVar = VD.b.f16995i[1];
        return ((Boolean) bVar.f16997c.a().invoke()).booleanValue();
    }
}
