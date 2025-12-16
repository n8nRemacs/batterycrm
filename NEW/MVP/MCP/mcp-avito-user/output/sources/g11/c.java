package G11;

import Y61.k;
import Y61.l;
import com.vk.api.sdk.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKAuthManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LG11/c;", "", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f6206a;

    /* compiled from: VKAuthManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"LG11/c$a;", "", "<init>", "()V", "", "VK_APP_AUTH_ACTION", "Ljava/lang/String;", "", "VK_APP_AUTH_CODE", "I", "VK_APP_PACKAGE_ID", "VK_AUTH_ERROR", "VK_EXTRA_TOKEN_DATA", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public c(@k x xVar) {
        this.f6206a = xVar;
    }

    public final void a() {
        G11.a.f6195j.getClass();
        Iterator<T> it = G11.a.f6196k.iterator();
        while (it.hasNext()) {
            this.f6206a.remove((String) it.next());
        }
    }

    @l
    public final G11.a b() {
        G11.a.f6195j.getClass();
        List<String> list = G11.a.f6196k;
        HashMap map = new HashMap(list.size());
        for (String str : list) {
            String str2 = this.f6206a.get(str);
            if (str2 != null) {
                map.put(str, str2);
            }
        }
        if (map.containsKey("access_token") && map.containsKey("user_id")) {
            return new G11.a(map);
        }
        return null;
    }
}
