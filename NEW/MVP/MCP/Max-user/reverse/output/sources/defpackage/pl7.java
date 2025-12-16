package defpackage;

import java.util.Optional;

/* loaded from: classes3.dex */
public final class pl7 extends olb {
    public byte[] i;

    @Override // defpackage.olb
    public final Optional a(byte[] bArr, int i, byte[] bArr2, int i2) {
        return i2 < 1200 ? Optional.empty() : super.a(bArr, i, bArr2, i2);
    }

    @Override // defpackage.olb
    public final btc b(byte[] bArr, byte[] bArr2) {
        zzg zzgVar = (zzg) this.a.b;
        byte[] bArr3 = this.i;
        ol7 ol7Var = new ol7(zzgVar, bArr, bArr2);
        ol7Var.h = bArr3;
        n7 n7Var = this.e;
        long j = n7Var.a;
        n7Var.a = 1 + j;
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        ol7Var.b = j;
        return ol7Var;
    }
}
