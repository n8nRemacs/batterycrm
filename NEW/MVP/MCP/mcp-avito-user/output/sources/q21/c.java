package q21;

import j.N;

/* compiled from: DivDataTag.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f428994b = new c("");

    /* renamed from: a, reason: collision with root package name */
    @N
    public final String f428995a;

    public c(@N String str) {
        this.f428995a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f428995a.equals(((c) obj).f428995a);
    }

    public final int hashCode() {
        return this.f428995a.hashCode();
    }
}
