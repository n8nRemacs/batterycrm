package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public final class hl7 extends fl9 {
    public static volatile hl7[] u;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public long f = 0;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public long l = 0;
    public long m = 0;
    public String n = "";
    public byte[] o = coi.e;
    public String p = "";
    public ll7[] q = ll7.a();
    public long r = 0;
    public String s = "";
    public boolean t = false;

    public hl7() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        long j = this.a;
        int i = 0;
        int iH = j != 0 ? hd3.h(1, j) : 0;
        if (!this.b.equals("")) {
            iH += hd3.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iH += hd3.l(3, this.c);
        }
        if (!this.d.equals("")) {
            iH += hd3.l(4, this.d);
        }
        if (!this.e.equals("")) {
            iH += hd3.l(5, this.e);
        }
        long j2 = this.f;
        if (j2 != 0) {
            iH += hd3.k(j2) + hd3.m(6);
        }
        int i2 = this.g;
        if (i2 != 0) {
            iH += hd3.f(7, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            iH += hd3.f(8, i3);
        }
        if (this.i) {
            iH += hd3.a(9);
        }
        if (this.j) {
            iH += hd3.a(10);
        }
        if (this.k) {
            iH += hd3.a(11);
        }
        long j3 = this.l;
        if (j3 != 0) {
            iH += hd3.k(j3) + hd3.m(12);
        }
        long j4 = this.m;
        if (j4 != 0) {
            iH += hd3.h(13, j4);
        }
        if (!this.n.equals("")) {
            iH += hd3.l(14, this.n);
        }
        if (!Arrays.equals(this.o, coi.e)) {
            iH += hd3.b(15, this.o);
        }
        if (!this.p.equals("")) {
            iH += hd3.l(16, this.p);
        }
        ll7[] ll7VarArr = this.q;
        if (ll7VarArr != null && ll7VarArr.length > 0) {
            while (true) {
                ll7[] ll7VarArr2 = this.q;
                if (i >= ll7VarArr2.length) {
                    break;
                }
                ll7 ll7Var = ll7VarArr2[i];
                if (ll7Var != null) {
                    iH = hd3.i(17, ll7Var) + iH;
                }
                i++;
            }
        }
        long j5 = this.r;
        if (j5 != 0) {
            iH += hd3.h(18, j5);
        }
        if (!this.s.equals("")) {
            iH += hd3.l(19, this.s);
        }
        return this.t ? hd3.a(20) + iH : iH;
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            switch (iS) {
                case 0:
                    break;
                case 8:
                    this.a = gd3Var.q();
                    break;
                case 18:
                    this.b = gd3Var.r();
                    break;
                case 26:
                    this.c = gd3Var.r();
                    break;
                case 34:
                    this.d = gd3Var.r();
                    break;
                case 42:
                    this.e = gd3Var.r();
                    break;
                case 48:
                    this.f = gd3Var.q();
                    break;
                case 56:
                    this.g = gd3Var.p();
                    break;
                case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                    this.h = gd3Var.p();
                    break;
                case 72:
                    this.i = gd3Var.f();
                    break;
                case 80:
                    this.j = gd3Var.f();
                    break;
                case 88:
                    this.k = gd3Var.f();
                    break;
                case 96:
                    this.l = gd3Var.q();
                    break;
                case 104:
                    this.m = gd3Var.q();
                    break;
                case 114:
                    this.n = gd3Var.r();
                    break;
                case 122:
                    this.o = gd3Var.g();
                    break;
                case 130:
                    this.p = gd3Var.r();
                    break;
                case 138:
                    int iB = coi.b(gd3Var, 138);
                    ll7[] ll7VarArr = this.q;
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
                    this.q = ll7VarArr2;
                    break;
                case 144:
                    this.r = gd3Var.q();
                    break;
                case 154:
                    this.s = gd3Var.r();
                    break;
                case 160:
                    this.t = gd3Var.f();
                    break;
                default:
                    if (!gd3Var.u(iS)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        long j = this.a;
        if (j != 0) {
            hd3Var.x(1, j);
        }
        if (!this.b.equals("")) {
            hd3Var.E(2, this.b);
        }
        if (!this.c.equals("")) {
            hd3Var.E(3, this.c);
        }
        if (!this.d.equals("")) {
            hd3Var.E(4, this.d);
        }
        if (!this.e.equals("")) {
            hd3Var.E(5, this.e);
        }
        long j2 = this.f;
        int i = 0;
        if (j2 != 0) {
            hd3Var.F(6, 0);
            hd3Var.D(j2);
        }
        int i2 = this.g;
        if (i2 != 0) {
            hd3Var.w(7, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            hd3Var.w(8, i3);
        }
        boolean z = this.i;
        if (z) {
            hd3Var.r(9, z);
        }
        boolean z2 = this.j;
        if (z2) {
            hd3Var.r(10, z2);
        }
        boolean z3 = this.k;
        if (z3) {
            hd3Var.r(11, z3);
        }
        long j3 = this.l;
        if (j3 != 0) {
            hd3Var.F(12, 0);
            hd3Var.D(j3);
        }
        long j4 = this.m;
        if (j4 != 0) {
            hd3Var.x(13, j4);
        }
        if (!this.n.equals("")) {
            hd3Var.E(14, this.n);
        }
        if (!Arrays.equals(this.o, coi.e)) {
            hd3Var.s(15, this.o);
        }
        if (!this.p.equals("")) {
            hd3Var.E(16, this.p);
        }
        ll7[] ll7VarArr = this.q;
        if (ll7VarArr != null && ll7VarArr.length > 0) {
            while (true) {
                ll7[] ll7VarArr2 = this.q;
                if (i >= ll7VarArr2.length) {
                    break;
                }
                ll7 ll7Var = ll7VarArr2[i];
                if (ll7Var != null) {
                    hd3Var.y(17, ll7Var);
                }
                i++;
            }
        }
        long j5 = this.r;
        if (j5 != 0) {
            hd3Var.x(18, j5);
        }
        if (!this.s.equals("")) {
            hd3Var.E(19, this.s);
        }
        boolean z4 = this.t;
        if (z4) {
            hd3Var.r(20, z4);
        }
    }
}
