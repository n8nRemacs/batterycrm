package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m67 implements ry9 {
    public final String a;
    public final String b;
    public final List c;

    public m67(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m67.class == obj.getClass()) {
            m67 m67Var = (m67) obj;
            if (TextUtils.equals(this.a, m67Var.a) && TextUtils.equals(this.b, m67Var.b) && this.c.equals(m67Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.a;
        sb.append(str != null ? ho7.l(az1.n(" [", str, ", "), this.b, "]") : "");
        return sb.toString();
    }
}
