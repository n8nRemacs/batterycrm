package z21;

import android.net.Uri;
import com.yandex.div.internal.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import z21.e;

/* compiled from: DivItemChangeActionHandler.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    public static final e a(Uri uri, int i12, int i13) {
        String queryParameter = uri.getQueryParameter("overflow");
        e.f443813b.getClass();
        if (queryParameter == null ? true : queryParameter.equals("clamp")) {
            return new e.a(i12, i13);
        }
        if (L.f(queryParameter, "ring")) {
            return new e.c(i12, i13);
        }
        int i14 = n.f370123a;
        return new e.a(i12, i13);
    }
}
