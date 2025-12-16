package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class aq extends raj {
    public final /* synthetic */ int a;

    public /* synthetic */ aq(int i) {
        this.a = i;
    }

    public static mi5 d(qyg qygVar) {
        String strN = qygVar.n();
        strN.getClass();
        String strN2 = qygVar.n();
        strN2.getClass();
        return new mi5(strN, strN2, qygVar.m(), qygVar.m(), Arrays.copyOfRange(qygVar.a, qygVar.b, qygVar.c));
    }

    @Override // defpackage.raj
    public final sy9 b(xy9 xy9Var, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() == 116) {
                    u62 u62Var = new u62(byteBuffer.array(), byteBuffer.limit(), 2, (byte) 0);
                    int i = 12;
                    u62Var.t(12);
                    int iF = (u62Var.f() + u62Var.i(12)) - 4;
                    u62Var.t(44);
                    u62Var.u(u62Var.i(12));
                    u62Var.t(16);
                    ArrayList arrayList = new ArrayList();
                    while (u62Var.f() < iF) {
                        u62Var.t(48);
                        int i2 = u62Var.i(8);
                        u62Var.t(4);
                        int iF2 = u62Var.f() + u62Var.i(i);
                        String str = null;
                        String str2 = null;
                        while (u62Var.f() < iF2) {
                            int i3 = u62Var.i(8);
                            int i4 = u62Var.i(8);
                            int iF3 = u62Var.f() + i4;
                            if (i3 == 2) {
                                int i5 = u62Var.i(16);
                                u62Var.t(8);
                                if (i5 == 3) {
                                    while (u62Var.f() < iF3) {
                                        int i6 = u62Var.i(8);
                                        Charset charset = mb2.a;
                                        byte[] bArr = new byte[i6];
                                        u62Var.l(i6, bArr);
                                        String str3 = new String(bArr, charset);
                                        int i7 = u62Var.i(8);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            u62Var.u(u62Var.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i3 == 21) {
                                Charset charset2 = mb2.a;
                                byte[] bArr2 = new byte[i4];
                                u62Var.l(i4, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            u62Var.q(iF3 * 8);
                        }
                        u62Var.q(iF2 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new yp(i2, str2.length() != 0 ? str.concat(str2) : new String(str)));
                        }
                        i = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new sy9(arrayList);
                    }
                }
                return null;
            default:
                return new sy9(d(new qyg(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
