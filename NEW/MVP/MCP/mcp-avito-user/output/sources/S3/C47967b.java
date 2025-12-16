package s3;

import com.avito.android.C36135w2;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: AskNotificationAbTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/b;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "_avito-discouraged_avito-feature_serp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47967b extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f437381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437382b = "ask_notifications";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437383c = true;

    /* compiled from: AskNotificationAbTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s3.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroupWithNone> f437384a = kotlin.enums.c.a(SimpleTestGroupWithNone.values());
    }

    public C47967b(@Y61.k C36135w2 c36135w2) {
        this.f437381a = c36135w2;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437383c() {
        return this.f437383c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437382b() {
        return this.f437382b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (SimpleTestGroupWithNone[]) ((AbstractC42734a) a.f437384a).toArray(new SimpleTestGroupWithNone[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C36135w2 c36135w2 = this.f437381a;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[48];
        return ((Boolean) c36135w2.f327476S.a().invoke()).booleanValue();
    }
}
