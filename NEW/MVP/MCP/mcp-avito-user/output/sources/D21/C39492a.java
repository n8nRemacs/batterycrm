package d21;

import V11.d;
import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickSDKNotificationEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ld21/a;", "LV11/d;", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: d21.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39492a extends d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C11007a f393631e = new C11007a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f393632b;

    /* renamed from: c, reason: collision with root package name */
    public final long f393633c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f393634d;

    /* compiled from: ClickSDKNotificationEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Ld21/a$a;", "", "<init>", "()V", "", "BANNER_ID", "Ljava/lang/String;", "CLICK_ACTION", "EVENT_NAME", "SLOT_ID", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: d21.a$a, reason: collision with other inner class name */
    public static final class C11007a {
        public /* synthetic */ C11007a(C42822w c42822w) {
            this();
        }

        public C11007a() {
        }
    }

    public C39492a(String str, long j12, String str2, C42822w c42822w) {
        super("ClickSDKNotificationEvent");
        this.f393632b = str;
        this.f393633c = j12;
        this.f393634d = str2;
    }

    @Override // V11.d
    @k
    public final Map<String, String> a() {
        Q q12 = new Q("click_action", this.f393632b);
        Q q13 = new Q("slot_id", String.valueOf(this.f393633c));
        String str = this.f393634d;
        if (str == null) {
            str = "";
        }
        return P0.g(q12, q13, new Q("banner_id", str));
    }
}
