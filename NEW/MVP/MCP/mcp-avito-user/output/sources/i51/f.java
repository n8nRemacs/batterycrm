package I51;

import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.framework.common.ExceptionCode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: math.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final int[] f7951a = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    public static final int a(long j12) {
        if (j12 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j12 < -2147483648L ? BeduinInputModel.MIN_TEXT_VERSION : (int) j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final I51.d b(long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I51.f.b(long, long, long):I51.d");
    }
}
