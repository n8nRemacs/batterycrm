package defpackage;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* loaded from: classes.dex */
public final class cnb implements bj1, gs1 {
    public static final aj1 c;
    public static final kxg d;
    public static final cnb e;
    public final bj1 a;
    public final gs1 b;

    static {
        zi1 zi1Var = zi1.c;
        ParticipantId participantIdC = knb.c(zi1Var);
        vch vchVar = new vch(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(participantIdC).build(), false);
        vch vchVar2 = new vch(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(participantIdC).setType(cdh.b).build(), false);
        h29 h29Var = h29.a;
        aj1 aj1Var = new aj1(zi1Var, h29Var, h29Var, h29Var, false, false, vchVar, vchVar2, false, false, false, false, false, 0L, true, false, false, false, false, false, hd5.a, 1);
        c = aj1Var;
        kxg kxgVar = new kxg(0L, "", "", true, null);
        d = kxgVar;
        e = new cnb(aj1Var, kxgVar);
    }

    public cnb(bj1 bj1Var, gs1 gs1Var) {
        this.a = bj1Var;
        this.b = gs1Var;
    }

    @Override // defpackage.bj1
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.bj1
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.gs1
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.gs1
    public final long d() {
        return this.b.d();
    }

    @Override // defpackage.bj1
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnb)) {
            return false;
        }
        cnb cnbVar = (cnb) obj;
        return fni.a(this.a, cnbVar.a) && fni.a(this.b, cnbVar.b);
    }

    @Override // defpackage.bj1
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.bj1
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.bj1
    public final zi1 getId() {
        return this.a.getId();
    }

    @Override // defpackage.gs1
    public final String getName() {
        return this.b.getName();
    }

    @Override // defpackage.bj1
    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bj1
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.bj1
    public final boolean isConnected() {
        return this.a.isConnected();
    }

    @Override // defpackage.bj1
    public final boolean isScreenCaptureEnabled() {
        return this.a.isScreenCaptureEnabled();
    }

    @Override // defpackage.gs1
    public final CharSequence j() {
        return this.b.j();
    }

    @Override // defpackage.bj1
    public final boolean k() {
        return this.a.k();
    }

    @Override // defpackage.bj1
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.bj1
    public final boolean m() {
        return this.a.m();
    }

    @Override // defpackage.bj1
    public final boolean n() {
        return this.a.n();
    }

    @Override // defpackage.bj1
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.bj1
    public final vch p() {
        return this.a.p();
    }

    @Override // defpackage.gs1
    public final String q() {
        return this.b.q();
    }

    @Override // defpackage.bj1
    public final int r() {
        return this.a.r();
    }

    @Override // defpackage.bj1
    public final vch s() {
        return this.a.s();
    }

    @Override // defpackage.bj1
    public final boolean t() {
        return this.a.t();
    }

    public final String toString() {
        return "ParticipantPair(member=" + this.a + ", user=" + this.b + ")";
    }
}
