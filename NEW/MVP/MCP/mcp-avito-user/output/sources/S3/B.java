package s3;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.MessengerApicoHistoryTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: MessengerApicoHistoryTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/B;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/MessengerApicoHistoryTestGroup;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B extends AbstractC48780d<MessengerApicoHistoryTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f437312a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437313b = "msg_apico_android_history_v2";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437314c = true;

    public B(@Y61.k C30277e1 c30277e1) {
        this.f437312a = c30277e1;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437314c() {
        return this.f437314c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437313b() {
        return this.f437313b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C30277e1 c30277e1 = this.f437312a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[98];
        return d(((OptionSet) c30277e1.f144984S0.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (MessengerApicoHistoryTestGroup[]) ((AbstractC42734a) MessengerApicoHistoryTestGroup.f67857g).toArray(new MessengerApicoHistoryTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return MessengerApicoHistoryTestGroup.f67853c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        return this.f437312a.v().invoke().booleanValue();
    }
}
