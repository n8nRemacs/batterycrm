package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class hd6 extends fl9 {
    public final /* synthetic */ int a;
    public Serializable b;

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [id6[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Serializable, long[]] */
    public hd6(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = coi.a;
                this.cachedSize = -1;
                return;
            case 2:
                if (id6.i == null) {
                    synchronized (kp7.b) {
                        try {
                            if (id6.i == null) {
                                id6.i = new id6[0];
                            }
                        } finally {
                        }
                    }
                }
                this.b = id6.i;
                this.cachedSize = -1;
                return;
            case 3:
                this.b = "";
                this.cachedSize = -1;
                return;
            default:
                this.b = coi.b;
                this.cachedSize = -1;
                return;
        }
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.b;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = (long[]) this.b;
                    if (i >= jArr2.length) {
                        return jArr2.length + iK;
                    }
                    iK += hd3.k(jArr2[i]);
                    i++;
                }
                break;
            case 1:
                int i2 = 0;
                if (((int[]) this.b).length <= 0) {
                    return 0;
                }
                int iG = 0;
                while (true) {
                    int[] iArr = (int[]) this.b;
                    if (i2 >= iArr.length) {
                        return iArr.length + iG;
                    }
                    iG += hd3.g(iArr[i2]);
                    i2++;
                }
            case 2:
                id6[] id6VarArr = (id6[]) this.b;
                int i3 = 0;
                if (id6VarArr == null || id6VarArr.length <= 0) {
                    return 0;
                }
                int i4 = 0;
                while (true) {
                    id6[] id6VarArr2 = (id6[]) this.b;
                    if (i3 >= id6VarArr2.length) {
                        return i4;
                    }
                    id6 id6Var = id6VarArr2[i3];
                    if (id6Var != null) {
                        i4 = hd3.i(1, id6Var) + i4;
                    }
                    i3++;
                }
                break;
            default:
                if (((String) this.b).equals("")) {
                    return 0;
                }
                return hd3.l(1, (String) this.b);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r4v11, types: [int[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [id6[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.Serializable, java.lang.Object, long[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Serializable, java.lang.Object, long[]] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable, java.lang.Object] */
    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        switch (this.a) {
            case 0:
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    } else if (iS == 8) {
                        int iB = coi.b(gd3Var, 8);
                        long[] jArr = (long[]) this.b;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iB + length;
                        ?? r4 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, r4, 0, length);
                        }
                        while (length < i - 1) {
                            r4[length] = gd3Var.q();
                            gd3Var.s();
                            length++;
                        }
                        r4[length] = gd3Var.q();
                        this.b = r4;
                    } else if (iS == 10) {
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i2++;
                        }
                        gd3Var.t(iC);
                        long[] jArr2 = (long[]) this.b;
                        int length2 = jArr2 == null ? 0 : jArr2.length;
                        int i3 = i2 + length2;
                        ?? r5 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr2, 0, r5, 0, length2);
                        }
                        while (length2 < i3) {
                            r5[length2] = gd3Var.q();
                            length2++;
                        }
                        this.b = r5;
                        gd3Var.d(iE);
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
            case 1:
                while (true) {
                    int iS2 = gd3Var.s();
                    if (iS2 == 0) {
                        break;
                    } else if (iS2 == 8) {
                        int iB2 = coi.b(gd3Var, 8);
                        int[] iArr = (int[]) this.b;
                        int length3 = iArr.length;
                        int i4 = iB2 + length3;
                        ?? r42 = new int[i4];
                        if (length3 != 0) {
                            System.arraycopy(iArr, 0, r42, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            r42[length3] = gd3Var.p();
                            gd3Var.s();
                            length3++;
                        }
                        r42[length3] = gd3Var.p();
                        this.b = r42;
                    } else if (iS2 == 10) {
                        int iE2 = gd3Var.e(gd3Var.p());
                        int iC2 = gd3Var.c();
                        int i5 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.p();
                            i5++;
                        }
                        gd3Var.t(iC2);
                        int[] iArr2 = (int[]) this.b;
                        int length4 = iArr2.length;
                        int i6 = i5 + length4;
                        ?? r52 = new int[i6];
                        if (length4 != 0) {
                            System.arraycopy(iArr2, 0, r52, 0, length4);
                        }
                        while (length4 < i6) {
                            r52[length4] = gd3Var.p();
                            length4++;
                        }
                        this.b = r52;
                        gd3Var.d(iE2);
                    } else if (!gd3Var.u(iS2)) {
                        break;
                    }
                }
            case 2:
                while (true) {
                    int iS3 = gd3Var.s();
                    if (iS3 == 0) {
                        break;
                    } else if (iS3 == 10) {
                        int iB3 = coi.b(gd3Var, 10);
                        id6[] id6VarArr = (id6[]) this.b;
                        int length5 = id6VarArr == null ? 0 : id6VarArr.length;
                        int i7 = iB3 + length5;
                        ?? r43 = new id6[i7];
                        if (length5 != 0) {
                            System.arraycopy(id6VarArr, 0, r43, 0, length5);
                        }
                        while (length5 < i7 - 1) {
                            id6 id6Var = new id6();
                            r43[length5] = id6Var;
                            gd3Var.j(id6Var);
                            gd3Var.s();
                            length5++;
                        }
                        id6 id6Var2 = new id6();
                        r43[length5] = id6Var2;
                        gd3Var.j(id6Var2);
                        this.b = r43;
                    } else if (!gd3Var.u(iS3)) {
                        break;
                    }
                }
            default:
                while (true) {
                    int iS4 = gd3Var.s();
                    if (iS4 == 0) {
                        break;
                    } else if (iS4 == 10) {
                        this.b = gd3Var.r();
                    } else if (!gd3Var.u(iS4)) {
                        break;
                    }
                }
        }
        return this;
    }

    @Override // defpackage.fl9
    public final void writeTo(hd3 hd3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.b;
                if (jArr != null && jArr.length > 0) {
                    int i = 0;
                    while (true) {
                        long[] jArr2 = (long[]) this.b;
                        if (i >= jArr2.length) {
                            break;
                        } else {
                            hd3Var.x(1, jArr2[i]);
                            i++;
                        }
                    }
                }
                break;
            case 1:
                if (((int[]) this.b).length > 0) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = (int[]) this.b;
                        if (i2 >= iArr.length) {
                            break;
                        } else {
                            hd3Var.w(1, iArr[i2]);
                            i2++;
                        }
                    }
                }
                break;
            case 2:
                id6[] id6VarArr = (id6[]) this.b;
                if (id6VarArr != null && id6VarArr.length > 0) {
                    int i3 = 0;
                    while (true) {
                        id6[] id6VarArr2 = (id6[]) this.b;
                        if (i3 >= id6VarArr2.length) {
                            break;
                        } else {
                            id6 id6Var = id6VarArr2[i3];
                            if (id6Var != null) {
                                hd3Var.y(1, id6Var);
                            }
                            i3++;
                        }
                    }
                }
                break;
            default:
                if (!((String) this.b).equals("")) {
                    hd3Var.E(1, (String) this.b);
                    break;
                }
                break;
        }
    }
}
