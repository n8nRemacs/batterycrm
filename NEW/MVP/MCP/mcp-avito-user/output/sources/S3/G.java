package s3;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.MessengerQuickRepliesWithTitleTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: MessengerQuickRepliesWithTitleTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/G;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/MessengerQuickRepliesWithTitleTestGroup;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class G extends AbstractC48780d<MessengerQuickRepliesWithTitleTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f437327a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437328b = "msg_quick_replies_with_title";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437329c = true;

    public G(@Y61.k C30277e1 c30277e1) {
        this.f437327a = c30277e1;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437329c() {
        return this.f437329c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437367b() {
        return this.f437328b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C30277e1 c30277e1 = this.f437327a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[54];
        return d(((OptionSet) c30277e1.f145002b0.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return MessengerQuickRepliesWithTitleTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return MessengerQuickRepliesWithTitleTestGroup.f67876c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C30277e1 c30277e1 = this.f437327a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[53];
        return ((Boolean) c30277e1.f144999a0.a().invoke()).booleanValue();
    }
}
