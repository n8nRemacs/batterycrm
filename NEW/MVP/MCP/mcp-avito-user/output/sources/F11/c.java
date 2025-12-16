package f11;

import android.text.TextUtils;
import e11.AbstractC39860d0;
import j.N;
import j.P;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class c extends AbstractC39860d0 {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final HashMap f395642b = new HashMap();

    public interface a {
    }

    public final int g() {
        String strC = c("ea");
        if (strC == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strC);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final int h() {
        String strC = c("eg");
        if (strC == null) {
            return -1;
        }
        try {
            return Integer.parseInt(strC);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void i(int i12) {
        if (i12 >= 0) {
            a("ea", String.valueOf(i12));
        } else {
            f("ea");
        }
    }

    public final void j(@N String str, @P String str2) {
        a(str, str2);
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (str2 == null) {
                        this.f395642b.remove(str);
                    } else {
                        this.f395642b.put(str, str2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(int i12) {
        if (i12 == 0 || i12 == 1 || i12 == 2) {
            a("eg", String.valueOf(i12));
        } else {
            f("eg");
        }
    }
}
