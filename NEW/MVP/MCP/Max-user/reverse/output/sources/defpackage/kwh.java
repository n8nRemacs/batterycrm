package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kwh {
    public final String a;
    public final List b;

    public kwh(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwh)) {
            return false;
        }
        kwh kwhVar = (kwh) obj;
        return fni.a(this.a, kwhVar.a) && fni.a(this.b, kwhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSettingsState(title=" + this.a + ", sections=" + this.b + ")";
    }
}
