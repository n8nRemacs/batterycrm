package O2;

import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* loaded from: classes10.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f11941c = new d("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f11942a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public e f11943b;

    public d(String... strArr) {
        this.f11942a = Arrays.asList(strArr);
    }

    @RestrictTo
    public final boolean a(int i12, String str) {
        List<String> list = this.f11942a;
        if (i12 >= list.size()) {
            return false;
        }
        boolean z12 = i12 == list.size() - 1;
        String str2 = list.get(i12);
        if (!str2.equals("**")) {
            return (z12 || (i12 == list.size() + (-2) && ((String) m.h(1, list)).equals("**"))) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z12 && list.get(i12 + 1).equals(str)) {
            return i12 == list.size() + (-2) || (i12 == list.size() + (-3) && ((String) m.h(1, list)).equals("**"));
        }
        if (z12) {
            return true;
        }
        int i13 = i12 + 1;
        if (i13 < list.size() - 1) {
            return false;
        }
        return list.get(i13).equals(str);
    }

    @RestrictTo
    public final int b(int i12, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.f11942a;
        if (list.get(i12).equals("**")) {
            return (i12 != list.size() - 1 && list.get(i12 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    @RestrictTo
    public final boolean c(int i12, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f11942a;
        if (i12 >= list.size()) {
            return false;
        }
        return list.get(i12).equals(str) || list.get(i12).equals("**") || list.get(i12).equals("*");
    }

    @RestrictTo
    public final boolean d(int i12, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f11942a;
        return i12 < list.size() - 1 || list.get(i12).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f11942a.equals(dVar.f11942a)) {
            return false;
        }
        e eVar = this.f11943b;
        e eVar2 = dVar.f11943b;
        return eVar != null ? eVar.equals(eVar2) : eVar2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f11942a.hashCode() * 31;
        e eVar = this.f11943b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f11942a);
        sb2.append(",resolved=");
        return r.x(sb2, this.f11943b != null, '}');
    }

    public d(d dVar) {
        this.f11942a = new ArrayList(dVar.f11942a);
        this.f11943b = dVar.f11943b;
    }
}
