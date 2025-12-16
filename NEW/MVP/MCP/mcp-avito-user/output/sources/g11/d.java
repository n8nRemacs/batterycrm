package G11;

import X41.j;
import Y61.k;
import com.vk.api.sdk.auth.VKScope;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKAuthParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LG11/d;", "", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f6207d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f6208a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6209b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HashSet f6210c;

    /* compiled from: VKAuthParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"LG11/d$a;", "", "<init>", "()V", "", "DEFAULT_REDIRECT_URL", "Ljava/lang/String;", "VK_APP_ID_KEY", "VK_APP_REDIRECT_URL_KEY", "VK_APP_SCOPE_KEY", "VK_EXTRA_CLIENT_ID", "VK_EXTRA_REDIRECT_URL", "VK_EXTRA_REVOKE", "VK_EXTRA_SCOPE", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @j
    public d(int i12, @k String str, @k Collection<? extends VKScope> collection) {
        this.f6208a = i12;
        this.f6209b = str;
        if (i12 == 0) {
            throw new IllegalStateException("AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token");
        }
        this.f6210c = new HashSet(collection);
    }

    public d(int i12, String str, Collection collection, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? "https://oauth.vk.com/blank.html" : str, (i13 & 4) != 0 ? B0.f406639b : collection);
    }
}
