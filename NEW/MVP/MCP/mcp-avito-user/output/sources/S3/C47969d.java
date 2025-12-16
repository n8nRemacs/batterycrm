package s3;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: AssistantUxImprovementsBuyerTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/d;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/AssistantUxImprovementsBuyerTestGroup;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47969d extends AbstractC48780d<AssistantUxImprovementsBuyerTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f437388a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437389b = "assistant_ux_improvements_for_buyer";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437390c = true;

    public C47969d(@Y61.k C30277e1 c30277e1) {
        this.f437388a = c30277e1;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437401c() {
        return this.f437390c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437400b() {
        return this.f437389b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C30277e1 c30277e1 = this.f437388a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[81];
        return d(((OptionSet) c30277e1.f144950B0.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (AssistantUxImprovementsBuyerTestGroup[]) ((AbstractC42734a) AssistantUxImprovementsBuyerTestGroup.f67772g).toArray(new AssistantUxImprovementsBuyerTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return AssistantUxImprovementsBuyerTestGroup.f67768c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C30277e1 c30277e1 = this.f437388a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[80];
        return ((Boolean) c30277e1.f144948A0.a().invoke()).booleanValue();
    }
}
