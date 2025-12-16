package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class vd1 implements yd1 {
    public final int A0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final zi1 a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final wd0 o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final boolean x0;
    public final txg y0;
    public final uxg z0;

    public vd1(zi1 zi1Var, String str, SpannableStringBuilder spannableStringBuilder, String str2, wd0 wd0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, txg txgVar, uxg uxgVar, int i) {
        this.a = zi1Var;
        this.b = str;
        this.c = spannableStringBuilder;
        this.d = str2;
        this.o = wd0Var;
        this.X = z;
        this.Y = z2;
        this.Z = z3;
        this.s0 = z4;
        this.t0 = z5;
        this.u0 = z6;
        this.v0 = z7;
        this.w0 = z8;
        this.x0 = z9;
        this.y0 = txgVar;
        this.z0 = uxgVar;
        this.A0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd1)) {
            return false;
        }
        vd1 vd1Var = (vd1) obj;
        return fni.a(this.a, vd1Var.a) && fni.a(this.b, vd1Var.b) && fni.a(this.c, vd1Var.c) && fni.a(this.d, vd1Var.d) && this.o.equals(vd1Var.o) && this.X == vd1Var.X && this.Y == vd1Var.Y && this.Z == vd1Var.Z && this.s0 == vd1Var.s0 && this.t0 == vd1Var.t0 && this.u0 == vd1Var.u0 && this.v0 == vd1Var.v0 && this.w0 == vd1Var.w0 && this.x0 == vd1Var.x0 && this.y0.equals(vd1Var.y0) && this.z0 == vd1Var.z0 && this.A0 == vd1Var.A0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a.a;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.a.a == t98Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.d;
        return az1.v(this.A0) + ((this.z0.hashCode() + ((this.y0.hashCode() + a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b((this.o.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.X), 31, this.Y), 31, this.Z), 31, this.s0), 31, this.t0), 31, this.u0), 31, this.v0), 31, this.w0), 31, this.x0)) * 31)) * 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        vd1 vd1Var = (vd1) t98Var;
        txg txgVar = vd1Var.y0;
        wd0 wd0Var = vd1Var.o;
        String str = vd1Var.d;
        o98 o98VarD = ve3.d();
        CharSequence charSequence = vd1Var.c;
        if (!fni.a(this.c, charSequence) || !fni.a(this.d, str)) {
            o98VarD.add(new qd1(str, charSequence));
        }
        boolean z = vd1Var.Z;
        if (this.Z != z) {
            o98VarD.add(new pd1(z));
        }
        boolean z2 = vd1Var.X;
        if (this.X != z2) {
            o98VarD.add(new sd1(z2));
        }
        if (!this.o.equals(wd0Var)) {
            o98VarD.add(new nd1(wd0Var));
        }
        uxg uxgVar = vd1Var.z0;
        if (this.z0 != uxgVar) {
            o98VarD.add(new od1(uxgVar));
        }
        if (!this.y0.equals(txgVar)) {
            o98VarD.add(new td1(txgVar));
        }
        boolean z3 = vd1Var.u0;
        if (this.u0 != z3) {
            o98VarD.add(new rd1(z3));
        }
        return ve3.a(o98VarD);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallOpponentState(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", userNameWithState=");
        sb.append((Object) this.c);
        sb.append(", userNameAccessibility=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.o);
        sb.append(", isTalking=");
        sb.append(this.X);
        sb.append(", isConnectedOnce=");
        az1.t(", isConnecting=", ", isVideoEnabled=", sb, this.Y, this.Z);
        az1.t(", isMicrophoneEnabled=", ", isRaiseHand=", sb, this.s0, this.t0);
        az1.t(", isMe=", ", isAdmin=", sb, this.u0, this.v0);
        az1.t(", isCreator=", ", videoState=", sb, this.w0, this.x0);
        sb.append(this.y0);
        sb.append(", buttonAction=");
        sb.append(this.z0);
        sb.append(", talkingState=");
        sb.append(ctd.m(this.A0));
        sb.append(")");
        return sb.toString();
    }
}
