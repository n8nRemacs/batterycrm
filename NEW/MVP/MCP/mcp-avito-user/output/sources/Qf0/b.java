package Qf0;

import Y61.k;
import com.avito.android.push.PushService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PushService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQf0/b;", "", "<init>", "()V", "_common_push-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f13970a = new b();

    /* compiled from: PushService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PushService.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PushService pushService = PushService.f245927b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PushService pushService2 = PushService.f245927b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @k
    public static String a(@k PushService pushService) {
        int iOrdinal = pushService.ordinal();
        if (iOrdinal == 0) {
            return "fcm";
        }
        if (iOrdinal == 1) {
            return "hms";
        }
        if (iOrdinal == 2) {
            return "rst";
        }
        throw new NoWhenBranchMatchedException();
    }
}
