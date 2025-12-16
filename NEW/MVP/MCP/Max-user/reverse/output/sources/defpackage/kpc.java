package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class kpc extends fl9 {
    public String a;
    public String b;
    public String c;
    public gpc d;
    public String e;
    public ipc f;

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int iL = !this.a.equals("") ? hd3.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            iL += hd3.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iL += hd3.l(3, this.c);
        }
        gpc gpcVar = this.d;
        if (gpcVar != null) {
            iL += hd3.i(4, gpcVar);
        }
        if (!this.e.equals("")) {
            iL += hd3.l(5, this.e);
        }
        ipc ipcVar = this.f;
        return ipcVar != null ? hd3.i(6, ipcVar) + iL : iL;
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
            } else if (iS == 26) {
                this.c = gd3Var.r();
            } else if (iS == 34) {
                if (this.d == null) {
                    gpc gpcVar = new gpc();
                    gpcVar.a = null;
                    gpcVar.b = 0.0f;
                    gpcVar.c = coi.c;
                    gpcVar.cachedSize = -1;
                    this.d = gpcVar;
                }
                gd3Var.j(this.d);
            } else if (iS == 42) {
                this.e = gd3Var.r();
            } else if (iS == 50) {
                if (this.f == null) {
                    ipc ipcVar = new ipc();
                    if (jpc.f == null) {
                        synchronized (kp7.b) {
                            try {
                                if (jpc.f == null) {
                                    jpc.f = new jpc[0];
                                }
                            } finally {
                            }
                        }
                    }
                    ipcVar.a = jpc.f;
                    if (fpc.c == null) {
                        synchronized (kp7.b) {
                            try {
                                if (fpc.c == null) {
                                    fpc.c = new fpc[0];
                                }
                            } finally {
                            }
                        }
                    }
                    ipcVar.b = fpc.c;
                    ipcVar.c = null;
                    ipcVar.d = false;
                    ipcVar.cachedSize = -1;
                    this.f = ipcVar;
                }
                gd3Var.j(this.f);
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
        if (!this.c.equals("")) {
            hd3Var.E(3, this.c);
        }
        gpc gpcVar = this.d;
        if (gpcVar != null) {
            hd3Var.y(4, gpcVar);
        }
        if (!this.e.equals("")) {
            hd3Var.E(5, this.e);
        }
        ipc ipcVar = this.f;
        if (ipcVar != null) {
            hd3Var.y(6, ipcVar);
        }
    }
}
