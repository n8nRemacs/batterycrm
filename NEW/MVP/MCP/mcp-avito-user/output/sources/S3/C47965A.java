package s3;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.MessengerApicoGetUsersTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: MessengerApicoGetUsersTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/A;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/MessengerApicoGetUsersTestGroup;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47965A extends AbstractC48780d<MessengerApicoGetUsersTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f437309a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437310b = "msg_apico_android_get_users_v2";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437311c = true;

    public C47965A(@Y61.k C30277e1 c30277e1) {
        this.f437309a = c30277e1;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437311c() {
        return this.f437311c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437310b() {
        return this.f437310b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C30277e1 c30277e1 = this.f437309a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[97];
        return d(((OptionSet) c30277e1.f144982R0.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (MessengerApicoGetUsersTestGroup[]) ((AbstractC42734a) MessengerApicoGetUsersTestGroup.f67851g).toArray(new MessengerApicoGetUsersTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return MessengerApicoGetUsersTestGroup.f67847c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        return this.f437309a.v().invoke().booleanValue();
    }
}
