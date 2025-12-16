package r40;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: OfflineCache.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lr40/f;", "", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f429585a = a.f429586a;

    /* compiled from: OfflineCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr40/f$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f429586a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final String f429587b = "offline_api_cache";
    }

    @l
    Response a(@k Request request);

    @l
    InterfaceC47489c b(@k Response response);

    void clear();
}
