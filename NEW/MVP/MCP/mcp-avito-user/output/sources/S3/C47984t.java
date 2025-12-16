package s3;

import com.avito.android.Z0;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: HighlightSalesItemsInFavoritesTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/t;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroup;", "_avito-discouraged_avito-feature_marketplace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47984t extends AbstractC48780d<SimpleTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Z0 f437431a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437432b = "avito_sales_favorites_features";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437433c = true;

    /* compiled from: HighlightSalesItemsInFavoritesTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s3.t$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroup> f437434a = kotlin.enums.c.a(SimpleTestGroup.values());
    }

    public C47984t(@Y61.k Z0 z02) {
        this.f437431a = z02;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437433c() {
        return this.f437433c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437432b() {
        return this.f437432b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return SimpleTestGroup.f67962d;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (SimpleTestGroup[]) ((AbstractC42734a) a.f437434a).toArray(new SimpleTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SimpleTestGroup.f67962d;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        Z0 z02 = this.f437431a;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[12];
        return ((Boolean) z02.f67612o.a().invoke()).booleanValue();
    }
}
