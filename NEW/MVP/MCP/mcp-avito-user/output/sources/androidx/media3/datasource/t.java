package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.compose.foundation.H;
import androidx.media3.common.util.J;
import j.P;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: HttpUtil.java */
@J
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f48311a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f48312b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    @P
    public static String a(long j12, long j13) {
        if (j12 == 0 && j13 == -1) {
            return null;
        }
        StringBuilder sbQ = H.q(j12, "bytes=", "-");
        if (j13 != -1) {
            sbQ.append((j12 + j13) - 1);
        }
        return sbQ.toString();
    }

    public static long b(@P String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f48312b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }
}
