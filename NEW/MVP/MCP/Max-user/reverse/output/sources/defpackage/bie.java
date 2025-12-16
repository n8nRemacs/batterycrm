package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bie {
    public static final bie b = new bie(new HashSet());
    public static final String c;
    public final hh7 a;

    static {
        String str = zxg.a;
        c = Integer.toString(0, 36);
    }

    public bie(HashSet hashSet) {
        this.a = hh7.j(hashSet);
    }

    public static bie a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            a8i.l("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(aie.a((Bundle) parcelableArrayList.get(i)));
        }
        return new bie(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bie) {
            return this.a.equals(((bie) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
