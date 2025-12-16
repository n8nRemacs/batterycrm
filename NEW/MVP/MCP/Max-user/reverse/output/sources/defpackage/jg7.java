package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jg7 extends z1 implements ig7 {
    @Override // defpackage.lyg
    public final int d() {
        return 6;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyg)) {
            return false;
        }
        lyg lygVar = (lyg) obj;
        int iD = ((a2) lygVar).d();
        if (iD == 0) {
            throw null;
        }
        if (iD != 6) {
            return false;
        }
        boolean z = lygVar instanceof jg7;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((jg7) lygVar).a);
        }
        byte[] bArr2 = ((z1) lygVar.o()).a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.a2, defpackage.lyg
    public final ig7 o() {
        return this;
    }

    @Override // defpackage.a2
    /* renamed from: s */
    public final ig7 o() {
        return this;
    }
}
