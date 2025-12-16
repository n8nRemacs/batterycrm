package x20;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;
import z20.C50359a;

/* compiled from: MultiMessageSendTestConfig.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx20/e;", "Lu3/d;", "Lcom/avito/android/multi_message_send/ab_test/MultiMessageSendTestGroup;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends AbstractC48780d<MultiMessageSendTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50359a f442138a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442139b = "mass_question_recs";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f442140c = true;

    /* compiled from: MultiMessageSendTestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<MultiMessageSendTestGroup> f442141a = kotlin.enums.c.a(MultiMessageSendTestGroup.values());
    }

    public e(@k C50359a c50359a) {
        this.f442138a = c50359a;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF442140c() {
        return this.f442140c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF442139b() {
        return this.f442139b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return MultiMessageSendTestGroup.f206461c;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (MultiMessageSendTestGroup[]) ((AbstractC42734a) a.f442141a).toArray(new MultiMessageSendTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return MultiMessageSendTestGroup.f206461c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C50359a c50359a = this.f442138a;
        c50359a.getClass();
        n<Object> nVar = C50359a.f443802c[0];
        return ((Boolean) c50359a.f443803b.a().invoke()).booleanValue();
    }
}
