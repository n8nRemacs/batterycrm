package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class kh7 extends z1 implements jh7 {
    @Override // defpackage.lyg
    public final int d() {
        return 5;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyg)) {
            return false;
        }
        a2 a2Var = (a2) ((lyg) obj);
        if (a2Var.d() != 5) {
            return false;
        }
        boolean z = a2Var instanceof kh7;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((kh7) a2Var).a);
        }
        byte[] bArr2 = ((z1) a2Var.m()).a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.a2, defpackage.lyg
    public final jh7 m() {
        return this;
    }

    @Override // defpackage.a2, defpackage.lh7
    /* renamed from: p */
    public final jh7 m() {
        return this;
    }
}
