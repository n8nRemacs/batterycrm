package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class ipg extends g9c {
    public static final ipg c = new ipg(jpg.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((gpg) obj).a.length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        hpg hpgVar = (hpg) obj;
        byte bZ = yl3Var.a(this.b, i).z();
        hpgVar.b(hpgVar.d() + 1);
        byte[] bArr = hpgVar.a;
        int i2 = hpgVar.b;
        hpgVar.b = i2 + 1;
        bArr[i2] = bZ;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        byte[] bArr = ((gpg) obj).a;
        hpg hpgVar = new hpg();
        hpgVar.a = bArr;
        hpgVar.b = bArr.length;
        hpgVar.b(10);
        return hpgVar;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new gpg(new byte[0]);
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        byte[] bArr = ((gpg) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            bVar.j(this.b, i2).d(bArr[i2]);
        }
    }
}
