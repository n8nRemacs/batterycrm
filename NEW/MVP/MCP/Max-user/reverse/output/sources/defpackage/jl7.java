package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class jl7 extends fl9 {
    public static volatile jl7[] f;
    public String a = "";
    public String b = "";
    public int c = 0;
    public hd6 d = null;
    public ll7[] e = ll7.a();

    public jl7() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int i = 0;
        int iL = !this.a.equals("") ? hd3.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            iL += hd3.l(2, this.b);
        }
        int i2 = this.c;
        if (i2 != 0) {
            iL += hd3.n(3, i2);
        }
        hd6 hd6Var = this.d;
        if (hd6Var != null) {
            iL += hd3.i(4, hd6Var);
        }
        ll7[] ll7VarArr = this.e;
        if (ll7VarArr != null && ll7VarArr.length > 0) {
            while (true) {
                ll7[] ll7VarArr2 = this.e;
                if (i >= ll7VarArr2.length) {
                    break;
                }
                ll7 ll7Var = ll7VarArr2[i];
                if (ll7Var != null) {
                    iL = hd3.i(17, ll7Var) + iL;
                }
                i++;
            }
        }
        return iL;
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                this.a = gd3Var.r();
            } else if (iS == 18) {
                this.b = gd3Var.r();
            } else if (iS == 24) {
                this.c = gd3Var.p();
            } else if (iS == 34) {
                if (this.d == null) {
                    this.d = new hd6(1);
                }
                gd3Var.j(this.d);
            } else if (iS == 138) {
                int iB = coi.b(gd3Var, 138);
                ll7[] ll7VarArr = this.e;
                int length = ll7VarArr == null ? 0 : ll7VarArr.length;
                int i = iB + length;
                ll7[] ll7VarArr2 = new ll7[i];
                if (length != 0) {
                    System.arraycopy(ll7VarArr, 0, ll7VarArr2, 0, length);
                }
                while (length < i - 1) {
                    ll7 ll7Var = new ll7();
                    ll7VarArr2[length] = ll7Var;
                    gd3Var.j(ll7Var);
                    gd3Var.s();
                    length++;
                }
                ll7 ll7Var2 = new ll7();
                ll7VarArr2[length] = ll7Var2;
                gd3Var.j(ll7Var2);
                this.e = ll7VarArr2;
            } else if (!gd3Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (!this.a.equals("")) {
            hd3Var.E(1, this.a);
        }
        if (!this.b.equals("")) {
            hd3Var.E(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            hd3Var.G(3, i);
        }
        hd6 hd6Var = this.d;
        if (hd6Var != null) {
            hd3Var.y(4, hd6Var);
        }
        ll7[] ll7VarArr = this.e;
        if (ll7VarArr == null || ll7VarArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            ll7[] ll7VarArr2 = this.e;
            if (i2 >= ll7VarArr2.length) {
                return;
            }
            ll7 ll7Var = ll7VarArr2[i2];
            if (ll7Var != null) {
                hd3Var.y(17, ll7Var);
            }
            i2++;
        }
    }
}
