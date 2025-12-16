package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c09 {
    public final Uri a;
    public final wg7 b;

    public c09(Uri uri, zui zuiVar, wg7 wg7Var) {
        List list = Collections.EMPTY_LIST;
        this.a = uri;
        this.b = wg7Var;
        tg7 tg7VarI = wg7.i();
        for (int i = 0; i < wg7Var.size(); i++) {
            ((e09) wg7Var.get(i)).getClass();
            tg7VarI.a(new e09());
        }
        tg7VarI.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c09)) {
            return false;
        }
        c09 c09Var = (c09) obj;
        if (!this.a.equals(c09Var.a)) {
            return false;
        }
        int i = xxg.a;
        if (!xxg.a(null, null)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return list.equals(list) && this.b.equals(c09Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + ((Collections.EMPTY_LIST.hashCode() + (this.a.hashCode() * 923521)) * 961)) * 31;
    }
}
