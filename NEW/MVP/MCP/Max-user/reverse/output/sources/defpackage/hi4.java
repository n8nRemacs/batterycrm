package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.deeplink.InvalidDeeplinkNamingException;

/* loaded from: classes2.dex */
public final class hi4 {
    public String a = "";
    public final ArrayList b = new ArrayList();

    public final Uri a() {
        return m8j.b(b());
    }

    public final String b() {
        if (!dnf.r(this.a, ":", false)) {
            throw new InvalidDeeplinkNamingException(this.a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('&');
        }
        sb.deleteCharAt(vmf.y(sb));
        return sb.toString();
    }

    public final void c(Object obj, String str) {
        this.b.add(str + "=" + obj);
    }
}
