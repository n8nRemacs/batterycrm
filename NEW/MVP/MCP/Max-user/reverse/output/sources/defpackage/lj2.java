package defpackage;

import one.me.sdk.tasks.chat.InvalidChatMarkException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class lj2 extends sm implements j1g, tsb {
    public final long X;
    public final boolean Y;
    public final boolean Z;
    public final long d;
    public final long o;
    public final boolean s0;
    public final String t0;

    public lj2(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = z;
        this.Z = z2;
        this.s0 = z3;
        this.t0 = lj2.class.getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r10 < (r0.m(ru.ok.tamtam.android.prefs.PmsKey.f137setunreadtimeout, 31536000) * 1000)) goto L40;
     */
    @Override // defpackage.tsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj2.c():int");
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        eh9 eh9Var;
        mj2 mj2Var = (mj2) l0gVar;
        pb2 pb2VarJ = l().J(this.d);
        if (mj2Var.o != null) {
            String str = this.t0;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.o;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "reaction read result " + mj2Var.o + "!", null);
                }
            }
        }
        if (this.s0 && mj2Var.o == null) {
            wqi.q(this.t0, "invalid response for isReadReaction=true: " + mj2Var, new Object[0]);
            tm tmVar = this.c;
            if (tmVar == null) {
                tmVar = null;
            }
            ((y3b) ((yi5) tmVar.w.getValue())).a(new InvalidChatMarkException("READ_REACTION but success is missed"));
        }
        long j = mj2Var.c;
        if (!this.s0 && j < 0) {
            wqi.q(this.t0, "response.mark is negative " + mj2Var, new Object[0]);
            tm tmVar2 = this.c;
            if (tmVar2 == null) {
                tmVar2 = null;
            }
            yi5 yi5Var = (yi5) tmVar2.w.getValue();
            long j2 = this.d;
            long j3 = this.o;
            StringBuilder sbL = az1.l(j2, "mark is negative chat_id=", ",orig=");
            sbL.append(j3);
            sbL.append(",mark=");
            sbL.append(j);
            ((y3b) yi5Var).a(new InvalidChatMarkException(sbL.toString()));
            j = this.o;
        }
        long j4 = j;
        if (j4 < this.o && !this.Y) {
            wqi.c(this.t0, "onSuccess, received read mark less than our read mark", new Object[0]);
        } else if (pb2VarJ != null) {
            l().x0(pb2VarJ.a, p().a.s(), j4, mj2Var.d, true);
        }
        if (pb2VarJ == null || mj2Var.d <= 0 || (eh9Var = pb2VarJ.c) == null || eh9Var.a.c != j4) {
            return;
        }
        tm tmVar3 = this.c;
        mh2.a((mh2) (tmVar3 != null ? tmVar3 : null).L.getValue(), pb2VarJ.a, pb2VarJ.b.a, pb2VarJ.c.a.c, 0L, rs4.REGULAR);
        j().f(pb2VarJ.b.a);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        k().c(new rj0(this.a, pzfVar));
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatMark chatMark = new Tasks.ChatMark();
        chatMark.requestId = this.a;
        chatMark.chatId = 0L;
        chatMark.chatServerId = this.d;
        chatMark.mark = this.o;
        chatMark.messageId = this.X;
        chatMark.setAsUnread = this.Y;
        chatMark.awaitChatInCache = this.Z;
        chatMark.isReadReaction = this.s0;
        return fl9.toByteArray(chatMark);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.v0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(xhb.b1, 5);
        fh2Var.t(this.d, ApiProtocol.PARAM_CHAT_ID);
        fh2Var.t(this.o, "mark");
        long j = this.X;
        if (j != -1) {
            fh2Var.t(j, "messageId");
        }
        fh2Var.x("type", this.Y ? "SET_AS_UNREAD" : this.s0 ? "READ_REACTION" : "READ_MESSAGE");
        return fh2Var;
    }
}
