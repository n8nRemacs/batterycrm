package defpackage;

/* loaded from: classes.dex */
public final class e2e {
    public static final e2e e = new e2e(f2e.d, null, false, null);
    public final f2e a;
    public final t1e b;
    public final boolean c;
    public final CharSequence d;

    public e2e(f2e f2eVar, t1e t1eVar, boolean z, CharSequence charSequence) {
        this.a = f2eVar;
        this.b = t1eVar;
        this.c = z;
        this.d = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    public static e2e a(e2e e2eVar, f2e f2eVar, t1e t1eVar, String str, int i) {
        if ((i & 1) != 0) {
            f2eVar = e2eVar.a;
        }
        if ((i & 2) != 0) {
            t1eVar = e2eVar.b;
        }
        boolean z = (i & 4) != 0 ? e2eVar.c : true;
        String str2 = str;
        if ((i & 8) != 0) {
            str2 = e2eVar.d;
        }
        e2eVar.getClass();
        return new e2e(f2eVar, t1eVar, z, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2e)) {
            return false;
        }
        e2e e2eVar = (e2e) obj;
        return this.a == e2eVar.a && fni.a(this.b, e2eVar.b) && this.c == e2eVar.c && fni.a(this.d, e2eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        t1e t1eVar = this.b;
        int iB = a9h.b((iHashCode + (t1eVar == null ? 0 : t1eVar.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return iB + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "ScreenRecordData(state=" + this.a + ", data=" + this.b + ", isApproved=" + this.c + ", recordUserName=" + ((Object) this.d) + ")";
    }
}
