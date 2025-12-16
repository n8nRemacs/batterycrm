package s3;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.MessengerApicoSendTextMessageTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: MessengerApicoSendTextMessageTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/D;", "Lu3/d;", "Lcom/avito/android/ab_tests/configs/MessengerApicoSendTextMessageTestGroup;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class D extends AbstractC48780d<MessengerApicoSendTextMessageTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f437318a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437319b = "msg_apico_android_send_text_message_v2";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437320c = true;

    public D(@Y61.k C30277e1 c30277e1) {
        this.f437318a = c30277e1;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437387c() {
        return this.f437320c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437386b() {
        return this.f437319b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C30277e1 c30277e1 = this.f437318a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[99];
        return d(((OptionSet) c30277e1.f144986T0.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (MessengerApicoSendTextMessageTestGroup[]) ((AbstractC42734a) MessengerApicoSendTextMessageTestGroup.f67869g).toArray(new MessengerApicoSendTextMessageTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return MessengerApicoSendTextMessageTestGroup.f67865c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        return this.f437318a.v().invoke().booleanValue();
    }
}
