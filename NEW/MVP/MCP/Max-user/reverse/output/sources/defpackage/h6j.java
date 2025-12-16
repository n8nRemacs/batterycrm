package defpackage;

import kotlin.NoWhenBranchMatchedException;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class h6j {
    public static final y34 a(int i) {
        int i2 = h44.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 == 1) {
            return new h08(12);
        }
        if (i2 == 2) {
            return new f44();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void b(esg esgVar) {
        esgVar.b(1, new bya(9));
        esgVar.d(HttpStatus.SC_NOT_IMPLEMENTED, new cya(17));
        esgVar.d(HttpStatus.SC_BAD_GATEWAY, new bya(13));
        esgVar.b(2, new bya(10));
        esgVar.b(2, new bya(11));
        esgVar.b(2, new bya(12));
        esgVar.d(HttpStatus.SC_SERVICE_UNAVAILABLE, new cya(18));
    }
}
