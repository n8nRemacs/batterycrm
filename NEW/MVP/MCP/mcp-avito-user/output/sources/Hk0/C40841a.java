package hK0;

import Y61.k;
import com.avito.android.ownership.Owners;
import com.avito.android.user_viewed.feature.UserViewedTestGroup;
import gK0.d;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.enums.c;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: UserViewedAbTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LhK0/a;", "Lu3/d;", "Lcom/avito/android/user_viewed/feature/UserViewedTestGroup;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40841a extends AbstractC48780d<UserViewedTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f397174a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f397175b = "fav_search_history_tooltip2";

    /* compiled from: UserViewedAbTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hK0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11252a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<UserViewedTestGroup> f397176a = c.a(UserViewedTestGroup.values());
    }

    public C40841a(@k d dVar) {
        this.f397174a = dVar;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a */
    public final boolean getF437353c() {
        return false;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF397175b() {
        return this.f397175b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return UserViewedTestGroup.f318387c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (UserViewedTestGroup[]) ((AbstractC42734a) C11252a.f397176a).toArray(new UserViewedTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return UserViewedTestGroup.f318387c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        d dVar = this.f397174a;
        dVar.getClass();
        n<Object> nVar = d.f396455c[0];
        return ((Boolean) dVar.f396456b.a().invoke()).booleanValue();
    }
}
