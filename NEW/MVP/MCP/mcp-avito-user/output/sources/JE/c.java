package jE;

import Y61.k;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: ThematicGroupsFavTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LjE/c;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroup;", "_avito-discouraged_avito-feature_soccom"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends AbstractC48780d<SimpleTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final hE.b f405526a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405527b = "feed_sub_auto_fav";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f405528c = true;

    public c(@k hE.b bVar) {
        this.f405526a = bVar;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF20074c() {
        return this.f405528c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF20073b() {
        return this.f405527b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return SimpleTestGroup.f67961c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return SimpleTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return SimpleTestGroup.f67962d;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        hE.b bVar = this.f405526a;
        bVar.getClass();
        n<Object> nVar = hE.b.f397121d[4];
        return ((Boolean) bVar.f397123c.a().invoke()).booleanValue();
    }
}
