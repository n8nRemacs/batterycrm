package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b5f implements ry9 {
    public final ArrayList a;

    public b5f(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((z4f) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((z4f) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((z4f) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        hsi.b(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b5f.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((b5f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
