package defpackage;

/* loaded from: classes2.dex */
public final class fpf {
    public static final cpf Companion = new cpf();
    public static final zy7[] c = {epf.Companion.serializer(), null};
    public final epf a;
    public final String b;

    public /* synthetic */ fpf(int i, epf epfVar, String str) {
        if (1 != (i & 1)) {
            g5j.c(i, 1, bpf.a.d());
            throw null;
        }
        this.a = epfVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpf)) {
            return false;
        }
        fpf fpfVar = (fpf) obj;
        return this.a == fpfVar.a && fni.a(this.b, fpfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SuccessResponse(status=" + this.a + ", requestId=" + this.b + ")";
    }

    public fpf(epf epfVar, String str) {
        this.a = epfVar;
        this.b = str;
    }
}
