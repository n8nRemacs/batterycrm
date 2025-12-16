package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t60 extends dtf implements sm6 {
    public final /* synthetic */ w60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(w60 w60Var, Continuation continuation) {
        super(2, continuation);
        this.o = w60Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        t60 t60Var = (t60) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        t60Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new t60(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int iIntValue;
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        Integer num = this.o.i;
        if (num != null) {
            int iIntValue2 = num.intValue();
            byte[] bArr = this.o.b;
            if (bArr != 0) {
                x9f x9fVar = this.o.n;
                if (x9fVar != null) {
                    x9fVar.cancel((CancellationException) null);
                }
                this.o.n = null;
                w60 w60Var = this.o;
                if (bArr.length != 0) {
                    byte[] bArr2 = new byte[iIntValue2];
                    for (int i = 0; i < iIntValue2; i++) {
                        if (i == 0 || bArr.length == 1) {
                            iIntValue = bArr[0];
                        } else if (i == iIntValue2 - 1) {
                            iIntValue = bArr[bArr.length - 1];
                        } else {
                            float length = (i / iIntValue2) * (bArr.length - 1);
                            int i2 = (int) length;
                            int i3 = i2 + 1;
                            iIntValue = (i2 >= bArr.length - 1 || i3 >= bArr.length - 1) ? 0 : w60Var.d.evaluate(length - i2, Integer.valueOf(bArr[i2]), Integer.valueOf(bArr[i3])).intValue();
                        }
                        bArr2[i] = (byte) iIntValue;
                    }
                    bArr = bArr2;
                }
                w60 w60Var2 = this.o;
                tcf tcfVar = w60Var2.g;
                ArrayList arrayList = new ArrayList(bArr.length);
                for (int i4 : bArr) {
                    arrayList.add(new Float(w60Var2.b((byte) i4)));
                }
                tcfVar.m(null, new o60(arrayList));
            }
        }
        return qqgVar;
    }
}
