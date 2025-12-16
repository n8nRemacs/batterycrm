package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.EglBase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ppc extends fl9 {
    public npc[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public opc[] f;
    public Protos.Attaches g;
    public long h;
    public Protos.MessageElements i;
    public boolean j;
    public long k;

    public ppc() {
        if (npc.o == null) {
            synchronized (kp7.b) {
                try {
                    if (npc.o == null) {
                        npc.o = new npc[0];
                    }
                } finally {
                }
            }
        }
        this.a = npc.o;
        this.b = "";
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        if (opc.e == null) {
            synchronized (kp7.b) {
                try {
                    if (opc.e == null) {
                        opc.e = new opc[0];
                    }
                } finally {
                }
            }
        }
        this.f = opc.e;
        this.g = null;
        this.h = 0L;
        this.i = null;
        this.j = false;
        this.k = 0L;
        this.cachedSize = -1;
    }

    @Override // defpackage.fl9
    public final int computeSerializedSize() {
        int iA;
        npc[] npcVarArr = this.a;
        int i = 0;
        if (npcVarArr != null && npcVarArr.length > 0) {
            int i2 = 0;
            iA = 0;
            while (true) {
                npc[] npcVarArr2 = this.a;
                if (i2 >= npcVarArr2.length) {
                    break;
                }
                npc npcVar = npcVarArr2[i2];
                if (npcVar != null) {
                    iA += hd3.i(1, npcVar);
                }
                i2++;
            }
        } else {
            iA = 0;
        }
        if (!this.b.equals("")) {
            iA += hd3.l(2, this.b);
        }
        long j = this.c;
        if (j != 0) {
            iA += hd3.h(3, j);
        }
        long j2 = this.d;
        if (j2 != 0) {
            iA += hd3.h(4, j2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            iA += hd3.h(5, j3);
        }
        opc[] opcVarArr = this.f;
        if (opcVarArr != null && opcVarArr.length > 0) {
            while (true) {
                opc[] opcVarArr2 = this.f;
                if (i >= opcVarArr2.length) {
                    break;
                }
                opc opcVar = opcVarArr2[i];
                if (opcVar != null) {
                    iA = hd3.i(6, opcVar) + iA;
                }
                i++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            iA += hd3.i(7, attaches);
        }
        long j4 = this.h;
        if (j4 != 0) {
            iA += hd3.h(8, j4);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            iA += hd3.i(9, messageElements);
        }
        if (this.j) {
            iA += hd3.a(10);
        }
        long j5 = this.k;
        return j5 != 0 ? hd3.h(11, j5) + iA : iA;
    }

    @Override // defpackage.fl9
    public final fl9 mergeFrom(gd3 gd3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = gd3Var.s();
            switch (iS) {
                case 0:
                    break;
                case 10:
                    int iB = coi.b(gd3Var, 10);
                    npc[] npcVarArr = this.a;
                    int length = npcVarArr == null ? 0 : npcVarArr.length;
                    int i = iB + length;
                    npc[] npcVarArr2 = new npc[i];
                    if (length != 0) {
                        System.arraycopy(npcVarArr, 0, npcVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        npc npcVar = new npc();
                        npcVarArr2[length] = npcVar;
                        gd3Var.j(npcVar);
                        gd3Var.s();
                        length++;
                    }
                    npc npcVar2 = new npc();
                    npcVarArr2[length] = npcVar2;
                    gd3Var.j(npcVar2);
                    this.a = npcVarArr2;
                    break;
                case 18:
                    this.b = gd3Var.r();
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    this.c = gd3Var.q();
                    break;
                case 32:
                    this.d = gd3Var.q();
                    break;
                case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                    this.e = gd3Var.q();
                    break;
                case 50:
                    int iB2 = coi.b(gd3Var, 50);
                    opc[] opcVarArr = this.f;
                    int length2 = opcVarArr == null ? 0 : opcVarArr.length;
                    int i2 = iB2 + length2;
                    opc[] opcVarArr2 = new opc[i2];
                    if (length2 != 0) {
                        System.arraycopy(opcVarArr, 0, opcVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        opc opcVar = new opc();
                        opcVarArr2[length2] = opcVar;
                        gd3Var.j(opcVar);
                        gd3Var.s();
                        length2++;
                    }
                    opc opcVar2 = new opc();
                    opcVarArr2[length2] = opcVar2;
                    gd3Var.j(opcVar2);
                    this.f = opcVarArr2;
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new Protos.Attaches();
                    }
                    gd3Var.j(this.g);
                    break;
                case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                    this.h = gd3Var.q();
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new Protos.MessageElements();
                    }
                    gd3Var.j(this.i);
                    break;
                case 80:
                    this.j = gd3Var.f();
                    break;
                case 88:
                    this.k = gd3Var.q();
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
        npc[] npcVarArr = this.a;
        int i = 0;
        if (npcVarArr != null && npcVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                npc[] npcVarArr2 = this.a;
                if (i2 >= npcVarArr2.length) {
                    break;
                }
                npc npcVar = npcVarArr2[i2];
                if (npcVar != null) {
                    hd3Var.y(1, npcVar);
                }
                i2++;
            }
        }
        if (!this.b.equals("")) {
            hd3Var.E(2, this.b);
        }
        long j = this.c;
        if (j != 0) {
            hd3Var.x(3, j);
        }
        long j2 = this.d;
        if (j2 != 0) {
            hd3Var.x(4, j2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            hd3Var.x(5, j3);
        }
        opc[] opcVarArr = this.f;
        if (opcVarArr != null && opcVarArr.length > 0) {
            while (true) {
                opc[] opcVarArr2 = this.f;
                if (i >= opcVarArr2.length) {
                    break;
                }
                opc opcVar = opcVarArr2[i];
                if (opcVar != null) {
                    hd3Var.y(6, opcVar);
                }
                i++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            hd3Var.y(7, attaches);
        }
        long j4 = this.h;
        if (j4 != 0) {
            hd3Var.x(8, j4);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            hd3Var.y(9, messageElements);
        }
        boolean z = this.j;
        if (z) {
            hd3Var.r(10, z);
        }
        long j5 = this.k;
        if (j5 != 0) {
            hd3Var.x(11, j5);
        }
    }
}
