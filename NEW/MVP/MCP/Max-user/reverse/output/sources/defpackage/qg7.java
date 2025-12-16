package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class qg7 extends a2 implements lyg {
    public final byte a;
    public final byte[] b;

    public qg7(byte b, byte[] bArr) {
        this.a = b;
        this.b = bArr;
    }

    @Override // defpackage.lyg
    public final String a() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Byte.toString(this.a));
        sb.append(",\"");
        for (byte b : this.b) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    @Override // defpackage.lyg
    public final int d() {
        return 9;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (obj == this) {
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
        if (iD != 9) {
            return false;
        }
        qg7 qg7VarN = lygVar.n();
        return this.a == qg7VarN.a && Arrays.equals(this.b, qg7VarN.b);
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b : this.b) {
            i = (i * 31) + b;
        }
        return i;
    }

    @Override // defpackage.a2, defpackage.lyg
    public final qg7 n() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.a));
        sb.append(",0x");
        for (byte b : this.b) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.a2
    /* renamed from: u */
    public final qg7 n() {
        return this;
    }
}
