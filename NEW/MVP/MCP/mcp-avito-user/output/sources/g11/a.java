package G11;

import Y61.k;
import Y61.l;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKAccessToken.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LG11/a;", "", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C0327a f6195j = new C0327a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final List<String> f6196k = C42745f0.U("access_token", "expires_in", "user_id", "secret", "https_required", "created", "vk_access_token", "email", "phone", "phone_access_key");

    /* renamed from: a, reason: collision with root package name */
    public final int f6197a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6198b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f6199c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6200d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f6201e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f6202f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f6203g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6204h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6205i;

    /* compiled from: VKAccessToken.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"LG11/a$a;", "", "<init>", "()V", "", "ACCESS_TOKEN", "Ljava/lang/String;", "CREATED", "EMAIL", "EXPIRES_IN", "HTTPS_REQUIRED", "PHONE", "PHONE_ACCESS_KEY", "SECRET", "USER_ID", "VK_ACCESS_TOKEN_KEY", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: G11.a$a, reason: collision with other inner class name */
    public static final class C0327a {
        public /* synthetic */ C0327a(C42822w c42822w) {
            this();
        }

        public C0327a() {
        }
    }

    public a(@k HashMap map) {
        String str = (String) map.get("user_id");
        this.f6197a = (str == null ? null : Integer.valueOf(Integer.parseInt(str))).intValue();
        this.f6198b = (String) map.get("access_token");
        this.f6199c = (String) map.get("secret");
        this.f6204h = "1".equals(map.get("https_required"));
        this.f6200d = map.containsKey("created") ? Long.parseLong((String) map.get("created")) : System.currentTimeMillis();
        this.f6205i = map.containsKey("expires_in") ? Long.parseLong((String) map.get("expires_in")) : -1L;
        this.f6201e = map.containsKey("email") ? (String) map.get("email") : null;
        this.f6202f = map.containsKey("phone") ? (String) map.get("phone") : null;
        this.f6203g = map.containsKey("phone_access_key") ? (String) map.get("phone_access_key") : null;
    }

    public final boolean a() {
        long j12 = this.f6205i;
        return j12 <= 0 || (j12 * ((long) 1000)) + this.f6200d > System.currentTimeMillis();
    }
}
