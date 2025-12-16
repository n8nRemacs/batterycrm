package d21;

import V11.d;
import Y61.k;
import com.vk.push.common.messaging.NotificationResourceType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: ShowNotificationBySDKEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ld21/c;", "LV11/d;", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends d {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f393639g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.vk.push.common.messaging.a f393640b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NotificationResourceType f393641c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NotificationResourceType f393642d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final NotificationResourceType f393643e;

    /* renamed from: f, reason: collision with root package name */
    public final long f393644f;

    /* compiled from: ShowNotificationBySDKEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Ld21/c$a;", "", "<init>", "()V", "", "CHANNEL_TYPE", "Ljava/lang/String;", "COLOR_TYPE", "EVENT_NAME", "HAS_BODY", "HAS_CLICK_ACTION", "HAS_IMAGE", "ICON_TYPE", "SLOT_ID", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(com.vk.push.common.messaging.a aVar, NotificationResourceType notificationResourceType, NotificationResourceType notificationResourceType2, NotificationResourceType notificationResourceType3, long j12, C42822w c42822w) {
        super("PushMessageShowsByVkpnsSDK");
        this.f393640b = aVar;
        this.f393641c = notificationResourceType;
        this.f393642d = notificationResourceType2;
        this.f393643e = notificationResourceType3;
        this.f393644f = j12;
    }

    @Override // V11.d
    @k
    public final Map<String, String> a() {
        com.vk.push.common.messaging.a aVar = this.f393640b;
        String str = aVar.f366996b;
        boolean z12 = !(str == null || C43066x.K(str));
        String str2 = aVar.f366999e;
        boolean z13 = !(str2 == null || C43066x.K(str2));
        String str3 = aVar.f367001g;
        return P0.g(new Q("has_body", String.valueOf(z12)), new Q("has_image", String.valueOf(z13)), new Q("has_click_action", String.valueOf(!(str3 == null || C43066x.K(str3)))), new Q("icon_type", this.f393641c.toString()), new Q("color_type", this.f393642d.toString()), new Q("channel_type", this.f393643e.toString()), new Q("slot_id", String.valueOf(this.f393644f)));
    }
}
