package kb1;

import com.vk.push.common.messaging.RemoteMessage;
import java.util.List;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;

/* loaded from: classes9.dex */
public abstract class s {

    public static final class a extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RemoteMessage f406495a;

        public a(@Y61.k RemoteMessage remoteMessage) {
            this.f406495a = remoteMessage;
        }
    }

    public static final class b extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f406496a;

        public b(@Y61.k String str) {
            this.f406496a = str;
        }
    }

    public static final class c extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f406497a = new c();
    }

    public static final class d extends s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<RuStorePushClientException> f406498a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k List<? extends RuStorePushClientException> list) {
            this.f406498a = list;
        }
    }
}
