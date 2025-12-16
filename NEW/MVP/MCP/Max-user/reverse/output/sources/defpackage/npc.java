package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class npc extends fl9 {
    public static volatile npc[] o;
    public long a = 0;
    public String b = "";
    public String c = "";
    public int d = 0;
    public long e = 0;
    public String f = "";
    public long g = 0;
    public String h = "";
    public int i = 0;
    public int[] j = coi.a;
    public String k = "";
    public mpc l = null;
    public kpc m = null;
    public Protos.Attaches.Attach n = null;

    public npc() {
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int[] iArr;
        long j = this.a;
        int i = 0;
        int iH = j != 0 ? hd3.h(1, j) : 0;
        if (!this.b.equals("")) {
            iH += hd3.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iH += hd3.l(3, this.c);
        }
        int i2 = this.d;
        if (i2 != 0) {
            iH += hd3.f(4, i2);
        }
        long j2 = this.e;
        if (j2 != 0) {
            iH += hd3.h(5, j2);
        }
        if (!this.f.equals("")) {
            iH += hd3.l(6, this.f);
        }
        long j3 = this.g;
        if (j3 != 0) {
            iH += hd3.h(7, j3);
        }
        if (!this.h.equals("")) {
            iH += hd3.l(8, this.h);
        }
        int i3 = this.i;
        if (i3 != 0) {
            iH += hd3.f(9, i3);
        }
        if (this.j.length > 0) {
            int iG = 0;
            while (true) {
                iArr = this.j;
                if (i >= iArr.length) {
                    break;
                }
                iG += hd3.g(iArr[i]);
                i++;
            }
            iH = iH + iG + iArr.length;
        }
        if (!this.k.equals("")) {
            iH += hd3.l(12, this.k);
        }
        mpc mpcVar = this.l;
        if (mpcVar != null) {
            iH += hd3.i(13, mpcVar);
        }
        kpc kpcVar = this.m;
        if (kpcVar != null) {
            iH += hd3.i(14, kpcVar);
        }
        Protos.Attaches.Attach attach = this.n;
        return attach != null ? hd3.i(15, attach) + iH : iH;
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
                case 32:
                    this.d = gd3Var.p();
                    break;
                case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                    this.e = gd3Var.q();
                    break;
                case 50:
                    this.f = gd3Var.r();
                    break;
                case 56:
                    this.g = gd3Var.q();
                    break;
                case 66:
                    this.h = gd3Var.r();
                    break;
                case 72:
                    this.i = gd3Var.p();
                    break;
                case 88:
                    int iB = coi.b(gd3Var, 88);
                    int[] iArr = this.j;
                    int length = iArr.length;
                    int i = iB + length;
                    int[] iArr2 = new int[i];
                    if (length != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length);
                    }
                    while (length < i - 1) {
                        iArr2[length] = gd3Var.p();
                        gd3Var.s();
                        length++;
                    }
                    iArr2[length] = gd3Var.p();
                    this.j = iArr2;
                    break;
                case 90:
                    int iE = gd3Var.e(gd3Var.p());
                    int iC = gd3Var.c();
                    int i2 = 0;
                    while (gd3Var.b() > 0) {
                        gd3Var.p();
                        i2++;
                    }
                    gd3Var.t(iC);
                    int[] iArr3 = this.j;
                    int length2 = iArr3.length;
                    int i3 = i2 + length2;
                    int[] iArr4 = new int[i3];
                    if (length2 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        iArr4[length2] = gd3Var.p();
                        length2++;
                    }
                    this.j = iArr4;
                    gd3Var.d(iE);
                    break;
                case 98:
                    this.k = gd3Var.r();
                    break;
                case 106:
                    if (this.l == null) {
                        mpc mpcVar = new mpc();
                        mpcVar.a = 0.0f;
                        mpcVar.b = 0.0f;
                        mpcVar.c = 0;
                        mpcVar.d = false;
                        mpcVar.cachedSize = -1;
                        this.l = mpcVar;
                    }
                    gd3Var.j(this.l);
                    break;
                case 114:
                    if (this.m == null) {
                        kpc kpcVar = new kpc();
                        kpcVar.a = "";
                        kpcVar.b = "";
                        kpcVar.c = "";
                        kpcVar.d = null;
                        kpcVar.e = "";
                        kpcVar.f = null;
                        kpcVar.cachedSize = -1;
                        this.m = kpcVar;
                    }
                    gd3Var.j(this.m);
                    break;
                case 122:
                    if (this.n == null) {
                        this.n = new Protos.Attaches.Attach();
                    }
                    gd3Var.j(this.n);
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
        int i = this.d;
        if (i != 0) {
            hd3Var.w(4, i);
        }
        long j2 = this.e;
        if (j2 != 0) {
            hd3Var.x(5, j2);
        }
        if (!this.f.equals("")) {
            hd3Var.E(6, this.f);
        }
        long j3 = this.g;
        if (j3 != 0) {
            hd3Var.x(7, j3);
        }
        if (!this.h.equals("")) {
            hd3Var.E(8, this.h);
        }
        int i2 = this.i;
        if (i2 != 0) {
            hd3Var.w(9, i2);
        }
        if (this.j.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.j;
                if (i3 >= iArr.length) {
                    break;
                }
                hd3Var.w(11, iArr[i3]);
                i3++;
            }
        }
        if (!this.k.equals("")) {
            hd3Var.E(12, this.k);
        }
        mpc mpcVar = this.l;
        if (mpcVar != null) {
            hd3Var.y(13, mpcVar);
        }
        kpc kpcVar = this.m;
        if (kpcVar != null) {
            hd3Var.y(14, kpcVar);
        }
        Protos.Attaches.Attach attach = this.n;
        if (attach != null) {
            hd3Var.y(15, attach);
        }
    }
}
