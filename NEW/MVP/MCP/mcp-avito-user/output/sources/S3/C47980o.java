package s3;

import com.avito.android.N2;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: FaqSurveyTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/o;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "_avito-discouraged_avito-feature_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47980o extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N2 f437418a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437419b = "item_faq_sellers";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437420c = true;

    /* compiled from: FaqSurveyTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s3.o$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroupWithNone> f437421a = kotlin.enums.c.a(SimpleTestGroupWithNone.values());
    }

    public C47980o(@Y61.k N2 n22) {
        this.f437418a = n22;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437420c() {
        return this.f437420c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437419b() {
        return this.f437419b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (SimpleTestGroupWithNone[]) ((AbstractC42734a) a.f437421a).toArray(new SimpleTestGroupWithNone[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        N2 n22 = this.f437418a;
        n22.getClass();
        kotlin.reflect.n<Object> nVar = N2.f67352m[6];
        return ((Boolean) n22.f67359h.a().invoke()).booleanValue();
    }
}
