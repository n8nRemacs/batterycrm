package JK;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AudioManagerUtils.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJK/e;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f8872a = new e();

    @k
    public static String a(int i12) {
        switch (i12) {
            case 0:
                return "MODE_NORMAL";
            case 1:
                return "MODE_RINGTONE";
            case 2:
                return "MODE_IN_CALL";
            case 3:
                return "MODE_IN_COMMUNICATION";
            case 4:
                return "MODE_CALL_SCREENING";
            case 5:
                return "MODE_CALL_REDIRECT";
            case 6:
                return "MODE_COMMUNICATION_REDIRECT";
            default:
                return AK.c.g(i12, "mode_");
        }
    }
}
