package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public final class qga extends atc {
    public static final Random o = new Random();
    public int a;
    public int b;
    public byte[] c;
    public byte[] d;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        rr3 rr3Var = yscVar.Q0;
        lu4 lu4Var = rr3Var.f;
        if (lu4Var == null) {
            rr3Var.d.accept(10, "new connection id frame not allowed when using zero-length connection ID");
            return;
        }
        int i = this.b;
        int i2 = this.a;
        if (i > i2) {
            rr3Var.d.accept(7, "exceeding active connection id limit");
            return;
        }
        if (!lu4Var.a.containsKey(Integer.valueOf(i2))) {
            lu4 lu4Var2 = rr3Var.f;
            int i3 = this.a;
            byte[] bArr = this.c;
            byte[] bArr2 = this.d;
            if (i3 >= lu4Var2.f) {
                lu4Var2.a.put(Integer.valueOf(i3), new or3(bArr, i3, bArr2, 1));
            } else {
                lu4Var2.a.put(Integer.valueOf(i3), new or3(bArr, i3, bArr2, 4));
                int i4 = this.a;
                rde rdeVar = rr3Var.c;
                spd spdVar = new spd();
                spdVar.a = i4;
                rdeVar.f(spdVar, hf5.d, new qr3(rr3Var, 0));
            }
        } else if (!Arrays.equals(((or3) rr3Var.f.a.get(Integer.valueOf(this.a))).b, this.c)) {
            rr3Var.d.accept(10, "different cids or same sequence number");
            return;
        }
        int i5 = this.b;
        if (i5 > 0) {
            lu4 lu4Var3 = rr3Var.f;
            lu4Var3.f = i5;
            int asInt = lu4Var3.a.entrySet().stream().filter(new a6(2, lu4Var3)).mapToInt(new n0(9)).findFirst().getAsInt();
            List list = (List) lu4Var3.a.entrySet().stream().filter(new fb3(i5, 1)).filter(new gb3(7)).map(new m0(17)).collect(Collectors.toList());
            list.forEach(new m4(8, lu4Var3));
            if (az1.c(((or3) lu4Var3.a.get(Integer.valueOf(asInt))).c, 4)) {
                or3 or3Var = (or3) lu4Var3.a.values().stream().filter(new gb3(8)).findFirst().orElseThrow(new ik(2));
                or3Var.c = 2;
                lu4Var3.b = or3Var.b;
            }
            list.forEach(new qr3(rr3Var, 1));
        }
        if (rr3Var.f.b().size() > 2) {
            rr3Var.d.accept(9, "exceeding active connection id limit");
        }
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.b) + epi.a(this.a) + 1 + 1 + this.c.length + 16;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 24);
        epi.b(this.a, byteBuffer);
        epi.b(this.b, byteBuffer);
        byteBuffer.put((byte) this.c.length);
        byteBuffer.put(this.c);
        byteBuffer.put(this.d);
    }

    public final void h(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.a = atc.e(byteBuffer);
        this.b = atc.e(byteBuffer);
        int i = byteBuffer.get();
        if (i < 1 || i > 20) {
            throw new TransportError(8, "invalid connection id length");
        }
        byte[] bArr = new byte[i];
        this.c = bArr;
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[16];
        this.d = bArr2;
        byteBuffer.get(bArr2);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String strA = uwi.a(this.c);
        String strA2 = uwi.a(this.d);
        StringBuilder sbK = wy1.k("NewConnectionIdFrame[", i, ",<", i2, "|");
        sbK.append(strA);
        sbK.append("|");
        sbK.append(strA2);
        sbK.append("]");
        return sbK.toString();
    }
}
