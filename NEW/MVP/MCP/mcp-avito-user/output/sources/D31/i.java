package d31;

import android.net.Uri;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class i {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public static final boolean a(Uri uri) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        Iterator it = ((O51.d) ((T51.c) Fb1.b.f4799a.getValue()).f15377a).a().f18609g.iterator();
        while (it.hasNext()) {
            if (host.equalsIgnoreCase((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
