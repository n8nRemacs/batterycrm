package s3;

import com.avito.android.C29640d;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: ClickToSendSuggestAbTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/i;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47974i extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29640d f437399a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437400b = "click_to_send_suggest";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437401c;

    /* compiled from: ClickToSendSuggestAbTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s3.i$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroupWithNone> f437402a = kotlin.enums.c.a(SimpleTestGroupWithNone.values());
    }

    public C47974i(@Y61.k C29640d c29640d) {
        this.f437399a = c29640d;
        Owners owners = Owners.f210476d;
        this.f437401c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437401c() {
        return this.f437401c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437400b() {
        return this.f437400b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (SimpleTestGroupWithNone[]) ((AbstractC42734a) a.f437402a).toArray(new SimpleTestGroupWithNone[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C29640d c29640d = this.f437399a;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[47];
        return ((Boolean) c29640d.f132196U.a().invoke()).booleanValue();
    }
}
