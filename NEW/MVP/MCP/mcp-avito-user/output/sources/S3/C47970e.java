package s3;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: AssistantUxImprovementsSellerTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/e;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/AssistantUxImprovementsSellerTestGroup;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47970e extends AbstractC48780d<AssistantUxImprovementsSellerTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f437391a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437392b = "assistant_ux_improvements_for_seller_back";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437393c = true;

    public C47970e(@Y61.k C30277e1 c30277e1) {
        this.f437391a = c30277e1;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437401c() {
        return this.f437393c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437400b() {
        return this.f437392b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C30277e1 c30277e1 = this.f437391a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[79];
        return d(((OptionSet) c30277e1.f145052z0.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (AssistantUxImprovementsSellerTestGroup[]) ((AbstractC42734a) AssistantUxImprovementsSellerTestGroup.f67777f).toArray(new AssistantUxImprovementsSellerTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return AssistantUxImprovementsSellerTestGroup.f67774c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C30277e1 c30277e1 = this.f437391a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[78];
        return ((Boolean) c30277e1.f145050y0.a().invoke()).booleanValue();
    }
}
