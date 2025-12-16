package O2;

import androidx.annotation.RestrictTo;
import androidx.core.util.C22807v;
import j.P;

/* compiled from: MutablePair.java */
@RestrictTo
/* loaded from: classes10.dex */
public class h<T> {

    /* renamed from: a, reason: collision with root package name */
    @P
    public String f11949a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public String f11950b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22807v)) {
            return false;
        }
        C22807v c22807v = (C22807v) obj;
        F f12 = c22807v.f44895a;
        Object obj2 = this.f11949a;
        if (f12 != obj2 && (f12 == 0 || !f12.equals(obj2))) {
            return false;
        }
        Object obj3 = this.f11950b;
        S s5 = c22807v.f44896b;
        return s5 == obj3 || (s5 != 0 && s5.equals(obj3));
    }

    public final int hashCode() {
        String str = this.f11949a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f11950b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.f11949a) + " " + ((Object) this.f11950b) + "}";
    }
}
