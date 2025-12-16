package okhttp3.logging;

import Y61.k;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.ranges.s;
import okio.C44802l;

/* compiled from: utf8.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/l;", "", "isProbablyUtf8", "(Lokio/l;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(@k C44802l c44802l) {
        try {
            C44802l c44802l2 = new C44802l();
            c44802l.k(0L, c44802l2, s.d(c44802l.f420125c, 64L));
            for (int i12 = 0; i12 < 16; i12++) {
                if (c44802l2.W2()) {
                    return true;
                }
                int iX2 = c44802l2.x();
                if (Character.isISOControl(iX2) && !Character.isWhitespace(iX2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
