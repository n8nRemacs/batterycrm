package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class p5a extends sm implements j1g, tsb {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long d;
    public final long o;
    public final long s0;

    public p5a(long j, long j2, long j3, long j4, long j5, boolean z, long j6) {
        super(j);
        this.X = j4;
        this.Y = j5;
        this.d = j3;
        this.o = j2;
        this.Z = z;
        this.s0 = j6;
    }

    public static wjb t(si9 si9Var) {
        yjb yjbVar = null;
        sz szVarD = !si9Var.v() ? po8.d(si9Var.x0) : null;
        if (si9Var.A0 != null) {
            int i = si9Var.y0;
            int i2 = 2;
            int i3 = 1;
            if (i == 1) {
                i3 = i2;
                yjbVar = new yjb(i3, si9Var.H0, si9Var.I0);
            } else {
                if (i == 2) {
                    i2 = 3;
                    i3 = i2;
                }
                yjbVar = new yjb(i3, si9Var.H0, si9Var.I0);
            }
        }
        ArrayList arrayListT = po8.t(si9Var.N0);
        vjb vjbVar = new vjb();
        vjbVar.a = si9Var.X;
        vjbVar.b = si9Var.Y;
        vjbVar.c = szVarD;
        vjbVar.d = yjbVar;
        vjbVar.e = si9Var.E0;
        vjbVar.g = arrayListT;
        vjbVar.h = si9Var.Q0;
        return vjbVar.a();
    }

    public static p5a v(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgSend msgSend = (Tasks.MsgSend) fl9.mergeFrom(new Tasks.MsgSend(), bArr);
            return new p5a(msgSend.requestId, msgSend.messageId, msgSend.chatId, msgSend.chatServerId, msgSend.userId, msgSend.notify, msgSend.lastKnownDraftTime);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
    
        if (r1.a() == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    @Override // defpackage.tsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5a.c():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        s5a s5aVar = (s5a) l0gVar;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "MsgSendApiTask", "onSuccess: chat=" + this.X + ", messageId=" + this.o, null);
            }
        }
        si9 si9VarM = this.c.d().m(this.o);
        fh9 fh9Var = s5aVar.d;
        if (fh9Var != null && si9VarM != null && fh9Var.A0 == null && si9VarM.u()) {
            wqi.p("MsgSendApiTask", "look's like delayed attrs is not supported!", new IllegalStateException("receive message without delayed attrs but send as delayed"));
            qi9 qi9VarD = this.c.d();
            long j = si9VarM.a;
            qi9VarD.getClass();
            wqi.c("qi9", "clearDelayedAttrs %d", Long.valueOf(j));
            qi9VarD.a.c.v(j, null, null);
            qi9VarD.e.c.remove(Long.valueOf(j));
            ((u5a) this.c.C.getValue()).a(this.d, s5aVar.c, s5aVar.d);
            this.c.b().c(new uu(3));
            return;
        }
        if (si9VarM != null && !si9VarM.u()) {
            y(s5aVar.c, this.o);
        }
        if (si9VarM != null) {
            jm9 jm9Var = si9VarM.t0;
            jm9 jm9Var2 = jm9.DELETED;
            if (jm9Var == jm9Var2 && si9VarM.b == 0) {
                if (si9VarM != null && si9VarM.t()) {
                    si9VarM.g().forEach(new sb3(3));
                }
                qi9 qi9VarD2 = this.c.d();
                fh9 fh9Var2 = s5aVar.d;
                long j2 = this.d;
                List list = xi9.b;
                qi9VarD2.a.c.t(j2, qi9VarD2.c.a.s(), fh9Var2, jm9Var2, false);
                rs4 rs4Var = si9VarM.u() ? rs4.DELAYED : rs4.REGULAR;
                if (s5aVar.d != null) {
                    this.c.a().w(this.d, this.X, Collections.singletonList(Long.valueOf(si9VarM.a)), Collections.singletonList(Long.valueOf(s5aVar.d.a)), null, false, rs4Var);
                }
                wqi.c("MsgSendApiTask", "onSuccess: sent api request for deletion locally deleted message", new Object[0]);
                return;
            }
        }
        if (si9VarM != null && si9VarM.D()) {
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null) {
                lg8 lg8Var2 = lg8.c;
                if (l6bVar2.b(lg8Var2)) {
                    l6bVar2.c(lg8Var2, "MsgSendApiTask", "onSuccessControlMessage, messageDb.event = " + si9VarM.k().a, null);
                }
            }
            if (si9VarM.k().a.ordinal() == 1) {
                ArrayList arrayList = si9VarM.k().c;
                List list2 = ((s44) s5aVar.d.Z.get(0)).X;
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(list2);
                if (!arrayList2.isEmpty()) {
                    this.c.b().c(new s9c(si9VarM.Z, arrayList2));
                }
            }
            ((u5a) this.c.C.getValue()).a(this.d, s5aVar.c, s5aVar.d);
            this.c.a().f(s5aVar.c);
        } else if (s5aVar.d != null) {
            ((u5a) this.c.C.getValue()).a(this.d, s5aVar.c, s5aVar.d);
        }
        if (si9VarM == null || !si9VarM.t()) {
            return;
        }
        si9VarM.g().forEach(new m4(12, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03b6  */
    @Override // defpackage.j1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.pzf r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5a.e(pzf):void");
    }

    @Override // defpackage.tsb
    public final void f() throws Throwable {
        si9 si9VarM = this.c.d().m(this.o);
        if (si9VarM != null) {
            this.c.d().t(si9VarM, xi9.Y);
            this.c.b().c(new itg(si9VarM.Z, si9VarM.a, false));
        }
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.MsgSend msgSend = new Tasks.MsgSend();
        msgSend.requestId = this.a;
        msgSend.messageId = this.o;
        msgSend.chatId = this.d;
        long j = this.X;
        if (j != 0) {
            msgSend.chatServerId = j;
        }
        long j2 = this.Y;
        if (j2 != 0) {
            msgSend.userId = j2;
        }
        msgSend.notify = this.Z;
        msgSend.lastKnownDraftTime = this.s0;
        return fl9.toByteArray(msgSend);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.c;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // defpackage.sm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n2 i() throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "createRequest"
            java.lang.String r2 = "MsgSendApiTask"
            defpackage.wqi.d(r2, r1)
            tm r1 = r0.c
            qi9 r1 = r1.d()
            long r3 = r0.o
            si9 r1 = r1.m(r3)
            r5 = 0
            if (r1 != 0) goto L21
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "messageDb is null"
            defpackage.wqi.i(r2, r3, r1)
            return r5
        L21:
            tm r6 = r0.c
            ve2 r6 = r6.c()
            long r7 = r1.Z
            pb2 r6 = r6.M(r7)
            long r7 = r0.X
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L47
            if (r6 == 0) goto L47
            boolean r11 = r6.Q()
            if (r11 != 0) goto L47
            rf2 r11 = r6.b
            long r11 = r11.a
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 == 0) goto L47
            r14 = r11
            goto L48
        L47:
            r14 = r7
        L48:
            if (r6 == 0) goto L59
            boolean r6 = r6.M()
            if (r6 == 0) goto L59
            boolean r6 = r0.Z
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r19 = r6
            goto L5b
        L59:
            r19 = r5
        L5b:
            wjb r1 = t(r1)
            sz r6 = r1.c
            if (r6 == 0) goto L69
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L9b
        L69:
            java.lang.String r6 = r1.b
            boolean r6 = defpackage.l8g.c(r6)
            if (r6 == 0) goto L9b
            yjb r6 = r1.d
            if (r6 == 0) goto L76
            goto L9b
        L76:
            long r6 = r0.d
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            java.lang.String r3 = "createRequest: empty outgoing message chatId = %s, messageId = %s"
            defpackage.wqi.c(r2, r3, r1)
            pzf r1 = new pzf
            java.lang.String r2 = "android.empty.message.and.attach"
            java.lang.String r3 = "MsgSend with empty text and attaches"
            r1.<init>(r2, r3, r5)
            r0.e(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3)
            throw r1
        L9b:
            zf8 r13 = new zf8
            long r2 = r0.Y
            long r4 = r0.s0
            r18 = r1
            r16 = r2
            r20 = r4
            r13.<init>(r14, r16, r18, r19, r20)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5a.i():n2");
    }

    public final void s(si9 si9Var) {
        this.c.d().t(si9Var, xi9.Y);
        this.c.c().s0(this.d, si9Var, false);
        this.c.e().d(this.a);
    }

    public final void u(si9 si9Var) {
        wqi.e("MsgSendApiTask", "onFailPhoneBindingRequired, message send to dialog, chatId = " + si9Var.Z, null);
        s(si9Var);
        this.c.b().c(new vtb(vtb.c));
        this.c.a().f(this.X);
        this.c.b().c(new n73(Collections.singletonList(Long.valueOf(this.d)), true));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0053, B:26:0x0067), top: B:31:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(defpackage.si9 r8) {
        /*
            r7 = this;
            jdc r8 = r8.x0
            java.lang.Object r8 = r8.b
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        Lb:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r8.next()
            w10 r1 = (defpackage.w10) r1
            s10 r2 = r1.a
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L42
            r3 = 3
            if (r2 == r3) goto L3b
            r3 = 5
            r6 = 0
            if (r2 == r3) goto L36
            r3 = 9
            if (r2 == r3) goto L2f
        L2d:
            r2 = r4
            goto L47
        L2f:
            f10 r1 = r1.j
            long r2 = r1.a
            java.lang.String r6 = r1.e
            goto L47
        L36:
            r10 r1 = r1.f
            long r2 = r1.a
            goto L47
        L3b:
            v10 r1 = r1.d
            long r2 = r1.a
            java.lang.String r6 = r1.n
            goto L47
        L42:
            k10 r1 = r1.b
            java.lang.String r6 = r1.Y
            goto L2d
        L47:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L51
            boolean r4 = defpackage.l8g.c(r6)
            if (r4 != 0) goto Lb
        L51:
            if (r1 == 0) goto L67
            tm r0 = r7.c     // Catch: java.lang.Throwable -> L65
            k18 r0 = r0.B     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L65
            gwg r0 = (defpackage.gwg) r0     // Catch: java.lang.Throwable -> L65
            hk3 r0 = r0.b(r2)     // Catch: java.lang.Throwable -> L65
            r0.a()     // Catch: java.lang.Throwable -> L65
            goto L80
        L65:
            r0 = move-exception
            goto L79
        L67:
            tm r0 = r7.c     // Catch: java.lang.Throwable -> L65
            k18 r0 = r0.B     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L65
            gwg r0 = (defpackage.gwg) r0     // Catch: java.lang.Throwable -> L65
            hk3 r0 = r0.e(r6)     // Catch: java.lang.Throwable -> L65
            r0.a()     // Catch: java.lang.Throwable -> L65
            goto L80
        L79:
            java.lang.String r1 = "MsgSendApiTask"
            java.lang.String r2 = "onAttachNotFound: failed"
            defpackage.wqi.e(r1, r2, r0)
        L80:
            r0 = 1
            goto Lb
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5a.w(si9):boolean");
    }

    public final void x(si9 si9Var, long j) {
        long j2 = si9Var.b;
        if (j2 != 0) {
            wqi.c("MsgSendApiTask", "onFail called for already sent message sid = " + j2, new Object[0]);
            return;
        }
        this.c.d().t(si9Var, xi9.d);
        if (j != 0) {
            dkb dkbVar = (dkb) this.c.A.getValue();
            dkbVar.getClass();
            if (j == 0) {
                return;
            }
            dkbVar.f(j, si9Var.G() ? s00.PHOTO : si9Var.A() ? s00.AUDIO : si9Var.s(s10.d) ? s00.VIDEO : si9Var.z() ? s00.VIDEO_MSG : si9Var.s(s10.t0) ? s00.FILE : si9Var.J() ? s00.STICKER : null, si9Var.a);
        }
    }

    public final void y(long j, long j2) {
        if (j != 0) {
            ((dkb) this.c.A.getValue()).getClass();
            dkb.b(j, j2);
        }
    }
}
