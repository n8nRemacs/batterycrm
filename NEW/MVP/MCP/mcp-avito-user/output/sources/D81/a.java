package D81;

import java.io.EOFException;
import kotlin.ranges.s;
import okio.C44802l;

/* loaded from: classes9.dex */
public abstract class a {
    public static final boolean a(C44802l c44802l) {
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
