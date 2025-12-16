package GD;

import Y61.k;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.enums.c;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: RecsReloadButtonConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LGD/b;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ED.a f6372a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6373b = "recommendations-refresh-button";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6374c;

    /* compiled from: RecsReloadButtonConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroupWithNone> f6375a = c.a(SimpleTestGroupWithNone.values());
    }

    public b(@k ED.a aVar) {
        this.f6372a = aVar;
        Owners owners = Owners.f210476d;
        this.f6374c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF6374c() {
        return this.f6374c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF6373b() {
        return this.f6373b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        ED.a aVar = this.f6372a;
        aVar.getClass();
        n<Object> nVar = ED.a.f3880g[4];
        return d(((OptionSet) aVar.f3885f.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (SimpleTestGroupWithNone[]) ((AbstractC42734a) a.f6375a).toArray(new SimpleTestGroupWithNone[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        ED.a aVar = this.f6372a;
        aVar.getClass();
        n<Object> nVar = ED.a.f3880g[3];
        return ((Boolean) aVar.f3884e.a().invoke()).booleanValue();
    }
}
