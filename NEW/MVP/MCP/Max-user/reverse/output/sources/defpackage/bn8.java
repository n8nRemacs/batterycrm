package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class bn8 {
    public final wd0 a;
    public final CharSequence b;
    public final zi1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final txg h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final CharSequence l;
    public final String m;

    public bn8(wd0 wd0Var, CharSequence charSequence, zi1 zi1Var, boolean z, boolean z2, boolean z3, boolean z4, txg txgVar, boolean z5, boolean z6, int i, SpannableStringBuilder spannableStringBuilder, String str) {
        this.a = wd0Var;
        this.b = charSequence;
        this.c = zi1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = txgVar;
        this.i = z5;
        this.j = z6;
        this.k = i;
        this.l = spannableStringBuilder;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn8)) {
            return false;
        }
        bn8 bn8Var = (bn8) obj;
        return fni.a(this.a, bn8Var.a) && fni.a(this.b, bn8Var.b) && fni.a(this.c, bn8Var.c) && this.d == bn8Var.d && this.e == bn8Var.e && this.f == bn8Var.f && this.g == bn8Var.g && fni.a(this.h, bn8Var.h) && this.i == bn8Var.i && this.j == bn8Var.j && this.k == bn8Var.k && fni.a(this.l, bn8Var.l) && fni.a(this.m, bn8Var.m);
    }

    public final int hashCode() {
        wd0 wd0Var = this.a;
        int iHashCode = (wd0Var == null ? 0 : wd0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        zi1 zi1Var = this.c;
        int iB = a9h.b(a9h.b(a9h.b(a9h.b((iHashCode2 + (zi1Var == null ? 0 : zi1Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        txg txgVar = this.h;
        int iK = utb.k(this.k, a9h.b(a9h.b((iB + (txgVar == null ? 0 : txgVar.hashCode())) * 31, 31, this.i), 31, this.j), 31);
        CharSequence charSequence2 = this.l;
        int iHashCode3 = (iK + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.m;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainSpeakerState(avatar=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", isTalking=");
        sb.append(this.d);
        sb.append(", isConnectedOnce=");
        az1.t(", isUserConnectionOnce=", ", isConnecting=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", videoState=");
        sb.append(this.h);
        sb.append(", isMe=");
        az1.t(", isRaiseHand=", ", talkingState=", sb, this.i, this.j);
        sb.append(ctd.m(this.k));
        sb.append(", label=");
        sb.append((Object) this.l);
        sb.append(", userNameAccessibility=");
        return ho7.l(sb, this.m, ")");
    }
}
